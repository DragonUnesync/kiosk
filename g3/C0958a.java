package g3;

import I0.a;
import I0.b;
import Q0.g;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: g3.a  reason: case insensitive filesystem */
public abstract class C0958a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f12005a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final a f12006b = new a(1);

    /* renamed from: c  reason: collision with root package name */
    public static final a f12007c = new a(0);

    /* renamed from: d  reason: collision with root package name */
    public static final a f12008d = new b(a.e);

    /* JADX WARNING: type inference failed for: r0v3, types: [I0.b, I0.a] */
    static {
        new DecelerateInterpolator();
    }

    public static float a(float f8, float f9, float f10) {
        return g.j(f9, f8, f10, f8);
    }

    public static float b(float f8, float f9, float f10, float f11, float f12) {
        if (f12 <= f10) {
            return f8;
        }
        if (f12 >= f11) {
            return f9;
        }
        return a(f8, f9, (f12 - f10) / (f11 - f10));
    }

    public static int c(float f8, int i, int i8) {
        return Math.round(f8 * ((float) (i8 - i))) + i;
    }
}
