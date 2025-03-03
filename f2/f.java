package F2;

import D2.D;
import D2.q;
import V0.v;

public final class f extends v {

    /* renamed from: d  reason: collision with root package name */
    public q f1522d;

    public final int d(Object obj) {
        D d8 = (D) obj;
        if (d8 == null) {
            return 1;
        }
        return d8.c();
    }

    public final void e(Object obj, Object obj2) {
        B2.f fVar = (B2.f) obj;
        D d8 = (D) obj2;
        q qVar = this.f1522d;
        if (qVar != null && d8 != null) {
            qVar.e.j(d8, true);
        }
    }

    public final void i(int i) {
        long j7;
        if (i >= 40) {
            h(0);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j7 = this.f5606a;
            }
            h(j7 / 2);
        }
    }
}
