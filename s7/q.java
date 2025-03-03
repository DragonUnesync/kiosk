package S7;

import Q7.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class q implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public p f4580U;

    /* renamed from: V  reason: collision with root package name */
    public p f4581V;

    /* renamed from: W  reason: collision with root package name */
    public p f4582W;

    /* renamed from: X  reason: collision with root package name */
    public p f4583X;

    /* renamed from: Y  reason: collision with root package name */
    public p f4584Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Class f4585Z;

    public q(p pVar, Class cls) {
        g.D(pVar);
        this.f4585Z = cls;
        if (cls.isInstance(pVar)) {
            this.f4581V = pVar;
        }
        this.f4582W = pVar;
        this.f4583X = pVar;
        this.f4580U = pVar;
        this.f4584Y = pVar.v();
    }

    public final void a() {
        p pVar;
        if (this.f4581V == null) {
            if (this.f4584Y != null && this.f4582W.f4578U == null) {
                this.f4582W = this.f4583X;
            }
            p pVar2 = this.f4582W;
            loop0:
            while (true) {
                pVar = null;
                if (pVar2.g() <= 0) {
                    if (!this.f4580U.equals(pVar2)) {
                        if (pVar2.p() == null) {
                            while (true) {
                                pVar2 = pVar2.v();
                                if (pVar2 != null && !this.f4580U.equals(pVar2)) {
                                    if (pVar2.p() != null) {
                                        pVar2 = pVar2.p();
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            }
                        } else {
                            pVar2 = pVar2.p();
                        }
                    } else {
                        pVar2 = null;
                    }
                } else {
                    pVar2 = (p) pVar2.k().get(0);
                }
                if (pVar2 != null) {
                    if (this.f4585Z.isInstance(pVar2)) {
                        pVar = pVar2;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f4581V = pVar;
        }
    }

    public final boolean hasNext() {
        a();
        if (this.f4581V != null) {
            return true;
        }
        return false;
    }

    public final Object next() {
        a();
        p pVar = this.f4581V;
        if (pVar != null) {
            this.f4583X = this.f4582W;
            this.f4582W = pVar;
            this.f4584Y = pVar.v();
            this.f4581V = null;
            return pVar;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        this.f4582W.y();
    }
}
