package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.f  reason: case insensitive filesystem */
public final class C0495f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j0 f8390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8391b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f8392c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8393d;
    public final /* synthetic */ ViewPropertyAnimator e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0499j f8394f;

    public C0495f(C0499j jVar, j0 j0Var, int i, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
        this.f8394f = jVar;
        this.f8390a = j0Var;
        this.f8391b = i;
        this.f8392c = view;
        this.f8393d = i8;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.f8391b;
        View view = this.f8392c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f8393d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.e.setListener((Animator.AnimatorListener) null);
        C0499j jVar = this.f8394f;
        j0 j0Var = this.f8390a;
        jVar.c(j0Var);
        jVar.f8436p.remove(j0Var);
        jVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f8394f.getClass();
    }
}
