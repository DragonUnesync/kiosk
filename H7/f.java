package h7;

import W6.a;
import a1.C0410a;
import g7.C0995c;
import g7.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

public class f implements m {

    /* renamed from: f  reason: collision with root package name */
    public static final e f12623f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Class f12624a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f12625b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f12626c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f12627d;
    public final Method e;

    public f(Class cls) {
        this.f12624a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        P6.f.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f12625b = declaredMethod;
        this.f12626c = cls.getMethod("setHostname", new Class[]{String.class});
        this.f12627d = cls.getMethod("getAlpnSelectedProtocol", (Class[]) null);
        this.e = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f12624a.isInstance(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        if (!this.f12624a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f12627d.invoke(sSLSocket, (Object[]) null);
            if (bArr != null) {
                return new String(bArr, a.f6191a);
            }
            return null;
        } catch (IllegalAccessException e8) {
            throw new AssertionError(e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if ((cause instanceof NullPointerException) && P6.f.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e9);
        }
    }

    public final boolean c() {
        boolean z = C0995c.e;
        return C0995c.e;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        P6.f.e(list, "protocols");
        if (this.f12624a.isInstance(sSLSocket)) {
            try {
                this.f12625b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f12626c.invoke(sSLSocket, new Object[]{str});
                }
                Method method = this.e;
                n nVar = n.f12045a;
                method.invoke(sSLSocket, new Object[]{C0410a.l(list)});
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e9) {
                throw new AssertionError(e9);
            }
        }
    }
}
