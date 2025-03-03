package h7;

import P6.f;
import a1.C0410a;
import g7.h;
import g7.n;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

public final class j implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final i f12629a = new Object();

    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final boolean c() {
        boolean z = h.f12033d;
        return h.f12033d;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        f.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            n nVar = n.f12045a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C0410a.g(list).toArray(new String[0]));
        }
    }
}
