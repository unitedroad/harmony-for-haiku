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
 * @author Oleg V. Khaschansky
 */

package org.apache.harmony.awt.nativebridge.linux;

import org.apache.harmony.awt.nativebridge.*;

/**
 * This file is based on GLX header and has been generated by the nativebridge tool.
 */
public class GLX extends BasicLibWrapper {
    static GLX instance;

    public static synchronized GLX getInstance() {
        if (instance == null) {
            instance = new GLX();
        }
        return instance;
    }

    private GLX() {
        org.apache.harmony.awt.Utils.loadLibrary("X11Wrapper");
        init();
    }

    private static native void init();

    public final int glXQueryExtension(long dpy, Int32Pointer error_base, Int32Pointer event_base) {
        long tmp_0 = error_base == null ? 0 : error_base.longLockPointer();
        long tmp_1 = event_base == null ? 0 : event_base.longLockPointer();
        int tmp_ret = glXQueryExtension(dpy, tmp_0, tmp_1);
        if (error_base != null) {
            error_base.unlock();
        }
        if (event_base != null) {
            event_base.unlock();
        }
        return tmp_ret;
    }
    public final native int glXQueryExtension(long dpy, long error_base, long event_base);

    public final int glXGetFBConfigAttrib(long dpy, long config, int attribute, Int32Pointer value) {
        long tmp_0 = value == null ? 0 : value.longLockPointer();
        int tmp_ret = glXGetFBConfigAttrib(dpy, config, attribute, tmp_0);
        if (value != null) {
            value.unlock();
        }
        return tmp_ret;
    }
    public final native int glXGetFBConfigAttrib(long dpy, long config, int attribute, long value);

    public final native long glXCreateNewContext(long dpy, long config, int render_type, long share_list, int direct);

    public final native int glXMakeCurrent(long dpy, long drawable, long ctx);

    public final native void glXDestroyContext(long dpy, long ctx);

    public final native void glXDestroyPbuffer(long dpy, long pbuf);

    public final PointerPointer glXChooseFBConfig(long dpy, int screen, Int32Pointer attrib_list, Int32Pointer nelements) {
        long tmp_0 = attrib_list == null ? 0 : attrib_list.longLockPointer();
        long tmp_1 = nelements == null ? 0 : nelements.longLockPointer();
        long tmp_ret = glXChooseFBConfig(dpy, screen, tmp_0, tmp_1);
        if (attrib_list != null) {
            attrib_list.unlock();
        }
        if (nelements != null) {
            nelements.unlock();
        }
        return nb.createPointerPointer(tmp_ret);
    }
    public final native long glXChooseFBConfig(long dpy, int screen, long attrib_list, long nelements);

    public final long glXCreatePbuffer(long dpy, long config, Int32Pointer attrib_list) {
        long tmp_0 = attrib_list == null ? 0 : attrib_list.longLockPointer();
        long tmp_ret = glXCreatePbuffer(dpy, config, tmp_0);
        if (attrib_list != null) {
            attrib_list.unlock();
        }
        return tmp_ret;
    }
    public final native long glXCreatePbuffer(long dpy, long config, long attrib_list);

    public final native void glXSwapBuffers(long dpy, long drawable);

    public final native int glXMakeContextCurrent(long display, long draw, long read, long ctx);

}

