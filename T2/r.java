package t2;

import Q0.g;
import v2.e;
import y2.C1628c;

public final class r extends C1424f {

    /* renamed from: Y  reason: collision with root package name */
    public final e f15379Y;

    public r(n nVar, p pVar, l lVar, e eVar) {
        super(nVar, pVar, (k) null, lVar);
        int i = nVar.e;
        if (i != 6) {
            throw new IllegalArgumentException(g.m(i, "opcode with invalid branchingness: "));
        } else if (eVar != null) {
            this.f15379Y = eVar;
        } else {
            throw new NullPointerException("catches == null");
        }
    }

    public static String f(e eVar) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("catch");
        int length = ((C1628c) eVar).f16371V.length;
        for (int i = 0; i < length; i++) {
            sb.append(" ");
            sb.append(eVar.b(i).a());
        }
        return sb.toString();
    }

    public final void b(C1423e eVar) {
        eVar.f(this);
    }

    public final e d() {
        return this.f15379Y;
    }

    public final String e() {
        return f(this.f15379Y);
    }
}
