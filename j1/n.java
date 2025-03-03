package J1;

import B.q0;
import E1.a;
import H3.M;
import H3.O;
import H3.i0;
import M1.j;
import P0.r;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p1.D;
import p1.H;
import p1.o;
import p1.p;
import p1.q;
import p1.z;

public final class n implements o, z {

    /* renamed from: A  reason: collision with root package name */
    public m[] f2421A;

    /* renamed from: B  reason: collision with root package name */
    public long[][] f2422B;

    /* renamed from: C  reason: collision with root package name */
    public int f2423C;

    /* renamed from: D  reason: collision with root package name */
    public long f2424D;

    /* renamed from: E  reason: collision with root package name */
    public int f2425E;

    /* renamed from: F  reason: collision with root package name */
    public a f2426F;

    /* renamed from: a  reason: collision with root package name */
    public final j f2427a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2428b;

    /* renamed from: c  reason: collision with root package name */
    public final r f2429c;

    /* renamed from: d  reason: collision with root package name */
    public final r f2430d;
    public final r e;

    /* renamed from: f  reason: collision with root package name */
    public final r f2431f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f2432g;

    /* renamed from: h  reason: collision with root package name */
    public final p f2433h;
    public final ArrayList i;

    /* renamed from: j  reason: collision with root package name */
    public i0 f2434j = i0.f2073Y;

    /* renamed from: k  reason: collision with root package name */
    public int f2435k;

    /* renamed from: l  reason: collision with root package name */
    public int f2436l;

    /* renamed from: m  reason: collision with root package name */
    public long f2437m;

    /* renamed from: n  reason: collision with root package name */
    public int f2438n;

    /* renamed from: o  reason: collision with root package name */
    public r f2439o;

    /* renamed from: p  reason: collision with root package name */
    public int f2440p;

    /* renamed from: q  reason: collision with root package name */
    public int f2441q;

    /* renamed from: r  reason: collision with root package name */
    public int f2442r;

    /* renamed from: s  reason: collision with root package name */
    public int f2443s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2444t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2445u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2446v;

    /* renamed from: w  reason: collision with root package name */
    public long f2447w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2448x;

    /* renamed from: y  reason: collision with root package name */
    public long f2449y;
    public q z;

    public n(j jVar, int i8) {
        int i9;
        this.f2427a = jVar;
        this.f2428b = i8;
        M m8 = O.f2026V;
        boolean z6 = false;
        if ((i8 & 4) != 0) {
            i9 = 3;
        } else {
            i9 = 0;
        }
        this.f2435k = i9;
        this.f2433h = new p();
        this.i = new ArrayList();
        this.f2431f = new r(16);
        this.f2432g = new ArrayDeque();
        this.f2429c = new r(Q0.q.f4068a);
        this.f2430d = new r(5);
        this.e = new r();
        this.f2440p = -1;
        this.z = q.f14419T;
        this.f2421A = new m[0];
        this.f2444t = (i8 & 32) == 0 ? true : z6;
    }

