package b6;

import S5.C0187o;

public final class Q extends Q0 {
    public Q(O o2, C0187o oVar, String str, int i, boolean z) {
        super(o2, oVar, str, i, z, false);
    }

    public void finalize() {
        super.finalize();
        F.releaseIfNeeded(this);
    }
}
