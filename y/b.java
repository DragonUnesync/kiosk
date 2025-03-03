package Y;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class b implements Set {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ e f6288U;

    public b(e eVar) {
        this.f6288U = eVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f6288U.clear();
    }

    public final boolean contains(Object obj) {
        return this.f6288U.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.f6288U.k(collection);
    }

    public final boolean equals(Object obj) {
        e eVar = this.f6288U;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (eVar.f6308W != set.size() || !eVar.k(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        e eVar = this.f6288U;
        int i8 = 0;
        for (int i9 = eVar.f6308W - 1; i9 >= 0; i9--) {
            Object f8 = eVar.f(i9);
            if (f8 == null) {
                i = 0;
            } else {
                i = f8.hashCode();
            }
            i8 += i;
        }
        return i8;
    }

    public final boolean isEmpty() {
        return this.f6288U.isEmpty();
    }

    public final Iterator iterator() {
        return new a(this.f6288U, 0);
    }

    public final boolean remove(Object obj) {
        e eVar = this.f6288U;
        int d8 = eVar.d(obj);
        if (d8 < 0) {
            return false;
        }
        eVar.h(d8);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        return this.f6288U.l(collection);
    }

    public final boolean retainAll(Collection collection) {
        e eVar = this.f6288U;
        int i = eVar.f6308W;
        for (int i8 = i - 1; i8 >= 0; i8--) {
            if (!collection.contains(eVar.f(i8))) {
                eVar.h(i8);
            }
        }
        if (i != eVar.f6308W) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f6288U.f6308W;
    }

    public final Object[] toArray() {
        e eVar = this.f6288U;
        int i = eVar.f6308W;
        Object[] objArr = new Object[i];
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = eVar.f(i8);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f6288U;
        int i = eVar.f6308W;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = eVar.f(i8);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
