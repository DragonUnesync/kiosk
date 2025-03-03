package H3;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public abstract class J extends AbstractCollection implements Serializable, Collection {

    /* renamed from: U  reason: collision with root package name */
    public static final Object[] f2017U = new Object[0];

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract O b();

    public abstract int c(int i, Object[] objArr);

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public Object[] d() {
        return null;
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public int f() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable.-CC.$default$forEach(this, consumer);
    }

    public abstract boolean g();

    /* renamed from: h */
    public abstract x0 iterator();

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.-CC.$default$removeIf(this, predicate);
    }

    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m1spliterator() {
        return Spliterator.Wrapper.convert(Spliterators.spliterator(this, 1296));
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.-CC.$default$toArray(this, intFunction);
    }

    public final Object[] toArray() {
        return toArray(f2017U);
    }

    public final j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] d8 = d();
            if (d8 != null) {
                return Arrays.copyOfRange(d8, f(), e(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        c(0, objArr);
        return objArr;
    }
}
