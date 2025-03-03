package C0;

import android.view.animation.Interpolator;

public final class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f507a;

    public /* synthetic */ d(int i) {
        this.f507a = i;
    }

    public final float getInterpolation(float f8) {
        switch (this.f507a) {
            case 0:
                float f9 = f8 - 1.0f;
                return (f9 * f9 * f9 * f9 * f9) + 1.0f;
            case 1:
                float f10 = f8 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            default:
                float f11 = f8 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
