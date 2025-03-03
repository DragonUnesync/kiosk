package g7;

import D6.h;
import Q7.g;
import a1.C0410a;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import h7.C1084b;
import h7.f;
import h7.j;
import h7.l;
import h7.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k7.C1163a;

/* renamed from: g7.a  reason: case insensitive filesystem */
public final class C0993a extends n {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f12022d;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f12023c;

    static {
        boolean z;
        if (!C0410a.s() || Build.VERSION.SDK_INT < 29) {
            z = false;
        } else {
            z = true;
        }
        f12022d = z;
    }

    public C0993a() {
        Object obj;
        if (!C0410a.s() || Build.VERSION.SDK_INT < 29) {
            obj = null;
        } else {
            obj = new Object();
        }
        ArrayList G8 = h.G(new m[]{obj, new l(f.f12623f), new l(j.f12629a), new l(h7.h.f12628a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = G8.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f12023c = arrayList;
    }

    public final g b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        C1084b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new C1084b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar != null) {
            return bVar;
        }
        return new C1163a(c(x509TrustManager));
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        P6.f.e(list, "protocols");
        Iterator it = this.f12023c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f12023c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sSLSocket);
        }
        return null;
    }

    public final boolean h(String str) {
        P6.f.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
