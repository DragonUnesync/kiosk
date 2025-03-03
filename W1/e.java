package W1;

import P0.r;
import p1.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f6147a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6148b;

    public /* synthetic */ e(long j7, int i, boolean z) {
        this.f6147a = i;
        this.f6148b = j7;
    }

    public static e b(l lVar, r rVar) {
        lVar.r(rVar.f3732a, 0, 8, false);
        rVar.H(0);
        return new e(rVar.m(), rVar.i(), false);
    }

    public boolean a() {
        int i = this.f6147a;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public e(int i, long j7) {
        P0.l.d(j7 >= 0);
        this.f6147a = i;
        this.f6148b = j7;
    }
}
