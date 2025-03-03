package a4;

public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7206c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a  reason: collision with root package name */
    public final int[] f7207a;

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f7208b;

    public i(int i) {
        switch (i) {
            case 1:
                this.f7207a = new int[4];
                this.f7208b = new StringBuilder();
                return;
            default:
                this.f7207a = new int[4];
                this.f7208b = new StringBuilder();
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public M3.l a(int r19, S3.a r20, int[] r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = 4
            r3 = 10
            r4 = 2
            r5 = 1
            java.lang.StringBuilder r6 = r0.f7208b
            r7 = 0
            r6.setLength(r7)
            int[] r8 = r0.f7207a
            r8[r7] = r7
            r8[r5] = r7
            r8[r4] = r7
            r9 = 3
            r8[r9] = r7
            int r10 = r1.f4504V
            r11 = r21[r5]
            r12 = 0
            r13 = 0
        L_0x0020:
            r14 = 5
            r15 = 48
            if (r12 >= r14) goto L_0x0053
            if (r11 >= r10) goto L_0x0053
            int[][] r14 = a4.k.f7214g
            int r14 = a4.k.i(r1, r8, r11, r14)
            int r16 = r14 % 10
            int r15 = r16 + 48
            char r15 = (char) r15
            r6.append(r15)
            int r15 = r8.length
        L_0x0036:
            if (r7 >= r15) goto L_0x003e
            r17 = r8[r7]
            int r11 = r11 + r17
            int r7 = r7 + r5
            goto L_0x0036
        L_0x003e:
            if (r14 < r3) goto L_0x0045
            int r7 = 4 - r12
            int r7 = r5 << r7
            r13 = r13 | r7
        L_0x0045:
            if (r12 == r2) goto L_0x0050
            int r7 = r1.b(r11)
            int r7 = r1.c(r7)
            r11 = r7
        L_0x0050:
            int r12 = r12 + r5
            r7 = 0
            goto L_0x0020
        L_0x0053:
            int r1 = r6.length()
            if (r1 != r14) goto L_0x0165
            r1 = 0
        L_0x005a:
            if (r1 >= r3) goto L_0x0162
            int[] r2 = f7206c
            r2 = r2[r1]
            if (r13 != r2) goto L_0x015c
            java.lang.String r2 = r6.toString()
            int r7 = r2.length()
            int r8 = r7 + -2
            r10 = 0
        L_0x006d:
            if (r8 < 0) goto L_0x0078
            char r12 = r2.charAt(r8)
            int r12 = r12 - r15
            int r10 = r10 + r12
            int r8 = r8 + -2
            goto L_0x006d
        L_0x0078:
            int r10 = r10 * 3
            int r7 = r7 - r5
        L_0x007b:
            if (r7 < 0) goto L_0x0086
            char r8 = r2.charAt(r7)
            int r8 = r8 - r15
            int r10 = r10 + r8
            int r7 = r7 + -2
            goto L_0x007b
        L_0x0086:
            int r10 = r10 * 3
            int r10 = r10 % r3
            if (r10 != r1) goto L_0x0159
            java.lang.String r1 = r6.toString()
            int r2 = r1.length()
            r6 = 0
            if (r2 == r14) goto L_0x0099
        L_0x0096:
            r3 = r6
            goto L_0x012d
        L_0x0099:
            r2 = 0
            char r7 = r1.charAt(r2)
            if (r7 == r15) goto L_0x00e3
            r2 = 53
            if (r7 == r2) goto L_0x00e0
            r2 = 57
            java.lang.String r8 = ""
            if (r7 == r2) goto L_0x00ab
            goto L_0x00e5
        L_0x00ab:
            r2 = -1
            int r7 = r1.hashCode()
            switch(r7) {
                case 54118329: goto L_0x00ca;
                case 54395376: goto L_0x00bf;
                case 54395377: goto L_0x00b4;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x00d4
        L_0x00b4:
            java.lang.String r7 = "99991"
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x00bd
            goto L_0x00d4
        L_0x00bd:
            r2 = 2
            goto L_0x00d4
        L_0x00bf:
            java.lang.String r7 = "99990"
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x00c8
            goto L_0x00d4
        L_0x00c8:
            r2 = 1
            goto L_0x00d4
        L_0x00ca:
            java.lang.String r7 = "90000"
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r2 = 0
        L_0x00d4:
            switch(r2) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00db;
                case 2: goto L_0x00d8;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            goto L_0x00e5
        L_0x00d8:
            java.lang.String r2 = "0.00"
            goto L_0x011d
        L_0x00db:
            java.lang.String r2 = "Used"
            goto L_0x011d
        L_0x00de:
            r2 = r6
            goto L_0x011d
        L_0x00e0:
            java.lang.String r8 = "$"
            goto L_0x00e5
        L_0x00e3:
            java.lang.String r8 = "£"
        L_0x00e5:
            java.lang.String r2 = r1.substring(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            int r7 = r2 / 100
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r2 = r2 % 100
            if (r2 >= r3) goto L_0x0102
            java.lang.String r3 = "0"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r3.concat(r2)
            goto L_0x0106
        L_0x0102:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x0106:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r7)
            r7 = 46
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x011d:
            if (r2 != 0) goto L_0x0121
            goto L_0x0096
        L_0x0121:
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.Class<M3.m> r7 = M3.m.class
            r3.<init>(r7)
            M3.m r7 = M3.m.f3157Y
            r3.put(r7, r2)
        L_0x012d:
            M3.l r2 = new M3.l
            M3.n r7 = new M3.n
            r8 = 0
            r9 = r21[r8]
            r8 = r21[r5]
            int r9 = r9 + r8
            float r8 = (float) r9
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            r10 = r19
            float r9 = (float) r10
            r7.<init>(r8, r9)
            M3.n r8 = new M3.n
            float r10 = (float) r11
            r8.<init>(r10, r9)
            M3.n[] r4 = new M3.n[r4]
            r12 = 0
            r4[r12] = r7
            r4[r5] = r8
            M3.a r5 = M3.a.f3122k0
            r2.<init>(r1, r6, r4, r5)
            if (r3 == 0) goto L_0x0158
            r2.a(r3)
        L_0x0158:
            return r2
        L_0x0159:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x015c:
            r10 = r19
            r12 = 0
            int r1 = r1 + r5
            goto L_0x005a
        L_0x0162:
            M3.h r1 = M3.h.f3144W
            throw r1
        L_0x0165:
            M3.h r1 = M3.h.f3144W
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.i.a(int, S3.a, int[]):M3.l");
    }
}
