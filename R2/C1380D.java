package r2;

import android.support.v4.media.session.b;
import u2.t;
import y2.C1627b;

/* renamed from: r2.D  reason: case insensitive filesystem */
public final class C1380D extends n {
    public final void a(C1387f fVar) {
        fVar.e.o(this.f14903V.f());
    }

    public final q b() {
        return q.TYPE_TYPE_ID_ITEM;
    }

    public final int c() {
        return 4;
    }

    public final void d(C1387f fVar, C1627b bVar) {
        t f8 = this.f14903V.f();
        int l8 = fVar.e.l(f8);
        if (bVar.d()) {
            bVar.b(0, f() + ' ' + f8.a());
            bVar.b(4, "  descriptor_idx: ".concat(b.Q(l8)));
        }
        bVar.j(l8);
    }
}
