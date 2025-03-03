package r2;

import android.support.v4.media.session.b;
import v2.C1559b;
import v2.c;
import v2.e;
import y2.C1627b;
import y2.C1628c;

/* renamed from: r2.E  reason: case insensitive filesystem */
public final class C1381E extends x {

    /* renamed from: Y  reason: collision with root package name */
    public final e f14857Y;

    public C1381E(e eVar) {
        super(4, (((C1628c) eVar).f16371V.length * 2) + 4);
        this.f14857Y = eVar;
    }

    public final void a(C1387f fVar) {
        z zVar = fVar.f14887f;
        e eVar = this.f14857Y;
        int length = ((C1628c) eVar).f16371V.length;
        for (int i = 0; i < length; i++) {
            zVar.q(eVar.b(i));
        }
    }

    public final q b() {
        return q.TYPE_TYPE_LIST;
    }

    public final int e(x xVar) {
        e eVar = ((C1381E) xVar).f14857Y;
        C1559b bVar = C1559b.f16011W;
        e eVar2 = this.f14857Y;
        int length = ((C1628c) eVar2).f16371V.length;
        int length2 = ((C1628c) eVar).f16371V.length;
        int min = Math.min(length, length2);
        for (int i = 0; i < min; i++) {
            int compareTo = eVar2.b(i).f16075U.compareTo(eVar.b(i).f16075U);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (length == length2) {
            return 0;
        }
        if (length < length2) {
            return -1;
        }
        return 1;
    }

    public final int hashCode() {
        C1559b bVar = C1559b.f16011W;
        e eVar = this.f14857Y;
        int length = ((C1628c) eVar).f16371V.length;
        int i = 0;
        for (int i8 = 0; i8 < length; i8++) {
            i = (i * 31) + eVar.b(i8).f16075U.hashCode();
        }
        return i;
    }

    public final void k(C1387f fVar, C1627b bVar) {
        z zVar = fVar.f14887f;
        e eVar = this.f14857Y;
        int length = ((C1628c) eVar).f16371V.length;
        if (bVar.d()) {
            bVar.b(0, g() + " type_list");
            bVar.b(4, "  size: ".concat(b.Q(length)));
            for (int i = 0; i < length; i++) {
                c b8 = eVar.b(i);
                int n4 = zVar.n(b8);
                bVar.b(2, "  " + b.P(n4) + " // " + b8.a());
            }
        }
        bVar.j(length);
        for (int i8 = 0; i8 < length; i8++) {
            bVar.k(zVar.n(eVar.b(i8)));
        }
    }
}
