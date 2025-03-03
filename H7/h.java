package h7;

import P6.f;
import a1.C0410a;
import g7.C0997e;
import g7.n;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class h implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final g f12628a = new Object();

    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    public final String b(SSLSocket sSLSocket) {
        boolean z;
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            z = true;
        } else {
            z = f.a(applicationProtocol, "");
        }
        if (z) {
            return null;
        }
        return applicationProtocol;
    }

    public final boolean c() {
        boolean z = C0997e.f12030d;
        return C0997e.f12030d;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        f.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            n nVar = n.f12045a;
            parameters.setApplicationProtocols((String[]) C0410a.g(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
