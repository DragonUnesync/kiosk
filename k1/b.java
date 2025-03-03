package K1;

import P0.l;
import p1.z;

public final class b implements g {

    /* renamed from: U  reason: collision with root package name */
    public final f f2538U;

    /* renamed from: V  reason: collision with root package name */
    public final long f2539V;

    /* renamed from: W  reason: collision with root package name */
    public final long f2540W;

    /* renamed from: X  reason: collision with root package name */
    public final j f2541X;

    /* renamed from: Y  reason: collision with root package name */
    public int f2542Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f2543Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f2544a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f2545b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f2546c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f2547d0;

    /* renamed from: e0  reason: collision with root package name */
    public long f2548e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f2549f0;

    public b(j jVar, long j7, long j8, long j9, long j10, boolean z) {
        boolean z6;
        if (j7 < 0 || j8 <= j7) {
            z6 = false;
        } else {
            z6 = true;
        }
        l.d(z6);
        this.f2541X = jVar;
        this.f2539V = j7;
        this.f2540W = j8;
        if (j9 == j8 - j7 || z) {
            this.f2543Z = j10;
            this.f2542Y = 4;
        } else {
            this.f2542Y = 0;
        }
        this.f2538U = new f();
    }

    public final z g() {
        if (this.f2543Z != 0) {
            return new a(this);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long h(p1.l r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            int r2 = r0.f2542Y
            r3 = 0
            r5 = -1
            r7 = 0
            long r8 = r0.f2540W
            K1.f r10 = r0.f2538U
            r11 = 1
            r12 = 4
            if (r2 == 0) goto L_0x00fa
            if (r2 == r11) goto L_0x00f7
            r8 = 2
            r9 = 3
            if (r2 == r8) goto L_0x0029
            if (r2 == r9) goto L_0x0024
            if (r2 != r12) goto L_0x001e
            return r5
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            r2 = r5
            r23 = r10
            goto L_0x00c6
        L_0x0029:
            long r13 = r0.f2546c0
            long r5 = r0.f2547d0
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0039
        L_0x0031:
            r23 = r10
            r2 = -1
            r15 = -1
            goto L_0x00be
        L_0x0039:
            long r13 = r1.f14408X
            boolean r2 = r10.b(r1, r5)
            if (r2 != 0) goto L_0x0056
            long r2 = r0.f2546c0
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x004e
            r15 = r2
        L_0x0048:
            r23 = r10
        L_0x004a:
            r2 = -1
            goto L_0x00be
        L_0x004e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0056:
            r10.a(r1, r7)
            r1.f14410Z = r7
            long r5 = r0.f2545b0
            long r7 = r10.f2560b
            long r5 = r5 - r7
            int r11 = r10.f2562d
            int r2 = r10.e
            int r11 = r11 + r2
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0071
            r17 = 72000(0x11940, double:3.55727E-319)
            int r2 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x0071
            goto L_0x0031
        L_0x0071:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x007a
            r0.f2547d0 = r13
            r0.f2549f0 = r7
            goto L_0x0082
        L_0x007a:
            long r3 = r1.f14408X
            long r13 = (long) r11
            long r3 = r3 + r13
            r0.f2546c0 = r3
            r0.f2548e0 = r7
        L_0x0082:
            long r3 = r0.f2547d0
            long r7 = r0.f2546c0
            long r13 = r3 - r7
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r19 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0093
            r0.f2547d0 = r7
            r15 = r7
            goto L_0x0048
        L_0x0093:
            long r13 = (long) r11
            r17 = 1
            if (r2 > 0) goto L_0x009b
            r19 = 2
            goto L_0x009d
        L_0x009b:
            r19 = r17
        L_0x009d:
            long r13 = r13 * r19
            r23 = r10
            long r9 = r1.f14408X
            long r9 = r9 - r13
            long r13 = r3 - r7
            long r13 = r13 * r5
            long r5 = r0.f2549f0
            r19 = r3
            long r2 = r0.f2548e0
            long r5 = r5 - r2
            long r13 = r13 / r5
            long r2 = r13 + r9
            long r21 = r19 - r17
            r17 = r2
            r19 = r7
            long r2 = P0.z.j(r17, r19, r21)
            r15 = r2
            goto L_0x004a
        L_0x00be:
            int r5 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00c3
            return r15
        L_0x00c3:
            r4 = 3
            r0.f2542Y = r4
        L_0x00c6:
            r5 = r23
        L_0x00c8:
            r5.b(r1, r2)
            r2 = 0
            r5.a(r1, r2)
            long r3 = r5.f2560b
            long r6 = r0.f2545b0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00e2
            r1.f14410Z = r2
            r0.f2542Y = r12
            long r1 = r0.f2548e0
            r6 = 2
            long r1 = r1 + r6
            long r1 = -r1
            return r1
        L_0x00e2:
            r6 = 2
            int r3 = r5.f2562d
            int r4 = r5.e
            int r3 = r3 + r4
            r1.m(r3)
            long r3 = r1.f14408X
            r0.f2546c0 = r3
            long r3 = r5.f2560b
            r0.f2548e0 = r3
            r2 = -1
            goto L_0x00c8
        L_0x00f7:
            r5 = r10
        L_0x00f8:
            r2 = 0
            goto L_0x010b
        L_0x00fa:
            r5 = r10
            long r6 = r1.f14408X
            r0.f2544a0 = r6
            r0.f2542Y = r11
            r13 = 65307(0xff1b, double:3.2266E-319)
            long r13 = r8 - r13
            int r10 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f8
            return r13
        L_0x010b:
            r5.f2559a = r2
            r5.f2560b = r3
            r5.f2561c = r2
            r5.f2562d = r2
            r5.e = r2
            r3 = -1
            boolean r6 = r5.b(r1, r3)
            if (r6 == 0) goto L_0x0155
            r5.a(r1, r2)
            int r2 = r5.f2562d
            int r3 = r5.e
            int r2 = r2 + r3
            r1.m(r2)
            long r2 = r5.f2560b
        L_0x012a:
            int r4 = r5.f2559a
            r4 = r4 & r12
            if (r4 == r12) goto L_0x014e
            r6 = -1
            boolean r4 = r5.b(r1, r6)
            if (r4 == 0) goto L_0x014e
            long r13 = r1.f14408X
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x014e
            boolean r4 = r5.a(r1, r11)
            if (r4 == 0) goto L_0x014e
            int r4 = r5.f2562d
            int r10 = r5.e
            int r4 = r4 + r10
            r1.m(r4)     // Catch:{ EOFException -> 0x014e }
            long r2 = r5.f2560b
            goto L_0x012a
        L_0x014e:
            r0.f2543Z = r2
            r0.f2542Y = r12
            long r1 = r0.f2544a0
            return r1
        L_0x0155:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.b.h(p1.l):long");
    }

    public final void p(long j7) {
        this.f2545b0 = P0.z.j(j7, 0, this.f2543Z - 1);
        this.f2542Y = 2;
        this.f2546c0 = this.f2539V;
        this.f2547d0 = this.f2540W;
        this.f2548e0 = 0;
        this.f2549f0 = this.f2543Z;
    }
}
