package H3;

import Q7.g;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: H3.c  reason: case insensitive filesystem */
public class C0086c implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2055U = 0;

    /* renamed from: V  reason: collision with root package name */
    public final Iterator f2056V;

    /* renamed from: W  reason: collision with root package name */
    public Object f2057W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f2058X;

    public C0086c(C0094k kVar) {
        Iterator it;
        this.f2058X = kVar;
        Collection collection = kVar.f2079V;
        this.f2057W = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f2056V = it;
    }

    public void a() {
        C0094k kVar = (C0094k) this.f2058X;
        kVar.c();
        if (kVar.f2079V != ((Collection) this.f2057W)) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        switch (this.f2055U) {
            case 0:
                return this.f2056V.hasNext();
            case 1:
                return this.f2056V.hasNext();
            default:
                a();
                return this.f2056V.hasNext();
        }
    }

    public final Object next() {
        switch (this.f2055U) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f2056V.next();
                this.f2057W = (Collection) entry.getValue();
                return ((C0087d) this.f2058X).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f2056V.next();
                this.f2057W = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f2056V.next();
        }
    }

    public final void remove() {
        boolean z;
        boolean z6;
        switch (this.f2055U) {
            case 0:
                if (((Collection) this.f2057W) != null) {
                    z = true;
                } else {
                    z = false;
                }
                g.j("no calls to next() since the last call to remove()", z);
                this.f2056V.remove();
                ((C0087d) this.f2058X).f2062X.f2102Y -= ((Collection) this.f2057W).size();
                ((Collection) this.f2057W).clear();
                this.f2057W = null;
                return;
            case 1:
                if (((Map.Entry) this.f2057W) != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                g.j("no calls to next() since the last call to remove()", z6);
                Collection collection = (Collection) ((Map.Entry) this.f2057W).getValue();
                this.f2056V.remove();
                ((C0088e) this.f2058X).f2065V.f2102Y -= collection.size();
                collection.clear();
                this.f2057W = null;
                return;
            default:
                this.f2056V.remove();
                C0094k kVar = (C0094k) this.f2058X;
                C0098o oVar = kVar.f2082Y;
                oVar.f2102Y--;
                kVar.d();
                return;
        }
    }

    public C0086c(C0096m mVar, ListIterator listIterator) {
        this.f2058X = mVar;
        this.f2057W = mVar.f2079V;
        this.f2056V = listIterator;
    }

    public C0086c(C0088e eVar, Iterator it) {
        this.f2056V = it;
        this.f2058X = eVar;
    }

    public C0086c(C0087d dVar) {
        this.f2058X = dVar;
        this.f2056V = dVar.f2061W.entrySet().iterator();
    }
}
