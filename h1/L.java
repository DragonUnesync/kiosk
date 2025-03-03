package h1;

public final /* synthetic */ class L implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12314U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Q f12315V;

    public /* synthetic */ L(Q q7, int i) {
        this.f12314U = i;
        this.f12315V = q7;
    }

    public final void run() {
        switch (this.f12314U) {
            case 0:
                this.f12315V.f12339C0 = true;
                return;
            case 1:
                this.f12315V.y();
                return;
            default:
                Q q7 = this.f12315V;
                if (!q7.f12345I0) {
                    C1058y yVar = q7.f12363l0;
                    yVar.getClass();
                    yVar.f0(q7);
                    return;
                }
                return;
        }
    }
}
