package D6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class f implements Collection {

    /* renamed from: U  reason: collision with root package name */
    public final Object[] f1260U;

    /* renamed from: V  reason: collision with root package name */
    public final boolean f1261V;

    public f(Object[] objArr, boolean z) {
        this.f1260U = objArr;
        this.f1261V = z;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        int i;
        Object[] objArr = this.f1260U;
        P6.f.e(objArr, "<this>");
        if (obj != null) {
            int length = objArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                } else if (obj.equals(objArr[i8])) {
                    i = i8;
                    break;
                } else {
                    i8++;
                }
            }
        } else {
            int length2 = objArr.length;
            i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                } else if (objArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        P6.f.e(collection, "elements");
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

    public final boolean isEmpty() {
        if (this.f1260U.length == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return P6.f.g(this.f1260U);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f1260U.length;
    }

    public final Object[] toArray() {
        Object[] objArr = this.f1260U;
        Class<Object[]> cls = Object[].class;
        if (this.f1261V && objArr.getClass().equals(cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        P6.f.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final Object[] toArray(Object[] objArr) {
        P6.f.e(objArr, "array");
        return P6.f.k(this, objArr);
    }
}
