package H3;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: H3.f  reason: case insensitive filesystem */
public final class C0089f extends C0092i implements NavigableMap {

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ f0 f2067a0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0089f(f0 f0Var, NavigableMap navigableMap) {
        super(f0Var, navigableMap);
        this.f2067a0 = f0Var;
    }

    public final SortedSet b() {
        return new C0090g(this.f2067a0, d());
    }

    public final SortedSet c() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = d().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final NavigableMap descendingMap() {
        return new C0089f(this.f2067a0, d().descendingMap());
    }

    public final K e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection e = this.f2067a0.e();
        e.addAll((Collection) entry.getValue());
        it.remove();
        return new K(entry.getKey(), DesugarCollections.unmodifiableList((List) e));
    }

    /* renamed from: f */
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.f2061W);
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = d().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = d().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = d().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = d().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = d().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return e(((C0085b) entrySet()).iterator());
    }

    public final Map.Entry pollLastEntry() {
        return e(((C0085b) ((C0087d) descendingMap()).entrySet()).iterator());
    }

    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new C0089f(this.f2067a0, d().headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z6) {
        return new C0089f(this.f2067a0, d().subMap(obj, z, obj2, z6));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C0089f(this.f2067a0, d().tailMap(obj, z));
    }
}
