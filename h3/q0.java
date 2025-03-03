package H3;

import java.io.Serializable;

public final class q0 extends h0 implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final h0 f2113U;

    public q0(h0 h0Var) {
        this.f2113U = h0Var;
    }

    public final h0 a() {
        return this.f2113U;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f2113U.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            return this.f2113U.equals(((q0) obj).f2113U);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f2113U.hashCode();
    }

    public final String toString() {
        return this.f2113U + ".reverse()";
    }
}
