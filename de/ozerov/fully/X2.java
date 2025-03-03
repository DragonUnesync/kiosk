package de.ozerov.fully;

public final /* synthetic */ class X2 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10501U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Y2 f10502V;

    public /* synthetic */ X2(Y2 y22, int i) {
        this.f10501U = i;
        this.f10502V = y22;
    }

    public final void run() {
        switch (this.f10501U) {
            case 0:
                this.f10502V.f10513a.f11079d.n("javascript:player.playVideo();", false);
                return;
            default:
                this.f10502V.f10513a.f11079d.n("javascript:player.nextVideo();", false);
                return;
        }
    }
}
