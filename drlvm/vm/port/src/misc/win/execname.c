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

#include "port_malloc.h"
#include "port_sysinfo.h"

#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

APR_DECLARE(apr_status_t) port_executable_name(char** self_name){

    char buf[_MAX_PATH*2]; /*XXX result in TCHARs */
    int len = GetModuleFileName(0, buf, _MAX_PATH);
    if (0 == len) {
        return apr_get_os_error();
    }

    *self_name = STD_MALLOC(strlen(buf) + 1);
    if (*self_name)
        strcpy(*self_name, buf);

    return APR_SUCCESS;
}
