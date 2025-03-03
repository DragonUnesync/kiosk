package T5;

import g6.B;

public abstract class S0 implements e1 {
    /* access modifiers changed from: private */
    public final boolean ignoreBytesRead;
    private volatile int maxMessagesPerRead;
    /* access modifiers changed from: private */
    public volatile boolean respectMaybeMoreData;

    public S0() {
        this(1);
    }

    public int maxMessagesPerRead() {
        return this.maxMessagesPerRead;
    }

    public S0(int i) {
        this(i, false);
    }

    public e1 maxMessagesPerRead(int i) {
        B.checkPositive(i, "maxMessagesPerRead");
        this.maxMessagesPerRead = i;
        return this;
    }

    public S0(int i, boolean z) {
        this.respectMaybeMoreData = true;
        this.ignoreBytesRead = z;
        maxMessagesPerRead(i);
    }
}
