package T5;

import Q0.g;
import g6.B;
import java.util.ArrayList;

public final class I extends S0 {
    @Deprecated
    public static final I DEFAULT = new I();
    /* access modifiers changed from: private */
    public static final int[] SIZE_TABLE;
    private final int initial;
    private final int maxIndex;
    private final int minIndex;

    static {
        int i;
        ArrayList arrayList = new ArrayList();
        int i8 = 16;
        while (true) {
            if (i8 >= 512) {
                break;
            }
            arrayList.add(Integer.valueOf(i8));
            i8 += 16;
        }
        for (i = 512; i > 0; i <<= 1) {
            arrayList.add(Integer.valueOf(i));
        }
        SIZE_TABLE = new int[arrayList.size()];
        int i9 = 0;
        while (true) {
            int[] iArr = SIZE_TABLE;
            if (i9 < iArr.length) {
                iArr[i9] = ((Integer) arrayList.get(i9)).intValue();
                i9++;
            } else {
                return;
            }
        }
    }

    public I() {
        this(64, 2048, 65536);
    }

    /* access modifiers changed from: private */
    public static int getSizeTableIndex(int i) {
        int length = SIZE_TABLE.length - 1;
        int i8 = 0;
        while (length >= i8) {
            if (length == i8) {
                return length;
            }
            int i9 = (i8 + length) >>> 1;
            int[] iArr = SIZE_TABLE;
            int i10 = iArr[i9];
            int i11 = i9 + 1;
            if (i > iArr[i11]) {
                i8 = i11;
            } else if (i < i10) {
                length = i9 - 1;
            } else if (i == i10) {
                return i9;
            } else {
                return i11;
            }
        }
        return i8;
    }

    public n1 newHandle() {
        return new H(this, this.minIndex, this.maxIndex, this.initial);
    }

    public I(int i, int i8, int i9) {
        B.checkPositive(i, "minimum");
        if (i8 < i) {
            throw new IllegalArgumentException(g.m(i8, "initial: "));
        } else if (i9 >= i8) {
            int sizeTableIndex = getSizeTableIndex(i);
            int[] iArr = SIZE_TABLE;
            if (iArr[sizeTableIndex] < i) {
                this.minIndex = sizeTableIndex + 1;
            } else {
                this.minIndex = sizeTableIndex;
            }
            int sizeTableIndex2 = getSizeTableIndex(i9);
            if (iArr[sizeTableIndex2] > i9) {
                this.maxIndex = sizeTableIndex2 - 1;
            } else {
                this.maxIndex = sizeTableIndex2;
            }
            this.initial = i8;
        } else {
            throw new IllegalArgumentException(g.m(i9, "maximum: "));
        }
    }
}
