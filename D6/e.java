package D6;

import P6.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class e implements List, Collection {
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int b();

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a8 : this) {
            if (f.a(a8, obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        f.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        f.e(collection, "other");
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        for (Object a8 : this) {
            if (!f.a(a8, it.next())) {
            }
        }
        return true;
        return false;
    }

    public final int hashCode() {
        int i;
        int i8 = 1;
        for (Object next : this) {
            int i9 = i8 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i8 = i9 + i;
        }
        return i8;
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a8 : this) {
            if (f.a(a8, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new b(0, this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (f.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return new c(this, 0);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return b();
    }

    public final List subList(int i, int i8) {
        return new d(this, i, i8);
    }

    public final Object[] toArray() {
        return f.j(this);
    }

    public final String toString() {
        return i.P(this, ", ", "[", "]", new a(0, this), 24);
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final ListIterator listIterator(int i) {
        return new c(this, i);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray(Object[] objArr) {
        f.e(objArr, "array");
        return f.k(this, objArr);
    }
}
