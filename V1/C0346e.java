package V1;

import M0.C0129q;
import M0.I;
import N1.f;
import P0.r;
import Q0.g;
import java.util.Arrays;
import p1.G;
import p1.n;
import p1.q;

/* renamed from: V1.e  reason: case insensitive filesystem */
public final class C0346e implements i {

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f5746w = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5747a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5748b = new f(7, new byte[7]);

    /* renamed from: c  reason: collision with root package name */
    public final r f5749c = new r(Arrays.copyOf(f5746w, 10));

    /* renamed from: d  reason: collision with root package name */
    public final String f5750d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public String f5751f;

    /* renamed from: g  reason: collision with root package name */
    public G f5752g;

    /* renamed from: h  reason: collision with root package name */
    public G f5753h;
    public int i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f5754j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f5755k = 256;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5756l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5757m;

    /* renamed from: n  reason: collision with root package name */
    public int f5758n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f5759o = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f5760p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5761q;

    /* renamed from: r  reason: collision with root package name */
    public long f5762r = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public int f5763s;

    /* renamed from: t  reason: collision with root package name */
    public long f5764t = -9223372036854775807L;

    /* renamed from: u  reason: collision with root package name */
    public G f5765u;

    /* renamed from: v  reason: collision with root package name */
    public long f5766v;

    public C0346e(boolean z, String str, int i8) {
        this.f5747a = z;
        this.f5750d = str;
        this.e = i8;
    }

