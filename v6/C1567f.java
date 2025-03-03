package v6;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l6.d;
import l6.e;
import m6.a;
import m6.b;
import o6.C1326b;

/* renamed from: v6.f  reason: case insensitive filesystem */
public final class C1567f extends e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final a f16105U;

    /* renamed from: V  reason: collision with root package name */
    public final C1566e f16106V;

    /* renamed from: W  reason: collision with root package name */
    public final C1568g f16107W;

    /* renamed from: X  reason: collision with root package name */
    public final AtomicBoolean f16108X = new AtomicBoolean();

    public C1567f(C1566e eVar) {
        C1568g gVar;
        C1568g gVar2;
        this.f16106V = eVar;
        this.f16105U = new a(0);
        if (eVar.f16101W.f13386V) {
            gVar = C1569h.f16113f;
        } else {
            while (true) {
                if (eVar.f16100V.isEmpty()) {
                    gVar2 = new C1568g(eVar.f16104Z);
                    eVar.f16101W.a(gVar2);
                    break;
                }
                gVar2 = (C1568g) eVar.f16100V.poll();
                if (gVar2 != null) {
                    break;
                }
            }
            gVar = gVar2;
        }
        this.f16107W = gVar;
    }

    public final b a(d dVar, TimeUnit timeUnit) {
        if (this.f16105U.f13386V) {
            return C1326b.f14277U;
        }
        return this.f16107W.b(dVar, timeUnit, this.f16105U);
    }

    public final void d() {
        if (this.f16108X.compareAndSet(false, true)) {
            this.f16105U.d();
            boolean z = C1569h.f16114g;
            C1568g gVar = this.f16107W;
            if (z) {
                gVar.b(this, TimeUnit.NANOSECONDS, (a) null);
                return;
            }
            C1566e eVar = this.f16106V;
            eVar.getClass();
            gVar.f16109W = System.nanoTime() + eVar.f16099U;
            eVar.f16100V.offer(gVar);
        }
    }

    public final void run() {
        C1566e eVar = this.f16106V;
        eVar.getClass();
        long nanoTime = System.nanoTime() + eVar.f16099U;
        C1568g gVar = this.f16107W;
        gVar.f16109W = nanoTime;
        eVar.f16100V.offer(gVar);
    }
}
