package H3;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public final class r0 extends AbstractSet {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ U f2117U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ U f2118V;

    public r0(U u3, U u8) {
        this.f2117U = u3;
        this.f2118V = u8;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        if (!this.f2117U.contains(obj) || !this.f2118V.contains(obj)) {
            return false;
        }
        return true;
    }

    public final boolean containsAll(Collection collection) {
        if (!this.f2117U.containsAll(collection) || !this.f2118V.containsAll(collection)) {
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.f2118V, this.f2117U);
    }

    public final Iterator iterator() {
        return new V(this);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.f2117U) {
            if (this.f2118V.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
