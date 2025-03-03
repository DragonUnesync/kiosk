package t4;

import D2.j;
import G5.s;
import L4.c;
import L4.d;
import L4.h;
import S5.C0185n;
import u4.C1493b;

public abstract class e extends f {
    public final /* bridge */ /* synthetic */ C0185n a(c cVar, j jVar) {
        return d((d) cVar, jVar);
    }

    public final /* bridge */ /* synthetic */ void g(h hVar, C0185n nVar, int i, int i8, int i9) {
        g((d) hVar, nVar, i, i8, i9);
    }

    public final int i(h hVar) {
        d dVar = (d) hVar;
        return ((C1493b) dVar.f2711c).c() + b.b(dVar.f2709d);
    }

    public final /* bridge */ /* synthetic */ int j(h hVar, int i, int i8) {
        return g.n((d) hVar, i, i8);
    }

    public final int k(h hVar, int i) {
        d dVar = (d) hVar;
        if (i != 0) {
            return s.n(i) + i;
        }
        if (dVar.e == t()) {
            return -1;
        }
        return 0;
    }

    public final int m(h hVar) {
        p((d) hVar);
        return 3;
    }

    public final /* bridge */ /* synthetic */ int p(L4.e eVar) {
        d dVar = (d) eVar;
        return 2;
    }

    public final void s(L4.e eVar, C0185n nVar) {
        nVar.writeShort(((d) eVar).f2707f);
    }
}
