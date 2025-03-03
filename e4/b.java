package e4;

import M3.j;
import M3.l;
import M3.n;

public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final l[] f11260a = new l[0];

    public static int c(n nVar, n nVar2) {
        if (nVar == null || nVar2 == null) {
            return 0;
        }
        return (int) Math.abs(nVar.f3164a - nVar2.f3164a);
    }

    public static int d(n nVar, n nVar2) {
        if (nVar == null || nVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(nVar.f3164a - nVar2.f3164a);
    }

    public final void a() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: f4.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0153, code lost:
        if (r13.f2951f != r8.f2951f) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0666, code lost:
        r1 = new M3.l(r0.f4515b, (byte[]) null, r6, M3.a.f3116e0);
        r1.b(M3.m.f3155W, r0.f4517d);
        r0 = (e4.c) r0.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x067b, code lost:
        if (r0 == null) goto L_0x0682;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x067d, code lost:
        r1.b(M3.m.f3160b0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0682, code lost:
        r12 = r34;
        r12.add(r1);
        r3 = r12;
        r5 = r26;
        r4 = r30;
        r1 = 2;
        r2 = 1;
        r7 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x06c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M3.l b(A1.d r37, java.util.EnumMap r38) {
        /*
            r36 = this;
            r1 = 2
            r2 = 1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            S3.b r4 = r37.x()
            java.util.ArrayList r5 = h4.C1079a.a(r4)
            boolean r6 = r5.isEmpty()
            r7 = 0
            if (r6 == 0) goto L_0x0067
            S3.b r5 = new S3.b
            int[] r6 = r4.f4508X
            java.lang.Object r6 = r6.clone()
            int[] r6 = (int[]) r6
            int r8 = r4.f4505U
            int r9 = r4.f4506V
            int r4 = r4.f4507W
            r5.<init>(r8, r9, r4, r6)
            S3.a r4 = new S3.a
            r4.<init>(r8)
            S3.a r6 = new S3.a
            r6.<init>(r8)
            int r8 = r9 + 1
            int r8 = r8 / r1
            r10 = 0
        L_0x0037:
            if (r10 >= r8) goto L_0x005e
            S3.a r4 = r5.d(r4, r10)
            int r11 = r9 + -1
            int r11 = r11 - r10
            S3.a r6 = r5.d(r6, r11)
            r4.e()
            r6.e()
            int[] r12 = r6.f4503U
            int r13 = r5.f4507W
            int r14 = r10 * r13
            int[] r15 = r5.f4508X
            java.lang.System.arraycopy(r12, r7, r15, r14, r13)
            int[] r12 = r4.f4503U
            int r11 = r11 * r13
            java.lang.System.arraycopy(r12, r7, r15, r11, r13)
            int r10 = r10 + r2
            goto L_0x0037
        L_0x005e:
            java.util.ArrayList r4 = h4.C1079a.a(r5)
            r35 = r5
            r5 = r4
            r4 = r35
        L_0x0067:
            java.util.Iterator r5 = r5.iterator()
        L_0x006b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x06cb
            java.lang.Object r6 = r5.next()
            M3.n[] r6 = (M3.n[]) r6
            r16 = 4
            r14 = r6[r16]
            r17 = 5
            r11 = r6[r17]
            r18 = 6
            r15 = r6[r18]
            r19 = 7
            r13 = r6[r19]
            r8 = r6[r7]
            int r8 = d(r8, r14)
            r9 = r6[r18]
            r10 = r6[r1]
            int r9 = d(r9, r10)
            int r9 = r9 * 17
            int r9 = r9 / 18
            int r8 = java.lang.Math.min(r8, r9)
            r9 = r6[r2]
            r10 = r6[r17]
            int r9 = d(r9, r10)
            r10 = r6[r19]
            r20 = 3
            r12 = r6[r20]
            int r10 = d(r10, r12)
            int r10 = r10 * 17
            int r10 = r10 / 18
            int r9 = java.lang.Math.min(r9, r10)
            int r21 = java.lang.Math.min(r8, r9)
            r8 = r6[r7]
            r9 = r6[r16]
            int r8 = c(r8, r9)
            r9 = r6[r18]
            r10 = r6[r1]
            int r9 = c(r9, r10)
            int r9 = r9 * 17
            int r9 = r9 / 18
            int r8 = java.lang.Math.max(r8, r9)
            r9 = r6[r2]
            r10 = r6[r17]
            int r9 = c(r9, r10)
            r10 = r6[r19]
            r12 = r6[r20]
            int r10 = c(r10, r12)
            int r10 = r10 * 17
            int r10 = r10 / 18
            int r9 = java.lang.Math.max(r9, r10)
            int r22 = java.lang.Math.max(r8, r9)
            Z1.c r8 = f4.f.f11685a
            f4.b r23 = new f4.b
            r8 = r23
            r9 = r4
            r10 = r14
            r12 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r13 = 0
            r8 = r13
            r12 = r23
            r24 = 1
            r23 = r8
        L_0x0103:
            if (r14 == 0) goto L_0x0116
            r11 = 1
            r8 = r4
            r9 = r12
            r10 = r14
            r37 = r12
            r12 = r21
            r13 = r22
            f4.d r8 = f4.f.d(r8, r9, r10, r11, r12, r13)
        L_0x0113:
            r25 = r8
            goto L_0x0119
        L_0x0116:
            r37 = r12
            goto L_0x0113
        L_0x0119:
            if (r15 == 0) goto L_0x012a
            r11 = 0
            r8 = r4
            r9 = r37
            r10 = r15
            r12 = r21
            r13 = r22
            f4.d r8 = f4.f.d(r8, r9, r10, r11, r12, r13)
            r23 = r8
        L_0x012a:
            if (r25 != 0) goto L_0x0131
            if (r23 != 0) goto L_0x0131
        L_0x012e:
            r1 = 0
            goto L_0x0191
        L_0x0131:
            if (r25 == 0) goto L_0x0157
            M0.h r13 = r25.Z()
            if (r13 != 0) goto L_0x013a
            goto L_0x0157
        L_0x013a:
            if (r23 == 0) goto L_0x015e
            M0.h r8 = r23.Z()
            if (r8 != 0) goto L_0x0143
            goto L_0x015e
        L_0x0143:
            int r9 = r13.f2948b
            int r10 = r8.f2948b
            if (r9 == r10) goto L_0x015e
            int r9 = r13.f2949c
            int r10 = r8.f2949c
            if (r9 == r10) goto L_0x015e
            int r9 = r13.f2951f
            int r8 = r8.f2951f
            if (r9 == r8) goto L_0x015e
        L_0x0155:
            r13 = 0
            goto L_0x015e
        L_0x0157:
            if (r23 != 0) goto L_0x015a
            goto L_0x0155
        L_0x015a:
            M0.h r13 = r23.Z()
        L_0x015e:
            if (r13 != 0) goto L_0x0161
            goto L_0x012e
        L_0x0161:
            f4.b r8 = f4.f.a(r25)
            f4.b r9 = f4.f.a(r23)
            if (r8 != 0) goto L_0x016d
            r8 = r9
            goto L_0x018c
        L_0x016d:
            if (r9 != 0) goto L_0x0170
            goto L_0x018c
        L_0x0170:
            f4.b r10 = new f4.b
            M3.n r11 = r8.f11674b
            M3.n r12 = r8.f11675c
            S3.b r8 = r8.f11673a
            M3.n r1 = r9.f11676d
            M3.n r9 = r9.e
            r26 = r10
            r27 = r8
            r28 = r11
            r29 = r12
            r30 = r1
            r31 = r9
            r26.<init>(r27, r28, r29, r30, r31)
            r8 = r10
        L_0x018c:
            P0.q r1 = new P0.q
            r1.<init>((M0.C0120h) r13, (f4.C0901b) r8)
        L_0x0191:
            if (r1 == 0) goto L_0x06c8
            java.lang.Object r8 = r1.e
            r12 = r8
            f4.b r12 = (f4.C0901b) r12
            r13 = r37
            int r11 = r13.i
            int r10 = r13.f11679h
            if (r24 == 0) goto L_0x01b2
            if (r12 == 0) goto L_0x01b2
            int r8 = r12.f11679h
            if (r8 < r10) goto L_0x01aa
            int r8 = r12.i
            if (r8 <= r11) goto L_0x01b2
        L_0x01aa:
            r8 = r25
            r1 = 2
            r13 = 0
            r24 = 0
            goto L_0x0103
        L_0x01b2:
            r1.e = r13
            int r15 = r1.f3727b
            int r14 = r15 + 1
            java.lang.Object r8 = r1.f3729d
            r12 = r8
            de.ozerov.fully.K2[] r12 = (de.ozerov.fully.K2[]) r12
            r12[r7] = r25
            r12[r14] = r23
            if (r25 == 0) goto L_0x01c6
            r23 = 1
            goto L_0x01c8
        L_0x01c6:
            r23 = 0
        L_0x01c8:
            r9 = 1
        L_0x01c9:
            if (r9 > r14) goto L_0x0360
            if (r23 == 0) goto L_0x01cf
            r8 = r9
            goto L_0x01d1
        L_0x01cf:
            int r8 = r14 - r9
        L_0x01d1:
            r24 = r12[r8]
            if (r24 != 0) goto L_0x0338
            if (r8 == 0) goto L_0x01e0
            if (r8 != r14) goto L_0x01da
            goto L_0x01e0
        L_0x01da:
            de.ozerov.fully.K2 r7 = new de.ozerov.fully.K2
            r7.<init>((f4.C0901b) r13)
            goto L_0x01ea
        L_0x01e0:
            f4.d r7 = new f4.d
            if (r8 != 0) goto L_0x01e6
            r0 = 1
            goto L_0x01e7
        L_0x01e6:
            r0 = 0
        L_0x01e7:
            r7.<init>(r13, r0)
        L_0x01ea:
            r12[r8] = r7
            r2 = r10
            r0 = r21
            r21 = r22
            r32 = -1
        L_0x01f3:
            if (r2 > r11) goto L_0x031f
            r26 = r5
            if (r23 == 0) goto L_0x01fc
            r22 = 1
            goto L_0x01fe
        L_0x01fc:
            r22 = -1
        L_0x01fe:
            int r5 = r8 - r22
            r27 = r9
            if (r5 < 0) goto L_0x0219
            r25 = 1
            int r9 = r15 + 1
            if (r5 > r9) goto L_0x0219
            r9 = r12[r5]
            r28 = r10
            java.lang.Object r10 = r9.f10051W
            M0.h[] r10 = (M0.C0120h[]) r10
            int r9 = r9.D(r2)
            r9 = r10[r9]
            goto L_0x021c
        L_0x0219:
            r28 = r10
            r9 = 0
        L_0x021c:
            if (r9 == 0) goto L_0x0229
            if (r23 == 0) goto L_0x0226
            int r5 = r9.f2949c
        L_0x0222:
            r29 = r8
            goto L_0x029a
        L_0x0226:
            int r5 = r9.f2948b
            goto L_0x0222
        L_0x0229:
            r9 = r12[r8]
            M0.h r9 = r9.x(r2)
            if (r9 == 0) goto L_0x0239
            if (r23 == 0) goto L_0x0236
            int r5 = r9.f2948b
            goto L_0x0222
        L_0x0236:
            int r5 = r9.f2949c
            goto L_0x0222
        L_0x0239:
            r29 = r8
            if (r5 < 0) goto L_0x0248
            r10 = 1
            int r8 = r15 + 1
            if (r5 > r8) goto L_0x0248
            r5 = r12[r5]
            M0.h r9 = r5.x(r2)
        L_0x0248:
            if (r9 == 0) goto L_0x0252
            if (r23 == 0) goto L_0x024f
            int r5 = r9.f2949c
            goto L_0x029a
        L_0x024f:
            int r5 = r9.f2948b
            goto L_0x029a
        L_0x0252:
            r8 = r29
            r5 = 0
        L_0x0255:
            int r8 = r8 - r22
            if (r8 < 0) goto L_0x028b
            r9 = 1
            int r10 = r15 + 1
            if (r8 > r10) goto L_0x028b
            r9 = r12[r8]
            java.lang.Object r9 = r9.f10051W
            M0.h[] r9 = (M0.C0120h[]) r9
            int r10 = r9.length
            r30 = r8
            r8 = 0
        L_0x0268:
            if (r8 >= r10) goto L_0x0286
            r31 = r10
            r10 = r9[r8]
            if (r10 == 0) goto L_0x0281
            int r8 = r10.f2948b
            int r9 = r10.f2949c
            if (r23 == 0) goto L_0x0278
            r10 = r9
            goto L_0x0279
        L_0x0278:
            r10 = r8
        L_0x0279:
            int r22 = r22 * r5
            int r9 = r9 - r8
            int r9 = r9 * r22
            int r5 = r9 + r10
            goto L_0x029a
        L_0x0281:
            r10 = 1
            int r8 = r8 + r10
            r10 = r31
            goto L_0x0268
        L_0x0286:
            r10 = 1
            int r5 = r5 + r10
            r8 = r30
            goto L_0x0255
        L_0x028b:
            if (r23 == 0) goto L_0x0294
            java.lang.Object r5 = r1.e
            f4.b r5 = (f4.C0901b) r5
            int r5 = r5.f11677f
            goto L_0x029a
        L_0x0294:
            java.lang.Object r5 = r1.e
            f4.b r5 = (f4.C0901b) r5
            int r5 = r5.f11678g
        L_0x029a:
            if (r5 < 0) goto L_0x02a0
            int r8 = r13.f11678g
            if (r5 <= r8) goto L_0x02a4
        L_0x02a0:
            r5 = r32
            r8 = -1
            goto L_0x02ab
        L_0x02a4:
            r35 = r32
            r32 = r5
            r5 = r35
            goto L_0x02af
        L_0x02ab:
            if (r5 == r8) goto L_0x02f3
            r32 = r5
        L_0x02af:
            int r9 = r13.f11677f
            int r10 = r13.f11678g
            r22 = r29
            r8 = r4
            r29 = r11
            r11 = r23
            r30 = r4
            r4 = r12
            r12 = r32
            r31 = r13
            r13 = r2
            r33 = r5
            r5 = r14
            r14 = r0
            r34 = r3
            r3 = r15
            r15 = r21
            M0.h r8 = f4.f.c(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r8 == 0) goto L_0x02f0
            java.lang.Object r9 = r7.f10051W
            M0.h[] r9 = (M0.C0120h[]) r9
            int r10 = r7.D(r2)
            r9[r10] = r8
            int r9 = r8.f2949c
            int r8 = r8.f2948b
            int r10 = r9 - r8
            int r0 = java.lang.Math.min(r0, r10)
            int r9 = r9 - r8
            r8 = r21
            int r8 = java.lang.Math.max(r8, r9)
            r21 = r8
        L_0x02ee:
            r9 = 1
            goto L_0x0309
        L_0x02f0:
            r8 = r21
            goto L_0x0304
        L_0x02f3:
            r34 = r3
            r30 = r4
            r33 = r5
            r4 = r12
            r31 = r13
            r5 = r14
            r3 = r15
            r8 = r21
            r22 = r29
            r29 = r11
        L_0x0304:
            r21 = r8
            r32 = r33
            goto L_0x02ee
        L_0x0309:
            int r2 = r2 + r9
            r15 = r3
            r12 = r4
            r14 = r5
            r8 = r22
            r5 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r4 = r30
            r13 = r31
            r3 = r34
            goto L_0x01f3
        L_0x031f:
            r34 = r3
            r30 = r4
            r26 = r5
            r27 = r9
            r28 = r10
            r29 = r11
            r4 = r12
            r31 = r13
            r5 = r14
            r3 = r15
            r8 = r21
            r9 = 1
            r21 = r0
            r22 = r8
            goto L_0x034a
        L_0x0338:
            r34 = r3
            r30 = r4
            r26 = r5
            r27 = r9
            r28 = r10
            r29 = r11
            r4 = r12
            r31 = r13
            r5 = r14
            r3 = r15
            r9 = 1
        L_0x034a:
            int r0 = r27 + 1
            r9 = r0
            r15 = r3
            r12 = r4
            r14 = r5
            r5 = r26
            r10 = r28
            r11 = r29
            r4 = r30
            r13 = r31
            r3 = r34
            r2 = 1
            r7 = 0
            goto L_0x01c9
        L_0x0360:
            r34 = r3
            r30 = r4
            r26 = r5
            r4 = r12
            r5 = r14
            r3 = r15
            r9 = 1
            java.lang.Object r0 = r1.f3728c
            M0.h r0 = (M0.C0120h) r0
            r2 = 2
            int r15 = r3 + 2
            int[] r7 = new int[r2]
            r7[r9] = r15
            int r2 = r0.f2951f
            r8 = 0
            r7[r8] = r2
            java.lang.Class<f4.a> r8 = f4.C0900a.class
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r8, r7)
            f4.a[][] r7 = (f4.C0900a[][]) r7
            r8 = 0
        L_0x0383:
            int r9 = r7.length
            if (r8 >= r9) goto L_0x0399
            r9 = 0
        L_0x0387:
            r10 = r7[r8]
            int r11 = r10.length
            if (r9 >= r11) goto L_0x0396
            f4.a r11 = new f4.a
            r11.<init>()
            r10[r9] = r11
            r10 = 1
            int r9 = r9 + r10
            goto L_0x0387
        L_0x0396:
            r10 = 1
            int r8 = r8 + r10
            goto L_0x0383
        L_0x0399:
            r8 = 0
            r9 = r4[r8]
            r1.d(r9)
            r9 = r4[r5]
            r1.d(r9)
            r9 = 928(0x3a0, float:1.3E-42)
        L_0x03a6:
            r10 = r4[r8]
            if (r10 == 0) goto L_0x03f5
            r8 = r4[r5]
            if (r8 != 0) goto L_0x03af
            goto L_0x03f5
        L_0x03af:
            r11 = 0
        L_0x03b0:
            java.lang.Object r12 = r10.f10051W
            M0.h[] r12 = (M0.C0120h[]) r12
            int r13 = r12.length
            if (r11 >= r13) goto L_0x03f5
            r13 = r12[r11]
            if (r13 == 0) goto L_0x03f1
            java.lang.Object r14 = r8.f10051W
            M0.h[] r14 = (M0.C0120h[]) r14
            r14 = r14[r11]
            if (r14 == 0) goto L_0x03f1
            int r13 = r13.f2951f
            int r14 = r14.f2951f
            if (r13 != r14) goto L_0x03f1
            r13 = 1
        L_0x03ca:
            if (r13 > r3) goto L_0x03f1
            r14 = r4[r13]
            java.lang.Object r14 = r14.f10051W
            M0.h[] r14 = (M0.C0120h[]) r14
            r14 = r14[r11]
            if (r14 == 0) goto L_0x03ed
            r15 = r12[r11]
            int r15 = r15.f2951f
            r14.f2951f = r15
            boolean r14 = r14.d(r15)
            if (r14 != 0) goto L_0x03ed
            r14 = r4[r13]
            java.lang.Object r14 = r14.f10051W
            M0.h[] r14 = (M0.C0120h[]) r14
            r15 = 0
            r14[r11] = r15
        L_0x03eb:
            r14 = 1
            goto L_0x03ef
        L_0x03ed:
            r15 = 0
            goto L_0x03eb
        L_0x03ef:
            int r13 = r13 + r14
            goto L_0x03ca
        L_0x03f1:
            r14 = 1
            r15 = 0
            int r11 = r11 + r14
            goto L_0x03b0
        L_0x03f5:
            r15 = 0
            r8 = 0
            r10 = r4[r8]
            if (r10 != 0) goto L_0x03fd
            r11 = 0
            goto L_0x0448
        L_0x03fd:
            r8 = 0
            r11 = 0
        L_0x03ff:
            java.lang.Object r12 = r10.f10051W
            M0.h[] r12 = (M0.C0120h[]) r12
            int r13 = r12.length
            if (r8 >= r13) goto L_0x0448
            r12 = r12[r8]
            if (r12 == 0) goto L_0x0444
            int r12 = r12.f2951f
            r13 = r11
            r11 = 0
            r14 = 1
        L_0x040f:
            if (r14 >= r5) goto L_0x0441
            r15 = 2
            if (r11 >= r15) goto L_0x0441
            r15 = r4[r14]
            java.lang.Object r15 = r15.f10051W
            M0.h[] r15 = (M0.C0120h[]) r15
            r15 = r15[r8]
            if (r15 == 0) goto L_0x043d
            int r1 = r15.f2951f
            boolean r1 = r15.d(r1)
            if (r1 != 0) goto L_0x0432
            boolean r1 = r15.d(r12)
            if (r1 == 0) goto L_0x0430
            r15.f2951f = r12
            r11 = 0
            goto L_0x0432
        L_0x0430:
            r1 = 1
            int r11 = r11 + r1
        L_0x0432:
            int r1 = r15.f2951f
            boolean r1 = r15.d(r1)
            if (r1 != 0) goto L_0x043d
            r1 = 1
            int r13 = r13 + r1
            goto L_0x043e
        L_0x043d:
            r1 = 1
        L_0x043e:
            int r14 = r14 + r1
            r15 = 0
            goto L_0x040f
        L_0x0441:
            r1 = 1
            r11 = r13
            goto L_0x0445
        L_0x0444:
            r1 = 1
        L_0x0445:
            int r8 = r8 + r1
            r15 = 0
            goto L_0x03ff
        L_0x0448:
            r1 = r4[r5]
            if (r1 != 0) goto L_0x044e
            r10 = 0
            goto L_0x04a3
        L_0x044e:
            r8 = 0
            r10 = 0
        L_0x0450:
            java.lang.Object r12 = r1.f10051W
            M0.h[] r12 = (M0.C0120h[]) r12
            int r13 = r12.length
            if (r8 >= r13) goto L_0x04a3
            r12 = r12[r8]
            if (r12 == 0) goto L_0x049c
            int r12 = r12.f2951f
            r14 = r5
            r13 = r10
            r10 = 0
        L_0x0460:
            if (r14 <= 0) goto L_0x0497
            r15 = 2
            if (r10 >= r15) goto L_0x0497
            r15 = r4[r14]
            java.lang.Object r15 = r15.f10051W
            M0.h[] r15 = (M0.C0120h[]) r15
            r15 = r15[r8]
            r22 = r1
            if (r15 == 0) goto L_0x0491
            int r1 = r15.f2951f
            boolean r1 = r15.d(r1)
            if (r1 != 0) goto L_0x0485
            boolean r1 = r15.d(r12)
            if (r1 == 0) goto L_0x0483
            r15.f2951f = r12
            r10 = 0
            goto L_0x0485
        L_0x0483:
            r1 = 1
            int r10 = r10 + r1
        L_0x0485:
            int r1 = r15.f2951f
            boolean r1 = r15.d(r1)
            if (r1 != 0) goto L_0x0491
            r1 = 1
            int r13 = r13 + r1
        L_0x048f:
            r15 = -1
            goto L_0x0493
        L_0x0491:
            r1 = 1
            goto L_0x048f
        L_0x0493:
            int r14 = r14 + r15
            r1 = r22
            goto L_0x0460
        L_0x0497:
            r22 = r1
            r1 = 1
            r10 = r13
            goto L_0x049f
        L_0x049c:
            r22 = r1
            r1 = 1
        L_0x049f:
            int r8 = r8 + r1
            r1 = r22
            goto L_0x0450
        L_0x04a3:
            int r1 = r11 + r10
            if (r1 != 0) goto L_0x04aa
            r1 = 0
            goto L_0x057c
        L_0x04aa:
            r8 = 1
        L_0x04ab:
            if (r8 >= r5) goto L_0x057a
            r10 = r4[r8]
            java.lang.Object r10 = r10.f10051W
            M0.h[] r10 = (M0.C0120h[]) r10
            r11 = 0
        L_0x04b4:
            int r12 = r10.length
            if (r11 >= r12) goto L_0x0572
            r12 = r10[r11]
            if (r12 == 0) goto L_0x056a
            int r13 = r12.f2951f
            boolean r12 = r12.d(r13)
            if (r12 != 0) goto L_0x056a
            r12 = r10[r11]
            r13 = 1
            int r14 = r8 + -1
            r14 = r4[r14]
            java.lang.Object r14 = r14.f10051W
            M0.h[] r14 = (M0.C0120h[]) r14
            int r15 = r8 + 1
            r13 = r4[r15]
            if (r13 == 0) goto L_0x04d9
            java.lang.Object r13 = r13.f10051W
            M0.h[] r13 = (M0.C0120h[]) r13
            goto L_0x04da
        L_0x04d9:
            r13 = r14
        L_0x04da:
            r15 = 14
            r22 = r1
            M0.h[] r1 = new M0.C0120h[r15]
            r23 = r14[r11]
            r27 = 2
            r1[r27] = r23
            r23 = r13[r11]
            r1[r20] = r23
            r15 = 1
            if (r11 <= 0) goto L_0x04fd
            int r25 = r11 + -1
            r27 = r10[r25]
            r28 = 0
            r1[r28] = r27
            r27 = r14[r25]
            r1[r16] = r27
            r25 = r13[r25]
            r1[r17] = r25
        L_0x04fd:
            if (r11 <= r15) goto L_0x0514
            r15 = 2
            int r27 = r11 + -2
            r15 = r10[r27]
            r28 = 8
            r1[r28] = r15
            r15 = 10
            r28 = r14[r27]
            r1[r15] = r28
            r15 = 11
            r27 = r13[r27]
            r1[r15] = r27
        L_0x0514:
            int r15 = r10.length
            r25 = 1
            int r15 = r15 + -1
            if (r11 >= r15) goto L_0x0529
            int r15 = r11 + 1
            r27 = r10[r15]
            r1[r25] = r27
            r27 = r14[r15]
            r1[r18] = r27
            r15 = r13[r15]
            r1[r19] = r15
        L_0x0529:
            int r15 = r10.length
            r27 = 2
            int r15 = r15 + -2
            if (r11 >= r15) goto L_0x0544
            int r15 = r11 + 2
            r27 = r10[r15]
            r28 = 9
            r1[r28] = r27
            r27 = 12
            r14 = r14[r15]
            r1[r27] = r14
            r14 = 13
            r13 = r13[r15]
            r1[r14] = r13
        L_0x0544:
            r13 = 0
        L_0x0545:
            r14 = 14
            if (r13 >= r14) goto L_0x056c
            r15 = r1[r13]
            if (r15 != 0) goto L_0x0551
        L_0x054d:
            r27 = r1
        L_0x054f:
            r1 = 1
            goto L_0x0566
        L_0x0551:
            int r14 = r15.f2951f
            boolean r14 = r15.d(r14)
            if (r14 == 0) goto L_0x054d
            int r14 = r12.f2950d
            r27 = r1
            int r1 = r15.f2950d
            if (r1 != r14) goto L_0x054f
            int r1 = r15.f2951f
            r12.f2951f = r1
            goto L_0x056c
        L_0x0566:
            int r13 = r13 + r1
            r1 = r27
            goto L_0x0545
        L_0x056a:
            r22 = r1
        L_0x056c:
            r1 = 1
            int r11 = r11 + r1
            r1 = r22
            goto L_0x04b4
        L_0x0572:
            r22 = r1
            r1 = 1
            int r8 = r8 + r1
            r1 = r22
            goto L_0x04ab
        L_0x057a:
            r22 = r1
        L_0x057c:
            if (r1 <= 0) goto L_0x0585
            if (r1 < r9) goto L_0x0581
            goto L_0x0585
        L_0x0581:
            r9 = r1
            r8 = 0
            goto L_0x03a6
        L_0x0585:
            int r1 = r4.length
            r5 = 0
            r8 = 0
        L_0x0588:
            if (r5 >= r1) goto L_0x05b1
            r9 = r4[r5]
            if (r9 == 0) goto L_0x05ad
            java.lang.Object r9 = r9.f10051W
            M0.h[] r9 = (M0.C0120h[]) r9
            int r10 = r9.length
            r11 = 0
        L_0x0594:
            if (r11 >= r10) goto L_0x05ad
            r12 = r9[r11]
            if (r12 == 0) goto L_0x05aa
            int r13 = r12.f2951f
            if (r13 < 0) goto L_0x05aa
            int r14 = r7.length
            if (r13 >= r14) goto L_0x05aa
            r13 = r7[r13]
            r13 = r13[r8]
            int r12 = r12.e
            r13.b(r12)
        L_0x05aa:
            r12 = 1
            int r11 = r11 + r12
            goto L_0x0594
        L_0x05ad:
            r12 = 1
            int r8 = r8 + r12
            int r5 = r5 + r12
            goto L_0x0588
        L_0x05b1:
            r5 = 0
            r12 = 1
            r1 = r7[r5]
            r1 = r1[r12]
            int[] r4 = r1.a()
            int r15 = r3 * r2
            int r0 = r0.f2949c
            r5 = 2
            int r8 = r5 << r0
            int r8 = r15 - r8
            int r9 = r4.length
            if (r9 != 0) goto L_0x05d4
            if (r8 <= 0) goto L_0x05d1
            r9 = 928(0x3a0, float:1.3E-42)
            if (r8 > r9) goto L_0x05d1
            r1.b(r8)
            goto L_0x05e2
        L_0x05d1:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x05d4:
            r9 = 928(0x3a0, float:1.3E-42)
            r10 = 0
            r4 = r4[r10]
            if (r4 == r8) goto L_0x05e2
            if (r8 <= 0) goto L_0x05e2
            if (r8 > r9) goto L_0x05e2
            r1.b(r8)
        L_0x05e2:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int[] r4 = new int[r15]
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
        L_0x05f4:
            if (r10 >= r2) goto L_0x062c
            r11 = 0
        L_0x05f7:
            if (r11 >= r3) goto L_0x0629
            r12 = r7[r10]
            r13 = 1
            int r14 = r11 + 1
            r12 = r12[r14]
            int[] r12 = r12.a()
            int r15 = r10 * r3
            int r15 = r15 + r11
            int r11 = r12.length
            if (r11 != 0) goto L_0x0613
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r1.add(r11)
            r13 = 1
            goto L_0x0627
        L_0x0613:
            int r11 = r12.length
            r13 = 1
            if (r11 != r13) goto L_0x061d
            r11 = 0
            r12 = r12[r11]
            r4[r15] = r12
            goto L_0x0627
        L_0x061d:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r9.add(r11)
            r8.add(r12)
        L_0x0627:
            r11 = r14
            goto L_0x05f7
        L_0x0629:
            r13 = 1
            int r10 = r10 + r13
            goto L_0x05f4
        L_0x062c:
            r13 = 1
            int r2 = r8.size()
            int[][] r3 = new int[r2][]
            r7 = 0
        L_0x0634:
            if (r7 >= r2) goto L_0x0640
            java.lang.Object r10 = r8.get(r7)
            int[] r10 = (int[]) r10
            r3[r7] = r10
            int r7 = r7 + r13
            goto L_0x0634
        L_0x0640:
            int[] r1 = e4.C0839a.a(r1)
            int[] r2 = e4.C0839a.a(r9)
            int r7 = r2.length
            int[] r8 = new int[r7]
            r9 = 100
            r10 = -1
        L_0x064e:
            int r11 = r9 + -1
            if (r9 <= 0) goto L_0x06c3
            r9 = 0
        L_0x0653:
            if (r9 >= r7) goto L_0x0662
            r12 = r2[r9]
            r13 = r3[r9]
            r14 = r8[r9]
            r13 = r13[r14]
            r4[r12] = r13
            r12 = 1
            int r9 = r9 + r12
            goto L_0x0653
        L_0x0662:
            S3.d r0 = f4.f.b(r4, r0, r1)     // Catch:{ b -> 0x0691 }
            M3.l r1 = new M3.l
            M3.a r2 = M3.a.f3116e0
            java.lang.String r3 = r0.f4515b
            r9 = 0
            r1.<init>(r3, r9, r6, r2)
            M3.m r2 = M3.m.f3155W
            java.lang.String r3 = r0.f4517d
            r1.b(r2, r3)
            java.lang.Object r0 = r0.e
            e4.c r0 = (e4.c) r0
            if (r0 == 0) goto L_0x0682
            M3.m r2 = M3.m.f3160b0
            r1.b(r2, r0)
        L_0x0682:
            r12 = r34
            r12.add(r1)
            r3 = r12
            r5 = r26
            r4 = r30
            r1 = 2
            r2 = 1
            r7 = 0
            goto L_0x006b
        L_0x0691:
            r12 = r34
            r9 = 0
            if (r7 == 0) goto L_0x06be
            r13 = 0
        L_0x0697:
            if (r13 >= r7) goto L_0x06b8
            r14 = r8[r13]
            r15 = r3[r13]
            int r15 = r15.length
            r16 = 1
            int r15 = r15 + -1
            if (r14 >= r15) goto L_0x06a9
            int r14 = r14 + 1
            r8[r13] = r14
            goto L_0x06ba
        L_0x06a9:
            r14 = 0
            r8[r13] = r14
            int r14 = r7 + -1
            if (r13 == r14) goto L_0x06b3
            int r13 = r13 + 1
            goto L_0x0697
        L_0x06b3:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x06b8:
            r16 = 1
        L_0x06ba:
            r9 = r11
            r34 = r12
            goto L_0x064e
        L_0x06be:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x06c3:
            M3.b r0 = M3.b.a()
            throw r0
        L_0x06c8:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x06cb:
            r12 = r3
            M3.l[] r0 = f11260a
            java.lang.Object[] r0 = r12.toArray(r0)
            M3.l[] r0 = (M3.l[]) r0
            int r1 = r0.length
            if (r1 == 0) goto L_0x06dd
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L_0x06dd
            return r0
        L_0x06dd:
            M3.h r0 = M3.h.f3144W
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.b.b(A1.d, java.util.EnumMap):M3.l");
    }
}
