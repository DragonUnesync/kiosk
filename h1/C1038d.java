package h1;

import P0.l;
import P0.z;
import T0.I;
import T0.e0;

/* renamed from: h1.d  reason: case insensitive filesystem */
public final class C1038d implements C1059z, C1058y {

    /* renamed from: U  reason: collision with root package name */
    public final C1059z f12453U;

    /* renamed from: V  reason: collision with root package name */
    public C1058y f12454V;

    /* renamed from: W  reason: collision with root package name */
    public C1037c[] f12455W = new C1037c[0];

    /* renamed from: X  reason: collision with root package name */
    public long f12456X;

    /* renamed from: Y  reason: collision with root package name */
    public long f12457Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f12458Z;

    /* renamed from: a0  reason: collision with root package name */
    public C1040f f12459a0;

    public C1038d(C1059z zVar, boolean z, long j7, long j8) {
        long j9;
        this.f12453U = zVar;
        if (z) {
            j9 = j7;
        } else {
            j9 = -9223372036854775807L;
        }
        this.f12456X = j9;
        this.f12457Y = j7;
        this.f12458Z = j8;
    }

    public final boolean a() {
        if (this.f12456X != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f12453U.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r1 > r3) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(k1.r[] r14, boolean[] r15, h1.Y[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r8 = r14
            r9 = r16
            int r1 = r9.length
            h1.c[] r1 = new h1.C1037c[r1]
            r0.f12455W = r1
            int r1 = r9.length
            h1.Y[] r10 = new h1.Y[r1]
            r11 = 0
            r1 = 0
        L_0x000e:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L_0x0023
            h1.c[] r2 = r0.f12455W
            r3 = r9[r1]
            h1.c r3 = (h1.C1037c) r3
            r2[r1] = r3
            if (r3 == 0) goto L_0x001e
            h1.Y r12 = r3.f12439U
        L_0x001e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0023:
            h1.z r1 = r0.f12453U
            r2 = r14
            r3 = r15
            r4 = r10
            r5 = r17
            r6 = r18
            long r1 = r1.d(r2, r3, r4, r5, r6)
            boolean r3 = r13.a()
            if (r3 == 0) goto L_0x005d
            long r3 = r0.f12457Y
            int r5 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x005d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x005d
            int r3 = r8.length
            r4 = 0
        L_0x0044:
            if (r4 >= r3) goto L_0x005d
            r5 = r8[r4]
            if (r5 == 0) goto L_0x005a
            M0.r r5 = r5.m()
            java.lang.String r6 = r5.f3036n
            java.lang.String r5 = r5.f3033k
            boolean r5 = M0.I.a(r6, r5)
            if (r5 != 0) goto L_0x005a
            r3 = r1
            goto L_0x0062
        L_0x005a:
            int r4 = r4 + 1
            goto L_0x0044
        L_0x005d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0062:
            r0.f12456X = r3
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x007d
            long r3 = r0.f12457Y
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x007b
            long r3 = r0.f12458Z
            r5 = -9223372036854775808
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x007d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r3 = 0
            goto L_0x007e
        L_0x007d:
            r3 = 1
        L_0x007e:
            P0.l.j(r3)
        L_0x0081:
            int r3 = r9.length
            if (r11 >= r3) goto L_0x00a7
            r3 = r10[r11]
            if (r3 != 0) goto L_0x008d
            h1.c[] r3 = r0.f12455W
            r3[r11] = r12
            goto L_0x009e
        L_0x008d:
            h1.c[] r4 = r0.f12455W
            r5 = r4[r11]
            if (r5 == 0) goto L_0x0097
            h1.Y r5 = r5.f12439U
            if (r5 == r3) goto L_0x009e
        L_0x0097:
            h1.c r5 = new h1.c
            r5.<init>(r13, r3)
            r4[r11] = r5
        L_0x009e:
            h1.c[] r3 = r0.f12455W
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L_0x0081
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1038d.d(k1.r[], boolean[], h1.Y[], boolean[], long):long");
    }

    public final long e() {
        long e = this.f12453U.e();
        if (e != Long.MIN_VALUE) {
            long j7 = this.f12458Z;
            if (j7 == Long.MIN_VALUE || e < j7) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long f() {
        boolean z;
        if (a()) {
            long j7 = this.f12456X;
            this.f12456X = -9223372036854775807L;
            long f8 = f();
            if (f8 != -9223372036854775807L) {
                return f8;
            }
            return j7;
        }
        long f9 = this.f12453U.f();
        if (f9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z6 = false;
        if (f9 >= this.f12457Y) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        long j8 = this.f12458Z;
        if (j8 == Long.MIN_VALUE || f9 <= j8) {
            z6 = true;
        }
        l.j(z6);
        return f9;
    }

    public final void f0(a0 a0Var) {
        C1059z zVar = (C1059z) a0Var;
        C1058y yVar = this.f12454V;
        yVar.getClass();
        yVar.f0(this);
    }

    public final boolean h(I i) {
        return this.f12453U.h(i);
    }

    public final void i(C1058y yVar, long j7) {
        this.f12454V = yVar;
        this.f12453U.i(this, j7);
    }

    public final f0 j() {
        return this.f12453U.j();
    }

    public final long m(long j7, e0 e0Var) {
        long j8;
        long j9 = this.f12457Y;
        if (j7 == j9) {
            return j9;
        }
        long j10 = z.j(e0Var.f4816a, 0, j7 - j9);
        long j11 = this.f12458Z;
        if (j11 == Long.MIN_VALUE) {
            j8 = Long.MAX_VALUE;
        } else {
            j8 = j11 - j7;
        }
        long j12 = z.j(e0Var.f4817b, 0, j8);
        if (!(j10 == e0Var.f4816a && j12 == e0Var.f4817b)) {
            e0Var = new e0(j10, j12);
        }
        return this.f12453U.m(j7, e0Var);
    }

    public final long n() {
        long n4 = this.f12453U.n();
        if (n4 != Long.MIN_VALUE) {
            long j7 = this.f12458Z;
            if (j7 == Long.MIN_VALUE || n4 < j7) {
                return n4;
            }
        }
        return Long.MIN_VALUE;
    }

    public final void o(C1059z zVar) {
        if (this.f12459a0 == null) {
            C1058y yVar = this.f12454V;
            yVar.getClass();
            yVar.o(this);
        }
    }

    public final void r() {
        C1040f fVar = this.f12459a0;
        if (fVar == null) {
            this.f12453U.r();
            return;
        }
        throw fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > r7) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long s(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f12456X = r0
            h1.c[] r0 = r6.f12455W
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0017
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0014
            r4.f12440V = r2
        L_0x0014:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0017:
            h1.z r0 = r6.f12453U
            long r0 = r0.s(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0033
            long r7 = r6.f12457Y
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0034
            long r7 = r6.f12458Z
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0033
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            P0.l.j(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1038d.s(long):long");
    }

    public final void t(long j7) {
        this.f12453U.t(j7);
    }

    public final void u(long j7) {
        this.f12453U.u(j7);
    }
}
