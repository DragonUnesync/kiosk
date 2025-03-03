package g7;

import P6.f;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: g7.e  reason: case insensitive filesystem */
public final class C0997e extends n {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f12030d;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f12031c = new BouncyCastleJsseProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, C0996d.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f12030d = z;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        f.e(list, "protocols");
        super.d(sSLSocket, str, list);
    }

    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    public final SSLContext k() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f12031c);
        f.d(instance, "getInstance(\"TLS\", provider)");
        return instance;
    }

    public final X509TrustManager m() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        f.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                f.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        f.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
