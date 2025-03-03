package H3;

import G3.d;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class Z extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final AbstractCollection f2045U;

    /* renamed from: V  reason: collision with root package name */
    public final d f2046V;

    public Z(List list, d dVar) {
        list.getClass();
        this.f2045U = (AbstractCollection) list;
        this.f2046V = dVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final Object get(int i) {
        return this.f2046V.apply(this.f2045U.get(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean isEmpty() {
        return this.f2045U.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    public final ListIterator listIterator(int i) {
        return new Y(this, this.f2045U.listIterator(i), 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final Object remove(int i) {
        return this.f2046V.apply(this.f2045U.remove(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final void removeRange(int i, int i8) {
        this.f2045U.subList(i, i8).clear();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final int size() {
        return this.f2045U.size();
    }
}
