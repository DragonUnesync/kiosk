package q4;

import o4.d;

public final class j implements d {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: J1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: J1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: J1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: J1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: J1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: J1.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: J1.d} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final L4.c a(int r27, S5.C0185n r28, o4.C1319b r29) {
        /*
            r26 = this;
            r0 = r27
            r1 = r28
            r2 = 8
            r3 = 1
            r4 = r0 & 8
            if (r4 == 0) goto L_0x000d
            r9 = 1
            goto L_0x000e
        L_0x000d:
            r9 = 0
        L_0x000e:
            k5.a r13 = o4.f.c(r0, r9)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0017
            r14 = 1
            goto L_0x0018
        L_0x0017:
            r14 = 0
        L_0x0018:
            int r0 = r28.readableBytes()
            r4 = 3
            if (r0 < r4) goto L_0x02b1
            byte[] r0 = D7.b.k(r28)
            java.lang.String r6 = "malformed topic"
            if (r0 == 0) goto L_0x02a9
            int r7 = r0.length
            if (r7 == 0) goto L_0x0039
            u4.a r0 = u4.C1492a.i(r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x003a
        L_0x0031:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.TOPIC_NAME_INVALID
            r0.<init>(r1, r6)
            throw r0
        L_0x0039:
            r0 = 0
        L_0x003a:
            k5.a r6 = k5.a.f13047U
            r7 = 2
            if (r13 != r6) goto L_0x0043
            r6 = -1
            r22 = -1
            goto L_0x004f
        L_0x0043:
            int r6 = r28.readableBytes()
            if (r6 < r7) goto L_0x02a4
            int r6 = r28.readUnsignedShort()
            r22 = r6
        L_0x004f:
            int r6 = q4.b.f(r28)
            int r10 = r28.readerIndex()
            r5 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = 0
            r19 = 0
            r23 = 0
        L_0x0066:
            int r18 = r28.readerIndex()
            int r2 = r18 - r10
            y5.a r18 = y5.C1635a.f16397V
            if (r2 >= r6) goto L_0x01f4
            int r2 = q4.b.e(r28)
            if (r2 == r3) goto L_0x01a2
            if (r2 == r7) goto L_0x017b
            if (r2 == r4) goto L_0x016d
            r4 = 8
            if (r2 == r4) goto L_0x013f
            r4 = 9
            if (r2 == r4) goto L_0x012e
            r4 = 11
            if (r2 == r4) goto L_0x00c4
            r3 = 35
            if (r2 == r3) goto L_0x00a6
            r3 = 38
            if (r2 != r3) goto L_0x00a1
            r4 = r23
            D2.o r23 = q4.b.i(r4, r1)
            r25 = r9
            r24 = r10
            r4 = r23
        L_0x009a:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x01cf
        L_0x00a1:
            o4.c r0 = q4.b.n(r2)
            throw r0
        L_0x00a6:
            r4 = r23
            if (r12 == 0) goto L_0x00ac
            r2 = 1
            goto L_0x00ad
        L_0x00ac:
            r2 = 0
        L_0x00ad:
            java.lang.String r3 = "topic alias"
            int r12 = q4.b.m(r2, r3, r1)
            if (r12 == 0) goto L_0x00ba
        L_0x00b5:
            r25 = r9
            r24 = r10
            goto L_0x009a
        L_0x00ba:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.TOPIC_ALIAS_INVALID
            java.lang.String r2 = "topic alias must not be 0"
            r0.<init>(r1, r2)
            throw r0
        L_0x00c4:
            r4 = r23
            if (r5 != 0) goto L_0x00cd
            J1.d r5 = new J1.d
            r5.<init>()
        L_0x00cd:
            int r2 = G5.s.j(r28)
            if (r2 < 0) goto L_0x0126
            if (r2 == 0) goto L_0x011c
            int r7 = r5.f2352V
            if (r7 != 0) goto L_0x00df
            r5.f2351U = r2
            r2 = 1
            r5.f2352V = r2
            goto L_0x00b5
        L_0x00df:
            java.lang.Object r3 = r5.f2353W
            int[] r3 = (int[]) r3
            if (r3 != 0) goto L_0x00ee
            r24 = r10
            r10 = 4
            int[] r3 = new int[r10]
            r5.f2353W = r3
        L_0x00ec:
            r10 = 1
            goto L_0x00ff
        L_0x00ee:
            r24 = r10
            int r10 = r3.length
            if (r7 != r10) goto L_0x00ec
            int r7 = r3.length
            r10 = 1
            int r18 = r7 >> 1
            int r7 = r7 + r18
            int[] r3 = java.util.Arrays.copyOf(r3, r7)
            r5.f2353W = r3
        L_0x00ff:
            int r3 = r5.f2352V
            if (r3 != r10) goto L_0x010d
            java.lang.Object r7 = r5.f2353W
            int[] r7 = (int[]) r7
            int r10 = r5.f2351U
            r18 = 0
            r7[r18] = r10
        L_0x010d:
            java.lang.Object r7 = r5.f2353W
            int[] r7 = (int[]) r7
            r25 = r9
            r10 = 1
            int r9 = r3 + 1
            r5.f2352V = r9
            r7[r3] = r2
            goto L_0x009a
        L_0x011c:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.PROTOCOL_ERROR
            java.lang.String r2 = "subscription identifier must not be 0"
            r0.<init>(r1, r2)
            throw r0
        L_0x0126:
            o4.c r0 = new o4.c
            java.lang.String r1 = "malformed subscription identifier"
            r0.<init>(r1)
            throw r0
        L_0x012e:
            r25 = r9
            r24 = r10
            r4 = r23
            r29.getClass()
            java.lang.String r2 = "correlation data"
            java.nio.ByteBuffer r11 = q4.b.d(r11, r2, r1)
            goto L_0x009a
        L_0x013f:
            r25 = r9
            r24 = r10
            r4 = r23
            if (r19 != 0) goto L_0x0166
            int r2 = u4.C1492a.f15775Z
            byte[] r2 = D7.b.k(r28)
            if (r2 != 0) goto L_0x0152
            r19 = 0
            goto L_0x0158
        L_0x0152:
            u4.a r2 = u4.C1492a.i(r2)
            r19 = r2
        L_0x0158:
            if (r19 == 0) goto L_0x015c
            goto L_0x009a
        L_0x015c:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.TOPIC_NAME_INVALID
            java.lang.String r2 = "malformed response topic"
            r0.<init>(r1, r2)
            throw r0
        L_0x0166:
            java.lang.String r0 = "response topic"
            o4.c r0 = q4.b.l(r0)
            throw r0
        L_0x016d:
            r25 = r9
            r24 = r10
            r4 = r23
            java.lang.String r2 = "content type"
            u4.d r8 = q4.b.h(r8, r2, r1)
            goto L_0x009a
        L_0x017b:
            r25 = r9
            r24 = r10
            r4 = r23
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x019b
            int r7 = r28.readableBytes()
            r9 = 4
            if (r7 < r9) goto L_0x0196
            long r15 = r28.readUnsignedInt()
            goto L_0x01cf
        L_0x0196:
            o4.c r0 = q4.b.k()
            throw r0
        L_0x019b:
            java.lang.String r0 = "message expiry interval"
            o4.c r0 = q4.b.l(r0)
            throw r0
        L_0x01a2:
            r25 = r9
            r24 = r10
            r4 = r23
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r17 == 0) goto L_0x01b1
            r7 = 1
            goto L_0x01b2
        L_0x01b1:
            r7 = 0
        L_0x01b2:
            if (r7 != 0) goto L_0x01ed
            int r7 = r28.readableBytes()
            r9 = 1
            if (r7 < r9) goto L_0x01e8
            short r7 = r28.readUnsignedByte()
            if (r7 != 0) goto L_0x01c6
            y5.a r10 = y5.C1635a.f16396U
            r17 = r10
            goto L_0x01cd
        L_0x01c6:
            if (r7 != r9) goto L_0x01cb
            r17 = r18
            goto L_0x01cd
        L_0x01cb:
            r17 = 0
        L_0x01cd:
            if (r17 == 0) goto L_0x01dc
        L_0x01cf:
            r23 = r4
            r10 = r24
            r9 = r25
            r2 = 8
            r3 = 1
            r4 = 3
            r7 = 2
            goto L_0x0066
        L_0x01dc:
            o4.c r0 = new o4.c
            java.lang.String r1 = "wrong payload format indicator: "
            java.lang.String r1 = Q0.g.m(r7, r1)
            r0.<init>(r1)
            throw r0
        L_0x01e8:
            o4.c r0 = q4.b.k()
            throw r0
        L_0x01ed:
            java.lang.String r0 = "payload format indicator"
            o4.c r0 = q4.b.l(r0)
            throw r0
        L_0x01f4:
            r25 = r9
            r4 = r23
            if (r2 != r6) goto L_0x029f
            if (r12 == 0) goto L_0x022e
            r2 = r29
            u4.a[] r3 = r2.f14269a
            if (r3 == 0) goto L_0x0224
            int r6 = r3.length
            if (r12 > r6) goto L_0x0224
            if (r0 != 0) goto L_0x0219
            r6 = 1
            int r0 = r12 + -1
            r0 = r3[r0]
            if (r0 == 0) goto L_0x020f
            goto L_0x0221
        L_0x020f:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.TOPIC_ALIAS_INVALID
            java.lang.String r2 = "topic alias has no mapping"
            r0.<init>(r1, r2)
            throw r0
        L_0x0219:
            r6 = 1
            int r7 = r12 + -1
            r3[r7] = r0
            r3 = 65536(0x10000, float:9.18355E-41)
            r12 = r12 | r3
        L_0x0221:
            r3 = r0
            r0 = r12
            goto L_0x0233
        L_0x0224:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.TOPIC_ALIAS_INVALID
            java.lang.String r2 = "topic alias must not exceed topic alias maximum"
            r0.<init>(r1, r2)
            throw r0
        L_0x022e:
            r2 = r29
            if (r0 == 0) goto L_0x0295
            goto L_0x0221
        L_0x0233:
            int r6 = r28.readableBytes()
            if (r6 <= 0) goto L_0x0249
            r29.getClass()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r6)
            r1.readBytes((java.nio.ByteBuffer) r2)
            r1 = 0
            r2.position(r1)
            r12 = r2
            goto L_0x024a
        L_0x0249:
            r12 = 0
        L_0x024a:
            u4.b r21 = u4.C1493b.a(r4)
            V4.a r7 = new V4.a
            r10 = r7
            r1 = r11
            r11 = r3
            r18 = r8
            r20 = r1
            r10.<init>(r11, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            i5.h r1 = i5.h.f12745a
            if (r5 != 0) goto L_0x0260
        L_0x025e:
            r11 = r1
            goto L_0x0289
        L_0x0260:
            int r2 = r5.f2352V
            if (r2 == 0) goto L_0x025e
            r3 = 1
            if (r2 == r3) goto L_0x0281
            java.lang.Object r1 = r5.f2353W
            int[] r1 = (int[]) r1
            int r3 = r1.length
            if (r3 != r2) goto L_0x0275
            i5.l r2 = new i5.l
            r2.<init>(r1)
            r1 = r2
            goto L_0x025e
        L_0x0275:
            i5.l r3 = new i5.l
            r4 = 0
            int[] r1 = java.util.Arrays.copyOfRange(r1, r4, r2)
            r3.<init>(r1)
            r1 = r3
            goto L_0x025e
        L_0x0281:
            i5.m r1 = new i5.m
            int r2 = r5.f2351U
            r1.<init>(r2)
            goto L_0x025e
        L_0x0289:
            V4.f r1 = new V4.f
            r6 = r1
            r8 = r22
            r9 = r25
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r1
        L_0x0295:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.PROTOCOL_ERROR
            java.lang.String r2 = "topic alias must be present if topic name is zero length"
            r0.<init>(r1, r2)
            throw r0
        L_0x029f:
            o4.c r0 = q4.b.k()
            throw r0
        L_0x02a4:
            o4.c r0 = o4.f.d()
            throw r0
        L_0x02a9:
            o4.c r0 = new o4.c
            x5.b r1 = x5.C1607b.TOPIC_NAME_INVALID
            r0.<init>(r1, r6)
            throw r0
        L_0x02b1:
            o4.c r0 = o4.f.d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.j.a(int, S5.n, o4.b):L4.c");
    }
}
