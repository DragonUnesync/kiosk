package i1;

import M0.I;
import M0.r;
import R.e;
import R0.h;
import R0.l;
import R0.z;
import de.ozerov.fully.K2;
import h1.X;
import p1.F;
import p1.G;

/* renamed from: i1.h  reason: case insensitive filesystem */
public final class C1095h extends C1088a {

    /* renamed from: i0  reason: collision with root package name */
    public final int f12697i0;

    /* renamed from: j0  reason: collision with root package name */
    public final long f12698j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C1091d f12699k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f12700l0;

    /* renamed from: m0  reason: collision with root package name */
    public volatile boolean f12701m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f12702n0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1095h(h hVar, l lVar, r rVar, int i, Object obj, long j7, long j8, long j9, long j10, long j11, int i8, long j12, C1091d dVar) {
        super(hVar, lVar, rVar, i, obj, j7, j8, j9, j10, j11);
        this.f12697i0 = i8;
        this.f12698j0 = j12;
        this.f12699k0 = dVar;
    }

    public final long a() {
        return this.f12707d0 + ((long) this.f12697i0);
    }

    public final boolean b() {
        return this.f12702n0;
    }

    public final void c() {
        p1.l lVar;
        boolean z;
        boolean z6;
        long j7;
        long j8;
        K2 k22 = this.f12638g0;
        P0.l.k(k22);
        if (this.f12700l0 == 0) {
            long j9 = this.f12698j0;
            for (X x8 : (X[]) k22.f10051W) {
                if (x8.f12405F != j9) {
                    x8.f12405F = j9;
                    x8.z = true;
                }
            }
            C1091d dVar = this.f12699k0;
            long j10 = this.f12636e0;
            if (j10 == -9223372036854775807L) {
                j7 = -9223372036854775807L;
            } else {
                j7 = j10 - this.f12698j0;
            }
            long j11 = this.f12637f0;
            if (j11 == -9223372036854775807L) {
                j8 = -9223372036854775807L;
            } else {
                j8 = j11 - this.f12698j0;
            }
            dVar.a(k22, j7, j8);
        }
        try {
            l a8 = this.f12660V.a(this.f12700l0);
            z zVar = this.f12667c0;
            lVar = new p1.l(zVar, a8.e, zVar.f(a8));
            while (!this.f12701m0) {
                int e = this.f12699k0.f12650U.e(lVar, C1091d.f12649e0);
                if (e != 1) {
                    z = true;
                } else {
                    z = false;
                }
                P0.l.j(z);
                if (e == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    break;
                }
            }
            r rVar = this.f12662X;
            if (I.l(rVar.f3035m)) {
                int i = rVar.f3021J;
                int i8 = rVar.f3022K;
                if ((i > 1 || i8 > 1) && i != -1) {
                    if (i8 != -1) {
                        G W7 = k22.W(4);
                        int i9 = i * i8;
                        long j12 = (this.f12666b0 - this.f12665a0) / ((long) i9);
                        for (int i10 = 1; i10 < i9; i10++) {
                            W7.a(0, new P0.r());
                            W7.e(((long) i10) * j12, 0, 0, 0, (F) null);
                        }
                    }
                }
            }
            this.f12700l0 = lVar.f14408X - this.f12660V.e;
            e.d(this.f12667c0);
            this.f12702n0 = !this.f12701m0;
        } catch (Throwable th) {
            e.d(this.f12667c0);
            throw th;
        }
    }

    public final void e() {
        this.f12701m0 = true;
    }
}
