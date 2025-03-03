package E4;

import F4.b;
import T5.C0245f0;
import T5.O0;
import T5.W;
import T5.Y;
import b6.C1;
import b6.D1;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import x4.C1605a;

public final class a extends C0245f0 {

    /* renamed from: U  reason: collision with root package name */
    public final C1 f1366U;

    /* renamed from: V  reason: collision with root package name */
    public final String f1367V;

    /* renamed from: W  reason: collision with root package name */
    public final HostnameVerifier f1368W;

    /* renamed from: X  reason: collision with root package name */
    public final C1605a f1369X;

    /* renamed from: Y  reason: collision with root package name */
    public final b f1370Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f1371Z = false;

    public a(C1 c12, String str, HostnameVerifier hostnameVerifier, C1605a aVar, b bVar) {
        this.f1366U = c12;
        this.f1367V = str;
        this.f1368W = hostnameVerifier;
        this.f1369X = aVar;
        this.f1370Y = bVar;
    }

    public final void exceptionCaught(Y y8, Throwable th) {
        ((O0) y8.pipeline()).remove((W) this);
        if (!this.f1371Z) {
            this.f1371Z = true;
            this.f1370Y.accept(y8.channel(), th);
        }
    }

    public final boolean isSharable() {
        return false;
    }

    public final void userEventTriggered(Y y8, Object obj) {
        if (obj instanceof D1) {
            D1 d12 = (D1) obj;
            if (!this.f1371Z) {
                this.f1371Z = true;
                boolean isSuccess = d12.isSuccess();
                b bVar = this.f1370Y;
                if (isSuccess) {
                    ((O0) y8.pipeline()).remove((W) this);
                    HostnameVerifier hostnameVerifier = this.f1368W;
                    if (hostnameVerifier != null) {
                        if (!hostnameVerifier.verify(this.f1367V, this.f1366U.engine().getSession())) {
                            bVar.accept(y8.channel(), new SSLHandshakeException("Hostname verification failed"));
                            return;
                        }
                    }
                    this.f1369X.accept(y8.channel());
                    return;
                }
                bVar.accept(y8.channel(), d12.cause());
                return;
            }
            return;
        }
        y8.fireUserEventTriggered(obj);
    }
}
