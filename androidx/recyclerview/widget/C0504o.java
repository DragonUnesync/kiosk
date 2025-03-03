package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.recyclerview.widget.o  reason: case insensitive filesystem */
public final class C0504o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0505p f8458a;

    public C0504o(C0505p pVar) {
        this.f8458a = pVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0505p pVar = this.f8458a;
        pVar.f8466c.setAlpha(floatValue);
        pVar.f8467d.setAlpha(floatValue);
        pVar.f8480s.invalidate();
    }
}
