#  Licensed to the Apache Software Foundation (ASF) under one or more
#  contributor license agreements.  See the NOTICE file distributed with
#  this work for additional information regarding copyright ownership.
#  The ASF licenses this file to You under the Apache License, Version 2.0
#  (the "License"); you may not use this file except in compliance with
#  the License.  You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

#
# Makefile for module 'hyzip'
#

!include <$(HY_HDK)\build\make\defines.mak>

LIBNAME=$(LIBPATH)hyzip.lib

BUILDFILES = \
	$(SHAREDSUB)hyzip.obj $(SHAREDSUB)zcpool.obj $(SHAREDSUB)zipalloc.obj \
	$(SHAREDSUB)zipcache.obj $(SHAREDSUB)zipsup.obj

HYCFLAGS = $(HYCFLAGS) /I$(SHAREDSUB) /I..\..\include\shared /I..\..\include\windows
MDLLIBFILES = $(MDLLIBFILES) $(LIBPATH)hypool$(HY_LINKLIB_SUFFIX)

!include <$(HY_HDK)\build\make\rules.mak>
