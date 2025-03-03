package H3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: H3.e  reason: case insensitive filesystem */
public class C0088e extends u0 {

    /* renamed from: U  reason: collision with root package name */
    public final Map f2064U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0098o f2065V;

    public C0088e(C0098o oVar, Map map) {
        this.f2065V = oVar;
        map.getClass();
        this.f2064U = map;
    }

    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0086c cVar = (C0086c) it;
            if (cVar.hasNext()) {
                cVar.next();
                cVar.remove();
            } else {
                return;
            }
        }
    }

    public final boolean contains(Object obj) {
        return this.f2064U.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.f2064U.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj || this.f2064U.keySet().equals(obj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2064U.keySet().hashCode();
    }

    public final boolean isEmpty() {
        return this.f2064U.isEmpty();
    }

    public final Iterator iterator() {
        return new C0086c(this, this.f2064U.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f2064U.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.f2065V.f2102Y -= i;
        } else {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f2064U.size();
    }
}
