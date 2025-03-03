package de.ozerov.fully;

/* renamed from: de.ozerov.fully.l0  reason: case insensitive filesystem */
public final /* synthetic */ class C0729l0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10782U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ ForegroundService f10783V;

    public /* synthetic */ C0729l0(ForegroundService foregroundService, int i) {
        this.f10782U = i;
        this.f10783V = foregroundService;
    }

    public final void run() {
        ForegroundService foregroundService = this.f10783V;
        switch (this.f10782U) {
            case 0:
                boolean z = ForegroundService.f9899c0;
                foregroundService.b();
                return;
            default:
                boolean z6 = ForegroundService.f9899c0;
                foregroundService.c();
                return;
        }
    }
}
