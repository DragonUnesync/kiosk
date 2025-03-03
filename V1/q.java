package V1;

import B.q0;
import P0.l;
import P0.r;
import P0.z;
import Q0.t;
import T0.C;
import p1.F;
import p1.G;

public final class q implements i {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f5861a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5862b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5863c;

    /* renamed from: d  reason: collision with root package name */
    public final C f5864d = new C(7);
    public final C e = new C(8);

    /* renamed from: f  reason: collision with root package name */
    public final C f5865f = new C(6);

    /* renamed from: g  reason: collision with root package name */
    public long f5866g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f5867h = new boolean[3];
    public String i;

    /* renamed from: j  reason: collision with root package name */
    public G f5868j;

    /* renamed from: k  reason: collision with root package name */
    public p f5869k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5870l;

    /* renamed from: m  reason: collision with root package name */
    public long f5871m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5872n;

    /* renamed from: o  reason: collision with root package name */
    public final r f5873o = new r();

    public q(q0 q0Var, boolean z, boolean z6) {
        this.f5861a = q0Var;
        this.f5862b = z;
        this.f5863c = z6;
    }

    public final void a() {
        this.f5866g = 0;
        this.f5872n = false;
        this.f5871m = -9223372036854775807L;
        Q0.q.a(this.f5867h);
        this.f5864d.g();
        this.e.g();
        this.f5865f.g();
        ((t) this.f5861a.f302X).d(0);
        p pVar = this.f5869k;
        if (pVar != null) {
            pVar.f5852k = false;
            pVar.f5856o = false;
            o oVar = pVar.f5855n;
            oVar.f5831b = false;
            oVar.f5830a = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(byte[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r0.f5870l
            if (r4 == 0) goto L_0x0012
            V1.p r4 = r0.f5869k
            boolean r4 = r4.f5846c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            T0.C r4 = r0.f5864d
            r4.a(r1, r2, r3)
            T0.C r4 = r0.e
            r4.a(r1, r2, r3)
        L_0x001c:
            T0.C r4 = r0.f5865f
            r4.a(r1, r2, r3)
            V1.p r4 = r0.f5869k
            boolean r5 = r4.f5852k
            if (r5 != 0) goto L_0x0029
            goto L_0x018e
        L_0x0029:
            int r3 = r3 - r2
            byte[] r5 = r4.f5849g
            int r6 = r5.length
            int r7 = r4.f5850h
            int r7 = r7 + r3
            r8 = 2
            if (r6 >= r7) goto L_0x003b
            int r7 = r7 * 2
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.f5849g = r5
        L_0x003b:
            byte[] r5 = r4.f5849g
            int r6 = r4.f5850h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.f5850h
            int r1 = r1 + r3
            r4.f5850h = r1
            byte[] r2 = r4.f5849g
            N1.f r3 = r4.f5848f
            r3.f3344b = r2
            r2 = 0
            r3.f3346d = r2
            r3.f3345c = r1
            r3.e = r2
            r3.a()
            r1 = 8
            boolean r1 = r3.d(r1)
            if (r1 != 0) goto L_0x0061
            goto L_0x018e
        L_0x0061:
            r3.t()
            int r1 = r3.i(r8)
            r5 = 5
            r3.u(r5)
            boolean r6 = r3.e()
            if (r6 != 0) goto L_0x0074
            goto L_0x018e
        L_0x0074:
            r3.m()
            boolean r6 = r3.e()
            if (r6 != 0) goto L_0x007f
            goto L_0x018e
        L_0x007f:
            int r6 = r3.m()
            boolean r7 = r4.f5846c
            r9 = 1
            if (r7 != 0) goto L_0x0092
            r4.f5852k = r2
            V1.o r1 = r4.f5855n
            r1.e = r6
            r1.f5831b = r9
            goto L_0x018e
        L_0x0092:
            boolean r7 = r3.e()
            if (r7 != 0) goto L_0x009a
            goto L_0x018e
        L_0x009a:
            int r7 = r3.m()
            android.util.SparseArray r10 = r4.e
            int r11 = r10.indexOfKey(r7)
            if (r11 >= 0) goto L_0x00aa
            r4.f5852k = r2
            goto L_0x018e
        L_0x00aa:
            java.lang.Object r10 = r10.get(r7)
            Q0.o r10 = (Q0.o) r10
            android.util.SparseArray r11 = r4.f5847d
            int r12 = r10.f4049a
            java.lang.Object r11 = r11.get(r12)
            Q0.p r11 = (Q0.p) r11
            boolean r12 = r11.f4058j
            if (r12 == 0) goto L_0x00c9
            boolean r12 = r3.d(r8)
            if (r12 != 0) goto L_0x00c6
            goto L_0x018e
        L_0x00c6:
            r3.u(r8)
        L_0x00c9:
            int r8 = r11.f4060l
            boolean r12 = r3.d(r8)
            if (r12 != 0) goto L_0x00d3
            goto L_0x018e
        L_0x00d3:
            int r8 = r3.i(r8)
            boolean r12 = r11.f4059k
            if (r12 != 0) goto L_0x00fa
            boolean r12 = r3.d(r9)
            if (r12 != 0) goto L_0x00e3
            goto L_0x018e
        L_0x00e3:
            boolean r12 = r3.h()
            if (r12 == 0) goto L_0x00f7
            boolean r13 = r3.d(r9)
            if (r13 != 0) goto L_0x00f1
            goto L_0x018e
        L_0x00f1:
            boolean r13 = r3.h()
            r14 = 1
            goto L_0x00fc
        L_0x00f7:
            r13 = 0
            r14 = 0
            goto L_0x00fc
        L_0x00fa:
            r12 = 0
            goto L_0x00f7
        L_0x00fc:
            int r15 = r4.i
            if (r15 != r5) goto L_0x0102
            r5 = 1
            goto L_0x0103
        L_0x0102:
            r5 = 0
        L_0x0103:
            if (r5 == 0) goto L_0x0112
            boolean r15 = r3.e()
            if (r15 != 0) goto L_0x010d
            goto L_0x018e
        L_0x010d:
            int r15 = r3.m()
            goto L_0x0113
        L_0x0112:
            r15 = 0
        L_0x0113:
            boolean r10 = r10.f4050b
            int r2 = r11.f4061m
            if (r2 != 0) goto L_0x013e
            int r2 = r11.f4062n
            boolean r16 = r3.d(r2)
            if (r16 != 0) goto L_0x0123
            goto L_0x018e
        L_0x0123:
            int r2 = r3.i(r2)
            if (r10 == 0) goto L_0x013a
            if (r12 != 0) goto L_0x013a
            boolean r10 = r3.e()
            if (r10 != 0) goto L_0x0132
            goto L_0x018e
        L_0x0132:
            int r3 = r3.n()
            r10 = r3
            r3 = 0
            r9 = 0
            goto L_0x0168
        L_0x013a:
            r3 = 0
        L_0x013b:
            r9 = 0
            r10 = 0
            goto L_0x0168
        L_0x013e:
            if (r2 != r9) goto L_0x0166
            boolean r2 = r11.f4063o
            if (r2 != 0) goto L_0x0166
            boolean r2 = r3.e()
            if (r2 != 0) goto L_0x014b
            goto L_0x018e
        L_0x014b:
            int r2 = r3.n()
            if (r10 == 0) goto L_0x0163
            if (r12 != 0) goto L_0x0163
            boolean r10 = r3.e()
            if (r10 != 0) goto L_0x015a
            goto L_0x018e
        L_0x015a:
            int r3 = r3.n()
            r9 = r3
            r10 = 0
            r3 = r2
            r2 = 0
            goto L_0x0168
        L_0x0163:
            r3 = r2
            r2 = 0
            goto L_0x013b
        L_0x0166:
            r2 = 0
            goto L_0x013a
        L_0x0168:
            V1.o r0 = r4.f5855n
            r0.f5832c = r11
            r0.f5833d = r1
            r0.e = r6
            r0.f5834f = r8
            r0.f5835g = r7
            r0.f5836h = r12
            r0.i = r14
            r0.f5837j = r13
            r0.f5838k = r5
            r0.f5839l = r15
            r0.f5840m = r2
            r0.f5841n = r10
            r0.f5842o = r3
            r0.f5843p = r9
            r1 = 1
            r0.f5830a = r1
            r0.f5831b = r1
            r0 = 0
            r4.f5852k = r0
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.q.b(byte[], int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02da, code lost:
        if (r2 != 1) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x024c, code lost:
        if (r6.f5841n != r7.f5841n) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025d, code lost:
        if (r6.f5843p != r7.f5843p) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x026b, code lost:
        if (r6.f5839l != r7.f5839l) goto L_0x0270;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02fc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(P0.r r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = 3
            p1.G r3 = r0.f5868j
            P0.l.k(r3)
            int r3 = P0.z.f3748a
            int r3 = r1.f3733b
            int r4 = r1.f3734c
            byte[] r5 = r1.f3732a
            long r6 = r0.f5866g
            int r8 = r33.a()
            long r8 = (long) r8
            long r6 = r6 + r8
            r0.f5866g = r6
            p1.G r6 = r0.f5868j
            int r7 = r33.a()
            r6.a(r7, r1)
        L_0x0025:
            boolean[] r1 = r0.f5867h
            int r1 = Q0.q.b(r5, r3, r4, r1)
            if (r1 != r4) goto L_0x0031
            r0.b(r5, r3, r4)
            return
        L_0x0031:
            int r6 = r1 + 3
            byte r7 = r5[r6]
            r7 = r7 & 31
            int r8 = r1 - r3
            if (r8 <= 0) goto L_0x003e
            r0.b(r5, r3, r1)
        L_0x003e:
            int r1 = r4 - r1
            long r9 = r0.f5866g
            long r11 = (long) r1
            long r9 = r9 - r11
            if (r8 >= 0) goto L_0x0048
            int r8 = -r8
            goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            long r11 = r0.f5871m
            boolean r13 = r0.f5870l
            B.q0 r14 = r0.f5861a
            T0.C r3 = r0.e
            T0.C r15 = r0.f5864d
            java.lang.Object r14 = r14.f302X
            Q0.t r14 = (Q0.t) r14
            if (r13 == 0) goto L_0x0071
            V1.p r13 = r0.f5869k
            boolean r13 = r13.f5846c
            if (r13 == 0) goto L_0x0060
            goto L_0x0071
        L_0x0060:
            r20 = r1
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r21 = r9
            r30 = r11
        L_0x006e:
            r4 = 3
            goto L_0x01c4
        L_0x0071:
            r15.e(r8)
            r3.e(r8)
            boolean r13 = r0.f5870l
            if (r13 != 0) goto L_0x0159
            boolean r13 = r15.f4611d
            if (r13 == 0) goto L_0x0060
            boolean r13 = r3.f4611d
            if (r13 == 0) goto L_0x0060
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Object r2 = r15.f4612f
            byte[] r2 = (byte[]) r2
            r16 = r4
            int r4 = r15.e
            byte[] r2 = java.util.Arrays.copyOf(r2, r4)
            r13.add(r2)
            java.lang.Object r2 = r3.f4612f
            byte[] r2 = (byte[]) r2
            int r4 = r3.e
            byte[] r2 = java.util.Arrays.copyOf(r2, r4)
            r13.add(r2)
            java.lang.Object r2 = r15.f4612f
            byte[] r2 = (byte[]) r2
            int r4 = r15.e
            r17 = r5
            r5 = 3
            Q0.p r2 = Q0.q.i(r2, r5, r4)
            java.lang.Object r4 = r3.f4612f
            byte[] r4 = (byte[]) r4
            int r5 = r3.e
            r18 = r6
            N1.f r6 = new N1.f
            r19 = r7
            r7 = 4
            r6.<init>(r4, r7, r5)
            int r4 = r6.m()
            int r5 = r6.m()
            r6.t()
            boolean r6 = r6.h()
            Q0.o r7 = new Q0.o
            r7.<init>(r4, r5, r6)
            int r5 = r2.f4051a
            int r6 = r2.f4052b
            r20 = r1
            int r1 = r2.f4053c
            java.lang.String r1 = P0.a.a(r5, r6, r1)
            p1.G r5 = r0.f5868j
            M0.q r6 = new M0.q
            r6.<init>()
            r21 = r9
            java.lang.String r9 = r0.i
            r6.f2989a = r9
            java.lang.String r9 = "video/avc"
            java.lang.String r9 = M0.I.o(r9)
            r6.f2999m = r9
            r6.f2996j = r1
            int r1 = r2.e
            r6.f3006t = r1
            int r1 = r2.f4055f
            r6.f3007u = r1
            int r1 = r2.f4057h
            int r27 = r1 + 8
            int r1 = r2.i
            int r28 = r1 + 8
            M0.i r1 = new M0.i
            int r9 = r2.f4064p
            int r10 = r2.f4065q
            r30 = r11
            int r11 = r2.f4066r
            r29 = 0
            r23 = r1
            r24 = r9
            r25 = r10
            r26 = r11
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r6.f2978A = r1
            float r1 = r2.f4056g
            r6.f3010x = r1
            r6.f3002p = r13
            int r1 = r2.f4067s
            r6.f3001o = r1
            Q0.g.v(r6, r5)
            r5 = 1
            r0.f5870l = r5
            r14.getClass()
            if (r1 < 0) goto L_0x0138
            r5 = 1
            goto L_0x0139
        L_0x0138:
            r5 = 0
        L_0x0139:
            P0.l.j(r5)
            r14.f4074a = r1
            r14.d(r1)
            V1.p r1 = r0.f5869k
            android.util.SparseArray r1 = r1.f5847d
            int r5 = r2.f4054d
            r1.append(r5, r2)
            V1.p r1 = r0.f5869k
            android.util.SparseArray r1 = r1.e
            r1.append(r4, r7)
            r15.g()
            r3.g()
            goto L_0x006e
        L_0x0159:
            r20 = r1
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r21 = r9
            r30 = r11
            boolean r1 = r15.f4611d
            if (r1 == 0) goto L_0x0195
            java.lang.Object r1 = r15.f4612f
            byte[] r1 = (byte[]) r1
            int r2 = r15.e
            r4 = 3
            Q0.p r1 = Q0.q.i(r1, r4, r2)
            r14.getClass()
            int r2 = r1.f4067s
            if (r2 < 0) goto L_0x017f
            r5 = 1
            goto L_0x0180
        L_0x017f:
            r5 = 0
        L_0x0180:
            P0.l.j(r5)
            r14.f4074a = r2
            r14.d(r2)
            V1.p r2 = r0.f5869k
            android.util.SparseArray r2 = r2.f5847d
            int r5 = r1.f4054d
            r2.append(r5, r1)
            r15.g()
            goto L_0x01c4
        L_0x0195:
            r4 = 3
            boolean r1 = r3.f4611d
            if (r1 == 0) goto L_0x01c4
            java.lang.Object r1 = r3.f4612f
            byte[] r1 = (byte[]) r1
            int r2 = r3.e
            N1.f r5 = new N1.f
            r6 = 4
            r5.<init>(r1, r6, r2)
            int r1 = r5.m()
            int r2 = r5.m()
            r5.t()
            boolean r5 = r5.h()
            Q0.o r6 = new Q0.o
            r6.<init>(r1, r2, r5)
            V1.p r2 = r0.f5869k
            android.util.SparseArray r2 = r2.e
            r2.append(r1, r6)
            r3.g()
        L_0x01c4:
            T0.C r1 = r0.f5865f
            boolean r2 = r1.e(r8)
            if (r2 == 0) goto L_0x01e8
            java.lang.Object r2 = r1.f4612f
            byte[] r2 = (byte[]) r2
            int r5 = r1.e
            int r2 = Q0.q.k(r5, r2)
            java.lang.Object r5 = r1.f4612f
            byte[] r5 = (byte[]) r5
            P0.r r6 = r0.f5873o
            r6.F(r2, r5)
            r2 = 4
            r6.H(r2)
            r7 = r30
            r14.a(r7, r6)
        L_0x01e8:
            V1.p r2 = r0.f5869k
            boolean r5 = r0.f5870l
            int r6 = r2.i
            r7 = 9
            if (r6 == r7) goto L_0x0270
            boolean r6 = r2.f5846c
            if (r6 == 0) goto L_0x026e
            V1.o r6 = r2.f5855n
            V1.o r7 = r2.f5854m
            boolean r8 = r6.f5830a
            if (r8 != 0) goto L_0x0200
            goto L_0x026e
        L_0x0200:
            boolean r8 = r7.f5830a
            if (r8 != 0) goto L_0x0206
            goto L_0x0270
        L_0x0206:
            Q0.p r8 = r6.f5832c
            P0.l.k(r8)
            Q0.p r9 = r7.f5832c
            P0.l.k(r9)
            int r10 = r6.f5834f
            int r11 = r7.f5834f
            if (r10 != r11) goto L_0x0270
            int r10 = r6.f5835g
            int r11 = r7.f5835g
            if (r10 != r11) goto L_0x0270
            boolean r10 = r6.f5836h
            boolean r11 = r7.f5836h
            if (r10 != r11) goto L_0x0270
            boolean r10 = r6.i
            if (r10 == 0) goto L_0x0230
            boolean r10 = r7.i
            if (r10 == 0) goto L_0x0230
            boolean r10 = r6.f5837j
            boolean r11 = r7.f5837j
            if (r10 != r11) goto L_0x0270
        L_0x0230:
            int r10 = r6.f5833d
            int r11 = r7.f5833d
            if (r10 == r11) goto L_0x023a
            if (r10 == 0) goto L_0x0270
            if (r11 == 0) goto L_0x0270
        L_0x023a:
            int r9 = r9.f4061m
            int r8 = r8.f4061m
            if (r8 != 0) goto L_0x024e
            if (r9 != 0) goto L_0x024e
            int r10 = r6.f5840m
            int r11 = r7.f5840m
            if (r10 != r11) goto L_0x0270
            int r10 = r6.f5841n
            int r11 = r7.f5841n
            if (r10 != r11) goto L_0x0270
        L_0x024e:
            r10 = 1
            if (r8 != r10) goto L_0x025f
            if (r9 != r10) goto L_0x025f
            int r8 = r6.f5842o
            int r9 = r7.f5842o
            if (r8 != r9) goto L_0x0270
            int r8 = r6.f5843p
            int r9 = r7.f5843p
            if (r8 != r9) goto L_0x0270
        L_0x025f:
            boolean r8 = r6.f5838k
            boolean r9 = r7.f5838k
            if (r8 != r9) goto L_0x0270
            if (r8 == 0) goto L_0x026e
            int r6 = r6.f5839l
            int r7 = r7.f5839l
            if (r6 == r7) goto L_0x026e
            goto L_0x0270
        L_0x026e:
            r5 = 0
            goto L_0x02a3
        L_0x0270:
            if (r5 == 0) goto L_0x0295
            boolean r5 = r2.f5856o
            if (r5 == 0) goto L_0x0295
            long r5 = r2.f5851j
            long r9 = r21 - r5
            int r7 = (int) r9
            int r13 = r20 + r7
            long r9 = r2.f5858q
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0289
            goto L_0x0295
        L_0x0289:
            boolean r11 = r2.f5859r
            long r7 = r2.f5857p
            long r5 = r5 - r7
            int r12 = (int) r5
            p1.G r8 = r2.f5844a
            r14 = 0
            r8.e(r9, r11, r12, r13, r14)
        L_0x0295:
            long r5 = r2.f5851j
            r2.f5857p = r5
            long r5 = r2.f5853l
            r2.f5858q = r5
            r5 = 0
            r2.f5859r = r5
            r6 = 1
            r2.f5856o = r6
        L_0x02a3:
            r2.a()
            boolean r2 = r2.f5859r
            if (r2 == 0) goto L_0x02ac
            r0.f5872n = r5
        L_0x02ac:
            long r5 = r0.f5871m
            boolean r2 = r0.f5870l
            if (r2 == 0) goto L_0x02b8
            V1.p r2 = r0.f5869k
            boolean r2 = r2.f5846c
            if (r2 == 0) goto L_0x02bb
        L_0x02b8:
            r2 = r19
            goto L_0x02be
        L_0x02bb:
            r2 = r19
            goto L_0x02c4
        L_0x02be:
            r15.h(r2)
            r3.h(r2)
        L_0x02c4:
            r1.h(r2)
            V1.p r1 = r0.f5869k
            boolean r3 = r0.f5872n
            r1.i = r2
            r1.f5853l = r5
            r9 = r21
            r1.f5851j = r9
            r1.f5860s = r3
            boolean r3 = r1.f5845b
            if (r3 == 0) goto L_0x02dd
            r3 = 1
            if (r2 == r3) goto L_0x02ea
            goto L_0x02de
        L_0x02dd:
            r3 = 1
        L_0x02de:
            boolean r5 = r1.f5846c
            if (r5 == 0) goto L_0x02fc
            r5 = 5
            if (r2 == r5) goto L_0x02ea
            if (r2 == r3) goto L_0x02ea
            r3 = 2
            if (r2 != r3) goto L_0x02fc
        L_0x02ea:
            V1.o r2 = r1.f5854m
            V1.o r3 = r1.f5855n
            r1.f5854m = r3
            r1.f5855n = r2
            r3 = 0
            r2.f5831b = r3
            r2.f5830a = r3
            r1.f5850h = r3
            r2 = 1
            r1.f5852k = r2
        L_0x02fc:
            r4 = r16
            r5 = r17
            r3 = r18
            r2 = 3
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.q.e(P0.r):void");
    }

    public final void f(boolean z) {
        l.k(this.f5868j);
        int i8 = z.f3748a;
        if (z) {
            ((t) this.f5861a.f302X).d(0);
            p pVar = this.f5869k;
            long j7 = this.f5866g;
            pVar.a();
            pVar.f5851j = j7;
            long j8 = pVar.f5858q;
            if (j8 != -9223372036854775807L) {
                boolean z6 = pVar.f5859r;
                pVar.f5844a.e(j8, z6 ? 1 : 0, (int) (j7 - pVar.f5857p), 0, (F) null);
            }
            pVar.f5856o = false;
        }
    }

    public final void g(int i8, long j7) {
        boolean z;
        this.f5871m = j7;
        boolean z6 = this.f5872n;
        if ((i8 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f5872n = z | z6;
    }

    public final void h(p1.q qVar, G g8) {
        g8.c();
        g8.d();
        this.i = (String) g8.e;
        g8.d();
        G q7 = qVar.q(g8.f5716c, 2);
        this.f5868j = q7;
        this.f5869k = new p(q7, this.f5862b, this.f5863c);
        this.f5861a.k(qVar, g8);
    }
}
