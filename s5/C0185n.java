package S5;

import e6.C0851j;
import e6.J;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* renamed from: S5.n  reason: case insensitive filesystem */
public abstract class C0185n implements J, Comparable {
    public abstract C0187o alloc();

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract C0185n asReadOnly();

    public abstract int capacity();

    public abstract C0185n capacity(int i);

    public abstract C0185n clear();

    public abstract int compareTo(C0185n nVar);

    public abstract C0185n discardSomeReadBytes();

    public abstract C0185n duplicate();

    public abstract int ensureWritable(int i, boolean z);

    public abstract C0185n ensureWritable(int i);

    public abstract boolean equals(Object obj);

    public abstract int forEachByte(int i, int i8, C0851j jVar);

    public abstract byte getByte(int i);

    public abstract int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8);

    public abstract C0185n getBytes(int i, C0185n nVar, int i8, int i9);

    public abstract C0185n getBytes(int i, ByteBuffer byteBuffer);

    public abstract C0185n getBytes(int i, byte[] bArr, int i8, int i9);

    public abstract int getInt(int i);

    public abstract int getIntLE(int i);

    public abstract long getLong(int i);

    public abstract long getLongLE(int i);

    public abstract int getMedium(int i);

    public abstract short getShort(int i);

    public abstract short getShortLE(int i);

    public abstract short getUnsignedByte(int i);

    public abstract long getUnsignedInt(int i);

    public abstract long getUnsignedIntLE(int i);

    public abstract int getUnsignedMedium(int i);

    public abstract int getUnsignedShort(int i);

    public abstract boolean hasArray();

    public abstract boolean hasMemoryAddress();

    public abstract int hashCode();

    public abstract int indexOf(int i, int i8, byte b8);

    public abstract ByteBuffer internalNioBuffer(int i, int i8);

    public boolean isAccessible() {
        if (refCnt() != 0) {
            return true;
        }
        return false;
    }

    public boolean isContiguous() {
        return false;
    }

    public abstract boolean isDirect();

    public abstract boolean isReadOnly();

    public abstract boolean isReadable();

    public abstract boolean isWritable(int i);

    public abstract int maxCapacity();

    public int maxFastWritableBytes() {
        return writableBytes();
    }

    public abstract int maxWritableBytes();

    public abstract long memoryAddress();

    public abstract ByteBuffer nioBuffer();

    public abstract ByteBuffer nioBuffer(int i, int i8);

    public abstract int nioBufferCount();

    public abstract ByteBuffer[] nioBuffers();

    public abstract ByteBuffer[] nioBuffers(int i, int i8);

    @Deprecated
    public abstract C0185n order(ByteOrder byteOrder);

    @Deprecated
    public abstract ByteOrder order();

    public abstract byte readByte();

    public abstract int readBytes(GatheringByteChannel gatheringByteChannel, int i);

    public abstract C0185n readBytes(int i);

    public abstract C0185n readBytes(C0185n nVar);

    public abstract C0185n readBytes(ByteBuffer byteBuffer);

    public abstract C0185n readBytes(byte[] bArr);

    public abstract int readInt();

    public abstract long readLong();

    public abstract C0185n readRetainedSlice(int i);

    public abstract short readShort();

    public abstract C0185n readSlice(int i);

    public abstract short readUnsignedByte();

    public abstract long readUnsignedInt();

    public abstract int readUnsignedShort();

    public abstract int readableBytes();

    public abstract int readerIndex();

    public abstract C0185n readerIndex(int i);

    public abstract C0185n retain();

    public abstract C0185n retainedDuplicate();

    public abstract C0185n retainedSlice();

    public abstract C0185n setByte(int i, int i8);

    public abstract int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8);

    public abstract C0185n setBytes(int i, C0185n nVar, int i8, int i9);

    public abstract C0185n setBytes(int i, ByteBuffer byteBuffer);

    public abstract C0185n setBytes(int i, byte[] bArr, int i8, int i9);

    public abstract int setCharSequence(int i, CharSequence charSequence, Charset charset);

    public abstract C0185n setIndex(int i, int i8);

    public abstract C0185n setInt(int i, int i8);

    public abstract C0185n setLong(int i, long j7);

    public abstract C0185n setMedium(int i, int i8);

    public abstract C0185n setShort(int i, int i8);

    public abstract C0185n setZero(int i, int i8);

    public abstract C0185n skipBytes(int i);

    public abstract C0185n slice();

    public abstract C0185n slice(int i, int i8);

    public abstract String toString();

    public abstract String toString(Charset charset);

    public abstract C0185n touch(Object obj);

    public abstract C0185n unwrap();

    public abstract int writableBytes();

    public abstract C0185n writeByte(int i);

    public abstract int writeBytes(ScatteringByteChannel scatteringByteChannel, int i);

    public abstract C0185n writeBytes(C0185n nVar);

    public abstract C0185n writeBytes(C0185n nVar, int i, int i8);

    public abstract C0185n writeBytes(ByteBuffer byteBuffer);

    public abstract C0185n writeBytes(byte[] bArr);

    public abstract C0185n writeBytes(byte[] bArr, int i, int i8);

    public abstract int writeCharSequence(CharSequence charSequence, Charset charset);

    public abstract C0185n writeInt(int i);

    public abstract C0185n writeLong(long j7);

    public abstract C0185n writeMedium(int i);

    public abstract C0185n writeShort(int i);

    public abstract int writerIndex();

    public abstract C0185n writerIndex(int i);
}
