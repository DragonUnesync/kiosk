package g6;

import N.e;
import java.util.Map;

public abstract class B {
    public static <T> T[] checkNonEmpty(T[] tArr, String str) {
        if (((Object[]) checkNotNull(tArr, str)).length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(e.y("Param '", str, "' must not be empty"));
    }

    public static String checkNonEmptyAfterTrim(String str, String str2) {
        return checkNonEmpty(((String) checkNotNull(str, str2)).trim(), str2);
    }

    public static <T> T checkNotNull(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    public static <T> T checkNotNullArrayParam(T t8, int i, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new IllegalArgumentException("Array index " + i + " of parameter '" + str + "' must not be null");
    }

    public static <T> T checkNotNullWithIAE(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new IllegalArgumentException(e.y("Param '", str, "' must not be null"));
    }

    public static int checkPositive(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " : " + i + " (expected: > 0)");
    }

    public static int checkPositiveOrZero(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " : " + i + " (expected: >= 0)");
    }

    public static long checkPositive(long j7, String str) {
        if (j7 > 0) {
            return j7;
        }
        throw new IllegalArgumentException(str + " : " + j7 + " (expected: > 0)");
    }

    public static long checkPositiveOrZero(long j7, String str) {
        if (j7 >= 0) {
            return j7;
        }
        throw new IllegalArgumentException(str + " : " + j7 + " (expected: >= 0)");
    }

    public static double checkPositive(double d8, String str) {
        if (d8 > 0.0d) {
            return d8;
        }
        throw new IllegalArgumentException(str + " : " + d8 + " (expected: > 0)");
    }

    public static String checkNonEmpty(String str, String str2) {
        if (!((String) checkNotNull(str, str2)).isEmpty()) {
            return str;
        }
        throw new IllegalArgumentException(e.y("Param '", str2, "' must not be empty"));
    }

    public static <K, V, T extends Map<K, V>> T checkNonEmpty(T t8, String str) {
        if (!((Map) checkNotNull(t8, str)).isEmpty()) {
            return t8;
        }
        throw new IllegalArgumentException(e.y("Param '", str, "' must not be empty"));
    }
}
