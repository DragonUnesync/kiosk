package H3;

import Q7.g;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class M extends x0 implements ListIterator {

    /* renamed from: U  reason: collision with root package name */
    public final int f2020U;

    /* renamed from: V  reason: collision with root package name */
    public int f2021V;

    /* renamed from: W  reason: collision with root package name */
    public final O f2022W;

    public M(O o2, int i) {
        int size = o2.size();
        g.h(i, size);
        this.f2020U = size;
        this.f2021V = i;
        this.f2022W = o2;
    }

    public final Object a(int i) {
        return this.f2022W.get(i);
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        if (this.f2021V < this.f2020U) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.f2021V > 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f2021V;
            this.f2021V = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f2021V;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f2021V - 1;
            this.f2021V = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f2021V - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
