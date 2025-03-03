package O7;

import Q0.g;
import u.C1477r;

public final class b {
    public static final int MAX_POW2 = 1073741824;

    public static long align(long j7, int i) {
        if (isPowerOfTwo(i)) {
            int i8 = i - 1;
            return (j7 + ((long) i8)) & ((long) (~i8));
        }
        throw new IllegalArgumentException(g.m(i, "alignment must be a power of 2:"));
    }

    public static boolean isPowerOfTwo(int i) {
        if ((i & (i - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static int roundToPowerOfTwo(int i) {
        if (i > 1073741824) {
            throw new IllegalArgumentException(C1477r.c(i, "There is no larger power of 2 int for value:", " since it exceeds 2^31."));
        } else if (i >= 0) {
            return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        } else {
            throw new IllegalArgumentException(C1477r.c(i, "Given value:", ". Expecting value >= 0."));
        }
    }
}
