package S5;

import e6.E;
import g6.C0989w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: S5.g  reason: case insensitive filesystem */
public abstract class C0171g extends C0175i {
    private C0185n parent;
    private final E recyclerHandle;
    private C0159a rootParent;

    public C0171g(C0989w wVar) {
        super(0);
        this.recyclerHandle = (E) wVar;
    }

    public final C0187o alloc() {
        return unwrap().alloc();
    }

    public byte[] array() {
        return unwrap().array();
    }

    public final void deallocate() {
        C0185n nVar = this.parent;
        this.recyclerHandle.unguardedRecycle(this);
        nVar.release();
    }

    public final C0185n duplicate0() {
        ensureAccessible();
        return new C0167e(this, unwrap());
    }

    public boolean hasArray() {
        return unwrap().hasArray();
    }

    public boolean hasMemoryAddress() {
        return unwrap().hasMemoryAddress();
    }

    public final <U extends C0171g> U init(C0159a aVar, C0185n nVar, int i, int i8, int i9) {
        nVar.retain();
        this.parent = nVar;
        this.rootParent = aVar;
        try {
            maxCapacity(i9);
            setIndex0(i, i8);
            resetRefCnt();
            return this;
        } catch (Throwable th) {
            this.rootParent = null;
            this.parent = null;
            nVar.release();
            throw th;
        }
    }

    public final ByteBuffer internalNioBuffer(int i, int i8) {
        return nioBuffer(i, i8);
    }

    public boolean isContiguous() {
        return unwrap().isContiguous();
    }

    public final boolean isDirect() {
        return unwrap().isDirect();
    }

    public boolean isReadOnly() {
        return unwrap().isReadOnly();
    }

    public final int nioBufferCount() {
        return unwrap().nioBufferCount();
    }

    @Deprecated
    public final ByteOrder order() {
        return unwrap().order();
    }

    public final void parent(C0185n nVar) {
        this.parent = nVar;
    }

    public final C0185n retainedSlice() {
        int readerIndex = readerIndex();
        return retainedSlice(readerIndex, writerIndex() - readerIndex);
    }

    public C0185n slice(int i, int i8) {
        ensureAccessible();
        return new C0169f(this, unwrap(), i, i8);
    }

    public final C0159a unwrap() {
        return this.rootParent;
    }
}
