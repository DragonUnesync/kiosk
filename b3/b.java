package B3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f391a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f392b;

    public /* synthetic */ b(k kVar, int i) {
        this.f391a = i;
        this.f392b = kVar;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f391a) {
            case 0:
                this.f392b.b();
                return;
            case 1:
                this.f392b.c();
                return;
            case 2:
                this.f392b.b();
                return;
            default:
                this.f392b.c();
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f391a) {
            case 1:
                k kVar = this.f392b;
                SnackbarContentLayout snackbarContentLayout = kVar.f425j;
                int i = kVar.f420c;
                int i8 = kVar.f418a;
                int i9 = i - i8;
                snackbarContentLayout.f9390U.setAlpha(0.0f);
                long j7 = (long) i8;
                ViewPropertyAnimator duration = snackbarContentLayout.f9390U.animate().alpha(1.0f).setDuration(j7);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f9392W;
                long j8 = (long) i9;
                duration.setInterpolator(timeInterpolator).setStartDelay(j8).start();
                if (snackbarContentLayout.f9391V.getVisibility() == 0) {
                    snackbarContentLayout.f9391V.setAlpha(0.0f);
                    snackbarContentLayout.f9391V.animate().alpha(1.0f).setDuration(j7).setInterpolator(timeInterpolator).setStartDelay(j8).start();
                    return;
                }
                return;
            case 2:
                k kVar2 = this.f392b;
                SnackbarContentLayout snackbarContentLayout2 = kVar2.f425j;
                snackbarContentLayout2.f9390U.setAlpha(1.0f);
                ViewPropertyAnimator alpha = snackbarContentLayout2.f9390U.animate().alpha(0.0f);
                long j9 = (long) kVar2.f419b;
                ViewPropertyAnimator duration2 = alpha.setDuration(j9);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f9392W;
                long j10 = (long) 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j10).start();
                if (snackbarContentLayout2.f9391V.getVisibility() == 0) {
                    snackbarContentLayout2.f9391V.setAlpha(1.0f);
                    snackbarContentLayout2.f9391V.animate().alpha(0.0f).setDuration(j9).setInterpolator(timeInterpolator2).setStartDelay(j10).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ b(k kVar, int i, int i8) {
        this.f391a = i8;
        this.f392b = kVar;
    }
}
