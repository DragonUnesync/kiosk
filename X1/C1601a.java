package x1;

import E1.a;
import H3.M;
import H3.O;
import H3.i0;
import J1.n;
import P0.r;
import P5.E;
import java.util.List;
import p1.l;
import p1.o;
import p1.p;
import p1.q;
import p1.s;

/* renamed from: x1.a  reason: case insensitive filesystem */
public final class C1601a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final r f16234a = new r(6);

    /* renamed from: b  reason: collision with root package name */
    public q f16235b;

    /* renamed from: c  reason: collision with root package name */
    public int f16236c;

    /* renamed from: d  reason: collision with root package name */
    public int f16237d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public long f16238f = -1;

    /* renamed from: g  reason: collision with root package name */
    public a f16239g;

    /* renamed from: h  reason: collision with root package name */
    public l f16240h;
    public E i;

    /* renamed from: j  reason: collision with root package name */
    public n f16241j;

    public final void a(long j7, long j8) {
        if (j7 == 0) {
            this.f16236c = 0;
            this.f16241j = null;
        } else if (this.f16236c == 5) {
            n nVar = this.f16241j;
            nVar.getClass();
            nVar.a(j7, j8);
        }
    }

    public final void b() {
        q qVar = this.f16235b;
        qVar.getClass();
        qVar.g();
        this.f16235b.l(new s(-9223372036854775807L));
        this.f16236c = 6;
    }

    public final o c() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r26, M0.C0132u r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = 8
            r4 = -1
            r5 = 1
            r6 = 0
            int r7 = r0.f16236c
            r8 = -1
            P0.r r10 = r0.f16234a
            r11 = 4
            r12 = 2
            if (r7 == 0) goto L_0x01a6
            if (r7 == r5) goto L_0x0191
            if (r7 == r12) goto L_0x00d1
            r8 = 5
            if (r7 == r11) goto L_0x0052
            if (r7 == r8) goto L_0x0028
            r1 = 6
            if (r7 != r1) goto L_0x0022
            return r4
        L_0x0022:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0028:
            P5.E r3 = r0.i
            if (r3 == 0) goto L_0x0030
            p1.l r3 = r0.f16240h
            if (r1 == r3) goto L_0x003d
        L_0x0030:
            p1.l r1 = (p1.l) r1
            r0.f16240h = r1
            P5.E r3 = new P5.E
            long r6 = r0.f16238f
            r3.<init>(r1, r6)
            r0.i = r3
        L_0x003d:
            J1.n r1 = r0.f16241j
            r1.getClass()
            P5.E r3 = r0.i
            int r1 = r1.e(r3, r2)
            if (r1 != r5) goto L_0x0051
            long r3 = r2.f3050a
            long r5 = r0.f16238f
            long r3 = r3 + r5
            r2.f3050a = r3
        L_0x0051:
            return r1
        L_0x0052:
            r4 = r1
            p1.l r4 = (p1.l) r4
            long r12 = r4.f14408X
            long r14 = r0.f16238f
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0060
            r2.f3050a = r14
            return r5
        L_0x0060:
            byte[] r2 = r10.f3732a
            p1.l r1 = (p1.l) r1
            boolean r2 = r1.r(r2, r6, r5, r5)
            if (r2 != 0) goto L_0x006e
            r25.b()
            goto L_0x00d0
        L_0x006e:
            r1.f14410Z = r6
            J1.n r2 = r0.f16241j
            if (r2 != 0) goto L_0x007d
            J1.n r2 = new J1.n
            K1.i r4 = M1.j.f3086H
            r2.<init>(r4, r3)
            r0.f16241j = r2
        L_0x007d:
            P5.E r2 = new P5.E
            long r9 = r0.f16238f
            r2.<init>(r1, r9)
            r0.i = r2
            J1.n r1 = r0.f16241j
            boolean r1 = r1.h(r2)
            if (r1 == 0) goto L_0x00cd
            J1.n r1 = r0.f16241j
            P5.E r2 = new P5.E
            long r9 = r0.f16238f
            p1.q r4 = r0.f16235b
            r4.getClass()
            r2.<init>((long) r9, (java.lang.Object) r4, (int) r3)
            r1.l(r2)
            E1.a r1 = r0.f16239g
            r1.getClass()
            p1.q r2 = r0.f16235b
            r2.getClass()
            r3 = 1024(0x400, float:1.435E-42)
            p1.G r2 = r2.q(r3, r11)
            M0.q r3 = new M0.q
            r3.<init>()
            java.lang.String r4 = "image/jpeg"
            java.lang.String r4 = M0.I.o(r4)
            r3.f2998l = r4
            M0.H r4 = new M0.H
            M0.G[] r5 = new M0.G[r5]
            r5[r6] = r1
            r4.<init>((M0.G[]) r5)
            r3.f2997k = r4
            Q0.g.v(r3, r2)
            r0.f16236c = r8
            goto L_0x00d0
        L_0x00cd:
            r25.b()
        L_0x00d0:
            return r6
        L_0x00d1:
            int r2 = r0.f16237d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0186
            P0.r r2 = new P0.r
            int r3 = r0.e
            r2.<init>((int) r3)
            byte[] r3 = r2.f3732a
            int r7 = r0.e
            r10 = r1
            p1.l r10 = (p1.l) r10
            r10.c(r3, r6, r7, r6)
            E1.a r3 = r0.f16239g
            if (r3 != 0) goto L_0x0184
            java.lang.String r3 = "http://ns.adobe.com/xap/1.0/"
            java.lang.String r7 = r2.q()
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0184
            java.lang.String r2 = r2.q()
            if (r2 == 0) goto L_0x0184
            p1.l r1 = (p1.l) r1
            long r10 = r1.f14407W
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x010a
        L_0x0107:
            r1 = 0
            goto L_0x017c
        L_0x010a:
            P5.E r2 = x1.d.a(r2)     // Catch:{ J | NumberFormatException | XmlPullParserException -> 0x010f }
            goto L_0x0117
        L_0x010f:
            java.lang.String r2 = "MotionPhotoXmpParser"
            java.lang.String r3 = "Ignoring unexpected XMP metadata"
            P0.l.B(r2, r3)
            r2 = 0
        L_0x0117:
            if (r2 != 0) goto L_0x011a
            goto L_0x0107
        L_0x011a:
            java.lang.Object r3 = r2.f3810W
            H3.i0 r3 = (H3.i0) r3
            int r7 = r3.f2075X
            if (r7 >= r12) goto L_0x0123
            goto L_0x0107
        L_0x0123:
            int r7 = r7 - r5
            r13 = r8
            r15 = r13
            r19 = r15
            r21 = r19
            r5 = 0
        L_0x012b:
            if (r7 < 0) goto L_0x0161
            java.lang.Object r12 = r3.get(r7)
            x1.b r12 = (x1.b) r12
            java.lang.String r1 = r12.f16242a
            java.lang.String r6 = "video/mp4"
            boolean r1 = r6.equals(r1)
            r1 = r1 | r5
            if (r7 != 0) goto L_0x0149
            long r5 = r12.f16244c
            long r10 = r10 - r5
            r5 = 0
        L_0x0143:
            r23 = r5
            r5 = r10
            r10 = r23
            goto L_0x014e
        L_0x0149:
            long r5 = r12.f16243b
            long r5 = r10 - r5
            goto L_0x0143
        L_0x014e:
            if (r1 == 0) goto L_0x0159
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x0159
            long r21 = r5 - r10
            r19 = r10
            r1 = 0
        L_0x0159:
            if (r7 != 0) goto L_0x015d
            r15 = r5
            r13 = r10
        L_0x015d:
            int r7 = r7 + r4
            r5 = r1
            r6 = 0
            goto L_0x012b
        L_0x0161:
            int r1 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0107
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0107
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0107
            int r1 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0172
            goto L_0x0107
        L_0x0172:
            E1.a r1 = new E1.a
            long r2 = r2.f3809V
            r12 = r1
            r17 = r2
            r12.<init>(r13, r15, r17, r19, r21)
        L_0x017c:
            r0.f16239g = r1
            if (r1 == 0) goto L_0x0184
            long r1 = r1.f1319X
            r0.f16238f = r1
        L_0x0184:
            r2 = 0
            goto L_0x018e
        L_0x0186:
            int r2 = r0.e
            p1.l r1 = (p1.l) r1
            r1.m(r2)
            goto L_0x0184
        L_0x018e:
            r0.f16236c = r2
            return r2
        L_0x0191:
            r2 = 0
            r10.E(r12)
            byte[] r3 = r10.f3732a
            p1.l r1 = (p1.l) r1
            r1.c(r3, r2, r12, r2)
            int r1 = r10.B()
            int r1 = r1 - r12
            r0.e = r1
            r0.f16236c = r12
            return r2
        L_0x01a6:
            r2 = 0
            r10.E(r12)
            byte[] r3 = r10.f3732a
            p1.l r1 = (p1.l) r1
            r1.c(r3, r2, r12, r2)
            int r1 = r10.B()
            r0.f16237d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01ca
            long r1 = r0.f16238f
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01c6
            r0.f16236c = r11
        L_0x01c4:
            r1 = 0
            goto L_0x01dc
        L_0x01c6:
            r25.b()
            goto L_0x01c4
        L_0x01ca:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01d4
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01c4
        L_0x01d4:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01c4
            r0.f16236c = r5
            goto L_0x01c4
        L_0x01dc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C1601a.e(p1.p, M0.u):int");
    }

    public final List f() {
        M m8 = O.f2026V;
        return i0.f2073Y;
    }

    public final boolean h(p pVar) {
        l lVar = (l) pVar;
        r rVar = this.f16234a;
        rVar.E(2);
        lVar.r(rVar.f3732a, 0, 2, false);
        if (rVar.B() != 65496) {
            return false;
        }
        rVar.E(2);
        lVar.r(rVar.f3732a, 0, 2, false);
        int B8 = rVar.B();
        this.f16237d = B8;
        if (B8 == 65504) {
            rVar.E(2);
            lVar.r(rVar.f3732a, 0, 2, false);
            lVar.b(rVar.B() - 2, false);
            rVar.E(2);
            lVar.r(rVar.f3732a, 0, 2, false);
            this.f16237d = rVar.B();
        }
        if (this.f16237d != 65505) {
            return false;
        }
        lVar.b(2, false);
        rVar.E(6);
        lVar.r(rVar.f3732a, 0, 6, false);
        if (rVar.x() == 1165519206 && rVar.B() == 0) {
            return true;
        }
        return false;
    }

    public final void l(q qVar) {
        this.f16235b = qVar;
    }

    public final void release() {
        n nVar = this.f16241j;
        if (nVar != null) {
            nVar.getClass();
        }
    }
}
