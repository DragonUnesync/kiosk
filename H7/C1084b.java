package h7;

import P6.f;
import Q7.g;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: h7.b  reason: case insensitive filesystem */
public final class C1084b extends g {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f12618a;

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManagerExtensions f12619b;

    public C1084b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f12618a = x509TrustManager;
        this.f12619b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1084b) || ((C1084b) obj).f12618a != this.f12618a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f12618a);
    }

    public final List k(String str, List list) {
        f.e(list, "chain");
        f.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f12619b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            f.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
