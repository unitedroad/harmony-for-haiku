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
 * @author Pavel Dolgov
 */


/* DO NOT EDIT THIS FILE - it is based on X11 headers and was autogenerated by nativebridge tool */

#include <jni.h>
#include "nativelib_common.h"

#ifndef _Included_org_apache_harmony_awt_nativebridge_linux_Xft
#define _Included_org_apache_harmony_awt_nativebridge_linux_Xft

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT void JNICALL Java_org_apache_harmony_awt_nativebridge_linux_Xft_init (JNIEnv *, jclass);


JNIEXPORT void  JNICALL Java_org_apache_harmony_awt_nativebridge_linux_Xft_XftDrawDestroy(JNIEnv *, jobject, jlong);

JNIEXPORT jint  JNICALL Java_org_apache_harmony_awt_nativebridge_linux_Xft_XftDrawSetClip(JNIEnv *, jobject, jlong, jlong);

JNIEXPORT jint  JNICALL Java_org_apache_harmony_awt_nativebridge_linux_Xft_XftDrawSetClipRectangles(JNIEnv *, jobject, jlong, jint, jint, jlong, jint);

#ifdef __cplusplus
}
#endif
#endif
