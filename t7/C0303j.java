package T7;

import Q0.d;
import R7.h;

/* 'enum' modifier removed */
/* renamed from: T7.j  reason: case insensitive filesystem */
public final class C0303j extends B {
    public C0303j() {
        super("InSelectInTable", 16);
    }

    public final boolean d(d dVar, C0287b bVar) {
        boolean o2 = dVar.o();
        String[] strArr = A.f5021H;
        if (!o2 || !h.d(((N) dVar).f5105X, strArr)) {
            if (dVar.n()) {
                M m8 = (M) dVar;
                if (h.d(m8.f5105X, strArr)) {
                    bVar.s(this);
                    if (!bVar.B(m8.f5105X)) {
                        return false;
                    }
                    bVar.N("select");
                    bVar.T();
                    return bVar.h(dVar);
                }
            }
            C0301i iVar = B.f5066j0;
            bVar.getClass();
            return iVar.d(dVar, bVar);
        }
        bVar.s(this);
        bVar.N("select");
        bVar.T();
        return bVar.h(dVar);
    }
}
