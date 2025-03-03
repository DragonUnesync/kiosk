package g7;

import D6.h;
import H6.b;
import Q7.g;
import a1.C0410a;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.samsung.android.knox.accounts.HostAuth;
import h7.C1084b;
import h7.f;
import h7.j;
import h7.l;
import h7.m;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k7.C1163a;
import k7.C1166d;

/* renamed from: g7.c  reason: case insensitive filesystem */
public final class C0995c extends n {
    public static final boolean e;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f12026c;

    /* renamed from: d  reason: collision with root package name */
    public final b f12027d;

    static {
        boolean z = false;
        if (C0410a.s() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public C0995c() {
        f fVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            fVar = new f(cls);
        } catch (Exception e8) {
            n.f12045a.getClass();
            n.i(5, "unable to load android socket classes", e8);
            fVar = null;
        }
        ArrayList G8 = h.G(new m[]{fVar, new l(f.f12623f), new l(j.f12629a), new l(h7.h.f12628a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = G8.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((m) next).c()) {
                arrayList.add(next);
            }
        }
        this.f12026c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", (Class[]) null);
            method2 = cls2.getMethod("open", new Class[]{String.class});
            method = cls2.getMethod("warnIfOpen", (Class[]) null);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f12027d = new b(method3, method2, method);
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

    public final C1166d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C0994b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        P6.f.e(list, "protocols");
        Iterator it = this.f12026c.iterator();
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

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        P6.f.e(inetSocketAddress, HostAuth.ADDRESS);
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e8) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e8);
            }
            throw e8;
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f12026c.iterator();
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

    public final Object g() {
        b bVar = this.f12027d;
        bVar.getClass();
        Method method = bVar.f2202a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, (Object[]) null);
            Method method2 = bVar.f2203b;
            P6.f.b(method2);
            method2.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean h(String str) {
        P6.f.e(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    public final void j(Object obj, String str) {
        P6.f.e(str, "message");
        b bVar = this.f12027d;
        bVar.getClass();
        if (obj != null) {
            try {
                Method method = bVar.f2204c;
                P6.f.b(method);
                method.invoke(obj, (Object[]) null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(5, str, (Throwable) null);
    }
}
