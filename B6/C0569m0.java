package b6;

import g6.C0978k;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: b6.m0  reason: case insensitive filesystem */
public final class C0569m0 implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException();
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException();
    }

    public X509Certificate[] getAcceptedIssuers() {
        return C0978k.EMPTY_X509_CERTIFICATES;
    }
}
