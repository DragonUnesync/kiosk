package q4;

import o4.d;

public final class e implements d {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: D2.o} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3, types: [u4.d] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final L4.c a(int r11, S5.C0185n r12, o4.C1319b r13) {
        /*
            r10 = this;
            r13 = 0
            o4.f.a(r13, r11)
            x5.b r11 = x5.C1606a.f16298a
            boolean r13 = r12.isReadable()
            r0 = -1
            r2 = 0
            if (r13 == 0) goto L_0x008f
            short r11 = r12.readUnsignedByte()
            r13 = 4
            if (r11 != 0) goto L_0x0019
            x5.b r11 = x5.C1607b.NORMAL_DISCONNECTION
            goto L_0x002e
        L_0x0019:
            if (r11 != r13) goto L_0x001e
            x5.b r11 = x5.C1607b.DISCONNECT_WITH_WILL_MESSAGE
            goto L_0x002e
        L_0x001e:
            int r3 = x5.C1607b.f16315l0
            if (r11 < r3) goto L_0x002d
            r4 = 162(0xa2, float:2.27E-43)
            if (r11 <= r4) goto L_0x0027
            goto L_0x002d
        L_0x0027:
            x5.b[] r4 = x5.C1607b.f16316m0
            int r11 = r11 - r3
            r11 = r4[r11]
            goto L_0x002e
        L_0x002d:
            r11 = r2
        L_0x002e:
            if (r11 == 0) goto L_0x0094
            boolean r3 = r12.isReadable()
            if (r3 == 0) goto L_0x008f
            q4.b.c(r12)
            r5 = r0
            r3 = r2
            r4 = r3
        L_0x003c:
            boolean r7 = r12.isReadable()
            if (r7 == 0) goto L_0x0089
            int r7 = q4.b.e(r12)
            r8 = 17
            if (r7 == r8) goto L_0x006e
            r8 = 28
            if (r7 == r8) goto L_0x0067
            r8 = 31
            if (r7 == r8) goto L_0x0060
            r8 = 38
            if (r7 != r8) goto L_0x005b
            D2.o r4 = q4.b.i(r4, r12)
            goto L_0x003c
        L_0x005b:
            o4.c r11 = q4.b.n(r7)
            throw r11
        L_0x0060:
            java.lang.String r7 = "reason string"
            u4.d r3 = q4.b.h(r3, r7, r12)
            goto L_0x003c
        L_0x0067:
            java.lang.String r7 = "server reference"
            u4.d r2 = q4.b.h(r2, r7, r12)
            goto L_0x003c
        L_0x006e:
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0082
            int r5 = r12.readableBytes()
            if (r5 < r13) goto L_0x007d
            long r5 = r12.readUnsignedInt()
            goto L_0x003c
        L_0x007d:
            o4.c r11 = q4.b.k()
            throw r11
        L_0x0082:
            java.lang.String r11 = "session expiry interval"
            o4.c r11 = q4.b.l(r11)
            throw r11
        L_0x0089:
            r1 = r11
            r11 = r3
            r9 = r4
            r4 = r2
            r2 = r9
            goto L_0x0099
        L_0x008f:
            r5 = r0
            r4 = r2
            r1 = r11
            r11 = r4
            goto L_0x0099
        L_0x0094:
            o4.c r11 = q4.b.o()
            throw r11
        L_0x0099:
            u4.b r12 = u4.C1493b.a(r2)
            S4.a r13 = new S4.a
            r0 = r13
            r2 = r5
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r4, r5, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.e.a(int, S5.n, o4.b):L4.c");
    }
}
