package E;

import L.a;
import android.util.Rational;
import android.util.Size;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Rational f1282a = new Rational(4, 3);

    /* renamed from: b  reason: collision with root package name */
    public static final Rational f1283b = new Rational(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static final Rational f1284c = new Rational(16, 9);

    /* renamed from: d  reason: collision with root package name */
    public static final Rational f1285d = new Rational(9, 16);

    public static boolean a(Rational rational, Size size) {
        Size size2 = a.f2674b;
        if (rational == null) {
            return false;
        }
        if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            if (size.getHeight() * size.getWidth() < a.a(size2)) {
                return false;
            }
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i == 0 && height % 16 == 0) {
                if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
                return false;
            } else if (i == 0) {
                return b(height, width, rational);
            } else {
                if (height % 16 == 0) {
                    return b(width, height, rational2);
                }
                return false;
            }
        }
        return true;
    }

    public static boolean b(int i, int i8, Rational rational) {
        boolean z;
        if (i8 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        n2.a.i(z);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        if (numerator <= ((double) Math.max(0, i8 - 16)) || numerator >= ((double) (i8 + 16))) {
            return false;
        }
        return true;
    }
}
