package H3;

import java.util.NoSuchElementException;

public final class X extends x0 {

    /* renamed from: U  reason: collision with root package name */
    public final Object f2041U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f2042V;

    public X(Object obj) {
        this.f2041U = obj;
    }

    public final boolean hasNext() {
        return !this.f2042V;
    }

    public final Object next() {
        if (!this.f2042V) {
            this.f2042V = true;
            return this.f2041U;
        }
        throw new NoSuchElementException();
    }
}
