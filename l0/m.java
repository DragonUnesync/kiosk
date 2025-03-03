package l0;

public final class m {

    /* renamed from: k  reason: collision with root package name */
    public static final m f13086k;

    /* renamed from: a  reason: collision with root package name */
    public final float f13087a;

    /* renamed from: b  reason: collision with root package name */
    public final float f13088b;

    /* renamed from: c  reason: collision with root package name */
    public final float f13089c;

    /* renamed from: d  reason: collision with root package name */
    public final float f13090d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final float f13091f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f13092g;

    /* renamed from: h  reason: collision with root package name */
    public final float f13093h;
    public final float i;

    /* renamed from: j  reason: collision with root package name */
    public final float f13094j;

    static {
        float f8;
        float[] fArr = C1169b.f13063c;
        float n4 = (float) ((((double) C1169b.n()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C1169b.f13061a;
        float f9 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr[1];
        float f11 = (fArr3[1] * f10) + (fArr3[0] * f9);
        float f12 = fArr[2];
        float f13 = (fArr3[2] * f12) + f11;
        float[] fArr4 = fArr2[1];
        float f14 = fArr4[1] * f10;
        float f15 = (fArr4[2] * f12) + f14 + (fArr4[0] * f9);
        float[] fArr5 = fArr2[2];
        float f16 = f9 * fArr5[0];
        float f17 = (f12 * fArr5[2]) + (f10 * fArr5[1]) + f16;
        if (((double) 1.0f) >= 0.9d) {
            f8 = 0.69f;
        } else {
            f8 = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp((double) (((-n4) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d8 = (double) exp;
        if (d8 > 1.0d) {
            exp = 1.0f;
        } else if (d8 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * n4) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(((double) n4) * 5.0d))) + (f19 * n4);
        float n5 = C1169b.n() / fArr[1];
        double d9 = (double) n5;
        float f21 = f15;
        float sqrt = ((float) Math.sqrt(d9)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d9, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f13)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f21)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * cbrt) * f17)) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        float f27 = n5;
        f13086k = new m(f27, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f8, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public m(float f8, float f9, float f10, float f11, float f12, float f13, float[] fArr, float f14, float f15, float f16) {
        this.f13091f = f8;
        this.f13087a = f9;
        this.f13088b = f10;
        this.f13089c = f11;
        this.f13090d = f12;
        this.e = f13;
        this.f13092g = fArr;
        this.f13093h = f14;
        this.i = f15;
        this.f13094j = f16;
    }
}
