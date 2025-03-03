package H3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: H3.k  reason: case insensitive filesystem */
public abstract class C0094k extends AbstractCollection {

    /* renamed from: U  reason: collision with root package name */
    public final Object f2078U;

    /* renamed from: V  reason: collision with root package name */
    public Collection f2079V;

    /* renamed from: W  reason: collision with root package name */
    public final C0094k f2080W;

    /* renamed from: X  reason: collision with root package name */
    public final Collection f2081X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0098o f2082Y;

    public C0094k(C0098o oVar, Object obj, Collection collection, C0094k kVar) {
        Collection collection2;
        this.f2082Y = oVar;
        this.f2078U = obj;
        this.f2079V = collection;
        this.f2080W = kVar;
        if (kVar == null) {
            collection2 = null;
        } else {
            collection2 = kVar.f2079V;
        }
        this.f2081X = collection2;
    }

    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.f2079V.isEmpty();
        boolean add = this.f2079V.add(obj);
        if (add) {
            this.f2082Y.f2102Y++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f2079V.addAll(collection);
        if (addAll) {
            this.f2082Y.f2102Y += this.f2079V.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        C0094k kVar = this.f2080W;
        if (kVar != null) {
            kVar.b();
        } else {
            this.f2082Y.f2101X.put(this.f2078U, this.f2079V);
        }
    }

    public final void c() {
        Collection collection;
        C0094k kVar = this.f2080W;
        if (kVar != null) {
            kVar.c();
            if (kVar.f2079V != this.f2081X) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f2079V.isEmpty() && (collection = (Collection) this.f2082Y.f2101X.get(this.f2078U)) != null) {
            this.f2079V = collection;
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f2079V.clear();
            this.f2082Y.f2102Y -= size;
            d();
        }
    }

    public final boolean contains(Object obj) {
        c();
        return this.f2079V.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        c();
        return this.f2079V.containsAll(collection);
    }

    public final void d() {
        C0094k kVar = this.f2080W;
        if (kVar != null) {
            kVar.d();
        } else if (this.f2079V.isEmpty()) {
            this.f2082Y.f2101X.remove(this.f2078U);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f2079V.equals(obj);
    }

    public final int hashCode() {
        c();
        return this.f2079V.hashCode();
    }

    public final Iterator iterator() {
        c();
        return new C0086c(this);
    }

    public final boolean remove(Object obj) {
        c();
        boolean remove = this.f2079V.remove(obj);
        if (remove) {
            C0098o oVar = this.f2082Y;
            oVar.f2102Y--;
            d();
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f2079V.removeAll(collection);
        if (removeAll) {
            this.f2082Y.f2102Y += this.f2079V.size() - size;
            d();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f2079V.retainAll(collection);
        if (retainAll) {
            this.f2082Y.f2102Y += this.f2079V.size() - size;
            d();
        }
        return retainAll;
    }

    public final int size() {
        c();
        return this.f2079V.size();
    }

    public final String toString() {
        c();
        return this.f2079V.toString();
    }
}
