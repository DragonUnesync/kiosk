package p4;

import o4.d;

public final class c implements d {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final L4.c a(int r18, S5.C0185n r19, o4.C1319b r20) {
        /*
            r17 = this;
            r0 = 0
            r1 = r18
            o4.f.a(r0, r1)
            int r1 = r19.readableBytes()
            r2 = 2
            o4.f.b(r2, r1)
            byte r1 = r19.readByte()
            r3 = r1 & 254(0xfe, float:3.56E-43)
            if (r3 != 0) goto L_0x0087
            r3 = 1
            r1 = r1 & r3
            if (r1 != r3) goto L_0x001c
            r6 = 1
            goto L_0x001d
        L_0x001c:
            r6 = 0
        L_0x001d:
            short r0 = r19.readUnsignedByte()
            if (r0 < 0) goto L_0x002c
            q5.a[] r1 = q5.C1365a.f14785a0
            int r4 = r1.length
            if (r0 < r4) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r0 = r1[r0]
            goto L_0x002f
        L_0x002c:
            q5.a r0 = q5.C1365a.f14779U
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x007f
            q5.a r1 = q5.C1365a.f14779U
            if (r0 == r1) goto L_0x0040
            if (r6 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            o4.c r0 = new o4.c
            java.lang.String r1 = "session present must be 0 if return code is not SUCCESS"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            P4.a r1 = new P4.a
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x006b
            if (r0 == r3) goto L_0x0068
            if (r0 == r2) goto L_0x0065
            r2 = 3
            if (r0 == r2) goto L_0x0062
            r2 = 4
            if (r0 == r2) goto L_0x005f
            r2 = 5
            if (r0 != r2) goto L_0x0059
            w5.a r0 = w5.C1591a.NOT_AUTHORIZED
        L_0x0057:
            r5 = r0
            goto L_0x006e
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x005f:
            w5.a r0 = w5.C1591a.BAD_USER_NAME_OR_PASSWORD
            goto L_0x0057
        L_0x0062:
            w5.a r0 = w5.C1591a.SERVER_UNAVAILABLE
            goto L_0x0057
        L_0x0065:
            w5.a r0 = w5.C1591a.CLIENT_IDENTIFIER_NOT_VALID
            goto L_0x0057
        L_0x0068:
            w5.a r0 = w5.C1591a.UNSUPPORTED_PROTOCOL_VERSION
            goto L_0x0057
        L_0x006b:
            w5.a r0 = w5.C1591a.SUCCESS
            goto L_0x0057
        L_0x006e:
            P4.b r12 = P4.b.f3787j
            u4.b r16 = u4.C1493b.f15776c
            r14 = 0
            r15 = 0
            r7 = -1
            r9 = -1
            r10 = 0
            r11 = 0
            r13 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x007f:
            o4.c r0 = new o4.c
            java.lang.String r1 = "wrong return code"
            r0.<init>(r1)
            throw r0
        L_0x0087:
            o4.c r0 = new o4.c
            java.lang.String r1 = "wrong CONNACK flags, bits 7-1 must be 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.c.a(int, S5.n, o4.b):L4.c");
    }
}
