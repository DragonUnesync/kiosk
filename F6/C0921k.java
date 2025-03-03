package f6;

/* renamed from: f6.k  reason: case insensitive filesystem */
public final class C0921k implements C0931v {
    public static final C0921k INSTANCE = new C0921k();

    private C0921k() {
    }

    private static boolean isPowerOfTwo(int i) {
        if (((-i) & i) == i) {
            return true;
        }
        return false;
    }

    public C0930u newChooser(C0929t[] tVarArr) {
        if (isPowerOfTwo(tVarArr.length)) {
            return new C0920j(tVarArr);
        }
        return new C0919i(tVarArr);
    }
}
