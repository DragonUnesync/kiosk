package Y;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public final class d implements Collection {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ e f6293U;

    public d(e eVar) {
        this.f6293U = eVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f6293U.clear();
    }

    public final boolean contains(Object obj) {
        if (this.f6293U.a(obj) >= 0) {
            return true;
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

    public final boolean isEmpty() {
        return this.f6293U.isEmpty();
    }

    public final Iterator iterator() {
        return new a(this.f6293U, 1);
    }

    public final boolean remove(Object obj) {
        e eVar = this.f6293U;
        int a8 = eVar.a(obj);
        if (a8 < 0) {
            return false;
        }
        eVar.h(a8);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        e eVar = this.f6293U;
        int i = eVar.f6308W;
        int i8 = 0;
        boolean z = false;
        while (i8 < i) {
            if (collection.contains(eVar.j(i8))) {
                eVar.h(i8);
                i8--;
                i--;
                z = true;
            }
            i8++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        e eVar = this.f6293U;
        int i = eVar.f6308W;
        int i8 = 0;
        boolean z = false;
        while (i8 < i) {
            if (!collection.contains(eVar.j(i8))) {
                eVar.h(i8);
                i8--;
                i--;
                z = true;
            }
            i8++;
        }
        return z;
    }

    public final int size() {
        return this.f6293U.f6308W;
    }

    public final Object[] toArray() {
        e eVar = this.f6293U;
        int i = eVar.f6308W;
        Object[] objArr = new Object[i];
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = eVar.j(i8);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f6293U;
        int i = eVar.f6308W;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = eVar.j(i8);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
