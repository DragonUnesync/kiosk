package t2;

import Q0.g;
import u2.C1490a;
import u2.t;
import v2.e;

public final class q extends C1421c {

    /* renamed from: Z  reason: collision with root package name */
    public final e f15378Z;

    public q(n nVar, p pVar, l lVar, e eVar, C1490a aVar) {
        super(nVar, pVar, (k) null, lVar, aVar);
        int i = nVar.e;
        if (i != 6) {
            throw new IllegalArgumentException(g.m(i, "opcode with invalid branchingness: "));
        } else if (eVar != null) {
            this.f15378Z = eVar;
        } else {
            throw new NullPointerException("catches == null");
        }
    }

    public final void b(C1423e eVar) {
        eVar.b(this);
    }

    public final e d() {
        return this.f15378Z;
    }

    public final String e() {
        C1490a aVar = this.f15188Y;
        String a8 = aVar.a();
        if (aVar instanceof t) {
            a8 = ((t) aVar).f();
        }
        StringBuilder B8 = N.e.B(a8, " ");
        B8.append(r.f(this.f15378Z));
        return B8.toString();
    }
}
