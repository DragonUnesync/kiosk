package D4;

import T5.Z0;
import V4.e;
import java.util.concurrent.atomic.AtomicInteger;
import l6.g;
import m4.C1214b;
import m6.b;

public final class a implements b {

    /* renamed from: U  reason: collision with root package name */
    public final C1214b f1200U;

    /* renamed from: V  reason: collision with root package name */
    public final Z0 f1201V;

    /* renamed from: W  reason: collision with root package name */
    public final AtomicInteger f1202W = new AtomicInteger(0);

    /* renamed from: X  reason: collision with root package name */
    public final g f1203X;

    /* renamed from: Y  reason: collision with root package name */
    public final c f1204Y;

    /* renamed from: Z  reason: collision with root package name */
    public e f1205Z;

    public a(g gVar, C1214b bVar, c cVar) {
        this.f1200U = bVar;
        this.f1201V = bVar.a();
        this.f1203X = gVar;
        this.f1204Y = cVar;
        if (!this.f1202W.compareAndSet(0, 1)) {
            this.f1200U.c();
        }
    }

    public final void a(e eVar) {
        if (this.f1202W.compareAndSet(1, 2)) {
            this.f1200U.c();
            Throwable th = eVar.f5986b;
            g gVar = this.f1203X;
            if (th == null) {
                gVar.f(eVar);
            } else {
                gVar.a(th);
            }
        }
        c cVar = this.f1204Y;
        int i = cVar.f1222i0;
        if (i == 0) {
            cVar.f1221h0.c(1);
            return;
        }
        long j7 = (long) i;
        if (1 > j7) {
            cVar.f1222i0 = 0;
            cVar.f1221h0.c(1 - j7);
            return;
        }
        cVar.f1222i0 = (int) (j7 - 1);
    }

    public final void b(e eVar) {
        if (eVar.a()) {
            a(eVar);
        } else {
            this.f1205Z = eVar;
        }
    }

    public final void d() {
        if (this.f1202W.getAndSet(3) == 1) {
            this.f1200U.c();
        }
    }
}
