package Q0;

import t2.C1423e;
import t2.C1424f;
import t2.C1426h;
import t2.i;
import t2.k;
import t2.q;
import t2.r;

public final class l implements C1423e {

    /* renamed from: U  reason: collision with root package name */
    public int f4037U;

    public void a(C1424f fVar) {
        int d8;
        k kVar = fVar.f15198W;
        if (kVar != null && (d8 = kVar.d() + kVar.f15204U) > this.f4037U) {
            this.f4037U = d8;
        }
        t2.l lVar = fVar.f15199X;
        int length = lVar.f16371V.length;
        for (int i = 0; i < length; i++) {
            k kVar2 = (k) lVar.e(i);
            int d9 = kVar2.d() + kVar2.f15204U;
            if (d9 > this.f4037U) {
                this.f4037U = d9;
            }
        }
    }

    public void b(q qVar) {
        a(qVar);
    }

    public void d(i iVar) {
        a(iVar);
    }

    public void f(r rVar) {
        a(rVar);
    }

    public void h(C1426h hVar) {
        a(hVar);
    }
}
