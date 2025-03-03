package org.altbeacon.beacon.utils;

import P6.f;
import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public final class ChangeAwareCopyOnWriteArrayList<E> extends ArrayList<E> implements List {
    private ChangeAwareCopyOnWriteArrayListNotifier notifier;

    public boolean add(E e) {
        boolean add = super.add(e);
        ChangeAwareCopyOnWriteArrayListNotifier changeAwareCopyOnWriteArrayListNotifier = this.notifier;
        if (changeAwareCopyOnWriteArrayListNotifier != null) {
            changeAwareCopyOnWriteArrayListNotifier.onChange();
        }
        return add;
    }

    public boolean addAll(Collection<? extends E> collection) {
        f.e(collection, "elements");
        boolean addAll = super.addAll(collection);
        ChangeAwareCopyOnWriteArrayListNotifier changeAwareCopyOnWriteArrayListNotifier = this.notifier;
        if (changeAwareCopyOnWriteArrayListNotifier != null) {
            changeAwareCopyOnWriteArrayListNotifier.onChange();
        }
        return addAll;
    }

    public void clear() {
        super.clear();
        ChangeAwareCopyOnWriteArrayListNotifier changeAwareCopyOnWriteArrayListNotifier = this.notifier;
        if (changeAwareCopyOnWriteArrayListNotifier != null) {
            changeAwareCopyOnWriteArrayListNotifier.onChange();
        }
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable.-CC.$default$forEach(this, consumer);
    }

    public final ChangeAwareCopyOnWriteArrayListNotifier getNotifier() {
        return this.notifier;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final /* bridge */ E remove(int i) {
        return removeAt(i);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        f.e(collection, "elements");
        boolean removeAll = super.removeAll(collection);
        ChangeAwareCopyOnWriteArrayListNotifier changeAwareCopyOnWriteArrayListNotifier = this.notifier;
        if (changeAwareCopyOnWriteArrayListNotifier != null) {
            changeAwareCopyOnWriteArrayListNotifier.onChange();
        }
        return removeAll;
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public boolean removeIf(Predicate<? super E> predicate) {
        f.e(predicate, "filter");
        boolean $default$removeIf = Collection.-CC.$default$removeIf(this, predicate);
        ChangeAwareCopyOnWriteArrayListNotifier changeAwareCopyOnWriteArrayListNotifier = this.notifier;
        if (changeAwareCopyOnWriteArrayListNotifier != null) {
            changeAwareCopyOnWriteArrayListNotifier.onChange();
        }
        return $default$removeIf;
    }

    public void removeRange(int i, int i8) {
        super.removeRange(i, i8);
        ChangeAwareCopyOnWriteArrayListNotifier changeAwareCopyOnWriteArrayListNotifier = this.notifier;
        if (changeAwareCopyOnWriteArrayListNotifier != null) {
            changeAwareCopyOnWriteArrayListNotifier.onChange();
        }
    }

    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.-CC.$default$replaceAll(this, unaryOperator);
    }

    public E set(int i, E e) {
        E e8 = super.set(i, e);
        ChangeAwareCopyOnWriteArrayListNotifier changeAwareCopyOnWriteArrayListNotifier = this.notifier;
        if (changeAwareCopyOnWriteArrayListNotifier != null) {
            changeAwareCopyOnWriteArrayListNotifier.onChange();
        }
        return e8;
    }

    public final void setNotifier(ChangeAwareCopyOnWriteArrayListNotifier changeAwareCopyOnWriteArrayListNotifier) {
        this.notifier = changeAwareCopyOnWriteArrayListNotifier;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final /* synthetic */ void sort(Comparator comparator) {
        List.-CC.$default$sort(this, comparator);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.-CC.$default$toArray(this, intFunction);
    }

    public boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        ChangeAwareCopyOnWriteArrayListNotifier changeAwareCopyOnWriteArrayListNotifier = this.notifier;
        if (changeAwareCopyOnWriteArrayListNotifier != null) {
            changeAwareCopyOnWriteArrayListNotifier.onChange();
        }
        return remove;
    }
}
