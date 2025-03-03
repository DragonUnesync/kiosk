package D6;

import P6.f;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import l1.j;

public final class v implements Map {

    /* renamed from: U  reason: collision with root package name */
    public final EnumMap f1272U;

    public v(EnumMap enumMap, j jVar) {
        this.f1272U = enumMap;
    }

    public final void clear() {
        this.f1272U.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f1272U.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f1272U.containsValue(obj);
    }

    public final Set entrySet() {
        return this.f1272U.entrySet();
    }

    public final boolean equals(Object obj) {
        return this.f1272U.equals(obj);
    }

    public final Object get(Object obj) {
        return this.f1272U.get(obj);
    }

    public final int hashCode() {
        return this.f1272U.hashCode();
    }

    public final boolean isEmpty() {
        return this.f1272U.isEmpty();
    }

    public final Set keySet() {
        return this.f1272U.keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return this.f1272U.put(obj, obj2);
    }

    public final void putAll(Map map) {
        f.e(map, "from");
        this.f1272U.putAll(map);
    }

    public final Object remove(Object obj) {
        return this.f1272U.remove(obj);
    }

    public final int size() {
        return this.f1272U.size();
    }

    public final String toString() {
        return this.f1272U.toString();
    }

    public final Collection values() {
        return this.f1272U.values();
    }
}
