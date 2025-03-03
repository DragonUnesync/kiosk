package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.recyclerview.widget.n  reason: case insensitive filesystem */
public final class C0503n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8450a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505p f8451b;

    public C0503n(C0505p pVar) {
        this.f8451b = pVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f8450a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f8450a) {
            this.f8450a = false;
            return;
        }
        C0505p pVar = this.f8451b;
        if (((Float) pVar.z.getAnimatedValue()).floatValue() == 0.0f) {
            pVar.f8462A = 0;
            pVar.d(0);
            return;
        }
        pVar.f8462A = 2;
        pVar.f8480s.invalidate();
    }
}
