package H3;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: H3.g  reason: case insensitive filesystem */
public final class C0090g extends C0093j implements NavigableSet {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ f0 f2069X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0090g(f0 f0Var, NavigableMap navigableMap) {
        super(f0Var, navigableMap);
        this.f2069X = f0Var;
    }

    /* renamed from: c */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.f2064U);
    }

    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return ((C0088e) descendingSet()).iterator();
    }

    public final NavigableSet descendingSet() {
        return new C0090g(this.f2069X, b().descendingMap());
    }

    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    public final Object pollFirst() {
        C0086c cVar = (C0086c) iterator();
        if (!cVar.hasNext()) {
            return null;
        }
        Object next = cVar.next();
        cVar.remove();
        return next;
    }

    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new C0090g(this.f2069X, b().headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z6) {
        return new C0090g(this.f2069X, b().subMap(obj, z, obj2, z6));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C0090g(this.f2069X, b().tailMap(obj, z));
    }
}
