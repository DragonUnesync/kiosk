package b6;

import S5.C0187o;
import e6.C0850i;
import e6.C0856o;
import g6.C0978k;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: b6.b1  reason: case insensitive filesystem */
public abstract class C0539b1 {
    static final CertificateFactory X509_CERT_FACTORY;
    private final C0850i attributes = new C0856o();
    private final boolean startTls;

    static {
        try {
            X509_CERT_FACTORY = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            throw new IllegalStateException("unable to instance X.509 CertificateFactory", e);
        }
    }

    public C0539b1(boolean z) {
        this.startTls = z;
    }

    public static KeyManagerFactory buildKeyManagerFactory(X509Certificate[] x509CertificateArr, String str, PrivateKey privateKey, String str2, KeyManagerFactory keyManagerFactory, String str3) {
        if (str == null) {
            str = KeyManagerFactory.getDefaultAlgorithm();
        }
        char[] keyStorePassword = keyStorePassword(str2);
        return buildKeyManagerFactory(buildKeyStore(x509CertificateArr, privateKey, keyStorePassword, str3), str, keyStorePassword, keyManagerFactory);
    }

    public static KeyStore buildKeyStore(X509Certificate[] x509CertificateArr, PrivateKey privateKey, char[] cArr, String str) {
        if (str == null) {
            str = KeyStore.getDefaultType();
        }
        KeyStore instance = KeyStore.getInstance(str);
        instance.load((InputStream) null, (char[]) null);
        instance.setKeyEntry("key", privateKey, cArr, x509CertificateArr);
        return instance;
    }

    public static TrustManagerFactory buildTrustManagerFactory(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, String str) {
        if (str == null) {
            str = KeyStore.getDefaultType();
        }
        KeyStore instance = KeyStore.getInstance(str);
        instance.load((InputStream) null, (char[]) null);
        int i = 1;
        for (X509Certificate certificateEntry : x509CertificateArr) {
            instance.setCertificateEntry(Integer.toString(i), certificateEntry);
            i++;
        }
        if (trustManagerFactory == null) {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        }
        trustManagerFactory.init(instance);
        return trustManagerFactory;
    }

    public static G1 defaultClientProvider() {
        return defaultProvider();
    }

    private static G1 defaultProvider() {
        if (F.isAvailable()) {
            return G1.OPENSSL;
        }
        return G1.JDK;
    }

    public static G1 defaultServerProvider() {
        return defaultProvider();
    }

    public static char[] keyStorePassword(String str) {
        if (str == null) {
            return C0978k.EMPTY_CHARS;
        }
        return str.toCharArray();
    }

    public static C0539b1 newClientContextInternal(G1 g12, Provider provider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, C0543d dVar, String[] strArr, long j7, long j8, boolean z, String str2, Map.Entry<C0548e1, Object>... entryArr) {
        Provider provider2 = provider;
        G1 defaultClientProvider = g12 == null ? defaultClientProvider() : g12;
        int i = C0536a1.$SwitchMap$io$netty$handler$ssl$SslProvider[defaultClientProvider.ordinal()];
        if (i != 1) {
            if (i == 2) {
                verifyNullSslContextProvider(defaultClientProvider, provider2);
                F.ensureAvailability();
                return new L(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, iVar, dVar, strArr, j7, j8, z, str2, entryArr);
            } else if (i == 3) {
                verifyNullSslContextProvider(defaultClientProvider, provider2);
                F.ensureAvailability();
                return new C0594z0(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, iVar, dVar, strArr, j7, j8, z, str2, entryArr);
            } else {
                throw new Error(defaultClientProvider.toString());
            }
        } else if (!z) {
            return new C0593z(provider, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, iVar, dVar, strArr, j7, j8, str2);
        } else {
            throw new IllegalArgumentException("OCSP is not supported with this SslProvider: " + defaultClientProvider);
        }
    }

    public static C0539b1 newServerContextInternal(G1 g12, Provider provider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, C0543d dVar, long j7, long j8, C0561j jVar, String[] strArr, boolean z, boolean z6, String str2, Map.Entry<C0548e1, Object>... entryArr) {
        Provider provider2 = provider;
        G1 defaultServerProvider = g12 == null ? defaultServerProvider() : g12;
        int i = C0536a1.$SwitchMap$io$netty$handler$ssl$SslProvider[defaultServerProvider.ordinal()];
        if (i != 1) {
            if (i == 2) {
                verifyNullSslContextProvider(defaultServerProvider, provider2);
                return new W(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, iVar, dVar, j7, j8, jVar, strArr, z, z6, str2, entryArr);
            } else if (i == 3) {
                verifyNullSslContextProvider(defaultServerProvider, provider2);
                return new V0(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, iVar, dVar, j7, j8, jVar, strArr, z, z6, str2, entryArr);
            } else {
                throw new Error(defaultServerProvider.toString());
            }
        } else if (!z6) {
            return new D(provider, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, iVar, dVar, j7, j8, jVar, strArr, z, str2);
        } else {
            throw new IllegalArgumentException("OCSP is not supported with this SslProvider: " + defaultServerProvider);
        }
    }

    private static void verifyNullSslContextProvider(G1 g12, Provider provider) {
        if (provider != null) {
            throw new IllegalArgumentException("Java Security Provider unsupported for SslProvider: " + g12);
        }
    }

    public abstract boolean isClient();

    public final boolean isServer() {
        return !isClient();
    }

    public abstract SSLEngine newEngine(C0187o oVar, String str, int i);

    public final C1 newHandler(C0187o oVar, String str, int i) {
        return newHandler(oVar, str, i, this.startTls);
    }

    public abstract SSLSessionContext sessionContext();

    public long sessionTimeout() {
        return (long) sessionContext().getSessionTimeout();
    }

    public C1 newHandler(C0187o oVar, String str, int i, boolean z) {
        return new C1(newEngine(oVar, str, i), z);
    }

    public static KeyManagerFactory buildKeyManagerFactory(KeyStore keyStore, String str, char[] cArr, KeyManagerFactory keyManagerFactory) {
        if (keyManagerFactory == null) {
            if (str == null) {
                str = KeyManagerFactory.getDefaultAlgorithm();
            }
            keyManagerFactory = KeyManagerFactory.getInstance(str);
        }
        keyManagerFactory.init(keyStore, cArr);
        return keyManagerFactory;
    }
}
