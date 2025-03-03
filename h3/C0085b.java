package H3;

import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: H3.b  reason: case insensitive filesystem */
public final class C0085b extends u0 {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0087d f2054U;

    public C0085b(C0087d dVar) {
        this.f2054U = dVar;
    }

    public final void clear() {
        this.f2054U.clear();
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.f2054U.f2061W.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean isEmpty() {
        return this.f2054U.isEmpty();
    }

    public final Iterator iterator() {
        return new C0086c(this.f2054U);
    }

    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C0098o oVar = this.f2054U.f2062X;
        Object key = entry.getKey();
        Map map = oVar.f2101X;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        oVar.f2102Y -= size;
        return true;
    }

    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return C0103u.s(this, collection);
        } catch (UnsupportedOperationException unused) {
            boolean z = false;
            for (Object remove : collection) {
                z |= remove(remove);
            }
            return z;
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(C0103u.b(collection.size()));
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return this.f2054U.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f2054U.f2061W.size();
    }
}
