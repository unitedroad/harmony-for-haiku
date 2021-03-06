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

package org.apache.harmony.drlvm.tests.regression.h3751;

import junit.framework.TestCase;
import org.vmmagic.unboxed.*;

public class Test extends TestCase {

    //both methods caused failure in OPT
    public static void testStatic() {
        Foo.testStatic();
    }
    
    public static void testNonStatic() {
        new Foo().testNonStatic();
    } 
} 


class Foo {
    static long val;
    static Address staticAddr;
    Address nonStaticAddr;

    static void testStatic() {
        Address localAddr = Address.fromLong(val);
        staticAddr = localAddr;
        val = staticAddr.toLong();
        System.gc();
        staticAddr = localAddr;
    }


    void testNonStatic() {
        Address localAddr = Address.fromLong(val);
        nonStaticAddr = localAddr;
        val = nonStaticAddr.toLong();
        System.gc();
        nonStaticAddr = localAddr;
    }

}

