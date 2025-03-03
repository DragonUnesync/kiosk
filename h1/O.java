package h1;

import R2.c;
import S0.f;
import java.io.IOException;
import l1.l;
import l1.p;

public final class O implements Y {

    /* renamed from: U  reason: collision with root package name */
    public final int f12331U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Q f12332V;

    public O(Q q7, int i) {
        this.f12332V = q7;
        this.f12331U = i;
    }

    public final void a() {
        Q q7 = this.f12332V;
        q7.f12365n0[this.f12331U].y();
        int r8 = q7.f12349X.r(q7.f12374x0);
        p pVar = q7.f12357f0;
        IOException iOException = pVar.f13152W;
        if (iOException == null) {
            l lVar = pVar.f13151V;
            if (lVar != null) {
                if (r8 == Integer.MIN_VALUE) {
                    r8 = lVar.f13137U;
                }
                IOException iOException2 = lVar.f13141Y;
                if (iOException2 != null && lVar.f13142Z > r8) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean g() {
        Q q7 = this.f12332V;
        if (q7.F() || !q7.f12365n0[this.f12331U].w(q7.f12344H0)) {
            return false;
        }
        return true;
    }

    public final int l(c cVar, f fVar, int i) {
        Q q7 = this.f12332V;
        if (q7.F()) {
            return -3;
        }
        int i8 = this.f12331U;
        q7.z(i8);
        int B8 = q7.f12365n0[i8].B(cVar, fVar, i, q7.f12344H0);
        if (B8 == -3) {
            q7.B(i8);
        }
        return B8;
    }

    public final int o(long j7) {
        Q q7 = this.f12332V;
        if (q7.F()) {
            return 0;
        }
        int i = this.f12331U;
        q7.z(i);
        X x8 = q7.f12365n0[i];
        int t8 = x8.t(j7, q7.f12344H0);
        x8.H(t8);
        if (t8 != 0) {
            return t8;
        }
        q7.B(i);
        return t8;
    }
}
