package V1;

import B.q0;
import P0.l;
import P0.r;
import P0.z;
import Q0.q;
import Q0.t;
import T0.C;
import p1.G;

public final class s implements i {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f5885a;

    /* renamed from: b  reason: collision with root package name */
    public String f5886b;

    /* renamed from: c  reason: collision with root package name */
    public G f5887c;

    /* renamed from: d  reason: collision with root package name */
    public r f5888d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f5889f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final C f5890g = new C(32);

    /* renamed from: h  reason: collision with root package name */
    public final C f5891h = new C(33);
    public final C i = new C(34);

    /* renamed from: j  reason: collision with root package name */
    public final C f5892j = new C(39);

    /* renamed from: k  reason: collision with root package name */
    public final C f5893k = new C(40);

    /* renamed from: l  reason: collision with root package name */
    public long f5894l;

    /* renamed from: m  reason: collision with root package name */
    public long f5895m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public final r f5896n = new r();

    public s(q0 q0Var) {
        this.f5885a = q0Var;
    }

    public final void a() {
        this.f5894l = 0;
        this.f5895m = -9223372036854775807L;
        q.a(this.f5889f);
        this.f5890g.g();
        this.f5891h.g();
        this.i.g();
        this.f5892j.g();
        this.f5893k.g();
        ((t) this.f5885a.f302X).d(0);
        r rVar = this.f5888d;
        if (rVar != null) {
            rVar.f5878f = false;
            rVar.f5879g = false;
            rVar.f5880h = false;
            rVar.i = false;
            rVar.f5881j = false;
        }
    }

