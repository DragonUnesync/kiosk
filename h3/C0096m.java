package H3;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: H3.m  reason: case insensitive filesystem */
public class C0096m extends C0094k implements List {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0098o f2089Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0096m(C0098o oVar, Object obj, List list, C0094k kVar) {
        super(oVar, obj, list, kVar);
        this.f2089Z = oVar;
    }

    public final void add(int i, Object obj) {
        c();
        boolean isEmpty = this.f2079V.isEmpty();
        ((List) this.f2079V).add(i, obj);
        this.f2089Z.f2102Y++;
        if (isEmpty) {
            b();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f2079V).addAll(i, collection);
        if (addAll) {
            this.f2089Z.f2102Y += this.f2079V.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final Object get(int i) {
        c();
        return ((List) this.f2079V).get(i);
    }

    public final int indexOf(Object obj) {
        c();
        return ((List) this.f2079V).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f2079V).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        c();
        return new C0095l(this);
    }

    public final Object remove(int i) {
        c();
        Object remove = ((List) this.f2079V).remove(i);
        C0098o oVar = this.f2089Z;
        oVar.f2102Y--;
        d();
        return remove;
    }

    public final Object set(int i, Object obj) {
        c();
        return ((List) this.f2079V).set(i, obj);
    }

    public final List subList(int i, int i8) {
        c();
        List subList = ((List) this.f2079V).subList(i, i8);
        C0094k kVar = this.f2080W;
        if (kVar == null) {
            kVar = this;
        }
        C0098o oVar = this.f2089Z;
        oVar.getClass();
        boolean z = subList instanceof RandomAccess;
        Object obj = this.f2078U;
        if (z) {
            return new C0096m(oVar, obj, subList, kVar);
        }
        return new C0096m(oVar, obj, subList, kVar);
    }

    public final ListIterator listIterator(int i) {
        c();
        return new C0095l(this, i);
    }
}