    public final void a(long j7, long j8) {
        boolean z6;
        this.f2432g.clear();
        this.f2438n = 0;
        this.f2440p = -1;
        this.f2441q = 0;
        this.f2442r = 0;
        this.f2443s = 0;
        if ((this.f2428b & 32) == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f2444t = z6;
        if (j7 != 0) {
            for (m mVar : this.f2421A) {
                u uVar = mVar.f2418b;
                int e8 = P0.z.e(uVar.f2490f, j8, false);
                while (true) {
                    if (e8 < 0) {
                        e8 = -1;
                        break;
                    } else if ((uVar.f2491g[e8] & 1) != 0) {
                        break;
                    } else {
                        e8--;
                    }
                }
                if (e8 == -1) {
                    e8 = uVar.a(j8);
                }
                mVar.e = e8;
                H h5 = mVar.f2420d;
                if (h5 != null) {
                    h5.f14332b = false;
                    h5.f14333c = 0;
                }
            }
        } else if (this.f2435k != 3) {
            this.f2435k = 0;
            this.f2438n = 0;
        } else {
            p pVar = this.f2433h;
            pVar.f2453a.clear();
            pVar.f2454b = 0;
            this.i.clear();
        }
    }

    public final o c() {
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x06da A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x04e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x04e2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(p1.p r39, M0.C0132u r40) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r2 = r40
            r4 = 3
            r6 = 0
            r7 = 4
            r8 = 8
        L_0x000b:
            r9 = 2
            r10 = 1
            int r11 = r1.f2435k
            java.util.ArrayDeque r12 = r1.f2432g
            int r14 = r1.f2428b
            P0.r r15 = r1.e
            r16 = -1
            r19 = r14
            if (r11 == 0) goto L_0x04e6
            r20 = 262144(0x40000, double:1.295163E-318)
            if (r11 == r10) goto L_0x0430
            r22 = 8
            if (r11 == r9) goto L_0x025d
            if (r11 != r4) goto L_0x0257
            java.util.ArrayList r3 = r1.i
            J1.p r11 = r1.f2433h
            int r12 = r11.f2454b
            if (r12 == 0) goto L_0x0232
            if (r12 == r10) goto L_0x0200
            java.util.ArrayList r15 = r11.f2453a
            r14 = 2816(0xb00, float:3.946E-42)
            r10 = 2819(0xb03, float:3.95E-42)
            r13 = 2192(0x890, float:3.072E-42)
            if (r12 == r9) goto L_0x0174
            if (r12 != r4) goto L_0x016e
            long r17 = r39.y()
            long r20 = r39.i()
            long r22 = r39.y()
            long r20 = r20 - r22
            int r11 = r11.f2455c
            long r11 = (long) r11
            long r11 = r20 - r11
            int r12 = (int) r11
            P0.r r11 = new P0.r
            r11.<init>((int) r12)
            byte[] r9 = r11.f3732a
            r0.readFully(r9, r6, r12)
            r0 = 0
        L_0x005b:
            int r9 = r15.size()
            if (r0 >= r9) goto L_0x0167
            java.lang.Object r9 = r15.get(r0)
            J1.o r9 = (J1.o) r9
            long r4 = r9.f2450a
            long r4 = r4 - r17
            int r5 = (int) r4
            r11.H(r5)
            r11.I(r7)
            int r4 = r11.k()
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r12 = r11.t(r4, r5)
            int r19 = r12.hashCode()
            switch(r19) {
                case -1711564334: goto L_0x00b1;
                case -1332107749: goto L_0x00a6;
                case -1251387154: goto L_0x009b;
                case -830665521: goto L_0x0090;
                case 1760745220: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            r7 = -1
            goto L_0x00bb
        L_0x0085:
            java.lang.String r7 = "Super_SlowMotion_BGM"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x008e
            goto L_0x0083
        L_0x008e:
            r7 = 4
            goto L_0x00bb
        L_0x0090:
            java.lang.String r7 = "Super_SlowMotion_Deflickering_On"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0099
            goto L_0x0083
        L_0x0099:
            r7 = 3
            goto L_0x00bb
        L_0x009b:
            java.lang.String r7 = "Super_SlowMotion_Data"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00a4
            goto L_0x0083
        L_0x00a4:
            r7 = 2
            goto L_0x00bb
        L_0x00a6:
            java.lang.String r7 = "Super_SlowMotion_Edit_Data"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00af
            goto L_0x0083
        L_0x00af:
            r7 = 1
            goto L_0x00bb
        L_0x00b1:
            java.lang.String r7 = "SlowMotion_Data"
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x00ba
            goto L_0x0083
        L_0x00ba:
            r7 = 0
        L_0x00bb:
            switch(r7) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x00cf;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00c9;
                case 4: goto L_0x00c6;
                default: goto L_0x00be;
            }
        L_0x00be:
            java.lang.String r0 = "Invalid SEF name"
            r2 = 0
            M0.J r0 = M0.J.a(r2, r0)
            throw r0
        L_0x00c6:
            r7 = 2817(0xb01, float:3.947E-42)
            goto L_0x00d4
        L_0x00c9:
            r7 = 2820(0xb04, float:3.952E-42)
            goto L_0x00d4
        L_0x00cc:
            r7 = 2816(0xb00, float:3.946E-42)
            goto L_0x00d4
        L_0x00cf:
            r7 = 2819(0xb03, float:3.95E-42)
            goto L_0x00d4
        L_0x00d2:
            r7 = 2192(0x890, float:3.072E-42)
        L_0x00d4:
            int r4 = r4 + r8
            int r9 = r9.f2451b
            int r9 = r9 - r4
            if (r7 == r13) goto L_0x00ef
            if (r7 == r14) goto L_0x00ed
            r4 = 2817(0xb01, float:3.947E-42)
            if (r7 == r4) goto L_0x00ed
            if (r7 == r10) goto L_0x00ed
            r4 = 2820(0xb04, float:3.952E-42)
            if (r7 != r4) goto L_0x00e7
            goto L_0x00ed
        L_0x00e7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00ed:
            r4 = 1
            goto L_0x0160
        L_0x00ef:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = r11.t(r9, r5)
            D2.o r7 = J1.p.e
            java.util.List r5 = r7.r(r5)
            r7 = 0
        L_0x00ff:
            int r9 = r5.size()
            if (r7 >= r9) goto L_0x0157
            java.lang.Object r9 = r5.get(r7)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            D2.o r12 = J1.p.f2452d
            java.util.List r9 = r12.r(r9)
            int r12 = r9.size()
            r10 = 3
            if (r12 != r10) goto L_0x0151
            java.lang.Object r10 = r9.get(r6)     // Catch:{ NumberFormatException -> 0x014a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x014a }
            long r28 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x014a }
            r10 = 1
            java.lang.Object r12 = r9.get(r10)     // Catch:{ NumberFormatException -> 0x014a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NumberFormatException -> 0x014a }
            long r30 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014a }
            r10 = 2
            java.lang.Object r9 = r9.get(r10)     // Catch:{ NumberFormatException -> 0x014a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x014a }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x014a }
            r10 = 1
            int r9 = r9 - r10
            int r27 = r10 << r9
            E1.b r9 = new E1.b     // Catch:{ NumberFormatException -> 0x014a }
            r26 = r9
            r26.<init>(r27, r28, r30)     // Catch:{ NumberFormatException -> 0x014a }
            r4.add(r9)     // Catch:{ NumberFormatException -> 0x014a }
            int r7 = r7 + r10
            r10 = 2819(0xb03, float:3.95E-42)
            goto L_0x00ff
        L_0x014a:
            r0 = move-exception
            r2 = 0
            M0.J r0 = M0.J.a(r0, r2)
            throw r0
        L_0x0151:
            r2 = 0
            M0.J r0 = M0.J.a(r2, r2)
            throw r0
        L_0x0157:
            E1.c r5 = new E1.c
            r5.<init>(r4)
            r3.add(r5)
            goto L_0x00ed
        L_0x0160:
            int r0 = r0 + r4
            r4 = 3
            r7 = 4
            r10 = 2819(0xb03, float:3.95E-42)
            goto L_0x005b
        L_0x0167:
            r4 = 0
            r2.f3050a = r4
        L_0x016b:
            r0 = 1
            goto L_0x0249
        L_0x016e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0174:
            long r3 = r39.i()
            int r5 = r11.f2455c
            int r5 = r5 + -20
            P0.r r7 = new P0.r
            r7.<init>((int) r5)
            byte[] r9 = r7.f3732a
            r0.readFully(r9, r6, r5)
            r0 = 0
        L_0x0187:
            int r9 = r5 / 12
            if (r0 >= r9) goto L_0x01e3
            r9 = 2
            r7.I(r9)
            byte[] r10 = r7.f3732a
            int r12 = r7.f3733b
            r17 = 1
            int r6 = r12 + 1
            r7.f3733b = r6
            byte r14 = r10[r12]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r12 = r12 + r9
            r7.f3733b = r12
            byte r6 = r10[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << r8
            r6 = r6 | r14
            short r6 = (short) r6
            r9 = 2816(0xb00, float:3.946E-42)
            r10 = 2817(0xb01, float:3.947E-42)
            if (r6 == r13) goto L_0x01c1
            if (r6 == r9) goto L_0x01c1
            r12 = 2819(0xb03, float:3.95E-42)
            if (r6 == r10) goto L_0x01be
            r14 = 2820(0xb04, float:3.952E-42)
            if (r6 == r12) goto L_0x01c4
            if (r6 == r14) goto L_0x01c4
            r7.I(r8)
        L_0x01bc:
            r6 = 1
            goto L_0x01dc
        L_0x01be:
            r14 = 2820(0xb04, float:3.952E-42)
            goto L_0x01c4
        L_0x01c1:
            r12 = 2819(0xb03, float:3.95E-42)
            goto L_0x01be
        L_0x01c4:
            int r6 = r11.f2455c
            long r9 = (long) r6
            long r9 = r3 - r9
            int r6 = r7.k()
            long r12 = (long) r6
            long r9 = r9 - r12
            int r6 = r7.k()
            J1.o r12 = new J1.o
            r12.<init>(r6, r9)
            r15.add(r12)
            goto L_0x01bc
        L_0x01dc:
            int r0 = r0 + r6
            r6 = 0
            r13 = 2192(0x890, float:3.072E-42)
            r14 = 2816(0xb00, float:3.946E-42)
            goto L_0x0187
        L_0x01e3:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x01f0
            r3 = 0
            r2.f3050a = r3
            r3 = 0
            goto L_0x016b
        L_0x01f0:
            r4 = 3
            r11.f2454b = r4
            r3 = 0
            java.lang.Object r0 = r15.get(r3)
            J1.o r0 = (J1.o) r0
            long r4 = r0.f2450a
            r2.f3050a = r4
            goto L_0x016b
        L_0x0200:
            r3 = 0
            P0.r r4 = new P0.r
            r4.<init>((int) r8)
            byte[] r5 = r4.f3732a
            r0.readFully(r5, r3, r8)
            int r3 = r4.k()
            int r3 = r3 + r8
            r11.f2455c = r3
            int r3 = r4.i()
            r4 = 1397048916(0x53454654, float:8.4728847E11)
            if (r3 == r4) goto L_0x0221
            r3 = 0
            r2.f3050a = r3
            goto L_0x016b
        L_0x0221:
            long r3 = r39.y()
            int r0 = r11.f2455c
            int r0 = r0 + -12
            long r5 = (long) r0
            long r3 = r3 - r5
            r2.f3050a = r3
            r0 = 2
            r11.f2454b = r0
            goto L_0x016b
        L_0x0232:
            long r3 = r39.i()
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0242
            int r0 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x023f
            goto L_0x0242
        L_0x023f:
            long r3 = r3 - r22
            goto L_0x0244
        L_0x0242:
            r3 = 0
        L_0x0244:
            r2.f3050a = r3
            r0 = 1
            r11.f2454b = r0
        L_0x0249:
            long r2 = r2.f3050a
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0256
            r2 = 0
            r1.f2435k = r2
            r1.f2438n = r2
        L_0x0256:
            return r0
        L_0x0257:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x025d:
            long r4 = r39.y()
            int r6 = r1.f2440p
            r7 = -1
            if (r6 != r7) goto L_0x02dd
            r8 = -1
            r9 = -1
            r10 = 1
            r11 = 1
            r12 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r27 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x027a:
            J1.m[] r3 = r1.f2421A
            int r6 = r3.length
            if (r12 >= r6) goto L_0x02c1
            r3 = r3[r12]
            int r6 = r3.e
            J1.u r3 = r3.f2418b
            int r7 = r3.f2487b
            if (r6 != r7) goto L_0x028b
        L_0x0289:
            r3 = 1
            goto L_0x02bf
        L_0x028b:
            long[] r3 = r3.f2488c
            r31 = r3[r6]
            long[][] r3 = r1.f2422B
            int r7 = P0.z.f3748a
            r3 = r3[r12]
            r6 = r3[r6]
            long r31 = r31 - r4
            r24 = 0
            int r3 = (r31 > r24 ? 1 : (r31 == r24 ? 0 : -1))
            if (r3 < 0) goto L_0x02a6
            int r3 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r3 < 0) goto L_0x02a4
            goto L_0x02a6
        L_0x02a4:
            r3 = 0
            goto L_0x02a7
        L_0x02a6:
            r3 = 1
        L_0x02a7:
            if (r3 != 0) goto L_0x02ab
            if (r11 != 0) goto L_0x02b1
        L_0x02ab:
            if (r3 != r11) goto L_0x02b7
            int r18 = (r31 > r27 ? 1 : (r31 == r27 ? 0 : -1))
            if (r18 >= 0) goto L_0x02b7
        L_0x02b1:
            r11 = r3
            r16 = r6
            r9 = r12
            r27 = r31
        L_0x02b7:
            int r18 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r18 >= 0) goto L_0x0289
            r10 = r3
            r13 = r6
            r8 = r12
            goto L_0x0289
        L_0x02bf:
            int r12 = r12 + r3
            goto L_0x027a
        L_0x02c1:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x02d4
            if (r10 == 0) goto L_0x02d4
            r6 = 10485760(0xa00000, double:5.180654E-317)
            long r13 = r13 + r6
            int r3 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x02d5
        L_0x02d4:
            r8 = r9
        L_0x02d5:
            r1.f2440p = r8
            r3 = -1
            if (r8 != r3) goto L_0x02dd
            r5 = -1
            goto L_0x042f
        L_0x02dd:
            J1.m[] r3 = r1.f2421A
            int r6 = r1.f2440p
            r3 = r3[r6]
            p1.G r14 = r3.f2419c
            int r13 = r3.e
            J1.u r12 = r3.f2418b
            long[] r6 = r12.f2488c
            r7 = r6[r13]
            long r9 = r1.f2449y
            long r7 = r7 + r9
            int[] r6 = r12.f2489d
            r6 = r6[r13]
            long r4 = r7 - r4
            int r9 = r1.f2441q
            long r9 = (long) r9
            long r4 = r4 + r9
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x042c
            int r9 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r9 < 0) goto L_0x0306
            goto L_0x042c
        L_0x0306:
            J1.r r2 = r3.f2417a
            int r7 = r2.f2463h
            r8 = 1
            if (r7 != r8) goto L_0x0311
            long r4 = r4 + r22
            int r6 = r6 + -8
        L_0x0311:
            int r5 = (int) r4
            r0.m(r5)
            M0.r r4 = r2.f2462g
            java.lang.String r5 = r4.f3036n
            java.lang.String r7 = "video/avc"
            boolean r5 = j$.util.Objects.equals(r5, r7)
            if (r5 != 0) goto L_0x0325
            r5 = 1
            r1.f2444t = r5
            goto L_0x0326
        L_0x0325:
            r5 = 1
        L_0x0326:
            int r2 = r2.f2465k
            p1.H r11 = r3.f2420d
            if (r2 == 0) goto L_0x039c
            P0.r r4 = r1.f2430d
            byte[] r7 = r4.f3732a
            r8 = 0
            r7[r8] = r8
            r7[r5] = r8
            r9 = 2
            r7[r9] = r8
            int r10 = r2 + 1
            r5 = 4
            int r2 = 4 - r2
        L_0x033d:
            int r5 = r1.f2442r
            if (r5 >= r6) goto L_0x039a
            int r5 = r1.f2443s
            if (r5 != 0) goto L_0x0385
            r0.readFully(r7, r2, r10)
            int r5 = r1.f2441q
            int r5 = r5 + r10
            r1.f2441q = r5
            r5 = 0
            r4.H(r5)
            int r8 = r4.i()
            r9 = 1
            if (r8 < r9) goto L_0x037d
            int r8 = r8 - r9
            r1.f2443s = r8
            P0.r r8 = r1.f2429c
            r8.H(r5)
            r5 = 4
            r14.a(r5, r8)
            r14.a(r9, r4)
            int r8 = r1.f2442r
            int r8 = r8 + 5
            r1.f2442r = r8
            int r6 = r6 + r2
            boolean r8 = r1.f2444t
            if (r8 != 0) goto L_0x033d
            byte r8 = r7[r5]
            boolean r5 = Q0.q.c(r8)
            if (r5 == 0) goto L_0x033d
            r1.f2444t = r9
            goto L_0x033d
        L_0x037d:
            java.lang.String r0 = "Invalid NAL length"
            r2 = 0
            M0.J r0 = M0.J.a(r2, r0)
            throw r0
        L_0x0385:
            r8 = 0
            int r5 = r14.b(r0, r5, r8)
            int r8 = r1.f2441q
            int r8 = r8 + r5
            r1.f2441q = r8
            int r8 = r1.f2442r
            int r8 = r8 + r5
            r1.f2442r = r8
            int r8 = r1.f2443s
            int r8 = r8 - r5
            r1.f2443s = r8
            goto L_0x033d
        L_0x039a:
            r0 = r6
            goto L_0x03da
        L_0x039c:
            java.lang.String r2 = r4.f3036n
            java.lang.String r4 = "audio/ac4"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x03ba
            int r2 = r1.f2442r
            if (r2 != 0) goto L_0x03b7
            p1.C1332b.h(r6, r15)
            r5 = 7
            r14.a(r5, r15)
            int r2 = r1.f2442r
            int r2 = r2 + r5
            r1.f2442r = r2
            goto L_0x03b8
        L_0x03b7:
            r5 = 7
        L_0x03b8:
            int r6 = r6 + r5
            goto L_0x03bf
        L_0x03ba:
            if (r11 == 0) goto L_0x03bf
            r11.c(r0)
        L_0x03bf:
            int r2 = r1.f2442r
            if (r2 >= r6) goto L_0x039a
            int r2 = r6 - r2
            r4 = 0
            int r2 = r14.b(r0, r2, r4)
            int r4 = r1.f2441q
            int r4 = r4 + r2
            r1.f2441q = r4
            int r4 = r1.f2442r
            int r4 = r4 + r2
            r1.f2442r = r4
            int r4 = r1.f2443s
            int r4 = r4 - r2
            r1.f2443s = r4
            goto L_0x03bf
        L_0x03da:
            long[] r2 = r12.f2490f
            r4 = r2[r13]
            int[] r2 = r12.f2491g
            r2 = r2[r13]
            boolean r6 = r1.f2444t
            if (r6 != 0) goto L_0x03e9
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 | r6
        L_0x03e9:
            if (r11 == 0) goto L_0x0408
            r15 = 0
            r16 = 0
            r6 = r11
            r7 = r14
            r8 = r4
            r10 = r2
            r2 = r11
            r11 = r0
            r0 = r12
            r12 = r15
            r4 = r13
            r13 = r16
            r6.b(r7, r8, r10, r11, r12, r13)
            r5 = 1
            int r13 = r4 + 1
            int r0 = r0.f2487b
            if (r13 != r0) goto L_0x0411
            r4 = 0
            r2.a(r14, r4)
            goto L_0x0411
        L_0x0408:
            r11 = 0
            r12 = 0
            r6 = r14
            r7 = r4
            r9 = r2
            r10 = r0
            r6.e(r7, r9, r10, r11, r12)
        L_0x0411:
            int r0 = r3.e
            r2 = 1
            int r0 = r0 + r2
            r3.e = r0
            r0 = -1
            r1.f2440p = r0
            r0 = 0
            r1.f2441q = r0
            r1.f2442r = r0
            r1.f2443s = r0
            r0 = r19 & 32
            if (r0 != 0) goto L_0x0427
            r10 = 1
            goto L_0x0428
        L_0x0427:
            r10 = 0
        L_0x0428:
            r1.f2444t = r10
            r5 = 0
            goto L_0x042f
        L_0x042c:
            r2.f3050a = r7
            r5 = 1
        L_0x042f:
            return r5
        L_0x0430:
            r5 = 7
            long r6 = r1.f2437m
            int r3 = r1.f2438n
            long r9 = (long) r3
            long r6 = r6 - r9
            long r9 = r39.y()
            long r9 = r9 + r6
            P0.r r3 = r1.f2439o
            if (r3 == 0) goto L_0x04a2
            byte[] r11 = r3.f3732a
            int r13 = r1.f2438n
            int r7 = (int) r6
            r0.readFully(r11, r13, r7)
            int r6 = r1.f2436l
            r7 = 1718909296(0x66747970, float:2.8862439E23)
            if (r6 != r7) goto L_0x0489
            r6 = 1
            r1.f2445u = r6
            r3.H(r8)
            int r6 = r3.i()
            r7 = 1903435808(0x71742020, float:1.2088509E30)
            r11 = 1751476579(0x68656963, float:4.333464E24)
            if (r6 == r11) goto L_0x0467
            if (r6 == r7) goto L_0x0465
            r6 = 0
            goto L_0x0468
        L_0x0465:
            r6 = 1
            goto L_0x0468
        L_0x0467:
            r6 = 2
        L_0x0468:
            if (r6 == 0) goto L_0x046b
            goto L_0x0486
        L_0x046b:
            r6 = 4
            r3.I(r6)
        L_0x046f:
            int r6 = r3.a()
            if (r6 <= 0) goto L_0x0485
            int r6 = r3.i()
            if (r6 == r11) goto L_0x0481
            if (r6 == r7) goto L_0x047f
            r6 = 0
            goto L_0x0482
        L_0x047f:
            r6 = 1
            goto L_0x0482
        L_0x0481:
            r6 = 2
        L_0x0482:
            if (r6 == 0) goto L_0x046f
            goto L_0x0486
        L_0x0485:
            r6 = 0
        L_0x0486:
            r1.f2425E = r6
            goto L_0x04b8
        L_0x0489:
            boolean r6 = r12.isEmpty()
            if (r6 != 0) goto L_0x04b8
            java.lang.Object r6 = r12.peek()
            Q0.b r6 = (Q0.b) r6
            Q0.c r7 = new Q0.c
            int r11 = r1.f2436l
            r7.<init>(r11, r3)
            java.util.ArrayList r3 = r6.f4014X
            r3.add(r7)
            goto L_0x04b8
        L_0x04a2:
            boolean r3 = r1.f2445u
            if (r3 != 0) goto L_0x04b0
            int r3 = r1.f2436l
            r11 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r3 != r11) goto L_0x04b0
            r3 = 1
            r1.f2425E = r3
        L_0x04b0:
            int r3 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x04ba
            int r3 = (int) r6
            r0.m(r3)
        L_0x04b8:
            r3 = 0
            goto L_0x04c2
        L_0x04ba:
            long r11 = r39.y()
            long r11 = r11 + r6
            r2.f3050a = r11
            r3 = 1
        L_0x04c2:
            r1.m(r9)
            boolean r6 = r1.f2446v
            if (r6 == 0) goto L_0x04d4
            r6 = 1
            r1.f2448x = r6
            long r6 = r1.f2447w
            r2.f3050a = r6
            r3 = 0
            r1.f2446v = r3
            r3 = 1
        L_0x04d4:
            if (r3 == 0) goto L_0x04dd
            int r3 = r1.f2435k
            r6 = 2
            if (r3 == r6) goto L_0x04dd
            r3 = 1
            goto L_0x04de
        L_0x04dd:
            r3 = 0
        L_0x04de:
            if (r3 == 0) goto L_0x04e2
            r3 = 1
            return r3
        L_0x04e2:
            r6 = 0
            r7 = 4
            goto L_0x000b
        L_0x04e6:
            r3 = 1
            r5 = 7
            int r6 = r1.f2438n
            P0.r r7 = r1.f2431f
            if (r6 != 0) goto L_0x054e
            byte[] r6 = r7.f3732a
            r9 = 0
            boolean r6 = r0.c(r6, r9, r8, r3)
            if (r6 != 0) goto L_0x053a
            int r3 = r1.f2425E
            r6 = 2
            if (r3 != r6) goto L_0x0535
            r3 = r19 & 2
            if (r3 == 0) goto L_0x0535
            p1.q r3 = r1.z
            r7 = 4
            p1.G r3 = r3.q(r9, r7)
            E1.a r7 = r1.f2426F
            if (r7 != 0) goto L_0x050d
            r13 = 0
            goto L_0x0517
        L_0x050d:
            M0.H r13 = new M0.H
            r10 = 1
            M0.G[] r11 = new M0.G[r10]
            r11[r9] = r7
            r13.<init>((M0.G[]) r11)
        L_0x0517:
            M0.q r7 = new M0.q
            r7.<init>()
            r7.f2997k = r13
            Q0.g.v(r7, r3)
            p1.q r3 = r1.z
            r3.g()
            p1.q r3 = r1.z
            p1.s r7 = new p1.s
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r9)
            r3.l(r7)
        L_0x0535:
            r3 = 0
            r4 = 4
            r10 = 0
            goto L_0x06d8
        L_0x053a:
            r6 = 2
            r1.f2438n = r8
            r3 = 0
            r7.H(r3)
            long r9 = r7.x()
            r1.f2437m = r9
            int r3 = r7.i()
            r1.f2436l = r3
            goto L_0x054f
        L_0x054e:
            r6 = 2
        L_0x054f:
            long r9 = r1.f2437m
            r13 = 1
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0568
            byte[] r3 = r7.f3732a
            r0.readFully(r3, r8, r8)
            int r3 = r1.f2438n
            int r3 = r3 + r8
            r1.f2438n = r3
            long r9 = r7.A()
            r1.f2437m = r9
            goto L_0x058f
        L_0x0568:
            r13 = 0
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x058f
            long r9 = r39.i()
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x0580
            java.lang.Object r3 = r12.peek()
            Q0.b r3 = (Q0.b) r3
            if (r3 == 0) goto L_0x0580
            long r9 = r3.f4013W
        L_0x0580:
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 == 0) goto L_0x058f
            long r13 = r39.y()
            long r9 = r9 - r13
            int r3 = r1.f2438n
            long r13 = (long) r3
            long r9 = r9 + r13
            r1.f2437m = r9
        L_0x058f:
            long r9 = r1.f2437m
            int r3 = r1.f2438n
            long r13 = (long) r3
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x06df
            int r9 = r1.f2436l
            r10 = 1751411826(0x68646c72, float:4.3148E24)
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r13 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 == r11) goto L_0x05c5
            r11 = 1953653099(0x7472616b, float:7.681346E31)
            if (r9 == r11) goto L_0x05c5
            r11 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r9 == r11) goto L_0x05c5
            r11 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r9 == r11) goto L_0x05c5
            r11 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r9 == r11) goto L_0x05c5
            r11 = 1701082227(0x65647473, float:6.742798E22)
            if (r9 == r11) goto L_0x05c5
            if (r9 == r13) goto L_0x05c5
            r11 = 1701082724(0x65647664, float:6.7430217E22)
            if (r9 != r11) goto L_0x05c8
        L_0x05c5:
            r3 = 1
            goto L_0x067d
        L_0x05c8:
            r11 = 1835296868(0x6d646864, float:4.418049E27)
            if (r9 == r11) goto L_0x0650
            r11 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r9 == r11) goto L_0x0650
            if (r9 == r10) goto L_0x0650
            r10 = 1937011556(0x73747364, float:1.9367383E31)
            if (r9 == r10) goto L_0x0650
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            if (r9 == r10) goto L_0x0650
            r10 = 1937011571(0x73747373, float:1.9367401E31)
            if (r9 == r10) goto L_0x0650
            r10 = 1668576371(0x63747473, float:4.5093966E21)
            if (r9 == r10) goto L_0x0650
            r10 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r9 == r10) goto L_0x0650
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            if (r9 == r10) goto L_0x0650
            r10 = 1937011578(0x7374737a, float:1.936741E31)
            if (r9 == r10) goto L_0x0650
            r10 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r9 == r10) goto L_0x0650
            r10 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r9 == r10) goto L_0x0650
            r10 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r9 == r10) goto L_0x0650
            r10 = 1953196132(0x746b6864, float:7.46037E31)
            if (r9 == r10) goto L_0x0650
            r10 = 1718909296(0x66747970, float:2.8862439E23)
            if (r9 == r10) goto L_0x0650
            r10 = 1969517665(0x75647461, float:2.8960062E32)
            if (r9 == r10) goto L_0x0650
            r10 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r9 == r10) goto L_0x0650
            r10 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r9 != r10) goto L_0x0620
            goto L_0x0650
        L_0x0620:
            long r9 = r39.y()
            int r3 = r1.f2438n
            long r11 = (long) r3
            long r30 = r9 - r11
            int r3 = r1.f2436l
            r7 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r7) goto L_0x0646
            E1.a r3 = new E1.a
            long r34 = r30 + r11
            long r9 = r1.f2437m
            long r36 = r9 - r11
            r28 = 0
            r32 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = r3
            r27.<init>(r28, r30, r32, r34, r36)
            r1.f2426F = r3
        L_0x0646:
            r3 = 0
            r1.f2439o = r3
            r3 = 1
            r1.f2435k = r3
        L_0x064c:
            r3 = 0
            r4 = 4
            goto L_0x06d7
        L_0x0650:
            if (r3 != r8) goto L_0x0654
            r10 = 1
            goto L_0x0655
        L_0x0654:
            r10 = 0
        L_0x0655:
            P0.l.j(r10)
            long r9 = r1.f2437m
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x0663
            r10 = 1
            goto L_0x0664
        L_0x0663:
            r10 = 0
        L_0x0664:
            P0.l.j(r10)
            P0.r r3 = new P0.r
            long r9 = r1.f2437m
            int r10 = (int) r9
            r3.<init>((int) r10)
            byte[] r7 = r7.f3732a
            byte[] r9 = r3.f3732a
            r10 = 0
            java.lang.System.arraycopy(r7, r10, r9, r10, r8)
            r1.f2439o = r3
            r3 = 1
            r1.f2435k = r3
            goto L_0x064c
        L_0x067d:
            long r16 = r39.y()
            long r3 = r1.f2437m
            long r16 = r16 + r3
            int r7 = r1.f2438n
            long r5 = (long) r7
            long r9 = r16 - r5
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x06b9
            int r3 = r1.f2436l
            if (r3 != r13) goto L_0x06b9
            r15.E(r8)
            byte[] r3 = r15.f3732a
            r4 = 0
            r0.v(r3, r4, r8)
            byte[] r3 = J1.f.f2359a
            int r3 = r15.f3733b
            r4 = 4
            r15.I(r4)
            int r5 = r15.i()
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x06ad
            int r3 = r3 + r4
        L_0x06ad:
            r15.H(r3)
            int r3 = r15.f3733b
            r0.m(r3)
            r39.k()
            goto L_0x06ba
        L_0x06b9:
            r4 = 4
        L_0x06ba:
            Q0.b r3 = new Q0.b
            int r5 = r1.f2436l
            r3.<init>(r5, r9)
            r12.push(r3)
            long r5 = r1.f2437m
            int r3 = r1.f2438n
            long r12 = (long) r3
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x06d2
            r1.m(r9)
            r3 = 0
            goto L_0x06d7
        L_0x06d2:
            r3 = 0
            r1.f2435k = r3
            r1.f2438n = r3
        L_0x06d7:
            r10 = 1
        L_0x06d8:
            if (r10 != 0) goto L_0x06dc
            r5 = -1
            return r5
        L_0x06dc:
            r4 = 3
            goto L_0x04e2
        L_0x06df:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            M0.J r0 = M0.J.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.n.e(p1.p, M0.u):int");
    }

    public final List f() {
        return this.f2434j;
    }

    public final boolean g() {
        return true;
    }

    public final boolean h(p pVar) {
        boolean z6;
        i0 i0Var;
        if ((this.f2428b & 2) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        D k8 = q.k(pVar, false, z6);
        if (k8 != null) {
            i0Var = O.r(k8);
        } else {
            M m8 = O.f2026V;
            i0Var = i0.f2073Y;
        }
        this.f2434j = i0Var;
        if (k8 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d6 A[EDGE_INSN: B:66:0x00d6->B:59:0x00d6 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p1.y i(long r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            J1.m[] r3 = r0.f2421A
            int r4 = r3.length
            p1.A r5 = p1.C1330A.f14318c
            if (r4 != 0) goto L_0x0012
            p1.y r1 = new p1.y
            r1.<init>(r5, r5)
            goto L_0x00f6
        L_0x0012:
            int r4 = r0.f2423C
            r6 = 0
            r7 = -1
            if (r4 == r7) goto L_0x005d
            r3 = r3[r4]
            J1.u r3 = r3.f2418b
            long[] r4 = r3.f2490f
            int r12 = P0.z.e(r4, r1, r6)
        L_0x0022:
            if (r12 < 0) goto L_0x0030
            int[] r13 = r3.f2491g
            r13 = r13[r12]
            r13 = r13 & 1
            if (r13 == 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r12 = r12 + -1
            goto L_0x0022
        L_0x0030:
            r12 = -1
        L_0x0031:
            if (r12 != r7) goto L_0x0037
            int r12 = r3.a(r1)
        L_0x0037:
            if (r12 != r7) goto L_0x0040
            p1.y r1 = new p1.y
            r1.<init>(r5, r5)
            goto L_0x00f6
        L_0x0040:
            r13 = r4[r12]
            long[] r5 = r3.f2488c
            r15 = r5[r12]
            int r17 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r17 >= 0) goto L_0x0063
            int r10 = r3.f2487b
            int r10 = r10 + -1
            if (r12 >= r10) goto L_0x0063
            int r1 = r3.a(r1)
            if (r1 == r7) goto L_0x0063
            if (r1 == r12) goto L_0x0063
            r2 = r4[r1]
            r10 = r5[r1]
            goto L_0x006a
        L_0x005d:
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = r1
        L_0x0063:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = -1
        L_0x006a:
            r4 = r15
            r1 = 0
        L_0x006c:
            J1.m[] r12 = r0.f2421A
            int r15 = r12.length
            if (r1 >= r15) goto L_0x00d6
            int r15 = r0.f2423C
            if (r1 == r15) goto L_0x00cf
            r12 = r12[r1]
            J1.u r12 = r12.f2418b
            long[] r15 = r12.f2490f
            int r16 = P0.z.e(r15, r13, r6)
        L_0x007f:
            int[] r6 = r12.f2491g
            if (r16 < 0) goto L_0x008f
            r18 = r6[r16]
            r18 = r18 & 1
            if (r18 == 0) goto L_0x008c
            r8 = r16
            goto L_0x0090
        L_0x008c:
            int r16 = r16 + -1
            goto L_0x007f
        L_0x008f:
            r8 = -1
        L_0x0090:
            if (r8 != r7) goto L_0x0096
            int r8 = r12.a(r13)
        L_0x0096:
            long[] r9 = r12.f2488c
            if (r8 != r7) goto L_0x00a0
        L_0x009a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00a7
        L_0x00a0:
            r7 = r9[r8]
            long r4 = java.lang.Math.min(r7, r4)
            goto L_0x009a
        L_0x00a7:
            int r19 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r19 == 0) goto L_0x00cf
            r7 = 0
            int r8 = P0.z.e(r15, r2, r7)
        L_0x00b0:
            if (r8 < 0) goto L_0x00bd
            r15 = r6[r8]
            r15 = r15 & 1
            if (r15 == 0) goto L_0x00ba
            r6 = -1
            goto L_0x00bf
        L_0x00ba:
            int r8 = r8 + -1
            goto L_0x00b0
        L_0x00bd:
            r6 = -1
            r8 = -1
        L_0x00bf:
            if (r8 != r6) goto L_0x00c5
            int r8 = r12.a(r2)
        L_0x00c5:
            if (r8 != r6) goto L_0x00c8
            goto L_0x00d1
        L_0x00c8:
            r8 = r9[r8]
            long r10 = java.lang.Math.min(r8, r10)
            goto L_0x00d1
        L_0x00cf:
            r6 = -1
            r7 = 0
        L_0x00d1:
            int r1 = r1 + 1
            r6 = 0
            r7 = -1
            goto L_0x006c
        L_0x00d6:
            p1.A r1 = new p1.A
            r1.<init>(r13, r4)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00eb
            p1.y r2 = new p1.y
            r2.<init>(r1, r1)
        L_0x00e9:
            r1 = r2
            goto L_0x00f6
        L_0x00eb:
            p1.A r4 = new p1.A
            r4.<init>(r2, r10)
            p1.y r2 = new p1.y
            r2.<init>(r1, r4)
            goto L_0x00e9
        L_0x00f6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.n.i(long):p1.y");
    }

    public final long k() {
        return this.f2424D;
    }

    public final void l(q qVar) {
        if ((this.f2428b & 16) == 0) {
            qVar = new q0(qVar, this.f2427a);
        }
        this.z = qVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x087b  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0895 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0457 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0171 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(long r35) {
        /*
            r34 = this;
            r1 = r34
        L_0x0002:
            r2 = 4
            r3 = 8
            r5 = 16
            r6 = 12
            r8 = 1
            java.util.ArrayDeque r9 = r1.f2432g
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x0898
            java.lang.Object r10 = r9.peek()
            Q0.b r10 = (Q0.b) r10
            long r10 = r10.f4013W
            int r12 = (r10 > r35 ? 1 : (r10 == r35 ? 0 : -1))
            if (r12 != 0) goto L_0x0898
            java.lang.Object r10 = r9.pop()
            r11 = r10
            Q0.b r11 = (Q0.b) r11
            int r10 = r11.f4018V
            r12 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r10 != r12) goto L_0x087f
            r10 = 1835365473(0x6d657461, float:4.4382975E27)
            Q0.b r12 = r11.r(r10)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r14 = 1751411826(0x68646c72, float:4.3148E24)
            r15 = 1684108385(0x64617461, float:1.6635614E22)
            r10 = 1768715124(0x696c7374, float:1.7865732E25)
            r19 = 0
            r17 = r13
            int r13 = r1.f2428b
            if (r12 == 0) goto L_0x019f
            byte[] r18 = J1.f.f2359a
            Q0.c r0 = r12.t(r14)
            r14 = 1801812339(0x6b657973, float:2.7741754E26)
            Q0.c r14 = r12.t(r14)
            Q0.c r12 = r12.t(r10)
            if (r0 == 0) goto L_0x010c
            if (r14 == 0) goto L_0x010c
            if (r12 == 0) goto L_0x010c
            P0.r r0 = r0.f4016W
            r0.H(r5)
            int r0 = r0.i()
            r10 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r0 == r10) goto L_0x0070
            goto L_0x010c
        L_0x0070:
            P0.r r0 = r14.f4016W
            r0.H(r6)
            int r10 = r0.i()
            java.lang.String[] r14 = new java.lang.String[r10]
            r6 = 0
        L_0x007c:
            if (r6 >= r10) goto L_0x0092
            int r23 = r0.i()
            r0.I(r2)
            int r2 = r23 + -8
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r2 = r0.t(r2, r4)
            r14[r6] = r2
            int r6 = r6 + r8
            r2 = 4
            goto L_0x007c
        L_0x0092:
            P0.r r0 = r12.f4016W
            r0.H(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x009c:
            int r4 = r0.a()
            if (r4 <= r3) goto L_0x00ff
            int r4 = r0.f3733b
            int r6 = r0.i()
            int r12 = r0.i()
            int r12 = r12 - r8
            if (r12 < 0) goto L_0x00eb
            if (r12 >= r10) goto L_0x00eb
            r12 = r14[r12]
            int r3 = r4 + r6
        L_0x00b5:
            int r8 = r0.f3733b
            if (r8 >= r3) goto L_0x00e4
            int r26 = r0.i()
            int r7 = r0.i()
            if (r7 != r15) goto L_0x00d9
            int r3 = r0.i()
            int r7 = r0.i()
            int r8 = r26 + -16
            byte[] r5 = new byte[r8]
            r15 = 0
            r0.g(r5, r15, r8)
            Q0.a r8 = new Q0.a
            r8.<init>(r12, r5, r7, r3)
            goto L_0x00e5
        L_0x00d9:
            int r8 = r8 + r26
            r0.H(r8)
            r5 = 16
            r15 = 1684108385(0x64617461, float:1.6635614E22)
            goto L_0x00b5
        L_0x00e4:
            r8 = 0
        L_0x00e5:
            if (r8 == 0) goto L_0x00f2
            r2.add(r8)
            goto L_0x00f2
        L_0x00eb:
            java.lang.String r3 = "Skipped metadata with unknown key index: "
            java.lang.String r5 = "BoxParsers"
            Q0.g.u(r12, r3, r5)
        L_0x00f2:
            int r4 = r4 + r6
            r0.H(r4)
            r3 = 8
            r5 = 16
            r8 = 1
            r15 = 1684108385(0x64617461, float:1.6635614E22)
            goto L_0x009c
        L_0x00ff:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0106
            goto L_0x010c
        L_0x0106:
            M0.H r0 = new M0.H
            r0.<init>((java.util.List) r2)
            goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            boolean r2 = r1.f2448x
            if (r2 == 0) goto L_0x0171
            P0.l.k(r0)
            java.lang.String r2 = "editable.tracks.samples.location"
            Q0.a r2 = J1.q.b(r0, r2)
            if (r2 == 0) goto L_0x012a
            byte[] r2 = r2.f4010V
            r3 = 0
            byte r2 = r2[r3]
            if (r2 != 0) goto L_0x012a
            long r2 = r1.f2447w
            r4 = 16
            long r2 = r2 + r4
            r1.f2449y = r2
        L_0x012a:
            java.lang.String r2 = "editable.tracks.map"
            Q0.a r2 = J1.q.b(r0, r2)
            P0.l.k(r2)
            java.util.ArrayList r2 = r2.k()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            r4 = 0
        L_0x0141:
            int r5 = r2.size()
            if (r4 >= r5) goto L_0x016f
            java.lang.Object r5 = r2.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x0164
            r6 = 1
            if (r5 == r6) goto L_0x0162
            r7 = 2
            if (r5 == r7) goto L_0x0160
            r7 = 3
            if (r5 == r7) goto L_0x015e
            r5 = 0
            goto L_0x0166
        L_0x015e:
            r5 = 4
            goto L_0x0166
        L_0x0160:
            r5 = 3
            goto L_0x0166
        L_0x0162:
            r5 = 2
            goto L_0x0166
        L_0x0164:
            r6 = 1
            r5 = 1
        L_0x0166:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.add(r5)
            int r4 = r4 + r6
            goto L_0x0141
        L_0x016f:
            r2 = 1
            goto L_0x01a3
        L_0x0171:
            if (r0 != 0) goto L_0x0175
        L_0x0173:
            r2 = 1
            goto L_0x019c
        L_0x0175:
            r2 = r13 & 64
            if (r2 == 0) goto L_0x0173
            java.lang.String r2 = "editable.tracks.offset"
            Q0.a r2 = J1.q.b(r0, r2)
            if (r2 == 0) goto L_0x0173
            P0.r r3 = new P0.r
            byte[] r2 = r2.f4010V
            r3.<init>((byte[]) r2)
            long r2 = r3.A()
            int r4 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x0173
            r1.f2447w = r2
            r2 = 1
            r1.f2446v = r2
            r4 = r1
            r28 = r9
            r7 = 3
            r12 = 1
            goto L_0x0874
        L_0x019c:
            r3 = r17
            goto L_0x01a3
        L_0x019f:
            r2 = 1
            r3 = r17
            r0 = 0
        L_0x01a3:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.f2425E
            if (r5 != r2) goto L_0x01af
            r17 = 1
            goto L_0x01b1
        L_0x01af:
            r17 = 0
        L_0x01b1:
            p1.v r2 = new p1.v
            r2.<init>()
            r5 = 1969517665(0x75647461, float:2.8960062E32)
            Q0.c r5 = r11.t(r5)
            if (r5 == 0) goto L_0x05e6
            byte[] r7 = J1.f.f2359a
            P0.r r5 = r5.f4016W
            r7 = 8
            r5.H(r7)
            M0.H r8 = new M0.H
            r10 = 0
            M0.G[] r12 = new M0.G[r10]
            r8.<init>((M0.G[]) r12)
        L_0x01d0:
            int r10 = r5.a()
            if (r10 < r7) goto L_0x05d7
            int r10 = r5.f3733b
            int r12 = r5.i()
            int r14 = r5.i()
            r15 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r14 != r15) goto L_0x04af
            r5.H(r10)
            int r14 = r10 + r12
            r5.I(r7)
            int r7 = r5.f3733b
            r15 = 4
            r5.I(r15)
            int r6 = r5.i()
            r28 = r9
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            if (r6 == r9) goto L_0x01ff
            int r7 = r7 + r15
        L_0x01ff:
            r5.H(r7)
        L_0x0202:
            int r6 = r5.f3733b
            if (r6 >= r14) goto L_0x049a
            int r7 = r5.i()
            int r15 = r5.i()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r15 != r9) goto L_0x0483
            r5.H(r6)
            int r6 = r6 + r7
            r7 = 8
            r5.I(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0221:
            int r14 = r5.f3733b
            if (r14 >= r6) goto L_0x046a
            java.lang.String r15 = "Skipped unknown metadata entry: "
            int r22 = r5.i()
            int r14 = r22 + r14
            int r9 = r5.i()
            r29 = r6
            int r6 = r9 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            r30 = r4
            r4 = 169(0xa9, float:2.37E-43)
            r31 = r0
            java.lang.String r0 = "MetadataUtil"
            r32 = r3
            java.lang.String r3 = "TCON"
            if (r6 == r4) goto L_0x0249
            r4 = 253(0xfd, float:3.55E-43)
            if (r6 != r4) goto L_0x024e
        L_0x0249:
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            goto L_0x03b1
        L_0x024e:
            r4 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r9 != r4) goto L_0x0279
            int r4 = J1.q.g(r5)     // Catch:{ all -> 0x0286 }
            r6 = 1
            int r4 = r4 - r6
            java.lang.String r4 = D1.j.a(r4)     // Catch:{ all -> 0x0286 }
            if (r4 == 0) goto L_0x026a
            D1.n r0 = new D1.n     // Catch:{ all -> 0x0286 }
            H3.i0 r4 = H3.O.r(r4)     // Catch:{ all -> 0x0286 }
            r6 = 0
            r0.<init>(r3, r6, r4)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x026a:
            r6 = 0
            java.lang.String r3 = "Failed to parse standard genre code"
            P0.l.B(r0, r3)     // Catch:{ all -> 0x0286 }
            r0 = r6
        L_0x0271:
            r5.H(r14)
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            goto L_0x0452
        L_0x0279:
            r6 = 0
            r3 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r9 != r3) goto L_0x0289
            java.lang.String r0 = "TPOS"
            D1.n r0 = J1.q.f(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x0286:
            r0 = move-exception
            goto L_0x0466
        L_0x0289:
            r3 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r9 != r3) goto L_0x0295
            java.lang.String r0 = "TRCK"
            D1.n r0 = J1.q.f(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x0295:
            r3 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r9 != r3) goto L_0x02a3
            java.lang.String r0 = "TBPM"
            r3 = 1
            r4 = 0
            D1.i r0 = J1.q.h(r9, r0, r5, r3, r4)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x02a3:
            r3 = 1668311404(0x6370696c, float:4.434815E21)
            if (r9 != r3) goto L_0x02b0
            java.lang.String r0 = "TCMP"
            r3 = 1
            D1.i r0 = J1.q.h(r9, r0, r5, r3, r3)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x02b0:
            r3 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r9 != r3) goto L_0x02ba
            D1.a r0 = J1.q.e(r5)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x02ba:
            r3 = 1631670868(0x61415254, float:2.2288462E20)
            if (r9 != r3) goto L_0x02c6
            java.lang.String r0 = "TPE2"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x02c6:
            r3 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r9 != r3) goto L_0x02d2
            java.lang.String r0 = "TSOT"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x02d2:
            r3 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r9 != r3) goto L_0x02de
            java.lang.String r0 = "TSOA"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x02de:
            r3 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r9 != r3) goto L_0x02ea
            java.lang.String r0 = "TSOP"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x02ea:
            r3 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r9 != r3) goto L_0x02f7
            java.lang.String r0 = "TSO2"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x02f7:
            r3 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r9 != r3) goto L_0x0304
            java.lang.String r0 = "TSOC"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x0304:
            r3 = 1920233063(0x72746e67, float:4.84146E30)
            if (r9 != r3) goto L_0x0312
            java.lang.String r0 = "ITUNESADVISORY"
            r3 = 0
            D1.i r0 = J1.q.h(r9, r0, r5, r3, r3)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x0312:
            r3 = 1885823344(0x70676170, float:2.8643533E29)
            if (r9 != r3) goto L_0x0321
            java.lang.String r0 = "ITUNESGAPLESS"
            r3 = 1
            r4 = 0
            D1.i r0 = J1.q.h(r9, r0, r5, r4, r3)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x0321:
            r3 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r9 != r3) goto L_0x032e
            java.lang.String r0 = "TVSHOWSORT"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x032e:
            r3 = 1953919848(0x74767368, float:7.810338E31)
            if (r9 != r3) goto L_0x033b
            java.lang.String r0 = "TVSHOW"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x0271
        L_0x033b:
            r3 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r9 != r3) goto L_0x03ac
            r4 = r6
            r9 = r4
            r0 = -1
            r3 = -1
        L_0x0344:
            int r15 = r5.f3733b     // Catch:{ all -> 0x0286 }
            if (r15 >= r14) goto L_0x0387
            int r21 = r5.i()     // Catch:{ all -> 0x0286 }
            int r6 = r5.i()     // Catch:{ all -> 0x0286 }
            r33 = r15
            r15 = 4
            r5.I(r15)     // Catch:{ all -> 0x0286 }
            r15 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r6 != r15) goto L_0x0367
            r15 = 12
            int r4 = r21 + -12
            java.lang.String r4 = r5.r(r4)     // Catch:{ all -> 0x0286 }
        L_0x0363:
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            goto L_0x0383
        L_0x0367:
            r15 = 12
            r1 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r6 != r1) goto L_0x0375
            int r1 = r21 + -12
            java.lang.String r9 = r5.r(r1)     // Catch:{ all -> 0x0286 }
            goto L_0x0363
        L_0x0375:
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            if (r6 != r1) goto L_0x037e
            r3 = r21
            r0 = r33
        L_0x037e:
            int r6 = r21 + -12
            r5.I(r6)     // Catch:{ all -> 0x0286 }
        L_0x0383:
            r6 = 0
            r1 = r34
            goto L_0x0344
        L_0x0387:
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            if (r4 == 0) goto L_0x03a6
            if (r9 == 0) goto L_0x03a6
            r6 = -1
            if (r0 != r6) goto L_0x0392
            goto L_0x03a6
        L_0x0392:
            r5.H(r0)     // Catch:{ all -> 0x0286 }
            r0 = 16
            r5.I(r0)     // Catch:{ all -> 0x0286 }
            int r3 = r3 - r0
            java.lang.String r0 = r5.r(r3)     // Catch:{ all -> 0x0286 }
            D1.k r3 = new D1.k     // Catch:{ all -> 0x0286 }
            r3.<init>(r4, r9, r0)     // Catch:{ all -> 0x0286 }
            r0 = r3
            goto L_0x03a7
        L_0x03a6:
            r0 = 0
        L_0x03a7:
            r5.H(r14)
            goto L_0x0452
        L_0x03ac:
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            goto L_0x042a
        L_0x03b1:
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r9
            r6 = 6516084(0x636d74, float:9.130979E-39)
            if (r4 != r6) goto L_0x03bf
            D1.e r0 = J1.q.d(r9, r5)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x03bf:
            r6 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r4 == r6) goto L_0x044a
            r6 = 7631467(0x74726b, float:1.0693963E-38)
            if (r4 != r6) goto L_0x03cb
            goto L_0x044a
        L_0x03cb:
            r6 = 6516589(0x636f6d, float:9.131686E-39)
            if (r4 == r6) goto L_0x0442
            r6 = 7828084(0x777274, float:1.0969482E-38)
            if (r4 != r6) goto L_0x03d7
            goto L_0x0442
        L_0x03d7:
            r6 = 6578553(0x646179, float:9.218516E-39)
            if (r4 != r6) goto L_0x03e3
            java.lang.String r0 = "TDRC"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x03e3:
            r6 = 4280916(0x415254, float:5.998841E-39)
            if (r4 != r6) goto L_0x03ef
            java.lang.String r0 = "TPE1"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x03ef:
            r6 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r4 != r6) goto L_0x03fb
            java.lang.String r0 = "TSSE"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x03fb:
            r6 = 6384738(0x616c62, float:8.946924E-39)
            if (r4 != r6) goto L_0x0407
            java.lang.String r0 = "TALB"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x0407:
            r6 = 7108978(0x6c7972, float:9.9618E-39)
            if (r4 != r6) goto L_0x0413
            java.lang.String r0 = "USLT"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x0413:
            r6 = 6776174(0x67656e, float:9.495442E-39)
            if (r4 != r6) goto L_0x041d
            D1.n r0 = J1.q.j(r9, r5, r3)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x041d:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r4 != r3) goto L_0x042a
            java.lang.String r0 = "TIT1"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x042a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0286 }
            r3.<init>(r15)     // Catch:{ all -> 0x0286 }
            java.lang.String r4 = Q0.d.b(r9)     // Catch:{ all -> 0x0286 }
            r3.append(r4)     // Catch:{ all -> 0x0286 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0286 }
            P0.l.n(r0, r3)     // Catch:{ all -> 0x0286 }
            r5.H(r14)
            r0 = 0
            goto L_0x0452
        L_0x0442:
            java.lang.String r0 = "TCOM"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x044a:
            java.lang.String r0 = "TIT2"
            D1.n r0 = J1.q.j(r9, r5, r0)     // Catch:{ all -> 0x0286 }
            goto L_0x03a7
        L_0x0452:
            if (r0 == 0) goto L_0x0457
            r7.add(r0)
        L_0x0457:
            r1 = r34
            r6 = r29
            r4 = r30
            r0 = r31
            r3 = r32
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            goto L_0x0221
        L_0x0466:
            r5.H(r14)
            throw r0
        L_0x046a:
            r31 = r0
            r32 = r3
            r30 = r4
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x047b
            r0 = 0
            goto L_0x0480
        L_0x047b:
            M0.H r0 = new M0.H
            r0.<init>((java.util.List) r7)
        L_0x0480:
            r6 = r0
            r0 = 0
            goto L_0x04a5
        L_0x0483:
            r31 = r0
            r32 = r3
            r30 = r4
            r0 = 0
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            int r6 = r6 + r7
            r5.H(r6)
            r1 = r34
            r0 = r31
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            goto L_0x0202
        L_0x049a:
            r31 = r0
            r32 = r3
            r30 = r4
            r0 = 0
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            r6 = r0
        L_0x04a5:
            M0.H r3 = r8.v(r6)
            r8 = r3
            r7 = 4
            r15 = 12
            goto L_0x05c5
        L_0x04af:
            r31 = r0
            r32 = r3
            r30 = r4
            r28 = r9
            r0 = 0
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            r3 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r14 != r3) goto L_0x0572
            r5.H(r10)
            int r3 = r10 + r12
            r4 = 12
            r5.I(r4)
        L_0x04ca:
            int r4 = r5.f3733b
            if (r4 >= r3) goto L_0x0568
            int r6 = r5.i()
            int r7 = r5.i()
            r9 = 1935766900(0x73617574, float:1.7862687E31)
            if (r7 != r9) goto L_0x055e
            r7 = 16
            if (r6 >= r7) goto L_0x04e5
            r6 = r0
            r7 = 4
            r15 = 12
            goto L_0x056c
        L_0x04e5:
            r7 = 4
            r5.I(r7)
            r4 = -1
            r6 = 0
            r9 = 0
        L_0x04ec:
            r14 = 2
            if (r6 >= r14) goto L_0x0503
            int r14 = r5.v()
            int r15 = r5.v()
            if (r14 != 0) goto L_0x04fc
            r4 = r15
            r0 = 1
            goto L_0x0500
        L_0x04fc:
            r0 = 1
            if (r14 != r0) goto L_0x0500
            r9 = r15
        L_0x0500:
            int r6 = r6 + r0
            r0 = 0
            goto L_0x04ec
        L_0x0503:
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 12
            if (r4 != r6) goto L_0x050f
            r3 = 240(0xf0, float:3.36E-43)
        L_0x050c:
            r15 = 12
            goto L_0x0548
        L_0x050f:
            r6 = 13
            if (r4 != r6) goto L_0x0516
            r3 = 120(0x78, float:1.68E-43)
            goto L_0x050c
        L_0x0516:
            r6 = 21
            if (r4 == r6) goto L_0x051e
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            goto L_0x050c
        L_0x051e:
            int r4 = r5.a()
            r6 = 8
            if (r4 < r6) goto L_0x052b
            int r4 = r5.f3733b
            int r4 = r4 + r6
            if (r4 <= r3) goto L_0x052e
        L_0x052b:
            r15 = 12
            goto L_0x0545
        L_0x052e:
            int r3 = r5.i()
            int r4 = r5.i()
            r15 = 12
            if (r3 < r15) goto L_0x0545
            r3 = 1936877170(0x73726672, float:1.9204921E31)
            if (r4 == r3) goto L_0x0540
            goto L_0x0545
        L_0x0540:
            int r3 = r5.w()
            goto L_0x0548
        L_0x0545:
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L_0x0548:
            if (r3 != r0) goto L_0x054c
        L_0x054a:
            r6 = 0
            goto L_0x056c
        L_0x054c:
            M0.H r6 = new M0.H
            E1.d r0 = new E1.d
            float r3 = (float) r3
            r0.<init>(r9, r3)
            r3 = 1
            M0.G[] r4 = new M0.G[r3]
            r3 = 0
            r4[r3] = r0
            r6.<init>((M0.G[]) r4)
            goto L_0x056c
        L_0x055e:
            r7 = 4
            r15 = 12
            int r4 = r4 + r6
            r5.H(r4)
            r0 = 0
            goto L_0x04ca
        L_0x0568:
            r7 = 4
            r15 = 12
            goto L_0x054a
        L_0x056c:
            M0.H r0 = r8.v(r6)
        L_0x0570:
            r8 = r0
            goto L_0x05c5
        L_0x0572:
            r7 = 4
            r15 = 12
            r0 = -1451722374(0xffffffffa978797a, float:-5.5172426E-14)
            if (r14 != r0) goto L_0x05c5
            short r0 = r5.s()
            r3 = 2
            r5.I(r3)
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r5.t(r0, r3)
            r3 = 43
            int r3 = r0.lastIndexOf(r3)
            r4 = 45
            int r4 = r0.lastIndexOf(r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 0
            java.lang.String r6 = r0.substring(r4, r3)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            float r4 = java.lang.Float.parseFloat(r6)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            int r6 = r0.length()     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            r9 = 1
            int r6 = r6 - r9
            java.lang.String r0 = r0.substring(r3, r6)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            M0.H r6 = new M0.H     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            Q0.e r3 = new Q0.e     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            r3.<init>(r4, r0)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            M0.G[] r0 = new M0.G[r9]     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            r4 = 0
            r0[r4] = r3     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            r6.<init>((M0.G[]) r0)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x05bf }
            goto L_0x05c0
        L_0x05bf:
            r6 = 0
        L_0x05c0:
            M0.H r0 = r8.v(r6)
            goto L_0x0570
        L_0x05c5:
            int r10 = r10 + r12
            r5.H(r10)
            r7 = 8
            r1 = r34
            r9 = r28
            r4 = r30
            r0 = r31
            r3 = r32
            goto L_0x01d0
        L_0x05d7:
            r31 = r0
            r32 = r3
            r30 = r4
            r28 = r9
            r7 = 4
            r15 = 12
            r2.b(r8)
            goto L_0x05f2
        L_0x05e6:
            r31 = r0
            r32 = r3
            r30 = r4
            r28 = r9
            r7 = 4
            r15 = 12
            r8 = 0
        L_0x05f2:
            M0.H r0 = new M0.H
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            Q0.c r1 = r11.t(r1)
            r1.getClass()
            P0.r r1 = r1.f4016W
            Q0.f r1 = J1.f.d(r1)
            r3 = 1
            M0.G[] r4 = new M0.G[r3]
            r5 = 0
            r4[r5] = r1
            r0.<init>((M0.G[]) r4)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0614
            r16 = 1
            goto L_0x0616
        L_0x0614:
            r16 = 0
        L_0x0616:
            B7.g r1 = new B7.g
            r3 = 9
            r1.<init>((int) r3)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r12 = r2
            r6 = r13
            r13 = r3
            r3 = 12
            r15 = r5
            r18 = r1
            java.util.ArrayList r1 = J1.f.g(r11, r12, r13, r15, r16, r17, r18)
            r4 = r34
            boolean r5 = r4.f2448x
            if (r5 == 0) goto L_0x0659
            int r5 = r32.size()
            int r9 = r1.size()
            if (r5 != r9) goto L_0x0641
            r5 = 1
            goto L_0x0642
        L_0x0641:
            r5 = 0
        L_0x0642:
            java.util.Locale r9 = java.util.Locale.US
            int r9 = r32.size()
            int r10 = r1.size()
            java.lang.String r11 = "The number of auxiliary track types from metadata ("
            java.lang.String r12 = ") is not same as the number of editable video tracks ("
            java.lang.String r13 = ")"
            java.lang.String r9 = N.e.v(r11, r9, r12, r10, r13)
            P0.l.i(r9, r5)
        L_0x0659:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = r9
            r5 = -1
            r11 = 0
            r12 = 0
        L_0x0662:
            int r15 = r1.size()
            if (r11 >= r15) goto L_0x07eb
            java.lang.Object r15 = r1.get(r11)
            J1.u r15 = (J1.u) r15
            int r3 = r15.f2487b
            if (r3 != 0) goto L_0x0689
            r22 = r1
            r24 = r6
            r16 = r8
            r27 = r12
            r12 = r31
            r3 = r32
            r1 = 1
            r6 = -1
            r7 = 3
            r31 = r0
            r32 = r2
            r0 = r30
            goto L_0x07ce
        L_0x0689:
            J1.r r3 = r15.f2486a
            r16 = r8
            long r7 = r3.e
            int r17 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r17 == 0) goto L_0x0694
            goto L_0x0696
        L_0x0694:
            long r7 = r15.f2492h
        L_0x0696:
            long r13 = java.lang.Math.max(r13, r7)
            J1.m r9 = new J1.m
            p1.q r10 = r4.z
            r22 = 1
            int r27 = r12 + 1
            r22 = r1
            int r1 = r3.f2458b
            p1.G r10 = r10.q(r12, r1)
            r9.<init>(r3, r15, r10)
            M0.r r3 = r3.f2462g
            java.lang.String r10 = r3.f3036n
            java.lang.String r12 = "audio/true-hd"
            boolean r10 = r12.equals(r10)
            int r12 = r15.e
            if (r10 == 0) goto L_0x06c0
            r10 = 16
            int r12 = r12 * 16
            goto L_0x06c4
        L_0x06c0:
            r10 = 16
            int r12 = r12 + 30
        L_0x06c4:
            M0.q r10 = r3.a()
            r10.f3000n = r12
            r12 = 2
            if (r1 != r12) goto L_0x0717
            r12 = 8
            r24 = r6 & 8
            int r12 = r3.f3029f
            if (r24 == 0) goto L_0x06df
            r24 = r6
            r6 = -1
            if (r5 != r6) goto L_0x06dc
            r6 = 1
            goto L_0x06dd
        L_0x06dc:
            r6 = 2
        L_0x06dd:
            r12 = r12 | r6
            goto L_0x06e1
        L_0x06df:
            r24 = r6
        L_0x06e1:
            float r3 = r3.f3045w
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x06fa
            int r3 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x06fa
            int r3 = r15.f2487b
            if (r3 <= 0) goto L_0x06fa
            float r3 = (float) r3
            float r6 = (float) r7
            r7 = 1232348160(0x49742400, float:1000000.0)
            float r6 = r6 / r7
            float r3 = r3 / r6
            r10.f3008v = r3
        L_0x06fa:
            boolean r3 = r4.f2448x
            if (r3 == 0) goto L_0x0711
            r3 = 32768(0x8000, float:4.5918E-41)
            r12 = r12 | r3
            r3 = r32
            java.lang.Object r6 = r3.get(r11)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r10.f2994g = r6
            goto L_0x0713
        L_0x0711:
            r3 = r32
        L_0x0713:
            r10.f2993f = r12
        L_0x0715:
            r6 = 1
            goto L_0x071c
        L_0x0717:
            r24 = r6
            r3 = r32
            goto L_0x0715
        L_0x071c:
            if (r1 != r6) goto L_0x072b
            int r6 = r2.f14435a
            r7 = -1
            if (r6 == r7) goto L_0x072b
            int r8 = r2.f14436b
            if (r8 == r7) goto L_0x072b
            r10.f2982E = r6
            r10.f2983F = r8
        L_0x072b:
            java.util.ArrayList r6 = r4.i
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x0736
            r6 = 0
        L_0x0734:
            r7 = 3
            goto L_0x073d
        L_0x0736:
            M0.H r7 = new M0.H
            r7.<init>((java.util.List) r6)
            r6 = r7
            goto L_0x0734
        L_0x073d:
            M0.H[] r8 = new M0.H[r7]
            r7 = 0
            r8[r7] = r6
            r6 = 1
            r8[r6] = r16
            r6 = 2
            r8[r6] = r0
            M0.H r6 = new M0.H
            M0.G[] r12 = new M0.G[r7]
            r6.<init>((M0.G[]) r12)
            if (r31 == 0) goto L_0x079a
            r12 = r31
            r7 = 0
        L_0x0754:
            M0.G[] r15 = r12.f2837U
            r31 = r0
            int r0 = r15.length
            if (r7 >= r0) goto L_0x0796
            r0 = r15[r7]
            boolean r15 = r0 instanceof Q0.a
            if (r15 == 0) goto L_0x078d
            Q0.a r0 = (Q0.a) r0
            java.lang.String r15 = r0.f4009U
            r32 = r2
            java.lang.String r2 = "com.android.capture.fps"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x0781
            r2 = 2
            if (r1 != r2) goto L_0x077f
            r2 = 1
            M0.G[] r15 = new M0.G[r2]
            r25 = 0
            r15[r25] = r0
            M0.H r0 = r6.k(r15)
        L_0x077d:
            r6 = r0
            goto L_0x0790
        L_0x077f:
            r2 = 1
            goto L_0x0790
        L_0x0781:
            r2 = 1
            r25 = 0
            M0.G[] r15 = new M0.G[r2]
            r15[r25] = r0
            M0.H r0 = r6.k(r15)
            goto L_0x077d
        L_0x078d:
            r32 = r2
            goto L_0x077f
        L_0x0790:
            int r7 = r7 + r2
            r0 = r31
            r2 = r32
            goto L_0x0754
        L_0x0796:
            r32 = r2
            r2 = 1
            goto L_0x07a1
        L_0x079a:
            r32 = r2
            r12 = r31
            r2 = 1
            r31 = r0
        L_0x07a1:
            r0 = 0
            r7 = 3
        L_0x07a3:
            if (r0 >= r7) goto L_0x07ad
            r15 = r8[r0]
            M0.H r6 = r6.v(r15)
            int r0 = r0 + r2
            goto L_0x07a3
        L_0x07ad:
            M0.G[] r0 = r6.f2837U
            int r0 = r0.length
            if (r0 <= 0) goto L_0x07b4
            r10.f2997k = r6
        L_0x07b4:
            M0.r r0 = new M0.r
            r0.<init>(r10)
            p1.G r2 = r9.f2419c
            r2.c(r0)
            r0 = 2
            r6 = -1
            if (r1 != r0) goto L_0x07c8
            if (r5 != r6) goto L_0x07c8
            int r5 = r30.size()
        L_0x07c8:
            r0 = r30
            r0.add(r9)
            r1 = 1
        L_0x07ce:
            int r11 = r11 + r1
            r30 = r0
            r8 = r16
            r1 = r22
            r6 = r24
            r0 = r31
            r2 = r32
            r7 = 4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r32 = r3
            r31 = r12
            r12 = r27
            r3 = 12
            goto L_0x0662
        L_0x07eb:
            r0 = r30
            r6 = -1
            r7 = 3
            r4.f2423C = r5
            r4.f2424D = r13
            r1 = 0
            J1.m[] r2 = new J1.m[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            J1.m[] r0 = (J1.m[]) r0
            r4.f2421A = r0
            int r1 = r0.length
            long[][] r1 = new long[r1][]
            int r2 = r0.length
            int[] r2 = new int[r2]
            int r3 = r0.length
            long[] r3 = new long[r3]
            int r5 = r0.length
            boolean[] r5 = new boolean[r5]
            r15 = 0
        L_0x080b:
            int r8 = r0.length
            if (r15 >= r8) goto L_0x0826
            r8 = r0[r15]
            J1.u r8 = r8.f2418b
            int r8 = r8.f2487b
            long[] r8 = new long[r8]
            r1[r15] = r8
            r8 = r0[r15]
            J1.u r8 = r8.f2418b
            long[] r8 = r8.f2490f
            r9 = 0
            r10 = r8[r9]
            r3[r15] = r10
            r8 = 1
            int r15 = r15 + r8
            goto L_0x080b
        L_0x0826:
            r15 = 0
        L_0x0827:
            int r8 = r0.length
            if (r15 >= r8) goto L_0x0867
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r8
            r8 = -1
            r11 = 0
        L_0x0832:
            int r12 = r0.length
            if (r11 >= r12) goto L_0x0844
            boolean r12 = r5[r11]
            if (r12 != 0) goto L_0x0841
            r12 = r3[r11]
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 > 0) goto L_0x0841
            r8 = r11
            r9 = r12
        L_0x0841:
            r12 = 1
            int r11 = r11 + r12
            goto L_0x0832
        L_0x0844:
            r12 = 1
            r9 = r2[r8]
            r10 = r1[r8]
            r10[r9] = r19
            r11 = r0[r8]
            J1.u r11 = r11.f2418b
            int[] r13 = r11.f2489d
            r13 = r13[r9]
            long r13 = (long) r13
            long r19 = r19 + r13
            int r9 = r9 + r12
            r2[r8] = r9
            int r10 = r10.length
            if (r9 >= r10) goto L_0x0863
            long[] r10 = r11.f2490f
            r9 = r10[r9]
            r3[r8] = r9
            goto L_0x0827
        L_0x0863:
            r5[r8] = r12
            int r15 = r15 + r12
            goto L_0x0827
        L_0x0867:
            r12 = 1
            r4.f2422B = r1
            p1.q r0 = r4.z
            r0.g()
            p1.q r0 = r4.z
            r0.l(r4)
        L_0x0874:
            r28.clear()
            boolean r0 = r4.f2446v
            if (r0 != 0) goto L_0x0895
            r0 = 2
            r4.f2435k = r0
            goto L_0x0895
        L_0x087f:
            r4 = r1
            r28 = r9
            r7 = 3
            r12 = 1
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L_0x0895
            java.lang.Object r0 = r28.peek()
            Q0.b r0 = (Q0.b) r0
            java.util.ArrayList r0 = r0.f4015Y
            r0.add(r11)
        L_0x0895:
            r1 = r4
            goto L_0x0002
        L_0x0898:
            r4 = r1
            int r0 = r4.f2435k
            r1 = 2
            if (r0 == r1) goto L_0x08a3
            r0 = 0
            r4.f2435k = r0
            r4.f2438n = r0
        L_0x08a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.n.m(long):void");
    }

    public final void release() {
    }
}
