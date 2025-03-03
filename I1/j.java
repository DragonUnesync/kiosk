package i1;

import M0.r;
import R0.h;
import R0.l;

public abstract class j extends C1092e {

    /* renamed from: d0  reason: collision with root package name */
    public final long f12707d0;

    public j(h hVar, l lVar, r rVar, int i, Object obj, long j7, long j8, long j9) {
        super(hVar, lVar, 1, rVar, i, obj, j7, j8);
        rVar.getClass();
        this.f12707d0 = j9;
    }

    public long a() {
        long j7 = this.f12707d0;
        if (j7 != -1) {
            return 1 + j7;
        }
        return -1;
    }

    public abstract boolean b();
}
