/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
 * @author Xiao-Feng Li, 2006/10/25
 */
#ifndef _GC_METADATA_H_
#define _GC_METADATA_H_

#include "gc_common.h"
#include "../utils/vector_block.h"
#include "../utils/sync_pool.h"
#include "../thread/collector.h"
#include "../thread/mutator.h"

#define GC_METADATA_SEGMENT_NUM 256

typedef struct GC_Metadata{
  void *segments[GC_METADATA_SEGMENT_NUM]; /* address array of malloced segments for free pool */
  unsigned int num_alloc_segs; /* allocated segment number */
  SpinLock  alloc_lock;
    
  Pool* free_task_pool; /* list of free buffers for mark tasks */
  Pool* mark_task_pool; /* list of mark tasks */
  
  /* FIXME:: the mutator remset pool can be merged with the rootset pool*/
  Pool* free_set_pool; /* list of free buffers for rootsets remsets */
  Pool* gc_rootset_pool; /* list of root sets for enumeration */
  Pool* gc_uncompressed_rootset_pool; /* list of uncompressed root sets for enumeration */
  Pool* mutator_remset_pool; /* list of remsets generated by app during execution */
  Pool* collector_remset_pool; /* list of remsets generated by gc during collection */
  Pool* collector_repset_pool; /* list of repointed ref slot sets */
  Pool* weakroot_pool; /* list of short weak roots */
#ifdef USE_32BITS_HASHCODE
  Pool* collector_hashcode_pool;
#endif

  Pool* gc_dirty_set_pool;

}GC_Metadata;

extern GC_Metadata gc_metadata;

void gc_metadata_initialize(GC* gc);
void gc_metadata_destruct(GC* gc);
void gc_metadata_verify(GC* gc, Boolean is_before_gc);

void gc_set_rootset(GC* gc);
void gc_reset_rootset(GC* gc);
void gc_clear_rootset(GC* gc);
void gc_fix_rootset(Collector* collector, Boolean double_fix);

void gc_clear_remset(GC* gc);

void gc_prepare_dirty_set(GC* gc);
void gc_copy_local_dirty_set_to_global(GC *gc);
void gc_reset_dirty_set(GC* gc);
void gc_clear_dirty_set(GC* gc);

void gc_identify_dead_weak_roots(GC *gc);
void gc_update_weak_roots(GC *gc, Boolean double_fix);
void gc_reset_collectors_rem_set(GC *gc); 

inline void  gc_task_pool_clear(Pool* task_pool)
{
  Vector_Block* task = pool_get_entry(task_pool);
  while(task){
    vector_stack_clear(task);  
    pool_put_entry(gc_metadata.free_task_pool, task);
    task = pool_get_entry(task_pool);
  } 
  return;
}

inline void  gc_set_pool_clear(Pool* set_pool)
{
  Vector_Block* set = pool_get_entry(set_pool);
  while(set){
    vector_block_clear(set);
    pool_put_entry(gc_metadata.free_set_pool, set);
    set = pool_get_entry(set_pool);
  } 
  return;  
}

Vector_Block* gc_metadata_extend(Pool* pool);

inline Vector_Block *free_set_pool_get_entry(GC_Metadata *metadata)
{
  Vector_Block *block = pool_get_entry(metadata->free_set_pool);

  while(!block)
      block = gc_metadata_extend(metadata->free_set_pool);
  
  assert(vector_block_is_empty(block));
  return block;
}

void free_set_pool_put_entry(Vector_Block* block, GC_Metadata *metadata);

inline Vector_Block *free_task_pool_get_entry(GC_Metadata *metadata)
{
  Vector_Block *block = pool_get_entry(metadata->free_task_pool);

  while(!block)
      block = gc_metadata_extend(metadata->free_task_pool);
   
  assert(vector_block_is_empty(block));
  return block;
}

inline void mutator_remset_add_entry(Mutator* mutator, REF* p_ref)
{
  assert( p_ref >= gc_heap_base_address() && p_ref < gc_heap_ceiling_address()); 
  
  Vector_Block* root_set = mutator->rem_set;  
  vector_block_add_entry(root_set, (POINTER_SIZE_INT)p_ref);
  
  if( !vector_block_is_full(root_set)) return;
    
  pool_put_entry(gc_metadata.mutator_remset_pool, root_set);
  mutator->rem_set = free_set_pool_get_entry(&gc_metadata);  
  assert(mutator->rem_set);
}

inline void mutator_dirtyset_add_entry(Mutator* mutator, Partial_Reveal_Object* p_obj)
{
  Vector_Block* dirty_set = mutator->dirty_set;    
  mutator->dirty_obj_slot_num++;
  vector_block_add_entry(dirty_set, (POINTER_SIZE_INT)p_obj);

  if( !vector_block_is_full(dirty_set) ) {
       return;
  }
  
  lock(mutator->dirty_set_lock);
  if( vector_block_is_empty(dirty_set) ) {
  	vector_block_clear(dirty_set);
	unlock(mutator->dirty_set_lock);
       return;
  }
  pool_put_entry(gc_metadata.gc_dirty_set_pool, dirty_set);
  mutator->dirty_set = free_set_pool_get_entry(&gc_metadata);
  unlock(mutator->dirty_set_lock);
}

inline void collector_repset_add_entry(Collector* collector, Partial_Reveal_Object** p_ref)
{
//  assert( p_ref >= gc_heap_base_address() && p_ref < gc_heap_ceiling_address()); 

  Vector_Block* root_set = collector->rep_set;  
  vector_block_add_entry(root_set, (POINTER_SIZE_INT)p_ref);
  
  if( !vector_block_is_full(root_set)) return;
    
  pool_put_entry(gc_metadata.collector_repset_pool, root_set);
  collector->rep_set = free_set_pool_get_entry(&gc_metadata);  
  assert(collector->rep_set);
}

