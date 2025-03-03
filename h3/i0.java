package H3;

import Q7.g;
import j$.util.Objects;

public final class i0 extends O {

    /* renamed from: Y  reason: collision with root package name */
    public static final i0 f2073Y = new i0(0, new Object[0]);

    /* renamed from: W  reason: collision with root package name */
    public final transient Object[] f2074W;

    /* renamed from: X  reason: collision with root package name */
    public final transient int f2075X;

    public i0(int i, Object[] objArr) {
        this.f2074W = objArr;
        this.f2075X = i;
    }

    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.f2074W;
        int i8 = this.f2075X;
        System.arraycopy(objArr2, 0, objArr, i, i8);
        return i + i8;
    }

    public final Object[] d() {
        return this.f2074W;
    }

    public final int e() {
        return this.f2075X;
    }

    public final int f() {
        return 0;
    }

    public final boolean g() {
        return false;
    }

    public final Object get(int i) {
        g.f(i, this.f2075X);
        Object obj = this.f2074W[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.f2075X;
    }
}
