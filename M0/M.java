package M0;

import P0.l;
import P0.z;
import android.util.SparseBooleanArray;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final C0128p f2849a;

    static {
        new SparseBooleanArray();
        l.j(!false);
        z.J(0);
    }

    public M(C0128p pVar) {
        this.f2849a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        return this.f2849a.equals(((M) obj).f2849a);
    }

    public final int hashCode() {
        return this.f2849a.hashCode();
    }
}
