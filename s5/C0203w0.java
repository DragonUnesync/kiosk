package S5;

import e6.C0851j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: S5.w0  reason: case insensitive filesystem */
public final class C0203w0 extends C0165d {
    private final C0185n buffer;

    public C0203w0(C0185n nVar) {
        super(nVar.maxCapacity());
        if ((nVar instanceof C0203w0) || (nVar instanceof G)) {
            this.buffer = nVar.unwrap();
        } else {
            this.buffer = nVar;
        }
        setIndex(nVar.readerIndex(), nVar.writerIndex());
    }

    public byte _getByte(int i) {
        return unwrap().getByte(i);
    }

    public int _getInt(int i) {
        return unwrap().getInt(i);
    }

    public int _getIntLE(int i) {
        return unwrap().getIntLE(i);
    }

    public long _getLong(int i) {
        return unwrap().getLong(i);
    }

    public long _getLongLE(int i) {
        return unwrap().getLongLE(i);
    }

    public short _getShort(int i) {
        return unwrap().getShort(i);
    }

    public short _getShortLE(int i) {
        return unwrap().getShortLE(i);
    }

    public int _getUnsignedMedium(int i) {
        return unwrap().getUnsignedMedium(i);
    }

    public void _setByte(int i, int i8) {
        throw new ReadOnlyBufferException();
    }

    public void _setInt(int i, int i8) {
        throw new ReadOnlyBufferException();
    }

    public void _setLong(int i, long j7) {
        throw new ReadOnlyBufferException();
    }

    public void _setMedium(int i, int i8) {
        throw new ReadOnlyBufferException();
    }

    public void _setShort(int i, int i8) {
        throw new ReadOnlyBufferException();
    }

    public C0187o alloc() {
        return unwrap().alloc();
    }

    public byte[] array() {
        throw new ReadOnlyBufferException();
    }

    public int arrayOffset() {
        throw new ReadOnlyBufferException();
    }

    public C0185n asReadOnly() {
        return this;
    }

    public int capacity() {
        return unwrap().capacity();
    }

    public C0185n duplicate() {
        return new C0203w0(this);
    }

    public int ensureWritable(int i, boolean z) {
        return 1;
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        return unwrap().forEachByte(i, i8, jVar);
    }

    public byte getByte(int i) {
        return unwrap().getByte(i);
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        return unwrap().getBytes(i, gatheringByteChannel, i8);
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

    public boolean hasArray() {
        return false;
    }

    public boolean hasMemoryAddress() {
        return unwrap().hasMemoryAddress();
    }

    public boolean isDirect() {
        return unwrap().isDirect();
    }

    public boolean isReadOnly() {
        return true;
    }

    public boolean isWritable(int i) {
        return false;
    }

    public long memoryAddress() {
        return unwrap().memoryAddress();
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        return unwrap().nioBuffer(i, i8).asReadOnlyBuffer();
    }

    public int nioBufferCount() {
        return unwrap().nioBufferCount();
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        return unwrap().nioBuffers(i, i8);
    }

    @Deprecated
    public ByteOrder order() {
        return unwrap().order();
    }

    public C0185n setByte(int i, int i8) {
        throw new ReadOnlyBufferException();
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        throw new ReadOnlyBufferException();
    }

    public C0185n setInt(int i, int i8) {
        throw new ReadOnlyBufferException();
    }

    public C0185n setLong(int i, long j7) {
        throw new ReadOnlyBufferException();
    }

    public C0185n setMedium(int i, int i8) {
        throw new ReadOnlyBufferException();
    }

    public C0185n setShort(int i, int i8) {
        throw new ReadOnlyBufferException();
    }

    public C0185n slice(int i, int i8) {
        return D0.unmodifiableBuffer(unwrap().slice(i, i8));
    }

    public C0185n unwrap() {
        return this.buffer;
    }

    public C0185n capacity(int i) {
        throw new ReadOnlyBufferException();
    }

    public C0185n ensureWritable(int i) {
        throw new ReadOnlyBufferException();
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        unwrap().getBytes(i, bArr, i8, i9);
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        throw new ReadOnlyBufferException();
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        unwrap().getBytes(i, nVar, i8, i9);
        return this;
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        throw new ReadOnlyBufferException();
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        unwrap().getBytes(i, byteBuffer);
        return this;
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        throw new ReadOnlyBufferException();
    }
}
