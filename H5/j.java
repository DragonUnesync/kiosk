package H5;

import G5.v;
import android.graphics.Rect;
import android.util.Log;

public final class j extends k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2201a;

    public /* synthetic */ j(int i) {
        this.f2201a = i;
    }

    public final float a(v vVar, v vVar2) {
        int i;
        switch (this.f2201a) {
            case 0:
                if (vVar.f1735U <= 0 || vVar.f1736V <= 0) {
                    return 0.0f;
                }
                v a8 = vVar.a(vVar2);
                float f8 = ((float) a8.f1735U) * 1.0f;
                float f9 = f8 / ((float) vVar.f1735U);
                if (f9 > 1.0f) {
                    f9 = (float) Math.pow((double) (1.0f / f9), 1.1d);
                }
                float f10 = ((((float) a8.f1736V) * 1.0f) / ((float) vVar2.f1736V)) + (f8 / ((float) vVar2.f1735U));
                return ((1.0f / f10) / f10) * f9;
            case 1:
                if (vVar.f1735U <= 0 || vVar.f1736V <= 0) {
                    return 0.0f;
                }
                v b8 = vVar.b(vVar2);
                float f11 = (float) b8.f1735U;
                float f12 = (f11 * 1.0f) / ((float) vVar.f1735U);
                if (f12 > 1.0f) {
                    f12 = (float) Math.pow((double) (1.0f / f12), 1.1d);
                }
                float f13 = ((((float) vVar2.f1736V) * 1.0f) / ((float) b8.f1736V)) * ((((float) vVar2.f1735U) * 1.0f) / f11);
                return (((1.0f / f13) / f13) / f13) * f12;
            default:
                int i8 = vVar.f1735U;
                if (i8 <= 0 || (i = vVar.f1736V) <= 0) {
                    return 0.0f;
                }
                int i9 = vVar2.f1735U;
                float f14 = (((float) i8) * 1.0f) / ((float) i9);
                if (f14 < 1.0f) {
                    f14 = 1.0f / f14;
                }
                float f15 = (float) i;
                float f16 = (float) vVar2.f1736V;
                float f17 = (f15 * 1.0f) / f16;
                if (f17 < 1.0f) {
                    f17 = 1.0f / f17;
                }
                float f18 = (1.0f / f14) / f17;
                float f19 = ((((float) i8) * 1.0f) / f15) / ((((float) i9) * 1.0f) / f16);
                if (f19 < 1.0f) {
                    f19 = 1.0f / f19;
                }
                return (((1.0f / f19) / f19) / f19) * f18;
        }
    }

    public final Rect b(v vVar, v vVar2) {
        switch (this.f2201a) {
            case 0:
                v a8 = vVar.a(vVar2);
                Log.i("j", "Preview: " + vVar + "; Scaled: " + a8 + "; Want: " + vVar2);
                int i = vVar2.f1735U;
                int i8 = a8.f1735U;
                int i9 = (i8 - i) / 2;
                int i10 = vVar2.f1736V;
                int i11 = a8.f1736V;
                int i12 = (i11 - i10) / 2;
                return new Rect(-i9, -i12, i8 - i9, i11 - i12);
            case 1:
                v b8 = vVar.b(vVar2);
                Log.i("j", "Preview: " + vVar + "; Scaled: " + b8 + "; Want: " + vVar2);
                int i13 = vVar2.f1735U;
                int i14 = b8.f1735U;
                int i15 = (i14 - i13) / 2;
                int i16 = vVar2.f1736V;
                int i17 = b8.f1736V;
                int i18 = (i17 - i16) / 2;
                return new Rect(-i15, -i18, i14 - i15, i17 - i18);
            default:
                return new Rect(0, 0, vVar2.f1735U, vVar2.f1736V);
        }
    }
}