    public final void a() {
        this.f5764t = -9223372036854775807L;
        this.f5757m = false;
        this.i = 0;
        this.f5754j = 0;
        this.f5755k = 256;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(P0.r r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 2
            r4 = 7
            r5 = 1
            p1.G r6 = r0.f5752g
            r6.getClass()
            int r6 = P0.z.f3748a
        L_0x000e:
            int r6 = r24.a()
            if (r6 <= 0) goto L_0x0311
            int r6 = r0.i
            N1.f r7 = r0.f5748b
            r8 = 256(0x100, float:3.59E-43)
            r9 = 4
            r10 = 3
            r11 = 0
            r12 = 13
            P0.r r13 = r0.f5749c
            if (r6 == 0) goto L_0x01b4
            if (r6 == r5) goto L_0x0178
            r14 = 10
            if (r6 == r2) goto L_0x0140
            if (r6 == r10) goto L_0x007d
            if (r6 != r9) goto L_0x0077
            int r6 = r24.a()
            int r7 = r0.f5763s
            int r9 = r0.f5754j
            int r7 = r7 - r9
            int r6 = java.lang.Math.min(r6, r7)
            p1.G r7 = r0.f5765u
            r7.a(r6, r1)
            int r7 = r0.f5754j
            int r7 = r7 + r6
            r0.f5754j = r7
            int r6 = r0.f5763s
            if (r7 != r6) goto L_0x000e
            long r6 = r0.f5764t
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x0055
            r6 = 1
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            P0.l.j(r6)
            p1.G r12 = r0.f5765u
            long r13 = r0.f5764t
            int r6 = r0.f5763s
            r15 = 1
            r17 = 0
            r18 = 0
            r16 = r6
            r12.e(r13, r15, r16, r17, r18)
            long r6 = r0.f5764t
            long r9 = r0.f5766v
            long r6 = r6 + r9
            r0.f5764t = r6
            r0.i = r11
            r0.f5754j = r11
            r0.f5755k = r8
            goto L_0x000e
        L_0x0077:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x007d:
            boolean r6 = r0.f5756l
            r8 = 5
            if (r6 == 0) goto L_0x0084
            r6 = 7
            goto L_0x0085
        L_0x0084:
            r6 = 5
        L_0x0085:
            byte[] r13 = r7.f3344b
            int r15 = r24.a()
            int r3 = r0.f5754j
            int r3 = r6 - r3
            int r3 = java.lang.Math.min(r15, r3)
            int r15 = r0.f5754j
            r1.g(r13, r15, r3)
            int r13 = r0.f5754j
            int r13 = r13 + r3
            r0.f5754j = r13
            if (r13 != r6) goto L_0x000e
            r7.r(r11)
            boolean r3 = r0.f5761q
            if (r3 != 0) goto L_0x011e
            int r3 = r7.i(r2)
            int r3 = r3 + r5
            if (r3 == r2) goto L_0x00c6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r13 = "Detected audio object type: "
            r6.<init>(r13)
            r6.append(r3)
            java.lang.String r3 = ", but assuming AAC LC."
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r6 = "AdtsReader"
            P0.l.B(r6, r3)
            r3 = 2
        L_0x00c6:
            r7.u(r8)
            int r6 = r7.i(r10)
            int r8 = r0.f5759o
            byte[] r3 = p1.C1332b.a(r3, r8, r6)
            N1.f r6 = new N1.f
            r6.<init>((int) r2, (byte[]) r3)
            p1.a r6 = p1.C1332b.p(r6, r11)
            M0.q r8 = new M0.q
            r8.<init>()
            java.lang.String r10 = r0.f5751f
            r8.f2989a = r10
            java.lang.String r10 = "audio/mp4a-latm"
            java.lang.String r10 = M0.I.o(r10)
            r8.f2999m = r10
            java.lang.String r10 = r6.f14337a
            r8.f2996j = r10
            int r10 = r6.f14339c
            r8.f2979B = r10
            int r6 = r6.f14338b
            r8.f2980C = r6
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r8.f3002p = r3
            java.lang.String r3 = r0.f5750d
            r8.f2992d = r3
            int r3 = r0.e
            r8.f2993f = r3
            M0.r r3 = new M0.r
            r3.<init>(r8)
            int r6 = r3.f3015D
            long r13 = (long) r6
            r17 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r13 = r17 / r13
            r0.f5762r = r13
            p1.G r6 = r0.f5752g
            r6.c(r3)
            r0.f5761q = r5
            goto L_0x0121
        L_0x011e:
            r7.u(r14)
        L_0x0121:
            r7.u(r9)
            int r3 = r7.i(r12)
            int r6 = r3 + -7
            boolean r7 = r0.f5756l
            if (r7 == 0) goto L_0x0130
            int r6 = r3 + -9
        L_0x0130:
            p1.G r3 = r0.f5752g
            long r7 = r0.f5762r
            r0.i = r9
            r0.f5754j = r11
            r0.f5765u = r3
            r0.f5766v = r7
            r0.f5763s = r6
            goto L_0x000e
        L_0x0140:
            byte[] r3 = r13.f3732a
            int r6 = r24.a()
            int r7 = r0.f5754j
            int r7 = 10 - r7
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r0.f5754j
            r1.g(r3, r7, r6)
            int r3 = r0.f5754j
            int r3 = r3 + r6
            r0.f5754j = r3
            if (r3 != r14) goto L_0x000e
            p1.G r3 = r0.f5753h
            r3.a(r14, r13)
            r3 = 6
            r13.H(r3)
            p1.G r3 = r0.f5753h
            int r6 = r13.u()
            int r6 = r6 + r14
            r0.i = r9
            r0.f5754j = r14
            r0.f5765u = r3
            r7 = 0
            r0.f5766v = r7
            r0.f5763s = r6
            goto L_0x000e
        L_0x0178:
            int r3 = r24.a()
            if (r3 != 0) goto L_0x0180
            goto L_0x000e
        L_0x0180:
            byte[] r3 = r7.f3344b
            byte[] r6 = r1.f3732a
            int r12 = r1.f3733b
            byte r6 = r6[r12]
            r3[r11] = r6
            r7.r(r2)
            int r3 = r7.i(r9)
            int r6 = r0.f5759o
            r7 = -1
            if (r6 == r7) goto L_0x01a2
            if (r3 == r6) goto L_0x01a2
            r0.f5757m = r11
            r0.i = r11
            r0.f5754j = r11
            r0.f5755k = r8
            goto L_0x000e
        L_0x01a2:
            boolean r6 = r0.f5757m
            if (r6 != 0) goto L_0x01ae
            r0.f5757m = r5
            int r6 = r0.f5760p
            r0.f5758n = r6
            r0.f5759o = r3
        L_0x01ae:
            r0.i = r10
            r0.f5754j = r11
            goto L_0x000e
        L_0x01b4:
            byte[] r3 = r1.f3732a
            int r6 = r1.f3733b
            int r14 = r1.f3734c
        L_0x01ba:
            if (r6 >= r14) goto L_0x030a
            int r15 = r6 + 1
            byte r8 = r3[r6]
            r10 = r8 & 255(0xff, float:3.57E-43)
            int r4 = r0.f5755k
            r12 = 512(0x200, float:7.175E-43)
            if (r4 != r12) goto L_0x02ab
            byte r4 = (byte) r10
            r4 = r4 & 255(0xff, float:3.57E-43)
            r19 = 65280(0xff00, float:9.1477E-41)
            r4 = r19 | r4
            r20 = 65526(0xfff6, float:9.1821E-41)
            r4 = r4 & r20
            r12 = 65520(0xfff0, float:9.1813E-41)
            if (r4 != r12) goto L_0x02ab
            boolean r4 = r0.f5757m
            if (r4 != 0) goto L_0x0286
            r4 = -1
            int r21 = r6 + -1
            r1.H(r6)
            byte[] r4 = r7.f3344b
            int r12 = r24.a()
            if (r12 >= r5) goto L_0x01ee
            goto L_0x02ab
        L_0x01ee:
            r1.g(r4, r11, r5)
            r7.r(r9)
            int r4 = r7.i(r5)
            int r12 = r0.f5758n
            r9 = -1
            if (r12 == r9) goto L_0x0201
            if (r4 == r12) goto L_0x0201
            goto L_0x02ab
        L_0x0201:
            int r12 = r0.f5759o
            if (r12 == r9) goto L_0x0224
            byte[] r9 = r7.f3344b
            int r12 = r24.a()
            if (r12 >= r5) goto L_0x020f
            goto L_0x0286
        L_0x020f:
            r1.g(r9, r11, r5)
            r7.r(r2)
            r9 = 4
            int r12 = r7.i(r9)
            int r2 = r0.f5759o
            if (r12 == r2) goto L_0x0220
            goto L_0x02ab
        L_0x0220:
            r1.H(r15)
            goto L_0x0225
        L_0x0224:
            r9 = 4
        L_0x0225:
            byte[] r2 = r7.f3344b
            int r12 = r24.a()
            if (r12 >= r9) goto L_0x022e
            goto L_0x0286
        L_0x022e:
            r1.g(r2, r11, r9)
            r2 = 14
            r7.r(r2)
            r2 = 13
            int r12 = r7.i(r2)
            r2 = 7
            if (r12 >= r2) goto L_0x0241
            goto L_0x02ab
        L_0x0241:
            byte[] r2 = r1.f3732a
            int r9 = r1.f3734c
            int r12 = r21 + r12
            if (r12 < r9) goto L_0x024a
            goto L_0x0286
        L_0x024a:
            byte r11 = r2[r12]
            r22 = r3
            r3 = -1
            if (r11 != r3) goto L_0x0269
            int r12 = r12 + r5
            if (r12 != r9) goto L_0x0255
            goto L_0x0287
        L_0x0255:
            byte r2 = r2[r12]
            r9 = r2 & 255(0xff, float:3.57E-43)
            r9 = r19 | r9
            r9 = r9 & r20
            r11 = 65520(0xfff0, float:9.1813E-41)
            if (r9 != r11) goto L_0x02ae
            r2 = r2 & 8
            r9 = 3
            int r2 = r2 >> r9
            if (r2 != r4) goto L_0x02ae
            goto L_0x0287
        L_0x0269:
            r4 = 73
            if (r11 == r4) goto L_0x026e
            goto L_0x02ae
        L_0x026e:
            int r4 = r12 + 1
            if (r4 != r9) goto L_0x0273
            goto L_0x0287
        L_0x0273:
            byte r4 = r2[r4]
            r11 = 68
            if (r4 == r11) goto L_0x027a
            goto L_0x02ae
        L_0x027a:
            r4 = 2
            int r12 = r12 + r4
            if (r12 != r9) goto L_0x027f
            goto L_0x0287
        L_0x027f:
            byte r2 = r2[r12]
            r4 = 51
            if (r2 != r4) goto L_0x02ae
            goto L_0x0287
        L_0x0286:
            r3 = -1
        L_0x0287:
            r2 = r8 & 8
            r4 = 3
            int r2 = r2 >> r4
            r0.f5760p = r2
            r2 = r8 & 1
            if (r2 != 0) goto L_0x0293
            r2 = 1
            goto L_0x0294
        L_0x0293:
            r2 = 0
        L_0x0294:
            r0.f5756l = r2
            boolean r2 = r0.f5757m
            if (r2 != 0) goto L_0x02a0
            r0.i = r5
            r2 = 0
            r0.f5754j = r2
            goto L_0x02a6
        L_0x02a0:
            r2 = 0
            r4 = 3
            r0.i = r4
            r0.f5754j = r2
        L_0x02a6:
            r1.H(r15)
            r2 = 2
            goto L_0x030e
        L_0x02ab:
            r22 = r3
            r3 = -1
        L_0x02ae:
            int r2 = r0.f5755k
            r4 = r2 | r10
            r8 = 329(0x149, float:4.61E-43)
            if (r4 == r8) goto L_0x02f4
            r8 = 511(0x1ff, float:7.16E-43)
            if (r4 == r8) goto L_0x02ea
            r8 = 836(0x344, float:1.171E-42)
            if (r4 == r8) goto L_0x02e0
            r8 = 1075(0x433, float:1.506E-42)
            if (r4 == r8) goto L_0x02d0
            r4 = 256(0x100, float:3.59E-43)
            if (r2 == r4) goto L_0x02cc
            r0.f5755k = r4
            r2 = 2
            r8 = 3
            r9 = 0
            goto L_0x02fe
        L_0x02cc:
            r2 = 2
            r8 = 3
            r9 = 0
            goto L_0x02fd
        L_0x02d0:
            r2 = 2
            r0.i = r2
            r8 = 3
            r0.f5754j = r8
            r9 = 0
            r0.f5763s = r9
            r13.H(r9)
            r1.H(r15)
            goto L_0x030e
        L_0x02e0:
            r2 = 2
            r4 = 256(0x100, float:3.59E-43)
            r8 = 3
            r9 = 0
            r6 = 1024(0x400, float:1.435E-42)
            r0.f5755k = r6
            goto L_0x02fd
        L_0x02ea:
            r2 = 2
            r4 = 256(0x100, float:3.59E-43)
            r6 = 512(0x200, float:7.175E-43)
            r8 = 3
            r9 = 0
            r0.f5755k = r6
            goto L_0x02fd
        L_0x02f4:
            r2 = 2
            r4 = 256(0x100, float:3.59E-43)
            r8 = 3
            r9 = 0
            r6 = 768(0x300, float:1.076E-42)
            r0.f5755k = r6
        L_0x02fd:
            r6 = r15
        L_0x02fe:
            r3 = r22
            r4 = 7
            r8 = 256(0x100, float:3.59E-43)
            r9 = 4
            r10 = 3
            r11 = 0
            r12 = 13
            goto L_0x01ba
        L_0x030a:
            r3 = -1
            r1.H(r6)
        L_0x030e:
            r4 = 7
            goto L_0x000e
        L_0x0311:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.C0346e.e(P0.r):void");
    }

    public final void f(boolean z) {
    }

    public final void g(int i8, long j7) {
        this.f5764t = j7;
    }

    public final void h(q qVar, G g8) {
        g8.c();
        g8.d();
        this.f5751f = (String) g8.e;
        g8.d();
        G q7 = qVar.q(g8.f5716c, 1);
        this.f5752g = q7;
        this.f5765u = q7;
        if (this.f5747a) {
            g8.c();
            g8.d();
            G q8 = qVar.q(g8.f5716c, 5);
            this.f5753h = q8;
            C0129q qVar2 = new C0129q();
            g8.d();
            qVar2.f2989a = (String) g8.e;
            qVar2.f2999m = I.o("application/id3");
            g.v(qVar2, q8);
            return;
        }
        this.f5753h = new n();
    }
}
