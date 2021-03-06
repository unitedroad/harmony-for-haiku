/* 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.harmony.beans.tests.support.beancontext.mock;

import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.beans.beancontext.BeanContextServicesListener;
import java.io.Serializable;

/**
 * Mock of BeanContextServicesListener
 */
public class MockBeanContextServicesListenerS implements BeanContextServicesListener,
        Serializable {

    private static final long serialVersionUID = -2513090204796560433L;

    public String id;

    public MockBeanContextServicesListenerS(String id) {
        this.id = id;
    }

    public void serviceAvailable(BeanContextServiceAvailableEvent bcsae) {

    }

    public void serviceRevoked(BeanContextServiceRevokedEvent bcsre) {

    }

}
