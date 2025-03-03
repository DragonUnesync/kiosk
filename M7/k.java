package M7;

public final class k extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3199b;

    public /* synthetic */ k(int i) {
        this.f3199b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        r3 = r9 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r9, java.io.StringWriter r10, java.lang.String r11) {
        /*
            r8 = this;
            int r0 = r8.f3199b
            switch(r0) {
                case 0: goto L_0x0096;
                default: goto L_0x0005;
            }
        L_0x0005:
            char r0 = r11.charAt(r9)
            r1 = 92
            if (r0 != r1) goto L_0x0094
            int r0 = r9 + 1
            int r1 = r11.length()
            if (r0 >= r1) goto L_0x0094
            char r0 = r11.charAt(r0)
            r1 = 117(0x75, float:1.64E-43)
            if (r0 != r1) goto L_0x0094
            r0 = 2
        L_0x001e:
            int r2 = r9 + r0
            int r3 = r11.length()
            if (r2 >= r3) goto L_0x002f
            char r3 = r11.charAt(r2)
            if (r3 != r1) goto L_0x002f
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002f:
            int r1 = r11.length()
            if (r2 >= r1) goto L_0x003f
            char r1 = r11.charAt(r2)
            r2 = 43
            if (r1 != r2) goto L_0x003f
            int r0 = r0 + 1
        L_0x003f:
            int r1 = r9 + r0
            int r2 = r1 + 4
            int r3 = r11.length()
            if (r2 > r3) goto L_0x0073
            java.lang.CharSequence r9 = r11.subSequence(r1, r2)
            java.lang.String r11 = r9.toString()     // Catch:{ NumberFormatException -> 0x005e }
            r1 = 16
            int r11 = java.lang.Integer.parseInt(r11, r1)     // Catch:{ NumberFormatException -> 0x005e }
            char r11 = (char) r11     // Catch:{ NumberFormatException -> 0x005e }
            r10.write(r11)     // Catch:{ NumberFormatException -> 0x005e }
            int r0 = r0 + 4
            goto L_0x0095
        L_0x005e:
            r10 = move-exception
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to parse unicode value: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r11.<init>(r9, r10)
            throw r11
        L_0x0073:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Less than 4 hex digits in unicode value: '"
            r0.<init>(r1)
            int r1 = r11.length()
            java.lang.CharSequence r9 = r11.subSequence(r9, r1)
            r0.append(r9)
            java.lang.String r9 = "' due to end of CharSequence"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        L_0x0094:
            r0 = 0
        L_0x0095:
            return r0
        L_0x0096:
            int r0 = r11.length()
            int r0 = r0 - r9
            r1 = 1
            int r0 = r0 - r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r3 = r11.charAt(r9)
            r4 = 92
            if (r3 != r4) goto L_0x0105
            if (r0 <= 0) goto L_0x0105
            int r3 = r9 + 1
            char r4 = r11.charAt(r3)
            r5 = 48
            if (r4 < r5) goto L_0x0105
            r6 = 55
            if (r4 > r6) goto L_0x0105
            int r4 = r9 + 2
            int r9 = r9 + 3
            char r7 = r11.charAt(r3)
            r2.append(r7)
            if (r0 <= r1) goto L_0x00f2
            char r7 = r11.charAt(r4)
            if (r7 < r5) goto L_0x00f2
            if (r7 > r6) goto L_0x00f2
            char r4 = r11.charAt(r4)
            r2.append(r4)
            r4 = 2
            if (r0 <= r4) goto L_0x00f2
            char r0 = r11.charAt(r3)
            if (r0 < r5) goto L_0x00f2
            r3 = 51
            if (r0 > r3) goto L_0x00f2
            char r0 = r11.charAt(r9)
            if (r0 < r5) goto L_0x00f2
            if (r0 > r6) goto L_0x00f2
            char r9 = r11.charAt(r9)
            r2.append(r9)
        L_0x00f2:
            java.lang.String r9 = r2.toString()
            r11 = 8
            int r9 = java.lang.Integer.parseInt(r9, r11)
            r10.write(r9)
            int r9 = r2.length()
            int r9 = r9 + r1
            goto L_0x0106
        L_0x0105:
            r9 = 0
        L_0x0106:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: M7.k.a(int, java.io.StringWriter, java.lang.String):int");
    }
}
