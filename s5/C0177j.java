package S5;

import e6.C0851j;
import g6.C0984q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: S5.j  reason: case insensitive filesystem */
public abstract class C0177j extends C0165d {
    private final int adjustment;
    private final C0185n buffer;

    public C0177j(C0185n nVar, int i, int i8) {
        super(i8);
        checkSliceOutOfBounds(i, i8, nVar);
        if (nVar instanceof C0177j) {
            C0177j jVar = (C0177j) nVar;
            this.buffer = jVar.buffer;
            this.adjustment = jVar.adjustment + i;
        } else if (nVar instanceof G) {
            this.buffer = nVar.unwrap();
            this.adjustment = i;
        } else {
            this.buffer = nVar;
            this.adjustment = i;
        }
        initLength(i8);
        writerIndex(i8);
    }

    public static void checkSliceOutOfBounds(int i, int i8, C0185n nVar) {
        if (C0984q.isOutOfBounds(i, i8, nVar.capacity())) {
            throw new IndexOutOfBoundsException(nVar + ".slice(" + i + ", " + i8 + ')');
        }
    }

    public C0187o alloc() {
        return unwrap().alloc();
    }

    public byte[] array() {
        return unwrap().array();
    }

    public int arrayOffset() {
        return idx(unwrap().arrayOffset());
    }

    public C0185n capacity(int i) {
        throw new UnsupportedOperationException("sliced buffer");
    }

    public C0185n duplicate() {
        return unwrap().duplicate().setIndex(idx(readerIndex()), idx(writerIndex()));
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        checkIndex0(i, i8);
        int forEachByte = unwrap().forEachByte(idx(i), i8, jVar);
        int i9 = this.adjustment;
        if (forEachByte >= i9) {
            return forEachByte - i9;
        }
        return -1;
    }

    public byte getByte(int i) {
        checkIndex0(i, 1);
        return unwrap().getByte(idx(i));
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        checkIndex0(i, i9);
        unwrap().getBytes(idx(i), nVar, i8, i9);
        return this;
    }

    public int getInt(int i) {
        checkIndex0(i, 4);
        return unwrap().getInt(idx(i));
    }

    public int getIntLE(int i) {
        checkIndex0(i, 4);
        return unwrap().getIntLE(idx(i));
    }

    public long getLong(int i) {
        checkIndex0(i, 8);
        return unwrap().getLong(idx(i));
    }

    public long getLongLE(int i) {
        checkIndex0(i, 8);
        return unwrap().getLongLE(idx(i));
    }

    public short getShort(int i) {
        checkIndex0(i, 2);
        return unwrap().getShort(idx(i));
    }

    public short getShortLE(int i) {
        checkIndex0(i, 2);
        return unwrap().getShortLE(idx(i));
    }

    public int getUnsignedMedium(int i) {
        checkIndex0(i, 3);
        return unwrap().getUnsignedMedium(idx(i));
    }

    public boolean hasArray() {
        return unwrap().hasArray();
    }

    public boolean hasMemoryAddress() {
        return unwrap().hasMemoryAddress();
    }

    public final int idx(int i) {
        return i + this.adjustment;
    }

    public void initLength(int i) {
    }

    public boolean isDirect() {
        return unwrap().isDirect();
    }

    public long memoryAddress() {
        return unwrap().memoryAddress() + ((long) this.adjustment);
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        checkIndex0(i, i8);
        return unwrap().nioBuffer(idx(i), i8);
    }

    public int nioBufferCount() {
        return unwrap().nioBufferCount();
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        checkIndex0(i, i8);
        return unwrap().nioBuffers(idx(i), i8);
    }

    @Deprecated
    public ByteOrder order() {
        return unwrap().order();
    }

    public C0185n setByte(int i, int i8) {
        checkIndex0(i, 1);
        unwrap().setByte(idx(i), i8);
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        checkIndex0(i, i9);
        unwrap().setBytes(idx(i), bArr, i8, i9);
        return this;
    }

    public C0185n setInt(int i, int i8) {
        checkIndex0(i, 4);
        unwrap().setInt(idx(i), i8);
        return this;
    }

    public C0185n setLong(int i, long j7) {
        checkIndex0(i, 8);
        unwrap().setLong(idx(i), j7);
        return this;
    }

    public C0185n setMedium(int i, int i8) {
        checkIndex0(i, 3);
        unwrap().setMedium(idx(i), i8);
        return this;
    }

    public C0185n setShort(int i, int i8) {
        checkIndex0(i, 2);
        unwrap().setShort(idx(i), i8);
        return this;
    }

    public C0185n slice(int i, int i8) {
        checkIndex0(i, i8);
        return unwrap().slice(idx(i), i8);
    }

    public C0185n unwrap() {
        return this.buffer;
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        checkIndex0(i, i9);
        unwrap().getBytes(idx(i), bArr, i8, i9);
        return this;
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        checkIndex0(i, i9);
        unwrap().setBytes(idx(i), nVar, i8, i9);
        return this;
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        checkIndex0(i, byteBuffer.remaining());
        unwrap().getBytes(idx(i), byteBuffer);
        return this;
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        checkIndex0(i, byteBuffer.remaining());
        unwrap().setBytes(idx(i), byteBuffer);
        return this;
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        checkIndex0(i, i8);
        return unwrap().getBytes(idx(i), gatheringByteChannel, i8);
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        checkIndex0(i, i8);
        return unwrap().setBytes(idx(i), scatteringByteChannel, i8);
    }
}
