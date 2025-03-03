package S5;

import e6.C0851j;
import g6.B;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public class C0 extends C0185n {
    private final C0185n buf;
    private final ByteOrder order;

    public C0(C0185n nVar) {
        this.buf = (C0185n) B.checkNotNull(nVar, "buf");
        ByteOrder order2 = nVar.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        if (order2 == byteOrder) {
            this.order = ByteOrder.LITTLE_ENDIAN;
        } else {
            this.order = byteOrder;
        }
    }

    public C0187o alloc() {
        return this.buf.alloc();
    }

    public byte[] array() {
        return this.buf.array();
    }

    public int arrayOffset() {
        return this.buf.arrayOffset();
    }

    public C0185n asReadOnly() {
        return D0.unmodifiableBuffer(this);
    }

    public int capacity() {
        return this.buf.capacity();
    }

    public C0185n clear() {
        this.buf.clear();
        return this;
    }

    public C0185n discardSomeReadBytes() {
        this.buf.discardSomeReadBytes();
        return this;
    }

    public C0185n duplicate() {
        return this.buf.duplicate().order(this.order);
    }

    public C0185n ensureWritable(int i) {
        this.buf.ensureWritable(i);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0185n) {
            return C0206y.equals(this, (C0185n) obj);
        }
        return false;
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        return this.buf.forEachByte(i, i8, jVar);
    }

    public byte getByte(int i) {
        return this.buf.getByte(i);
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        this.buf.getBytes(i, nVar, i8, i9);
        return this;
    }

    public int getInt(int i) {
        return C0206y.swapInt(this.buf.getInt(i));
    }

    public int getIntLE(int i) {
        return this.buf.getIntLE(i);
    }

    public long getLong(int i) {
        return C0206y.swapLong(this.buf.getLong(i));
    }

    public long getLongLE(int i) {
        return this.buf.getLongLE(i);
    }

    public int getMedium(int i) {
        return C0206y.swapMedium(this.buf.getMedium(i));
    }

    public short getShort(int i) {
        return C0206y.swapShort(this.buf.getShort(i));
    }

    public short getShortLE(int i) {
        return this.buf.getShortLE(i);
    }

    public short getUnsignedByte(int i) {
        return this.buf.getUnsignedByte(i);
    }

    public long getUnsignedInt(int i) {
        return ((long) getInt(i)) & 4294967295L;
    }

    public long getUnsignedIntLE(int i) {
        return ((long) getIntLE(i)) & 4294967295L;
    }

    public int getUnsignedMedium(int i) {
        return getMedium(i) & 16777215;
    }

    public int getUnsignedShort(int i) {
        return getShort(i) & 65535;
    }

    public boolean hasArray() {
        return this.buf.hasArray();
    }

    public boolean hasMemoryAddress() {
        return this.buf.hasMemoryAddress();
    }

    public int hashCode() {
        return this.buf.hashCode();
    }

    public int indexOf(int i, int i8, byte b8) {
        return this.buf.indexOf(i, i8, b8);
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        return nioBuffer(i, i8);
    }

    public final boolean isAccessible() {
        return this.buf.isAccessible();
    }

    public boolean isContiguous() {
        return this.buf.isContiguous();
    }

    public boolean isDirect() {
        return this.buf.isDirect();
    }

    public boolean isReadOnly() {
        return this.buf.isReadOnly();
    }

    public boolean isReadable() {
        return this.buf.isReadable();
    }

    public boolean isWritable(int i) {
        return this.buf.isWritable(i);
    }

    public int maxCapacity() {
        return this.buf.maxCapacity();
    }

    public int maxFastWritableBytes() {
        return this.buf.maxFastWritableBytes();
    }

    public int maxWritableBytes() {
        return this.buf.maxWritableBytes();
    }

    public long memoryAddress() {
        return this.buf.memoryAddress();
    }

    public ByteBuffer nioBuffer() {
        return this.buf.nioBuffer().order(this.order);
    }

    public int nioBufferCount() {
        return this.buf.nioBufferCount();
    }

    public ByteBuffer[] nioBuffers() {
        ByteBuffer[] nioBuffers = this.buf.nioBuffers();
        for (int i = 0; i < nioBuffers.length; i++) {
            nioBuffers[i] = nioBuffers[i].order(this.order);
        }
        return nioBuffers;
    }

    public ByteOrder order() {
        return this.order;
    }

    public byte readByte() {
        return this.buf.readByte();
    }

    public C0185n readBytes(int i) {
        return this.buf.readBytes(i).order(order());
    }

    public int readInt() {
        return C0206y.swapInt(this.buf.readInt());
    }

    public long readLong() {
        return C0206y.swapLong(this.buf.readLong());
    }

    public C0185n readRetainedSlice(int i) {
        return this.buf.readRetainedSlice(i).order(this.order);
    }

    public short readShort() {
        return C0206y.swapShort(this.buf.readShort());
    }

    public C0185n readSlice(int i) {
        return this.buf.readSlice(i).order(this.order);
    }

    public short readUnsignedByte() {
        return this.buf.readUnsignedByte();
    }

    public long readUnsignedInt() {
        return ((long) readInt()) & 4294967295L;
    }

    public int readUnsignedShort() {
        return readShort() & 65535;
    }

    public int readableBytes() {
        return this.buf.readableBytes();
    }

    public int readerIndex() {
        return this.buf.readerIndex();
    }

    public int refCnt() {
        return this.buf.refCnt();
    }

    public boolean release() {
        return this.buf.release();
    }

    public C0185n retain() {
        this.buf.retain();
        return this;
    }

    public C0185n retainedDuplicate() {
        return this.buf.retainedDuplicate().order(this.order);
    }

    public C0185n retainedSlice() {
        return this.buf.retainedSlice().order(this.order);
    }

    public C0185n setByte(int i, int i8) {
        this.buf.setByte(i, i8);
        return this;
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        this.buf.setBytes(i, nVar, i8, i9);
        return this;
    }

    public int setCharSequence(int i, CharSequence charSequence, Charset charset) {
        return this.buf.setCharSequence(i, charSequence, charset);
    }

    public C0185n setIndex(int i, int i8) {
        this.buf.setIndex(i, i8);
        return this;
    }

    public C0185n setInt(int i, int i8) {
        this.buf.setInt(i, C0206y.swapInt(i8));
        return this;
    }

    public C0185n setLong(int i, long j7) {
        this.buf.setLong(i, C0206y.swapLong(j7));
        return this;
    }

    public C0185n setMedium(int i, int i8) {
        this.buf.setMedium(i, C0206y.swapMedium(i8));
        return this;
    }

    public C0185n setShort(int i, int i8) {
        this.buf.setShort(i, C0206y.swapShort((short) i8));
        return this;
    }

    public C0185n setZero(int i, int i8) {
        this.buf.setZero(i, i8);
        return this;
    }

    public C0185n skipBytes(int i) {
        this.buf.skipBytes(i);
        return this;
    }

    public C0185n slice() {
        return this.buf.slice().order(this.order);
    }

    public String toString(Charset charset) {
        return this.buf.toString(charset);
    }

    public C0185n unwrap() {
        return this.buf;
    }

    public int writableBytes() {
        return this.buf.writableBytes();
    }

    public C0185n writeByte(int i) {
        this.buf.writeByte(i);
        return this;
    }

    public C0185n writeBytes(C0185n nVar) {
        this.buf.writeBytes(nVar);
        return this;
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        return this.buf.writeCharSequence(charSequence, charset);
    }

    public C0185n writeInt(int i) {
        this.buf.writeInt(C0206y.swapInt(i));
        return this;
    }

    public C0185n writeLong(long j7) {
        this.buf.writeLong(C0206y.swapLong(j7));
        return this;
    }

    public C0185n writeMedium(int i) {
        this.buf.writeMedium(C0206y.swapMedium(i));
        return this;
    }

    public C0185n writeShort(int i) {
        this.buf.writeShort(C0206y.swapShort((short) i));
        return this;
    }

    public int writerIndex() {
        return this.buf.writerIndex();
    }

    public C0185n capacity(int i) {
        this.buf.capacity(i);
        return this;
    }

    public int compareTo(C0185n nVar) {
        return C0206y.compare(this, nVar);
    }

    public int ensureWritable(int i, boolean z) {
        return this.buf.ensureWritable(i, z);
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        this.buf.getBytes(i, bArr, i8, i9);
        return this;
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        return this.buf.nioBuffer(i, i8).order(this.order);
    }

    public C0185n order(ByteOrder byteOrder) {
        if (B.checkNotNull(byteOrder, "endianness") == this.order) {
            return this;
        }
        return this.buf;
    }

    public C0185n readBytes(C0185n nVar) {
        this.buf.readBytes(nVar);
        return this;
    }

    public C0185n readerIndex(int i) {
        this.buf.readerIndex(i);
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        this.buf.setBytes(i, bArr, i8, i9);
        return this;
    }

    public C0185n slice(int i, int i8) {
        return this.buf.slice(i, i8).order(this.order);
    }

    public String toString() {
        return "Swapped(" + this.buf + ')';
    }

    public C0185n touch(Object obj) {
        this.buf.touch(obj);
        return this;
    }

    public C0185n writeBytes(C0185n nVar, int i, int i8) {
        this.buf.writeBytes(nVar, i, i8);
        return this;
    }

    public C0185n writerIndex(int i) {
        this.buf.writerIndex(i);
        return this;
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        this.buf.getBytes(i, byteBuffer);
        return this;
    }

    public C0185n readBytes(byte[] bArr) {
        this.buf.readBytes(bArr);
        return this;
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        this.buf.setBytes(i, byteBuffer);
        return this;
    }

    public C0185n writeBytes(byte[] bArr) {
        this.buf.writeBytes(bArr);
        return this;
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        return this.buf.getBytes(i, gatheringByteChannel, i8);
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        ByteBuffer[] nioBuffers = this.buf.nioBuffers(i, i8);
        for (int i9 = 0; i9 < nioBuffers.length; i9++) {
            nioBuffers[i9] = nioBuffers[i9].order(this.order);
        }
        return nioBuffers;
    }

    public C0185n readBytes(ByteBuffer byteBuffer) {
        this.buf.readBytes(byteBuffer);
        return this;
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        return this.buf.setBytes(i, scatteringByteChannel, i8);
    }

    public C0185n writeBytes(byte[] bArr, int i, int i8) {
        this.buf.writeBytes(bArr, i, i8);
        return this;
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        return this.buf.readBytes(gatheringByteChannel, i);
    }

    public C0185n writeBytes(ByteBuffer byteBuffer) {
        this.buf.writeBytes(byteBuffer);
        return this;
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i) {
        return this.buf.writeBytes(scatteringByteChannel, i);
    }
}
