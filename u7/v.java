package U7;

import S7.k;
import S7.p;

public final class v extends h {
    public final int a() {
        return ((p) this.f5446b).a() + 2;
    }

    public final boolean b(k kVar, k kVar2) {
        k kVar3;
        if (kVar == kVar2) {
            return false;
        }
        kVar2.getClass();
        p pVar = kVar2;
        while (true) {
            p w2 = pVar.w();
            if (w2 == null) {
                kVar3 = null;
                break;
            }
            boolean z = w2 instanceof k;
            pVar = w2;
            if (z) {
                kVar3 = (k) w2;
                break;
            }
        }
        if (kVar3 == null || !d(kVar, kVar3)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return String.format("%s + ", new Object[]{(p) this.f5446b});
    }
}
