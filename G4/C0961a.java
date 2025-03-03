package g4;

import de.ozerov.fully.K2;

/* renamed from: g4.a  reason: case insensitive filesystem */
public final class C0961a {
    public static final C0961a e = new C0961a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f12015a = new int[929];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12016b = new int[929];

    /* renamed from: c  reason: collision with root package name */
    public final K2 f12017c;

    /* renamed from: d  reason: collision with root package name */
    public final K2 f12018d;

    public C0961a() {
        int i = 1;
        for (int i8 = 0; i8 < 929; i8++) {
            this.f12015a[i8] = i;
            i = (i * 3) % 929;
        }
        for (int i9 = 0; i9 < 928; i9++) {
            this.f12016b[this.f12015a[i9]] = i9;
        }
        this.f12017c = new K2(this, new int[]{0});
        this.f12018d = new K2(this, new int[]{1});
    }

    public final int a(int i, int i8) {
        return (i + i8) % 929;
    }

    public final int b(int i) {
        if (i != 0) {
            return this.f12015a[928 - this.f12016b[i]];
        }
        throw new ArithmeticException();
    }

    public final int c(int i, int i8) {
        if (i == 0 || i8 == 0) {
            return 0;
        }
        int[] iArr = this.f12016b;
        return this.f12015a[(iArr[i] + iArr[i8]) % 928];
    }
}
