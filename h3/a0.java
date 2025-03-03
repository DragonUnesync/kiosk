package H3;

import G3.d;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public final class a0 extends AbstractSequentialList implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final AbstractCollection f2052U;

    /* renamed from: V  reason: collision with root package name */
    public final d f2053V;

    public a0(List list, d dVar) {
        list.getClass();
        this.f2052U = (AbstractCollection) list;
        this.f2053V = dVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean isEmpty() {
        return this.f2052U.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    public final ListIterator listIterator(int i) {
        return new Y(this, this.f2052U.listIterator(i), 1);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final void removeRange(int i, int i8) {
        this.f2052U.subList(i, i8).clear();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    public final int size() {
        return this.f2052U.size();
    }
}
