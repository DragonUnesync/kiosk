package H3;

import java.util.AbstractList;
import java.util.ListIterator;

public final class Y extends w0 implements ListIterator {

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f2043V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ AbstractList f2044W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f2043V = i;
        this.f2044W = abstractList;
    }

    public final Object a(Object obj) {
        switch (this.f2043V) {
            case 0:
                return ((Z) this.f2044W).f2046V.apply(obj);
            default:
                return ((a0) this.f2044W).f2053V.apply(obj);
        }
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f2132U).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f2132U).nextIndex();
    }

    public final Object previous() {
        return a(((ListIterator) this.f2132U).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f2132U).previousIndex();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
