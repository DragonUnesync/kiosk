package h1;

import java.io.IOException;

/* renamed from: h1.f  reason: case insensitive filesystem */
public final class C1040f extends IOException {
    public C1040f(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1040f(int r5, long r6, long r8) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal clipping: "
            r0.<init>(r1)
            if (r5 == 0) goto L_0x003e
            r1 = 1
            if (r5 == r1) goto L_0x003b
            r2 = 2
            if (r5 == r2) goto L_0x0012
            java.lang.String r5 = "unknown"
            goto L_0x0040
        L_0x0012:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0020
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            P0.l.j(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "start exceeds end. Start time: "
            r5.<init>(r1)
            r5.append(r6)
            java.lang.String r6 = ", End time: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            goto L_0x0040
        L_0x003b:
            java.lang.String r5 = "not seekable to start"
            goto L_0x0040
        L_0x003e:
            java.lang.String r5 = "invalid period count"
        L_0x0040:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1040f.<init>(int, long, long):void");
    }
}
