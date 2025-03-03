package i1;

import M0.r;
import R.e;
import R0.h;
import R0.z;
import de.ozerov.fully.K2;
import h1.X;
import p1.F;
import p1.G;

public final class l extends C1088a {

    /* renamed from: i0  reason: collision with root package name */
    public final int f12709i0;

    /* renamed from: j0  reason: collision with root package name */
    public final r f12710j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f12711k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f12712l0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(h hVar, R0.l lVar, r rVar, int i, Object obj, long j7, long j8, long j9, int i8, r rVar2) {
        super(hVar, lVar, rVar, i, obj, j7, j8, -9223372036854775807L, -9223372036854775807L, j9);
        this.f12709i0 = i8;
        this.f12710j0 = rVar2;
    }

    public final boolean b() {
        return this.f12712l0;
    }

    public final void c() {
        z zVar = this.f12667c0;
        K2 k22 = this.f12638g0;
        P0.l.k(k22);
        for (X x8 : (X[]) k22.f10051W) {
            if (x8.f12405F != 0) {
                x8.f12405F = 0;
                x8.z = true;
            }
        }
        G W7 = k22.W(this.f12709i0);
        W7.c(this.f12710j0);
        try {
            long f8 = zVar.f(this.f12660V.a(this.f12711k0));
            if (f8 != -1) {
                f8 += this.f12711k0;
            }
            p1.l lVar = new p1.l(this.f12667c0, this.f12711k0, f8);
            for (int i = 0; i != -1; i = W7.b(lVar, Integer.MAX_VALUE, true)) {
                this.f12711k0 += (long) i;
            }
            W7.e(this.f12665a0, 1, (int) this.f12711k0, 0, (F) null);
            e.d(zVar);
            this.f12712l0 = true;
        } catch (Throwable th) {
            e.d(zVar);
            throw th;
        }
    }

    public final void e() {
    }
}
