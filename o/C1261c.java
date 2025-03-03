package o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: o.c  reason: case insensitive filesystem */
public final class C1261c implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13930U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f13931V;

    public /* synthetic */ C1261c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f13930U = i;
        this.f13931V = actionBarOverlayLayout;
    }

    public final void run() {
        switch (this.f13930U) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13931V;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f7439t0 = actionBarOverlayLayout.f7421a0.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f7440u0);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13931V;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f7439t0 = actionBarOverlayLayout2.f7421a0.animate().translationY((float) (-actionBarOverlayLayout2.f7421a0.getHeight())).setListener(actionBarOverlayLayout2.f7440u0);
                return;
        }
    }
}
