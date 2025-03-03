package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.g  reason: case insensitive filesystem */
public final class C0496g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8407a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0497h f8408b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f8409c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f8410d;
    public final /* synthetic */ C0499j e;

    public /* synthetic */ C0496g(C0499j jVar, C0497h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f8407a = i;
        this.e = jVar;
        this.f8408b = hVar;
        this.f8409c = viewPropertyAnimator;
        this.f8410d = view;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f8407a) {
            case 0:
                this.f8409c.setListener((Animator.AnimatorListener) null);
                View view = this.f8410d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0497h hVar = this.f8408b;
                j0 j0Var = hVar.f8411a;
                C0499j jVar = this.e;
                jVar.c(j0Var);
                jVar.f8438r.remove(hVar.f8411a);
                jVar.i();
                return;
            default:
                this.f8409c.setListener((Animator.AnimatorListener) null);
                View view2 = this.f8410d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0497h hVar2 = this.f8408b;
                j0 j0Var2 = hVar2.f8412b;
                C0499j jVar2 = this.e;
                jVar2.c(j0Var2);
                jVar2.f8438r.remove(hVar2.f8412b);
                jVar2.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.f8407a) {
            case 0:
                j0 j0Var = this.f8408b.f8411a;
                this.e.getClass();
                return;
            default:
                j0 j0Var2 = this.f8408b.f8412b;
                this.e.getClass();
                return;
        }
    }
}
