package q;

import java.util.Iterator;

/* renamed from: q.b  reason: case insensitive filesystem */
public final class C1349b extends C1352e implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public C1350c f14687U;

    /* renamed from: V  reason: collision with root package name */
    public C1350c f14688V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f14689W;

    public C1349b(C1350c cVar, C1350c cVar2, int i) {
        this.f14689W = i;
        this.f14687U = cVar2;
        this.f14688V = cVar;
    }

    public final void a(C1350c cVar) {
        C1350c cVar2;
        C1350c cVar3 = null;
        if (this.f14687U == cVar && cVar == this.f14688V) {
            this.f14688V = null;
            this.f14687U = null;
        }
        C1350c cVar4 = this.f14687U;
        if (cVar4 == cVar) {
            switch (this.f14689W) {
                case 0:
                    cVar2 = cVar4.f14693X;
                    break;
                default:
                    cVar2 = cVar4.f14692W;
                    break;
            }
            this.f14687U = cVar2;
        }
        C1350c cVar5 = this.f14688V;
        if (cVar5 == cVar) {
            C1350c cVar6 = this.f14687U;
            if (!(cVar5 == cVar6 || cVar6 == null)) {
                cVar3 = b(cVar5);
            }
            this.f14688V = cVar3;
        }
    }

    public final C1350c b(C1350c cVar) {
        switch (this.f14689W) {
            case 0:
                return cVar.f14692W;
            default:
                return cVar.f14693X;
        }
    }

    public final boolean hasNext() {
        if (this.f14688V != null) {
            return true;
        }
        return false;
    }

    public final Object next() {
        C1350c cVar;
        C1350c cVar2 = this.f14688V;
        C1350c cVar3 = this.f14687U;
        if (cVar2 == cVar3 || cVar3 == null) {
            cVar = null;
        } else {
            cVar = b(cVar2);
        }
        this.f14688V = cVar;
        return cVar2;
    }
}
