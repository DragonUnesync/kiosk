package h;

import android.view.ViewGroup;
import v0.C1510H;
import v0.C1514L;

public final class p implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12230U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1000A f12231V;

    public /* synthetic */ p(C1000A a8, int i) {
        this.f12230U = i;
        this.f12231V = a8;
    }

    public final void run() {
        boolean z;
        ViewGroup viewGroup;
        switch (this.f12230U) {
            case 0:
                C1000A a8 = this.f12231V;
                if ((a8.f12069T0 & 1) != 0) {
                    a8.w(0);
                }
                if ((a8.f12069T0 & 4096) != 0) {
                    a8.w(108);
                }
                a8.f12068S0 = false;
                a8.f12069T0 = 0;
                return;
            default:
                C1000A a9 = this.f12231V;
                a9.f12089q0.showAtLocation(a9.p0, 55, 0, 0);
                C1514L l8 = a9.f12091s0;
                if (l8 != null) {
                    l8.b();
                }
                if (!a9.f12092t0 || (viewGroup = a9.f12093u0) == null || !viewGroup.isLaidOut()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    a9.p0.setAlpha(0.0f);
                    C1514L a10 = C1510H.a(a9.p0);
                    a10.a(1.0f);
                    a9.f12091s0 = a10;
                    a10.d(new r(0, this));
                    return;
                }
                a9.p0.setAlpha(1.0f);
                a9.p0.setVisibility(0);
                return;
        }
    }
}
