package de.ozerov.fully;

import Z1.c;

/* renamed from: de.ozerov.fully.n0  reason: case insensitive filesystem */
public final /* synthetic */ class C0741n0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10842U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ FullyActivity f10843V;

    public /* synthetic */ C0741n0(FullyActivity fullyActivity, int i) {
        this.f10842U = i;
        this.f10843V = fullyActivity;
    }

    public final void run() {
        switch (this.f10842U) {
            case 0:
                FullyActivity fullyActivity = this.f10843V;
                C0740n nVar = fullyActivity.f9928Q0.f10445c;
                if (nVar != null && !nVar.m() && ((c) fullyActivity.f9961z0.f9767W).n("resumeVideoAudio", true)) {
                    C0740n nVar2 = fullyActivity.f9928Q0.f10445c;
                    if (nVar2.k()) {
                        nVar2.n();
                        return;
                    } else if (nVar2.j()) {
                        nVar2.n();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                FullyActivity fullyActivity2 = this.f10843V;
                int i = FullyActivity.f9908E1;
                if (fullyActivity2.f10980u0 && ((c) fullyActivity2.f9961z0.f9767W).n("forceHideKeyboard", false) && (fullyActivity2.getCurrentFocus() instanceof MyWebView)) {
                    C0794w0.p0(fullyActivity2);
                    return;
                }
                return;
            case 2:
                int i8 = FullyActivity.f9908E1;
                FullyActivity fullyActivity3 = this.f10843V;
                if (fullyActivity3.w()) {
                    fullyActivity3.f9919H0.l();
                    return;
                }
                return;
            case 3:
                int i9 = FullyActivity.f9908E1;
                FullyActivity fullyActivity4 = this.f10843V;
                if (!fullyActivity4.x("exam_manager")) {
                    fullyActivity4.f9951n1.getClass();
                    fullyActivity4.f9949l1.b();
                    return;
                }
                return;
            default:
                this.f10843V.f9952o1.b();
                return;
        }
    }
}
