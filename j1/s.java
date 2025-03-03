package J1;

import p1.F;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2467a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2468b;

    /* renamed from: c  reason: collision with root package name */
    public final F f2469c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2470d;
    public final byte[] e;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r7.equals("cbc1") == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(boolean r6, java.lang.String r7, int r8, byte[] r9, int r10, int r11, byte[] r12) {
        /*
            r5 = this;
            r0 = 2
            r5.<init>()
            r1 = 0
            r2 = 1
            if (r8 != 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r12 != 0) goto L_0x000f
            r4 = 1
            goto L_0x0010
        L_0x000f:
            r4 = 0
        L_0x0010:
            r3 = r3 ^ r4
            P0.l.d(r3)
            r5.f2467a = r6
            r5.f2468b = r7
            r5.f2470d = r8
            r5.e = r12
            p1.F r6 = new p1.F
            if (r7 != 0) goto L_0x0022
        L_0x0020:
            r0 = 1
            goto L_0x0072
        L_0x0022:
            r8 = -1
            int r12 = r7.hashCode()
            switch(r12) {
                case 3046605: goto L_0x004d;
                case 3046671: goto L_0x0042;
                case 3049879: goto L_0x0037;
                case 3049895: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r1 = -1
            goto L_0x0056
        L_0x002c:
            java.lang.String r12 = "cens"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L_0x0035
            goto L_0x002a
        L_0x0035:
            r1 = 3
            goto L_0x0056
        L_0x0037:
            java.lang.String r12 = "cenc"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L_0x0040
            goto L_0x002a
        L_0x0040:
            r1 = 2
            goto L_0x0056
        L_0x0042:
            java.lang.String r12 = "cbcs"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L_0x004b
            goto L_0x002a
        L_0x004b:
            r1 = 1
            goto L_0x0056
        L_0x004d:
            java.lang.String r12 = "cbc1"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L_0x0056
            goto L_0x002a
        L_0x0056:
            switch(r1) {
                case 0: goto L_0x0072;
                case 1: goto L_0x0072;
                case 2: goto L_0x0020;
                case 3: goto L_0x0020;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported protection scheme type '"
            r8.<init>(r12)
            r8.append(r7)
            java.lang.String r7 = "'. Assuming AES-CTR crypto mode."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "TrackEncryptionBox"
            P0.l.B(r8, r7)
            goto L_0x0020
        L_0x0072:
            r6.<init>(r0, r10, r11, r9)
            r5.f2469c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.s.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
