package U7;

import R7.h;
import S7.k;
import java.util.ArrayList;

public final class u extends p {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5467a;

    /* renamed from: b  reason: collision with root package name */
    public int f5468b = 2;

    public u(p pVar) {
        ArrayList arrayList = new ArrayList();
        this.f5467a = arrayList;
        arrayList.add(pVar);
        this.f5468b = pVar.a() + this.f5468b;
    }

    public final int a() {
        return this.f5468b;
    }

    public final boolean b(k kVar, k kVar2) {
        if (kVar2 == kVar) {
            return false;
        }
        ArrayList arrayList = this.f5467a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (kVar2 == null || !((p) arrayList.get(size)).b(kVar, kVar2)) {
                return false;
            }
            kVar2 = (k) kVar2.f4578U;
        }
        return true;
    }

    public final String toString() {
        return h.g(this.f5467a, " > ");
    }
}
