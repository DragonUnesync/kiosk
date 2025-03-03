package g2;

import android.animation.Animator;
import android.animation.AnimatorSet;

public abstract class l {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j7) {
        ((AnimatorSet) animator).setCurrentPlayTime(j7);
    }
}
