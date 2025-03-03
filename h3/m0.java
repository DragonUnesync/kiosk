package H3;

import Q7.g;
import j$.util.Objects;

public final class m0 extends O {

    /* renamed from: W  reason: collision with root package name */
    public final transient Object[] f2090W;

    /* renamed from: X  reason: collision with root package name */
    public final transient int f2091X;

    /* renamed from: Y  reason: collision with root package name */
    public final transient int f2092Y;

    public m0(int i, int i8, Object[] objArr) {
        this.f2090W = objArr;
        this.f2091X = i;
        this.f2092Y = i8;
    }

    public final boolean g() {
        return true;
    }

    public final Object get(int i) {
        g.f(i, this.f2092Y);
        Object obj = this.f2090W[(i * 2) + this.f2091X];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.f2092Y;
    }
}
