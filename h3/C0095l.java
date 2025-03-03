package H3;

import java.util.List;
import java.util.ListIterator;

/* renamed from: H3.l  reason: case insensitive filesystem */
public final class C0095l extends C0086c implements ListIterator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0096m f2086Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0095l(C0096m mVar) {
        super((C0094k) mVar);
        this.f2086Y = mVar;
    }

    public final void add(Object obj) {
        C0096m mVar = this.f2086Y;
        boolean isEmpty = mVar.isEmpty();
        b().add(obj);
        mVar.f2089Z.f2102Y++;
        if (isEmpty) {
            mVar.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f2056V;
    }

    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    public final int nextIndex() {
        return b().nextIndex();
    }

    public final Object previous() {
        return b().previous();
    }

    public final int previousIndex() {
        return b().previousIndex();
    }

    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0095l(C0096m mVar, int i) {
        super(mVar, ((List) mVar.f2079V).listIterator(i));
        this.f2086Y = mVar;
    }
}
