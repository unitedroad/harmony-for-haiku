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

package org.apache.harmony.awt.gl.opengl;


import org.apache.harmony.awt.nativebridge.*;

/**
 * This file is based on OGL header and has been generated by the nativebridge tool.
 *
 * @author Oleg V. Khaschansky
 *
 */
public class GL extends BasicLibWrapper {
    static GL instance;

    public static synchronized GL getInstance() {
        if (instance == null) {
            instance = new GL();
        }
        return instance;
    }

    private GL() {
        org.apache.harmony.awt.Utils.loadLibrary("oglwrapper"); //$NON-NLS-1$
        init();
    }

    private static native void init();

    public final void glVertexPointer(int size, int type, int stride, VoidPointer pointer) {
        long tmp_0 = pointer == null ? 0 : pointer.longLockPointer();
        glVertexPointer(size, type, stride, tmp_0);
        if (pointer != null) {
            pointer.unlock();
        }
    }
    public final native void glVertexPointer(int size, int type, int stride, long pointer);

    public final native void glPixelStoref(int pname, float param);

    public final native void glRectd(double x1, double y1, double x2, double y2);

    public final native void glTranslated(double x, double y, double z);

    public final native void glLineStipple(int factor, short pattern);

    public final native void glBlendFunc(int sfactor, int dfactor);

    public final void glColor4ubv(String v) {
        Int8Pointer _v = null == v? null :  nb.createInt8Pointer(v, false);
        long tmp_0 = _v == null ? 0 : _v.longLockPointer();
        glColor4ubv(tmp_0);
        if (_v != null) {
            _v.unlock();
            _v.free();
        }
    }
    public final void glColor4ubv(Int8Pointer v) {
        long tmp_0 = v == null ? 0 : v.longLockPointer();
        glColor4ubv(tmp_0);
        if (v != null) {
            v.unlock();
        }
    }
    public final native void glColor4ubv(long v);

