package t4;

import L4.e;
import S4.a;
import S5.C0185n;
import u5.C1495b;
import u5.C1496c;
import x5.C1606a;

public final class d extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final int f15474c = (C1495b.f15798h0.a() << 4);

    public final int h() {
        return f15474c;
    }

    public final int o(e eVar) {
        int i;
        a aVar = (a) eVar;
        if (aVar.f4533f == -1) {
            i = 0;
        } else {
            i = 5;
        }
        return b.b(aVar.f4534g) + i;
    }

    public final void r(e eVar, C0185n nVar) {
        a aVar = (a) eVar;
        b.a(17, aVar.f4533f, -1, nVar);
        u4.d dVar = aVar.f4534g;
        if (dVar != null) {
            nVar.writeByte(28);
            dVar.d(nVar);
        }
    }

    public final C1496c t() {
        return C1606a.f16298a;
    }
}
