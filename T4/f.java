package t4;

import D2.j;
import G5.s;
import L4.c;
import L4.e;
import L4.h;
import S5.C0185n;
import u4.C1493b;
import u4.d;
import u5.C1496c;

public abstract class f extends g {
    public /* bridge */ /* synthetic */ C0185n a(c cVar, j jVar) {
        return d((e) cVar, jVar);
    }

    public abstract int h();

    public int i(h hVar) {
        e eVar = (e) hVar;
        int b8 = b.b(eVar.f2709d);
        return o(eVar) + ((C1493b) eVar.f2711c).c() + b8;
    }

    public /* bridge */ /* synthetic */ int j(h hVar, int i, int i8) {
        return g.n((e) hVar, i, i8);
    }

    public int k(h hVar, int i) {
        e eVar = (e) hVar;
        if (i != 0) {
            return s.n(i) + i;
        }
        if (eVar.e == t()) {
            return -1;
        }
        return 0;
    }

    public int m(h hVar) {
        return p((e) hVar) + 1;
    }

    public int o(e eVar) {
        return 0;
    }

    public int p(e eVar) {
        return 0;
    }

    /* renamed from: q */
    public final void g(e eVar, C0185n nVar, int i, int i8, int i9) {
        d dVar;
        nVar.writeByte(h());
        s.m(nVar, i);
        s(eVar, nVar);
        C1496c cVar = eVar.e;
        if (i8 != 0) {
            nVar.writeByte(cVar.b());
            s.m(nVar, i8);
            r(eVar, nVar);
            if (i9 == 0 && (dVar = eVar.f2709d) != null) {
                nVar.writeByte(31);
                dVar.d(nVar);
            }
            if (i9 <= 1) {
                ((C1493b) eVar.f2711c).b(nVar);
            }
        } else if (cVar != t()) {
            nVar.writeByte(cVar.b());
        }
    }

    public void r(e eVar, C0185n nVar) {
    }

    public void s(e eVar, C0185n nVar) {
    }

    public abstract C1496c t();
}
