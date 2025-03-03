package G3;

import java.io.Serializable;
import java.util.List;

public final class g implements f, Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final List f1640U;

    public g(List list) {
        this.f1640U = list;
    }

    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f1640U;
            if (i >= list.size()) {
                return true;
            }
            if (!((f) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f1640U.equals(((g) obj).f1640U);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1640U.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object next : this.f1640U) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
