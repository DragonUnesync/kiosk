package S3;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final float f4524a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4525b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4526c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4527d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4528f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4529g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4530h;
    public final float i;

    public f(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f4524a = f8;
        this.f4525b = f11;
        this.f4526c = f14;
        this.f4527d = f9;
        this.e = f12;
        this.f4528f = f15;
        this.f4529g = f10;
        this.f4530h = f13;
        this.i = f16;
    }

    public static f a(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        f b8 = b(f8, f9, f10, f11, f12, f13, f14, f15);
        float f24 = b8.e;
        float f25 = b8.i;
        float f26 = b8.f4528f;
        float f27 = b8.f4530h;
        float f28 = (f24 * f25) - (f26 * f27);
        float f29 = b8.f4529g;
        float f30 = b8.f4527d;
        float f31 = (f26 * f29) - (f30 * f25);
        float f32 = (f30 * f27) - (f24 * f29);
        float f33 = b8.f4526c;
        float f34 = b8.f4525b;
        float f35 = (f33 * f27) - (f34 * f25);
        float f36 = b8.f4524a;
        float f37 = (f25 * f36) - (f33 * f29);
        float f38 = (f29 * f34) - (f27 * f36);
        float f39 = (f34 * f26) - (f33 * f24);
        float f40 = (f33 * f30) - (f26 * f36);
        float f41 = (f36 * f24) - (f34 * f30);
        f b9 = b(f16, f17, f18, f19, f20, f21, f22, f23);
        float f42 = b9.f4524a;
        float f43 = b9.f4527d;
        float f44 = b9.f4529g;
        float f45 = (f43 * f35) + (f42 * f28) + (f44 * f39);
        float f46 = (f44 * f40) + (f43 * f37) + (f42 * f31);
        float f47 = f44 * f41;
        float f48 = f47 + (f43 * f38) + (f42 * f32);
        float f49 = b9.f4525b;
        float f50 = f48;
        float f51 = b9.e;
        float f52 = b9.f4530h;
        float f53 = (f52 * f39) + (f51 * f35) + (f49 * f28);
        float f54 = (f51 * f37) + (f49 * f31);
        float f55 = (f51 * f38) + (f49 * f32) + (f52 * f41);
        float f56 = b9.f4526c;
        float f57 = b9.f4528f;
        float f58 = f35 * f57;
        float f59 = b9.i;
        return new f(f45, f46, f50, f53, (f52 * f40) + f54, f55, (f39 * f59) + f58 + (f28 * f56), (f37 * f57) + (f31 * f56) + (f40 * f59), (f59 * f41) + (f57 * f38) + (f56 * f32));
    }

    public static f b(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((f8 - f10) + f12) - f14;
        float f17 = ((f9 - f11) + f13) - f15;
        if (f16 == 0.0f && f17 == 0.0f) {
            return new f(f10 - f8, f12 - f10, f8, f11 - f9, f13 - f11, f9, 0.0f, 0.0f, 1.0f);
        }
        float f18 = f10 - f12;
        float f19 = f14 - f12;
        float f20 = f11 - f13;
        float f21 = f15 - f13;
        float f22 = (f18 * f21) - (f19 * f20);
        float f23 = ((f21 * f16) - (f19 * f17)) / f22;
        float f24 = ((f18 * f17) - (f16 * f20)) / f22;
        return new f((f23 * f10) + (f10 - f8), (f24 * f14) + (f14 - f8), f8, (f23 * f11) + (f11 - f9), (f24 * f15) + (f15 - f9), f9, f23, f24, 1.0f);
    }
}
