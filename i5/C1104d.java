package i5;

import g7.C0996d;
import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* renamed from: i5.d  reason: case insensitive filesystem */
public final class C1104d implements o, Iterator {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12736U;

    /* renamed from: V  reason: collision with root package name */
    public int f12737V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f12738W;

    public /* synthetic */ C1104d(int i, int i8, Object obj) {
        this.f12736U = i8;
        this.f12738W = obj;
        this.f12737V = i;
    }

    public final void add(Object obj) {
        switch (this.f12736U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void forEachRemaining(Consumer consumer) {
        switch (this.f12736U) {
            case 0:
                C0996d.r(consumer, "Consumer");
                while (hasNext()) {
                    consumer.accept(next());
                }
                return;
            default:
                C0996d.r(consumer, "Consumer");
                if (hasNext()) {
                    consumer.accept(next());
                    return;
                }
                return;
        }
    }

    public final boolean hasNext() {
        switch (this.f12736U) {
            case 0:
                if (this.f12737V < ((f) this.f12738W).c()) {
                    return true;
                }
                return false;
            default:
                if (this.f12737V == 0) {
                    return true;
                }
                return false;
        }
    }

    public final boolean hasPrevious() {
        switch (this.f12736U) {
            case 0:
                if (this.f12737V > ((f) this.f12738W).b()) {
                    return true;
                }
                return false;
            default:
                if (this.f12737V == 1) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        switch (this.f12736U) {
            case 0:
                if (hasNext()) {
                    int i = this.f12737V;
                    this.f12737V = i + 1;
                    return ((Object[]) ((f) this.f12738W).f12742V)[i];
                }
                throw new NoSuchElementException();
            default:
                if (hasNext()) {
                    this.f12737V = 1;
                    return ((f) this.f12738W).f12742V;
                }
                throw new NoSuchElementException();
        }
    }

    public final int nextIndex() {
        switch (this.f12736U) {
            case 0:
                return this.f12737V - ((f) this.f12738W).b();
            default:
                return this.f12737V;
        }
    }

    public final Object previous() {
        switch (this.f12736U) {
            case 0:
                if (hasPrevious()) {
                    int i = this.f12737V - 1;
                    this.f12737V = i;
                    return ((Object[]) ((f) this.f12738W).f12742V)[i];
                }
                throw new NoSuchElementException();
            default:
                if (hasPrevious()) {
                    this.f12737V = 0;
                    return ((f) this.f12738W).f12742V;
                }
                throw new NoSuchElementException();
        }
    }

    public final int previousIndex() {
        switch (this.f12736U) {
            case 0:
                return (this.f12737V - 1) - ((f) this.f12738W).b();
            default:
                return this.f12737V - 1;
        }
    }

    public final void remove() {
        switch (this.f12736U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void set(Object obj) {
        switch (this.f12736U) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
