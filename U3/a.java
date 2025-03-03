package U3;

import R2.c;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f5421h = new a(4201, 4096, 1);
    public static final a i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f5422j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f5423k = new a(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f5424l = new a(285, 256, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final a f5425m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f5426n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f5427o;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f5428a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5429b;

    /* renamed from: c  reason: collision with root package name */
    public final c f5430c;

    /* renamed from: d  reason: collision with root package name */
    public final c f5431d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5432f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5433g;

    static {
        a aVar = new a(67, 64, 1);
        f5422j = aVar;
        a aVar2 = new a(301, 256, 1);
        f5425m = aVar2;
        f5426n = aVar2;
        f5427o = aVar;
    }

    public a(int i8, int i9, int i10) {
        this.f5432f = i8;
        this.e = i9;
        this.f5433g = i10;
        this.f5428a = new int[i9];
        this.f5429b = new int[i9];
        int i11 = 1;
        for (int i12 = 0; i12 < i9; i12++) {
            this.f5428a[i12] = i11;
            i11 <<= 1;
            if (i11 >= i9) {
                i11 = (i11 ^ i8) & (i9 - 1);
            }
        }
        for (int i13 = 0; i13 < i9 - 1; i13++) {
            this.f5429b[this.f5428a[i13]] = i13;
        }
        this.f5430c = new c(this, new int[]{0});
        this.f5431d = new c(this, new int[]{1});
    }

    public final int a(int i8) {
        if (i8 != 0) {
            int i9 = this.f5429b[i8];
            return this.f5428a[(this.e - i9) - 1];
        }
        throw new ArithmeticException();
    }

    public final int b(int i8, int i9) {
        if (i8 == 0 || i9 == 0) {
            return 0;
        }
        int[] iArr = this.f5429b;
        return this.f5428a[(iArr[i8] + iArr[i9]) % (this.e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f5432f) + ',' + this.e + ')';
    }
}
