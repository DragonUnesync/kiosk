package e2;

import android.animation.ValueAnimator;

/* renamed from: e2.b  reason: case insensitive filesystem */
public final class C0829b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0831d f11165a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0832e f11166b;

    public C0829b(C0832e eVar, C0831d dVar) {
        this.f11166b = eVar;
        this.f11165a = dVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C0832e eVar = this.f11166b;
        eVar.getClass();
        C0831d dVar = this.f11165a;
        C0832e.d(floatValue, dVar);
        eVar.a(floatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
