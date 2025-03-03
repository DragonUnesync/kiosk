package S5;

import e6.L;
import e6.U;
import g6.B;
import java.nio.ByteOrder;

public class z0 extends X0 {
    final U leak;
    private final C0185n trackedByteBuf;

    public z0(C0185n nVar, C0185n nVar2, U u3) {
        super(nVar);
        this.trackedByteBuf = (C0185n) B.checkNotNull(nVar2, "trackedByteBuf");
        this.leak = (U) B.checkNotNull(u3, "leak");
    }

    private void closeLeak() {
        ((L) this.leak).close(this.trackedByteBuf);
    }

    private z0 newLeakAwareByteBuf(C0185n nVar, U u3) {
        return newLeakAwareByteBuf(nVar, nVar, u3);
    }

    private z0 newSharedLeakAwareByteBuf(C0185n nVar) {
        return newLeakAwareByteBuf(nVar, this.trackedByteBuf, this.leak);
    }

    private static C0185n unwrapSwapped(C0185n nVar) {
        if (nVar instanceof C0) {
            do {
                nVar = nVar.unwrap();
            } while (nVar instanceof C0);
        }
        return nVar;
    }

    private C0185n unwrappedDerived(C0185n nVar) {
        C0185n unwrapSwapped = unwrapSwapped(nVar);
        if (!(unwrapSwapped instanceof C0171g)) {
            return newSharedLeakAwareByteBuf(nVar);
        }
        ((C0171g) unwrapSwapped).parent(this);
        return newLeakAwareByteBuf(nVar, C0159a.leakDetector.trackForcibly(nVar));
    }

    public C0185n asReadOnly() {
        return newSharedLeakAwareByteBuf(super.asReadOnly());
    }

    public C0185n duplicate() {
        return newSharedLeakAwareByteBuf(super.duplicate());
    }

    public C0185n order(ByteOrder byteOrder) {
        if (order() == byteOrder) {
            return this;
        }
        return newSharedLeakAwareByteBuf(super.order(byteOrder));
    }

    public C0185n readRetainedSlice(int i) {
        return unwrappedDerived(super.readRetainedSlice(i));
    }

    public C0185n readSlice(int i) {
        return newSharedLeakAwareByteBuf(super.readSlice(i));
    }

    public boolean release() {
        if (!super.release()) {
            return false;
        }
        closeLeak();
        return true;
    }

    public C0185n retainedDuplicate() {
        return unwrappedDerived(super.retainedDuplicate());
    }

    public C0185n retainedSlice() {
        return unwrappedDerived(super.retainedSlice());
    }

    public C0185n slice() {
        return newSharedLeakAwareByteBuf(super.slice());
    }

    public z0 newLeakAwareByteBuf(C0185n nVar, C0185n nVar2, U u3) {
        return new z0(nVar, nVar2, u3);
    }

    public C0185n slice(int i, int i8) {
        return newSharedLeakAwareByteBuf(super.slice(i, i8));
    }

    public C0185n touch(Object obj) {
        return this;
    }

    public z0(C0185n nVar, U u3) {
        this(nVar, nVar, u3);
    }
}
