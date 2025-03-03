package S5;

import e6.L;
import e6.U;
import g6.B;
import java.nio.ByteOrder;

public class A0 extends Y0 {
    final U leak;

    public A0(E e, U u3) {
        super(e);
        this.leak = (U) B.checkNotNull(u3, "leak");
    }

    private void closeLeak(C0185n nVar) {
        ((L) this.leak).close(nVar);
    }

    private z0 newLeakAwareByteBuf(C0185n nVar) {
        return newLeakAwareByteBuf(nVar, unwrap(), this.leak);
    }

    public C0185n asReadOnly() {
        return newLeakAwareByteBuf(super.asReadOnly());
    }

    public C0185n duplicate() {
        return newLeakAwareByteBuf(super.duplicate());
    }

    public C0185n order(ByteOrder byteOrder) {
        if (order() == byteOrder) {
            return this;
        }
        return newLeakAwareByteBuf(super.order(byteOrder));
    }

    public C0185n readRetainedSlice(int i) {
        return newLeakAwareByteBuf(super.readRetainedSlice(i));
    }

    public C0185n readSlice(int i) {
        return newLeakAwareByteBuf(super.readSlice(i));
    }

    public boolean release() {
        C0185n unwrap = unwrap();
        if (!super.release()) {
            return false;
        }
        closeLeak(unwrap);
        return true;
    }

    public C0185n retainedDuplicate() {
        return newLeakAwareByteBuf(super.retainedDuplicate());
    }

    public C0185n retainedSlice() {
        return newLeakAwareByteBuf(super.retainedSlice());
    }

    public C0185n slice() {
        return newLeakAwareByteBuf(super.slice());
    }

    public z0 newLeakAwareByteBuf(C0185n nVar, C0185n nVar2, U u3) {
        return new z0(nVar, nVar2, u3);
    }

    public C0185n retainedSlice(int i, int i8) {
        return newLeakAwareByteBuf(super.retainedSlice(i, i8));
    }

    public C0185n slice(int i, int i8) {
        return newLeakAwareByteBuf(super.slice(i, i8));
    }
}
