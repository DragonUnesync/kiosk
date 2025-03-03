package q4;

public final class d implements o4.d {
    /* JADX WARNING: type inference failed for: r7v11, types: [u4.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0218, code lost:
        r38 = r29;
        r29 = r6;
        r6 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028c, code lost:
        r5 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028e, code lost:
        r3 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x037b, code lost:
        r0 = r41;
        r5 = r31;
        r7 = r35;
        r31 = r6;
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ed, code lost:
        r31 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        r5 = r42;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final L4.c a(int r40, S5.C0185n r41, o4.C1319b r42) {
        /*
            r39 = this;
            r0 = r41
            r1 = 0
            r2 = r40
            o4.f.a(r1, r2)
            int r2 = r41.readableBytes()
            r3 = 3
            if (r2 >= r3) goto L_0x004c
            int r1 = r41.readableBytes()
            r2 = 2
            if (r1 != r2) goto L_0x0047
            r41.readUnsignedByte()
            short r0 = r41.readUnsignedByte()
            if (r0 < 0) goto L_0x0028
            q5.a[] r1 = q5.C1365a.f14785a0
            int r2 = r1.length
            if (r0 < r2) goto L_0x0025
            goto L_0x002a
        L_0x0025:
            r4 = r1[r0]
            goto L_0x002b
        L_0x0028:
            q5.a r0 = q5.C1365a.f14779U
        L_0x002a:
            r4 = 0
        L_0x002b:
            q5.a r0 = q5.C1365a.f14780V
            if (r4 != r0) goto L_0x0047
            P4.a r0 = new P4.a
            w5.a r6 = w5.C1591a.UNSUPPORTED_PROTOCOL_VERSION
            P4.b r13 = P4.b.f3787j
            u4.b r17 = u4.C1493b.f15776c
            r15 = 0
            r16 = 0
            r7 = 0
            r8 = -1
            r10 = -1
            r11 = 0
            r12 = 0
            r14 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03d9
        L_0x0047:
            o4.c r0 = o4.f.d()
            throw r0
        L_0x004c:
            short r2 = r41.readUnsignedByte()
            r3 = r2 & 254(0xfe, float:3.56E-43)
            if (r3 != 0) goto L_0x03e9
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x005a
            r7 = 1
            goto L_0x005b
        L_0x005a:
            r7 = 0
        L_0x005b:
            short r2 = r41.readUnsignedByte()
            w5.a r5 = w5.C1591a.SUCCESS
            if (r2 != 0) goto L_0x0067
            w5.a r2 = w5.C1591a.SUCCESS
        L_0x0065:
            r6 = r2
            goto L_0x0077
        L_0x0067:
            r5 = 128(0x80, float:1.794E-43)
            if (r2 < r5) goto L_0x0076
            r6 = 159(0x9f, float:2.23E-43)
            if (r2 <= r6) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            w5.a[] r6 = w5.C1591a.f16219b0
            int r2 = r2 - r5
            r2 = r6[r2]
            goto L_0x0065
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 == 0) goto L_0x03e4
            w5.a r2 = w5.C1591a.SUCCESS
            if (r6 == r2) goto L_0x0088
            if (r7 != 0) goto L_0x0080
            goto L_0x0088
        L_0x0080:
            o4.c r0 = new o4.c
            java.lang.String r1 = "session present must be 0 if reason code is not SUCCESS"
            r0.<init>(r1)
            throw r0
        L_0x0088:
            q4.b.c(r41)
            k5.a r2 = w5.C1592b.f16222a
            r11 = 268435460(0x10000004, float:2.524356E-29)
            r16 = r2
            r1 = 0
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 65535(0xffff, float:9.1834E-41)
            r14 = 268435460(0x10000004, float:2.524356E-29)
            r15 = 0
            r17 = 0
            r19 = 1
            r20 = 1
            r21 = -1
            r23 = 1
            r24 = 1
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
        L_0x00bb:
            boolean r34 = r41.isReadable()
            if (r34 == 0) goto L_0x0393
            int r34 = q4.b.e(r41)
            r35 = r7
            java.lang.String r7 = "receive maximum"
            switch(r34) {
                case 17: goto L_0x0357;
                case 18: goto L_0x030d;
                case 19: goto L_0x02f3;
                case 20: goto L_0x00cc;
                case 21: goto L_0x02df;
                case 22: goto L_0x02c8;
                case 23: goto L_0x00cc;
                case 24: goto L_0x00cc;
                case 25: goto L_0x00cc;
                case 26: goto L_0x02a6;
                case 27: goto L_0x00cc;
                case 28: goto L_0x0294;
                case 29: goto L_0x00cc;
                case 30: goto L_0x00cc;
                case 31: goto L_0x027b;
                case 32: goto L_0x00cc;
                case 33: goto L_0x024d;
                case 34: goto L_0x022c;
                case 35: goto L_0x00cc;
                case 36: goto L_0x01cc;
                case 37: goto L_0x01a2;
                case 38: goto L_0x018d;
                case 39: goto L_0x013a;
                case 40: goto L_0x0117;
                case 41: goto L_0x00f3;
                case 42: goto L_0x00d1;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            o4.c r0 = q4.b.n(r34)
            throw r0
        L_0x00d1:
            java.lang.String r7 = "shared subscription available"
            boolean r3 = q4.b.a(r3, r7, r0)
            r7 = 1
            if (r3 == r7) goto L_0x00dd
            r33 = 1
            goto L_0x00df
        L_0x00dd:
            r33 = 0
        L_0x00df:
            r27 = r27 | r33
            r23 = r3
            r37 = r6
            r6 = r31
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = 1
            r25 = -1
        L_0x00ed:
            r31 = r5
        L_0x00ef:
            r5 = r42
            goto L_0x037b
        L_0x00f3:
            r34 = r3
            r7 = 1
            java.lang.String r3 = "subscription identifier available"
            r37 = r6
            r6 = r32
            boolean r3 = q4.b.a(r6, r3, r0)
            if (r3 == r7) goto L_0x0105
            r33 = 1
            goto L_0x0107
        L_0x0105:
            r33 = 0
        L_0x0107:
            r27 = r27 | r33
            r24 = r3
            r6 = r31
            r3 = r34
            r0 = 65535(0xffff, float:9.1834E-41)
            r25 = -1
            r32 = 1
            goto L_0x00ed
        L_0x0117:
            r34 = r3
            r37 = r6
            r6 = r32
            r7 = 1
            java.lang.String r3 = "wildcard subscription available"
            r6 = r31
            boolean r3 = q4.b.a(r6, r3, r0)
            if (r3 == r7) goto L_0x012a
            r7 = 1
            goto L_0x012b
        L_0x012a:
            r7 = 0
        L_0x012b:
            r27 = r27 | r7
            r20 = r3
            r31 = r5
            r3 = r34
            r0 = 65535(0xffff, float:9.1834E-41)
            r6 = 1
        L_0x0137:
            r25 = -1
            goto L_0x00ef
        L_0x013a:
            r34 = r3
            r37 = r6
            r6 = r31
            if (r30 != 0) goto L_0x0186
            int r3 = r41.readableBytes()
            r7 = 4
            if (r3 < r7) goto L_0x0181
            r3 = r6
            long r6 = r41.readUnsignedInt()
            r30 = 0
            int r36 = (r6 > r30 ? 1 : (r6 == r30 ? 0 : -1))
            if (r36 == 0) goto L_0x0177
            r30 = 268435460(0x10000004, double:1.32624739E-315)
            int r36 = (r6 > r30 ? 1 : (r6 == r30 ? 0 : -1))
            if (r36 >= 0) goto L_0x016c
            int r7 = (int) r6
            r6 = r3
            r31 = r5
            r14 = r7
            r3 = r34
            r0 = 65535(0xffff, float:9.1834E-41)
            r25 = -1
            r27 = 1
        L_0x0169:
            r30 = 1
            goto L_0x00ef
        L_0x016c:
            r6 = r3
            r31 = r5
            r3 = r34
            r0 = 65535(0xffff, float:9.1834E-41)
            r25 = -1
            goto L_0x0169
        L_0x0177:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.PROTOCOL_ERROR
            java.lang.String r2 = "maximum packet size must not be 0"
            r0.<init>(r1, r2)
            throw r0
        L_0x0181:
            o4.c r0 = q4.b.k()
            throw r0
        L_0x0186:
            java.lang.String r0 = "maximum packet size"
            o4.c r0 = q4.b.l(r0)
            throw r0
        L_0x018d:
            r34 = r3
            r37 = r6
            r6 = r29
            r3 = r31
            D2.o r29 = q4.b.i(r6, r0)
            r6 = r3
            r31 = r5
            r3 = r34
            r0 = 65535(0xffff, float:9.1834E-41)
            goto L_0x0137
        L_0x01a2:
            r34 = r3
            r37 = r6
            r6 = r29
            r3 = r31
            java.lang.String r7 = "retain available"
            boolean r5 = q4.b.a(r5, r7, r0)
            r7 = 1
            if (r5 == r7) goto L_0x01b6
            r19 = 1
            goto L_0x01b8
        L_0x01b6:
            r19 = 0
        L_0x01b8:
            r27 = r27 | r19
            r19 = r5
            r29 = r6
            r0 = 65535(0xffff, float:9.1834E-41)
            r25 = -1
            r31 = 1
            r5 = r42
            r6 = r3
            r3 = r34
            goto L_0x037b
        L_0x01cc:
            r34 = r3
            r37 = r6
            r6 = r29
            r3 = r31
            r7 = 1
            if (r28 != 0) goto L_0x0225
            r29 = r3
            int r3 = r41.readableBytes()
            if (r3 < r7) goto L_0x0220
            short r3 = r41.readUnsignedByte()
            if (r3 == 0) goto L_0x01f2
            if (r3 != r7) goto L_0x01e8
            goto L_0x01f2
        L_0x01e8:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.PROTOCOL_ERROR
            java.lang.String r2 = "wrong maximum Qos"
            r0.<init>(r1, r2)
            throw r0
        L_0x01f2:
            if (r3 < 0) goto L_0x01ff
            k5.a[] r7 = k5.a.f13050X
            r31 = r5
            int r5 = r7.length
            if (r3 < r5) goto L_0x01fc
            goto L_0x0201
        L_0x01fc:
            r3 = r7[r3]
            goto L_0x0202
        L_0x01ff:
            r31 = r5
        L_0x0201:
            r3 = 0
        L_0x0202:
            k5.a r5 = w5.C1592b.f16222a
            if (r3 == r5) goto L_0x0208
            r7 = 1
            goto L_0x0209
        L_0x0208:
            r7 = 0
        L_0x0209:
            r27 = r27 | r7
            r5 = r42
            r16 = r3
            r3 = r34
            r0 = 65535(0xffff, float:9.1834E-41)
            r25 = -1
            r28 = 1
        L_0x0218:
            r38 = r29
            r29 = r6
            r6 = r38
            goto L_0x037b
        L_0x0220:
            o4.c r0 = q4.b.k()
            throw r0
        L_0x0225:
            java.lang.String r0 = "maximum Qos"
            o4.c r0 = q4.b.l(r0)
            throw r0
        L_0x022c:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r3 = 1
            r31 = r5
            int r17 = q4.b.m(r10, r7, r0)
            if (r17 == 0) goto L_0x023f
            r7 = 1
            goto L_0x0240
        L_0x023f:
            r7 = 0
        L_0x0240:
            r27 = r27 | r7
            r5 = r42
            r3 = r34
            r0 = 65535(0xffff, float:9.1834E-41)
            r10 = 1
        L_0x024a:
            r25 = -1
            goto L_0x0218
        L_0x024d:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r3 = 1
            r31 = r5
            int r13 = q4.b.m(r9, r7, r0)
            if (r13 == 0) goto L_0x0271
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r13 == r5) goto L_0x0265
            r7 = 1
            goto L_0x0266
        L_0x0265:
            r7 = 0
        L_0x0266:
            r27 = r27 | r7
            r5 = r42
            r3 = r34
            r0 = 65535(0xffff, float:9.1834E-41)
            r9 = 1
            goto L_0x024a
        L_0x0271:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.PROTOCOL_ERROR
            java.lang.String r2 = "receive maximum must not be 0"
            r0.<init>(r1, r2)
            throw r0
        L_0x027b:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r3 = 1
            r31 = r5
            java.lang.String r5 = "reason string"
            u4.d r1 = q4.b.h(r1, r5, r0)
        L_0x028c:
            r5 = r42
        L_0x028e:
            r3 = r34
            r0 = 65535(0xffff, float:9.1834E-41)
            goto L_0x024a
        L_0x0294:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r3 = 1
            r31 = r5
            java.lang.String r5 = "server reference"
            u4.d r12 = q4.b.h(r12, r5, r0)
            goto L_0x028c
        L_0x02a6:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r3 = 1
            r31 = r5
            r5 = r42
            boolean r7 = r5.f14271c
            if (r7 == 0) goto L_0x02be
            java.lang.String r7 = "response information"
            u4.d r15 = q4.b.h(r15, r7, r0)
            goto L_0x028e
        L_0x02be:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.PROTOCOL_ERROR
            java.lang.String r2 = "response information must not be included if it was not requested"
            r0.<init>(r1, r2)
            throw r0
        L_0x02c8:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r3 = 1
            r31 = r5
            r5 = r42
            r42.getClass()
            java.lang.String r7 = "auth data"
            java.nio.ByteBuffer r8 = q4.b.d(r8, r7, r0)
            goto L_0x028e
        L_0x02df:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r3 = 1
            r31 = r5
            r5 = r42
            java.lang.String r7 = "auth method"
            u4.d r4 = q4.b.h(r4, r7, r0)
            goto L_0x028e
        L_0x02f3:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r3 = 1
            r7 = -1
            r31 = r5
            r5 = r42
            if (r2 == r7) goto L_0x0305
            r2 = 1
            goto L_0x0306
        L_0x0305:
            r2 = 0
        L_0x0306:
            java.lang.String r3 = "server keep alive"
            int r2 = q4.b.m(r2, r3, r0)
            goto L_0x028e
        L_0x030d:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r7 = -1
            r31 = r5
            r5 = r42
            java.lang.String r3 = "client identifier"
            if (r11 != 0) goto L_0x0352
            int r11 = u4.C1492a.f15775Z
            byte[] r11 = D7.b.k(r41)
            if (r11 != 0) goto L_0x032b
            r0 = 65535(0xffff, float:9.1834E-41)
            r11 = 0
            goto L_0x0340
        L_0x032b:
            int r7 = r11.length
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r7 > r0) goto L_0x033e
            boolean r7 = u4.d.f(r11)
            if (r7 == 0) goto L_0x0338
            goto L_0x033e
        L_0x0338:
            u4.a r7 = new u4.a
            r7.<init>((byte[]) r11)
            goto L_0x033f
        L_0x033e:
            r7 = 0
        L_0x033f:
            r11 = r7
        L_0x0340:
            if (r11 == 0) goto L_0x0346
            r3 = r34
            goto L_0x024a
        L_0x0346:
            o4.c r0 = new o4.c
            java.lang.String r1 = "malformed UTF-8 string for "
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1)
            throw r0
        L_0x0352:
            o4.c r0 = q4.b.l(r3)
            throw r0
        L_0x0357:
            r34 = r3
            r37 = r6
            r6 = r29
            r29 = r31
            r0 = 65535(0xffff, float:9.1834E-41)
            r25 = -1
            r31 = r5
            r5 = r42
            int r3 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r3 != 0) goto L_0x038c
            int r3 = r41.readableBytes()
            r7 = 4
            if (r3 < r7) goto L_0x0387
            long r21 = r41.readUnsignedInt()
            r3 = r34
            goto L_0x0218
        L_0x037b:
            r0 = r41
            r5 = r31
            r7 = r35
            r31 = r6
            r6 = r37
            goto L_0x00bb
        L_0x0387:
            o4.c r0 = q4.b.k()
            throw r0
        L_0x038c:
            java.lang.String r0 = "session expiry interval"
            o4.c r0 = q4.b.l(r0)
            throw r0
        L_0x0393:
            r37 = r6
            r35 = r7
            r6 = r29
            if (r4 == 0) goto L_0x03a1
            M4.b r0 = new M4.b
            r0.<init>(r4, r8)
            goto L_0x03a4
        L_0x03a1:
            if (r8 != 0) goto L_0x03da
            r0 = 0
        L_0x03a4:
            P4.b r3 = P4.b.f3787j
            if (r27 == 0) goto L_0x03bd
            P4.b r3 = new P4.b
            r4 = r12
            r12 = r3
            r25 = r15
            r15 = r17
            r17 = r19
            r18 = r20
            r19 = r23
            r20 = r24
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x03bb:
            r13 = r3
            goto L_0x03c1
        L_0x03bd:
            r4 = r12
            r25 = r15
            goto L_0x03bb
        L_0x03c1:
            u4.b r17 = u4.C1493b.a(r6)
            P4.a r3 = new P4.a
            r5 = r3
            r6 = r37
            r7 = r35
            r8 = r21
            r10 = r2
            r12 = r0
            r14 = r25
            r15 = r4
            r16 = r1
            r5.<init>(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r3
        L_0x03d9:
            return r0
        L_0x03da:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.PROTOCOL_ERROR
            java.lang.String r2 = "auth data must not be included if auth method is absent"
            r0.<init>(r1, r2)
            throw r0
        L_0x03e4:
            o4.c r0 = q4.b.o()
            throw r0
        L_0x03e9:
            o4.c r0 = new o4.c
            java.lang.String r1 = "wrong CONNACK flags, bits 7-1 must be 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.d.a(int, S5.n, o4.b):L4.c");
    }
}
