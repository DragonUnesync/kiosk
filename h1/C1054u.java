package h1;

import P0.z;
import T0.I;
import T0.e0;
import k1.r;
import l1.e;

/* renamed from: h1.u  reason: case insensitive filesystem */
public final class C1054u implements C1059z, C1058y {

    /* renamed from: U  reason: collision with root package name */
    public final C1031B f12515U;

    /* renamed from: V  reason: collision with root package name */
    public final long f12516V;

    /* renamed from: W  reason: collision with root package name */
    public final e f12517W;

    /* renamed from: X  reason: collision with root package name */
    public C1035a f12518X;

    /* renamed from: Y  reason: collision with root package name */
    public C1059z f12519Y;

    /* renamed from: Z  reason: collision with root package name */
    public C1058y f12520Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f12521a0 = -9223372036854775807L;

    public C1054u(C1031B b8, e eVar, long j7) {
        this.f12515U = b8;
        this.f12517W = eVar;
        this.f12516V = j7;
    }

    public final void a(C1031B b8) {
        long j7 = this.f12521a0;
        if (j7 == -9223372036854775807L) {
            j7 = this.f12516V;
        }
        C1035a aVar = this.f12518X;
        aVar.getClass();
        C1059z b9 = aVar.b(b8, this.f12517W, j7);
        this.f12519Y = b9;
        if (this.f12520Z != null) {
            b9.i(this, j7);
        }
    }

    public final boolean b() {
        C1059z zVar = this.f12519Y;
        if (zVar == null || !zVar.b()) {
            return false;
        }
        return true;
    }

    public final long d(r[] rVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j7) {
        long j8;
        long j9 = this.f12521a0;
        if (j9 == -9223372036854775807L || j7 != this.f12516V) {
            j8 = j7;
        } else {
            j8 = j9;
        }
        this.f12521a0 = -9223372036854775807L;
        C1059z zVar = this.f12519Y;
        int i = z.f3748a;
        return zVar.d(rVarArr, zArr, yArr, zArr2, j8);
    }

    public final long e() {
        C1059z zVar = this.f12519Y;
        int i = z.f3748a;
        return zVar.e();
    }

    public final long f() {
        C1059z zVar = this.f12519Y;
        int i = z.f3748a;
        return zVar.f();
    }

    public final void f0(a0 a0Var) {
        C1059z zVar = (C1059z) a0Var;
        C1058y yVar = this.f12520Z;
        int i = z.f3748a;
        yVar.f0(this);
    }

    public final boolean h(I i) {
        C1059z zVar = this.f12519Y;
        if (zVar == null || !zVar.h(i)) {
            return false;
        }
        return true;
    }

    public final void i(C1058y yVar, long j7) {
        this.f12520Z = yVar;
        C1059z zVar = this.f12519Y;
        if (zVar != null) {
            long j8 = this.f12521a0;
            if (j8 == -9223372036854775807L) {
                j8 = this.f12516V;
            }
            zVar.i(this, j8);
        }
    }

    public final f0 j() {
        C1059z zVar = this.f12519Y;
        int i = z.f3748a;
        return zVar.j();
    }

    public final long m(long j7, e0 e0Var) {
        C1059z zVar = this.f12519Y;
        int i = z.f3748a;
        return zVar.m(j7, e0Var);
    }

    public final long n() {
        C1059z zVar = this.f12519Y;
        int i = z.f3748a;
        return zVar.n();
    }

    public final void o(C1059z zVar) {
        C1058y yVar = this.f12520Z;
        int i = z.f3748a;
        yVar.o(this);
    }

    public final void r() {
        C1059z zVar = this.f12519Y;
        if (zVar != null) {
            zVar.r();
            return;
        }
        C1035a aVar = this.f12518X;
        if (aVar != null) {
            aVar.j();
        }
    }

    public final long s(long j7) {
        C1059z zVar = this.f12519Y;
        int i = z.f3748a;
        return zVar.s(j7);
    }

    public final void t(long j7) {
        C1059z zVar = this.f12519Y;
        int i = z.f3748a;
        zVar.t(j7);
    }

    public final void u(long j7) {
        C1059z zVar = this.f12519Y;
        int i = z.f3748a;
        zVar.u(j7);
    }
}
