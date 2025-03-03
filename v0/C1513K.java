package v0;

import Z1.c;
import android.animation.ValueAnimator;
import android.view.View;
import h.C1012M;

/* renamed from: v0.K  reason: case insensitive filesystem */
public final /* synthetic */ class C1513K implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f15885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f15886b;

    public /* synthetic */ C1513K(c cVar, View view) {
        this.f15885a = cVar;
        this.f15886b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) ((C1012M) this.f15885a.f6955V).f12137d.getParent()).invalidate();
    }
}
