package a7;

import Y6.p;

/* renamed from: a7.b  reason: case insensitive filesystem */
public final class C0449b implements p {
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d0, code lost:
        if (W6.l.a0(r8, "1", false) != false) goto L_0x02d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Y6.u a(d7.C0661f r30) {
        /*
            r29 = this;
            r0 = r30
            r2 = 15
            r3 = 0
            java.lang.System.currentTimeMillis()
            C7.d r6 = r0.e
            R2.c r5 = new R2.c
            r5.<init>(r6, r2, r3)
            java.lang.Object r7 = r6.f736Z
            Y6.c r7 = (Y6.c) r7
            if (r7 != 0) goto L_0x0210
            int r7 = Y6.c.f6600n
            java.lang.Object r7 = r6.f734X
            Y6.m r7 = (Y6.m) r7
            int r8 = r7.size()
            r12 = r3
            r10 = 0
            r11 = 1
            r13 = 0
            r14 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = -1
            r21 = -1
            r22 = 0
            r23 = 0
            r24 = 0
        L_0x0037:
            if (r10 >= r8) goto L_0x01fe
            java.lang.String r2 = r7.c(r10)
            java.lang.String r3 = r7.f(r10)
            java.lang.String r9 = "Cache-Control"
            boolean r9 = W6.l.W(r2, r9)
            if (r9 == 0) goto L_0x004f
            if (r12 == 0) goto L_0x004d
        L_0x004b:
            r11 = 0
            goto L_0x0058
        L_0x004d:
            r12 = r3
            goto L_0x0058
        L_0x004f:
            java.lang.String r9 = "Pragma"
            boolean r2 = W6.l.W(r2, r9)
            if (r2 == 0) goto L_0x01ee
            goto L_0x004b
        L_0x0058:
            r2 = 0
        L_0x0059:
            int r9 = r3.length()
            if (r2 >= r9) goto L_0x01ee
            int r9 = r3.length()
            r1 = r2
        L_0x0064:
            if (r1 >= r9) goto L_0x007a
            char r4 = r3.charAt(r1)
            r26 = r5
            java.lang.String r5 = "=,;"
            boolean r4 = W6.d.b0(r5, r4)
            if (r4 == 0) goto L_0x0075
            goto L_0x0080
        L_0x0075:
            r4 = 1
            int r1 = r1 + r4
            r5 = r26
            goto L_0x0064
        L_0x007a:
            r26 = r5
            int r1 = r3.length()
        L_0x0080:
            java.lang.String r2 = r3.substring(r2, r1)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            P6.f.d(r2, r4)
            java.lang.CharSequence r2 = W6.d.s0(r2)
            java.lang.String r2 = r2.toString()
            int r5 = r3.length()
            if (r1 == r5) goto L_0x00a7
            char r5 = r3.charAt(r1)
            r9 = 44
            if (r5 == r9) goto L_0x00a7
            char r5 = r3.charAt(r1)
            r9 = 59
            if (r5 != r9) goto L_0x00ac
        L_0x00a7:
            r27 = r7
            r5 = 1
            goto L_0x0124
        L_0x00ac:
            r5 = 1
            int r1 = r1 + r5
            byte[] r5 = Z6.b.f6982a
            int r5 = r3.length()
        L_0x00b4:
            if (r1 >= r5) goto L_0x00cb
            char r9 = r3.charAt(r1)
            r27 = r5
            r5 = 32
            if (r9 == r5) goto L_0x00c6
            r5 = 9
            if (r9 == r5) goto L_0x00c6
            r5 = 1
            goto L_0x00d0
        L_0x00c6:
            r5 = 1
            int r1 = r1 + r5
            r5 = r27
            goto L_0x00b4
        L_0x00cb:
            r5 = 1
            int r1 = r3.length()
        L_0x00d0:
            int r9 = r3.length()
            if (r1 >= r9) goto L_0x00f1
            char r9 = r3.charAt(r1)
            r27 = r7
            r7 = 34
            if (r9 != r7) goto L_0x00f3
            int r1 = r1 + r5
            r9 = 4
            r5 = 0
            int r7 = W6.d.f0(r3, r7, r1, r5, r9)
            java.lang.String r1 = r3.substring(r1, r7)
            P6.f.d(r1, r4)
            r4 = 1
            int r7 = r7 + r4
            goto L_0x0127
        L_0x00f1:
            r27 = r7
        L_0x00f3:
            int r5 = r3.length()
            r7 = r1
        L_0x00f8:
            if (r7 >= r5) goto L_0x010f
            char r9 = r3.charAt(r7)
            r28 = r5
            java.lang.String r5 = ",;"
            boolean r5 = W6.d.b0(r5, r9)
            if (r5 == 0) goto L_0x010a
            r5 = 1
            goto L_0x0114
        L_0x010a:
            r5 = 1
            int r7 = r7 + r5
            r5 = r28
            goto L_0x00f8
        L_0x010f:
            r5 = 1
            int r7 = r3.length()
        L_0x0114:
            java.lang.String r1 = r3.substring(r1, r7)
            P6.f.d(r1, r4)
            java.lang.CharSequence r1 = W6.d.s0(r1)
            java.lang.String r1 = r1.toString()
            goto L_0x0127
        L_0x0124:
            int r1 = r1 + r5
            r7 = r1
            r1 = 0
        L_0x0127:
            java.lang.String r4 = "no-cache"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x0137
            r2 = r7
            r5 = r26
            r7 = r27
            r13 = 1
            goto L_0x0059
        L_0x0137:
            java.lang.String r4 = "no-store"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x0147
            r2 = r7
            r5 = r26
            r7 = r27
            r14 = 1
            goto L_0x0059
        L_0x0147:
            java.lang.String r4 = "max-age"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x015b
            r4 = -1
            int r15 = Z6.b.w(r4, r1)
        L_0x0154:
            r2 = r7
            r5 = r26
            r7 = r27
            goto L_0x0059
        L_0x015b:
            r4 = -1
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0169
            int r16 = Z6.b.w(r4, r1)
            goto L_0x0154
        L_0x0169:
            java.lang.String r4 = "private"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x017a
            r2 = r7
            r5 = r26
            r7 = r27
            r17 = 1
            goto L_0x0059
        L_0x017a:
            java.lang.String r4 = "public"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x018b
            r2 = r7
            r5 = r26
            r7 = r27
            r18 = 1
            goto L_0x0059
        L_0x018b:
            java.lang.String r4 = "must-revalidate"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x019c
            r2 = r7
            r5 = r26
            r7 = r27
            r19 = 1
            goto L_0x0059
        L_0x019c:
            java.lang.String r4 = "max-stale"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x01ac
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r20 = Z6.b.w(r2, r1)
            goto L_0x0154
        L_0x01ac:
            java.lang.String r4 = "min-fresh"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x01ba
            r4 = -1
            int r21 = Z6.b.w(r4, r1)
            goto L_0x0154
        L_0x01ba:
            r4 = -1
            java.lang.String r1 = "only-if-cached"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x01cc
            r2 = r7
            r5 = r26
            r7 = r27
            r22 = 1
            goto L_0x0059
        L_0x01cc:
            java.lang.String r1 = "no-transform"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x01dd
            r2 = r7
            r5 = r26
            r7 = r27
            r23 = 1
            goto L_0x0059
        L_0x01dd:
            java.lang.String r1 = "immutable"
            boolean r1 = r1.equalsIgnoreCase(r2)
            r2 = r7
            r5 = r26
            r7 = r27
            if (r1 == 0) goto L_0x0059
            r24 = 1
            goto L_0x0059
        L_0x01ee:
            r26 = r5
            r27 = r7
            r4 = -1
            r1 = 1
            int r10 = r10 + r1
            r5 = r26
            r7 = r27
            r2 = 15
            r3 = 0
            goto L_0x0037
        L_0x01fe:
            r26 = r5
            if (r11 != 0) goto L_0x0205
            r25 = 0
            goto L_0x0207
        L_0x0205:
            r25 = r12
        L_0x0207:
            Y6.c r7 = new Y6.c
            r12 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r6.f736Z = r7
            goto L_0x0212
        L_0x0210:
            r26 = r5
        L_0x0212:
            boolean r1 = r7.f6608j
            if (r1 == 0) goto L_0x021f
            R2.c r5 = new R2.c
            r1 = 0
            r2 = 15
            r5.<init>(r1, r2, r1)
            goto L_0x0221
        L_0x021f:
            r5 = r26
        L_0x0221:
            c7.h r1 = r0.f9772a
            boolean r2 = r1 instanceof c7.h
            r2 = 20
            java.lang.String r3 = "call"
            java.lang.Object r4 = r5.f4336V
            C7.d r4 = (C7.d) r4
            java.lang.Object r5 = r5.f4337W
            Y6.u r5 = (Y6.u) r5
            if (r4 != 0) goto L_0x0266
            if (r5 != 0) goto L_0x0266
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            Y6.s r7 = Y6.s.HTTP_1_1
            Y6.v r12 = Z6.b.f6984c
            long r18 = java.lang.System.currentTimeMillis()
            Y6.m r11 = new Y6.m
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11.<init>(r0)
            Y6.u r0 = new Y6.u
            r16 = -1
            r20 = 0
            java.lang.String r8 = "Unsatisfiable Request (only-if-cached)"
            r9 = 504(0x1f8, float:7.06E-43)
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
            P6.f.e(r1, r3)
            return r0
        L_0x0266:
            java.lang.String r6 = "cacheResponse"
            if (r4 != 0) goto L_0x0282
            P6.f.b(r5)
            Y6.t r0 = r5.k()
            Y6.u r2 = a7.C0448a.a(r5)
            Y6.t.b(r6, r2)
            r0.i = r2
            Y6.u r0 = r0.a()
            P6.f.e(r1, r3)
            return r0
        L_0x0282:
            if (r5 == 0) goto L_0x0287
            P6.f.e(r1, r3)
        L_0x0287:
            Y6.u r0 = r0.b(r4)
            java.lang.String r1 = "networkResponse"
            if (r5 == 0) goto L_0x039c
            r3 = 304(0x130, float:4.26E-43)
            int r4 = r0.f6742X
            if (r4 != r3) goto L_0x0393
            Y6.t r3 = r5.k()
            Y6.m r4 = r0.f6744Z
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            Y6.m r2 = r5.f6744Z
            int r8 = r2.size()
            r9 = 0
        L_0x02a7:
            java.lang.String r10 = "value"
            java.lang.String r11 = "name"
            java.lang.String r12 = "Content-Type"
            java.lang.String r13 = "Content-Encoding"
            java.lang.String r14 = "Content-Length"
            if (r9 >= r8) goto L_0x0312
            java.lang.String r15 = r2.c(r9)
            r30 = r8
            java.lang.String r8 = r2.f(r9)
            r16 = r2
            java.lang.String r2 = "Warning"
            boolean r2 = r2.equalsIgnoreCase(r15)
            if (r2 == 0) goto L_0x02d4
            java.lang.String r2 = "1"
            r17 = r1
            r1 = 0
            boolean r2 = W6.l.a0(r8, r2, r1)
            if (r2 == 0) goto L_0x02d6
        L_0x02d2:
            r1 = 1
            goto L_0x030a
        L_0x02d4:
            r17 = r1
        L_0x02d6:
            boolean r1 = r14.equalsIgnoreCase(r15)
            if (r1 != 0) goto L_0x02f5
            boolean r1 = r13.equalsIgnoreCase(r15)
            if (r1 != 0) goto L_0x02f5
            boolean r1 = r12.equalsIgnoreCase(r15)
            if (r1 == 0) goto L_0x02e9
            goto L_0x02f5
        L_0x02e9:
            boolean r1 = a7.C0448a.b(r15)
            if (r1 == 0) goto L_0x02f5
            java.lang.String r1 = r4.b(r15)
            if (r1 != 0) goto L_0x02d2
        L_0x02f5:
            P6.f.e(r15, r11)
            P6.f.e(r8, r10)
            r7.add(r15)
            java.lang.CharSequence r1 = W6.d.s0(r8)
            java.lang.String r1 = r1.toString()
            r7.add(r1)
            goto L_0x02d2
        L_0x030a:
            int r9 = r9 + r1
            r8 = r30
            r2 = r16
            r1 = r17
            goto L_0x02a7
        L_0x0312:
            r17 = r1
            int r1 = r4.size()
            r2 = 0
        L_0x0319:
            if (r2 >= r1) goto L_0x0353
            java.lang.String r8 = r4.c(r2)
            boolean r9 = r14.equalsIgnoreCase(r8)
            if (r9 != 0) goto L_0x0350
            boolean r9 = r13.equalsIgnoreCase(r8)
            if (r9 != 0) goto L_0x0350
            boolean r9 = r12.equalsIgnoreCase(r8)
            if (r9 == 0) goto L_0x0332
            goto L_0x0350
        L_0x0332:
            boolean r9 = a7.C0448a.b(r8)
            if (r9 == 0) goto L_0x0350
            java.lang.String r9 = r4.f(r2)
            P6.f.e(r8, r11)
            P6.f.e(r9, r10)
            r7.add(r8)
            java.lang.CharSequence r8 = W6.d.s0(r9)
            java.lang.String r8 = r8.toString()
            r7.add(r8)
        L_0x0350:
            r8 = 1
            int r2 = r2 + r8
            goto L_0x0319
        L_0x0353:
            Y6.m r1 = new Y6.m
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r7.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.<init>(r2)
            D.s0 r1 = r1.d()
            r3.f6732f = r1
            long r1 = r0.f6749e0
            r3.f6736k = r1
            long r1 = r0.f6750f0
            r3.f6737l = r1
            Y6.u r1 = a7.C0448a.a(r5)
            Y6.t.b(r6, r1)
            r3.i = r1
            Y6.u r1 = a7.C0448a.a(r0)
            r2 = r17
            Y6.t.b(r2, r1)
            r3.f6734h = r1
            r3.a()
            Y6.v r0 = r0.f6745a0
            P6.f.b(r0)
            r0.close()
            r0 = 0
            P6.f.b(r0)
            throw r0
        L_0x0393:
            r2 = r1
            Y6.v r1 = r5.f6745a0
            if (r1 == 0) goto L_0x039d
            Z6.b.c(r1)
            goto L_0x039d
        L_0x039c:
            r2 = r1
        L_0x039d:
            Y6.t r1 = r0.k()
            Y6.u r3 = a7.C0448a.a(r5)
            Y6.t.b(r6, r3)
            r1.i = r3
            Y6.u r0 = a7.C0448a.a(r0)
            Y6.t.b(r2, r0)
            r1.f6734h = r0
            Y6.u r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.C0449b.a(d7.f):Y6.u");
    }
}
