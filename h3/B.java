package H3;

import D.C0051j0;
import java.io.Serializable;

public final class B extends h0 implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final C0051j0 f2006U;

    public B(C0051j0 j0Var) {
        this.f2006U = j0Var;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f2006U.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            return this.f2006U.equals(((B) obj).f2006U);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2006U.hashCode();
    }

    public final String toString() {
        return this.f2006U.toString();
    }
}
