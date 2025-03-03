package de.ozerov.fully;

import Z1.c;

/* renamed from: de.ozerov.fully.f4  reason: case insensitive filesystem */
public final class C0697f4 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10637U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0703g4 f10638V;

    public /* synthetic */ C0697f4(C0703g4 g4Var, int i) {
        this.f10637U = i;
        this.f10638V = g4Var;
    }

    public final void run() {
        switch (this.f10637U) {
            case 0:
                C0740n nVar = this.f10638V.f10649a.f9928Q0.f10445c;
                if ((nVar == null || !nVar.l()) && ((!C0794w0.f11032r || !this.f10638V.f10650b.W().booleanValue()) && ((!C0794w0.d0(this.f10638V.f10649a) || !this.f10638V.f10650b.V().booleanValue()) && (this.f10638V.f10649a.f10980u0 || !((c) this.f10638V.f10650b.f9767W).n("inUseWhileAnotherAppInForeground", false))))) {
                    this.f10638V.f10649a.f9951n1.a();
                }
                this.f10638V.d();
                return;
            default:
                C0703g4 g4Var = this.f10638V;
                if (!g4Var.f10649a.y("preferences")) {
                    C0794w0.A0(g4Var.f10649a, g4Var.f10650b.Z1().booleanValue(), g4Var.f10650b.c2().booleanValue());
                }
                g4Var.f10654g.removeCallbacksAndMessages((Object) null);
                return;
        }
    }
}
