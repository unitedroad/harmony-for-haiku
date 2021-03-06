# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
# 
#     http://www.apache.org/licenses/LICENSE-2.0
# 
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

!include <$(HY_HDK)\build\make\defines.mak>

JPEG_DIR=$(HY_JPEG_DIR)\# avoid continuation

LIBBASE=jpegencoder
DLLNAME=$(DLLPATH)$(LIBBASE).dll
LIBNAME=$(LIBPATH)$(LIBBASE).lib
HYLDFLAGS = $(HYLDFLAGS) -def:$(LIBBASE).def

# TOFIX: fix warning so we can use default HYCFLAGS
# That is:
# HYCFLAGS = $(HYCFLAGS) -I$(SHAREDSUB)\include -I$(JPEG_DIR)
HYCFLAGS = \
  -Ogityb1 -W3 -GF -Gs -MD -Zi -Zm400 \
  -D_DLL -D_MT -DWIN32 -D_WIN32_WINNT=0x0400 -D_WINSOCKAPI_ -DWINVER=0x0400 \
  $(VMDEBUG) /I$(HY_HDK)\include /I$(HY_HDK)\jdk\include /I. \
  -I$(SHAREDSUB)\include -I$(JPEG_DIR)
!IF "$(HY_ZIP_API)" == "true"
HYCFLAGS = $(HYCFLAGS) -DHY_ZIP_API
!ENDIF


BUILDFILES = $(SHAREDSUB)JpegEncoder.obj

VIRTFILES = $(LIBBASE).res
SYSLIBFILES = ws2_32.lib Iphlpapi.lib

MDLLIBFILES = $(MDLLIBFILES) $(JPEG_DIR)libjpeg$(HY_LINKLIB_SUFFIX)

DLLBASE=0x13300000

CLEANFILES=jconfig.h

!include <$(HY_HDK)\build\make\rules.mak>

$(SHAREDSUB)JpegEncoder.obj: jconfig.h

jconfig.h: $(JPEG_DIR)jconfig.vc
	copy $(JPEG_DIR)jconfig.vc $@
