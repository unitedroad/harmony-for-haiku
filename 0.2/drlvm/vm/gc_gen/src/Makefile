ifdef VM_HOME
else
VM_HOME = ../../
endif

ifdef DRLVM_HOME
DRLVM_HOME = ./
else
DRLVM_HOME = ../../../
endif



include $(DRLVM_HOME)defines.mk

GC_GEN_DEFINES = -DBUILDING_GC 

CXXFLAGS += $(GC_GEN_DEFINES)

INCLUDES = -I$(VM_HOME)vmcore/include \
  -I$(VM_HOME)vmcore/src/util/linux/include \
  -I$(VM_HOME)include \
  -I$(VM_HOME)port/include \
  -I$(VM_HOME)gc_gen/src/common \
  -I$(VM_HOME)gc_gen/src/gen \
  -I$(VM_HOME)gc_gen/src/mark_compact \
  -I$(VM_HOME)gc_gen/src/mark_sweep \
  -I$(VM_HOME)gc_gen/src/move_compact \
  -I$(VM_HOME)gc_gen/src/semi_space \
  -I$(VM_HOME)gc_gen/src/los \
  -I$(VM_HOME)gc_gen/src/thread \
  -I$(VM_HOME)gc_gen/src/trace_forward \
  -I$(VM_HOME)gc_gen/src/utils \
  -I$(VM_HOME)gc_gen/src/jni \
  -I$(VM_HOME)gc_gen/src/verify \
  -I$(VM_HOME)gc_gen/src/finalizer_weakref \
  -I$(DRLVM_HOME)build/deploy/include \
  
  
OBJECTS = common/collection_scheduler.o common/compressed_ref.o \
  common/concurrent_collection_scheduler.o common/gc_block.o \
  common/gc_common.o common/gc_concurrent.o common/gc_for_barrier.o \
  common/gc_for_class.o common/gc_for_vm.o common/gc_metadata.o \
  common/gc_options.o common/hashcode.o common/interior_pointer.o \
  common/large_pages.o common/mark_scan_pool.o common/space_tuner.o \
  common/weak_roots.o \
  gen/gen.o gen/gen_adapt.o gen/gen_stats.o gen/gen_utils.o \
  mark_compact/fallback_mark_scan.o mark_compact/mspace.o \
  mark_compact/mspace_alloc.o mark_compact/mspace_collect_compact.o \
  mark_compact/mspace_extend_compact.o mark_compact/mspace_move_compact.o \
  mark_compact/mspace_slide_compact.o mark_compact/space_tune_mark_scan.o \
  mark_sweep/gc_ms.o mark_sweep/sspace_compact.o \
  mark_sweep/sspace_mark_concurrent.o mark_sweep/wspace.o \
  mark_sweep/wspace_alloc.o mark_sweep/wspace_chunk.o \
  mark_sweep/wspace_compact.o mark_sweep/wspace_concurrent_gc_stats.o \
  mark_sweep/wspace_fallback_mark.o mark_sweep/wspace_mark.o \
  mark_sweep/wspace_mark_mostly_concurrent.o \
  mark_sweep/wspace_mark_otf_concurrent.o mark_sweep/wspace_mark_sweep.o \
  mark_sweep/wspace_sweep.o mark_sweep/wspace_sweep_concurrent.o \
  mark_sweep/wspace_verify.o \
  move_compact/gc_mc.o \
  semi_space/sspace.o semi_space/sspace_alloc.o semi_space/sspace_forward.o \
  semi_space/sspace_gen_ss_pool.o semi_space/sspace_nongen_ss_pool.o \
  los/free_area_pool.o los/lspace.o los/lspace_alloc_collect.o \
  thread/collector.o thread/conclctor.o thread/gc_thread.o thread/mutator.o \
  thread/mutator_alloc.o \
  trace_forward/fspace.o trace_forward/fspace_alloc.o \
  trace_forward/fspace_gen_forward_pool.o \
  trace_forward/fspace_nongen_forward_pool.o trace_forward/sspace_temp.o \
  jni/java_natives.o jni/java_support.o \
  verify/verifier_common.o verify/verifier_metadata.o \
  verify/verifier_scanner.o verify/verify_blocked_space.o \
  verify/verify_concurrent_mark.o verify/verify_gc_effect.o \
  verify/verify_live_heap.o verify/verify_mutator_effect.o \
  finalizer_weakref/finalizer_weakref.o \
  finalizer_weakref/finalizer_weakref_metadata.o \
  
all: $(OBJECTS)
	$(SLD) -Wl,--version-script=$(SOURCE_DIR)../build/gc_gen.exp $(SLDFLAGS) -o libgc_gen_uncomp.so \
	$(OBJECTS) -L$(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default -lhythr  
	cp libgc_gen_uncomp.so  $(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default
	
clean: 
	rm -f libgc_gen_uncomp.so $(OBJECTS)












    
