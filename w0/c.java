package W0;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6035U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ g f6036V;

    public /* synthetic */ c(g gVar, int i) {
        this.f6035U = i;
        this.f6036V = gVar;
    }

    public final void run() {
        switch (this.f6035U) {
            case 0:
                this.f6036V.y();
                return;
            default:
                this.f6036V.x(false);
                return;
        }
    }
}
