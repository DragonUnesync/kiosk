package X0;

import H3.O;
import M0.r;
import W0.h;
import java.util.ArrayList;

public final class k extends m implements h {

    /* renamed from: Z  reason: collision with root package name */
    public final n f6255Z;

    public k(long j7, r rVar, O o2, n nVar, ArrayList arrayList) {
        super(rVar, o2, nVar, arrayList);
        this.f6255Z = nVar;
    }

    public final long E(long j7, long j8) {
        n nVar = this.f6255Z;
        if (nVar.f6264f != null) {
            return -9223372036854775807L;
        }
        long b8 = nVar.b(j7, j8) + nVar.c(j7, j8);
        return (nVar.e(b8, j7) + nVar.g(b8)) - nVar.i;
    }

    public final j F(long j7) {
        return this.f6255Z.h(this, j7);
    }

    public final boolean L() {
        return this.f6255Z.i();
    }

    public final long Z() {
        return this.f6255Z.f6263d;
    }

    public final String a() {
        return null;
    }

    public final long b(long j7) {
        return this.f6255Z.g(j7);
    }

    public final h c() {
        return this;
    }

    public final j d() {
        return null;
    }

    public final long e(long j7, long j8) {
        return this.f6255Z.f(j7, j8);
    }

    public final long h(long j7, long j8) {
        return this.f6255Z.e(j7, j8);
    }

    public final long i0(long j7) {
        return this.f6255Z.d(j7);
    }

    public final long j0(long j7, long j8) {
        return this.f6255Z.b(j7, j8);
    }

    public final long t(long j7, long j8) {
        return this.f6255Z.c(j7, j8);
    }
}
