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

import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextChild;
import java.beans.beancontext.BeanContextMembershipListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;

/**
 * Mock of BeanContext
 */
@SuppressWarnings("unchecked")
public class MockBeanContext implements BeanContext {

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContext#instantiateChild(java.lang.String)
     */
    public Object instantiateChild(String beanName) throws IOException,
            ClassNotFoundException {
        // Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContext#getResourceAsStream(java.lang.String,
     *      java.beans.beancontext.BeanContextChild)
     */
    public InputStream getResourceAsStream(String name, BeanContextChild bcc)
            throws IllegalArgumentException {
        // Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContext#getResource(java.lang.String,
     *      java.beans.beancontext.BeanContextChild)
     */
    public URL getResource(String name, BeanContextChild bcc)
            throws IllegalArgumentException {
        // Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContext#addBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     */
    public void addBeanContextMembershipListener(
            BeanContextMembershipListener bcml) {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContext#removeBeanContextMembershipListener(java.beans.beancontext.BeanContextMembershipListener)
     */
    public void removeBeanContextMembershipListener(
            BeanContextMembershipListener bcml) {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContextChild#setBeanContext(java.beans.beancontext.BeanContext)
     */
    public void setBeanContext(BeanContext bc) throws PropertyVetoException {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContextChild#getBeanContext()
     */
    public BeanContext getBeanContext() {
        // Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContextChild#addPropertyChangeListener(java.lang.String,
     *      java.beans.PropertyChangeListener)
     */
    public void addPropertyChangeListener(String name,
            PropertyChangeListener pcl) {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContextChild#removePropertyChangeListener(java.lang.String,
     *      java.beans.PropertyChangeListener)
     */
    public void removePropertyChangeListener(String name,
            PropertyChangeListener pcl) {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContextChild#addVetoableChangeListener(java.lang.String,
     *      java.beans.VetoableChangeListener)
     */
    public void addVetoableChangeListener(String name,
            VetoableChangeListener vcl) {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.beancontext.BeanContextChild#removeVetoableChangeListener(java.lang.String,
     *      java.beans.VetoableChangeListener)
     */
    public void removeVetoableChangeListener(String name,
            VetoableChangeListener vcl) {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#size()
     */
    public int size() {
        // Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#isEmpty()
     */
    public boolean isEmpty() {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#contains(java.lang.Object)
     */
    public boolean contains(Object o) {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#iterator()
     */
    public Iterator iterator() {
        // Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#toArray()
     */
    public Object[] toArray() {
        // Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#toArray(java.lang.Object[])
     */
    public Object[] toArray(Object[] a) {
        // Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#add(java.lang.Object)
     */
    public boolean add(Object o) {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#remove(java.lang.Object)
     */
    public boolean remove(Object o) {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#containsAll(java.util.Collection)
     */
    public boolean containsAll(Collection c) {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#addAll(java.util.Collection)
     */
    public boolean addAll(Collection c) {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#removeAll(java.util.Collection)
     */
    public boolean removeAll(Collection c) {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#retainAll(java.util.Collection)
     */
    public boolean retainAll(Collection c) {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.util.Collection#clear()
     */
    public void clear() {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.DesignMode#setDesignTime(boolean)
     */
    public void setDesignTime(boolean designTime) {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.DesignMode#isDesignTime()
     */
    public boolean isDesignTime() {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.Visibility#needsGui()
     */
    public boolean needsGui() {
        // Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.Visibility#dontUseGui()
     */
    public void dontUseGui() {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.Visibility#okToUseGui()
     */
    public void okToUseGui() {
        // Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.beans.Visibility#avoidingGui()
     */
    public boolean avoidingGui() {
        // Auto-generated method stub
        return false;
    }

}
