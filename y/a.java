package Y;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public int f6283U;

    /* renamed from: V  reason: collision with root package name */
    public int f6284V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f6285W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ int f6286X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f6287Y;

    public a(int i) {
        this.f6283U = i;
    }

    public final boolean hasNext() {
        if (this.f6284V < this.f6283U) {
            return true;
        }
        return false;
    }

    public final Object next() {
        Object obj;
        if (hasNext()) {
            int i = this.f6284V;
            switch (this.f6286X) {
                case 0:
                    obj = ((e) this.f6287Y).f(i);
                    break;
                case 1:
                    obj = ((e) this.f6287Y).j(i);
                    break;
                default:
                    obj = ((f) this.f6287Y).f6298V[i];
                    break;
            }
            this.f6284V++;
            this.f6285W = true;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f6285W) {
            int i = this.f6284V - 1;
            this.f6284V = i;
            switch (this.f6286X) {
                case 0:
                    ((e) this.f6287Y).h(i);
                    break;
                case 1:
                    ((e) this.f6287Y).h(i);
                    break;
                default:
                    ((f) this.f6287Y).b(i);
                    break;
            }
            this.f6283U--;
            this.f6285W = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f6299W);
        this.f6286X = 2;
        this.f6287Y = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i) {
        this(eVar.f6308W);
        this.f6286X = i;
        switch (i) {
            case 1:
                this.f6287Y = eVar;
                this(eVar.f6308W);
                return;
            default:
                this.f6287Y = eVar;
                return;
        }
    }
}
