package g6;

import O7.b;

/* renamed from: g6.q  reason: case insensitive filesystem */
public abstract class C0984q {
    public static int findNextPositivePowerOfTwo(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public static boolean isOutOfBounds(int i, int i8, int i9) {
        int i10 = i + i8;
        if ((i | i8 | i9 | i10 | (i9 - i10)) < 0) {
            return true;
        }
        return false;
    }

    public static int safeFindNextPositivePowerOfTwo(int i) {
        if (i <= 0) {
            return 1;
        }
        if (i >= 1073741824) {
            return b.MAX_POW2;
        }
        return findNextPositivePowerOfTwo(i);
    }
}
