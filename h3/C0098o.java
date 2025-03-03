package H3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: H3.o  reason: case insensitive filesystem */
public abstract class C0098o extends r implements Serializable {

    /* renamed from: X  reason: collision with root package name */
    public final transient Map f2101X;

    /* renamed from: Y  reason: collision with root package name */
    public transient int f2102Y;

    public C0098o(Map map) {
        if (map.isEmpty()) {
            this.f2101X = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void c() {
        Map map = this.f2101X;
        for (Collection clear : map.values()) {
            clear.clear();
        }
        map.clear();
        this.f2102Y = 0;
    }

    public Map d() {
        return new C0087d(this, this.f2101X);
    }

    public abstract Collection e();

    public Set f() {
        return new C0088e(this, this.f2101X);
    }

    public abstract Collection g(Object obj, Collection collection);
}
