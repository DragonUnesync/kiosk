package q;

import java.util.Iterator;

/* renamed from: q.d  reason: case insensitive filesystem */
public final class C1351d extends C1352e implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public C1350c f14694U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f14695V = true;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ C1353f f14696W;

    public C1351d(C1353f fVar) {
        this.f14696W = fVar;
    }

    public final void a(C1350c cVar) {
        boolean z;
        C1350c cVar2 = this.f14694U;
        if (cVar == cVar2) {
            C1350c cVar3 = cVar2.f14693X;
            this.f14694U = cVar3;
            if (cVar3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.f14695V = z;
        }
    }

    public final boolean hasNext() {
        if (!this.f14695V) {
            C1350c cVar = this.f14694U;
            if (cVar == null || cVar.f14692W == null) {
                return false;
            }
            return true;
        } else if (this.f14696W.f14697U != null) {
            return true;
        } else {
            return false;
        }
    }

    public final Object next() {
        C1350c cVar;
        if (this.f14695V) {
            this.f14695V = false;
            this.f14694U = this.f14696W.f14697U;
        } else {
            C1350c cVar2 = this.f14694U;
            if (cVar2 != null) {
                cVar = cVar2.f14692W;
            } else {
                cVar = null;
            }
            this.f14694U = cVar;
        }
        return this.f14694U;
    }
}
