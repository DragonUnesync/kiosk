package p2;

import B.C0003d;
import y2.C1627b;

public abstract class k extends g {
    public final int b() {
        return this.f14462b.f14469d.g();
    }

    public final String g() {
        i iVar = this.f14462b;
        C0003d dVar = iVar.f14469d;
        dVar.getClass();
        String a8 = iVar.a();
        String t8 = dVar.t(this);
        String u3 = dVar.u(this);
        StringBuilder sb = new StringBuilder(100);
        sb.append(a8);
        if (t8.length() != 0) {
            sb.append(' ');
            sb.append(t8);
        }
        if (u3.length() != 0) {
            sb.append(" // ");
            sb.append(u3);
        }
        return sb.toString();
    }

    public final g j(int i) {
        return k(this.f14464d.k(i));
    }

    public final void l(C1627b bVar) {
        this.f14462b.f14469d.R(bVar, this);
    }
}
