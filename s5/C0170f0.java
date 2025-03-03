package S5;

import e6.E;
import g6.C0989w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: S5.f0  reason: case insensitive filesystem */
public abstract class C0170f0 extends C0175i {
    private C0187o allocator;
    C0168e0 cache;
    protected T chunk;
    protected long handle;
    protected int length;
    int maxLength;
    protected Object memory;
    protected int offset;
    private final E recyclerHandle;
    ByteBuffer tmpNioBuf;

    public C0170f0(C0989w wVar, int i) {
        super(i);
        this.recyclerHandle = (E) wVar;
    }

    private void init0(T t8, ByteBuffer byteBuffer, long j7, int i, int i8, int i9, C0168e0 e0Var) {
        t8.incrementPinnedMemory(i9);
        this.chunk = t8;
        this.memory = t8.memory;
        this.tmpNioBuf = byteBuffer;
        this.allocator = t8.arena.parent;
        this.cache = e0Var;
        this.handle = j7;
        this.offset = i;
        this.length = i8;
        this.maxLength = i9;
    }

    public final ByteBuffer _internalNioBuffer(int i, int i8, boolean z) {
        ByteBuffer byteBuffer;
        int idx = idx(i);
        if (z) {
            byteBuffer = newInternalNioBuffer(this.memory);
        } else {
            byteBuffer = internalNioBuffer();
        }
        byteBuffer.limit(i8 + idx).position(idx);
        return byteBuffer;
    }

    public final C0187o alloc() {
        return this.allocator;
    }

    public final int capacity() {
        return this.length;
    }

    public final void deallocate() {
        long j7 = this.handle;
        if (j7 >= 0) {
            this.handle = -1;
            this.memory = null;
            T t8 = this.chunk;
            t8.arena.free(t8, this.tmpNioBuf, j7, this.maxLength, this.cache);
            this.tmpNioBuf = null;
            this.chunk = null;
            this.cache = null;
            this.recyclerHandle.unguardedRecycle(this);
        }
    }

    public ByteBuffer duplicateInternalNioBuffer(int i, int i8) {
        checkIndex(i, i8);
        return _internalNioBuffer(i, i8, true);
    }

    public final int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        return gatheringByteChannel.write(duplicateInternalNioBuffer(i, i8));
    }

    public final int idx(int i) {
        return this.offset + i;
    }

    public void init(T t8, ByteBuffer byteBuffer, long j7, int i, int i8, int i9, C0168e0 e0Var) {
        init0(t8, byteBuffer, j7, i, i8, i9, e0Var);
    }

    public void initUnpooled(T t8, int i) {
        init0(t8, (ByteBuffer) null, 0, 0, i, i, (C0168e0) null);
    }

    public final ByteBuffer internalNioBuffer() {
        ByteBuffer byteBuffer = this.tmpNioBuf;
        if (byteBuffer == null) {
            ByteBuffer newInternalNioBuffer = newInternalNioBuffer(this.memory);
            this.tmpNioBuf = newInternalNioBuffer;
            return newInternalNioBuffer;
        }
        byteBuffer.clear();
        return byteBuffer;
    }

    public final boolean isContiguous() {
        return true;
    }

    public int maxFastWritableBytes() {
        return Math.min(this.maxLength, maxCapacity()) - this.writerIndex;
    }

    public abstract ByteBuffer newInternalNioBuffer(Object obj);

    public final ByteBuffer nioBuffer(int i, int i8) {
        return duplicateInternalNioBuffer(i, i8).slice();
    }

    public final int nioBufferCount() {
        return 1;
    }

    public final ByteBuffer[] nioBuffers(int i, int i8) {
        return new ByteBuffer[]{nioBuffer(i, i8)};
    }

    public final ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }

    public final int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        checkReadableBytes(i);
        int write = gatheringByteChannel.write(_internalNioBuffer(this.readerIndex, i, false));
        this.readerIndex += write;
        return write;
    }

    public final C0185n retainedDuplicate() {
        return C0186n0.newInstance(this, this, readerIndex(), writerIndex());
    }

    public final C0185n retainedSlice() {
        int readerIndex = readerIndex();
        return retainedSlice(readerIndex, writerIndex() - readerIndex);
    }

    public final void reuse(int i) {
        maxCapacity(i);
        resetRefCnt();
        setIndex0(0, 0);
        discardMarks();
    }

    public final int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        try {
            return scatteringByteChannel.read(internalNioBuffer(i, i8));
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    public final C0185n unwrap() {
        return null;
    }

    public final C0185n capacity(int i) {
        if (i == this.length) {
            ensureAccessible();
            return this;
        }
        checkNewCapacity(i);
        T t8 = this.chunk;
        if (!t8.unpooled) {
            if (i <= this.length) {
                int i8 = this.maxLength;
                if (i > (i8 >>> 1) && (i8 > 512 || i > i8 - 16)) {
                    this.length = i;
                    trimIndicesToCapacity(i);
                    return this;
                }
            } else if (i <= this.maxLength) {
                this.length = i;
                return this;
            }
        }
        t8.arena.reallocate(this, i);
        return this;
    }

    public final C0185n retainedSlice(int i, int i8) {
        return C0193r0.newInstance(this, this, i, i8);
    }

    public final ByteBuffer internalNioBuffer(int i, int i8) {
        checkIndex(i, i8);
        return _internalNioBuffer(i, i8, false);
    }
}
