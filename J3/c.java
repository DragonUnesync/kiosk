package J3;

import Q7.g;
import g7.l;
import java.math.RoundingMode;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2502a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d8) {
        if (!l.g(d8) || (d8 != 0.0d && 52 - Long.numberOfTrailingZeros(l.e(d8)) > Math.getExponent(d8))) {
            return false;
        }
        return true;
    }

    public static boolean b(double d8) {
        if (d8 <= 0.0d || !l.g(d8)) {
            return false;
        }
        long e = l.e(d8);
        if ((e & (e - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static int c(double d8, RoundingMode roundingMode) {
        boolean z;
        boolean b8;
        boolean z6 = false;
        if (d8 <= 0.0d || !l.g(d8)) {
            z = false;
        } else {
            z = true;
        }
        g.d("x must be positive and finite", z);
        int exponent = Math.getExponent(d8);
        if (Math.getExponent(d8) < -1022) {
            return c(d8 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (b.f2501a[roundingMode.ordinal()]) {
            case 1:
                if (!b(d8)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
                break;
            case 3:
                z6 = !b(d8);
                break;
            case 4:
                if (exponent < 0) {
                    z6 = true;
                }
                b8 = b(d8);
                break;
            case 5:
                if (exponent >= 0) {
                    z6 = true;
                }
                b8 = b(d8);
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d8) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    z6 = true;
                    break;
                }
                break;
            default:
                throw new AssertionError();
        }
        z6 &= !b8;
        if (z6) {
            return exponent + 1;
        }
        return exponent;
    }
}
