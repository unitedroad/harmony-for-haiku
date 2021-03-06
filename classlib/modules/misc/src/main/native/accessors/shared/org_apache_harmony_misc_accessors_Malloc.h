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

/*
 * THE FILE HAS BEEN AUTOGENERATED BY IJH TOOL.
 * Please be aware that all changes made to this file manually
 * will be overwritten by the tool if it runs again.
 */

#include <jni.h>


/* Header for class org.apache.harmony.misc.accessors.Malloc */

#ifndef _ORG_APACHE_HARMONY_MISC_ACCESSORS_MALLOC_H
#define _ORG_APACHE_HARMONY_MISC_ACCESSORS_MALLOC_H

#ifdef __cplusplus
extern "C" {
#endif


/* Native methods */

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.getPointerSize()I
 */
JNIEXPORT jint JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_getPointerSize(JNIEnv *, jclass);

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.getCLongSize()I
 */
JNIEXPORT jint JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_getCLongSize(JNIEnv *, jclass);

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.free(J)V
 */
JNIEXPORT void JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_free(JNIEnv *, jclass, 
    jlong);

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.malloc(J)J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_malloc(JNIEnv *, jclass, 
    jlong);

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.memcmp(JJJ)I
 */
JNIEXPORT jint JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_memcmp(JNIEnv *, jclass, 
    jlong, jlong, jlong);

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.memcpy(JJJ)J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_memcpy(JNIEnv *, jclass, 
    jlong, jlong, jlong);

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.memmove(JJJ)J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_memmove(JNIEnv *, jclass, 
    jlong, jlong, jlong);

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.memset(JIJ)J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_memset(JNIEnv *, jclass, 
    jlong, jint, jlong);

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.realloc(JJ)J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_realloc(JNIEnv *, jclass, 
    jlong, jlong);

/*
 * Method: org.apache.harmony.misc.accessors.Malloc.strncpy(JJJ)J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_misc_accessors_Malloc_strncpy(JNIEnv *, jclass, 
    jlong, jlong, jlong);


#ifdef __cplusplus
}
#endif

#endif /* _ORG_APACHE_HARMONY_MISC_ACCESSORS_MALLOC_H */