    public final void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, VoidPointer pixels) {
        long tmp_0 = pixels == null ? 0 : pixels.longLockPointer();
        glTexImage1D(target, level, internalformat, width, border, format, type, tmp_0);
        if (pixels != null) {
            pixels.unlock();
        }
    }
    public final native void glTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels);

    public final native void gluOrtho2D(double left, double right, double bottom, double top);

    public final native void glDrawArrays(int mode, int first, int count);

    public final native void glPixelStorei(int pname, int param);

    public final native void glTexParameteri(int target, int pname, int param);

    public final native void glRotated(double angle, double x, double y, double z);

    public final void glGetIntegerv(int pname, Int32Pointer params) {
        long tmp_0 = params == null ? 0 : params.longLockPointer();
        glGetIntegerv(pname, tmp_0);
        if (params != null) {
            params.unlock();
        }
    }
    public final native void glGetIntegerv(int pname, long params);

    public final void glTexGendv(int coord, int pname, DoublePointer params) {
        long tmp_0 = params == null ? 0 : params.longLockPointer();
        glTexGendv(coord, pname, tmp_0);
        if (params != null) {
            params.unlock();
        }
    }
    public final native void glTexGendv(int coord, int pname, long params);

    public final native void glTexCoord2d(double s, double t);

    public final native void glPixelTransferf(int pname, float param);

    public final native void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height);

    public final native void glEnd();

    public final native void glColorMask(byte red, byte green, byte blue, byte alpha);

    public final native void glFlush();

    public final native void glMatrixMode(int mode);

    public final native void glTexEnvf(int target, int pname, float param);

    public final native void glPixelZoom(float xfactor, float yfactor);

    public final native void glScissor(int x, int y, int width, int height);

    public final native int glGetError();

    public final void glDrawPixels(int width, int height, int format, int type, VoidPointer pixels) {
        long tmp_0 = pixels == null ? 0 : pixels.longLockPointer();
        glDrawPixels(width, height, format, type, tmp_0);
        if (pixels != null) {
            pixels.unlock();
        }
    }
    public final native void glDrawPixels(int width, int height, int format, int type, long pixels);

    public final native void glCopyPixels(int x, int y, int width, int height, int type);

    public final native void glBlendFuncSeparate(int param_0, int param_1, int param_2, int param_3);

    public final native void glEnableClientState(int array);

    public final void glMultMatrixd(DoublePointer m) {
        long tmp_0 = m == null ? 0 : m.longLockPointer();
        glMultMatrixd(tmp_0);
        if (m != null) {
            m.unlock();
        }
    }
    public final native void glMultMatrixd(long m);

    public final native void glClear(int mask);

    public final native void glPopMatrix();

    public final void glColorPointer(int size, int type, int stride, VoidPointer pointer) {
        long tmp_0 = pointer == null ? 0 : pointer.longLockPointer();
        glColorPointer(size, type, stride, tmp_0);
        if (pointer != null) {
            pointer.unlock();
        }
    }
    public final native void glColorPointer(int size, int type, int stride, long pointer);

    public final native void glScaled(double x, double y, double z);

    public final native void glDisable(int cap);

    public final native void glRasterPos2i(int x, int y);

    public final native void glEnable(int cap);

    public final void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, String bitmap) {
        Int8Pointer _bitmap = null == bitmap? null :  nb.createInt8Pointer(bitmap, false);
        long tmp_0 = _bitmap == null ? 0 : _bitmap.longLockPointer();
        glBitmap(width, height, xorig, yorig, xmove, ymove, tmp_0);
        if (_bitmap != null) {
            _bitmap.unlock();
            _bitmap.free();
        }
    }
    public final void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, Int8Pointer bitmap) {
        long tmp_0 = bitmap == null ? 0 : bitmap.longLockPointer();
        glBitmap(width, height, xorig, yorig, xmove, ymove, tmp_0);
        if (bitmap != null) {
            bitmap.unlock();
        }
    }
    public final native void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, long bitmap);

    public final void glColorTable(int param_0, int param_1, int param_2, int param_3, int param_4, VoidPointer param_5) {
        long tmp_0 = param_5 == null ? 0 : param_5.longLockPointer();
        glColorTable(param_0, param_1, param_2, param_3, param_4, tmp_0);
        if (param_5 != null) {
            param_5.unlock();
        }
    }
    public final native void glColorTable(int param_0, int param_1, int param_2, int param_3, int param_4, long param_5);

    public final void glGenTextures(int n, Int32Pointer textures) {
        long tmp_0 = textures == null ? 0 : textures.longLockPointer();
        glGenTextures(n, tmp_0);
        if (textures != null) {
            textures.unlock();
        }
    }
    public final native void glGenTextures(int n, long textures);

    public final native void glFinish();

    public final void glDeleteTextures(int n, Int32Pointer textures) {
        long tmp_0 = textures == null ? 0 : textures.longLockPointer();
        glDeleteTextures(n, tmp_0);
        if (textures != null) {
            textures.unlock();
        }
    }
    public final native void glDeleteTextures(int n, long textures);

    public final native void glDisableClientState(int array);

    public final native void glBegin(int mode);

    public final native void glVertex2d(double x, double y);

    public final native void glLineWidth(float width);

    public final void glLoadMatrixd(DoublePointer m) {
        long tmp_0 = m == null ? 0 : m.longLockPointer();
        glLoadMatrixd(tmp_0);
        if (m != null) {
            m.unlock();
        }
    }
    public final native void glLoadMatrixd(long m);

    public final void glReadPixels(int x, int y, int width, int height, int format, int type, VoidPointer pixels) {
        long tmp_0 = pixels == null ? 0 : pixels.longLockPointer();
        glReadPixels(x, y, width, height, format, type, tmp_0);
        if (pixels != null) {
            pixels.unlock();
        }
    }
    public final native void glReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

    public final native void glBindTexture(int target, int texture);

    public final native void glPushMatrix();

    public final native void glTexGeni(int coord, int pname, int param);

    public final native void glStencilFunc(int func, int ref, int mask);

    public final void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, VoidPointer pixels) {
        long tmp_0 = pixels == null ? 0 : pixels.longLockPointer();
        glTexImage2D(target, level, internalformat, width, height, border, format, type, tmp_0);
        if (pixels != null) {
            pixels.unlock();
        }
    }
    public final native void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    public final void glPixelMapusv(int map, int mapsize, Int16Pointer values) {
        long tmp_0 = values == null ? 0 : values.longLockPointer();
        glPixelMapusv(map, mapsize, tmp_0);
        if (values != null) {
            values.unlock();
        }
    }
    public final native void glPixelMapusv(int map, int mapsize, long values);

    public final native void glViewport(int x, int y, int width, int height);

    public final native void glLoadIdentity();

    public final void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, VoidPointer pixels) {
        long tmp_0 = pixels == null ? 0 : pixels.longLockPointer();
        glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, tmp_0);
        if (pixels != null) {
            pixels.unlock();
        }
    }
    public final native void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    public final native void glDrawBuffer(int mode);

    public final native void glReadBuffer(int mode);

    public final native void glStencilOp(int fail, int zfail, int zpass);



    public final native int glGenLists(int range);

    public final native byte glIsList(int list);

    public final native void glDeleteLists(int list, int range);

    public final native void glNewList(int list, int mode);

    public final native void glCallList(int list);

    public final native void glEndList();

}



