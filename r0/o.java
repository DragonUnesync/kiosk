package R0;

import H3.C0103u;
import H3.s0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class o implements Map {

    /* renamed from: U  reason: collision with root package name */
    public final Map f4296U;

    public o(Map map) {
        this.f4296U = map;
    }

    public final void clear() {
        this.f4296U.clear();
    }

    public final boolean containsKey(Object obj) {
        if (obj == null || !this.f4296U.containsKey(obj)) {
            return false;
        }
        return true;
    }

    public final boolean containsValue(Object obj) {
        Iterator it = ((s0) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Set entrySet() {
        return C0103u.j(this.f4296U.entrySet(), new n(0));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !C0103u.h(this, obj)) {
            return false;
        }
        return true;
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f4296U.get(obj);
    }

    public final int hashCode() {
        return C0103u.m(entrySet());
    }

    public final boolean isEmpty() {
        Map map = this.f4296U;
        if (map.isEmpty()) {
            return true;
        }
        if (map.size() != 1 || !map.containsKey((Object) null)) {
            return false;
        }
        return true;
    }

    public final Set keySet() {
        return C0103u.j(this.f4296U.keySet(), new n(1));
    }

    public final Object put(Object obj, Object obj2) {
        return this.f4296U.put(obj, obj2);
    }

    public final void putAll(Map map) {
        this.f4296U.putAll(map);
    }

    public final Object remove(Object obj) {
        return this.f4296U.remove(obj);
    }

    public final int size() {
        Map map = this.f4296U;
        return map.size() - (map.containsKey((Object) null) ? 1 : 0);
    }

    public final String toString() {
        return this.f4296U.toString();
    }

    public final Collection values() {
        return this.f4296U.values();
    }
}
