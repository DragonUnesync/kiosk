package S5;

import e6.C0851j;
import g6.B;
import g6.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public abstract class X0 extends C0185n {
    protected final C0185n buf;

    public X0(C0185n nVar) {
        this.buf = (C0185n) B.checkNotNull(nVar, "buf");
    }

    public final C0187o alloc() {
        return this.buf.alloc();
    }

    public byte[] array() {
        return this.buf.array();
    }

    public int arrayOffset() {
        return this.buf.arrayOffset();
    }

    public C0185n asReadOnly() {
        return this.buf.asReadOnly();
    }

    public final int capacity() {
        return this.buf.capacity();
    }

    public final C0185n clear() {
        this.buf.clear();
        return this;
    }

    public C0185n discardSomeReadBytes() {
        this.buf.discardSomeReadBytes();
        return this;
    }

    public C0185n duplicate() {
        return this.buf.duplicate();
    }

    public C0185n ensureWritable(int i) {
        this.buf.ensureWritable(i);
        return this;
    }

    public boolean equals(Object obj) {
        return this.buf.equals(obj);
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
        return this.buf.getInt(i);
    }

    public int getIntLE(int i) {
        return this.buf.getIntLE(i);
    }

    public long getLong(int i) {
        return this.buf.getLong(i);
    }

    public long getLongLE(int i) {
        return this.buf.getLongLE(i);
    }

    public int getMedium(int i) {
        return this.buf.getMedium(i);
    }

    public short getShort(int i) {
        return this.buf.getShort(i);
    }

    public short getShortLE(int i) {
        return this.buf.getShortLE(i);
    }

    public short getUnsignedByte(int i) {
        return this.buf.getUnsignedByte(i);
    }

    public long getUnsignedInt(int i) {
        return this.buf.getUnsignedInt(i);
    }

    public long getUnsignedIntLE(int i) {
        return this.buf.getUnsignedIntLE(i);
    }

    public int getUnsignedMedium(int i) {
        return this.buf.getUnsignedMedium(i);
    }

    public int getUnsignedShort(int i) {
        return this.buf.getUnsignedShort(i);
    }

    public boolean hasArray() {
        return this.buf.hasArray();
    }

    public final boolean hasMemoryAddress() {
        return this.buf.hasMemoryAddress();
    }

    public int hashCode() {
        return this.buf.hashCode();
    }

    public int indexOf(int i, int i8, byte b8) {
        return this.buf.indexOf(i, i8, b8);
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        return this.buf.internalNioBuffer(i, i8);
    }

    public final boolean isAccessible() {
        return this.buf.isAccessible();
    }

    public boolean isContiguous() {
        return this.buf.isContiguous();
    }

    public final boolean isDirect() {
        return this.buf.isDirect();
    }

    public boolean isReadOnly() {
        return this.buf.isReadOnly();
    }

    public final boolean isReadable() {
        return this.buf.isReadable();
    }

    public final boolean isWritable(int i) {
        return this.buf.isWritable(i);
    }

    public final int maxCapacity() {
        return this.buf.maxCapacity();
    }

    public int maxFastWritableBytes() {
        return this.buf.maxFastWritableBytes();
    }

    public final int maxWritableBytes() {
        return this.buf.maxWritableBytes();
    }

    public final long memoryAddress() {
        return this.buf.memoryAddress();
    }

    public ByteBuffer nioBuffer() {
        return this.buf.nioBuffer();
    }

    public int nioBufferCount() {
        return this.buf.nioBufferCount();
    }

    public ByteBuffer[] nioBuffers() {
        return this.buf.nioBuffers();
    }

    public final ByteOrder order() {
        return this.buf.order();
    }

    public byte readByte() {
        return this.buf.readByte();
    }

    public C0185n readBytes(int i) {
        return this.buf.readBytes(i);
    }

    public int readInt() {
        return this.buf.readInt();
    }

    public long readLong() {
        return this.buf.readLong();
    }

    public C0185n readRetainedSlice(int i) {
        return this.buf.readRetainedSlice(i);
    }

    public short readShort() {
        return this.buf.readShort();
    }

    public C0185n readSlice(int i) {
        return this.buf.readSlice(i);
    }

    public short readUnsignedByte() {
        return this.buf.readUnsignedByte();
    }

    public long readUnsignedInt() {
        return this.buf.readUnsignedInt();
    }

    public int readUnsignedShort() {
        return this.buf.readUnsignedShort();
    }

    public final int readableBytes() {
        return this.buf.readableBytes();
    }

    public final int readerIndex() {
        return this.buf.readerIndex();
    }

    public final int refCnt() {
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
        return this.buf.retainedDuplicate();
    }

    public C0185n retainedSlice() {
        return this.buf.retainedSlice();
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
        this.buf.setInt(i, i8);
        return this;
    }

    public C0185n setLong(int i, long j7) {
        this.buf.setLong(i, j7);
        return this;
    }

    public C0185n setMedium(int i, int i8) {
        this.buf.setMedium(i, i8);
        return this;
    }

    public C0185n setShort(int i, int i8) {
        this.buf.setShort(i, i8);
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
        return this.buf.slice();
    }

    public String toString(Charset charset) {
        return this.buf.toString(charset);
    }

    public final C0185n unwrap() {
        return this.buf;
    }

    public final int writableBytes() {
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
        this.buf.writeInt(i);
        return this;
    }

    public C0185n writeLong(long j7) {
        this.buf.writeLong(j7);
        return this;
    }

    public C0185n writeMedium(int i) {
        this.buf.writeMedium(i);
        return this;
    }

    public C0185n writeShort(int i) {
        this.buf.writeShort(i);
        return this;
    }

    public final int writerIndex() {
        return this.buf.writerIndex();
    }

    public C0185n capacity(int i) {
        this.buf.capacity(i);
        return this;
    }

    public int compareTo(C0185n nVar) {
        return this.buf.compareTo(nVar);
    }

    public int ensureWritable(int i, boolean z) {
        return this.buf.ensureWritable(i, z);
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        this.buf.getBytes(i, bArr, i8, i9);
        return this;
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        return this.buf.nioBuffer(i, i8);
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        return this.buf.nioBuffers(i, i8);
    }

    public C0185n order(ByteOrder byteOrder) {
        return this.buf.order(byteOrder);
    }

    public C0185n readBytes(C0185n nVar) {
        this.buf.readBytes(nVar);
        return this;
    }

    public final C0185n readerIndex(int i) {
        this.buf.readerIndex(i);
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        this.buf.setBytes(i, bArr, i8, i9);
        return this;
    }

    public C0185n slice(int i, int i8) {
        return this.buf.slice(i, i8);
    }

    public String toString() {
        return n0.simpleClassName((Object) this) + '(' + this.buf.toString() + ')';
    }

    public C0185n touch(Object obj) {
        this.buf.touch(obj);
        return this;
    }

    public C0185n writeBytes(C0185n nVar, int i, int i8) {
        this.buf.writeBytes(nVar, i, i8);
        return this;
    }

    public final C0185n writerIndex(int i) {
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
