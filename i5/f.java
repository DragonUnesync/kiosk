package i5;

import Q0.g;
import g7.C0996d;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class f implements p, List {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12741U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f12742V;

    public /* synthetic */ f(int i, Object obj) {
        this.f12741U = i;
        this.f12742V = obj;
    }

    public p a() {
        int i = this.f12741U;
        return this;
    }

    public final boolean add(Object obj) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int b() {
        return 0;
    }

    public int c() {
        return ((Object[]) this.f12742V).length;
    }

    public final void clear() {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean contains(Object obj) {
        switch (this.f12741U) {
            case 0:
                if (indexOf(obj) >= 0) {
                    return true;
                }
                return false;
            default:
                if (indexOf(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    public final /* synthetic */ boolean containsAll(Collection collection) {
        int i = this.f12741U;
        return g.a(this, collection);
    }

    public final o d() {
        switch (this.f12741U) {
            case 0:
                return e(0);
            default:
                return e(0);
        }
    }

    public final o e(int i) {
        switch (this.f12741U) {
            case 0:
                int b8 = b();
                C0996d.d(i, size());
                return new C1104d(b8 + i, 0, this);
            default:
                C0996d.d(i, 1);
                return new C1104d(i, 1, this);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f12741U) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof java.util.List) {
                    java.util.List<Object> list = (java.util.List) obj;
                    int b8 = b();
                    int c8 = c();
                    if (c8 - b8 == list.size()) {
                        boolean z = list instanceof RandomAccess;
                        Object[] objArr = (Object[]) this.f12742V;
                        if (z) {
                            while (b8 < c8) {
                                if (objArr[b8].equals(list.get(b8))) {
                                    b8++;
                                }
                            }
                            return true;
                        }
                        for (Object equals : list) {
                            int i = b8 + 1;
                            if (objArr[b8].equals(equals)) {
                                b8 = i;
                            }
                        }
                        return true;
                    }
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof java.util.List) {
                    java.util.List list2 = (java.util.List) obj;
                    if (list2.size() != 1 || !this.f12742V.equals(list2.get(0))) {
                        return false;
                    }
                    return true;
                }
                return false;
        }
    }

    public p f(int i, int i8) {
        int size = size();
        C0996d.k(i, i8, size);
        int b8 = b();
        int i9 = i8 - i;
        if (i9 == 0) {
            return k.f12748U;
        }
        Object[] objArr = (Object[]) this.f12742V;
        if (i9 == 1) {
            return new f(1, objArr[b8 + i]);
        }
        if (i9 == size) {
            return this;
        }
        return new e(i + b8, b8 + i8, objArr);
    }

    public final void forEach(Consumer consumer) {
        switch (this.f12741U) {
            case 0:
                C0996d.r(consumer, "Consumer");
                int c8 = c();
                for (int b8 = b(); b8 < c8; b8++) {
                    consumer.accept(((Object[]) this.f12742V)[b8]);
                }
                return;
            default:
                C0996d.r(consumer, "Consumer");
                consumer.accept(this.f12742V);
                return;
        }
    }

    public final Object get(int i) {
        switch (this.f12741U) {
            case 0:
                int b8 = b();
                C0996d.j(i, size());
                return ((Object[]) this.f12742V)[b8 + i];
            default:
                C0996d.j(i, 1);
                return this.f12742V;
        }
    }

    public final int hashCode() {
        switch (this.f12741U) {
            case 0:
                int c8 = c();
                int i = 1;
                for (int b8 = b(); b8 < c8; b8++) {
                    i = (i * 31) + ((Object[]) this.f12742V)[b8].hashCode();
                }
                return i;
            default:
                return this.f12742V.hashCode() + 31;
        }
    }

    public final int indexOf(Object obj) {
        switch (this.f12741U) {
            case 0:
                if (obj == null) {
                    return -1;
                }
                int b8 = b();
                int c8 = c();
                for (int i = b8; i < c8; i++) {
                    if (obj.equals(((Object[]) this.f12742V)[i])) {
                        return i - b8;
                    }
                }
                return -1;
            default:
                if (this.f12742V.equals(obj)) {
                    return 0;
                }
                return -1;
        }
    }

    public final boolean isEmpty() {
        switch (this.f12741U) {
            case 0:
                if (size() == 0) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public final int lastIndexOf(Object obj) {
        switch (this.f12741U) {
            case 0:
                if (obj == null) {
                    return -1;
                }
                int b8 = b();
                for (int c8 = c() - 1; c8 >= b8; c8--) {
                    if (obj.equals(((Object[]) this.f12742V)[c8])) {
                        return c8 - b8;
                    }
                }
                return -1;
            default:
                return indexOf(obj);
        }
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        switch (this.f12741U) {
            case 0:
                return d();
            default:
                return d();
        }
    }

    public final boolean remove(Object obj) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean removeIf(Predicate predicate) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Object set(int i, Object obj) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int size() {
        switch (this.f12741U) {
            case 0:
                return c() - b();
            default:
                return 1;
        }
    }

    public final void sort(Comparator comparator) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m19spliterator() {
        switch (this.f12741U) {
            case 0:
                return Spliterator.Wrapper.convert(spliterator());
            default:
                return Spliterator.Wrapper.convert(new g(this));
        }
    }

    public java.util.List subList(int i, int i8) {
        switch (this.f12741U) {
            case 0:
                return f(i, i8);
            default:
                C0996d.k(i, i8, 1);
                if (i8 == i) {
                    return k.f12748U;
                }
                return this;
        }
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        int i = this.f12741U;
        return Collection.-CC.$default$toArray(this, intFunction);
    }

    public final String toString() {
        switch (this.f12741U) {
            case 0:
                int b8 = b();
                int c8 = c();
                StringBuilder sb = new StringBuilder("[");
                while (true) {
                    int i = b8 + 1;
                    sb.append(((Object[]) this.f12742V)[b8]);
                    if (i == c8) {
                        sb.append(']');
                        return sb.toString();
                    }
                    sb.append(", ");
                    b8 = i;
                }
            default:
                return "[" + this.f12742V + "]";
        }
    }

    public final void add(int i, Object obj) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(int i, java.util.Collection collection) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final o iterator() {
        switch (this.f12741U) {
            case 0:
                return d();
            default:
                return d();
        }
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        switch (this.f12741U) {
            case 0:
                return e(i);
            default:
                return e(i);
        }
    }

    public final Object remove(int i) {
        switch (this.f12741U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Object[] toArray() {
        Object obj = this.f12742V;
        switch (this.f12741U) {
            case 0:
                return Arrays.copyOfRange((Object[]) obj, b(), c());
            default:
                return new Object[]{obj};
        }
    }

    public final j$.util.Spliterator spliterator() {
        switch (this.f12741U) {
            case 0:
                return Spliterators.spliterator((Object[]) this.f12742V, b(), c(), 1296);
            default:
                return new g(this);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.f12741U) {
            case 0:
                C0996d.r(objArr, "Array");
                int size = size();
                if (objArr.length < size) {
                    objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                } else if (objArr.length > size) {
                    objArr[size] = null;
                }
                System.arraycopy((Object[]) this.f12742V, b(), objArr, 0, size);
                return objArr;
            default:
                C0996d.r(objArr, "Array");
                if (objArr.length < 1) {
                    objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                } else if (objArr.length > 1) {
                    objArr[1] = null;
                }
                objArr[0] = this.f12742V;
                return objArr;
        }
    }
}
