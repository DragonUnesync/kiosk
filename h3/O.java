package H3;

import N7.a;
import Q7.g;
import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

public abstract class O extends J implements List, RandomAccess, j$.util.List {

    /* renamed from: V  reason: collision with root package name */
    public static final M f2026V = new M(i0.f2073Y, 0);

    public static i0 i(int i, Object[] objArr) {
        if (i == 0) {
            return i0.f2073Y;
        }
        return new i0(i, objArr);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [H3.I, H3.L] */
    public static L j() {
        return new I(4);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [H3.I, H3.L] */
    public static L l(int i) {
        C0103u.e(i, "expectedSize");
        return new I(i);
    }

    public static O m(Collection collection) {
        if (collection instanceof J) {
            O b8 = ((J) collection).b();
            if (!b8.g()) {
                return b8;
            }
            Object[] array = b8.toArray(J.f2017U);
            return i(array.length, array);
        }
        Object[] array2 = collection.toArray();
        C0103u.c(array2.length, array2);
        return i(array2.length, array2);
    }

    public static i0 n(Object[] objArr) {
        if (objArr.length == 0) {
            return i0.f2073Y;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        C0103u.c(objArr2.length, objArr2);
        return i(objArr2.length, objArr2);
    }

    public static i0 p() {
        return i0.f2073Y;
    }

    public static i0 q(Long l8, Long l9, Long l10, Long l11, Long l12) {
        Object[] objArr = {l8, l9, l10, l11, l12};
        C0103u.c(5, objArr);
        return i(5, objArr);
    }

    public static i0 r(Object obj) {
        Object[] objArr = {obj};
        C0103u.c(1, objArr);
        return i(1, objArr);
    }

    public static i0 s(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C0103u.c(2, objArr);
        return i(2, objArr);
    }

    public static i0 t(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        C0103u.c(3, objArr);
        return i(3, objArr);
    }

    public static i0 u(h0 h0Var, List list) {
        h0Var.getClass();
        if (!(list instanceof Collection)) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        C0103u.c(array.length, array);
        Arrays.sort(array, h0Var);
        return i(array.length, array);
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final O b() {
        return this;
    }

    public int c(int i, Object[] objArr) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i + i8] = get(i8);
        }
        return i + size;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (a.e(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object e : this) {
                    if (it.hasNext()) {
                        if (!a.e(e, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    public final x0 h() {
        return listIterator(0);
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i = ~(~(get(i8).hashCode() + (i * 31)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final M listIterator(int i) {
        g.h(i, size());
        if (isEmpty()) {
            return f2026V;
        }
        return new M(this, i);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.-CC.$default$replaceAll(this, unaryOperator);
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void sort(Comparator comparator) {
        List.-CC.$default$sort(this, comparator);
    }

    /* renamed from: v */
    public O subList(int i, int i8) {
        g.i(i, i8, size());
        int i9 = i8 - i;
        if (i9 == size()) {
            return this;
        }
        if (i9 == 0) {
            return i0.f2073Y;
        }
        return new N(this, i, i9);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