    public final void b(byte[] bArr, int i8, int i9) {
        boolean z;
        r rVar = this.f5888d;
        if (rVar.f5878f) {
            int i10 = rVar.f5877d;
            int i11 = (i8 + 2) - i10;
            if (i11 < i9) {
                if ((bArr[i11] & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                rVar.f5879g = z;
                rVar.f5878f = false;
            } else {
                rVar.f5877d = (i9 - i8) + i10;
            }
        }
        if (!this.e) {
            this.f5890g.a(bArr, i8, i9);
            this.f5891h.a(bArr, i8, i9);
            this.i.a(bArr, i8, i9);
        }
        this.f5892j.a(bArr, i8, i9);
        this.f5893k.a(bArr, i8, i9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x025a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(P0.r r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = 3
            p1.G r3 = r0.f5887c
            P0.l.k(r3)
            int r3 = P0.z.f3748a
        L_0x000c:
            int r3 = r38.a()
            if (r3 <= 0) goto L_0x026f
            int r3 = r1.f3733b
            int r4 = r1.f3734c
            byte[] r5 = r1.f3732a
            long r6 = r0.f5894l
            int r8 = r38.a()
            long r8 = (long) r8
            long r6 = r6 + r8
            r0.f5894l = r6
            p1.G r6 = r0.f5887c
            int r7 = r38.a()
            r6.a(r7, r1)
        L_0x002b:
            if (r3 >= r4) goto L_0x026b
            boolean[] r6 = r0.f5889f
            int r6 = Q0.q.b(r5, r3, r4, r6)
            if (r6 != r4) goto L_0x0039
            r0.b(r5, r3, r4)
            return
        L_0x0039:
            int r7 = r6 + 3
            byte r8 = r5[r7]
            r8 = r8 & 126(0x7e, float:1.77E-43)
            r9 = 1
            int r8 = r8 >> r9
            int r10 = r6 - r3
            if (r10 <= 0) goto L_0x0048
            r0.b(r5, r3, r6)
        L_0x0048:
            int r3 = r4 - r6
            long r11 = r0.f5894l
            long r13 = (long) r3
            long r11 = r11 - r13
            r6 = 0
            if (r10 >= 0) goto L_0x0053
            int r10 = -r10
            goto L_0x0054
        L_0x0053:
            r10 = 0
        L_0x0054:
            long r13 = r0.f5895m
            V1.r r15 = r0.f5888d
            boolean r2 = r0.e
            boolean r9 = r15.f5881j
            if (r9 == 0) goto L_0x006a
            boolean r9 = r15.f5879g
            if (r9 == 0) goto L_0x006a
            boolean r2 = r15.f5876c
            r15.f5884m = r2
            r15.f5881j = r6
        L_0x0068:
            r2 = r7
            goto L_0x0093
        L_0x006a:
            boolean r9 = r15.f5880h
            if (r9 != 0) goto L_0x0072
            boolean r9 = r15.f5879g
            if (r9 == 0) goto L_0x0068
        L_0x0072:
            if (r2 == 0) goto L_0x0083
            boolean r2 = r15.i
            if (r2 == 0) goto L_0x0083
            r2 = r7
            long r6 = r15.f5875b
            long r6 = r11 - r6
            int r7 = (int) r6
            int r7 = r7 + r3
            r15.a(r7)
            goto L_0x0084
        L_0x0083:
            r2 = r7
        L_0x0084:
            long r6 = r15.f5875b
            r15.f5882k = r6
            long r6 = r15.e
            r15.f5883l = r6
            boolean r6 = r15.f5876c
            r15.f5884m = r6
            r6 = 1
            r15.i = r6
        L_0x0093:
            boolean r6 = r0.e
            B.q0 r7 = r0.f5885a
            T0.C r15 = r0.i
            T0.C r9 = r0.f5891h
            T0.C r1 = r0.f5890g
            java.lang.Object r7 = r7.f302X
            Q0.t r7 = (Q0.t) r7
            if (r6 != 0) goto L_0x0197
            r1.e(r10)
            r9.e(r10)
            r15.e(r10)
            boolean r6 = r1.f4611d
            if (r6 == 0) goto L_0x0197
            boolean r6 = r9.f4611d
            if (r6 == 0) goto L_0x0197
            boolean r6 = r15.f4611d
            if (r6 == 0) goto L_0x0197
            java.lang.String r6 = r0.f5886b
            r17 = r2
            int r2 = r1.e
            r18 = r4
            int r4 = r9.e
            int r4 = r4 + r2
            r19 = r5
            int r5 = r15.e
            int r4 = r4 + r5
            byte[] r4 = new byte[r4]
            java.lang.Object r5 = r1.f4612f
            byte[] r5 = (byte[]) r5
            r20 = r3
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r4, r3, r2)
            java.lang.Object r2 = r9.f4612f
            byte[] r2 = (byte[]) r2
            int r5 = r1.e
            r16 = r8
            int r8 = r9.e
            java.lang.System.arraycopy(r2, r3, r4, r5, r8)
            java.lang.Object r2 = r15.f4612f
            byte[] r2 = (byte[]) r2
            int r5 = r1.e
            int r8 = r9.e
            int r5 = r5 + r8
            int r8 = r15.e
            java.lang.System.arraycopy(r2, r3, r4, r5, r8)
            java.lang.Object r3 = r9.f4612f
            byte[] r3 = (byte[]) r3
            int r5 = r9.e
            r8 = 0
            r2 = 3
            Q0.m r3 = Q0.q.g(r3, r2, r5, r8)
            Q0.i r5 = r3.f4038a
            if (r5 == 0) goto L_0x0122
            int[] r8 = r5.e
            int r2 = r5.f4030f
            r27 = r15
            int r15 = r5.f4026a
            r28 = r9
            boolean r9 = r5.f4027b
            r29 = r1
            int r1 = r5.f4028c
            int r5 = r5.f4029d
            r21 = r15
            r22 = r9
            r23 = r1
            r24 = r5
            r25 = r8
            r26 = r2
            java.lang.String r8 = P0.a.b(r21, r22, r23, r24, r25, r26)
            goto L_0x0128
        L_0x0122:
            r29 = r1
            r28 = r9
            r27 = r15
        L_0x0128:
            M0.q r1 = new M0.q
            r1.<init>()
            r1.f2989a = r6
            java.lang.String r2 = "video/hevc"
            java.lang.String r2 = M0.I.o(r2)
            r1.f2999m = r2
            r1.f2996j = r8
            int r2 = r3.f4041d
            r1.f3006t = r2
            int r2 = r3.e
            r1.f3007u = r2
            int r2 = r3.f4039b
            int r34 = r2 + 8
            int r2 = r3.f4040c
            int r35 = r2 + 8
            M0.i r2 = new M0.i
            int r5 = r3.f4045j
            r36 = 0
            int r6 = r3.f4044h
            int r8 = r3.i
            r30 = r2
            r31 = r6
            r32 = r8
            r33 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r1.f2978A = r2
            float r2 = r3.f4042f
            r1.f3010x = r2
            int r2 = r3.f4043g
            r1.f3001o = r2
            java.util.List r2 = java.util.Collections.singletonList(r4)
            r1.f3002p = r2
            M0.r r2 = new M0.r
            r2.<init>(r1)
            p1.G r1 = r0.f5887c
            r1.c(r2)
            r1 = -1
            int r2 = r2.f3038p
            if (r2 == r1) goto L_0x0191
            r7.getClass()
            if (r2 < 0) goto L_0x0184
            r1 = 1
            goto L_0x0185
        L_0x0184:
            r1 = 0
        L_0x0185:
            P0.l.j(r1)
            r7.f4074a = r2
            r7.d(r2)
            r1 = 1
            r0.e = r1
            goto L_0x01a7
        L_0x0191:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0197:
            r29 = r1
            r17 = r2
            r20 = r3
            r18 = r4
            r19 = r5
            r16 = r8
            r28 = r9
            r27 = r15
        L_0x01a7:
            T0.C r1 = r0.f5892j
            boolean r2 = r1.e(r10)
            r3 = 5
            P0.r r4 = r0.f5896n
            if (r2 == 0) goto L_0x01c9
            java.lang.Object r2 = r1.f4612f
            byte[] r2 = (byte[]) r2
            int r5 = r1.e
            int r2 = Q0.q.k(r5, r2)
            java.lang.Object r5 = r1.f4612f
            byte[] r5 = (byte[]) r5
            r4.F(r2, r5)
            r4.I(r3)
            r7.a(r13, r4)
        L_0x01c9:
            T0.C r2 = r0.f5893k
            boolean r5 = r2.e(r10)
            if (r5 == 0) goto L_0x01e8
            java.lang.Object r5 = r2.f4612f
            byte[] r5 = (byte[]) r5
            int r6 = r2.e
            int r5 = Q0.q.k(r6, r5)
            java.lang.Object r6 = r2.f4612f
            byte[] r6 = (byte[]) r6
            r4.F(r5, r6)
            r4.I(r3)
            r7.a(r13, r4)
        L_0x01e8:
            long r3 = r0.f5895m
            V1.r r5 = r0.f5888d
            boolean r6 = r0.e
            r7 = 0
            r5.f5879g = r7
            r5.f5880h = r7
            r5.e = r3
            r5.f5877d = r7
            r5.f5875b = r11
            r4 = 32
            r7 = r16
            if (r7 < r4) goto L_0x0203
            r8 = 40
            if (r7 != r8) goto L_0x0206
        L_0x0203:
            r4 = 1
            r6 = 0
            goto L_0x022e
        L_0x0206:
            boolean r8 = r5.i
            if (r8 == 0) goto L_0x0219
            boolean r8 = r5.f5881j
            if (r8 != 0) goto L_0x0219
            if (r6 == 0) goto L_0x0215
            r6 = r20
            r5.a(r6)
        L_0x0215:
            r6 = 0
            r5.i = r6
            goto L_0x021a
        L_0x0219:
            r6 = 0
        L_0x021a:
            if (r4 > r7) goto L_0x0220
            r3 = 35
            if (r7 <= r3) goto L_0x0224
        L_0x0220:
            r3 = 39
            if (r7 != r3) goto L_0x022d
        L_0x0224:
            boolean r3 = r5.f5881j
            r4 = 1
            r3 = r3 ^ r4
            r5.f5880h = r3
            r5.f5881j = r4
            goto L_0x022e
        L_0x022d:
            r4 = 1
        L_0x022e:
            r3 = 16
            if (r7 < r3) goto L_0x0238
            r3 = 21
            if (r7 > r3) goto L_0x0238
            r3 = 1
            goto L_0x0239
        L_0x0238:
            r3 = 0
        L_0x0239:
            r5.f5876c = r3
            if (r3 != 0) goto L_0x0244
            r3 = 9
            if (r7 > r3) goto L_0x0242
            goto L_0x0244
        L_0x0242:
            r9 = 0
            goto L_0x0245
        L_0x0244:
            r9 = 1
        L_0x0245:
            r5.f5878f = r9
            boolean r3 = r0.e
            if (r3 != 0) goto L_0x025a
            r3 = r29
            r3.h(r7)
            r3 = r28
            r3.h(r7)
            r3 = r27
            r3.h(r7)
        L_0x025a:
            r1.h(r7)
            r2.h(r7)
            r1 = r38
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = 3
            goto L_0x002b
        L_0x026b:
            r1 = r38
            goto L_0x000c
        L_0x026f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.s.e(P0.r):void");
    }

    public final void f(boolean z) {
        l.k(this.f5887c);
        int i8 = z.f3748a;
        if (z) {
            ((t) this.f5885a.f302X).d(0);
            r rVar = this.f5888d;
            long j7 = this.f5894l;
            rVar.f5884m = rVar.f5876c;
            rVar.a((int) (j7 - rVar.f5875b));
            rVar.f5882k = rVar.f5875b;
            rVar.f5875b = j7;
            rVar.a(0);
            rVar.i = false;
        }
    }

    public final void g(int i8, long j7) {
        this.f5895m = j7;
    }

    public final void h(p1.q qVar, G g8) {
        g8.c();
        g8.d();
        this.f5886b = (String) g8.e;
        g8.d();
        G q7 = qVar.q(g8.f5716c, 2);
        this.f5887c = q7;
        this.f5888d = new r(q7);
        this.f5885a.k(qVar, g8);
    }
}
