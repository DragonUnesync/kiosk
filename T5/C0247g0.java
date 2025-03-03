package T5;

import g6.B;

/* renamed from: T5.g0  reason: case insensitive filesystem */
public final class C0247g0 {
    private final int defaultMaxMessagesPerRead;
    private final boolean hasDisconnect;

    public C0247g0(boolean z) {
        this(z, 1);
    }

    public int defaultMaxMessagesPerRead() {
        return this.defaultMaxMessagesPerRead;
    }

    public boolean hasDisconnect() {
        return this.hasDisconnect;
    }

    public C0247g0(boolean z, int i) {
        B.checkPositive(i, "defaultMaxMessagesPerRead");
        this.hasDisconnect = z;
        this.defaultMaxMessagesPerRead = i;
    }
}
