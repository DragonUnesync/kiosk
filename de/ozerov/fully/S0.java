package de.ozerov.fully;

public final /* synthetic */ class S0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10324U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ U0 f10325V;

    public /* synthetic */ S0(U0 u02, int i) {
        this.f10324U = i;
        this.f10325V = u02;
    }

    public final void run() {
        U0 u02 = this.f10325V;
        switch (this.f10324U) {
            case 0:
                u02.getClass();
                C0723k0 k0Var = new C0723k0();
                k0Var.f10766b = "reboot recovery";
                k0Var.execute(new Void[0]);
                return;
            case 1:
                u02.f10414a.f9917F0.a();
                return;
            case 2:
                u02.f10416c.clearCache(true);
                return;
            case 3:
                u02.f10414a.f9942e1.b();
                return;
            case 4:
                u02.f10414a.f9952o1.b();
                return;
            case 5:
                u02.f10414a.f9952o1.b();
                return;
            case 6:
                u02.f10416c.clearHistory();
                return;
            case 7:
                u02.f10416c.clearFormData();
                return;
            default:
                u02.f10414a.f9943f1.e();
                return;
        }
    }
}
