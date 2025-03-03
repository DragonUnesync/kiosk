package B3;

import I0.a;
import android.animation.ValueAnimator;

public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f393a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f394b;

    public /* synthetic */ c(k kVar, int i, byte b8) {
        this.f393a = i;
        this.f394b = kVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k kVar = this.f394b;
        switch (this.f393a) {
            case 0:
                kVar.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.i.setScaleX(floatValue);
                kVar.i.setScaleY(floatValue);
                return;
            case 2:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a aVar = k.f413u;
                kVar.i.setTranslationY((float) intValue);
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a aVar2 = k.f413u;
                kVar.i.setTranslationY((float) intValue2);
                return;
        }
    }

    public c(k kVar, int i) {
        this.f393a = 2;
        this.f394b = kVar;
    }
}
