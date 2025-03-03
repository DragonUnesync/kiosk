package T6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public final int f5009U;

    /* renamed from: V  reason: collision with root package name */
    public final int f5010V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f5011W;

    /* renamed from: X  reason: collision with root package name */
    public int f5012X;

    public b(int i, int i8, int i9) {
        this.f5009U = i9;
        this.f5010V = i8;
        boolean z = false;
        if (i9 <= 0 ? i >= i8 : i <= i8) {
            z = true;
        }
        this.f5011W = z;
        this.f5012X = !z ? i8 : i;
    }

    public final boolean hasNext() {
        return this.f5011W;
    }

    public final Object next() {
        int i = this.f5012X;
        if (i != this.f5010V) {
            this.f5012X = this.f5009U + i;
        } else if (this.f5011W) {
            this.f5011W = false;
        } else {
            throw new NoSuchElementException();
        }
        return Integer.valueOf(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
