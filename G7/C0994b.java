package g7;

import P6.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import k7.C1166d;

/* renamed from: g7.b  reason: case insensitive filesystem */
public final class C0994b implements C1166d {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f12024a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f12025b;

    public C0994b(X509TrustManager x509TrustManager, Method method) {
        this.f12024a = x509TrustManager;
        this.f12025b = method;
    }

    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f12025b.invoke(this.f12024a, new Object[]{x509Certificate});
            f.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0994b)) {
            return false;
        }
        C0994b bVar = (C0994b) obj;
        if (f.a(this.f12024a, bVar.f12024a) && f.a(this.f12025b, bVar.f12025b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12025b.hashCode() + (this.f12024a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f12024a + ", findByIssuerAndSignatureMethod=" + this.f12025b + ')';
    }
}
