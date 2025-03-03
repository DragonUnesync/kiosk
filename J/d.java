package j;

import android.animation.TimeInterpolator;

public final class d implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public int[] f12800a;

    /* renamed from: b  reason: collision with root package name */
    public int f12801b;

    /* renamed from: c  reason: collision with root package name */
    public int f12802c;

    public final float getInterpolation(float f8) {
        float f9;
        int i = (int) ((f8 * ((float) this.f12802c)) + 0.5f);
        int i8 = this.f12801b;
        int[] iArr = this.f12800a;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = iArr[i9];
            if (i < i10) {
                break;
            }
            i -= i10;
            i9++;
        }
        if (i9 < i8) {
            f9 = ((float) i) / ((float) this.f12802c);
        } else {
            f9 = 0.0f;
        }
        return (((float) i9) / ((float) i8)) + f9;
    }
}
