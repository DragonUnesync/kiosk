package S5;

import e6.C0851j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class Y0 extends E {
    private final E wrapped;

    public Y0(E e) {
        super(e.alloc());
        this.wrapped = e;
    }

    public final byte _getByte(int i) {
        return this.wrapped._getByte(i);
    }

    public final int _getInt(int i) {
        return this.wrapped._getInt(i);
    }

    public final int _getIntLE(int i) {
        return this.wrapped._getIntLE(i);
    }

    public final long _getLong(int i) {
        return this.wrapped._getLong(i);
    }

    public final long _getLongLE(int i) {
        return this.wrapped._getLongLE(i);
    }

    public final short _getShort(int i) {
        return this.wrapped._getShort(i);
    }

    public final short _getShortLE(int i) {
        return this.wrapped._getShortLE(i);
    }

    public final int _getUnsignedMedium(int i) {
        return this.wrapped._getUnsignedMedium(i);
    }

    public final void _setByte(int i, int i8) {
        this.wrapped._setByte(i, i8);
    }

    public final void _setInt(int i, int i8) {
        this.wrapped._setInt(i, i8);
    }

    public final void _setLong(int i, long j7) {
        this.wrapped._setLong(i, j7);
    }

    public final void _setMedium(int i, int i8) {
        this.wrapped._setMedium(i, i8);
    }

    public final void _setShort(int i, int i8) {
        this.wrapped._setShort(i, i8);
    }

    public E addComponent(boolean z, C0185n nVar) {
        this.wrapped.addComponent(z, nVar);
        return this;
    }

    public E addFlattenedComponents(boolean z, C0185n nVar) {
        this.wrapped.addFlattenedComponents(z, nVar);
        return this;
    }

    public final C0187o alloc() {
        return this.wrapped.alloc();
    }

    public final byte[] array() {
        return this.wrapped.array();
    }

    public final int arrayOffset() {
        return this.wrapped.arrayOffset();
    }

    public C0185n asReadOnly() {
        return this.wrapped.asReadOnly();
    }

    public final void deallocate() {
        this.wrapped.deallocate();
    }

    public E discardReadComponents() {
        this.wrapped.discardReadComponents();
        return this;
    }

    public C0185n duplicate() {
        return this.wrapped.duplicate();
    }

    public final boolean equals(Object obj) {
        return this.wrapped.equals(obj);
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        return this.wrapped.forEachByte(i, i8, jVar);
    }

    public int forEachByteAsc0(int i, int i8, C0851j jVar) {
        return this.wrapped.forEachByteAsc0(i, i8, jVar);
    }

    public byte getByte(int i) {
        return this.wrapped.getByte(i);
    }

    public int getInt(int i) {
        return this.wrapped.getInt(i);
    }

    public int getIntLE(int i) {
        return this.wrapped.getIntLE(i);
    }

    public long getLong(int i) {
        return this.wrapped.getLong(i);
    }

    public long getLongLE(int i) {
        return this.wrapped.getLongLE(i);
    }

    public int getMedium(int i) {
        return this.wrapped.getMedium(i);
    }

    public short getShort(int i) {
        return this.wrapped.getShort(i);
    }

    public short getShortLE(int i) {
        return this.wrapped.getShortLE(i);
    }

    public short getUnsignedByte(int i) {
        return this.wrapped.getUnsignedByte(i);
    }

    public long getUnsignedInt(int i) {
        return this.wrapped.getUnsignedInt(i);
    }

    public long getUnsignedIntLE(int i) {
        return this.wrapped.getUnsignedIntLE(i);
    }

    public int getUnsignedMedium(int i) {
        return this.wrapped.getUnsignedMedium(i);
    }

    public int getUnsignedShort(int i) {
        return this.wrapped.getUnsignedShort(i);
    }

    public final boolean hasArray() {
        return this.wrapped.hasArray();
    }

    public final boolean hasMemoryAddress() {
        return this.wrapped.hasMemoryAddress();
    }

    public final int hashCode() {
        return this.wrapped.hashCode();
    }

    public int indexOf(int i, int i8, byte b8) {
        return this.wrapped.indexOf(i, i8, b8);
    }

    public final C0185n internalComponent(int i) {
        return this.wrapped.internalComponent(i);
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        return this.wrapped.internalNioBuffer(i, i8);
    }

    public final boolean isAccessible() {
        return this.wrapped.isAccessible();
    }

    public final boolean isDirect() {
        return this.wrapped.isDirect();
    }

    public boolean isReadOnly() {
        return this.wrapped.isReadOnly();
    }

    public final boolean isReadable() {
        return this.wrapped.isReadable();
    }

    public final boolean isWritable(int i) {
        return this.wrapped.isWritable(i);
    }

    public Iterator<C0185n> iterator() {
        return this.wrapped.iterator();
    }

    public final int maxCapacity() {
        return this.wrapped.maxCapacity();
    }

    public int maxFastWritableBytes() {
        return this.wrapped.maxFastWritableBytes();
    }

    public final int maxWritableBytes() {
        return this.wrapped.maxWritableBytes();
    }

    public final long memoryAddress() {
        return this.wrapped.memoryAddress();
    }

    public C0 newSwappedByteBuf() {
        return this.wrapped.newSwappedByteBuf();
    }

    public ByteBuffer nioBuffer() {
        return this.wrapped.nioBuffer();
    }

    public int nioBufferCount() {
        return this.wrapped.nioBufferCount();
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        return this.wrapped.nioBuffers(i, i8);
    }

    public final int numComponents() {
        return this.wrapped.numComponents();
    }

    public C0185n order(ByteOrder byteOrder) {
        return this.wrapped.order(byteOrder);
    }

    public byte readByte() {
        return this.wrapped.readByte();
    }

    public int readInt() {
        return this.wrapped.readInt();
    }

    public long readLong() {
        return this.wrapped.readLong();
    }

    public C0185n readRetainedSlice(int i) {
        return this.wrapped.readRetainedSlice(i);
    }

    public short readShort() {
        return this.wrapped.readShort();
    }

    public C0185n readSlice(int i) {
        return this.wrapped.readSlice(i);
    }

    public short readUnsignedByte() {
        return this.wrapped.readUnsignedByte();
    }

    public long readUnsignedInt() {
        return this.wrapped.readUnsignedInt();
    }

    public int readUnsignedShort() {
        return this.wrapped.readUnsignedShort();
    }

    public final int readableBytes() {
        return this.wrapped.readableBytes();
    }

    public final int refCnt() {
        return this.wrapped.refCnt();
    }

    public boolean release() {
        return this.wrapped.release();
    }

    public C0185n retainedDuplicate() {
        return this.wrapped.retainedDuplicate();
    }

    public C0185n retainedSlice() {
        return this.wrapped.retainedSlice();
    }

    public int setCharSequence(int i, CharSequence charSequence, Charset charset) {
        return this.wrapped.setCharSequence(i, charSequence, charset);
    }

    public C0185n slice() {
        return this.wrapped.slice();
    }

    public String toString(Charset charset) {
        return this.wrapped.toString(charset);
    }

    public final C0185n unwrap() {
        return this.wrapped;
    }

    public final int writableBytes() {
        return this.wrapped.writableBytes();
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        return this.wrapped.writeCharSequence(charSequence, charset);
    }

    public E addComponent(boolean z, int i, C0185n nVar) {
        this.wrapped.addComponent(z, i, nVar);
        return this;
    }

    public final int capacity() {
        return this.wrapped.capacity();
    }

    public final E clear() {
        this.wrapped.clear();
        return this;
    }

    public final int compareTo(C0185n nVar) {
        return this.wrapped.compareTo(nVar);
    }

    public E discardSomeReadBytes() {
        this.wrapped.discardSomeReadBytes();
        return this;
    }

    public int ensureWritable(int i, boolean z) {
        return this.wrapped.ensureWritable(i, z);
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        return this.wrapped.nioBuffer(i, i8);
    }

    public ByteBuffer[] nioBuffers() {
        return this.wrapped.nioBuffers();
    }

    public final ByteOrder order() {
        return this.wrapped.order();
    }

    public final int readerIndex() {
        return this.wrapped.readerIndex();
    }

    public E retain() {
        this.wrapped.retain();
        return this;
    }

    public C0185n retainedSlice(int i, int i8) {
        return this.wrapped.retainedSlice(i, i8);
    }

    public E setByte(int i, int i8) {
        this.wrapped.setByte(i, i8);
        return this;
    }

    public final E setIndex(int i, int i8) {
        this.wrapped.setIndex(i, i8);
        return this;
    }

    public E setInt(int i, int i8) {
        this.wrapped.setInt(i, i8);
        return this;
    }

    public E setLong(int i, long j7) {
        this.wrapped.setLong(i, j7);
        return this;
    }

    public E setMedium(int i, int i8) {
        this.wrapped.setMedium(i, i8);
        return this;
    }

    public E setShort(int i, int i8) {
        this.wrapped.setShort(i, i8);
        return this;
    }

    public E setZero(int i, int i8) {
        this.wrapped.setZero(i, i8);
        return this;
    }

    public E skipBytes(int i) {
        this.wrapped.skipBytes(i);
        return this;
    }

    public C0185n slice(int i, int i8) {
        return this.wrapped.slice(i, i8);
    }

    public String toString(int i, int i8, Charset charset) {
        return this.wrapped.toString(i, i8, charset);
    }

    public E writeByte(int i) {
        this.wrapped.writeByte(i);
        return this;
    }

    public E writeInt(int i) {
        this.wrapped.writeInt(i);
        return this;
    }

    public E writeLong(long j7) {
        this.wrapped.writeLong(j7);
        return this;
    }

    public E writeMedium(int i) {
        this.wrapped.writeMedium(i);
        return this;
    }

    public E writeShort(int i) {
        this.wrapped.writeShort(i);
        return this;
    }

    public final int writerIndex() {
        return this.wrapped.writerIndex();
    }

    public E capacity(int i) {
        this.wrapped.capacity(i);
        return this;
    }

    public E ensureWritable(int i) {
        this.wrapped.ensureWritable(i);
        return this;
    }

    public final E readerIndex(int i) {
        this.wrapped.readerIndex(i);
        return this;
    }

    public final String toString() {
        return this.wrapped.toString();
    }

    public E touch(Object obj) {
        this.wrapped.touch(obj);
        return this;
    }

    public final E writerIndex(int i) {
        this.wrapped.writerIndex(i);
        return this;
    }

    public E getBytes(int i, byte[] bArr, int i8, int i9) {
        this.wrapped.getBytes(i, bArr, i8, i9);
        return this;
    }

    public E getBytes(int i, ByteBuffer byteBuffer) {
        this.wrapped.getBytes(i, byteBuffer);
        return this;
    }

    public E setBytes(int i, byte[] bArr, int i8, int i9) {
        this.wrapped.setBytes(i, bArr, i8, i9);
        return this;
    }

    public E getBytes(int i, C0185n nVar, int i8, int i9) {
        this.wrapped.getBytes(i, nVar, i8, i9);
        return this;
    }

    public E setBytes(int i, ByteBuffer byteBuffer) {
        this.wrapped.setBytes(i, byteBuffer);
        return this;
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        return this.wrapped.getBytes(i, gatheringByteChannel, i8);
    }

    public C0185n readBytes(int i) {
        return this.wrapped.readBytes(i);
    }

    public E setBytes(int i, C0185n nVar, int i8, int i9) {
        this.wrapped.setBytes(i, nVar, i8, i9);
        return this;
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i) {
        return this.wrapped.writeBytes(scatteringByteChannel, i);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        return this.wrapped.readBytes(gatheringByteChannel, i);
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        return this.wrapped.setBytes(i, scatteringByteChannel, i8);
    }

    public E writeBytes(C0185n nVar) {
        this.wrapped.writeBytes(nVar);
        return this;
    }

    public E readBytes(C0185n nVar) {
        this.wrapped.readBytes(nVar);
        return this;
    }

    public E setBytes(int i, byte[] bArr) {
        this.wrapped.setBytes(i, bArr);
        return this;
    }

    public E writeBytes(C0185n nVar, int i) {
        this.wrapped.writeBytes(nVar, i);
        return this;
    }

    public E readBytes(C0185n nVar, int i) {
        this.wrapped.readBytes(nVar, i);
        return this;
    }

    public E writeBytes(C0185n nVar, int i, int i8) {
        this.wrapped.writeBytes(nVar, i, i8);
        return this;
    }

    public E readBytes(C0185n nVar, int i, int i8) {
        this.wrapped.readBytes(nVar, i, i8);
        return this;
    }

    public E writeBytes(byte[] bArr) {
        this.wrapped.writeBytes(bArr);
        return this;
    }

    public E readBytes(byte[] bArr) {
        this.wrapped.readBytes(bArr);
        return this;
    }

    public E writeBytes(byte[] bArr, int i, int i8) {
        this.wrapped.writeBytes(bArr, i, i8);
        return this;
    }

    public E readBytes(byte[] bArr, int i, int i8) {
        this.wrapped.readBytes(bArr, i, i8);
        return this;
    }

    public E writeBytes(ByteBuffer byteBuffer) {
        this.wrapped.writeBytes(byteBuffer);
        return this;
    }

    public E readBytes(ByteBuffer byteBuffer) {
        this.wrapped.readBytes(byteBuffer);
        return this;
    }
}
