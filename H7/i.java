package h7;

import g7.C0998f;
import g7.h;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

public final class i implements k {
    public final boolean a(SSLSocket sSLSocket) {
        boolean z = h.f12033d;
        if (!C0998f.b() || !Conscrypt.isConscrypt(sSLSocket)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, h7.m] */
    public final m b(SSLSocket sSLSocket) {
        return new Object();
    }
}
