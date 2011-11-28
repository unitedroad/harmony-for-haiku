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

package org.apache.harmony.beans.tests.support.mock;

import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class MockInterfaceBeanInfo  extends SimpleBeanInfo{
    public PropertyDescriptor[] getPropertyDescriptors() {
        PropertyDescriptor P = null;
        try {
            P = new PropertyDescriptor("value", MockInterface.class);
            P.setExpert(true);
            P.setBound(true);
            P.setConstrained(false);
            P.setDisplayName("adddisplay");
            P.setShortDescription("adddesc");
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
        return new PropertyDescriptor[]{ P };
    }
    
    public EventSetDescriptor[] getEventSetDescriptors(){
        EventSetDescriptor event = null;
        try{
            event = new EventSetDescriptor(MockSuperClass.class, "mockPropertyChange", MockPropertyChangeListener.class, "mockPropertyChange");
            event.setHidden(false);
            event.setExpert(true);
            event.setShortDescription("adddesc");
            event.setDisplayName("adddisplay");
            event.setUnicast(true);
            event.setInDefaultEventSet(false);
        }catch(IntrospectionException e){
            return null;
        }
        return new EventSetDescriptor[]{event};
    }
}
