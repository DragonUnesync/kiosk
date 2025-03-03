package Y1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

public final class u extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6536a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f6537b;

    public /* synthetic */ u(w wVar, int i) {
        this.f6536a = i;
        this.f6537b = wVar;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.f6536a) {
            case 0:
                w wVar = this.f6537b;
                View view = wVar.f6545b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = wVar.f6546c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = wVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    return;
                }
                return;
            case 2:
                this.f6537b.i(0);
                return;
            case 3:
                this.f6537b.i(0);
                return;
            case 4:
                ViewGroup viewGroup3 = this.f6537b.f6548f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup4 = this.f6537b.f6550h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        int i = 4;
        w wVar = this.f6537b;
        switch (this.f6536a) {
            case 0:
                View view = wVar.f6551j;
                if ((view instanceof C0372e) && !wVar.f6541A) {
                    C0372e eVar = (C0372e) view;
                    ValueAnimator valueAnimator = eVar.f6392B0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(new float[]{eVar.f6393C0, 0.0f});
                    valueAnimator.setDuration(250);
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                View view2 = wVar.f6545b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = wVar.f6546c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = wVar.e;
                if (viewGroup2 != null) {
                    if (wVar.f6541A) {
                        i = 0;
                    }
                    viewGroup2.setVisibility(i);
                }
                View view3 = wVar.f6551j;
                if ((view3 instanceof C0372e) && !wVar.f6541A) {
                    C0372e eVar2 = (C0372e) view3;
                    ValueAnimator valueAnimator2 = eVar2.f6392B0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    eVar2.f6394D0 = false;
                    valueAnimator2.setFloatValues(new float[]{eVar2.f6393C0, 1.0f});
                    valueAnimator2.setDuration(250);
                    valueAnimator2.start();
                    return;
                }
                return;
            case 2:
                wVar.i(4);
                return;
            case 3:
                wVar.i(4);
                return;
            case 4:
                ViewGroup viewGroup3 = wVar.f6550h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    ViewGroup viewGroup4 = wVar.f6550h;
                    viewGroup4.setTranslationX((float) viewGroup4.getWidth());
                    ViewGroup viewGroup5 = wVar.f6550h;
                    viewGroup5.scrollTo(viewGroup5.getWidth(), 0);
                    return;
                }
                return;
            default:
                ViewGroup viewGroup6 = wVar.f6548f;
                if (viewGroup6 != null) {
                    viewGroup6.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
