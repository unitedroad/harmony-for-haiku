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

package org.apache.harmony.annotation.tests.javax.annotation;

import javax.annotation.Resource;

import junit.framework.TestCase;

public class Resource_AuthenticationTypeTest extends TestCase {
    public void testValues() {
        Resource.AuthenticationType[] types = Resource.AuthenticationType
                .values();
        assertEquals(2, types.length);
        // the result array should be ordered
        assertEquals(Resource.AuthenticationType.CONTAINER, types[0]);
        assertEquals(Resource.AuthenticationType.APPLICATION, types[1]);
    }

    public void testValueOf() {
        Resource.AuthenticationType type = Resource.AuthenticationType
                .valueOf("CONTAINER");
        assertEquals(Resource.AuthenticationType.CONTAINER, type);

        type = Resource.AuthenticationType.valueOf("APPLICATION");
        assertEquals(Resource.AuthenticationType.APPLICATION, type);

        try {
            type = Resource.AuthenticationType.valueOf(null);
            fail("should throw NPE");
        } catch (NullPointerException e) {
            // expected
        }

        try {
            type = Resource.AuthenticationType.valueOf("wrong name");
            fail("should throw IAE");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}
