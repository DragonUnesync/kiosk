package e2;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: e2.a  reason: case insensitive filesystem */
public final class C0828a extends ImageView {

    /* renamed from: U  reason: collision with root package name */
    public Animation.AnimationListener f11163U;

    /* renamed from: V  reason: collision with root package name */
    public int f11164V;

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f11163U;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f11163U;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f11164V = i;
        }
    }
}
