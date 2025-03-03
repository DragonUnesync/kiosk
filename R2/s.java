package r2;

import android.support.v4.media.session.b;
import u2.p;
import u2.r;
import y2.C1627b;

public abstract class s extends n {

    /* renamed from: W  reason: collision with root package name */
    public final p f14928W;

    public s(p pVar) {
        super(pVar.f15759U);
        this.f14928W = pVar;
    }

    public final int c() {
        return 8;
    }

    public final void d(C1387f fVar, C1627b bVar) {
        z zVar = fVar.f14887f;
        p pVar = this.f14928W;
        r rVar = pVar.f15760V;
        int m8 = zVar.m(this.f14903V);
        int l8 = fVar.e.l(rVar.f15763U);
        int h5 = h(fVar);
        if (bVar.d()) {
            bVar.b(0, f() + ' ' + pVar.a());
            bVar.b(2, "  class_idx: ".concat(b.P(m8)));
            bVar.b(2, String.format("  %-10s %s", new Object[]{i().concat(":"), b.P(h5)}));
            bVar.b(4, "  name_idx:  ".concat(b.Q(l8)));
        }
        bVar.k(m8);
        bVar.k(h5);
        bVar.j(l8);
    }

    public abstract int h(C1387f fVar);

    public abstract String i();
}
