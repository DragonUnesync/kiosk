package A7;

import D6.b;
import D6.i;
import D6.k;
import android.os.Build;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.acra.security.TLS;

public final class f extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    public final SSLSocketFactory f134a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f135b;

    public f(SSLSocketFactory sSLSocketFactory, List list) {
        P6.f.e(list, "protocols");
        this.f134a = sSLSocketFactory;
        ArrayList V8 = i.V(list);
        if (Build.VERSION.SDK_INT < 29) {
            V8.remove(TLS.V1_3);
        }
        ArrayList arrayList = new ArrayList(k.M(V8));
        Iterator it = V8.iterator();
        while (it.hasNext()) {
            arrayList.add(((TLS) it.next()).getId());
        }
        this.f135b = arrayList;
    }

    public final void a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            b g8 = P6.f.g(sSLSocket.getSupportedProtocols());
            while (g8.hasNext()) {
                ArrayList arrayList = this.f135b;
                if (arrayList.contains((String) g8.next())) {
                    sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
                    return;
                }
            }
        }
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        P6.f.e(socket, "socket");
        P6.f.e(str, "s");
        Socket createSocket = this.f134a.createSocket(socket, str, i, z);
        P6.f.d(createSocket, "createSocket(...)");
        a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f134a.getDefaultCipherSuites();
        P6.f.d(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f134a.getSupportedCipherSuites();
        P6.f.d(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    public final Socket createSocket(String str, int i) {
        P6.f.e(str, "s");
        Socket createSocket = this.f134a.createSocket(str, i);
        P6.f.d(createSocket, "createSocket(...)");
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i8) {
        P6.f.e(str, "s");
        P6.f.e(inetAddress, "inetAddress");
        Socket createSocket = this.f134a.createSocket(str, i, inetAddress, i8);
        P6.f.d(createSocket, "createSocket(...)");
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        P6.f.e(inetAddress, "inetAddress");
        Socket createSocket = this.f134a.createSocket(inetAddress, i);
        P6.f.d(createSocket, "createSocket(...)");
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i8) {
        P6.f.e(inetAddress, "inetAddress");
        P6.f.e(inetAddress2, "inetAddress1");
        Socket createSocket = this.f134a.createSocket(inetAddress, i, inetAddress2, i8);
        P6.f.d(createSocket, "createSocket(...)");
        a(createSocket);
        return createSocket;
    }
}
