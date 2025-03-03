package h7;

import P6.f;
import a1.C0410a;
import android.net.ssl.SSLSockets;
import android.os.Build;
import g7.n;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: h7.a  reason: case insensitive filesystem */
public final class C1083a implements m {
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        boolean z;
        String j7 = sSLSocket.getApplicationProtocol();
        if (j7 == null) {
            z = true;
        } else {
            z = j7.equals("");
        }
        if (z) {
            return null;
        }
        return j7;
    }

    public final boolean c() {
        n nVar = n.f12045a;
        if (!C0410a.s() || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        f.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            n nVar = n.f12045a;
            sSLParameters.setApplicationProtocols((String[]) C0410a.g(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
