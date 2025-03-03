package Y1;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6534a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f6535b;

    public /* synthetic */ t(w wVar, int i) {
        this.f6534a = i;
        this.f6535b = wVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6534a) {
            case 0:
                w wVar = this.f6535b;
                wVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wVar.f6545b;
                if (view != null) {
                    view.setAlpha(floatValue);
                }
                ViewGroup viewGroup = wVar.f6546c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                ViewGroup viewGroup2 = wVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(floatValue);
                    return;
                }
                return;
            case 1:
                w wVar2 = this.f6535b;
                wVar2.getClass();
                wVar2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                w wVar3 = this.f6535b;
                wVar3.getClass();
                wVar3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                w wVar4 = this.f6535b;
                wVar4.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = wVar4.f6545b;
                if (view2 != null) {
                    view2.setAlpha(floatValue2);
                }
                ViewGroup viewGroup3 = wVar4.f6546c;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(floatValue2);
                }
                ViewGroup viewGroup4 = wVar4.e;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(floatValue2);
                    return;
                }
                return;
        }
    }
}
