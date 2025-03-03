package v0;

import android.animation.Animator;
import android.view.View;
import g2.C0957j;
import java.lang.ref.WeakReference;

/* renamed from: v0.L  reason: case insensitive filesystem */
public final class C1514L {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f15887a;

    public C1514L(View view) {
        this.f15887a = new WeakReference(view);
    }

    public final void a(float f8) {
        View view = (View) this.f15887a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
    }

    public final void b() {
        View view = (View) this.f15887a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j7) {
        View view = (View) this.f15887a.get();
        if (view != null) {
            view.animate().setDuration(j7);
        }
    }

    public final void d(C1515M m8) {
        View view = (View) this.f15887a.get();
        if (view == null) {
            return;
        }
        if (m8 != null) {
            view.animate().setListener(new C0957j(m8, view, 1));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final void e(float f8) {
        View view = (View) this.f15887a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
    }
}
