package de.ozerov.fully;

/* renamed from: de.ozerov.fully.s3  reason: case insensitive filesystem */
public final /* synthetic */ class C0773s3 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10951U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0779t3 f10952V;

    public /* synthetic */ C0773s3(C0779t3 t3Var, int i) {
        this.f10951U = i;
        this.f10952V = t3Var;
    }

    public final void run() {
        switch (this.f10951U) {
            case 0:
                C0803x3 x3Var = this.f10952V.f10974U0;
                if (x3Var != null) {
                    synchronized (x3Var) {
                        try {
                            if (x3Var.f11082h != null && x3Var.f11094u && !x3Var.f11093t) {
                                x3Var.f11094u = false;
                                if (x3Var.f11082h.a()) {
                                    x3Var.f11079d.q();
                                } else {
                                    C0740n nVar = x3Var.e;
                                    if (nVar.k()) {
                                        nVar.n();
                                    } else if (nVar.j()) {
                                        nVar.n();
                                    }
                                }
                                if (x3Var.f11082h.a()) {
                                    x3Var.j();
                                }
                                int i = x3Var.f11082h.f10216b;
                                if (i == 1 || i == 2 || i == 3) {
                                    x3Var.h();
                                    x3Var.i();
                                }
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    return;
                }
                return;
            case 1:
                this.f10952V.f10971R0.C();
                return;
            case 2:
                this.f10952V.f10971R0.C();
                return;
            case 3:
                this.f10952V.f10971R0.C();
                return;
            case 4:
                C0779t3 t3Var = this.f10952V;
                if (t3Var.f10971R0.w()) {
                    t3Var.f10970Q0.animate().alpha(1.0f).setDuration(500);
                    t3Var.f10969P0.animate().alpha(1.0f).setDuration(1000);
                    return;
                }
                return;
            case 5:
                C0779t3 t3Var2 = this.f10952V;
                t3Var2.f10974U0.f11091r = t3Var2.f10973T0.P();
                C0803x3 x3Var2 = t3Var2.f10974U0;
                x3Var2.f11090q = true;
                x3Var2.f11095v = new C0773s3(t3Var2, 6);
                x3Var2.f();
                return;
            default:
                this.f10952V.f10971R0.C();
                return;
        }
    }
}
