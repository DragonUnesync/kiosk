package H3;

import Q7.g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: H3.z  reason: case insensitive filesystem */
public final class C0108z implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public int f2146U;

    /* renamed from: V  reason: collision with root package name */
    public int f2147V;

    /* renamed from: W  reason: collision with root package name */
    public int f2148W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ A f2149X;

    public C0108z(A a8) {
        int i;
        this.f2149X = a8;
        this.f2146U = a8.f2004X;
        if (a8.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.f2147V = i;
        this.f2148W = -1;
    }

    public final boolean hasNext() {
        if (this.f2147V >= 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        A a8 = this.f2149X;
        if (a8.f2004X != this.f2146U) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int i = this.f2147V;
            this.f2148W = i;
            Object obj = a8.e()[i];
            int i8 = this.f2147V + 1;
            if (i8 >= a8.f2005Y) {
                i8 = -1;
            }
            this.f2147V = i8;
            return obj;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        boolean z;
        A a8 = this.f2149X;
        if (a8.f2004X == this.f2146U) {
            if (this.f2148W >= 0) {
                z = true;
            } else {
                z = false;
            }
            g.j("no calls to next() since the last call to remove()", z);
            this.f2146U += 32;
            a8.remove(a8.e()[this.f2148W]);
            this.f2147V--;
            this.f2148W = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
