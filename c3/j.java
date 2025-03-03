package C3;

import Y1.C0372e;
import android.animation.ValueAnimator;

public final /* synthetic */ class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f592a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f593b;

    public /* synthetic */ j(int i, Object obj) {
        this.f592a = i;
        this.f593b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f592a) {
            case 0:
                n nVar = (n) this.f593b;
                nVar.getClass();
                nVar.f643d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                C0372e eVar = (C0372e) this.f593b;
                eVar.getClass();
                eVar.f6393C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar.invalidate(eVar.f6403U);
                return;
        }
    }
}
