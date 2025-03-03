package e6;

import Q0.g;

public final class r extends IllegalStateException {
    public r(int i) {
        this(g.m(i, "refCnt: "));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(int r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = "refCnt: "
            java.lang.String r1 = ", "
            java.lang.StringBuilder r3 = Q0.g.p(r3, r0, r1)
            if (r4 <= 0) goto L_0x0011
            java.lang.String r0 = "increment: "
            java.lang.String r4 = Q0.g.m(r4, r0)
            goto L_0x0020
        L_0x0011:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "decrement: "
            r0.<init>(r1)
            int r4 = -r4
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L_0x0020:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>((java.lang.String) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.r.<init>(int, int):void");
    }

    public r(String str) {
        super(str);
    }

    public r(String str, Throwable th) {
        super(str, th);
    }
}
