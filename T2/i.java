package t2;

import Q0.g;
import v2.C1559b;
import v2.e;

public final class i extends C1424f {
    public i(n nVar, p pVar, k kVar, l lVar) {
        super(nVar, pVar, kVar, lVar);
        int i = nVar.e;
        if (i == 5 || i == 6) {
            throw new IllegalArgumentException(g.m(i, "opcode with invalid branchingness: "));
        } else if (kVar != null && i != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    public final void b(C1423e eVar) {
        eVar.d(this);
    }

    public final e d() {
        return C1559b.f16011W;
    }
}
