package T7;

import Q0.d;

/* 'enum' modifier removed */
/* renamed from: T7.n  reason: case insensitive filesystem */
public final class C0311n extends B {
    public C0311n() {
        super("InFrameset", 19);
    }

    public final boolean d(d dVar, C0287b bVar) {
        if (B.a(dVar)) {
            bVar.C((I) dVar);
        } else if (dVar.k()) {
            bVar.E((J) dVar);
        } else if (dVar.l()) {
            bVar.s(this);
            return false;
        } else if (dVar.o()) {
            N n4 = (N) dVar;
            String str = n4.f5105X;
            str.getClass();
            char c8 = 65535;
            switch (str.hashCode()) {
                case -1644953643:
                    if (str.equals("frameset")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case 3213227:
                    if (str.equals("html")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case 97692013:
                    if (str.equals("frame")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case 1192721831:
                    if (str.equals("noframes")) {
                        c8 = 3;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    bVar.F(n4);
                    break;
                case 1:
                    C0330x xVar = B.f5057a0;
                    bVar.getClass();
                    return xVar.d(n4, bVar);
                case 2:
                    bVar.G(n4);
                    break;
                case 3:
                    C0324u uVar = B.f5054X;
                    bVar.getClass();
                    return uVar.d(n4, bVar);
                default:
                    bVar.s(this);
                    return false;
            }
        } else if (!dVar.n() || !((M) dVar).f5105X.equals("frameset")) {
            if (!dVar.m()) {
                bVar.s(this);
                return false;
            } else if (!bVar.b("html")) {
                bVar.s(this);
            }
        } else if (bVar.b("html")) {
            bVar.s(this);
            return false;
        } else {
            bVar.g();
            if (!bVar.b("frameset")) {
                bVar.f5161l = B.f5071o0;
            }
        }
        return true;
    }
}
