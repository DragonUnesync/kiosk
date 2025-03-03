package C3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: C3.d  reason: case insensitive filesystem */
public final class C0028d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f580a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0029e f581b;

    public /* synthetic */ C0028d(C0029e eVar, int i) {
        this.f580a = i;
        this.f581b = eVar;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.f580a) {
            case 1:
                this.f581b.f641b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f580a) {
            case 0:
                this.f581b.f641b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
