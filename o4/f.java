package o4;

import h1.C1048n;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final C1048n f14273a = new C1048n(11);

    public static void a(int i, int i8) {
        if (i != i8) {
            throw new C1320c("fixed header flags must be " + i + " but were " + i8);
        }
    }

    public static void b(int i, int i8) {
        if (i != i8) {
            throw new C1320c("remaining length must be " + i + " but was " + i8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k5.a c(int r2, boolean r3) {
        /*
            r2 = r2 & 6
            int r2 = r2 >> 1
            if (r2 < 0) goto L_0x000f
            k5.a[] r0 = k5.a.f13050X
            int r1 = r0.length
            if (r2 < r1) goto L_0x000c
            goto L_0x0011
        L_0x000c:
            r2 = r0[r2]
            goto L_0x0012
        L_0x000f:
            k5.a r2 = k5.a.f13047U
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 == 0) goto L_0x0026
            k5.a r0 = k5.a.f13047U
            if (r2 != r0) goto L_0x0025
            if (r3 != 0) goto L_0x001b
            goto L_0x0025
        L_0x001b:
            o4.c r2 = new o4.c
            x5.b r3 = x5.C1607b.PROTOCOL_ERROR
            java.lang.String r0 = "DUP flag must be 0 if QoS is 0"
            r2.<init>(r3, r0)
            throw r2
        L_0x0025:
            return r2
        L_0x0026:
            o4.c r2 = new o4.c
            java.lang.String r3 = "wrong QoS"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.f.c(int, boolean):k5.a");
    }

    public static C1320c d() {
        return new C1320c("remaining length too short");
    }
}
