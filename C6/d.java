package C6;

import P6.f;
import java.io.Serializable;

public final class d implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final Throwable f713U;

    public d(Throwable th) {
        this.f713U = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (f.a(this.f713U, ((d) obj).f713U)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f713U.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f713U + ')';
    }
}
