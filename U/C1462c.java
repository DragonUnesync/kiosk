package u;

/* renamed from: u.c  reason: case insensitive filesystem */
public final class C1462c {

    /* renamed from: a  reason: collision with root package name */
    public final int f15601a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15602b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15603c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15604d;

    public C1462c(int i, int i8, boolean z, boolean z6) {
        this.f15601a = i;
        this.f15602b = i8;
        this.f15603c = z;
        this.f15604d = z6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r5 = (u.C1462c) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof u.C1462c
            r2 = 0
            if (r1 == 0) goto L_0x0026
            u.c r5 = (u.C1462c) r5
            int r1 = r5.f15601a
            int r3 = r4.f15601a
            if (r3 != r1) goto L_0x0024
            int r1 = r4.f15602b
            int r3 = r5.f15602b
            if (r1 != r3) goto L_0x0024
            boolean r1 = r4.f15603c
            boolean r3 = r5.f15603c
            if (r1 != r3) goto L_0x0024
            boolean r1 = r4.f15604d
            boolean r5 = r5.f15604d
            if (r1 != r5) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            return r0
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u.C1462c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i8 = (((this.f15601a ^ 1000003) * 1000003) ^ this.f15602b) * 1000003;
        int i9 = 1237;
        if (this.f15603c) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i10 = (i8 ^ i) * 1000003;
        if (this.f15604d) {
            i9 = 1231;
        }
        return i10 ^ i9;
    }

    public final String toString() {
        return "FeatureSettings{cameraMode=" + this.f15601a + ", requiredMaxBitDepth=" + this.f15602b + ", previewStabilizationOn=" + this.f15603c + ", ultraHdrOn=" + this.f15604d + "}";
    }
}
