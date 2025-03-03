package T5;

import N.e;
import g6.B;

public final class w1 {
    public static final w1 DEFAULT = new w1(32768, 65536, false);
    private final int high;
    private final int low;

    public w1(int i, int i8, boolean z) {
        if (z) {
            B.checkPositiveOrZero(i, "low");
            if (i8 < i) {
                throw new IllegalArgumentException("write buffer's high water mark cannot be less than  low water mark (" + i + "): " + i8);
            }
        }
        this.low = i;
        this.high = i8;
    }

    public int high() {
        return this.high;
    }

    public int low() {
        return this.low;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("WriteBufferWaterMark(low: ");
        sb.append(this.low);
        sb.append(", high: ");
        return e.z(sb, this.high, ")");
    }
}
