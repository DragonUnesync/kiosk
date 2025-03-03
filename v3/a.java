package V3;

import M3.j;
import M3.n;
import W3.c;

public final class a implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final n[] f5973b = new n[0];

    /* renamed from: a  reason: collision with root package name */
    public final c f5974a = new c(0);

    public final void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0189, code lost:
        if ((r0.z0(r12, r3) + r0.z0(r13, r3)) > (r0.z0(r12, r6) + r0.z0(r13, r6))) goto L_0x016c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M3.l b(A1.d r35, java.util.EnumMap r36) {
        /*
            r34 = this;
            r0 = r36
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = r34
            W3.c r5 = r4.f5974a
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0082
            M3.c r8 = M3.c.f3125V
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L_0x0082
            S3.b r0 = r35.x()
            int[] r1 = r0.e()
            int[] r3 = r0.c()
            if (r1 == 0) goto L_0x007f
            if (r3 == 0) goto L_0x007f
            r8 = r1[r6]
            r9 = r1[r7]
        L_0x0029:
            int r10 = r0.f4505U
            if (r8 >= r10) goto L_0x0035
            boolean r11 = r0.b(r8, r9)
            if (r11 == 0) goto L_0x0035
            int r8 = r8 + r7
            goto L_0x0029
        L_0x0035:
            if (r8 == r10) goto L_0x007c
            r9 = r1[r6]
            int r8 = r8 - r9
            if (r8 == 0) goto L_0x0079
            r1 = r1[r7]
            r10 = r3[r7]
            r3 = r3[r6]
            int r3 = r3 - r9
            int r3 = r3 + r7
            int r3 = r3 / r8
            int r10 = r10 - r1
            int r10 = r10 + r7
            int r10 = r10 / r8
            if (r3 <= 0) goto L_0x0076
            if (r10 <= 0) goto L_0x0076
            int r2 = r8 / 2
            int r1 = r1 + r2
            int r9 = r9 + r2
            S3.b r2 = new S3.b
            r2.<init>(r3, r10)
            r11 = 0
        L_0x0056:
            if (r11 >= r10) goto L_0x006e
            int r12 = r11 * r8
            int r12 = r12 + r1
            r13 = 0
        L_0x005c:
            if (r13 >= r3) goto L_0x006c
            int r14 = r13 * r8
            int r14 = r14 + r9
            boolean r14 = r0.b(r14, r12)
            if (r14 == 0) goto L_0x006a
            r2.f(r13, r11)
        L_0x006a:
            int r13 = r13 + r7
            goto L_0x005c
        L_0x006c:
            int r11 = r11 + r7
            goto L_0x0056
        L_0x006e:
            S3.d r0 = r5.b(r2)
            M3.n[] r1 = f5973b
            goto L_0x02a4
        L_0x0076:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x0079:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x007c:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x007f:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x0082:
            R2.c r0 = new R2.c
            S3.b r8 = r35.x()
            r0.<init>((S3.b) r8)
            java.lang.Object r9 = r0.f4337W
            T3.a r9 = (T3.a) r9
            M3.n[] r9 = r9.b()
            r10 = r9[r6]
            r11 = r9[r7]
            r12 = r9[r1]
            r9 = r9[r2]
            int r13 = r0.z0(r10, r11)
            int r14 = r0.z0(r11, r12)
            int r15 = r0.z0(r12, r9)
            int r1 = r0.z0(r9, r10)
            M3.n[] r2 = new M3.n[r3]
            r2[r6] = r9
            r2[r7] = r10
            r17 = 2
            r2[r17] = r11
            r16 = 3
            r2[r16] = r12
            if (r13 <= r14) goto L_0x00c4
            r2[r6] = r10
            r2[r7] = r11
            r2[r17] = r12
            r2[r16] = r9
            r13 = r14
        L_0x00c4:
            if (r13 <= r15) goto L_0x00cf
            r2[r6] = r11
            r2[r7] = r12
            r2[r17] = r9
            r2[r16] = r10
            goto L_0x00d0
        L_0x00cf:
            r15 = r13
        L_0x00d0:
            if (r15 <= r1) goto L_0x00da
            r2[r6] = r12
            r2[r7] = r9
            r2[r17] = r10
            r2[r16] = r11
        L_0x00da:
            r1 = r2[r6]
            r9 = r2[r7]
            r10 = r2[r17]
            r11 = r2[r16]
            int r12 = r0.z0(r1, r11)
            int r12 = r12 + r7
            int r12 = r12 << 2
            M3.n r13 = R2.c.y0(r9, r10, r12)
            M3.n r12 = R2.c.y0(r10, r9, r12)
            int r13 = r0.z0(r13, r1)
            int r12 = r0.z0(r12, r11)
            if (r13 >= r12) goto L_0x0105
            r2[r6] = r1
            r2[r7] = r9
            r2[r17] = r10
            r12 = 3
            r2[r12] = r11
            goto L_0x010e
        L_0x0105:
            r12 = 3
            r2[r6] = r9
            r2[r7] = r10
            r2[r17] = r11
            r2[r12] = r1
        L_0x010e:
            r1 = r2[r6]
            r9 = r2[r7]
            r10 = r2[r17]
            r11 = r2[r12]
            int r12 = r0.z0(r1, r11)
            int r13 = r0.z0(r9, r11)
            int r13 = r13 + r7
            int r13 = r13 << 2
            M3.n r13 = R2.c.y0(r1, r9, r13)
            int r12 = r12 + r7
            int r12 = r12 << 2
            M3.n r12 = R2.c.y0(r10, r9, r12)
            int r14 = r0.z0(r13, r11)
            int r15 = r0.z0(r12, r11)
            M3.n r3 = new M3.n
            float r6 = r10.f3164a
            float r4 = r9.f3164a
            float r6 = r6 - r4
            int r14 = r14 + r7
            float r14 = (float) r14
            float r6 = r6 / r14
            float r7 = r11.f3164a
            float r6 = r6 + r7
            float r10 = r10.f3165b
            float r9 = r9.f3165b
            float r10 = r10 - r9
            float r10 = r10 / r14
            float r11 = r11.f3165b
            float r10 = r10 + r11
            r3.<init>(r6, r10)
            M3.n r6 = new M3.n
            float r10 = r1.f3164a
            float r10 = r10 - r4
            r4 = 1
            int r15 = r15 + r4
            float r4 = (float) r15
            float r10 = r10 / r4
            float r10 = r10 + r7
            float r1 = r1.f3165b
            float r1 = r1 - r9
            float r1 = r1 / r4
            float r1 = r1 + r11
            r6.<init>(r10, r1)
            boolean r1 = r0.m0(r3)
            if (r1 != 0) goto L_0x0170
            boolean r1 = r0.m0(r6)
            if (r1 == 0) goto L_0x016e
        L_0x016b:
            r3 = r6
        L_0x016c:
            r1 = 3
            goto L_0x018c
        L_0x016e:
            r3 = 0
            goto L_0x016c
        L_0x0170:
            boolean r1 = r0.m0(r6)
            if (r1 != 0) goto L_0x0177
        L_0x0176:
            goto L_0x016c
        L_0x0177:
            int r1 = r0.z0(r13, r3)
            int r4 = r0.z0(r12, r3)
            int r4 = r4 + r1
            int r1 = r0.z0(r13, r6)
            int r7 = r0.z0(r12, r6)
            int r7 = r7 + r1
            if (r4 <= r7) goto L_0x016b
            goto L_0x0176
        L_0x018c:
            r2[r1] = r3
            if (r3 == 0) goto L_0x02c2
            r1 = 0
            r4 = r2[r1]
            r1 = 1
            r6 = r2[r1]
            r7 = 2
            r2 = r2[r7]
            int r9 = r0.z0(r4, r3)
            int r9 = r9 + r1
            int r10 = r0.z0(r2, r3)
            int r10 = r10 + r1
            int r10 = r10 << r7
            M3.n r10 = R2.c.y0(r4, r6, r10)
            int r9 = r9 << r7
            M3.n r9 = R2.c.y0(r2, r6, r9)
            int r10 = r0.z0(r10, r3)
            int r11 = r10 + 1
            int r9 = r0.z0(r9, r3)
            int r12 = r9 + 1
            r13 = r11 & 1
            if (r13 != r1) goto L_0x01bf
            int r11 = r10 + 2
        L_0x01bf:
            r10 = r12 & 1
            if (r10 != r1) goto L_0x01c5
            int r12 = r9 + 2
        L_0x01c5:
            float r1 = r4.f3164a
            float r7 = r6.f3164a
            float r1 = r1 + r7
            float r7 = r2.f3164a
            float r1 = r1 + r7
            float r7 = r3.f3164a
            float r1 = r1 + r7
            r7 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r7
            float r9 = r4.f3165b
            float r10 = r6.f3165b
            float r9 = r9 + r10
            float r10 = r2.f3165b
            float r9 = r9 + r10
            float r10 = r3.f3165b
            float r9 = r9 + r10
            float r9 = r9 / r7
            M3.n r4 = R2.c.q0(r4, r1, r9)
            M3.n r6 = R2.c.q0(r6, r1, r9)
            M3.n r2 = R2.c.q0(r2, r1, r9)
            M3.n r1 = R2.c.q0(r3, r1, r9)
            r3 = 2
            int r7 = r12 << 2
            M3.n r9 = R2.c.y0(r4, r6, r7)
            int r10 = r11 << 2
            M3.n r9 = R2.c.y0(r9, r1, r10)
            M3.n r11 = R2.c.y0(r6, r4, r7)
            M3.n r11 = R2.c.y0(r11, r2, r10)
            M3.n r12 = R2.c.y0(r2, r1, r7)
            M3.n r6 = R2.c.y0(r12, r6, r10)
            M3.n r1 = R2.c.y0(r1, r2, r7)
            M3.n r1 = R2.c.y0(r1, r4, r10)
            r2 = 4
            M3.n[] r4 = new M3.n[r2]
            r2 = 0
            r4[r2] = r9
            r7 = 1
            r4[r7] = r11
            r4[r3] = r6
            r6 = 3
            r4[r6] = r1
            r1 = r4[r2]
            r2 = r4[r7]
            r9 = r4[r3]
            r4 = r4[r6]
            int r6 = r0.z0(r1, r4)
            int r10 = r6 + 1
            int r0 = r0.z0(r9, r4)
            int r11 = r0 + 1
            r12 = r10 & 1
            if (r12 != r7) goto L_0x023c
            int r10 = r6 + 2
        L_0x023c:
            r6 = r11 & 1
            if (r6 != r7) goto L_0x0242
            int r11 = r0 + 2
        L_0x0242:
            r0 = 4
            int r3 = r10 * 4
            int r6 = r11 * 7
            if (r3 >= r6) goto L_0x0254
            int r3 = r11 * 4
            int r0 = r10 * 7
            if (r3 >= r0) goto L_0x0254
            int r10 = java.lang.Math.max(r10, r11)
            r11 = r10
        L_0x0254:
            float r0 = (float) r10
            r3 = 1056964608(0x3f000000, float:0.5)
            float r22 = r0 - r3
            float r0 = (float) r11
            float r25 = r0 - r3
            float r0 = r2.f3164a
            r18 = 1056964608(0x3f000000, float:0.5)
            r19 = 1056964608(0x3f000000, float:0.5)
            r21 = 1056964608(0x3f000000, float:0.5)
            r24 = 1056964608(0x3f000000, float:0.5)
            float r3 = r1.f3164a
            float r6 = r1.f3165b
            float r7 = r4.f3164a
            float r12 = r4.f3165b
            float r13 = r9.f3164a
            float r14 = r9.f3165b
            float r15 = r2.f3165b
            r20 = r22
            r23 = r25
            r26 = r3
            r27 = r6
            r28 = r7
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r0
            r33 = r15
            S3.f r0 = S3.f.a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            S3.b r0 = com.bumptech.glide.d.r(r8, r10, r11, r0)
            r3 = 4
            M3.n[] r3 = new M3.n[r3]
            r6 = 0
            r3[r6] = r1
            r1 = 1
            r3[r1] = r2
            r1 = 2
            r3[r1] = r9
            r1 = 3
            r3[r1] = r4
            S3.d r0 = r5.b(r0)
            r1 = r3
        L_0x02a4:
            M3.l r2 = new M3.l
            M3.a r3 = M3.a.f3111Z
            java.lang.String r4 = r0.f4515b
            byte[] r5 = r0.f4514a
            r2.<init>(r4, r5, r1, r3)
            java.util.ArrayList r1 = r0.f4516c
            if (r1 == 0) goto L_0x02b8
            M3.m r3 = M3.m.f3154V
            r2.b(r3, r1)
        L_0x02b8:
            java.lang.String r0 = r0.f4517d
            if (r0 == 0) goto L_0x02c1
            M3.m r1 = M3.m.f3155W
            r2.b(r1, r0)
        L_0x02c1:
            return r2
        L_0x02c2:
            M3.h r0 = M3.h.f3144W
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.a.b(A1.d, java.util.EnumMap):M3.l");
    }
}
