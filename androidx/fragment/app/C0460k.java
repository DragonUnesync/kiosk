package androidx.fragment.app;

import P6.f;
import android.animation.AnimatorSet;

/* renamed from: androidx.fragment.app.k  reason: case insensitive filesystem */
public final class C0460k {

    /* renamed from: a  reason: collision with root package name */
    public static final C0460k f8007a = new Object();

    public final void a(AnimatorSet animatorSet) {
        f.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j7) {
        f.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j7);
    }
}
