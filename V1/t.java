package V1;

import N1.f;
import P0.r;
import p1.G;
import p1.q;

public final class t implements i {

    /* renamed from: a  reason: collision with root package name */
    public final String f5897a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5898b;

    /* renamed from: c  reason: collision with root package name */
    public final r f5899c;

    /* renamed from: d  reason: collision with root package name */
    public final f f5900d;
    public G e;

    /* renamed from: f  reason: collision with root package name */
    public String f5901f;

    /* renamed from: g  reason: collision with root package name */
    public M0.r f5902g;

    /* renamed from: h  reason: collision with root package name */
    public int f5903h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f5904j;

    /* renamed from: k  reason: collision with root package name */
    public int f5905k;

    /* renamed from: l  reason: collision with root package name */
    public long f5906l = -9223372036854775807L;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5907m;

    /* renamed from: n  reason: collision with root package name */
    public int f5908n;

    /* renamed from: o  reason: collision with root package name */
    public int f5909o;

    /* renamed from: p  reason: collision with root package name */
    public int f5910p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5911q;

    /* renamed from: r  reason: collision with root package name */
    public long f5912r;

    /* renamed from: s  reason: collision with root package name */
    public int f5913s;

    /* renamed from: t  reason: collision with root package name */
    public long f5914t;

    /* renamed from: u  reason: collision with root package name */
    public int f5915u;

    /* renamed from: v  reason: collision with root package name */
    public String f5916v;

    public t(String str, int i8) {
        this.f5897a = str;
        this.f5898b = i8;
        r rVar = new r(1024);
        this.f5899c = rVar;
        byte[] bArr = rVar.f3732a;
        this.f5900d = new f(bArr.length, bArr);
    }

