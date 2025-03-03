package i5;

import g7.C0996d;
import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public final class i implements o, Iterator {

    /* renamed from: U  reason: collision with root package name */
    public static final i f12746U = new Object();

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void forEachRemaining(Consumer consumer) {
        C0996d.r(consumer, "Consumer");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return 0;
    }

    public final Object previous() {
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
