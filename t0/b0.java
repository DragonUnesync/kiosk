package T0;

import M0.C;
import M0.C0115c;
import M0.C0137z;
import M0.V;
import M0.W;
import M0.X;
import h1.r;

public final class b0 extends r {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4779c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4780d;

    public b0(X x8, C c8) {
        super(x8);
        this.f4780d = c8;
    }

    public V f(int i, V v4, boolean z) {
        switch (this.f4779c) {
            case 0:
                X x8 = this.f12507b;
                V f8 = x8.f(i, v4, z);
                if (x8.m(f8.f2864c, (W) this.f4780d, 0).a()) {
                    f8.h(v4.f2862a, v4.f2863b, v4.f2864c, v4.f2865d, v4.e, C0115c.f2914c, true);
                } else {
                    f8.f2866f = true;
                }
                return f8;
            default:
                return super.f(i, v4, z);
        }
    }

    public W m(int i, W w2, long j7) {
        switch (this.f4779c) {
            case 1:
                super.m(i, w2, j7);
                C c8 = (C) this.f4780d;
                w2.f2872c = c8;
                C0137z zVar = c8.f2786b;
                w2.getClass();
                return w2;
            default:
                return super.m(i, w2, j7);
        }
    }

    public b0(X x8) {
        super(x8);
        this.f4780d = new W();
    }
}
