package v0;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: v0.q  reason: case insensitive filesystem */
public final class C1544q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: U  reason: collision with root package name */
    public final View f15960U;

    /* renamed from: V  reason: collision with root package name */
    public ViewTreeObserver f15961V;

    /* renamed from: W  reason: collision with root package name */
    public final Runnable f15962W;

    public C1544q(View view, Runnable runnable) {
        this.f15960U = view;
        this.f15961V = view.getViewTreeObserver();
        this.f15962W = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            C1544q qVar = new C1544q(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(qVar);
            view.addOnAttachStateChangeListener(qVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.f15961V.isAlive();
        View view = this.f15960U;
        if (isAlive) {
            this.f15961V.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f15962W.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f15961V = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f15961V.isAlive();
        View view2 = this.f15960U;
        if (isAlive) {
            this.f15961V.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
