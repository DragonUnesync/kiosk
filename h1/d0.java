package h1;

import R2.c;
import S0.f;

public final class d0 implements Y {

    /* renamed from: U  reason: collision with root package name */
    public final Y f12460U;

    /* renamed from: V  reason: collision with root package name */
    public final long f12461V;

    public d0(Y y8, long j7) {
        this.f12460U = y8;
        this.f12461V = j7;
    }

    public final void a() {
        this.f12460U.a();
    }

    public final boolean g() {
        return this.f12460U.g();
    }

    public final int l(c cVar, f fVar, int i) {
        int l8 = this.f12460U.l(cVar, fVar, i);
        if (l8 == -4) {
            fVar.f4388a0 += this.f12461V;
        }
        return l8;
    }

    public final int o(long j7) {
        return this.f12460U.o(j7 - this.f12461V);
    }
}
