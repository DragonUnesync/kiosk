package m0;

import android.graphics.Color;

/* renamed from: m0.a  reason: case insensitive filesystem */
public abstract class C1195a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f13315a = new ThreadLocal();

    public static int a(double d8, double d9, double d10) {
        double d11;
        double d12;
        double d13;
        int i;
        int i8;
        double d14 = ((-0.4986d * d10) + ((-1.5372d * d9) + (3.2406d * d8))) / 100.0d;
        double d15 = ((0.0415d * d10) + ((1.8758d * d9) + (-0.9689d * d8))) / 100.0d;
        double d16 = ((1.057d * d10) + ((-0.204d * d9) + (0.0557d * d8))) / 100.0d;
        if (d14 > 0.0031308d) {
            d11 = (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d11 = d14 * 12.92d;
        }
        if (d15 > 0.0031308d) {
            d12 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d12 = d15 * 12.92d;
        }
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = 12.92d * d16;
        }
        int round = (int) Math.round(d11 * 255.0d);
        int i9 = 0;
        if (round < 0) {
            i = 0;
        } else {
            i = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d12 * 255.0d);
        if (round2 < 0) {
            i8 = 0;
        } else {
            i8 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d13 * 255.0d);
        if (round3 >= 0) {
            i9 = Math.min(round3, 255);
        }
        return Color.rgb(i, i8, i9);
    }

    public static int b(int i, int i8) {
        int alpha = Color.alpha(i8);
        int alpha2 = Color.alpha(i);
        int i9 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i9, c(Color.red(i), alpha2, Color.red(i8), alpha, i9), c(Color.green(i), alpha2, Color.green(i8), alpha, i9), c(Color.blue(i), alpha2, Color.blue(i8), alpha, i9));
    }

    public static int c(int i, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((255 - i8) * (i9 * i10)) + ((i * 255) * i8)) / (i11 * 255);
    }

    public static int d(int i, int i8) {
        if (i8 >= 0 && i8 <= 255) {
            return (i & 16777215) | (i8 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
