package U7;

import S7.k;
import S7.p;

public final class w extends h {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5469d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(p pVar, int i) {
        super(pVar);
        this.f5469d = i;
    }

    public final int a() {
        switch (this.f5469d) {
            case 0:
                return ((p) this.f5446b).a() + 2;
            case 1:
                return ((p) this.f5446b).a() + 2;
            default:
                return ((p) this.f5446b).a() * 2;
        }
    }

    public final boolean b(k kVar, k kVar2) {
        switch (this.f5469d) {
            case 0:
                return ((p) this.f5446b).b(kVar, kVar2);
            case 1:
                return !d(kVar, kVar2);
            default:
                if (kVar == kVar2) {
                    return false;
                }
                p pVar = kVar2.f4578U;
                while (true) {
                    k kVar3 = (k) pVar;
                    if (kVar3 == null) {
                        return false;
                    }
                    if (d(kVar, kVar3)) {
                        return true;
                    }
                    if (kVar3 == kVar) {
                        return false;
                    }
                    pVar = kVar3.f4578U;
                }
        }
    }

    public final String toString() {
        Object obj = this.f5446b;
        switch (this.f5469d) {
            case 0:
                return String.format(":is(%s)", new Object[]{(p) obj});
            case 1:
                return String.format(":not(%s)", new Object[]{(p) obj});
            default:
                return String.format("%s ", new Object[]{(p) obj});
        }
    }
}
