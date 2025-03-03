package S5;

import e6.C0851j;
import g6.C0965A;
import g6.C0989w;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: S5.n0  reason: case insensitive filesystem */
public final class C0186n0 extends C0171g {
    private static final C0965A RECYCLER = C0965A.newPool(new C0184m0());

    public /* synthetic */ C0186n0(C0989w wVar, C0184m0 m0Var) {
        this(wVar);
    }

    public static C0186n0 newInstance(C0159a aVar, C0185n nVar, int i, int i8) {
        C0186n0 n0Var = (C0186n0) RECYCLER.get();
        n0Var.init(aVar, nVar, i, i8, aVar.maxCapacity());
        n0Var.markReaderIndex();
        n0Var.markWriterIndex();
        return n0Var;
    }

    public byte _getByte(int i) {
        return unwrap()._getByte(i);
    }

    public int _getInt(int i) {
        return unwrap()._getInt(i);
    }

    public int _getIntLE(int i) {
        return unwrap()._getIntLE(i);
    }

    public long _getLong(int i) {
        return unwrap()._getLong(i);
    }

    public long _getLongLE(int i) {
        return unwrap()._getLongLE(i);
    }

    public short _getShort(int i) {
        return unwrap()._getShort(i);
    }

    public short _getShortLE(int i) {
        return unwrap()._getShortLE(i);
    }

    public int _getUnsignedMedium(int i) {
        return unwrap()._getUnsignedMedium(i);
    }

    public void _setByte(int i, int i8) {
        unwrap()._setByte(i, i8);
    }

    public void _setInt(int i, int i8) {
        unwrap()._setInt(i, i8);
    }

    public void _setLong(int i, long j7) {
        unwrap()._setLong(i, j7);
    }

    public void _setMedium(int i, int i8) {
        unwrap()._setMedium(i, i8);
    }

    public void _setShort(int i, int i8) {
        unwrap()._setShort(i, i8);
    }

    public int arrayOffset() {
        return unwrap().arrayOffset();
    }

    public int capacity() {
        return unwrap().capacity();
    }

    public C0185n duplicate() {
        return duplicate0().setIndex(readerIndex(), writerIndex());
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        return unwrap().forEachByte(i, i8, jVar);
    }

    public byte getByte(int i) {
        return unwrap().getByte(i);
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        unwrap().getBytes(i, nVar, i8, i9);
        return this;
    }

    public int getInt(int i) {
        return unwrap().getInt(i);
    }

    public int getIntLE(int i) {
        return unwrap().getIntLE(i);
    }

    public long getLong(int i) {
        return unwrap().getLong(i);
    }

    public long getLongLE(int i) {
        return unwrap().getLongLE(i);
    }

    public short getShort(int i) {
        return unwrap().getShort(i);
    }

    public short getShortLE(int i) {
        return unwrap().getShortLE(i);
    }

    public int getUnsignedMedium(int i) {
        return unwrap().getUnsignedMedium(i);
    }

    public long memoryAddress() {
        return unwrap().memoryAddress();
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        return unwrap().nioBuffer(i, i8);
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        return unwrap().nioBuffers(i, i8);
    }

    public C0185n retainedDuplicate() {
        return newInstance(unwrap(), this, readerIndex(), writerIndex());
    }

    public C0185n retainedSlice(int i, int i8) {
        return C0193r0.newInstance(unwrap(), this, i, i8);
    }

    public C0185n setByte(int i, int i8) {
        unwrap().setByte(i, i8);
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        unwrap().setBytes(i, bArr, i8, i9);
        return this;
    }

    public C0185n setInt(int i, int i8) {
        unwrap().setInt(i, i8);
        return this;
    }

    public C0185n setLong(int i, long j7) {
        unwrap().setLong(i, j7);
        return this;
    }

    public C0185n setMedium(int i, int i8) {
        unwrap().setMedium(i, i8);
        return this;
    }

    public C0185n setShort(int i, int i8) {
        unwrap().setShort(i, i8);
        return this;
    }

    private C0186n0(C0989w wVar) {
        super(wVar);
    }

    public C0185n capacity(int i) {
        unwrap().capacity(i);
        return this;
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        unwrap().getBytes(i, bArr, i8, i9);
        return this;
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        unwrap().setBytes(i, nVar, i8, i9);
        return this;
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        unwrap().getBytes(i, byteBuffer);
        return this;
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        unwrap().setBytes(i, byteBuffer);
        return this;
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        return unwrap().getBytes(i, gatheringByteChannel, i8);
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        return unwrap().setBytes(i, scatteringByteChannel, i8);
    }
}
