package h7;

import W6.l;
import javax.net.ssl.SSLSocket;

public final class e implements k {
    public final boolean a(SSLSocket sSLSocket) {
        return l.a0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    public final m b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(cls2);
    }
}
