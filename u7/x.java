package U7;

import S7.k;

public final class x extends h {
    public final int a() {
        return ((p) this.f5446b).a() * 3;
    }

    public final boolean b(k kVar, k kVar2) {
        k kVar3;
        if (kVar == kVar2) {
            return false;
        }
        k kVar4 = (k) kVar2.f4578U;
        if (kVar4 != null) {
            kVar3 = kVar4.I();
        } else {
            kVar3 = kVar2;
        }
        while (kVar3 != null && kVar3 != kVar2) {
            if (d(kVar, kVar3)) {
                return true;
            }
            kVar3 = kVar3.J();
        }
        return false;
    }

    public final String toString() {
        return String.format("%s ~ ", new Object[]{(p) this.f5446b});
    }
}
