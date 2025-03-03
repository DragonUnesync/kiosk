package U7;

import R7.h;
import S7.k;
import java.util.Arrays;
import java.util.List;

public final class a extends c {
    public a(List list) {
        this.f5436a.addAll(list);
        d();
    }

    public final boolean b(k kVar, k kVar2) {
        for (int i = 0; i < this.f5438c; i++) {
            if (!((p) this.f5437b.get(i)).b(kVar, kVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return h.g(this.f5436a, "");
    }

    public a(p... pVarArr) {
        this(Arrays.asList(pVarArr));
    }
}
