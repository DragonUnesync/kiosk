package f7;

import P6.f;

/* renamed from: f7.A  reason: case insensitive filesystem */
public final class C0936A {

    /* renamed from: a  reason: collision with root package name */
    public int f11693a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f11694b = new int[10];

    public final int a() {
        if ((this.f11693a & 128) != 0) {
            return this.f11694b[7];
        }
        return 65535;
    }

    public final void b(C0936A a8) {
        f.e(a8, "other");
        for (int i = 0; i < 10; i++) {
            boolean z = true;
            if (((1 << i) & a8.f11693a) == 0) {
                z = false;
            }
            if (z) {
                c(i, a8.f11694b[i]);
            }
        }
    }

    public final void c(int i, int i8) {
        if (i >= 0) {
            int[] iArr = this.f11694b;
            if (i < iArr.length) {
                this.f11693a = (1 << i) | this.f11693a;
                iArr[i] = i8;
            }
        }
    }
}
