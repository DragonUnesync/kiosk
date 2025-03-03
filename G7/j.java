package g7;

import D6.k;
import P6.f;
import Y6.s;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class j extends n {

    /* renamed from: c  reason: collision with root package name */
    public final Method f12038c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f12039d;
    public final Method e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f12040f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f12041g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f12038c = method;
        this.f12039d = method2;
        this.e = method3;
        this.f12040f = cls;
        this.f12041g = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to remove ALPN", e9);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        f.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((s) next) != s.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(k.M(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f6727U);
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f12040f, this.f12041g}, new i(arrayList2));
            this.f12038c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        } catch (IllegalAccessException e9) {
            throw new AssertionError("failed to set ALPN", e9);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f12039d.invoke((Object) null, new Object[]{sSLSocket}));
            f.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z = iVar.f12036b;
            if (!z && iVar.f12037c == null) {
                n.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return iVar.f12037c;
            }
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        } catch (IllegalAccessException e9) {
            throw new AssertionError("failed to get ALPN selected protocol", e9);
        }
    }
}
