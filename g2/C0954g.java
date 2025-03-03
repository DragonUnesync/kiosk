package g2;

import a1.C0410a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: g2.g  reason: case insensitive filesystem */
public final class C0954g extends AnimatorListenerAdapter implements n {

    /* renamed from: a  reason: collision with root package name */
    public final View f11945a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11946b = false;

    public C0954g(View view) {
        this.f11945a = view;
    }

    public final void a(p pVar) {
        throw null;
    }

    public final void b(p pVar) {
        throw null;
    }

    public final void c() {
        float f8;
        View view = this.f11945a;
        if (view.getVisibility() == 0) {
            f8 = z.f12003a.r(view);
        } else {
            f8 = 0.0f;
        }
        view.setTag(2131362594, Float.valueOf(f8));
    }

    public final void d() {
        this.f11945a.setTag(2131362594, (Object) null);
    }

    public final void e(p pVar) {
    }

    public final void f(p pVar) {
    }

    public final void g(p pVar) {
    }

    public final void onAnimationCancel(Animator animator) {
        z.f12003a.w(this.f11945a, 1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.f11945a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f11946b = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z6 = this.f11946b;
        View view = this.f11945a;
        if (z6) {
            view.setLayerType(0, (Paint) null);
        }
        if (!z) {
            C0410a aVar = z.f12003a;
            aVar.w(view, 1.0f);
            aVar.getClass();
        }
    }
}
