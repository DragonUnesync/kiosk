package r1;

import B.q0;
import F2.h;
import H3.M;
import H3.O;
import H3.i0;
import K1.i;
import M1.j;
import P0.r;
import P0.z;
import h1.C1048n;
import java.util.List;
import p1.l;
import p1.o;
import p1.p;
import p1.q;

public final class b implements o {

    /* renamed from: a  reason: collision with root package name */
    public final r f14814a;

    /* renamed from: b  reason: collision with root package name */
    public final h f14815b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14816c;

    /* renamed from: d  reason: collision with root package name */
    public final i f14817d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public q f14818f;

    /* renamed from: g  reason: collision with root package name */
    public c f14819g;

    /* renamed from: h  reason: collision with root package name */
    public long f14820h;
    public e[] i;

    /* renamed from: j  reason: collision with root package name */
    public long f14821j;

    /* renamed from: k  reason: collision with root package name */
    public e f14822k;

    /* renamed from: l  reason: collision with root package name */
    public int f14823l;

    /* renamed from: m  reason: collision with root package name */
    public long f14824m;

    /* renamed from: n  reason: collision with root package name */
    public long f14825n;

    /* renamed from: o  reason: collision with root package name */
    public int f14826o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14827p;

    /* JADX WARNING: type inference failed for: r2v3, types: [F2.h, java.lang.Object] */
    public b(int i8, i iVar) {
        this.f14817d = iVar;
        this.f14816c = (i8 & 1) != 0 ? false : true;
        this.f14814a = new r(12);
        this.f14815b = new Object();
        this.f14818f = new C1048n(14);
        this.i = new e[0];
        this.f14824m = -1;
        this.f14825n = -1;
        this.f14823l = -1;
        this.f14820h = -9223372036854775807L;
    }

