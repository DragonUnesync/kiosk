package u;

import d4.k;
import de.ozerov.fully.K2;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u.q  reason: case insensitive filesystem */
public final /* synthetic */ class C1476q implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15676U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ k f15677V;

    public /* synthetic */ C1476q(k kVar, int i) {
        this.f15676U = i;
        this.f15677V = kVar;
    }

    public final void run() {
        switch (this.f15676U) {
            case 0:
                k kVar = this.f15677V;
                if (!((AtomicBoolean) kVar.f9767W).getAndSet(true)) {
                    ((C1479t) ((K2) kVar.f9768X).f10051W).f15688W.execute(new C1476q(kVar, 1));
                    return;
                }
                return;
            default:
                k kVar2 = this.f15677V;
                if (((C1479t) ((K2) kVar2.f9768X).f10051W).f15685B0 != 8) {
                    C1479t tVar = (C1479t) ((K2) kVar2.f9768X).f10051W;
                    tVar.u("Camera skip reopen at state: ".concat(C1477r.i(tVar.f15685B0)), (Throwable) null);
                    return;
                }
                ((C1479t) ((K2) kVar2.f9768X).f10051W).u("Camera onError timeout, reopen it.", (Throwable) null);
                ((C1479t) ((K2) kVar2.f9768X).f10051W).F(7);
                ((C1479t) ((K2) kVar2.f9768X).f10051W).f15693b0.b();
                return;
        }
    }
}
