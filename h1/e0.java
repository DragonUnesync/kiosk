package h1;

import T0.I;
import k1.r;

public final class e0 implements C1059z, C1058y {

    /* renamed from: U  reason: collision with root package name */
    public final C1059z f12465U;

    /* renamed from: V  reason: collision with root package name */
    public final long f12466V;

    /* renamed from: W  reason: collision with root package name */
    public C1058y f12467W;

    public e0(C1059z zVar, long j7) {
        this.f12465U = zVar;
        this.f12466V = j7;
    }

    public final boolean b() {
        return this.f12465U.b();
    }

    public final long d(r[] rVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j7) {
        Y[] yArr2 = yArr;
        Y[] yArr3 = new Y[yArr2.length];
        int i = 0;
        while (true) {
            Y y8 = null;
            if (i >= yArr2.length) {
                break;
            }
            d0 d0Var = (d0) yArr2[i];
            if (d0Var != null) {
                y8 = d0Var.f12460U;
            }
            yArr3[i] = y8;
            i++;
        }
        long j8 = this.f12466V;
        long d8 = this.f12465U.d(rVarArr, zArr, yArr3, zArr2, j7 - j8);
        for (int i8 = 0; i8 < yArr2.length; i8++) {
            Y y9 = yArr3[i8];
            if (y9 == null) {
                yArr2[i8] = null;
            } else {
                Y y10 = yArr2[i8];
                if (y10 == null || ((d0) y10).f12460U != y9) {
                    yArr2[i8] = new d0(y9, j8);
                }
            }
        }
        return d8 + j8;
    }

    public final long e() {
        long e = this.f12465U.e();
        if (e == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f12466V + e;
    }

    public final long f() {
        long f8 = this.f12465U.f();
        if (f8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f12466V + f8;
    }

    public final void f0(a0 a0Var) {
        C1059z zVar = (C1059z) a0Var;
        C1058y yVar = this.f12467W;
        yVar.getClass();
        yVar.f0(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [T0.H, java.lang.Object] */
    public final boolean h(I i) {
        ? obj = new Object();
        obj.f4673b = i.f4676b;
        obj.f4674c = i.f4677c;
        obj.f4672a = i.f4675a - this.f12466V;
        return this.f12465U.h(new I(obj));
    }

    public final void i(C1058y yVar, long j7) {
        this.f12467W = yVar;
        this.f12465U.i(this, j7 - this.f12466V);
    }

    public final f0 j() {
        return this.f12465U.j();
    }

    public final long m(long j7, T0.e0 e0Var) {
        long j8 = this.f12466V;
        return this.f12465U.m(j7 - j8, e0Var) + j8;
    }

    public final long n() {
        long n4 = this.f12465U.n();
        if (n4 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f12466V + n4;
    }

    public final void o(C1059z zVar) {
        C1058y yVar = this.f12467W;
        yVar.getClass();
        yVar.o(this);
    }

    public final void r() {
        this.f12465U.r();
    }

    public final long s(long j7) {
        long j8 = this.f12466V;
        return this.f12465U.s(j7 - j8) + j8;
    }

    public final void t(long j7) {
        this.f12465U.t(j7 - this.f12466V);
    }

    public final void u(long j7) {
        this.f12465U.u(j7 - this.f12466V);
    }
}
