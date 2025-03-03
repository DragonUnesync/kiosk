package S5;

import e6.C0851j;
import g6.C0965A;
import g6.C0989w;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: S5.r0  reason: case insensitive filesystem */
public final class C0193r0 extends C0171g {
    private static final C0965A RECYCLER = C0965A.newPool(new C0192q0());
    int adjustment;

    public /* synthetic */ C0193r0(C0989w wVar, C0192q0 q0Var) {
        this(wVar);
    }

    private int idx(int i) {
        return i + this.adjustment;
    }

    public static C0193r0 newInstance(C0159a aVar, C0185n nVar, int i, int i8) {
        C0177j.checkSliceOutOfBounds(i, i8, aVar);
        return newInstance0(aVar, nVar, i, i8);
    }

    private static C0193r0 newInstance0(C0159a aVar, C0185n nVar, int i, int i8) {
        C0193r0 r0Var = (C0193r0) RECYCLER.get();
        r0Var.init(aVar, nVar, 0, i8, i8);
        r0Var.discardMarks();
        r0Var.adjustment = i;
        return r0Var;
    }

    public byte _getByte(int i) {
        return unwrap()._getByte(idx(i));
    }

    public int _getInt(int i) {
        return unwrap()._getInt(idx(i));
    }

    public int _getIntLE(int i) {
        return unwrap()._getIntLE(idx(i));
    }

    public long _getLong(int i) {
        return unwrap()._getLong(idx(i));
    }

    public long _getLongLE(int i) {
        return unwrap()._getLongLE(idx(i));
    }

    public short _getShort(int i) {
        return unwrap()._getShort(idx(i));
    }

    public short _getShortLE(int i) {
        return unwrap()._getShortLE(idx(i));
    }

    public int _getUnsignedMedium(int i) {
        return unwrap()._getUnsignedMedium(idx(i));
    }

    public void _setByte(int i, int i8) {
        unwrap()._setByte(idx(i), i8);
    }

    public void _setInt(int i, int i8) {
        unwrap()._setInt(idx(i), i8);
    }

    public void _setLong(int i, long j7) {
        unwrap()._setLong(idx(i), j7);
    }

    public void _setMedium(int i, int i8) {
        unwrap()._setMedium(idx(i), i8);
    }

    public void _setShort(int i, int i8) {
        unwrap()._setShort(idx(i), i8);
    }

    public int arrayOffset() {
        return idx(unwrap().arrayOffset());
    }

    public int capacity() {
        return maxCapacity();
    }

    public C0185n duplicate() {
        return duplicate0().setIndex(idx(readerIndex()), idx(writerIndex()));
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        checkIndex0(i, i8);
        int forEachByte = unwrap().forEachByte(idx(i), i8, jVar);
        int i9 = this.adjustment;
        if (forEachByte < i9) {
            return -1;
        }
        return forEachByte - i9;
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

    public long memoryAddress() {
        return unwrap().memoryAddress() + ((long) this.adjustment);
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        checkIndex0(i, i8);
        return unwrap().nioBuffer(idx(i), i8);
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        checkIndex0(i, i8);
        return unwrap().nioBuffers(idx(i), i8);
    }

    public C0185n retainedDuplicate() {
        return C0186n0.newInstance(unwrap(), this, idx(readerIndex()), idx(writerIndex()));
    }

    public C0185n retainedSlice(int i, int i8) {
        checkIndex0(i, i8);
        return newInstance0(unwrap(), this, idx(i), i8);
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
        return super.slice(idx(i), i8);
    }

    private C0193r0(C0989w wVar) {
        super(wVar);
    }

    public C0185n capacity(int i) {
        throw new UnsupportedOperationException("sliced buffer");
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
