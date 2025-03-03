package Z0;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6869U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ q f6870V;

    public /* synthetic */ n(q qVar, int i) {
        this.f6869U = i;
        this.f6870V = qVar;
    }

    public final void run() {
        switch (this.f6869U) {
            case 0:
                this.f6870V.D();
                return;
            default:
                q qVar = this.f6870V;
                qVar.f6925w0 = true;
                qVar.D();
                return;
        }
    }
}
