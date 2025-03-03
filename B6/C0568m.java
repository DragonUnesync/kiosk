package b6;

import N.e;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: b6.m  reason: case insensitive filesystem */
public final class C0568m extends X509ExtendedTrustManager {
    private final X509ExtendedTrustManager wrapped;

    public C0568m(X509TrustManager x509TrustManager) {
        this.wrapped = (X509ExtendedTrustManager) x509TrustManager;
    }

    private static void throwEnhancedCertificateException(X509Certificate[] x509CertificateArr, CertificateException certificateException) {
        String message = certificateException.getMessage();
        if (message != null && certificateException.getMessage().startsWith("No subject alternative DNS name matching")) {
            StringBuilder sb = new StringBuilder(64);
            for (X509Certificate subjectAlternativeNames : x509CertificateArr) {
                Collection<List<?>> subjectAlternativeNames2 = subjectAlternativeNames.getSubjectAlternativeNames();
                if (subjectAlternativeNames2 != null) {
                    for (List next : subjectAlternativeNames2) {
                        if (next.size() >= 2 && ((Integer) next.get(0)).intValue() == 2) {
                            sb.append((String) next.get(1));
                            sb.append(",");
                        }
                    }
                }
            }
            if (sb.length() != 0) {
                sb.setLength(sb.length() - 1);
                StringBuilder B8 = e.B(message, " Subject alternative DNS names in the certificate chain of ");
                B8.append(x509CertificateArr.length);
                B8.append(" certificate(s): ");
                B8.append(sb);
                throw new CertificateException(B8.toString(), certificateException);
            }
        }
        throw certificateException;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.wrapped.checkClientTrusted(x509CertificateArr, str, socket);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        try {
            this.wrapped.checkServerTrusted(x509CertificateArr, str, socket);
        } catch (CertificateException e) {
            throwEnhancedCertificateException(x509CertificateArr, e);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.wrapped.getAcceptedIssuers();
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.wrapped.checkClientTrusted(x509CertificateArr, str, sSLEngine);
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.wrapped.checkClientTrusted(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        try {
            this.wrapped.checkServerTrusted(x509CertificateArr, str, sSLEngine);
        } catch (CertificateException e) {
            throwEnhancedCertificateException(x509CertificateArr, e);
        }
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        try {
            this.wrapped.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            throwEnhancedCertificateException(x509CertificateArr, e);
        }
    }
}
