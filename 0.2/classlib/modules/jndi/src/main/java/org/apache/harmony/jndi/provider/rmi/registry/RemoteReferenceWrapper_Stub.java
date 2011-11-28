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
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * RMI stub class
 * for class org.apache.harmony.jndi.provider.rmi.registry.RemoteReferenceWrapper
 * Compatible with stub protocol version 1.1/1.2
 *
 * Generated by DRL RMI Compiler (rmic).
 *
 * DO NOT EDIT!!!
 * Contents subject to change without notice!
 */

package org.apache.harmony.jndi.provider.rmi.registry;

import org.apache.harmony.jndi.internal.nls.Messages;

@SuppressWarnings("deprecation")
public final class RemoteReferenceWrapper_Stub extends
        java.rmi.server.RemoteStub implements
        org.apache.harmony.jndi.provider.rmi.registry.RemoteReference,
        java.rmi.Remote {

    private static final long serialVersionUID = 2;

    private static final long interfaceHash = 2534274963554139942L;

    private static boolean useNewInvoke;

    private static final java.rmi.server.Operation[] operations = { new java.rmi.server.Operation(
            "javax.naming.Reference getReference()") //$NON-NLS-1$
    };

    private static java.lang.reflect.Method $method_getReference_0;

    static {
        try {
            java.rmi.server.RemoteRef.class
                    .getMethod(
                            "invoke", new java.lang.Class[] { java.rmi.Remote.class, java.lang.reflect.Method.class, java.lang.Object[].class, long.class }); //$NON-NLS-1$

            $method_getReference_0 = org.apache.harmony.jndi.provider.rmi.registry.RemoteReference.class
                    .getMethod("getReference", new java.lang.Class[] {}); //$NON-NLS-1$

            useNewInvoke = true;
        } catch (java.lang.NoSuchMethodException e) {
            useNewInvoke = false;
        }
    }

    public RemoteReferenceWrapper_Stub() {
        super();
    }

    public RemoteReferenceWrapper_Stub(java.rmi.server.RemoteRef ref) {
        super(ref);
    }

    // Implementation of getReference()
    public javax.naming.Reference getReference()
            throws javax.naming.NamingException, java.rmi.RemoteException {
        try {
            if (useNewInvoke) {
                java.lang.Object $result = ref.invoke(this,
                        $method_getReference_0, null, 3529874867989176284L);
                return ((javax.naming.Reference) $result);
            }
            java.rmi.server.RemoteCall call = ref.newCall(this, operations, 0,
                    interfaceHash);

            ref.invoke(call);

            javax.naming.Reference $result;

            try {
                java.io.ObjectInput in = call.getInputStream();
                $result = (javax.naming.Reference) in.readObject();
            } catch (java.io.IOException e) {
                // jndi.85=Error unmarshalling return value
                throw new java.rmi.UnmarshalException(Messages
                        .getString("jndi.85"), e); //$NON-NLS-1$
            } catch (java.lang.ClassNotFoundException e) {
                // jndi.85=Error unmarshalling return value
                throw new java.rmi.UnmarshalException(Messages
                        .getString("jndi.85"), e); //$NON-NLS-1$
            } finally {
                ref.done(call);
            }

            return $result;
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (javax.naming.NamingException e) {
            throw e;
        } catch (java.lang.Exception e) {
            // jndi.86=Undeclared checked exception
            throw new java.rmi.UnexpectedException(Messages
                    .getString("jndi.86"), e); //$NON-NLS-1$
        }
    }

}
