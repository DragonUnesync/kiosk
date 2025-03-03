package U;

import B.Q;
import F.h;
import android.animation.ValueAnimator;

public final class n implements Q {

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f5292a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f5293b;

    public n(o oVar) {
        this.f5293b = oVar;
    }

    public final void clear() {
        h.j("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
        ValueAnimator valueAnimator = this.f5292a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5292a = null;
        }
        o oVar = this.f5293b;
        oVar.setAlpha(0.0f);
        oVar.setBrightness(0.0f);
    }
}
