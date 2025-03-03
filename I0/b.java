package I0;

import Q0.g;
import android.view.animation.Interpolator;

public abstract class b implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f2213a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2214b;

    public b(float[] fArr) {
        this.f2213a = fArr;
        this.f2214b = 1.0f / ((float) (fArr.length - 1));
    }

    public final float getInterpolation(float f8) {
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2213a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f8), fArr.length - 2);
        float f9 = this.f2214b;
        float f10 = fArr[min];
        return g.j(fArr[min + 1], f10, (f8 - (((float) min) * f9)) / f9, f10);
    }
}