    public final void a() {
        this.f5903h = 0;
        this.f5906l = -9223372036854775807L;
        this.f5907m = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0199, code lost:
        if (r0.f5907m == false) goto L_0x019b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(P0.r r24) {
        /*
            r23 = this;
            r0 = r23
            p1.G r1 = r0.e
            P0.l.k(r1)
        L_0x0007:
            int r1 = r24.a()
            if (r1 <= 0) goto L_0x026a
            int r1 = r0.f5903h
            r2 = 1
            r3 = 86
            if (r1 == 0) goto L_0x025e
            r4 = 2
            r5 = 0
            if (r1 == r2) goto L_0x0245
            r3 = 3
            r6 = 8
            P0.r r7 = r0.f5899c
            N1.f r8 = r0.f5900d
            if (r1 == r4) goto L_0x021f
            if (r1 != r3) goto L_0x0219
            int r1 = r24.a()
            int r9 = r0.f5904j
            int r10 = r0.i
            int r9 = r9 - r10
            int r1 = java.lang.Math.min(r1, r9)
            byte[] r9 = r8.f3344b
            int r10 = r0.i
            r11 = r24
            r11.g(r9, r10, r1)
            int r9 = r0.i
            int r9 = r9 + r1
            r0.i = r9
            int r1 = r0.f5904j
            if (r9 != r1) goto L_0x0007
            r8.r(r5)
            boolean r1 = r8.h()
            r9 = 0
            if (r1 != 0) goto L_0x0197
            r0.f5907m = r2
            int r1 = r8.i(r2)
            if (r1 != r2) goto L_0x0059
            int r10 = r8.i(r2)
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            r0.f5908n = r10
            if (r10 != 0) goto L_0x0192
            if (r1 != r2) goto L_0x006a
            int r10 = r8.i(r4)
            int r10 = r10 + r2
            int r10 = r10 * 8
            r8.i(r10)
        L_0x006a:
            boolean r10 = r8.h()
            if (r10 == 0) goto L_0x018d
            r10 = 6
            int r12 = r8.i(r10)
            r0.f5909o = r12
            r12 = 4
            int r13 = r8.i(r12)
            int r14 = r8.i(r3)
            if (r13 != 0) goto L_0x0188
            if (r14 != 0) goto L_0x0188
            if (r1 != 0) goto L_0x00f8
            int r13 = r8.g()
            int r14 = r8.b()
            p1.a r15 = p1.C1332b.p(r8, r2)
            java.lang.String r5 = r15.f14337a
            r0.f5916v = r5
            int r5 = r15.f14338b
            r0.f5913s = r5
            int r5 = r15.f14339c
            r0.f5915u = r5
            int r5 = r8.b()
            int r14 = r14 - r5
            r8.r(r13)
            int r5 = r14 + 7
            int r5 = r5 / r6
            byte[] r5 = new byte[r5]
            r8.j(r14, r5)
            M0.q r13 = new M0.q
            r13.<init>()
            java.lang.String r14 = r0.f5901f
            r13.f2989a = r14
            java.lang.String r14 = "audio/mp4a-latm"
            java.lang.String r14 = M0.I.o(r14)
            r13.f2999m = r14
            java.lang.String r14 = r0.f5916v
            r13.f2996j = r14
            int r14 = r0.f5915u
            r13.f2979B = r14
            int r14 = r0.f5913s
            r13.f2980C = r14
            java.util.List r5 = java.util.Collections.singletonList(r5)
            r13.f3002p = r5
            java.lang.String r5 = r0.f5897a
            r13.f2992d = r5
            int r5 = r0.f5898b
            r13.f2993f = r5
            M0.r r5 = new M0.r
            r5.<init>(r13)
            M0.r r13 = r0.f5902g
            boolean r13 = r5.equals(r13)
            if (r13 != 0) goto L_0x0122
            r0.f5902g = r5
            int r13 = r5.f3015D
            long r13 = (long) r13
            r16 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r13 = r16 / r13
            r0.f5914t = r13
            p1.G r13 = r0.e
            r13.c(r5)
            goto L_0x0122
        L_0x00f8:
            int r5 = r8.i(r4)
            int r5 = r5 + r2
            int r5 = r5 * 8
            int r5 = r8.i(r5)
            long r13 = (long) r5
            int r5 = (int) r13
            int r13 = r8.b()
            p1.a r14 = p1.C1332b.p(r8, r2)
            java.lang.String r15 = r14.f14337a
            r0.f5916v = r15
            int r15 = r14.f14338b
            r0.f5913s = r15
            int r14 = r14.f14339c
            r0.f5915u = r14
            int r14 = r8.b()
            int r13 = r13 - r14
            int r5 = r5 - r13
            r8.u(r5)
        L_0x0122:
            int r5 = r8.i(r3)
            r0.f5910p = r5
            if (r5 == 0) goto L_0x014d
            if (r5 == r2) goto L_0x0147
            if (r5 == r3) goto L_0x0143
            if (r5 == r12) goto L_0x0143
            r3 = 5
            if (r5 == r3) goto L_0x0143
            if (r5 == r10) goto L_0x013f
            r3 = 7
            if (r5 != r3) goto L_0x0139
            goto L_0x013f
        L_0x0139:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x013f:
            r8.u(r2)
            goto L_0x0150
        L_0x0143:
            r8.u(r10)
            goto L_0x0150
        L_0x0147:
            r3 = 9
            r8.u(r3)
            goto L_0x0150
        L_0x014d:
            r8.u(r6)
        L_0x0150:
            boolean r3 = r8.h()
            r0.f5911q = r3
            r12 = 0
            r0.f5912r = r12
            if (r3 == 0) goto L_0x017e
            if (r1 != r2) goto L_0x016d
            int r1 = r8.i(r4)
            int r1 = r1 + r2
            int r1 = r1 * 8
            int r1 = r8.i(r1)
            long r3 = (long) r1
            r0.f5912r = r3
            goto L_0x017e
        L_0x016d:
            boolean r1 = r8.h()
            long r3 = r0.f5912r
            long r3 = r3 << r6
            int r5 = r8.i(r6)
            long r12 = (long) r5
            long r3 = r3 + r12
            r0.f5912r = r3
            if (r1 != 0) goto L_0x016d
        L_0x017e:
            boolean r1 = r8.h()
            if (r1 == 0) goto L_0x019d
            r8.u(r6)
            goto L_0x019d
        L_0x0188:
            M0.J r1 = M0.J.a(r9, r9)
            throw r1
        L_0x018d:
            M0.J r1 = M0.J.a(r9, r9)
            throw r1
        L_0x0192:
            M0.J r1 = M0.J.a(r9, r9)
            throw r1
        L_0x0197:
            boolean r1 = r0.f5907m
            if (r1 != 0) goto L_0x019d
        L_0x019b:
            r1 = 0
            goto L_0x0206
        L_0x019d:
            int r1 = r0.f5908n
            if (r1 != 0) goto L_0x0214
            int r1 = r0.f5909o
            if (r1 != 0) goto L_0x020f
            int r1 = r0.f5910p
            if (r1 != 0) goto L_0x020a
            r1 = 0
        L_0x01aa:
            int r3 = r8.i(r6)
            int r1 = r1 + r3
            r4 = 255(0xff, float:3.57E-43)
            if (r3 == r4) goto L_0x01aa
            int r3 = r8.g()
            r4 = r3 & 7
            if (r4 != 0) goto L_0x01c1
            int r3 = r3 >> 3
            r7.H(r3)
            goto L_0x01cc
        L_0x01c1:
            byte[] r3 = r7.f3732a
            int r4 = r1 * 8
            r8.j(r4, r3)
            r3 = 0
            r7.H(r3)
        L_0x01cc:
            p1.G r3 = r0.e
            r3.a(r1, r7)
            long r3 = r0.f5906l
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x01dd
            goto L_0x01de
        L_0x01dd:
            r2 = 0
        L_0x01de:
            P0.l.j(r2)
            p1.G r2 = r0.e
            long r3 = r0.f5906l
            r21 = 0
            r22 = 0
            r19 = 1
            r16 = r2
            r17 = r3
            r20 = r1
            r16.e(r17, r19, r20, r21, r22)
            long r1 = r0.f5906l
            long r3 = r0.f5914t
            long r1 = r1 + r3
            r0.f5906l = r1
            boolean r1 = r0.f5911q
            if (r1 == 0) goto L_0x019b
            long r1 = r0.f5912r
            int r2 = (int) r1
            r8.u(r2)
            goto L_0x019b
        L_0x0206:
            r0.f5903h = r1
            goto L_0x0007
        L_0x020a:
            M0.J r1 = M0.J.a(r9, r9)
            throw r1
        L_0x020f:
            M0.J r1 = M0.J.a(r9, r9)
            throw r1
        L_0x0214:
            M0.J r1 = M0.J.a(r9, r9)
            throw r1
        L_0x0219:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x021f:
            r11 = r24
            int r1 = r0.f5905k
            r1 = r1 & -225(0xffffffffffffff1f, float:NaN)
            int r1 = r1 << r6
            int r2 = r24.v()
            r1 = r1 | r2
            r0.f5904j = r1
            byte[] r2 = r7.f3732a
            int r2 = r2.length
            if (r1 <= r2) goto L_0x023e
            r7.E(r1)
            byte[] r1 = r7.f3732a
            r8.getClass()
            int r2 = r1.length
            r8.p(r2, r1)
        L_0x023e:
            r1 = 0
            r0.i = r1
            r0.f5903h = r3
            goto L_0x0007
        L_0x0245:
            r11 = r24
            int r1 = r24.v()
            r2 = r1 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0257
            r0.f5905k = r1
            r0.f5903h = r4
            goto L_0x0007
        L_0x0257:
            if (r1 == r3) goto L_0x0007
            r1 = 0
            r0.f5903h = r1
            goto L_0x0007
        L_0x025e:
            r11 = r24
            int r1 = r24.v()
            if (r1 != r3) goto L_0x0007
            r0.f5903h = r2
            goto L_0x0007
        L_0x026a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.t.e(P0.r):void");
    }

    public final void f(boolean z) {
    }

    public final void g(int i8, long j7) {
        this.f5906l = j7;
    }

    public final void h(q qVar, G g8) {
        g8.c();
        g8.d();
        this.e = qVar.q(g8.f5716c, 1);
        g8.d();
        this.f5901f = (String) g8.e;
    }
}
