/*
 * RMI stub class
 * for class java.rmi.activation.ActivationGroup
 * Compatible with stub protocol version 1.2
 *
 * Generated by DRL RMI Compiler (rmic).
 *
 * DO NOT EDIT!!!
 * Contents subject to change without notice!
 */
package java.rmi.activation;

import org.apache.harmony.rmi.internal.nls.Messages;


public final class ActivationGroup_Stub extends java.rmi.server.RemoteStub
        implements java.rmi.activation.ActivationInstantiator, java.rmi.Remote {

    private static final long serialVersionUID = 2;

    private static java.lang.reflect.Method $method_newInstance_0;

    static {
        try {
            $method_newInstance_0 = java.rmi.activation.ActivationInstantiator.class.getMethod("newInstance", new java.lang.Class[] {java.rmi.activation.ActivationID.class, java.rmi.activation.ActivationDesc.class}); //$NON-NLS-1$
        } catch (java.lang.NoSuchMethodException e) {
            // rmi.0B=Stub class initialization failed: java.rmi.activation.ActivationGroup_Stub
            throw new java.lang.NoSuchMethodError(Messages.getString("rmi.0B")); //$NON-NLS-1$
        }
    }

    public ActivationGroup_Stub(java.rmi.server.RemoteRef ref) {
        super(ref);
    }

    // Implementation of newInstance(ActivationID, ActivationDesc)
    public java.rmi.MarshalledObject newInstance(java.rmi.activation.ActivationID $param_ActivationID_1, java.rmi.activation.ActivationDesc $param_ActivationDesc_2)
            throws java.rmi.activation.ActivationException, java.rmi.RemoteException {
        try {
            java.lang.Object $result = ref.invoke(this, $method_newInstance_0, new java.lang.Object[] {$param_ActivationID_1, $param_ActivationDesc_2}, -5274445189091581345L);
            return ((java.rmi.MarshalledObject) $result);
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.rmi.RemoteException e) {
            throw e;
        } catch (java.rmi.activation.ActivationException e) {
            throw e;
        } catch (java.lang.Exception e) {
            // rmi.0C=Undeclared checked exception
            throw new java.rmi.UnexpectedException(Messages.getString("rmi.0C"), e); //$NON-NLS-1$
        }
    }
}
