package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.e  reason: case insensitive filesystem */
public final class C0494e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8386a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j0 f8387b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f8388c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f8389d;
    public final /* synthetic */ C0499j e;

    public C0494e(C0499j jVar, j0 j0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = jVar;
        this.f8387b = j0Var;
        this.f8389d = viewPropertyAnimator;
        this.f8388c = view;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.f8386a) {
            case 1:
                this.f8388c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f8386a) {
            case 0:
                this.f8389d.setListener((Animator.AnimatorListener) null);
                this.f8388c.setAlpha(1.0f);
                C0499j jVar = this.e;
                j0 j0Var = this.f8387b;
                jVar.c(j0Var);
                jVar.f8437q.remove(j0Var);
                jVar.i();
                return;
            default:
                this.f8389d.setListener((Animator.AnimatorListener) null);
                C0499j jVar2 = this.e;
                j0 j0Var2 = this.f8387b;
                jVar2.c(j0Var2);
                jVar2.f8435o.remove(j0Var2);
                jVar2.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f8386a) {
            case 0:
                this.e.getClass();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public C0494e(C0499j jVar, j0 j0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = jVar;
        this.f8387b = j0Var;
        this.f8388c = view;
        this.f8389d = viewPropertyAnimator;
    }
}
