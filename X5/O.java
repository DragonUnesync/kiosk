package X5;

import S5.C0;
import S5.C0185n;
import S5.C0187o;
import S5.D0;
import e6.C0851j;
import e6.X;
import g6.B;
import g6.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public final class O extends C0185n {
    static final O EMPTY_BUFFER;
    private static final X REPLAY = N.REPLAY;
    private C0185n buffer;
    private C0 swapped;
    private boolean terminated;

    static {
        O o2 = new O(D0.EMPTY_BUFFER);
        EMPTY_BUFFER = o2;
        o2.terminate();
    }

    public O() {
    }

    private void checkIndex(int i, int i8) {
        if (i + i8 > this.buffer.writerIndex()) {
            throw REPLAY;
        }
    }

    private void checkReadableBytes(int i) {
        if (this.buffer.readableBytes() < i) {
            throw REPLAY;
        }
    }

    private static UnsupportedOperationException reject() {
        return new UnsupportedOperationException("not a replayable operation");
    }

    public C0187o alloc() {
        return this.buffer.alloc();
    }

    public byte[] array() {
        throw new UnsupportedOperationException();
    }

    public int arrayOffset() {
        throw new UnsupportedOperationException();
    }

    public C0185n asReadOnly() {
        return D0.unmodifiableBuffer(this);
    }

    public int capacity() {
        if (this.terminated) {
            return this.buffer.capacity();
        }
        return Integer.MAX_VALUE;
    }

    public C0185n clear() {
        throw reject();
    }

    public C0185n discardSomeReadBytes() {
        throw reject();
    }

    public C0185n duplicate() {
        throw reject();
    }

    public C0185n ensureWritable(int i) {
        throw reject();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        int writerIndex = this.buffer.writerIndex();
        if (i >= writerIndex) {
            throw REPLAY;
        } else if (i <= writerIndex - i8) {
            return this.buffer.forEachByte(i, i8, jVar);
        } else {
            int forEachByte = this.buffer.forEachByte(i, writerIndex - i, jVar);
            if (forEachByte >= 0) {
                return forEachByte;
            }
            throw REPLAY;
        }
    }

    public byte getByte(int i) {
        checkIndex(i, 1);
        return this.buffer.getByte(i);
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        checkIndex(i, i9);
        this.buffer.getBytes(i, bArr, i8, i9);
        return this;
    }

    public int getInt(int i) {
        checkIndex(i, 4);
        return this.buffer.getInt(i);
    }

    public int getIntLE(int i) {
        checkIndex(i, 4);
        return this.buffer.getIntLE(i);
    }

    public long getLong(int i) {
        checkIndex(i, 8);
        return this.buffer.getLong(i);
    }

    public long getLongLE(int i) {
        checkIndex(i, 8);
        return this.buffer.getLongLE(i);
    }

    public int getMedium(int i) {
        checkIndex(i, 3);
        return this.buffer.getMedium(i);
    }

    public short getShort(int i) {
        checkIndex(i, 2);
        return this.buffer.getShort(i);
    }

    public short getShortLE(int i) {
        checkIndex(i, 2);
        return this.buffer.getShortLE(i);
    }

    public short getUnsignedByte(int i) {
        checkIndex(i, 1);
        return this.buffer.getUnsignedByte(i);
    }

    public long getUnsignedInt(int i) {
        checkIndex(i, 4);
        return this.buffer.getUnsignedInt(i);
    }

    public long getUnsignedIntLE(int i) {
        checkIndex(i, 4);
        return this.buffer.getUnsignedIntLE(i);
    }

    public int getUnsignedMedium(int i) {
        checkIndex(i, 3);
        return this.buffer.getUnsignedMedium(i);
    }

    public int getUnsignedShort(int i) {
        checkIndex(i, 2);
        return this.buffer.getUnsignedShort(i);
    }

    public boolean hasArray() {
        return false;
    }

    public boolean hasMemoryAddress() {
        return false;
    }

    public int hashCode() {
        throw reject();
    }

    public int indexOf(int i, int i8, byte b8) {
        if (i == i8) {
            return -1;
        }
        if (Math.max(i, i8) <= this.buffer.writerIndex()) {
            return this.buffer.indexOf(i, i8, b8);
        }
        throw REPLAY;
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        checkIndex(i, i8);
        return this.buffer.internalNioBuffer(i, i8);
    }

    public boolean isDirect() {
        return this.buffer.isDirect();
    }

    public boolean isReadOnly() {
        return false;
    }

    public boolean isReadable() {
        if (!this.terminated || this.buffer.isReadable()) {
            return true;
        }
        return false;
    }

    public boolean isWritable(int i) {
        return false;
    }

    public int maxCapacity() {
        return capacity();
    }

    public int maxWritableBytes() {
        return 0;
    }

    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }

    public ByteBuffer nioBuffer() {
        throw reject();
    }

    public int nioBufferCount() {
        return this.buffer.nioBufferCount();
    }

    public ByteBuffer[] nioBuffers() {
        throw reject();
    }

    public ByteOrder order() {
        return this.buffer.order();
    }

    public byte readByte() {
        checkReadableBytes(1);
        return this.buffer.readByte();
    }

    public C0185n readBytes(byte[] bArr) {
        checkReadableBytes(bArr.length);
        this.buffer.readBytes(bArr);
        return this;
    }

    public int readInt() {
        checkReadableBytes(4);
        return this.buffer.readInt();
    }

    public long readLong() {
        checkReadableBytes(8);
        return this.buffer.readLong();
    }

    public C0185n readRetainedSlice(int i) {
        checkReadableBytes(i);
        return this.buffer.readRetainedSlice(i);
    }

    public short readShort() {
        checkReadableBytes(2);
        return this.buffer.readShort();
    }

    public C0185n readSlice(int i) {
        checkReadableBytes(i);
        return this.buffer.readSlice(i);
    }

    public short readUnsignedByte() {
        checkReadableBytes(1);
        return this.buffer.readUnsignedByte();
    }

    public long readUnsignedInt() {
        checkReadableBytes(4);
        return this.buffer.readUnsignedInt();
    }

    public int readUnsignedShort() {
        checkReadableBytes(2);
        return this.buffer.readUnsignedShort();
    }

    public int readableBytes() {
        if (this.terminated) {
            return this.buffer.readableBytes();
        }
        return Integer.MAX_VALUE - this.buffer.readerIndex();
    }

    public int readerIndex() {
        return this.buffer.readerIndex();
    }

    public int refCnt() {
        return this.buffer.refCnt();
    }

    public boolean release() {
        throw reject();
    }

    public C0185n retain() {
        throw reject();
    }

    public C0185n retainedDuplicate() {
        throw reject();
    }

    public C0185n retainedSlice() {
        throw reject();
    }

    public C0185n setByte(int i, int i8) {
        throw reject();
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        throw reject();
    }

    public int setCharSequence(int i, CharSequence charSequence, Charset charset) {
        throw reject();
    }

    public void setCumulation(C0185n nVar) {
        this.buffer = nVar;
    }

    public C0185n setIndex(int i, int i8) {
        throw reject();
    }

    public C0185n setInt(int i, int i8) {
        throw reject();
    }

    public C0185n setLong(int i, long j7) {
        throw reject();
    }

    public C0185n setMedium(int i, int i8) {
        throw reject();
    }

    public C0185n setShort(int i, int i8) {
        throw reject();
    }

    public C0185n setZero(int i, int i8) {
        throw reject();
    }

    public C0185n skipBytes(int i) {
        checkReadableBytes(i);
        this.buffer.skipBytes(i);
        return this;
    }

    public C0185n slice() {
        throw reject();
    }

    public void terminate() {
        this.terminated = true;
    }

    public String toString(Charset charset) {
        throw reject();
    }

    public C0185n unwrap() {
        throw reject();
    }

    public int writableBytes() {
        return 0;
    }

    public C0185n writeByte(int i) {
        throw reject();
    }

    public C0185n writeBytes(byte[] bArr, int i, int i8) {
        throw reject();
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        throw reject();
    }

    public C0185n writeInt(int i) {
        throw reject();
    }

    public C0185n writeLong(long j7) {
        throw reject();
    }

    public C0185n writeMedium(int i) {
        throw reject();
    }

    public C0185n writeShort(int i) {
        throw reject();
    }

    public int writerIndex() {
        return this.buffer.writerIndex();
    }

    public O(C0185n nVar) {
        setCumulation(nVar);
    }

    public int compareTo(C0185n nVar) {
        throw reject();
    }

    public int ensureWritable(int i, boolean z) {
        throw reject();
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        checkIndex(i, i8);
        return this.buffer.nioBuffer(i, i8);
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        checkIndex(i, i8);
        return this.buffer.nioBuffers(i, i8);
    }

    public C0185n order(ByteOrder byteOrder) {
        if (B.checkNotNull(byteOrder, "endianness") == order()) {
            return this;
        }
        C0 c02 = this.swapped;
        if (c02 != null) {
            return c02;
        }
        C0 c03 = new C0(this);
        this.swapped = c03;
        return c03;
    }

    public C0185n readerIndex(int i) {
        this.buffer.readerIndex(i);
        return this;
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        throw reject();
    }

    public C0185n slice(int i, int i8) {
        checkIndex(i, i8);
        return this.buffer.slice(i, i8);
    }

    public String toString() {
        return n0.simpleClassName((Object) this) + "(ridx=" + readerIndex() + ", widx=" + writerIndex() + ')';
    }

    public C0185n touch(Object obj) {
        this.buffer.touch(obj);
        return this;
    }

    public C0185n writeBytes(byte[] bArr) {
        throw reject();
    }

    public C0185n writerIndex(int i) {
        throw reject();
    }

    public C0185n capacity(int i) {
        throw reject();
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        throw reject();
    }

    public C0185n readBytes(ByteBuffer byteBuffer) {
        throw reject();
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        throw reject();
    }

    public C0185n writeBytes(ByteBuffer byteBuffer) {
        throw reject();
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        checkIndex(i, i9);
        this.buffer.getBytes(i, nVar, i8, i9);
        return this;
    }

    public C0185n readBytes(C0185n nVar) {
        checkReadableBytes(nVar.writableBytes());
        this.buffer.readBytes(nVar);
        return this;
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        throw reject();
    }

    public C0185n writeBytes(C0185n nVar, int i, int i8) {
        throw reject();
    }

    public C0185n writeBytes(C0185n nVar) {
        throw reject();
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        throw reject();
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        throw reject();
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i) {
        throw reject();
    }

    public C0185n readBytes(int i) {
        checkReadableBytes(i);
        return this.buffer.readBytes(i);
    }
}
