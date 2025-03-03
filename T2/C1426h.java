package t2;

import Q0.g;
import u2.v;
import v2.C1559b;
import v2.e;

/* renamed from: t2.h  reason: case insensitive filesystem */
public final class C1426h extends C1421c {
    public C1426h(n nVar, p pVar, k kVar, l lVar, v vVar) {
        super(nVar, pVar, kVar, lVar, vVar);
        int i = nVar.e;
        if (i != 1) {
            throw new IllegalArgumentException(g.m(i, "opcode with invalid branchingness: "));
        }
    }

    public final void b(C1423e eVar) {
        eVar.h(this);
    }

    public final e d() {
        return C1559b.f16011W;
    }
}
