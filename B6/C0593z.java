package b6;

import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: b6.z  reason: case insensitive filesystem */
public final class C0593z extends C {
    public C0593z(Provider provider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, C0543d dVar, String[] strArr, long j7, long j8, String str2) {
        super(newSSLContext(provider, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, j7, j8, str2), true, iterable, iVar, C.toNegotiator(dVar, false), C0561j.NONE, strArr, false);
    }

    private static SSLContext newSSLContext(Provider provider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, long j7, long j8, String str2) {
        TrustManagerFactory trustManagerFactory2;
        KeyManagerFactory keyManagerFactory2;
        SSLContext sSLContext;
        KeyManager[] keyManagerArr;
        TrustManager[] trustManagerArr;
        Provider provider2 = provider;
        long j9 = j7;
        long j10 = j8;
        if (x509CertificateArr != null) {
            TrustManagerFactory trustManagerFactory3 = trustManagerFactory;
            try {
                trustManagerFactory2 = C0539b1.buildTrustManagerFactory(x509CertificateArr, trustManagerFactory, str2);
            } catch (Exception e) {
                if (e instanceof SSLException) {
                    throw ((SSLException) e);
                }
                throw new SSLException("failed to initialize the client-side SSL context", e);
            }
        } else {
            String str3 = str2;
            trustManagerFactory2 = trustManagerFactory;
        }
        if (x509CertificateArr2 != null) {
            keyManagerFactory2 = C0539b1.buildKeyManagerFactory(x509CertificateArr2, (String) null, privateKey, str, keyManagerFactory, str2);
        } else {
            keyManagerFactory2 = keyManagerFactory;
        }
        if (provider2 == null) {
            sSLContext = SSLContext.getInstance("TLS");
        } else {
            sSLContext = SSLContext.getInstance("TLS", provider);
        }
        if (keyManagerFactory2 == null) {
            keyManagerArr = null;
        } else {
            keyManagerArr = keyManagerFactory2.getKeyManagers();
        }
        if (trustManagerFactory2 == null) {
            trustManagerArr = null;
        } else {
            trustManagerArr = trustManagerFactory2.getTrustManagers();
        }
        sSLContext.init(keyManagerArr, trustManagerArr, (SecureRandom) null);
        SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
        if (j9 > 0) {
            clientSessionContext.setSessionCacheSize((int) Math.min(j9, 2147483647L));
        }
        if (j10 > 0) {
            clientSessionContext.setSessionTimeout((int) Math.min(j10, 2147483647L));
        }
        return sSLContext;
    }
}
