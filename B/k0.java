package B;

import android.util.Size;

public final class k0 extends A {

    /* renamed from: X  reason: collision with root package name */
    public final Object f276X = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public final U f277Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f278Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f279a0;

    public k0(W w2, Size size, U u3) {
        super(w2);
        if (size == null) {
            this.f278Z = this.f138V.c();
            this.f279a0 = this.f138V.b();
        } else {
            this.f278Z = size.getWidth();
            this.f279a0 = size.getHeight();
        }
        this.f277Y = u3;
    }

    public final int b() {
        return this.f279a0;
    }

    public final int c() {
        return this.f278Z;
    }

    public final U e() {
        return this.f277Y;
    }
}
