package q4;

import o4.d;

/* renamed from: q4.a  reason: case insensitive filesystem */
public final class C1364a implements d {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final L4.c a(int r8, S5.C0185n r9, o4.C1319b r10) {
        /*
            r7 = this;
            r0 = 0
            o4.f.a(r0, r8)
            int r8 = r9.readableBytes()
            r0 = 2
            if (r8 < r0) goto L_0x0087
            short r8 = r9.readUnsignedByte()
            r0 = 0
            if (r8 != 0) goto L_0x0016
            v5.a r8 = v5.C1561a.SUCCESS
        L_0x0014:
            r2 = r8
            goto L_0x0025
        L_0x0016:
            r1 = 24
            if (r8 != r1) goto L_0x001d
            v5.a r8 = v5.C1561a.CONTINUE_AUTHENTICATION
            goto L_0x0014
        L_0x001d:
            r1 = 25
            if (r8 != r1) goto L_0x0024
            v5.a r8 = v5.C1561a.REAUTHENTICATE
            goto L_0x0014
        L_0x0024:
            r2 = r0
        L_0x0025:
            if (r2 == 0) goto L_0x0082
            q4.b.c(r9)
            r3 = r0
            r4 = r3
            r5 = r4
        L_0x002d:
            boolean r8 = r9.isReadable()
            if (r8 == 0) goto L_0x006b
            int r8 = q4.b.e(r9)
            r1 = 21
            if (r8 == r1) goto L_0x0063
            r1 = 22
            if (r8 == r1) goto L_0x0058
            r1 = 31
            if (r8 == r1) goto L_0x0052
            r1 = 38
            if (r8 != r1) goto L_0x004d
            D2.o r8 = q4.b.j(r0, r9, r10)
            r0 = r8
            goto L_0x002d
        L_0x004d:
            o4.c r8 = q4.b.n(r8)
            throw r8
        L_0x0052:
            u4.d r8 = q4.b.g(r5, r9, r10)
            r5 = r8
            goto L_0x002d
        L_0x0058:
            r10.getClass()
            java.lang.String r8 = "auth data"
            java.nio.ByteBuffer r8 = q4.b.d(r4, r8, r9)
            r4 = r8
            goto L_0x002d
        L_0x0063:
            java.lang.String r8 = "auth method"
            u4.d r8 = q4.b.h(r3, r8, r9)
            r3 = r8
            goto L_0x002d
        L_0x006b:
            if (r3 == 0) goto L_0x0078
            u4.b r6 = u4.C1493b.a(r0)
            M4.a r8 = new M4.a
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r8
        L_0x0078:
            o4.c r8 = new o4.c
            x5.b r9 = x5.C1607b.PROTOCOL_ERROR
            java.lang.String r10 = "must not omit authentication method"
            r8.<init>(r9, r10)
            throw r8
        L_0x0082:
            o4.c r8 = q4.b.o()
            throw r8
        L_0x0087:
            o4.c r8 = o4.f.d()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C1364a.a(int, S5.n, o4.b):L4.c");
    }
}
