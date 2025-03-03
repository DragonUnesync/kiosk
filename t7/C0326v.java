package T7;

import Q0.d;
import R7.h;

/* 'enum' modifier removed */
/* renamed from: T7.v  reason: case insensitive filesystem */
public final class C0326v extends B {
    public C0326v() {
        super("InHeadNoscript", 4);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [Q0.d, T7.I] */
    /* JADX WARNING: type inference failed for: r0v18, types: [Q0.d, T7.I] */
    public final boolean d(d dVar, C0287b bVar) {
        if (dVar.l()) {
            bVar.s(this);
        } else if (!dVar.o() || !((N) dVar).f5105X.equals("html")) {
            boolean n4 = dVar.n();
            C0324u uVar = B.f5054X;
            if (n4 && ((M) dVar).f5105X.equals("noscript")) {
                bVar.g();
                bVar.f5161l = uVar;
            } else if (B.a(dVar) || dVar.k() || (dVar.o() && h.d(((N) dVar).f5105X, A.f5032f))) {
                bVar.getClass();
                return uVar.d(dVar, bVar);
            } else if (dVar.n() && ((M) dVar).f5105X.equals("br")) {
                bVar.s(this);
                ? dVar2 = new d(5, 2);
                dVar2.f5095W = dVar.toString();
                bVar.C(dVar2);
                return true;
            } else if ((!dVar.o() || !h.d(((N) dVar).f5105X, A.f5023J)) && !dVar.n()) {
                bVar.s(this);
                ? dVar3 = new d(5, 2);
                dVar3.f5095W = dVar.toString();
                bVar.C(dVar3);
                return true;
            } else {
                bVar.s(this);
                return false;
            }
        } else {
            C0330x xVar = B.f5057a0;
            bVar.getClass();
            return xVar.d(dVar, bVar);
        }
        return true;
    }
}
