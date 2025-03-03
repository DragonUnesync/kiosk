package H3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class r {

    /* renamed from: U  reason: collision with root package name */
    public transient Set f2114U;

    /* renamed from: V  reason: collision with root package name */
    public transient Collection f2115V;

    /* renamed from: W  reason: collision with root package name */
    public transient Map f2116W;

    public abstract Map a();

    public boolean b(Object obj) {
        for (Collection contains : a().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return a().equals(((r) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
