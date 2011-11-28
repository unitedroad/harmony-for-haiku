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
 * THE FILE HAS BEEN AUTOGENERATED BY THE IJH TOOL.
 * Please be aware that all changes made to this file manually
 * will be overwritten by the tool if it runs again.
 */

#include <jni.h>


/* Header for class org.apache.harmony.lang.management.MemoryPoolMXBeanImpl */

#ifndef _ORG_APACHE_HARMONY_LANG_MANAGEMENT_MEMORYPOOLMXBEANIMPL_H
#define _ORG_APACHE_HARMONY_LANG_MANAGEMENT_MEMORYPOOLMXBEANIMPL_H

#ifdef __cplusplus
extern "C" {
#endif


/* Static final fields */

#undef org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_TM_ERROR_NONE
#define org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_TM_ERROR_NONE 0L

#undef org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_TM_ERROR_INTERRUPT
#define org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_TM_ERROR_INTERRUPT 52L

#undef org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_TM_ERROR_ILLEGAL_STATE
#define org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_TM_ERROR_ILLEGAL_STATE 118L


/* Native methods */

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.getCollectionUsageImpl()Ljava/lang/management/MemoryUsage;
 */
JNIEXPORT jobject JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_getCollectionUsageImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.getCollectionUsageThresholdImpl()J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_getCollectionUsageThresholdImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.getCollectionUsageThresholdCountImpl()J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_getCollectionUsageThresholdCountImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.getPeakUsageImpl()Ljava/lang/management/MemoryUsage;
 */
JNIEXPORT jobject JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_getPeakUsageImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.getUsageImpl()Ljava/lang/management/MemoryUsage;
 */
JNIEXPORT jobject JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_getUsageImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.getUsageThresholdImpl()J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_getUsageThresholdImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.getUsageThresholdCountImpl()J
 */
JNIEXPORT jlong JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_getUsageThresholdCountImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.isCollectionUsageThresholdExceededImpl()Z
 */
JNIEXPORT jboolean JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_isCollectionUsageThresholdExceededImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.isCollectionUsageThresholdSupportedImpl()Z
 */
JNIEXPORT jboolean JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_isCollectionUsageThresholdSupportedImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.isUsageThresholdExceededImpl()Z
 */
JNIEXPORT jboolean JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_isUsageThresholdExceededImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.isUsageThresholdSupportedImpl()Z
 */
JNIEXPORT jboolean JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_isUsageThresholdSupportedImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.isValidImpl()Z
 */
JNIEXPORT jboolean JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_isValidImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.resetPeakUsageImpl()V
 */
JNIEXPORT void JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_resetPeakUsageImpl(JNIEnv *, jobject);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.setCollectionUsageThresholdImpl(J)V
 */
JNIEXPORT void JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_setCollectionUsageThresholdImpl(JNIEnv *, jobject,
    jlong);

/*
 * Method: org.apache.harmony.lang.management.MemoryPoolMXBeanImpl.setUsageThresholdImpl(J)V
 */
JNIEXPORT void JNICALL
Java_org_apache_harmony_lang_management_MemoryPoolMXBeanImpl_setUsageThresholdImpl(JNIEnv *, jobject,
    jlong);


#ifdef __cplusplus
}
#endif

#endif /* _ORG_APACHE_HARMONY_LANG_MANAGEMENT_MEMORYPOOLMXBEANIMPL_H */

