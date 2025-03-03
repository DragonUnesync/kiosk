package j6;

import k6.C1162a;
import k6.b;

public abstract class u extends e {
    protected final long maxQueueCapacity;

    public u(int i, int i8) {
        super(i);
        b.checkGreaterThanOrEqual(i8, 4, "maxCapacity");
        b.checkLessThan(C1162a.roundToPowerOfTwo(i), C1162a.roundToPowerOfTwo(i8), "initialCapacity");
        this.maxQueueCapacity = ((long) C1162a.roundToPowerOfTwo(i8)) << 1;
    }
}
