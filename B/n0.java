package B;

public final /* synthetic */ class n0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f286U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ t0 f287V;

    public /* synthetic */ n0(t0 t0Var, int i) {
        this.f286U = i;
        this.f287V = t0Var;
    }

    public final void run() {
        switch (this.f286U) {
            case 0:
                this.f287V.f310f.cancel(true);
                return;
            default:
                this.f287V.c();
                return;
        }
    }
}
