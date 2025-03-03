package p2;

import t2.l;
import t2.p;

public final class u extends k {
    public final e e;

    public u(i iVar, p pVar, l lVar, e eVar) {
        super(iVar, pVar, lVar);
        if (eVar != null) {
            this.e = eVar;
            return;
        }
        throw new NullPointerException("target == null");
    }

    public final String a() {
        e eVar = this.e;
        if (eVar == null) {
            return "????";
        }
        return eVar.f();
    }

    public final g i(i iVar) {
        return new u(iVar, this.f14463c, this.f14464d, this.e);
    }

    public final g k(l lVar) {
        return new u(this.f14462b, this.f14463c, lVar, this.e);
    }

    public final int m() {
        return this.e.e() - e();
    }

    public final boolean n() {
        if (this.f14461a < 0 || this.e.f14461a < 0) {
            return false;
        }
        return true;
    }

    public final u o(e eVar) {
        i iVar;
        i iVar2 = this.f14462b;
        switch (iVar2.f14466a) {
            case 50:
                iVar = j.f14518Q;
                break;
            case 51:
                iVar = j.f14515P;
                break;
            case 52:
                iVar = j.f14524S;
                break;
            case 53:
                iVar = j.f14521R;
                break;
            case 54:
                iVar = j.f14530U;
                break;
            case 55:
                iVar = j.f14527T;
                break;
            case 56:
                iVar = j.f14536W;
                break;
            case 57:
                iVar = j.f14533V;
                break;
            case 58:
                iVar = j.f14542Y;
                break;
            case 59:
                iVar = j.f14539X;
                break;
            case 60:
                iVar = j.f14549a0;
                break;
            case 61:
                iVar = j.f14545Z;
                break;
            default:
                throw new IllegalArgumentException("bogus opcode: " + iVar2);
        }
        return new u(iVar, this.f14463c, this.f14464d, eVar);
    }
}
