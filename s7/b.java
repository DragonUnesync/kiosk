package S7;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public int f4541U;

    /* renamed from: V  reason: collision with root package name */
    public int f4542V = 0;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ c f4543W;

    public b(c cVar) {
        this.f4543W = cVar;
        this.f4541U = cVar.f4544U;
    }

    public final boolean hasNext() {
        c cVar = this.f4543W;
        if (cVar.f4544U == this.f4541U) {
            while (true) {
                int i = this.f4542V;
                if (i < cVar.f4544U && c.m(cVar.f4545V[i])) {
                    this.f4542V++;
                }
            }
            if (this.f4542V < cVar.f4544U) {
                return true;
            }
            return false;
        }
        throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
    }

    public final Object next() {
        c cVar = this.f4543W;
        int i = cVar.f4544U;
        if (i == this.f4541U) {
            int i8 = this.f4542V;
            if (i8 < i) {
                a aVar = new a(cVar.f4545V[i8], (String) cVar.f4546W[this.f4542V], cVar);
                this.f4542V++;
                return aVar;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
    }

    public final void remove() {
        int i = this.f4542V - 1;
        this.f4542V = i;
        this.f4543W.o(i);
        this.f4541U--;
    }
}
