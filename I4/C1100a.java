package i4;

import M3.j;
import M3.n;
import W3.c;

/* renamed from: i4.a  reason: case insensitive filesystem */
public final class C1100a implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final n[] f12724b = new n[0];

    /* renamed from: a  reason: collision with root package name */
    public final c f12725a = new c(2);

    public final void a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0449  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M3.l b(A1.d r42, java.util.EnumMap r43) {
        /*
            r41 = this;
            r0 = r43
            r3 = r41
            W3.c r4 = r3.f12725a
            r6 = 5
            r7 = 0
            r9 = 1
            if (r0 == 0) goto L_0x00d9
            M3.c r10 = M3.c.f3125V
            boolean r10 = r0.containsKey(r10)
            if (r10 == 0) goto L_0x00d9
            S3.b r1 = r42.x()
            int[] r10 = r1.e()
            int[] r11 = r1.c()
            if (r10 == 0) goto L_0x00d6
            if (r11 == 0) goto L_0x00d6
            r12 = r10[r7]
            r13 = r10[r9]
            r14 = 1
            r15 = 0
        L_0x0029:
            int r2 = r1.f4505U
            int r8 = r1.f4506V
            if (r12 >= r2) goto L_0x003e
            if (r13 >= r8) goto L_0x003e
            boolean r5 = r1.b(r12, r13)
            if (r14 == r5) goto L_0x003b
            int r15 = r15 + r9
            if (r15 == r6) goto L_0x003e
            r14 = r14 ^ r9
        L_0x003b:
            int r12 = r12 + r9
            int r13 = r13 + r9
            goto L_0x0029
        L_0x003e:
            if (r12 == r2) goto L_0x00d3
            if (r13 == r8) goto L_0x00d3
            r5 = r10[r7]
            int r12 = r12 - r5
            float r6 = (float) r12
            r8 = 1088421888(0x40e00000, float:7.0)
            float r6 = r6 / r8
            r8 = r10[r9]
            r10 = r11[r9]
            r11 = r11[r7]
            if (r5 >= r11) goto L_0x00d0
            if (r8 >= r10) goto L_0x00d0
            int r12 = r10 - r8
            int r13 = r11 - r5
            if (r12 == r13) goto L_0x0061
            int r11 = r5 + r12
            if (r11 >= r2) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x0061:
            int r2 = r11 - r5
            int r2 = r2 + r9
            float r2 = (float) r2
            float r2 = r2 / r6
            int r2 = java.lang.Math.round(r2)
            int r12 = r12 + r9
            float r12 = (float) r12
            float r12 = r12 / r6
            int r12 = java.lang.Math.round(r12)
            if (r2 <= 0) goto L_0x00cd
            if (r12 <= 0) goto L_0x00cd
            if (r12 != r2) goto L_0x00ca
            r13 = 1073741824(0x40000000, float:2.0)
            float r13 = r6 / r13
            int r13 = (int) r13
            int r8 = r8 + r13
            int r5 = r5 + r13
            int r14 = r2 + -1
            float r14 = (float) r14
            float r14 = r14 * r6
            int r14 = (int) r14
            int r14 = r14 + r5
            int r14 = r14 - r11
            if (r14 <= 0) goto L_0x008f
            if (r14 > r13) goto L_0x008c
            int r5 = r5 - r14
            goto L_0x008f
        L_0x008c:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x008f:
            int r11 = r12 + -1
            float r11 = (float) r11
            float r11 = r11 * r6
            int r11 = (int) r11
            int r11 = r11 + r8
            int r11 = r11 - r10
            if (r11 <= 0) goto L_0x00a0
            if (r11 > r13) goto L_0x009d
            int r8 = r8 - r11
            goto L_0x00a0
        L_0x009d:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x00a0:
            S3.b r10 = new S3.b
            r10.<init>(r2, r12)
            r11 = 0
        L_0x00a6:
            if (r11 >= r12) goto L_0x00c2
            float r13 = (float) r11
            float r13 = r13 * r6
            int r13 = (int) r13
            int r13 = r13 + r8
            r14 = 0
        L_0x00ae:
            if (r14 >= r2) goto L_0x00c0
            float r15 = (float) r14
            float r15 = r15 * r6
            int r15 = (int) r15
            int r15 = r15 + r5
            boolean r15 = r1.b(r15, r13)
            if (r15 == 0) goto L_0x00be
            r10.f(r14, r11)
        L_0x00be:
            int r14 = r14 + r9
            goto L_0x00ae
        L_0x00c0:
            int r11 = r11 + r9
            goto L_0x00a6
        L_0x00c2:
            S3.d r0 = r4.c(r10, r0)
            M3.n[] r1 = f12724b
            goto L_0x0461
        L_0x00ca:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x00cd:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x00d0:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x00d3:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x00d6:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x00d9:
            de.ozerov.fully.K2 r2 = new de.ozerov.fully.K2
            S3.b r5 = r42.x()
            r2.<init>((S3.b) r5)
            if (r0 != 0) goto L_0x00e6
            r10 = 0
            goto L_0x00ee
        L_0x00e6:
            M3.c r10 = M3.c.f3133d0
            java.lang.Object r10 = r0.get(r10)
            M3.o r10 = (M3.o) r10
        L_0x00ee:
            r2.f10051W = r10
            k4.e r11 = new k4.e
            r11.<init>(r5, r10)
            if (r0 == 0) goto L_0x0101
            M3.c r10 = M3.c.f3127X
            boolean r10 = r0.containsKey(r10)
            if (r10 == 0) goto L_0x0101
            r10 = 1
            goto L_0x0102
        L_0x0101:
            r10 = 0
        L_0x0102:
            int r12 = r5.f4506V
            r13 = 3
            int r14 = r12 * 3
            int r14 = r14 / 388
            if (r14 < r13) goto L_0x010d
            if (r10 == 0) goto L_0x010e
        L_0x010d:
            r14 = 3
        L_0x010e:
            int[] r6 = new int[r6]
            int r10 = r14 + -1
            r13 = 0
        L_0x0113:
            java.util.ArrayList r15 = r11.f13044b
            if (r10 >= r12) goto L_0x022e
            if (r13 != 0) goto L_0x022e
            java.util.Arrays.fill(r6, r7)
            r8 = 0
        L_0x011d:
            int r1 = r5.f4505U
            if (r7 >= r1) goto L_0x020e
            boolean r19 = r5.b(r7, r10)
            if (r19 == 0) goto L_0x0134
            r1 = r8 & 1
            if (r1 != r9) goto L_0x012c
            int r8 = r8 + r9
        L_0x012c:
            r1 = r6[r8]
            int r1 = r1 + r9
            r6[r8] = r1
            r3 = 1
            goto L_0x0208
        L_0x0134:
            r19 = r8 & 1
            if (r19 != 0) goto L_0x0200
            r9 = 4
            if (r8 != r9) goto L_0x01f2
            boolean r8 = k4.e.b(r6)
            if (r8 == 0) goto L_0x01d8
            boolean r8 = r11.c(r10, r7, r6)
            if (r8 == 0) goto L_0x01bb
            boolean r8 = r11.f13045c
            if (r8 == 0) goto L_0x0154
            boolean r13 = r11.d()
            r1 = 0
            r3 = 1
            r16 = 2
            goto L_0x01b5
        L_0x0154:
            int r8 = r15.size()
            r9 = 1
            if (r8 > r9) goto L_0x0161
            r20 = r7
            r3 = 0
            r16 = 2
            goto L_0x01a5
        L_0x0161:
            java.util.Iterator r8 = r15.iterator()
            r9 = 0
        L_0x0166:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x01a0
            java.lang.Object r14 = r8.next()
            k4.c r14 = (k4.c) r14
            int r3 = r14.f13041d
            r20 = r7
            r7 = 2
            if (r3 < r7) goto L_0x019d
            if (r9 != 0) goto L_0x0181
            r3 = r41
            r9 = r14
        L_0x017e:
            r7 = r20
            goto L_0x0166
        L_0x0181:
            r3 = 1
            r11.f13045c = r3
            float r3 = r9.f3164a
            float r7 = r14.f3164a
            float r3 = r3 - r7
            float r3 = java.lang.Math.abs(r3)
            float r7 = r9.f3165b
            float r8 = r14.f3165b
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            float r3 = r3 - r7
            int r3 = (int) r3
            r16 = 2
            int r3 = r3 / 2
            goto L_0x01a5
        L_0x019d:
            r3 = r41
            goto L_0x017e
        L_0x01a0:
            r20 = r7
            r16 = 2
            r3 = 0
        L_0x01a5:
            r7 = r6[r16]
            if (r3 <= r7) goto L_0x01b1
            int r3 = r3 - r7
            int r3 = r3 + -2
            int r10 = r10 + r3
            r3 = 1
            int r7 = r1 + -1
            goto L_0x01b4
        L_0x01b1:
            r3 = 1
            r7 = r20
        L_0x01b4:
            r1 = 0
        L_0x01b5:
            java.util.Arrays.fill(r6, r1)
            r8 = 0
            r14 = 2
            goto L_0x0208
        L_0x01bb:
            r20 = r7
            r1 = 0
            r3 = 1
            r16 = 2
            r7 = r6[r16]
            r6[r1] = r7
            r17 = 3
            r7 = r6[r17]
            r6[r3] = r7
            r7 = 4
            r8 = r6[r7]
            r6[r16] = r8
            r6[r17] = r3
            r6[r7] = r1
        L_0x01d4:
            r7 = r20
            r8 = 3
            goto L_0x0208
        L_0x01d8:
            r20 = r7
            r1 = 0
            r3 = 1
            r7 = 4
            r16 = 2
            r17 = 3
            r8 = r6[r16]
            r6[r1] = r8
            r8 = r6[r17]
            r6[r3] = r8
            r8 = r6[r7]
            r6[r16] = r8
            r6[r17] = r3
            r6[r7] = r1
            goto L_0x01d4
        L_0x01f2:
            r20 = r7
            r3 = 1
            int r1 = r8 + 1
            r7 = r6[r1]
            int r7 = r7 + r3
            r6[r1] = r7
            r8 = r1
            r7 = r20
            goto L_0x0208
        L_0x0200:
            r20 = r7
            r3 = 1
            r1 = r6[r8]
            int r1 = r1 + r3
            r6[r8] = r1
        L_0x0208:
            int r7 = r7 + r3
            r3 = r41
            r9 = 1
            goto L_0x011d
        L_0x020e:
            boolean r3 = k4.e.b(r6)
            if (r3 == 0) goto L_0x0227
            boolean r1 = r11.c(r10, r1, r6)
            if (r1 == 0) goto L_0x0227
            r1 = 0
            r3 = r6[r1]
            boolean r1 = r11.f13045c
            if (r1 == 0) goto L_0x0226
            boolean r1 = r11.d()
            r13 = r1
        L_0x0226:
            r14 = r3
        L_0x0227:
            int r10 = r10 + r14
            r3 = r41
            r7 = 0
            r9 = 1
            goto L_0x0113
        L_0x022e:
            int r1 = r15.size()
            r3 = 3
            if (r1 < r3) goto L_0x04c3
            k4.d r1 = k4.e.f13042f
            j$.util.List.-EL.sort(r15, r1)
            k4.c[] r1 = new k4.c[r3]
            r3 = 0
            r8 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0242:
            int r10 = r15.size()
            r11 = 2
            int r10 = r10 - r11
            if (r3 >= r10) goto L_0x02e5
            java.lang.Object r10 = r15.get(r3)
            k4.c r10 = (k4.c) r10
            float r11 = r10.f13040c
            r12 = 1
            int r3 = r3 + r12
            r13 = r3
        L_0x0255:
            int r14 = r15.size()
            int r14 = r14 - r12
            if (r13 >= r14) goto L_0x0242
            java.lang.Object r14 = r15.get(r13)
            k4.c r14 = (k4.c) r14
            double r20 = k4.e.e(r10, r14)
            int r13 = r13 + r12
            r12 = r13
        L_0x0268:
            int r6 = r15.size()
            if (r12 >= r6) goto L_0x02e2
            java.lang.Object r6 = r15.get(r12)
            k4.c r6 = (k4.c) r6
            float r7 = r6.f13040c
            r24 = 1068708659(0x3fb33333, float:1.4)
            float r24 = r24 * r11
            int r7 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r7 > 0) goto L_0x02df
            double r24 = k4.e.e(r14, r6)
            double r26 = k4.e.e(r10, r6)
            int r7 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r7 >= 0) goto L_0x02a4
            int r7 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r7 <= 0) goto L_0x029b
            int r7 = (r20 > r26 ? 1 : (r20 == r26 ? 0 : -1))
            if (r7 >= 0) goto L_0x0296
            r28 = r20
            goto L_0x02bb
        L_0x0296:
            r28 = r26
        L_0x0298:
            r26 = r20
            goto L_0x02bb
        L_0x029b:
            r28 = r20
            r39 = r24
            r24 = r26
            r26 = r39
            goto L_0x02bb
        L_0x02a4:
            int r7 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r7 >= 0) goto L_0x02b6
            int r7 = (r20 > r26 ? 1 : (r20 == r26 ? 0 : -1))
            if (r7 >= 0) goto L_0x02b1
            r28 = r24
            r24 = r26
            goto L_0x0298
        L_0x02b1:
            r28 = r24
        L_0x02b3:
            r24 = r20
            goto L_0x02bb
        L_0x02b6:
            r28 = r26
            r26 = r24
            goto L_0x02b3
        L_0x02bb:
            r30 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r26 = r26 * r30
            double r26 = r24 - r26
            double r26 = java.lang.Math.abs(r26)
            double r28 = r28 * r30
            double r24 = r24 - r28
            double r24 = java.lang.Math.abs(r24)
            double r24 = r24 + r26
            int r7 = (r24 > r8 ? 1 : (r24 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x02df
            r7 = 0
            r1[r7] = r10
            r7 = 1
            r1[r7] = r14
            r8 = 2
            r1[r8] = r6
            r8 = r24
            goto L_0x02e0
        L_0x02df:
            r7 = 1
        L_0x02e0:
            int r12 = r12 + r7
            goto L_0x0268
        L_0x02e2:
            r12 = 1
            goto L_0x0255
        L_0x02e5:
            r7 = 1
            r10 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x04c0
            r3 = 0
            r6 = r1[r3]
            r8 = r1[r7]
            float r6 = M3.n.a(r6, r8)
            r8 = r1[r7]
            r9 = 2
            r10 = r1[r9]
            float r8 = M3.n.a(r8, r10)
            r10 = r1[r3]
            r11 = r1[r9]
            float r10 = M3.n.a(r10, r11)
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 < 0) goto L_0x0318
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x0318
            r6 = r1[r3]
            r8 = r1[r7]
            r10 = r1[r9]
            goto L_0x032d
        L_0x0318:
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x0327
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0327
            r6 = r1[r7]
            r8 = r1[r3]
            r10 = r1[r9]
            goto L_0x032d
        L_0x0327:
            r6 = r1[r9]
            r8 = r1[r3]
            r10 = r1[r7]
        L_0x032d:
            float r3 = r6.f3164a
            float r7 = r10.f3164a
            float r7 = r7 - r3
            float r9 = r8.f3165b
            float r11 = r6.f3165b
            float r9 = r9 - r11
            float r9 = r9 * r7
            float r7 = r10.f3165b
            float r7 = r7 - r11
            float r12 = r8.f3164a
            float r12 = r12 - r3
            float r12 = r12 * r7
            float r9 = r9 - r12
            r3 = 0
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x034e
            r3 = 0
            r39 = r10
            r10 = r8
            r8 = r39
            goto L_0x034f
        L_0x034e:
            r3 = 0
        L_0x034f:
            r1[r3] = r8
            r3 = 1
            r1[r3] = r6
            r3 = 2
            r1[r3] = r10
            float r1 = r2.m(r6, r10)
            float r3 = r2.m(r6, r8)
            float r3 = r3 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x04bd
            float r7 = M3.n.a(r6, r10)
            float r7 = r7 / r3
            int r7 = n2.a.V0(r7)
            float r9 = M3.n.a(r6, r8)
            float r9 = r9 / r3
            int r9 = n2.a.V0(r9)
            int r9 = r9 + r7
            r7 = 2
            int r9 = r9 / r7
            int r12 = r9 + 7
            r13 = 3
            r14 = r12 & 3
            if (r14 == 0) goto L_0x0390
            if (r14 == r7) goto L_0x038d
            if (r14 == r13) goto L_0x038a
            goto L_0x0392
        L_0x038a:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x038d:
            int r12 = r9 + 6
            goto L_0x0392
        L_0x0390:
            int r12 = r9 + 8
        L_0x0392:
            int[] r7 = j4.f.e
            r7 = 4
            int r9 = r12 % 4
            r13 = 1
            if (r9 != r13) goto L_0x04b8
            int r9 = r12 + -17
            int r9 = r9 / r7
            j4.f r9 = j4.f.c(r9)     // Catch:{ IllegalArgumentException -> 0x04b3 }
            int r13 = r9.f12885a
            int r13 = r13 * 4
            int r13 = r13 + 10
            int[] r7 = r9.f12886b
            int r7 = r7.length
            float r14 = r6.f3164a
            float r15 = r10.f3165b
            float r1 = r10.f3164a
            float r9 = r8.f3165b
            float r0 = r8.f3164a
            if (r7 <= 0) goto L_0x03e2
            float r7 = r1 - r14
            float r7 = r7 + r0
            float r21 = r15 - r11
            r22 = r4
            float r4 = r21 + r9
            float r13 = (float) r13
            r20 = 1077936128(0x40400000, float:3.0)
            float r13 = r20 / r13
            r18 = 1065353216(0x3f800000, float:1.0)
            float r13 = r18 - r13
            float r7 = Q0.g.j(r7, r14, r13, r14)
            int r7 = (int) r7
            float r4 = Q0.g.j(r4, r11, r13, r11)
            int r4 = (int) r4
            r18 = r5
            r13 = 4
        L_0x03d5:
            r5 = 16
            if (r13 > r5) goto L_0x03e6
            float r5 = (float) r13
            k4.a r2 = r2.u(r3, r7, r4, r5)     // Catch:{ h -> 0x03df }
            goto L_0x03e7
        L_0x03df:
            r5 = 1
            int r13 = r13 << r5
            goto L_0x03d5
        L_0x03e2:
            r22 = r4
            r18 = r5
        L_0x03e6:
            r2 = 0
        L_0x03e7:
            float r3 = (float) r12
            r4 = 1080033280(0x40600000, float:3.5)
            float r30 = r3 - r4
            if (r2 == 0) goto L_0x03fd
            r3 = 1077936128(0x40400000, float:3.0)
            float r0 = r30 - r3
            float r1 = r2.f3164a
            float r3 = r2.f3165b
            r28 = r0
            r35 = r1
            r36 = r3
            goto L_0x0407
        L_0x03fd:
            float r1 = r1 - r14
            float r1 = r1 + r0
            float r15 = r15 - r11
            float r15 = r15 + r9
            r35 = r1
            r36 = r15
            r28 = r30
        L_0x0407:
            float r0 = r10.f3164a
            float r1 = r8.f3164a
            r23 = 1080033280(0x40600000, float:3.5)
            r24 = 1080033280(0x40600000, float:3.5)
            r26 = 1080033280(0x40600000, float:3.5)
            r29 = 1080033280(0x40600000, float:3.5)
            float r3 = r6.f3164a
            float r4 = r6.f3165b
            float r5 = r10.f3165b
            float r7 = r8.f3165b
            r25 = r30
            r27 = r28
            r31 = r3
            r32 = r4
            r33 = r0
            r34 = r5
            r37 = r1
            r38 = r7
            S3.f r0 = S3.f.a(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1 = r18
            S3.b r0 = com.bumptech.glide.d.r(r1, r12, r12, r0)
            if (r2 != 0) goto L_0x0449
            r1 = 3
            M3.n[] r2 = new M3.n[r1]
            r3 = 0
            r2[r3] = r8
            r4 = 1
            r2[r4] = r6
            r5 = 2
            r2[r5] = r10
            r1 = r2
            r3 = r22
            r2 = r43
            goto L_0x045d
        L_0x0449:
            r1 = 3
            r3 = 0
            r4 = 1
            r5 = 2
            r7 = 4
            M3.n[] r7 = new M3.n[r7]
            r7[r3] = r8
            r7[r4] = r6
            r7[r5] = r10
            r7[r1] = r2
            r2 = r43
            r1 = r7
            r3 = r22
        L_0x045d:
            S3.d r0 = r3.c(r0, r2)
        L_0x0461:
            java.lang.Object r2 = r0.e
            boolean r3 = r2 instanceof j4.e
            if (r3 == 0) goto L_0x047b
            j4.e r2 = (j4.e) r2
            r2.getClass()
            int r2 = r1.length
            r3 = 3
            if (r2 >= r3) goto L_0x0471
            goto L_0x047b
        L_0x0471:
            r2 = 0
            r3 = r1[r2]
            r4 = 2
            r5 = r1[r4]
            r1[r2] = r5
            r1[r4] = r3
        L_0x047b:
            M3.l r2 = new M3.l
            M3.a r3 = M3.a.f3117f0
            java.lang.String r4 = r0.f4515b
            byte[] r5 = r0.f4514a
            r2.<init>(r4, r5, r1, r3)
            java.util.ArrayList r1 = r0.f4516c
            if (r1 == 0) goto L_0x048f
            M3.m r3 = M3.m.f3154V
            r2.b(r3, r1)
        L_0x048f:
            java.lang.String r1 = r0.f4517d
            if (r1 == 0) goto L_0x0498
            M3.m r3 = M3.m.f3155W
            r2.b(r3, r1)
        L_0x0498:
            int r1 = r0.f4518f
            if (r1 < 0) goto L_0x04b2
            int r0 = r0.f4519g
            if (r0 < 0) goto L_0x04b2
            M3.m r3 = M3.m.f3161c0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.b(r3, r0)
            M3.m r0 = M3.m.f3162d0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.b(r0, r1)
        L_0x04b2:
            return r2
        L_0x04b3:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x04b8:
            M3.d r0 = M3.d.a()
            throw r0
        L_0x04bd:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x04c0:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x04c3:
            M3.h r0 = M3.h.f3144W
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.C1100a.b(A1.d, java.util.EnumMap):M3.l");
    }
}
