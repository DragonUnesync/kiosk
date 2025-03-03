package i1;

import M0.r;
import R.e;
import R0.h;
import R0.l;
import R0.z;
import de.ozerov.fully.K2;
import p1.j;

public final class i extends C1092e {

    /* renamed from: d0  reason: collision with root package name */
    public final C1091d f12703d0;

    /* renamed from: e0  reason: collision with root package name */
    public K2 f12704e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f12705f0;

    /* renamed from: g0  reason: collision with root package name */
    public volatile boolean f12706g0;

    public i(h hVar, l lVar, r rVar, int i, Object obj, C1091d dVar) {
        super(hVar, lVar, 2, rVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f12703d0 = dVar;
    }

    public final void c() {
        p1.l lVar;
        boolean z;
        boolean z6;
        if (this.f12705f0 == 0) {
            this.f12703d0.a(this.f12704e0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            l a8 = this.f12660V.a(this.f12705f0);
            z zVar = this.f12667c0;
            lVar = new p1.l(zVar, a8.e, zVar.f(a8));
            do {
                if (!this.f12706g0) {
                    C1091d dVar = this.f12703d0;
                    int e = dVar.f12650U.e(lVar, C1091d.f12649e0);
                    z = false;
                    if (e != 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    P0.l.j(z6);
                    if (e == 0) {
                        z = true;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.f12705f0 = lVar.f14408X - this.f12660V.e;
            boolean z8 = this.f12703d0.f12657b0 instanceof j;
            e.d(this.f12667c0);
        } catch (Throwable th) {
            e.d(this.f12667c0);
            throw th;
        }
    }

    public final void e() {
        this.f12706g0 = true;
    }
}