inline void collector_remset_add_entry(Collector* collector, Partial_Reveal_Object** p_ref)
{
  //assert( p_ref >= gc_heap_base_address() && p_ref < gc_heap_ceiling_address()); 

  Vector_Block* root_set = collector->rem_set;  
  vector_block_add_entry(root_set, (POINTER_SIZE_INT)p_ref);
  
  if( !vector_block_is_full(root_set)) return;
    
  pool_put_entry(gc_metadata.collector_remset_pool, root_set);
  collector->rem_set = free_set_pool_get_entry(&gc_metadata);  
  assert(collector->rem_set);
}

#ifdef USE_32BITS_HASHCODE  
inline void collector_hashcodeset_add_entry(Collector* collector, Partial_Reveal_Object** p_ref)
{
  Vector_Block* hashcode_set = collector->hashcode_set;
  vector_block_add_entry(hashcode_set, (POINTER_SIZE_INT) p_ref);

  if(!vector_block_is_full(hashcode_set)) return;

  pool_put_entry(gc_metadata.collector_hashcode_pool, hashcode_set);
  collector->hashcode_set = free_set_pool_get_entry(&gc_metadata);
  assert(collector->hashcode_set);
}
#endif

FORCE_INLINE void collector_tracestack_push(Collector* collector, void* p_task)
{
  /* we don't have assert as others because p_task is a p_obj for marking,
     or a p_ref for trace forwarding. The latter can be a root set pointer */
  Vector_Block* trace_task = (Vector_Block*)collector->trace_stack;  
  vector_stack_push(trace_task, (POINTER_SIZE_INT)p_task);
  
  if( !vector_stack_is_full(trace_task)) return;
    
  pool_put_entry(gc_metadata.mark_task_pool, trace_task);
  collector->trace_stack = free_task_pool_get_entry(&gc_metadata);  
  assert(collector->trace_stack);
}

inline void gc_weak_rootset_add_entry(GC* gc, Partial_Reveal_Object** p_ref, Boolean is_short_weak)
{
  //assert(is_short_weak == FALSE); //Currently no need for short_weak_roots
  assert( p_ref < gc_heap_base_address() || p_ref >= gc_heap_ceiling_address()); 
  
  Vector_Block* weakroot_set = gc->weakroot_set;
  vector_block_add_entry(weakroot_set, (POINTER_SIZE_INT)p_ref);
  
  if( !vector_block_is_full(weakroot_set)) return;

  pool_put_entry(gc_metadata.weakroot_pool, weakroot_set);
  gc->weakroot_set = free_set_pool_get_entry(&gc_metadata);  
  assert(gc->weakroot_set);
}

extern unsigned int rootset_type;

enum ROOTSET_TYPE{
  ROOTSET_IS_OBJ = 0x01,
  ROOTSET_IS_REF = 0x02
};


inline void gc_set_rootset_type(unsigned int rs_type)
{
  rootset_type = rs_type;
}

#ifdef COMPRESS_REFERENCE

inline void gc_rootset_add_entry(GC* gc, Partial_Reveal_Object** p_ref)
{
  assert( p_ref < gc_heap_base(gc) || p_ref >= gc_heap_ceiling(gc));
  
  GC_Metadata *metadata = gc->metadata;
  Vector_Block *uncompressed_root_set = gc->uncompressed_root_set;
  assert(uncompressed_root_set);
  
  Partial_Reveal_Object *p_obj = *p_ref;
  REF ref = obj_ptr_to_ref(p_obj);
  
  /* construct an Uncompressed_Root */
  vector_block_add_entry(uncompressed_root_set, (POINTER_SIZE_INT)p_ref);
  assert(!vector_block_is_full(uncompressed_root_set));
  if(rootset_type == ROOTSET_IS_REF)
    vector_block_add_entry(uncompressed_root_set, (POINTER_SIZE_INT)ref);
  else if(rootset_type == ROOTSET_IS_OBJ)
    vector_block_add_entry(uncompressed_root_set, (POINTER_SIZE_INT)p_obj);
  
  if(!vector_block_is_full(uncompressed_root_set)) return;
  
  pool_put_entry(metadata->gc_uncompressed_rootset_pool, uncompressed_root_set);
  gc->uncompressed_root_set = free_set_pool_get_entry(metadata);
  assert(gc->uncompressed_root_set);
}

#else /* COMPRESS_REFERENCE */
inline void gc_rootset_add_entry(GC* gc, Partial_Reveal_Object** p_ref)
{
  assert( p_ref < gc_heap_base_address() || p_ref >= gc_heap_ceiling_address()); 

  Partial_Reveal_Object *p_obj = *p_ref;
  
  Vector_Block* root_set = gc->root_set;

  if(rootset_type == ROOTSET_IS_REF)
    vector_block_add_entry(root_set, (POINTER_SIZE_INT)p_ref);
  else if(rootset_type == ROOTSET_IS_OBJ)
    vector_block_add_entry(root_set, (POINTER_SIZE_INT)p_obj);
  
  if( !vector_block_is_full(root_set)) return;
    
  pool_put_entry(gc_metadata.gc_rootset_pool, root_set);
  gc->root_set = free_set_pool_get_entry(&gc_metadata);  
  assert(gc->root_set);
}
#endif

#endif /* #ifndef _GC_METADATA_H_ */
