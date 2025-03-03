package de.ozerov.fully;

public final /* synthetic */ class W2 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10473U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0803x3 f10474V;

    public /* synthetic */ W2(C0803x3 x3Var, int i) {
        this.f10473U = i;
        this.f10474V = x3Var;
    }

    public final void run() {
        switch (this.f10473U) {
            case 0:
                C0803x3 x3Var = this.f10474V;
                x3Var.f11081g = null;
                x3Var.e.p();
                return;
            case 1:
                C0803x3 x3Var2 = this.f10474V;
                x3Var2.l();
                x3Var2.g();
                return;
            case 2:
                this.f10474V.f();
                return;
            case 3:
                this.f10474V.g();
                return;
            case 4:
                C0803x3 x3Var3 = this.f10474V;
                if (x3Var3.f11090q) {
                    x3Var3.b();
                    return;
                }
                x3Var3.l();
                x3Var3.g();
                return;
            case 5:
                C0803x3 x3Var4 = this.f10474V;
                if (x3Var4.f11090q) {
                    x3Var4.b();
                    return;
                }
                O2 o2 = x3Var4.f11082h;
                if (o2.f10216b == 3 && o2.f10219f) {
                    x3Var4.f11081g = null;
                }
                x3Var4.g();
                return;
            default:
                C0803x3 x3Var5 = this.f10474V;
                x3Var5.h();
                x3Var5.f11088o = true;
                return;
        }
    }
}
