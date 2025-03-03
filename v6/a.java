package V6;

import D6.p;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f5989a;

    public a(p pVar) {
        this.f5989a = new AtomicReference(pVar);
    }

    public final Iterator iterator() {
        c cVar = (c) this.f5989a.getAndSet((Object) null);
        if (cVar != null) {
            return cVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
