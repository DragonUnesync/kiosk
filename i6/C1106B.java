package i6;

import k6.C1162a;
import k6.b;

/* renamed from: i6.B  reason: case insensitive filesystem */
public abstract class C1106B extends C1108b {
    protected final long maxQueueCapacity;

    public C1106B(int i, int i8) {
        super(i);
        b.checkGreaterThanOrEqual(i8, 4, "maxCapacity");
        b.checkLessThan(C1162a.roundToPowerOfTwo(i), C1162a.roundToPowerOfTwo(i8), "initialCapacity");
        this.maxQueueCapacity = ((long) C1162a.roundToPowerOfTwo(i8)) << 1;
    }
}
