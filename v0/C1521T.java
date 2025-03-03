package v0;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: v0.T  reason: case insensitive filesystem */
public final class C1521T extends C1522U {
    public final WindowInsetsAnimation e;

    public C1521T(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.e = windowInsetsAnimation;
    }

    public final long a() {
        return this.e.getDurationMillis();
    }

    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    public final int c() {
        return this.e.getTypeMask();
    }

    public final void d(float f8) {
        this.e.setFraction(f8);
    }
}
