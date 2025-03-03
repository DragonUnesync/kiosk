package f7;

import N.e;
import b7.C0596b;
import java.net.SocketTimeoutException;
import l7.d;

public final class v extends d {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ w f11789m;

    public v(w wVar) {
        this.f11789m = wVar;
    }

    public final void j() {
        this.f11789m.e(9);
        o oVar = this.f11789m.f11791b;
        synchronized (oVar) {
            long j7 = oVar.f11751h0;
            long j8 = oVar.f11750g0;
            if (j7 >= j8) {
                oVar.f11750g0 = j8 + 1;
                oVar.f11752i0 = System.nanoTime() + ((long) 1000000000);
                oVar.f11745b0.c(new C0596b(oVar, 2, e.A(new StringBuilder(), oVar.f11740W, " ping")), 0);
            }
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
