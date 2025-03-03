package H3;

import G3.f;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public final class t0 extends s0 implements SortedSet {
    public final Comparator comparator() {
        return ((SortedSet) this.f2119U).comparator();
    }

    public final Object first() {
        Iterator it = this.f2119U.iterator();
        it.getClass();
        f fVar = this.f2120V;
        fVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (fVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.SortedSet, H3.s0] */
    public final SortedSet headSet(Object obj) {
        return new s0(((SortedSet) this.f2119U).headSet(obj), this.f2120V);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f2119U;
        while (true) {
            Object last = sortedSet.last();
            if (this.f2120V.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.SortedSet, H3.s0] */
    public final SortedSet subSet(Object obj, Object obj2) {
        return new s0(((SortedSet) this.f2119U).subSet(obj, obj2), this.f2120V);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.SortedSet, H3.s0] */
    public final SortedSet tailSet(Object obj) {
        return new s0(((SortedSet) this.f2119U).tailSet(obj), this.f2120V);
    }
}
