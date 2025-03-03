package H3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class H extends C0098o {

    /* renamed from: Z  reason: collision with root package name */
    public final transient int f2013Z;

    public H() {
        super(C0107y.b(12));
        this.f2013Z = 2;
        this.f2013Z = 2;
    }

    public static void h() {
        new H();
    }

    public final Map a() {
        Map map = this.f2116W;
        if (map != null) {
            return map;
        }
        Map d8 = d();
        this.f2116W = d8;
        return d8;
    }

    public final Collection e() {
        return A.b(this.f2013Z);
    }

    public final Collection g(Object obj, Collection collection) {
        return new C0097n(this, obj, (Set) collection);
    }
}
