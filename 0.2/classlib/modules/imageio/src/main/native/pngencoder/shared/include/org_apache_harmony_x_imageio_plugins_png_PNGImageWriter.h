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
 * @author Viskov Nikolay
 */
/*
 * THE FILE HAS BEEN AUTOGENERATED BY INTEL IJH TOOL.
 * Please be aware that all changes made to this file manually
 * will be overwritten by the tool if it runs again.
 */

#include <jni.h>


/* Header for class org.apache.harmony.awt.gl.image.PngDecoder */

#ifndef _org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_H
#define _org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_H

#ifdef __cplusplus
extern "C" {
#endif


/* Static final fields */

#undef org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_GRAY
#define org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_GRAY 0L

#undef org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_RGB
#define org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_RGB 2L

#undef org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_PLTE
#define org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_PLTE 3L

#undef org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_GRAY_ALPHA
#define org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_GRAY_ALPHA 4L

#undef org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_RGBA
#define org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_PNG_COLOR_TYPE_RGBA 6L


/* Native methods */

/*
 * Method: org.apache.harmony.awt.gl.image.PngDecoder.decode([BILjava/lang/Object;IIII[IIZ)I
 */
JNIEXPORT jint JNICALL
Java_org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_encode(JNIEnv *, jobject, 
            jbyteArray, jint, jint, jobject, jint, jint, jint, jint, jintArray, jint, jboolean);

/*
 * Method: org.apache.harmony.awt.gl.image.PngDecoder.initIDs()V
 */
JNIEXPORT void JNICALL
Java_org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_initIDs(JNIEnv *, jclass, jclass);


#ifdef __cplusplus
}
#endif

#endif /* _org_apache_harmony_x_imageio_plugins_png_PNGImageWriter_H */

