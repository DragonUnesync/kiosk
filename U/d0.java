package u;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public float f15607a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15608b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15609c;

    /* renamed from: d  reason: collision with root package name */
    public float f15610d;

    public d0(float f8, float f9) {
        this.f15608b = f8;
        this.f15609c = f9;
    }

    public final float a() {
        return this.f15610d;
    }

    public final float b() {
        return this.f15608b;
    }

    public final float c() {
        return this.f15609c;
    }

    public final float d() {
        return this.f15607a;
    }

    public final void e() {
        float f8 = 1.0f;
        float f9 = this.f15609c;
        float f10 = this.f15608b;
        int i = (1.0f > f10 ? 1 : (1.0f == f10 ? 0 : -1));
        if (i > 0 || 1.0f < f9) {
            throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + f9 + " , " + f10 + "]");
        }
        this.f15607a = 1.0f;
        if (f10 != f9) {
            if (i != 0) {
                if (1.0f != f9) {
                    float f11 = 1.0f / f9;
                    f8 = (1.0f - f11) / ((1.0f / f10) - f11);
                }
            }
            this.f15610d = f8;
        }
        f8 = 0.0f;
        this.f15610d = f8;
    }
}
