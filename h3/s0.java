package H3;

import G3.f;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

public class s0 extends AbstractCollection implements Set {

    /* renamed from: U  reason: collision with root package name */
    public final Set f2119U;

    /* renamed from: V  reason: collision with root package name */
    public final f f2120V;

    public s0(Set set, f fVar) {
        this.f2119U = set;
        this.f2120V = fVar;
    }

    public final boolean add(Object obj) {
        if (this.f2120V.apply(obj)) {
            return this.f2119U.add(obj);
        }
        throw new IllegalArgumentException();
    }

    public final boolean addAll(Collection collection) {
        for (Object apply : collection) {
            if (!this.f2120V.apply(apply)) {
                throw new IllegalArgumentException();
            }
        }
        return this.f2119U.addAll(collection);
    }

    public final void clear() {
        Set set = this.f2119U;
        boolean z = set instanceof RandomAccess;
        f fVar = this.f2120V;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            fVar.getClass();
            while (it.hasNext()) {
                if (fVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        fVar.getClass();
        int i = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            if (!fVar.apply(obj)) {
                if (i8 > i) {
                    try {
                        list.set(i, obj);
                    } catch (UnsupportedOperationException unused) {
                        C0103u.t(list, fVar, i, i8);
                        return;
                    } catch (IllegalArgumentException unused2) {
                        C0103u.t(list, fVar, i, i8);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    public final boolean contains(Object obj) {
        boolean z;
        Set set = this.f2119U;
        set.getClass();
        try {
            z = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.f2120V.apply(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return C0103u.i(this, obj);
    }

    public final int hashCode() {
        return C0103u.m(this);
    }

    public final boolean isEmpty() {
        Iterator it = this.f2119U.iterator();
        f fVar = this.f2120V;
        if (fVar != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (fVar.apply(it.next())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                z = true;
            }
            return true ^ z;
        }
        throw new NullPointerException("predicate");
    }

    public final Iterator iterator() {
        Iterator it = this.f2119U.iterator();
        it.getClass();
        f fVar = this.f2120V;
        fVar.getClass();
        return new V(it, fVar);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj) || !this.f2119U.remove(obj)) {
            return false;
        }
        return true;
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.f2119U.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f2120V.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.f2119U.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f2120V.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object apply : this.f2119U) {
            if (this.f2120V.apply(apply)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            V v4 = (V) it;
            if (!v4.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(v4.next());
        }
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            V v4 = (V) it;
            if (!v4.hasNext()) {
                return arrayList.toArray(objArr);
            }
            arrayList.add(v4.next());
        }
    }
}
