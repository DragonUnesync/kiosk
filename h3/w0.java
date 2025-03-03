package H3;

import java.util.Iterator;

public abstract class w0 implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public final Iterator f2132U;

    public w0(Iterator it) {
        it.getClass();
        this.f2132U = it;
    }

    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.f2132U.hasNext();
    }

    public final Object next() {
        return a(this.f2132U.next());
    }

    public final void remove() {
        this.f2132U.remove();
    }
}
