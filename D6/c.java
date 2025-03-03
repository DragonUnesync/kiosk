package D6;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class c extends b implements ListIterator {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ e f1256X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i) {
        super(0, eVar);
        this.f1256X = eVar;
        int b8 = eVar.b();
        if (i < 0 || i > b8) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + b8);
        }
        this.f1254V = i;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasPrevious() {
        if (this.f1254V > 0) {
            return true;
        }
        return false;
    }

    public final int nextIndex() {
        return this.f1254V;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f1254V - 1;
            this.f1254V = i;
            return this.f1256X.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f1254V - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
