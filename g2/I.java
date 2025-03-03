package g2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;

public final class I extends AnimatorListenerAdapter implements n {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f11916a;

    /* renamed from: b  reason: collision with root package name */
    public final View f11917b;

    /* renamed from: c  reason: collision with root package name */
    public final View f11918c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11919d = true;
    public final /* synthetic */ C0955h e;

    public I(C0955h hVar, FrameLayout frameLayout, View view, View view2) {
        this.e = hVar;
        this.f11916a = frameLayout;
        this.f11917b = view;
        this.f11918c = view2;
    }

    public final void a(p pVar) {
        throw null;
    }

    public final void b(p pVar) {
        pVar.z(this);
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e(p pVar) {
        if (this.f11919d) {
            h();
        }
    }

    public final void f(p pVar) {
    }

    public final void g(p pVar) {
        pVar.z(this);
    }

    public final void h() {
        this.f11918c.setTag(2131362433, (Object) null);
        this.f11916a.getOverlay().remove(this.f11917b);
        this.f11919d = false;
    }

    public final void onAnimationEnd(Animator animator) {
        h();
    }

    public final void onAnimationPause(Animator animator) {
        this.f11916a.getOverlay().remove(this.f11917b);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.f11917b;
        if (view.getParent() == null) {
            this.f11916a.getOverlay().add(view);
        } else {
            this.e.c();
        }
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f11918c;
            View view2 = this.f11917b;
            view.setTag(2131362433, view2);
            this.f11916a.getOverlay().add(view2);
            this.f11919d = true;
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            h();
        }
    }
}
