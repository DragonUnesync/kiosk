package H3;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: H3.a  reason: case insensitive filesystem */
public final class C0084a implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public final Iterator f2047U;

    /* renamed from: V  reason: collision with root package name */
    public Object f2048V = null;

    /* renamed from: W  reason: collision with root package name */
    public Collection f2049W = null;

    /* renamed from: X  reason: collision with root package name */
    public Iterator f2050X = W.f2039U;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0098o f2051Y;

    public C0084a(C0098o oVar) {
        this.f2051Y = oVar;
        this.f2047U = oVar.f2101X.entrySet().iterator();
    }

    public final boolean hasNext() {
        if (this.f2047U.hasNext() || this.f2050X.hasNext()) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (!this.f2050X.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f2047U.next();
            this.f2048V = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f2049W = collection;
            this.f2050X = collection.iterator();
        }
        return this.f2050X.next();
    }

    public final void remove() {
        this.f2050X.remove();
        Collection collection = this.f2049W;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f2047U.remove();
        }
        C0098o oVar = this.f2051Y;
        oVar.f2102Y--;
    }
}
