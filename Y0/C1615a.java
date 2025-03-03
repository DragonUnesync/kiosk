package y0;

/* renamed from: y0.a  reason: case insensitive filesystem */
public final class C1615a {

    /* renamed from: a  reason: collision with root package name */
    public int f16333a;

    /* renamed from: b  reason: collision with root package name */
    public int f16334b;

    /* renamed from: c  reason: collision with root package name */
    public float f16335c;

    /* renamed from: d  reason: collision with root package name */
    public float f16336d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f16337f;

    /* renamed from: g  reason: collision with root package name */
    public long f16338g;

    /* renamed from: h  reason: collision with root package name */
    public float f16339h;
    public int i;

    public final float a(long j7) {
        long j8 = this.e;
        if (j7 < j8) {
            return 0.0f;
        }
        long j9 = this.f16338g;
        if (j9 < 0 || j7 < j9) {
            return C1618d.b(((float) (j7 - j8)) / ((float) this.f16333a), 0.0f, 1.0f) * 0.5f;
        }
        float f8 = this.f16339h;
        return (C1618d.b(((float) (j7 - j9)) / ((float) this.i), 0.0f, 1.0f) * f8) + (1.0f - f8);
    }
}
