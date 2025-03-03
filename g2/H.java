package g2;

import R.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public final class H extends AnimatorListenerAdapter implements n {

    /* renamed from: a  reason: collision with root package name */
    public final View f11911a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11912b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f11913c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11914d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11915f = false;

    public H(View view, int i) {
        this.f11911a = view;
        this.f11912b = i;
        this.f11913c = (ViewGroup) view.getParent();
        this.f11914d = true;
        h(true);
    }

    public final void a(p pVar) {
        throw null;
    }

    public final void b(p pVar) {
        pVar.z(this);
    }

    public final void c() {
        h(false);
        if (!this.f11915f) {
            z.b(this.f11911a, this.f11912b);
        }
    }

    public final void d() {
        h(true);
        if (!this.f11915f) {
            z.b(this.f11911a, 0);
        }
    }

    public final void e(p pVar) {
    }

    public final void f(p pVar) {
    }

    public final void g(p pVar) {
        pVar.z(this);
    }

    public final void h(boolean z) {
        ViewGroup viewGroup;
        if (this.f11914d && this.e != z && (viewGroup = this.f11913c) != null) {
            this.e = z;
            e.u(viewGroup, z);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f11915f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f11915f) {
            z.b(this.f11911a, this.f11912b);
            ViewGroup viewGroup = this.f11913c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            z.b(this.f11911a, 0);
            ViewGroup viewGroup = this.f11913c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.f11915f) {
                z.b(this.f11911a, this.f11912b);
                ViewGroup viewGroup = this.f11913c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }
    }
}
