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
 * DESCRIPTION:
 * Replace the system header file "time.h" so that we can redefine
 * the i/o functions that take/produce character strings
 * with our own ATOE functions.
 *
 * The compiler will find this header file in preference to the system one.
 * ===========================================================================
 */

#define _OPEN_MSGQ_EXT                               

#if __TARGET_LIB__ == 0X22080000                     
#include <//'PP.ADLE370.OS39028.SCEEH.H(time)'>      
#else                                                
#include </usr/include/time.h>                       
#endif                                               

#if defined(HY_ATOE)

	#if !defined(HY_ATOE_TIME)
		#define HY_ATOE_TIME

		#ifdef __cplusplus
            extern "C" {
		#endif

        char * atoe_ctime     (const time_t*);
        size_t atoe_strftime  (char*, size_t,const char*, const struct tm*);

		#ifdef __cplusplus
            }
		#endif

		#undef ctime
		#undef strftime

		#define ctime           atoe_ctime
		#define strftime        atoe_strftime

	#endif

#endif
