package T5;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import e6.Y;

public abstract class R0 implements n1 {
    /* access modifiers changed from: private */
    public int attemptedBytesRead;
    private L config;
    private final Y defaultMaybeMoreSupplier = new Q0(this);
    /* access modifiers changed from: private */
    public int lastBytesRead;
    private int maxMessagePerRead;
    private final boolean respectMaybeMoreData;
    final /* synthetic */ S0 this$0;
    private int totalBytesRead;
    private int totalMessages;

    public R0(S0 s02) {
        this.this$0 = s02;
        this.respectMaybeMoreData = s02.respectMaybeMoreData;
    }

    public C0185n allocate(C0187o oVar) {
        return ((C0163c) oVar).ioBuffer(((H) this).guess());
    }

    public int attemptedBytesRead() {
        return this.attemptedBytesRead;
    }

    public boolean continueReading() {
        return continueReading(this.defaultMaybeMoreSupplier);
    }

    public final void incMessagesRead(int i) {
        this.totalMessages += i;
    }

    public void lastBytesRead(int i) {
        this.lastBytesRead = i;
        if (i > 0) {
            this.totalBytesRead += i;
        }
    }

    public void reset(L l8) {
        this.config = l8;
        this.maxMessagePerRead = this.this$0.maxMessagesPerRead();
        this.totalBytesRead = 0;
        this.totalMessages = 0;
    }

    public final int totalBytesRead() {
        int i = this.totalBytesRead;
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public void attemptedBytesRead(int i) {
        this.attemptedBytesRead = i;
    }

    public boolean continueReading(Y y8) {
        return ((B0) this.config).isAutoRead() && (!this.respectMaybeMoreData || ((Q0) y8).get()) && this.totalMessages < this.maxMessagePerRead && (this.this$0.ignoreBytesRead || this.totalBytesRead > 0);
    }

    public final int lastBytesRead() {
        return this.lastBytesRead;
    }
}
