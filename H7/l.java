package h7;

import P6.f;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    public final k f12630a;

    /* renamed from: b  reason: collision with root package name */
    public m f12631b;

    public l(k kVar) {
        this.f12630a = kVar;
    }

    public final boolean a(SSLSocket sSLSocket) {
        return this.f12630a.a(sSLSocket);
    }

    public final String b(SSLSocket sSLSocket) {
        m e = e(sSLSocket);
        if (e != null) {
            return e.b(sSLSocket);
        }
        return null;
    }

    public final boolean c() {
        return true;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        f.e(list, "protocols");
        m e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f12631b == null && this.f12630a.a(sSLSocket)) {
                this.f12631b = this.f12630a.b(sSLSocket);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f12631b;
    }
}
