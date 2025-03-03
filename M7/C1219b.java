package m7;

import P6.f;
import l7.t;

/* renamed from: m7.b  reason: case insensitive filesystem */
public abstract class C1219b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f13389a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' <= c8 && c8 < 'G') {
            return c8 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c8);
    }

    public static final int b(t tVar, int i) {
        int i8;
        f.e(tVar, "<this>");
        int i9 = i + 1;
        int length = tVar.f13248Y.length;
        int[] iArr = tVar.f13249Z;
        f.e(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 >= i9) {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i8 - 1;
                } else {
                    i11 = i8 + 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        if (i8 >= 0) {
            return i8;
        }
        return ~i8;
    }
}
