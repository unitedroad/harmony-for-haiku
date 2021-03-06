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

package javax.net.ssl;

import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Permission;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;

import org.apache.harmony.security.fortress.Engine;


/**
 * The public API for secure socket protocol implementations. It acts as factory
 * for {@code SSLSocketFactory}'s and {@code SSLEngine}s.
 */
public class SSLContext {
    // StoreSSLContext service name
    private static final String SERVICE = "SSLContext";

    // Used to access common engine functionality
    private static Engine engine = new Engine(SERVICE);

    // Storeused provider
    private final Provider provider;

    private static SSLContext defaultSSLContext;
    // Storeused SSLContextSpi implementation
    private final SSLContextSpi spiImpl;

    // Storeused protocol
    private final String protocol;

    protected SSLContext(SSLContextSpi contextSpi, Provider provider,
            String protocol) {
        this.provider = provider;
        this.protocol = protocol;
        this.spiImpl = contextSpi;
    }

    /**
     * Creates a new {@code SSLContext} instance for the specified protocol.
     *
     * @param protocol
     *            the requested protocol to create a context for.
     * @return the created {@code SSLContext} instance.
     * @throws NoSuchAlgorithmException
     *             if no installed provider can provide the requested protocol
     * @throws NullPointerException
     *             if {@code protocol} is {@code null} (instead of
     *             NoSuchAlgorithmException as in 1.4 release)
     */
    public static SSLContext getInstance(String protocol) throws NoSuchAlgorithmException {
        if (protocol == null) {
            throw new NullPointerException("protocol is null");
        }
        synchronized (engine) {
            engine.getInstance(protocol, null);
            return new SSLContext((SSLContextSpi) engine.spi, engine.provider, protocol);
        }
    }

    /**
     * Creates a new {@code SSLContext} instance for the specified protocol from
     * the specified provider.
     *
     * @param protocol
     *            the requested protocol to create a context for.
     * @param provider
     *            the name of the provider that provides the requested protocol.
     * @return an {@code SSLContext} for the requested protocol.
     * @throws NoSuchAlgorithmException
     *             if the specified provider cannot provider the requested
     *             protocol.
     * @throws NoSuchProviderException
     *             if the specified provider does not exits.
     * @throws NullPointerException
     *             if {@code protocol} is {@code null} (instead of
     *             NoSuchAlgorithmException as in 1.4 release)
     */
    public static SSLContext getInstance(String protocol, String provider)
            throws NoSuchAlgorithmException, NoSuchProviderException {
        if (provider == null) {
            throw new IllegalArgumentException("Provider is null");
        }
        if (provider.length() == 0) {
            throw new IllegalArgumentException("Provider is empty");
        }
        Provider impProvider = Security.getProvider(provider);
        if (impProvider == null) {
            throw new NoSuchProviderException(provider);
        }
        return getInstance(protocol, impProvider);
    }

    /**
     * Creates a new {@code SSLContext} instance for the specified protocol from
     * the specified provider.
     *
     * @param protocol
     *            the requested protocol to create a context for
     * @param provider
     *            the provider that provides the requested protocol.
     * @return an {@code SSLContext} for the requested protocol.
     * @throws NoSuchAlgorithmException
     *             if the specified provider cannot provide the requested
     *             protocol.
     * @throws NullPointerException
     *             if {@code protocol} is {@code null} (instead of
     *             NoSuchAlgorithmException as in 1.4 release)
     */
    public static SSLContext getInstance(String protocol, Provider provider)
            throws NoSuchAlgorithmException {
        if (provider == null) {
            throw new IllegalArgumentException("provider is null");
        }
        if (protocol == null) {
            throw new NullPointerException("protocol is null");
        }
        synchronized (engine) {
            engine.getInstance(protocol, provider, null);
            return new SSLContext((SSLContextSpi) engine.spi, provider, protocol);
        }
    }
    
    /**
     * Returns the name of the secure socket protocol of this instance.
     *
     * @return the name of the secure socket protocol of this instance.
     */
	public final String getProtocol() {
        return protocol;
    }

    /**
     * Returns the provider of this {@code SSLContext} instance.
     *
     * @return the provider of this {@code SSLContext} instance.
     */
    public final Provider getProvider() {
        return provider;
    }

    /**
     * Initializes this {@code SSLContext} instance. All of the arguments are
     * optional, and the security providers will be searched for the required
     * implementations of the needed algorithms.
     *
     * @param km
     *            the key sources or {@code null}.
     * @param tm
     *            the trust decision sources or {@code null}.
     * @param sr
     *            the randomness source or {@code null.}
     * @throws KeyManagementException
     *             if initializing this instance fails.
     */
    public final void init(KeyManager[] km, TrustManager[] tm, SecureRandom sr)
            throws KeyManagementException {
        spiImpl.engineInit(km, tm, sr);
    }

    /**
     * Returns a socket factory for this instance.
     *
     * @return a socket factory for this instance.
     */
    public final SSLSocketFactory getSocketFactory() {
        return spiImpl.engineGetSocketFactory();
    }

    /**
     * Returns a server socket factory for this instance.
     *
     * @return a server socket factory for this instance.
     */
    public final SSLServerSocketFactory getServerSocketFactory() {
        return spiImpl.engineGetServerSocketFactory();
    }

    /**
     * Creates an {@code SSLEngine} instance from this context.
     *
     * @return an {@code SSLEngine} instance from this context.
     * @throws UnsupportedOperationException
     *             if the provider does not support the operation.
     */
    public final SSLEngine createSSLEngine() {
        return spiImpl.engineCreateSSLEngine();
    }

    /**
     * Creates an {@code SSLEngine} instance from this context with the
     * specified hostname and port.
     *
     * @param peerHost
     *            the name of the host
     * @param peerPort
     *            the port
     * @return an {@code SSLEngine} instance from this context.
     * @throws UnsupportedOperationException
     *             if the provider does not support the operation.
     */
    public final SSLEngine createSSLEngine(String peerHost, int peerPort) {
        return spiImpl.engineCreateSSLEngine(peerHost, peerPort);
    }

    /**
     * Returns the SSL session context that encapsulates the set of SSL sessions
     * that can be used for handshake of server-side SSL sockets.
     *
     * @return the SSL server session context for this context or {@code null}
     *         if the underlying provider does not provide an implementation of
     *         the {@code SSLSessionContext} interface.
     */
    public final SSLSessionContext getServerSessionContext() {
        return spiImpl.engineGetServerSessionContext();
    }

    /**
     * Returns the SSL session context that encapsulates the set of SSL sessions
     * that can be used for handshake of client-side SSL sockets.
     *
     * @return the SSL client session context for this context or {@code null}
     *         if the underlying provider does not provide an implementation of
     *         the {@code SSLSessionContext} interface.
     */
    public final SSLSessionContext getClientSessionContext() {
        return spiImpl.engineGetClientSessionContext();
    }

    public final SSLParameters getDefaultSSLParameters() {
        return spiImpl.engineGetDefaultSSLParameters();
    }

    public final SSLParameters getSupportedSSLParameters() {
        return spiImpl.engineGetSupportedSSLParameters();
    }

    public static SSLContext getDefault() throws NoSuchAlgorithmException {
        if (defaultSSLContext == null)
            defaultSSLContext = SSLContext.getInstance("Default");
        return defaultSSLContext;
    }

    public static void setDefault(SSLContext sslContext) {
        if (sslContext == null)
            throw new NullPointerException();
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null)
            securityManager.checkPermission(new SSLPermission(
                    "setDefaultSSLContext"));
        defaultSSLContext = sslContext;
    }
}
