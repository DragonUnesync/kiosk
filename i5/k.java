package i5;

import Q0.g;
import g7.C0996d;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public final class k implements p, List {

    /* renamed from: U  reason: collision with root package name */
    public static final k f12748U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public static final Object[] f12749V = new Object[0];

    public final p a() {
        return this;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final o b() {
        c(0);
        return i.f12746U;
    }

    public final o c(int i) {
        C0996d.d(i, 0);
        return i.f12746U;
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return false;
    }

    public final /* synthetic */ boolean containsAll(Collection collection) {
        return g.a(this, collection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof java.util.List) && ((java.util.List) obj).size() == 0) {
            return true;
        }
        return false;
    }

    public final void forEach(Consumer consumer) {
        C0996d.r(consumer, "Consumer");
    }

    public final Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list");
    }

    public final int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final int lastIndexOf(Object obj) {
        return -1;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        b();
        return i.f12746U;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return 0;
    }

    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    public final java.util.List subList(int i, int i8) {
        C0996d.k(i, i8, 0);
        return this;
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.-CC.$default$toArray(this, intFunction);
    }

    public final String toString() {
        return "[]";
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final o iterator() {
        b();
        return i.f12746U;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        c(i);
        return i.f12746U;
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final Spliterator spliterator() {
        return j.f12747a;
    }

    public final Object[] toArray() {
        return f12749V;
    }

    public final Object[] toArray(Object[] objArr) {
        C0996d.r(objArr, "Array");
        if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }
}
