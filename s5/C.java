package S5;

import java.nio.ByteBuffer;

public final class C {
    int adjustment;
    final C0185n buf;
    int endOffset;
    int offset;
    /* access modifiers changed from: private */
    public C0185n slice;
    int srcAdjustment;
    final C0185n srcBuf;

    public C(C0185n nVar, int i, C0185n nVar2, int i8, int i9, int i10, C0185n nVar3) {
        this.srcBuf = nVar;
        this.srcAdjustment = i - i9;
        this.buf = nVar2;
        this.adjustment = i8 - i9;
        this.offset = i9;
        this.endOffset = i9 + i10;
        this.slice = nVar3;
    }

    public void free() {
        this.slice = null;
        this.srcBuf.release();
    }

    public int idx(int i) {
        return i + this.adjustment;
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        return this.srcBuf.internalNioBuffer(srcIdx(i), i8);
    }

    public int length() {
        return this.endOffset - this.offset;
    }

    public void reposition(int i) {
        int i8 = i - this.offset;
        this.endOffset += i8;
        this.srcAdjustment -= i8;
        this.adjustment -= i8;
        this.offset = i;
    }

    public C0185n slice() {
        C0185n nVar = this.slice;
        if (nVar != null) {
            return nVar;
        }
        C0185n slice2 = this.srcBuf.slice(srcIdx(this.offset), length());
        this.slice = slice2;
        return slice2;
    }

    public int srcIdx(int i) {
        return i + this.srcAdjustment;
    }

    public void transferTo(C0185n nVar) {
        nVar.writeBytes(this.buf, idx(this.offset), length());
        free();
    }
}
