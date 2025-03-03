package de.ozerov.fully;

import U.p;
import android.view.animation.Animation;

/* renamed from: de.ozerov.fully.o2  reason: case insensitive filesystem */
public final class C0749o2 implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10863a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10864b;

    public /* synthetic */ C0749o2(int i, Object obj) {
        this.f10863a = i;
        this.f10864b = obj;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        switch (this.f10863a) {
            case 0:
                int i = MyWebView.f10115C0;
                int i8 = ((MyWebView) this.f10864b).f10117B0;
                ((MyWebView) this.f10864b).f10139t0 = false;
                ((MyWebView) this.f10864b).f10140u0 = true;
                ((MyWebView) this.f10864b).f10122b0.runOnUiThread(new p(24, (Object) this));
                return;
            case 1:
                ((MyWebView) this.f10864b).f10137r0 = false;
                ((MyWebView) this.f10864b).f10138s0 = true;
                return;
            default:
                g5 g5Var = (g5) this.f10864b;
                g5Var.f10662d.setVisibility(8);
                g5Var.f10662d.setDescendantFocusability(393216);
                return;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        int i = this.f10863a;
    }

    public final void onAnimationStart(Animation animation) {
        switch (this.f10863a) {
            case 0:
                ((MyWebView) this.f10864b).f10138s0 = false;
                ((MyWebView) this.f10864b).f10139t0 = true;
                ((MyWebView) this.f10864b).f10140u0 = true;
                return;
            case 1:
                ((MyWebView) this.f10864b).setVisibility(0);
                ((MyWebView) this.f10864b).f10137r0 = true;
                ((MyWebView) this.f10864b).f10138s0 = true;
                ((MyWebView) this.f10864b).f10140u0 = false;
                return;
            default:
                return;
        }
    }
}
