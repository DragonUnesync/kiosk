package W6;

import android.support.v4.media.session.b;

public abstract class e extends b {
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b6, code lost:
        if (r9 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (r7 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bf, code lost:
        r5.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        r6 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String V(java.lang.String r14) {
        /*
            java.lang.String r0 = "<this>"
            P6.f.e(r14, r0)
            r1 = 0
            r2 = 0
        L_0x0007:
            java.lang.String r3 = "|"
            int r4 = r3.length()
            if (r2 >= r4) goto L_0x00ec
            char r4 = r3.charAt(r2)
            boolean r5 = java.lang.Character.isWhitespace(r4)
            if (r5 != 0) goto L_0x00e8
            boolean r4 = java.lang.Character.isSpaceChar(r4)
            if (r4 == 0) goto L_0x0021
            goto L_0x00e8
        L_0x0021:
            java.lang.String r2 = "\r\n"
            java.lang.String r4 = "\n"
            java.lang.String r5 = "\r"
            java.lang.String[] r2 = new java.lang.String[]{r2, r4, r5}
            W6.c r2 = W6.d.j0(r14, r2, r1, r1)
            D6.a r4 = new D6.a
            r5 = 1
            r4.<init>(r5, r14)
            V6.h r5 = new V6.h
            r5.<init>(r2, r4)
            java.util.List r2 = V6.e.K(r5)
            int r14 = r14.length()
            r2.size()
            int r4 = D6.j.K(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
            r6 = 0
        L_0x0053:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00cc
            java.lang.Object r7 = r2.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x00c4
            java.lang.String r7 = (java.lang.String) r7
            r9 = 0
            if (r6 == 0) goto L_0x0068
            if (r6 != r4) goto L_0x0083
        L_0x0068:
            P6.f.e(r7, r0)
            r6 = 0
        L_0x006c:
            int r10 = r7.length()
            if (r6 >= r10) goto L_0x00b8
            char r10 = r7.charAt(r6)
            boolean r11 = java.lang.Character.isWhitespace(r10)
            if (r11 != 0) goto L_0x00ba
            boolean r10 = java.lang.Character.isSpaceChar(r10)
            if (r10 == 0) goto L_0x0083
            goto L_0x00ba
        L_0x0083:
            int r6 = r7.length()
            r10 = 0
        L_0x0088:
            r11 = -1
            if (r10 >= r6) goto L_0x009e
            char r12 = r7.charAt(r10)
            boolean r13 = java.lang.Character.isWhitespace(r12)
            if (r13 != 0) goto L_0x009b
            boolean r12 = java.lang.Character.isSpaceChar(r12)
            if (r12 == 0) goto L_0x009f
        L_0x009b:
            int r10 = r10 + 1
            goto L_0x0088
        L_0x009e:
            r10 = -1
        L_0x009f:
            if (r10 != r11) goto L_0x00a2
            goto L_0x00b6
        L_0x00a2:
            boolean r6 = W6.l.Z(r10, r7, r3, r1)
            if (r6 == 0) goto L_0x00b6
            int r6 = r3.length()
            int r6 = r6 + r10
            java.lang.String r9 = r7.substring(r6)
            java.lang.String r6 = "substring(...)"
            P6.f.d(r9, r6)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bd
        L_0x00b8:
            r7 = r9
            goto L_0x00bd
        L_0x00ba:
            int r6 = r6 + 1
            goto L_0x006c
        L_0x00bd:
            if (r7 == 0) goto L_0x00c2
            r5.add(r7)
        L_0x00c2:
            r6 = r8
            goto L_0x0053
        L_0x00c4:
            java.lang.ArithmeticException r14 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened."
            r14.<init>(r0)
            throw r14
        L_0x00cc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            java.lang.String r11 = "..."
            r12 = 0
            java.lang.String r7 = "\n"
            java.lang.String r9 = ""
            r10 = -1
            r6 = r0
            r8 = r9
            D6.i.O(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = "toString(...)"
            P6.f.d(r14, r0)
            return r14
        L_0x00e8:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x00ec:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.e.V(java.lang.String):java.lang.String");
    }
}
