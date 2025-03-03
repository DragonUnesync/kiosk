package H3;

import java.util.Comparator;

public final class C extends E {
    public static E f(int i) {
        if (i < 0) {
            return E.f2009b;
        }
        if (i > 0) {
            return E.f2010c;
        }
        return E.f2008a;
    }

    public final E a(int i, int i8) {
        return f(Integer.compare(i, i8));
    }

    public final E b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    public final E c(boolean z, boolean z6) {
        return f(Boolean.compare(z, z6));
    }

    public final E d(boolean z, boolean z6) {
        return f(Boolean.compare(z6, z));
    }

    public final int e() {
        return 0;
    }
}
