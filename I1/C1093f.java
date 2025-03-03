package i1;

import P0.l;
import R2.c;
import S0.f;
import Y0.e;
import h1.X;
import h1.Y;

/* renamed from: i1.f  reason: case insensitive filesystem */
public final class C1093f implements Y {

    /* renamed from: U  reason: collision with root package name */
    public final C1094g f12668U;

    /* renamed from: V  reason: collision with root package name */
    public final X f12669V;

    /* renamed from: W  reason: collision with root package name */
    public final int f12670W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f12671X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1094g f12672Y;

    public C1093f(C1094g gVar, C1094g gVar2, X x8, int i) {
        this.f12672Y = gVar;
        this.f12668U = gVar2;
        this.f12669V = x8;
        this.f12670W = i;
    }

    public final void a() {
    }

    public final void b() {
        if (!this.f12671X) {
            C1094g gVar = this.f12672Y;
            e eVar = gVar.f12679a0;
            int[] iArr = gVar.f12674V;
            int i = this.f12670W;
            eVar.b(iArr[i], gVar.f12675W[i], 0, (Object) null, gVar.f12692n0);
            this.f12671X = true;
        }
    }

    public final void c() {
        C1094g gVar = this.f12672Y;
        boolean[] zArr = gVar.f12676X;
        int i = this.f12670W;
        l.j(zArr[i]);
        gVar.f12676X[i] = false;
    }

    public final boolean g() {
        C1094g gVar = this.f12672Y;
        if (gVar.x() || !this.f12669V.w(gVar.f12696s0)) {
            return false;
        }
        return true;
    }

    public final int l(c cVar, f fVar, int i) {
        C1094g gVar = this.f12672Y;
        if (gVar.x()) {
            return -3;
        }
        C1088a aVar = gVar.p0;
        X x8 = this.f12669V;
        if (aVar != null && aVar.d(this.f12670W + 1) <= x8.r()) {
            return -3;
        }
        b();
        return x8.B(cVar, fVar, i, gVar.f12696s0);
    }

    public final int o(long j7) {
        C1094g gVar = this.f12672Y;
        if (gVar.x()) {
            return 0;
        }
        boolean z = gVar.f12696s0;
        X x8 = this.f12669V;
        int t8 = x8.t(j7, z);
        C1088a aVar = gVar.p0;
        if (aVar != null) {
            t8 = Math.min(t8, aVar.d(this.f12670W + 1) - x8.r());
        }
        x8.H(t8);
        if (t8 > 0) {
            b();
        }
        return t8;
    }
}
