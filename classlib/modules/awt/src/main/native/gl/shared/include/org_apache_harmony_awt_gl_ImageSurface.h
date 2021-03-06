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
 * @author Alexey A. Petrenko
 */
/*
 * THE FILE HAS BEEN AUTOGENERATED BY INTEL IJH TOOL.
 * Please be aware that all changes made to this file manually
 * will be overwritten by the tool if it runs again.
 */

#include <jni.h>


/* Header for class org.apache.harmony.awt.gl.ImageSurface */

#ifndef _ORG_APACHE_HARMONY_AWT_GL_IMAGESURFACE_H
#define _ORG_APACHE_HARMONY_AWT_GL_IMAGESURFACE_H

#ifdef __cplusplus
extern "C" {
#endif


/* Static final fields */

#undef org_apache_harmony_awt_gl_ImageSurface_sRGB_CS
#define org_apache_harmony_awt_gl_ImageSurface_sRGB_CS 1L

#undef org_apache_harmony_awt_gl_ImageSurface_Linear_RGB_CS
#define org_apache_harmony_awt_gl_ImageSurface_Linear_RGB_CS 2L

#undef org_apache_harmony_awt_gl_ImageSurface_Linear_Gray_CS
#define org_apache_harmony_awt_gl_ImageSurface_Linear_Gray_CS 3L

#undef org_apache_harmony_awt_gl_ImageSurface_Custom_CS
#define org_apache_harmony_awt_gl_ImageSurface_Custom_CS 0L

#undef org_apache_harmony_awt_gl_ImageSurface_SPPSM
#define org_apache_harmony_awt_gl_ImageSurface_SPPSM 1L

#undef org_apache_harmony_awt_gl_ImageSurface_MPPSM
#define org_apache_harmony_awt_gl_ImageSurface_MPPSM 2L

#undef org_apache_harmony_awt_gl_ImageSurface_CSM
#define org_apache_harmony_awt_gl_ImageSurface_CSM 3L

#undef org_apache_harmony_awt_gl_ImageSurface_PISM
#define org_apache_harmony_awt_gl_ImageSurface_PISM 4L

#undef org_apache_harmony_awt_gl_ImageSurface_BSM
#define org_apache_harmony_awt_gl_ImageSurface_BSM 5L

#undef org_apache_harmony_awt_gl_ImageSurface_ALPHA_MASK
#define org_apache_harmony_awt_gl_ImageSurface_ALPHA_MASK -16777216L

#undef org_apache_harmony_awt_gl_ImageSurface_RED_MASK
#define org_apache_harmony_awt_gl_ImageSurface_RED_MASK 16711680L

#undef org_apache_harmony_awt_gl_ImageSurface_GREEN_MASK
#define org_apache_harmony_awt_gl_ImageSurface_GREEN_MASK 65280L

#undef org_apache_harmony_awt_gl_ImageSurface_BLUE_MASK
#define org_apache_harmony_awt_gl_ImageSurface_BLUE_MASK 255L

#undef org_apache_harmony_awt_gl_ImageSurface_RED_BGR_MASK
#define org_apache_harmony_awt_gl_ImageSurface_RED_BGR_MASK 255L

#undef org_apache_harmony_awt_gl_ImageSurface_GREEN_BGR_MASK
#define org_apache_harmony_awt_gl_ImageSurface_GREEN_BGR_MASK 65280L

#undef org_apache_harmony_awt_gl_ImageSurface_BLUE_BGR_MASK
#define org_apache_harmony_awt_gl_ImageSurface_BLUE_BGR_MASK 16711680L

#undef org_apache_harmony_awt_gl_ImageSurface_RED_565_MASK
#define org_apache_harmony_awt_gl_ImageSurface_RED_565_MASK 63488L

#undef org_apache_harmony_awt_gl_ImageSurface_GREEN_565_MASK
#define org_apache_harmony_awt_gl_ImageSurface_GREEN_565_MASK 2016L

#undef org_apache_harmony_awt_gl_ImageSurface_BLUE_565_MASK
#define org_apache_harmony_awt_gl_ImageSurface_BLUE_565_MASK 31L

#undef org_apache_harmony_awt_gl_ImageSurface_RED_555_MASK
#define org_apache_harmony_awt_gl_ImageSurface_RED_555_MASK 31744L

#undef org_apache_harmony_awt_gl_ImageSurface_GREEN_555_MASK
#define org_apache_harmony_awt_gl_ImageSurface_GREEN_555_MASK 992L

#undef org_apache_harmony_awt_gl_ImageSurface_BLUE_555_MASK
#define org_apache_harmony_awt_gl_ImageSurface_BLUE_555_MASK 31L


/* Native methods */

/*
 * Method: org.apache.harmony.awt.gl.ImageSurface.setImageSize(JII)V
 */
JNIEXPORT void JNICALL
Java_org_apache_harmony_awt_gl_ImageSurface_setImageSize(JNIEnv *, jobject, 
    jlong, jint, jint);

/*
 * Method: org.apache.harmony.awt.gl.ImageSurface.dispose(J)V
 */
JNIEXPORT void JNICALL
Java_org_apache_harmony_awt_gl_ImageSurface_dispose(JNIEnv *, jobject, 
    jlong);

///*
// * Method: org.apache.harmony.awt.gl.ImageSurface.createStructCCM(IIIIIIII[I[I[IIZ)J
// */
//JNIEXPORT jlong JNICALL
//Java_org_apache_harmony_awt_gl_ImageSurface_createStructCCM(JNIEnv *, jobject, 
//    jint, jint, jint, jint, jint, jint, jint, jint, jintArray, jintArray, jintArray, jint, jboolean);
//
///*
// * Method: org.apache.harmony.awt.gl.ImageSurface.createStructICM(IIIIIII[IZIII)J
// */
//JNIEXPORT jlong JNICALL
//Java_org_apache_harmony_awt_gl_ImageSurface_createStructICM(JNIEnv *, jobject, 
//    jint, jint, jint, jint, jint, jint, jint, jintArray, jboolean, jint, jint, jint);
//
///*
// * Method: org.apache.harmony.awt.gl.ImageSurface.createStructDCM(IIIIIIIIIIIIZ)J
// */
//JNIEXPORT jlong JNICALL
//Java_org_apache_harmony_awt_gl_ImageSurface_createStructDCM(JNIEnv *, jobject, 
//    jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jboolean);

JNIEXPORT jlong JNICALL Java_org_apache_harmony_awt_gl_ImageSurface_createSurfStruct
  (JNIEnv *, jobject, jint, jint, jint, jint, jint, jint, jint, jint, jint, jint, jintArray, 
  jintArray, jint, jintArray, jint, jboolean, jintArray, jintArray, jint, jboolean, jboolean, jint);

/*
 * Class:     org_apache_harmony_awt_gl_ImageSurface
 * Method:    updateCache
 * Signature: (JLjava/lang/Object;Z)J
 */
JNIEXPORT jlong JNICALL Java_org_apache_harmony_awt_gl_ImageSurface_updateCache
  (JNIEnv *, jobject, jlong, jobject, jboolean);

#ifdef __cplusplus
}
#endif

#endif /* _ORG_APACHE_HARMONY_AWT_GL_IMAGESURFACE_H */

