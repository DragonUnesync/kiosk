package u;

import B.C0005f;
import D.A0;
import D.C0;
import D.M;
import D.N;
import D7.b;
import F.e;
import F.h;
import G.c;
import a1.C0412c;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: u.n  reason: case insensitive filesystem */
public final class C1473n implements c {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15669U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1449I f15670V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ C1479t f15671W;

    public /* synthetic */ C1473n(C1479t tVar, C1449I i, int i8) {
        this.f15669U = i8;
        this.f15671W = tVar;
        this.f15670V = i;
    }

    private final void a(Throwable th) {
    }

    public final void f(Object obj) {
        switch (this.f15669U) {
            case 0:
                Void voidR = (Void) obj;
                this.f15671W.f15698g0.remove(this.f15670V);
                int h5 = C1477r.h(this.f15671W.f15685B0);
                if (!(h5 == 1 || h5 == 4)) {
                    if (h5 == 5 || (h5 == 6 && this.f15671W.f15696e0 != 0)) {
                        this.f15671W.u("Camera reopen required. Checking if the current camera can be closed safely.", (Throwable) null);
                    } else {
                        return;
                    }
                }
                if (this.f15671W.f15698g0.isEmpty()) {
                    C1479t tVar = this.f15671W;
                    if (tVar.f15695d0 != null) {
                        tVar.u("closing camera", (Throwable) null);
                        this.f15671W.f15695d0.close();
                        this.f15671W.f15695d0 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                Void voidR2 = (Void) obj;
                C1479t tVar2 = this.f15671W;
                if (tVar2.f15701j0.f2580U == 2 && tVar2.f15685B0 == 9) {
                    this.f15671W.F(10);
                    return;
                }
                return;
        }
    }

    public final void z(Throwable th) {
        switch (this.f15669U) {
            case 0:
                return;
            default:
                C0 c02 = null;
                if (th instanceof M) {
                    C1479t tVar = this.f15671W;
                    N n4 = ((M) th).f817U;
                    Iterator it = tVar.f15686U.v().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C0 c03 = (C0) it.next();
                            if (c03.b().contains(n4)) {
                                c02 = c03;
                            }
                        }
                    }
                    if (c02 != null) {
                        C1479t tVar2 = this.f15671W;
                        tVar2.getClass();
                        e H8 = b.H();
                        A0 a02 = c02.f751f;
                        if (a02 != null) {
                            tVar2.u("Posting surface closed", new Throwable());
                            H8.execute(new C0412c((Object) a02, 23, (Object) c02));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (th instanceof CancellationException) {
                    this.f15671W.u("Unable to configure camera cancelled", (Throwable) null);
                    return;
                } else {
                    if (this.f15671W.f15685B0 == 9) {
                        this.f15671W.G(9, new C0005f(th, 4), true);
                    }
                    h.m("Camera2CameraImpl", "Unable to configure camera " + this.f15671W, th);
                    C1479t tVar3 = this.f15671W;
                    if (tVar3.f15697f0 == this.f15670V) {
                        tVar3.E();
                        return;
                    }
                    return;
                }
        }
    }
}
