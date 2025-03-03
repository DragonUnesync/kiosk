package k6;

public abstract class b {
    public static int checkGreaterThanOrEqual(int i, int i8, String str) {
        if (i >= i8) {
            return i;
        }
        throw new IllegalArgumentException(str + ": " + i + " (expected: >= " + i8 + ')');
    }

    public static int checkLessThan(int i, int i8, String str) {
        if (i < i8) {
            return i;
        }
        throw new IllegalArgumentException(str + ": " + i + " (expected: < " + i8 + ')');
    }

    public static long checkPositive(long j7, String str) {
        if (j7 > 0) {
            return j7;
        }
        throw new IllegalArgumentException(str + ": " + j7 + " (expected: > 0)");
    }
}
