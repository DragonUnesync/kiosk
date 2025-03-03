package Z;

import P6.f;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f6765a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f6766b = new Object[0];

    public static final int a(int i, int i8, int[] iArr) {
        f.e(iArr, "array");
        int i9 = i - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else if (i12 <= i8) {
                return i11;
            } else {
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static final int b(long[] jArr, int i, long j7) {
        f.e(jArr, "array");
        int i8 = i - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = (jArr[i10] > j7 ? 1 : (jArr[i10] == j7 ? 0 : -1));
            if (i11 < 0) {
                i9 = i10 + 1;
            } else if (i11 <= 0) {
                return i10;
            } else {
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }
}
