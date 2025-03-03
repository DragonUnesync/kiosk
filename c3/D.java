package C3;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import z3.f;
import z3.g;

public final class D implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f569a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f570b;

    public /* synthetic */ D(int i, Object obj) {
        this.f569a = i;
        this.f570b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f569a) {
            case 0:
                ((TextInputLayout) this.f570b).f9455p1.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) this.f570b).i;
                if (gVar != null) {
                    f fVar = gVar.f16469U;
                    if (fVar.i != floatValue) {
                        fVar.i = floatValue;
                        gVar.f16473Y = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
