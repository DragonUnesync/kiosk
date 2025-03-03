package T5;

public final class H extends R0 {
    private boolean decreaseNow;
    private int index;
    private final int maxIndex;
    private final int minIndex;
    private int nextReceiveBufferSize = I.SIZE_TABLE[this.index];
    final /* synthetic */ I this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H(I i, int i8, int i9, int i10) {
        super(i);
        this.this$0 = i;
        this.minIndex = i8;
        this.maxIndex = i9;
        this.index = I.getSizeTableIndex(i10);
    }

    private void record(int i) {
        if (i <= I.SIZE_TABLE[Math.max(0, this.index - 1)]) {
            if (this.decreaseNow) {
                this.index = Math.max(this.index - 1, this.minIndex);
                this.nextReceiveBufferSize = I.SIZE_TABLE[this.index];
                this.decreaseNow = false;
                return;
            }
            this.decreaseNow = true;
        } else if (i >= this.nextReceiveBufferSize) {
            this.index = Math.min(this.index + 4, this.maxIndex);
            this.nextReceiveBufferSize = I.SIZE_TABLE[this.index];
            this.decreaseNow = false;
        }
    }

    public int guess() {
        return this.nextReceiveBufferSize;
    }

    public void lastBytesRead(int i) {
        if (i == attemptedBytesRead()) {
            record(i);
        }
        super.lastBytesRead(i);
    }

    public void readComplete() {
        record(totalBytesRead());
    }
}
