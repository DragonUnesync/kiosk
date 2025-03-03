package de.ozerov.fully;

public final /* synthetic */ class F2 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9888U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ G2 f9889V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f9890W;

    public /* synthetic */ F2(G2 g22, int i, int i8) {
        this.f9888U = i8;
        this.f9889V = g22;
        this.f9890W = i;
    }

    public final void run() {
        switch (this.f9888U) {
            case 0:
                this.f9889V.a(this.f9890W + 1);
                return;
            default:
                this.f9889V.a(this.f9890W + 1);
                return;
        }
    }
}
