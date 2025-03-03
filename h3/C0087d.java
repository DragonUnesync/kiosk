package H3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: H3.d  reason: case insensitive filesystem */
public class C0087d extends AbstractMap {

    /* renamed from: U  reason: collision with root package name */
    public transient C0085b f2059U;

    /* renamed from: V  reason: collision with root package name */
    public transient C0100q f2060V;

    /* renamed from: W  reason: collision with root package name */
    public final transient Map f2061W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C0098o f2062X;

    public C0087d(C0098o oVar, Map map) {
        this.f2062X = oVar;
        this.f2061W = map;
    }

    public final K a(Map.Entry entry) {
        Object key = entry.getKey();
        return new K(key, this.f2062X.g(key, (Collection) entry.getValue()));
    }

    public final void clear() {
        C0098o oVar = this.f2062X;
        if (this.f2061W == oVar.f2101X) {
            oVar.c();
            return;
        }
        C0086c cVar = new C0086c(this);
        while (cVar.hasNext()) {
            cVar.next();
            cVar.remove();
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.f2061W;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Set entrySet() {
        C0085b bVar = this.f2059U;
        if (bVar != null) {
            return bVar;
        }
        C0085b bVar2 = new C0085b(this);
        this.f2059U = bVar2;
        return bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj || this.f2061W.equals(obj)) {
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f2061W;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.f2062X.g(obj, collection);
    }

    public final int hashCode() {
        return this.f2061W.hashCode();
    }

    public Set keySet() {
        C0098o oVar = this.f2062X;
        Set set = oVar.f2114U;
        if (set != null) {
            return set;
        }
        Set f8 = oVar.f();
        oVar.f2114U = f8;
        return f8;
    }

    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f2061W.remove(obj);
        if (collection == null) {
            return null;
        }
        C0098o oVar = this.f2062X;
        Collection e = oVar.e();
        e.addAll(collection);
        oVar.f2102Y -= collection.size();
        collection.clear();
        return e;
    }

    public final int size() {
        return this.f2061W.size();
    }

    public final String toString() {
        return this.f2061W.toString();
    }

    public final Collection values() {
        C0100q qVar = this.f2060V;
        if (qVar != null) {
            return qVar;
        }
        C0100q qVar2 = new C0100q(this);
        this.f2060V = qVar2;
        return qVar2;
    }
}
