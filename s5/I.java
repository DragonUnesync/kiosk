package S5;

public final class I extends X0 {
    /* access modifiers changed from: private */
    public final int endOffset;
    /* access modifiers changed from: private */
    public final int index;
    /* access modifiers changed from: private */
    public final int offset;

    public I(int i, int i8, C0185n nVar) {
        super(nVar);
        this.index = i;
        this.offset = i8;
        this.endOffset = nVar.readableBytes() + i8;
    }
}
