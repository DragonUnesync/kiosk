package M0;

import P0.z;

public final class h0 {

    /* renamed from: d  reason: collision with root package name */
    public static final h0 f2952d = new h0(1.0f, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2953a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2954b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2955c;

    static {
        z.J(0);
        z.J(1);
        z.J(3);
    }

    public h0(float f8, int i, int i8) {
        this.f2953a = i;
        this.f2954b = i8;
        this.f2955c = f8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r5 = (M0.h0) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof M0.h0
            r2 = 0
            if (r1 == 0) goto L_0x0022
            M0.h0 r5 = (M0.h0) r5
            int r1 = r5.f2953a
            int r3 = r4.f2953a
            if (r3 != r1) goto L_0x0020
            int r1 = r4.f2954b
            int r3 = r5.f2954b
            if (r1 != r3) goto L_0x0020
            float r1 = r4.f2955c
            float r5 = r5.f2955c
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.h0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2955c) + ((((217 + this.f2953a) * 31) + this.f2954b) * 31);
    }
}
