package H;

import B.Q;
import C6.g;
import F.h;

public final class i implements Q {

    /* renamed from: a  reason: collision with root package name */
    public final Q f1791a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1792b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f1793c;

    public i(Q q7) {
        this.f1791a = q7;
    }

    public final void a() {
        g gVar;
        synchronized (this.f1792b) {
            try {
                if (this.f1793c) {
                    Q q7 = this.f1791a;
                    if (q7 != null) {
                        q7.clear();
                        gVar = g.f721c;
                    } else {
                        gVar = null;
                    }
                    if (gVar == null) {
                        h.l("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    h.I("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f1793c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f1792b) {
        }
    }

    public final void clear() {
        a();
    }
}
