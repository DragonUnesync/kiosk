package C3;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: C3.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0027c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0029e f579b;

    public /* synthetic */ C0027c(C0029e eVar, int i) {
        this.f578a = i;
        this.f579b = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f578a) {
            case 0:
                C0029e eVar = this.f579b;
                eVar.getClass();
                eVar.f643d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                C0029e eVar2 = this.f579b;
                eVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = eVar2.f643d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
        }
    }
}
