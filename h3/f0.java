package H3;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

public final class f0 extends C0098o {

    /* renamed from: Z  reason: collision with root package name */
    public transient e0 f2068Z;

    public final Map a() {
        Map map = this.f2116W;
        if (map != null) {
            return map;
        }
        Map d8 = d();
        this.f2116W = d8;
        return d8;
    }

    public final Map d() {
        Map map = this.f2101X;
        if (map instanceof NavigableMap) {
            return new C0089f(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new C0092i(this, (SortedMap) map);
        }
        return new C0087d(this, map);
    }

    public final Collection e() {
        return (List) this.f2068Z.get();
    }

    public final Set f() {
        Map map = this.f2101X;
        if (map instanceof NavigableMap) {
            return new C0090g(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new C0093j(this, (SortedMap) map);
        }
        return new C0088e(this, map);
    }

    public final Collection g(Object obj, Collection collection) {
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new C0096m(this, obj, list, (C0094k) null);
        }
        return new C0096m(this, obj, list, (C0094k) null);
    }
}
