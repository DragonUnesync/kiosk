package H3;

import java.io.Serializable;

public final class p0 extends h0 implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public static final p0 f2110U = new h0();

    public final h0 a() {
        return g0.f2070U;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
