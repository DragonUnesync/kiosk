package K2;

import B2.h;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final n f2619b = new n(2);

    /* renamed from: c  reason: collision with root package name */
    public static final n f2620c = new n(0);

    /* renamed from: d  reason: collision with root package name */
    public static final n f2621d;
    public static final n e = new n(3);

    /* renamed from: f  reason: collision with root package name */
    public static final n f2622f;

    /* renamed from: g  reason: collision with root package name */
    public static final h f2623g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f2624h = true;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2625a;

    static {
        n nVar = new n(1);
        f2621d = nVar;
        f2622f = nVar;
        f2623g = h.a(nVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    public /* synthetic */ n(int i) {
        this.f2625a = i;
    }

    public final int a(int i, int i8, int i9, int i10) {
        switch (this.f2625a) {
            case 0:
                if (b(i, i8, i9, i10) == 1.0f) {
                    return 2;
                }
                return f2619b.a(i, i8, i9, i10);
            case 1:
                return 2;
            case 2:
                if (f2624h) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    public final float b(int i, int i8, int i9, int i10) {
        switch (this.f2625a) {
            case 0:
                return Math.min(1.0f, f2619b.b(i, i8, i9, i10));
            case 1:
                return Math.max(((float) i9) / ((float) i), ((float) i10) / ((float) i8));
            case 2:
                if (f2624h) {
                    return Math.min(((float) i9) / ((float) i), ((float) i10) / ((float) i8));
                }
                int max = Math.max(i8 / i10, i / i9);
                if (max == 0) {
                    return 1.0f;
                }
                return 1.0f / ((float) Integer.highestOneBit(max));
            default:
                return 1.0f;
        }
    }
}
