package S5;

import g6.B;
import java.nio.ByteOrder;

public final class T0 extends X0 {
    private C0 swappedBuf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T0(C0185n nVar) {
        super(nVar instanceof T0 ? nVar.unwrap() : nVar);
    }

    public C0185n asReadOnly() {
        if (this.buf.isReadOnly()) {
            return this;
        }
        return new T0(this.buf.asReadOnly());
    }

    public C0185n duplicate() {
        return new T0(this.buf.duplicate());
    }

    public C0185n order(ByteOrder byteOrder) {
        if (B.checkNotNull(byteOrder, "endianness") == order()) {
            return this;
        }
        C0 c02 = this.swappedBuf;
        if (c02 != null) {
            return c02;
        }
        C0 c03 = new C0(this);
        this.swappedBuf = c03;
        return c03;
    }

    public C0185n readRetainedSlice(int i) {
        return readSlice(i);
    }

    public C0185n readSlice(int i) {
        return new T0(this.buf.readSlice(i));
    }

    public boolean release() {
        return false;
    }

    public C0185n retain() {
        return this;
    }

    public C0185n retainedDuplicate() {
        return duplicate();
    }

    public C0185n retainedSlice() {
        return slice();
    }

    public C0185n slice() {
        return new T0(this.buf.slice());
    }

    public C0185n slice(int i, int i8) {
        return new T0(this.buf.slice(i, i8));
    }

    public C0185n touch(Object obj) {
        return this;
    }
}
