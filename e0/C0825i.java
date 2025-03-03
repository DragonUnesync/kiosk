package e0;

/* renamed from: e0.i  reason: case insensitive filesystem */
public final class C0825i extends l {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f11150k = new int[2];

    public static void m(int[] iArr, int i, int i8, int i9, int i10, float f8, int i11) {
        int i12 = i8 - i;
        int i13 = i10 - i9;
        if (i11 == -1) {
            int i14 = (int) ((((float) i13) * f8) + 0.5f);
            int i15 = (int) ((((float) i12) / f8) + 0.5f);
            if (i14 <= i12) {
                iArr[0] = i14;
                iArr[1] = i13;
            } else if (i15 <= i13) {
                iArr[0] = i12;
                iArr[1] = i15;
            }
        } else if (i11 == 0) {
            iArr[0] = (int) ((((float) i13) * f8) + 0.5f);
            iArr[1] = i13;
        } else if (i11 == 1) {
            iArr[0] = i12;
            iArr[1] = (int) ((((float) i12) * f8) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0247, code lost:
        if (r3 != 1) goto L_0x02a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(e0.C0820d r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f11162j
            int r1 = u.C1477r.h(r1)
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x0389
            e0.f r1 = r0.e
            boolean r4 = r1.f11146j
            e0.e r5 = r0.f11161h
            e0.e r6 = r0.i
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            if (r4 != 0) goto L_0x02a5
            int r4 = r0.f11158d
            if (r4 != r3) goto L_0x02a5
            d0.d r4 = r0.f11156b
            int r9 = r4.f9618j
            r10 = 2
            if (r9 == r10) goto L_0x028d
            if (r9 == r3) goto L_0x0028
            goto L_0x02a5
        L_0x0028:
            int r9 = r4.f9619k
            r10 = -1
            if (r9 == 0) goto L_0x0062
            if (r9 != r3) goto L_0x0030
            goto L_0x0062
        L_0x0030:
            int r9 = r4.f9594M
            if (r9 == r10) goto L_0x0053
            if (r9 == 0) goto L_0x0048
            if (r9 == r8) goto L_0x003a
            r4 = 0
            goto L_0x005d
        L_0x003a:
            e0.k r9 = r4.e
            e0.f r9 = r9.e
            int r9 = r9.f11144g
            float r9 = (float) r9
            float r4 = r4.f9593L
        L_0x0043:
            float r9 = r9 * r4
        L_0x0045:
            float r9 = r9 + r7
            int r4 = (int) r9
            goto L_0x005d
        L_0x0048:
            e0.k r9 = r4.e
            e0.f r9 = r9.e
            int r9 = r9.f11144g
            float r9 = (float) r9
            float r4 = r4.f9593L
            float r9 = r9 / r4
            goto L_0x0045
        L_0x0053:
            e0.k r9 = r4.e
            e0.f r9 = r9.e
            int r9 = r9.f11144g
            float r9 = (float) r9
            float r4 = r4.f9593L
            goto L_0x0043
        L_0x005d:
            r1.d(r4)
            goto L_0x02a5
        L_0x0062:
            e0.k r9 = r4.e
            e0.e r11 = r9.f11161h
            e0.e r9 = r9.i
            d0.c r12 = r4.f9632x
            d0.c r12 = r12.f9579d
            if (r12 == 0) goto L_0x0070
            r12 = 1
            goto L_0x0071
        L_0x0070:
            r12 = 0
        L_0x0071:
            d0.c r13 = r4.f9633y
            d0.c r13 = r13.f9579d
            if (r13 == 0) goto L_0x0079
            r13 = 1
            goto L_0x007a
        L_0x0079:
            r13 = 0
        L_0x007a:
            d0.c r14 = r4.z
            d0.c r14 = r14.f9579d
            if (r14 == 0) goto L_0x0082
            r14 = 1
            goto L_0x0083
        L_0x0082:
            r14 = 0
        L_0x0083:
            d0.c r15 = r4.f9582A
            d0.c r15 = r15.f9579d
            if (r15 == 0) goto L_0x008b
            r15 = 1
            goto L_0x008c
        L_0x008b:
            r15 = 0
        L_0x008c:
            int r3 = r4.f9594M
            if (r12 == 0) goto L_0x01a4
            if (r13 == 0) goto L_0x01a4
            if (r14 == 0) goto L_0x01a4
            if (r15 == 0) goto L_0x01a4
            float r4 = r4.f9593L
            boolean r10 = r11.f11146j
            int[] r12 = f11150k
            if (r10 == 0) goto L_0x00ed
            boolean r10 = r9.f11146j
            if (r10 == 0) goto L_0x00ed
            boolean r7 = r5.f11141c
            if (r7 == 0) goto L_0x00ec
            boolean r7 = r6.f11141c
            if (r7 != 0) goto L_0x00ab
            goto L_0x00ec
        L_0x00ab:
            java.util.ArrayList r7 = r5.f11148l
            java.lang.Object r7 = r7.get(r2)
            e0.e r7 = (e0.C0821e) r7
            int r7 = r7.f11144g
            int r5 = r5.f11143f
            int r17 = r7 + r5
            java.util.ArrayList r5 = r6.f11148l
            java.lang.Object r5 = r5.get(r2)
            e0.e r5 = (e0.C0821e) r5
            int r5 = r5.f11144g
            int r6 = r6.f11143f
            int r18 = r5 - r6
            int r5 = r11.f11144g
            int r6 = r11.f11143f
            int r19 = r5 + r6
            int r5 = r9.f11144g
            int r6 = r9.f11143f
            int r20 = r5 - r6
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r12[r2]
            r1.d(r2)
            d0.d r1 = r0.f11156b
            e0.k r1 = r1.e
            e0.f r1 = r1.e
            r2 = r12[r8]
            r1.d(r2)
        L_0x00ec:
            return
        L_0x00ed:
            boolean r10 = r5.f11146j
            java.util.ArrayList r13 = r11.f11148l
            if (r10 == 0) goto L_0x0141
            boolean r10 = r6.f11146j
            if (r10 == 0) goto L_0x0141
            boolean r10 = r11.f11141c
            if (r10 == 0) goto L_0x0140
            boolean r10 = r9.f11141c
            if (r10 != 0) goto L_0x0100
            goto L_0x0140
        L_0x0100:
            int r10 = r5.f11144g
            int r14 = r5.f11143f
            int r17 = r10 + r14
            int r10 = r6.f11144g
            int r14 = r6.f11143f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            e0.e r10 = (e0.C0821e) r10
            int r10 = r10.f11144g
            int r14 = r11.f11143f
            int r19 = r10 + r14
            java.util.ArrayList r10 = r9.f11148l
            java.lang.Object r10 = r10.get(r2)
            e0.e r10 = (e0.C0821e) r10
            int r10 = r10.f11144g
            int r14 = r9.f11143f
            int r20 = r10 - r14
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r10 = r12[r2]
            r1.d(r10)
            d0.d r10 = r0.f11156b
            e0.k r10 = r10.e
            e0.f r10 = r10.e
            r14 = r12[r8]
            r10.d(r14)
            goto L_0x0141
        L_0x0140:
            return
        L_0x0141:
            boolean r10 = r5.f11141c
            if (r10 == 0) goto L_0x01a3
            boolean r10 = r6.f11141c
            if (r10 == 0) goto L_0x01a3
            boolean r10 = r11.f11141c
            if (r10 == 0) goto L_0x01a3
            boolean r10 = r9.f11141c
            if (r10 != 0) goto L_0x0152
            goto L_0x01a3
        L_0x0152:
            java.util.ArrayList r10 = r5.f11148l
            java.lang.Object r10 = r10.get(r2)
            e0.e r10 = (e0.C0821e) r10
            int r10 = r10.f11144g
            int r14 = r5.f11143f
            int r17 = r10 + r14
            java.util.ArrayList r10 = r6.f11148l
            java.lang.Object r10 = r10.get(r2)
            e0.e r10 = (e0.C0821e) r10
            int r10 = r10.f11144g
            int r14 = r6.f11143f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            e0.e r10 = (e0.C0821e) r10
            int r10 = r10.f11144g
            int r11 = r11.f11143f
            int r19 = r10 + r11
            java.util.ArrayList r10 = r9.f11148l
            java.lang.Object r10 = r10.get(r2)
            e0.e r10 = (e0.C0821e) r10
            int r10 = r10.f11144g
            int r9 = r9.f11143f
            int r20 = r10 - r9
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r3 = r12[r2]
            r1.d(r3)
            d0.d r3 = r0.f11156b
            e0.k r3 = r3.e
            e0.f r3 = r3.e
            r4 = r12[r8]
            r3.d(r4)
            goto L_0x02a5
        L_0x01a3:
            return
        L_0x01a4:
            if (r12 == 0) goto L_0x021a
            if (r14 == 0) goto L_0x021a
            boolean r9 = r5.f11141c
            if (r9 == 0) goto L_0x0219
            boolean r9 = r6.f11141c
            if (r9 != 0) goto L_0x01b1
            goto L_0x0219
        L_0x01b1:
            float r4 = r4.f9593L
            java.util.ArrayList r9 = r5.f11148l
            java.lang.Object r9 = r9.get(r2)
            e0.e r9 = (e0.C0821e) r9
            int r9 = r9.f11144g
            int r11 = r5.f11143f
            int r9 = r9 + r11
            java.util.ArrayList r11 = r6.f11148l
            java.lang.Object r11 = r11.get(r2)
            e0.e r11 = (e0.C0821e) r11
            int r11 = r11.f11144g
            int r12 = r6.f11143f
            int r11 = r11 - r12
            if (r3 == r10) goto L_0x01f7
            if (r3 == 0) goto L_0x01f7
            if (r3 == r8) goto L_0x01d5
            goto L_0x02a5
        L_0x01d5:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01e9
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x01e9:
            r1.d(r3)
            d0.d r3 = r0.f11156b
            e0.k r3 = r3.e
            e0.f r3 = r3.e
            r3.d(r10)
            goto L_0x02a5
        L_0x01f7:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x020b
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x020b:
            r1.d(r3)
            d0.d r3 = r0.f11156b
            e0.k r3 = r3.e
            e0.f r3 = r3.e
            r3.d(r10)
            goto L_0x02a5
        L_0x0219:
            return
        L_0x021a:
            if (r13 == 0) goto L_0x02a5
            if (r15 == 0) goto L_0x02a5
            boolean r12 = r11.f11141c
            if (r12 == 0) goto L_0x028c
            boolean r12 = r9.f11141c
            if (r12 != 0) goto L_0x0227
            goto L_0x028c
        L_0x0227:
            float r4 = r4.f9593L
            java.util.ArrayList r12 = r11.f11148l
            java.lang.Object r12 = r12.get(r2)
            e0.e r12 = (e0.C0821e) r12
            int r12 = r12.f11144g
            int r11 = r11.f11143f
            int r12 = r12 + r11
            java.util.ArrayList r11 = r9.f11148l
            java.lang.Object r11 = r11.get(r2)
            e0.e r11 = (e0.C0821e) r11
            int r11 = r11.f11144g
            int r9 = r9.f11143f
            int r11 = r11 - r9
            if (r3 == r10) goto L_0x026b
            if (r3 == 0) goto L_0x024a
            if (r3 == r8) goto L_0x026b
            goto L_0x02a5
        L_0x024a:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x025e
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x025e:
            r1.d(r10)
            d0.d r4 = r0.f11156b
            e0.k r4 = r4.e
            e0.f r4 = r4.e
            r4.d(r3)
            goto L_0x02a5
        L_0x026b:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x027f
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x027f:
            r1.d(r10)
            d0.d r4 = r0.f11156b
            e0.k r4 = r4.e
            e0.f r4 = r4.e
            r4.d(r3)
            goto L_0x02a5
        L_0x028c:
            return
        L_0x028d:
            d0.d r3 = r4.f9590I
            if (r3 == 0) goto L_0x02a5
            e0.i r3 = r3.f9614d
            e0.f r3 = r3.e
            boolean r9 = r3.f11146j
            if (r9 == 0) goto L_0x02a5
            float r4 = r4.f9623o
            int r3 = r3.f11144g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
            r1.d(r3)
        L_0x02a5:
            boolean r3 = r5.f11141c
            if (r3 == 0) goto L_0x0388
            boolean r3 = r6.f11141c
            if (r3 != 0) goto L_0x02af
            goto L_0x0388
        L_0x02af:
            boolean r3 = r5.f11146j
            if (r3 == 0) goto L_0x02bc
            boolean r3 = r6.f11146j
            if (r3 == 0) goto L_0x02bc
            boolean r3 = r1.f11146j
            if (r3 == 0) goto L_0x02bc
            return
        L_0x02bc:
            boolean r3 = r1.f11146j
            if (r3 != 0) goto L_0x02f7
            int r3 = r0.f11158d
            r4 = 3
            if (r3 != r4) goto L_0x02f7
            d0.d r3 = r0.f11156b
            int r4 = r3.f9618j
            if (r4 != 0) goto L_0x02f7
            boolean r3 = r3.q()
            if (r3 != 0) goto L_0x02f7
            java.util.ArrayList r3 = r5.f11148l
            java.lang.Object r3 = r3.get(r2)
            e0.e r3 = (e0.C0821e) r3
            java.util.ArrayList r4 = r6.f11148l
            java.lang.Object r2 = r4.get(r2)
            e0.e r2 = (e0.C0821e) r2
            int r3 = r3.f11144g
            int r4 = r5.f11143f
            int r3 = r3 + r4
            int r2 = r2.f11144g
            int r4 = r6.f11143f
            int r2 = r2 + r4
            int r4 = r2 - r3
            r5.d(r3)
            r6.d(r2)
            r1.d(r4)
            return
        L_0x02f7:
            boolean r3 = r1.f11146j
            if (r3 != 0) goto L_0x0348
            int r3 = r0.f11158d
            r4 = 3
            if (r3 != r4) goto L_0x0348
            int r3 = r0.f11155a
            if (r3 != r8) goto L_0x0348
            java.util.ArrayList r3 = r5.f11148l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0348
            java.util.ArrayList r3 = r6.f11148l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0348
            java.util.ArrayList r3 = r5.f11148l
            java.lang.Object r3 = r3.get(r2)
            e0.e r3 = (e0.C0821e) r3
            java.util.ArrayList r4 = r6.f11148l
            java.lang.Object r4 = r4.get(r2)
            e0.e r4 = (e0.C0821e) r4
            int r3 = r3.f11144g
            int r8 = r5.f11143f
            int r3 = r3 + r8
            int r4 = r4.f11144g
            int r8 = r6.f11143f
            int r4 = r4 + r8
            int r4 = r4 - r3
            int r3 = r1.f11149m
            int r3 = java.lang.Math.min(r4, r3)
            d0.d r4 = r0.f11156b
            int r8 = r4.f9622n
            int r4 = r4.f9621m
            int r3 = java.lang.Math.max(r4, r3)
            if (r8 <= 0) goto L_0x0345
            int r3 = java.lang.Math.min(r8, r3)
        L_0x0345:
            r1.d(r3)
        L_0x0348:
            boolean r3 = r1.f11146j
            if (r3 != 0) goto L_0x034d
            return
        L_0x034d:
            java.util.ArrayList r3 = r5.f11148l
            java.lang.Object r3 = r3.get(r2)
            e0.e r3 = (e0.C0821e) r3
            java.util.ArrayList r4 = r6.f11148l
            java.lang.Object r2 = r4.get(r2)
            e0.e r2 = (e0.C0821e) r2
            int r4 = r3.f11144g
            int r8 = r5.f11143f
            int r8 = r8 + r4
            int r9 = r2.f11144g
            int r10 = r6.f11143f
            int r10 = r10 + r9
            d0.d r11 = r0.f11156b
            float r11 = r11.f9600S
            if (r3 != r2) goto L_0x0370
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0372
        L_0x0370:
            r4 = r8
            r9 = r10
        L_0x0372:
            int r9 = r9 - r4
            int r2 = r1.f11144g
            int r9 = r9 - r2
            float r2 = (float) r4
            float r2 = r2 + r7
            float r3 = (float) r9
            float r3 = r3 * r11
            float r3 = r3 + r2
            int r2 = (int) r3
            r5.d(r2)
            int r2 = r5.f11144g
            int r1 = r1.f11144g
            int r2 = r2 + r1
            r6.d(r2)
        L_0x0388:
            return
        L_0x0389:
            d0.d r1 = r0.f11156b
            d0.c r3 = r1.f9632x
            d0.c r1 = r1.z
            r0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0825i.a(e0.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r0 = r11.f11156b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r11 = this;
            d0.d r0 = r11.f11156b
            boolean r1 = r0.f9608a
            e0.f r2 = r11.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.l()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f11146j
            e0.e r1 = r11.i
            e0.e r3 = r11.f11161h
            r4 = 1
            r5 = 3
            r6 = 4
            r7 = 0
            if (r0 != 0) goto L_0x0078
            d0.d r0 = r11.f11156b
            int[] r8 = r0.f9613c0
            r8 = r8[r7]
            r11.f11158d = r8
            if (r8 == r5) goto L_0x00ac
            if (r8 != r6) goto L_0x006e
            d0.d r9 = r0.f9590I
            if (r9 == 0) goto L_0x0031
            int[] r10 = r9.f9613c0
            r10 = r10[r7]
            if (r10 == r4) goto L_0x0037
        L_0x0031:
            int[] r10 = r9.f9613c0
            r10 = r10[r7]
            if (r10 != r6) goto L_0x006e
        L_0x0037:
            int r0 = r9.l()
            d0.d r4 = r11.f11156b
            d0.c r4 = r4.f9632x
            int r4 = r4.c()
            int r0 = r0 - r4
            d0.d r4 = r11.f11156b
            d0.c r4 = r4.z
            int r4 = r4.c()
            int r0 = r0 - r4
            e0.i r4 = r9.f9614d
            e0.e r5 = r4.f11161h
            d0.d r6 = r11.f11156b
            d0.c r6 = r6.f9632x
            int r6 = r6.c()
            e0.l.b(r3, r5, r6)
            e0.e r3 = r4.i
            d0.d r4 = r11.f11156b
            d0.c r4 = r4.z
            int r4 = r4.c()
            int r4 = -r4
            e0.l.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x006e:
            if (r8 != r4) goto L_0x00ac
            int r0 = r0.l()
            r2.d(r0)
            goto L_0x00ac
        L_0x0078:
            int r0 = r11.f11158d
            if (r0 != r6) goto L_0x00ac
            d0.d r0 = r11.f11156b
            d0.d r8 = r0.f9590I
            if (r8 == 0) goto L_0x0088
            int[] r9 = r8.f9613c0
            r9 = r9[r7]
            if (r9 == r4) goto L_0x008e
        L_0x0088:
            int[] r9 = r8.f9613c0
            r9 = r9[r7]
            if (r9 != r6) goto L_0x00ac
        L_0x008e:
            e0.i r2 = r8.f9614d
            e0.e r2 = r2.f11161h
            d0.c r0 = r0.f9632x
            int r0 = r0.c()
            e0.l.b(r3, r2, r0)
            e0.i r0 = r8.f9614d
            e0.e r0 = r0.i
            d0.d r2 = r11.f11156b
            d0.c r2 = r2.z
            int r2 = r2.c()
            int r2 = -r2
            e0.l.b(r1, r0, r2)
            return
        L_0x00ac:
            boolean r0 = r2.f11146j
            if (r0 == 0) goto L_0x0183
            d0.d r0 = r11.f11156b
            boolean r8 = r0.f9608a
            if (r8 == 0) goto L_0x0183
            d0.c[] r5 = r0.f9587F
            r6 = r5[r7]
            d0.c r8 = r6.f9579d
            if (r8 == 0) goto L_0x011e
            r9 = r5[r4]
            d0.c r9 = r9.f9579d
            if (r9 == 0) goto L_0x011e
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x00e5
            d0.d r0 = r11.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r7]
            int r0 = r0.c()
            r3.f11143f = r0
            d0.d r0 = r11.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f11143f = r0
            goto L_0x0314
        L_0x00e5:
            d0.d r0 = r11.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r7]
            e0.e r0 = e0.l.h(r0)
            if (r0 == 0) goto L_0x00fe
            d0.d r2 = r11.f11156b
            d0.c[] r2 = r2.f9587F
            r2 = r2[r7]
            int r2 = r2.c()
            e0.l.b(r3, r0, r2)
        L_0x00fe:
            d0.d r0 = r11.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r4]
            e0.e r0 = e0.l.h(r0)
            if (r0 == 0) goto L_0x0118
            d0.d r2 = r11.f11156b
            d0.c[] r2 = r2.f9587F
            r2 = r2[r4]
            int r2 = r2.c()
            int r2 = -r2
            e0.l.b(r1, r0, r2)
        L_0x0118:
            r3.f11140b = r4
            r1.f11140b = r4
            goto L_0x0314
        L_0x011e:
            if (r8 == 0) goto L_0x013a
            e0.e r0 = e0.l.h(r6)
            if (r0 == 0) goto L_0x0314
            d0.d r4 = r11.f11156b
            d0.c[] r4 = r4.f9587F
            r4 = r4[r7]
            int r4 = r4.c()
            e0.l.b(r3, r0, r4)
            int r0 = r2.f11144g
            e0.l.b(r1, r3, r0)
            goto L_0x0314
        L_0x013a:
            r5 = r5[r4]
            d0.c r6 = r5.f9579d
            if (r6 == 0) goto L_0x015c
            e0.e r0 = e0.l.h(r5)
            if (r0 == 0) goto L_0x0314
            d0.d r5 = r11.f11156b
            d0.c[] r5 = r5.f9587F
            r4 = r5[r4]
            int r4 = r4.c()
            int r4 = -r4
            e0.l.b(r1, r0, r4)
            int r0 = r2.f11144g
            int r0 = -r0
            e0.l.b(r3, r1, r0)
            goto L_0x0314
        L_0x015c:
            boolean r4 = r0 instanceof d0.i
            if (r4 != 0) goto L_0x0314
            d0.d r4 = r0.f9590I
            if (r4 == 0) goto L_0x0314
            r4 = 7
            d0.c r0 = r0.g(r4)
            d0.c r0 = r0.f9579d
            if (r0 != 0) goto L_0x0314
            d0.d r0 = r11.f11156b
            d0.d r4 = r0.f9590I
            e0.i r4 = r4.f9614d
            e0.e r4 = r4.f11161h
            int r0 = r0.m()
            e0.l.b(r3, r4, r0)
            int r0 = r2.f11144g
            e0.l.b(r1, r3, r0)
            goto L_0x0314
        L_0x0183:
            int r0 = r11.f11158d
            if (r0 != r5) goto L_0x0279
            d0.d r0 = r11.f11156b
            int r8 = r0.f9618j
            r9 = 2
            if (r8 == r9) goto L_0x025a
            if (r8 == r5) goto L_0x0192
            goto L_0x0279
        L_0x0192:
            int r8 = r0.f9619k
            if (r8 != r5) goto L_0x021f
            r3.f11139a = r11
            r1.f11139a = r11
            e0.k r5 = r0.e
            e0.e r8 = r5.f11161h
            r8.f11139a = r11
            e0.e r5 = r5.i
            r5.f11139a = r11
            r2.f11139a = r11
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x01f4
            java.util.ArrayList r0 = r2.f11148l
            d0.d r5 = r11.f11156b
            e0.k r5 = r5.e
            e0.f r5 = r5.e
            r0.add(r5)
            d0.d r0 = r11.f11156b
            e0.k r0 = r0.e
            e0.f r0 = r0.e
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            d0.d r0 = r11.f11156b
            e0.k r0 = r0.e
            e0.f r5 = r0.e
            r5.f11139a = r11
            java.util.ArrayList r5 = r2.f11148l
            e0.e r0 = r0.f11161h
            r5.add(r0)
            java.util.ArrayList r0 = r2.f11148l
            d0.d r5 = r11.f11156b
            e0.k r5 = r5.e
            e0.e r5 = r5.i
            r0.add(r5)
            d0.d r0 = r11.f11156b
            e0.k r0 = r0.e
            e0.e r0 = r0.f11161h
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            d0.d r0 = r11.f11156b
            e0.k r0 = r0.e
            e0.e r0 = r0.i
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            goto L_0x0279
        L_0x01f4:
            d0.d r0 = r11.f11156b
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x0213
            d0.d r0 = r11.f11156b
            e0.k r0 = r0.e
            e0.f r0 = r0.e
            java.util.ArrayList r0 = r0.f11148l
            r0.add(r2)
            java.util.ArrayList r0 = r2.f11147k
            d0.d r5 = r11.f11156b
            e0.k r5 = r5.e
            e0.f r5 = r5.e
            r0.add(r5)
            goto L_0x0279
        L_0x0213:
            d0.d r0 = r11.f11156b
            e0.k r0 = r0.e
            e0.f r0 = r0.e
            java.util.ArrayList r0 = r0.f11148l
            r0.add(r2)
            goto L_0x0279
        L_0x021f:
            e0.k r0 = r0.e
            e0.f r0 = r0.e
            java.util.ArrayList r5 = r2.f11148l
            r5.add(r0)
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            d0.d r0 = r11.f11156b
            e0.k r0 = r0.e
            e0.e r0 = r0.f11161h
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            d0.d r0 = r11.f11156b
            e0.k r0 = r0.e
            e0.e r0 = r0.i
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            r2.f11140b = r4
            java.util.ArrayList r0 = r2.f11147k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f11147k
            r0.add(r1)
            java.util.ArrayList r0 = r3.f11148l
            r0.add(r2)
            java.util.ArrayList r0 = r1.f11148l
            r0.add(r2)
            goto L_0x0279
        L_0x025a:
            d0.d r0 = r0.f9590I
            if (r0 != 0) goto L_0x025f
            goto L_0x0279
        L_0x025f:
            e0.k r0 = r0.e
            e0.f r0 = r0.e
            java.util.ArrayList r5 = r2.f11148l
            r5.add(r0)
            java.util.ArrayList r0 = r0.f11147k
            r0.add(r2)
            r2.f11140b = r4
            java.util.ArrayList r0 = r2.f11147k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f11147k
            r0.add(r1)
        L_0x0279:
            d0.d r0 = r11.f11156b
            d0.c[] r5 = r0.f9587F
            r8 = r5[r7]
            d0.c r9 = r8.f9579d
            if (r9 == 0) goto L_0x02c6
            r10 = r5[r4]
            d0.c r10 = r10.f9579d
            if (r10 == 0) goto L_0x02c6
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x02a9
            d0.d r0 = r11.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r7]
            int r0 = r0.c()
            r3.f11143f = r0
            d0.d r0 = r11.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r4]
            int r0 = r0.c()
            int r0 = -r0
            r1.f11143f = r0
            goto L_0x0314
        L_0x02a9:
            d0.d r0 = r11.f11156b
            d0.c[] r0 = r0.f9587F
            r0 = r0[r7]
            e0.e r0 = e0.l.h(r0)
            d0.d r1 = r11.f11156b
            d0.c[] r1 = r1.f9587F
            r1 = r1[r4]
            e0.e r1 = e0.l.h(r1)
            r0.b(r11)
            r1.b(r11)
            r11.f11162j = r6
            goto L_0x0314
        L_0x02c6:
            if (r9 == 0) goto L_0x02df
            e0.e r0 = e0.l.h(r8)
            if (r0 == 0) goto L_0x0314
            d0.d r5 = r11.f11156b
            d0.c[] r5 = r5.f9587F
            r5 = r5[r7]
            int r5 = r5.c()
            e0.l.b(r3, r0, r5)
            r11.c(r1, r3, r4, r2)
            goto L_0x0314
        L_0x02df:
            r5 = r5[r4]
            d0.c r6 = r5.f9579d
            if (r6 == 0) goto L_0x02fe
            e0.e r0 = e0.l.h(r5)
            if (r0 == 0) goto L_0x0314
            d0.d r5 = r11.f11156b
            d0.c[] r5 = r5.f9587F
            r4 = r5[r4]
            int r4 = r4.c()
            int r4 = -r4
            e0.l.b(r1, r0, r4)
            r0 = -1
            r11.c(r3, r1, r0, r2)
            goto L_0x0314
        L_0x02fe:
            boolean r5 = r0 instanceof d0.i
            if (r5 != 0) goto L_0x0314
            d0.d r5 = r0.f9590I
            if (r5 == 0) goto L_0x0314
            e0.i r5 = r5.f9614d
            e0.e r5 = r5.f11161h
            int r0 = r0.m()
            e0.l.b(r3, r5, r0)
            r11.c(r1, r3, r4, r2)
        L_0x0314:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0825i.d():void");
    }

    public final void e() {
        C0821e eVar = this.f11161h;
        if (eVar.f11146j) {
            this.f11156b.f9595N = eVar.f11144g;
        }
    }

    public final void f() {
        this.f11157c = null;
        this.f11161h.c();
        this.i.c();
        this.e.c();
        this.f11160g = false;
    }

    public final boolean k() {
        if (this.f11158d != 3 || this.f11156b.f9618j == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f11160g = false;
        C0821e eVar = this.f11161h;
        eVar.c();
        eVar.f11146j = false;
        C0821e eVar2 = this.i;
        eVar2.c();
        eVar2.f11146j = false;
        this.e.f11146j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f11156b.f9604W;
    }
}
