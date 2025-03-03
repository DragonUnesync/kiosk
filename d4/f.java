package D4;

import V7.a;
import l4.C1175a;
import l4.C1176b;
import l6.b;
import l6.c;

public final class f extends b implements a {

    /* renamed from: X  reason: collision with root package name */
    public static final C1175a f1227X = C1176b.a(f.class);

    /* renamed from: V  reason: collision with root package name */
    public c f1228V;

    /* renamed from: W  reason: collision with root package name */
    public long f1229W;

    public final void c(long j7) {
        synchronized (this) {
            try {
                long j8 = this.f1229W + j7;
                if (j8 < 0) {
                    j8 = Long.MAX_VALUE;
                }
                this.f1229W = j8;
                if (j8 == j7) {
                    notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void cancel() {
        this.f1228V = null;
    }

    public final void d(c cVar) {
        this.f1228V = cVar;
        cVar.e(this);
    }
}