    public final void a(long j7, long j8) {
        this.f14821j = -1;
        this.f14822k = null;
        for (e eVar : this.i) {
            if (eVar.f14842j == 0) {
                eVar.f14841h = 0;
            } else {
                eVar.f14841h = eVar.f14845m[z.e(eVar.f14844l, j7, true)];
            }
        }
        if (j7 != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    public final o c() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x038d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r21, M0.C0132u r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = 1
            long r4 = r0.f14821j
            r6 = 0
            r7 = -1
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x002f
            r9 = r1
            p1.l r9 = (p1.l) r9
            long r9 = r9.f14408X
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x001f
            r11 = 262144(0x40000, double:1.295163E-318)
            long r11 = r11 + r9
            int r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0022
        L_0x001f:
            r9 = r22
            goto L_0x002b
        L_0x0022:
            long r4 = r4 - r9
            int r5 = (int) r4
            r4 = r1
            p1.l r4 = (p1.l) r4
            r4.m(r5)
            goto L_0x002f
        L_0x002b:
            r9.f3050a = r4
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            r0.f14821j = r7
            if (r4 == 0) goto L_0x0035
            return r3
        L_0x0035:
            int r4 = r0.e
            r5 = 0
            r13 = 16
            r14 = 1769369453(0x69766f6d, float:1.8620122E25)
            r15 = 8
            r9 = 1414744396(0x5453494c, float:3.62987127E12)
            r16 = 8
            r10 = 12
            F2.h r11 = r0.f14815b
            P0.r r2 = r0.f14814a
            switch(r4) {
                case 0: goto L_0x0422;
                case 1: goto L_0x03c3;
                case 2: goto L_0x02ae;
                case 3: goto L_0x021c;
                case 4: goto L_0x01f2;
                case 5: goto L_0x010f;
                case 6: goto L_0x0053;
                default: goto L_0x004d;
            }
        L_0x004d:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0053:
            r4 = r1
            p1.l r4 = (p1.l) r4
            long r7 = r4.f14408X
            long r11 = r0.f14825n
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0061
            r6 = -1
            goto L_0x010e
        L_0x0061:
            r1.e r4 = r0.f14822k
            if (r4 == 0) goto L_0x00a7
            int r2 = r4.f14840g
            p1.G r7 = r4.f14835a
            int r1 = r7.b(r1, r2, r6)
            int r2 = r2 - r1
            r4.f14840g = r2
            if (r2 != 0) goto L_0x0074
            r1 = 1
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            if (r1 == 0) goto L_0x00a2
            int r2 = r4.f14839f
            if (r2 <= 0) goto L_0x009d
            int r2 = r4.f14841h
            long r7 = r4.f14838d
            long r9 = (long) r2
            long r7 = r7 * r9
            int r9 = r4.e
            long r9 = (long) r9
            long r12 = r7 / r9
            int[] r7 = r4.f14845m
            int r2 = java.util.Arrays.binarySearch(r7, r2)
            if (r2 < 0) goto L_0x0091
            r14 = 1
            goto L_0x0092
        L_0x0091:
            r14 = 0
        L_0x0092:
            int r15 = r4.f14839f
            r16 = 0
            r17 = 0
            p1.G r11 = r4.f14835a
            r11.e(r12, r14, r15, r16, r17)
        L_0x009d:
            int r2 = r4.f14841h
            int r2 = r2 + r3
            r4.f14841h = r2
        L_0x00a2:
            if (r1 == 0) goto L_0x010e
            r0.f14822k = r5
            goto L_0x010e
        L_0x00a7:
            p1.l r1 = (p1.l) r1
            long r7 = r1.f14408X
            r11 = 1
            long r7 = r7 & r11
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x00b5
            r1.m(r3)
        L_0x00b5:
            byte[] r4 = r2.f3732a
            r1.r(r4, r6, r10, r6)
            r2.H(r6)
            int r4 = r2.k()
            if (r4 != r9) goto L_0x00d4
            r2.H(r15)
            int r2 = r2.k()
            if (r2 != r14) goto L_0x00ce
            r15 = 12
        L_0x00ce:
            r1.m(r15)
            r1.f14410Z = r6
            goto L_0x010e
        L_0x00d4:
            int r2 = r2.k()
            r7 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r4 != r7) goto L_0x00e6
            long r3 = r1.f14408X
            long r1 = (long) r2
            long r3 = r3 + r1
            long r3 = r3 + r16
            r0.f14821j = r3
            goto L_0x010e
        L_0x00e6:
            r1.m(r15)
            r1.f14410Z = r6
            r1.e[] r7 = r0.i
            int r8 = r7.length
            r9 = 0
        L_0x00ef:
            if (r9 >= r8) goto L_0x00ff
            r10 = r7[r9]
            int r11 = r10.f14836b
            if (r11 == r4) goto L_0x00fe
            int r11 = r10.f14837c
            if (r11 != r4) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            int r9 = r9 + r3
            goto L_0x00ef
        L_0x00fe:
            r5 = r10
        L_0x00ff:
            if (r5 != 0) goto L_0x0108
            long r3 = r1.f14408X
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.f14821j = r3
            goto L_0x010e
        L_0x0108:
            r5.f14839f = r2
            r5.f14840g = r2
            r0.f14822k = r5
        L_0x010e:
            return r6
        L_0x010f:
            P0.r r2 = new P0.r
            int r4 = r0.f14826o
            r2.<init>((int) r4)
            byte[] r4 = r2.f3732a
            int r9 = r0.f14826o
            p1.l r1 = (p1.l) r1
            r1.c(r4, r6, r9, r6)
            int r1 = r2.a()
            if (r1 >= r13) goto L_0x0128
            r9 = 0
            goto L_0x0140
        L_0x0128:
            int r1 = r2.f3733b
            r2.I(r15)
            int r4 = r2.k()
            long r14 = (long) r4
            long r9 = r0.f14824m
            int r4 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x013b
            r9 = 0
            goto L_0x013d
        L_0x013b:
            long r9 = r9 + r16
        L_0x013d:
            r2.H(r1)
        L_0x0140:
            int r1 = r2.a()
            if (r1 < r13) goto L_0x01bc
            int r1 = r2.k()
            int r4 = r2.k()
            int r11 = r2.k()
            long r14 = (long) r11
            long r14 = r14 + r9
            r2.k()
            r1.e[] r11 = r0.i
            int r5 = r11.length
        L_0x015a:
            if (r6 >= r5) goto L_0x016b
            r12 = r11[r6]
            int r7 = r12.f14836b
            if (r7 == r1) goto L_0x016c
            int r7 = r12.f14837c
            if (r7 != r1) goto L_0x0167
            goto L_0x016c
        L_0x0167:
            int r6 = r6 + r3
            r7 = -1
            goto L_0x015a
        L_0x016b:
            r12 = 0
        L_0x016c:
            if (r12 != 0) goto L_0x0173
        L_0x016e:
            r5 = 0
            r6 = 0
            r7 = -1
            goto L_0x0140
        L_0x0173:
            r1 = r4 & 16
            if (r1 != r13) goto L_0x0179
            r1 = 1
            goto L_0x017a
        L_0x0179:
            r1 = 0
        L_0x017a:
            long r4 = r12.f14843k
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0184
            r12.f14843k = r14
        L_0x0184:
            if (r1 == 0) goto L_0x01b6
            int r1 = r12.f14842j
            int[] r4 = r12.f14845m
            int r4 = r4.length
            if (r1 != r4) goto L_0x01a7
            long[] r1 = r12.f14844l
            int r4 = r1.length
            r5 = 3
            int r4 = r4 * 3
            r6 = 2
            int r4 = r4 / r6
            long[] r1 = java.util.Arrays.copyOf(r1, r4)
            r12.f14844l = r1
            int[] r1 = r12.f14845m
            int r4 = r1.length
            int r4 = r4 * 3
            int r4 = r4 / r6
            int[] r1 = java.util.Arrays.copyOf(r1, r4)
            r12.f14845m = r1
        L_0x01a7:
            long[] r1 = r12.f14844l
            int r4 = r12.f14842j
            r1[r4] = r14
            int[] r1 = r12.f14845m
            int r5 = r12.i
            r1[r4] = r5
            int r4 = r4 + r3
            r12.f14842j = r4
        L_0x01b6:
            int r1 = r12.i
            int r1 = r1 + r3
            r12.i = r1
            goto L_0x016e
        L_0x01bc:
            r1.e[] r1 = r0.i
            int r2 = r1.length
            r4 = 0
        L_0x01c0:
            if (r4 >= r2) goto L_0x01da
            r5 = r1[r4]
            long[] r6 = r5.f14844l
            int r7 = r5.f14842j
            long[] r6 = java.util.Arrays.copyOf(r6, r7)
            r5.f14844l = r6
            int[] r6 = r5.f14845m
            int r7 = r5.f14842j
            int[] r6 = java.util.Arrays.copyOf(r6, r7)
            r5.f14845m = r6
            int r4 = r4 + r3
            goto L_0x01c0
        L_0x01da:
            r0.f14827p = r3
            p1.q r1 = r0.f14818f
            p1.s r2 = new p1.s
            long r3 = r0.f14820h
            r5 = 2
            r2.<init>(r0, r3, r5)
            r1.l(r2)
            r1 = 6
            r0.e = r1
            long r1 = r0.f14824m
            r0.f14821j = r1
            r3 = 0
            return r3
        L_0x01f2:
            r3 = 0
            byte[] r4 = r2.f3732a
            r5 = r1
            p1.l r5 = (p1.l) r5
            r5.c(r4, r3, r15, r3)
            r2.H(r3)
            int r3 = r2.k()
            int r2 = r2.k()
            r4 = 829973609(0x31786469, float:3.6145826E-9)
            if (r3 != r4) goto L_0x0212
            r1 = 5
            r0.e = r1
            r0.f14826o = r2
        L_0x0210:
            r4 = 0
            goto L_0x021b
        L_0x0212:
            p1.l r1 = (p1.l) r1
            long r3 = r1.f14408X
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.f14821j = r3
            goto L_0x0210
        L_0x021b:
            return r4
        L_0x021c:
            r4 = 0
            long r5 = r0.f14824m
            r7 = -1
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0231
            r7 = r1
            p1.l r7 = (p1.l) r7
            long r7 = r7.f14408X
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x0231
            r0.f14821j = r5
            return r4
        L_0x0231:
            byte[] r5 = r2.f3732a
            r6 = r1
            p1.l r6 = (p1.l) r6
            r6.r(r5, r4, r10, r4)
            p1.l r1 = (p1.l) r1
            r1.f14410Z = r4
            r2.H(r4)
            r11.getClass()
            int r5 = r2.k()
            r11.f1527a = r5
            int r5 = r2.k()
            r11.f1528b = r5
            r11.f1529c = r4
            int r2 = r2.k()
            int r5 = r11.f1527a
            r6 = 1179011410(0x46464952, float:12690.33)
            if (r5 != r6) goto L_0x0260
            r1.m(r10)
            return r4
        L_0x0260:
            if (r5 != r9) goto L_0x0264
            if (r2 == r14) goto L_0x0266
        L_0x0264:
            r2 = 0
            goto L_0x02a3
        L_0x0266:
            long r4 = r1.f14408X
            r0.f14824m = r4
            int r2 = r11.f1528b
            long r6 = (long) r2
            long r4 = r4 + r6
            long r4 = r4 + r16
            r0.f14825n = r4
            boolean r2 = r0.f14827p
            if (r2 != 0) goto L_0x0297
            r1.c r2 = r0.f14819g
            r2.getClass()
            int r2 = r2.f14829b
            r2 = r2 & r13
            if (r2 != r13) goto L_0x0289
            r2 = 4
            r0.e = r2
            long r1 = r0.f14825n
            r0.f14821j = r1
        L_0x0287:
            r1 = 0
            return r1
        L_0x0289:
            p1.q r2 = r0.f14818f
            p1.s r4 = new p1.s
            long r5 = r0.f14820h
            r4.<init>(r5)
            r2.l(r4)
            r0.f14827p = r3
        L_0x0297:
            long r1 = r1.f14408X
            r3 = 12
            long r1 = r1 + r3
            r0.f14821j = r1
            r1 = 6
            r0.e = r1
            r2 = 0
            return r2
        L_0x02a3:
            long r3 = r1.f14408X
            int r1 = r11.f1528b
            long r5 = (long) r1
            long r3 = r3 + r5
            long r3 = r3 + r16
            r0.f14821j = r3
            return r2
        L_0x02ae:
            r2 = 0
            int r4 = r0.f14823l
            r5 = 4
            int r4 = r4 - r5
            P0.r r5 = new P0.r
            r5.<init>((int) r4)
            byte[] r6 = r5.f3732a
            p1.l r1 = (p1.l) r1
            r1.c(r6, r2, r4, r2)
            r1 = 1819436136(0x6c726468, float:1.1721368E27)
            r1.f r2 = r1.f.b(r1, r5)
            int r4 = r2.f14847b
            if (r4 != r1) goto L_0x03af
            java.lang.Class<r1.c> r1 = r1.c.class
            r1.a r1 = r2.a(r1)
            r1.c r1 = (r1.c) r1
            if (r1 == 0) goto L_0x03a7
            r0.f14819g = r1
            int r4 = r1.f14830c
            long r4 = (long) r4
            int r1 = r1.f14828a
            long r6 = (long) r1
            long r4 = r4 * r6
            r0.f14820h = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            H3.i0 r2 = r2.f14846a
            r4 = 0
            H3.M r2 = r2.listIterator(r4)
            r6 = 0
        L_0x02ed:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0393
            java.lang.Object r4 = r2.next()
            r1.a r4 = (r1.C1376a) r4
            int r5 = r4.getType()
            r7 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r5 != r7) goto L_0x02ed
            r1.f r4 = (r1.f) r4
            int r12 = r6 + 1
            java.lang.Class<r1.d> r5 = r1.d.class
            r1.a r5 = r4.a(r5)
            r1.d r5 = (r1.d) r5
            java.lang.Class<r1.g> r7 = r1.g.class
            r1.a r7 = r4.a(r7)
            r1.g r7 = (r1.g) r7
            java.lang.String r8 = "AviExtractor"
            if (r5 != 0) goto L_0x0321
            java.lang.String r4 = "Missing Stream Header"
            P0.l.B(r8, r4)
        L_0x031f:
            r4 = 0
            goto L_0x038b
        L_0x0321:
            if (r7 != 0) goto L_0x0329
            java.lang.String r4 = "Missing Stream Format"
            P0.l.B(r8, r4)
            goto L_0x031f
        L_0x0329:
            int r8 = r5.f14834d
            long r13 = (long) r8
            int r8 = r5.f14832b
            long r8 = (long) r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r15 = r8 * r10
            int r8 = r5.f14833c
            long r8 = (long) r8
            int r10 = P0.z.f3748a
            java.math.RoundingMode r19 = java.math.RoundingMode.DOWN
            r17 = r8
            long r13 = P0.z.W(r13, r15, r17, r19)
            M0.r r7 = r7.f14848a
            M0.q r8 = r7.a()
            java.lang.String r9 = java.lang.Integer.toString(r6)
            r8.f2989a = r9
            int r9 = r5.e
            if (r9 == 0) goto L_0x0353
            r8.f3000n = r9
        L_0x0353:
            java.lang.Class<r1.h> r9 = r1.h.class
            r1.a r4 = r4.a(r9)
            r1.h r4 = (r1.h) r4
            if (r4 == 0) goto L_0x0361
            java.lang.String r4 = r4.f14849a
            r8.f2990b = r4
        L_0x0361:
            java.lang.String r4 = r7.f3036n
            int r7 = M0.I.i(r4)
            if (r7 == r3) goto L_0x036c
            r4 = 2
            if (r7 != r4) goto L_0x031f
        L_0x036c:
            p1.q r4 = r0.f14818f
            p1.G r11 = r4.q(r6, r7)
            M0.r r4 = new M0.r
            r4.<init>(r8)
            r11.c(r4)
            r1.e r4 = new r1.e
            int r10 = r5.f14834d
            r5 = r4
            r8 = r13
            r5.<init>(r6, r7, r8, r10, r11)
            long r5 = r0.f14820h
            long r5 = java.lang.Math.max(r5, r13)
            r0.f14820h = r5
        L_0x038b:
            if (r4 == 0) goto L_0x0390
            r1.add(r4)
        L_0x0390:
            r6 = r12
            goto L_0x02ed
        L_0x0393:
            r4 = 0
            r1.e[] r2 = new r1.e[r4]
            java.lang.Object[] r1 = r1.toArray(r2)
            r1.e[] r1 = (r1.e[]) r1
            r0.i = r1
            p1.q r1 = r0.f14818f
            r1.g()
            r1 = 3
            r0.e = r1
            return r4
        L_0x03a7:
            java.lang.String r1 = "AviHeader not found"
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x03af:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected header list type "
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x03c3:
            byte[] r3 = r2.f3732a
            p1.l r1 = (p1.l) r1
            r4 = 0
            r1.c(r3, r4, r10, r4)
            r2.H(r4)
            r11.getClass()
            int r1 = r2.k()
            r11.f1527a = r1
            int r1 = r2.k()
            r11.f1528b = r1
            r11.f1529c = r4
            int r1 = r11.f1527a
            if (r1 != r9) goto L_0x040c
            int r1 = r2.k()
            r11.f1529c = r1
            r2 = 1819436136(0x6c726468, float:1.1721368E27)
            if (r1 != r2) goto L_0x03f6
            int r1 = r11.f1528b
            r0.f14823l = r1
            r1 = 2
            r0.e = r1
            return r4
        L_0x03f6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "hdrl expected, found: "
            r1.<init>(r2)
            int r2 = r11.f1529c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x040c:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "LIST expected, found: "
            r1.<init>(r3)
            int r3 = r11.f1527a
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        L_0x0422:
            r2 = r5
            boolean r4 = r20.h(r21)
            if (r4 == 0) goto L_0x0432
            p1.l r1 = (p1.l) r1
            r1.m(r10)
            r0.e = r3
            goto L_0x0287
        L_0x0432:
            java.lang.String r1 = "AVI Header List not found"
            M0.J r1 = M0.J.a(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.b.e(p1.p, M0.u):int");
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        r rVar = this.f14814a;
        ((l) pVar).r(rVar.f3732a, 0, 12, false);
        rVar.H(0);
        if (rVar.k() != 1179011410) {
            return false;
        }
        rVar.I(4);
        if (rVar.k() == 541677121) {
            return true;
        }
        return false;
    }

    public final void l(q qVar) {
        this.e = 0;
        if (this.f14816c) {
            qVar = new q0(qVar, (j) this.f14817d);
        }
        this.f14818f = qVar;
        this.f14821j = -1;
    }

    public final void release() {
    }
}
