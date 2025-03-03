package H3;

import Q7.g;
import j$.util.Objects;
import java.util.AbstractMap;

public final class j0 extends O {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ k0 f2077W;

    public j0(k0 k0Var) {
        this.f2077W = k0Var;
    }

    public final boolean g() {
        return true;
    }

    public final Object get(int i) {
        k0 k0Var = this.f2077W;
        g.f(i, k0Var.f2085Z);
        int i8 = i * 2;
        Object[] objArr = k0Var.f2084Y;
        Object obj = objArr[i8];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.f2077W.f2085Z;
    }
}
