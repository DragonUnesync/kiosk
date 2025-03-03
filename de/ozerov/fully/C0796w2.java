package de.ozerov.fully;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: de.ozerov.fully.w2  reason: case insensitive filesystem */
public final class C0796w2 implements X509TrustManager {
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
