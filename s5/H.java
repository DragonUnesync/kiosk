package S5;

import e6.C0851j;
import g6.B;
import g6.C0978k;
import g6.Y;
import g6.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public final class H extends C0185n {
    private static final ByteBuffer EMPTY_BYTE_BUFFER;
    private static final long EMPTY_BYTE_BUFFER_ADDRESS;
    private final C0187o alloc;
    private final ByteOrder order;
    private final String str;
    private H swapped;

    static {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(0);
        EMPTY_BYTE_BUFFER = allocateDirect;
        long j7 = 0;
        try {
            if (Y.hasUnsafe()) {
                j7 = Y.directBufferAddress(allocateDirect);
            }
        } catch (Throwable unused) {
        }
        EMPTY_BYTE_BUFFER_ADDRESS = j7;
    }

    public H(C0187o oVar) {
        this(oVar, ByteOrder.BIG_ENDIAN);
    }

    private C0185n checkIndex(int i) {
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    private C0185n checkLength(int i) {
        B.checkPositiveOrZero(i, "length");
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    public C0187o alloc() {
        return this.alloc;
    }

    public byte[] array() {
        return C0978k.EMPTY_BYTES;
    }

    public int arrayOffset() {
        return 0;
    }

    public C0185n asReadOnly() {
        return D0.unmodifiableBuffer(this);
    }

    public int capacity() {
        return 0;
    }

    public C0185n clear() {
        return this;
    }

    public C0185n discardSomeReadBytes() {
        return this;
    }

    public C0185n duplicate() {
        return this;
    }

    public C0185n ensureWritable(int i) {
        B.checkPositiveOrZero(i, "minWritableBytes");
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0185n) || ((C0185n) obj).isReadable()) {
            return false;
        }
        return true;
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        checkIndex(i, i8);
        return -1;
    }

    public byte getByte(int i) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        return checkIndex(i, i9);
    }

    public int getInt(int i) {
        throw new IndexOutOfBoundsException();
    }

    public int getIntLE(int i) {
        throw new IndexOutOfBoundsException();
    }

    public long getLong(int i) {
        throw new IndexOutOfBoundsException();
    }

    public long getLongLE(int i) {
        throw new IndexOutOfBoundsException();
    }

    public int getMedium(int i) {
        throw new IndexOutOfBoundsException();
    }

    public short getShort(int i) {
        throw new IndexOutOfBoundsException();
    }

    public short getShortLE(int i) {
        throw new IndexOutOfBoundsException();
    }

    public short getUnsignedByte(int i) {
        throw new IndexOutOfBoundsException();
    }

    public long getUnsignedInt(int i) {
        throw new IndexOutOfBoundsException();
    }

    public long getUnsignedIntLE(int i) {
        throw new IndexOutOfBoundsException();
    }

    public int getUnsignedMedium(int i) {
        throw new IndexOutOfBoundsException();
    }

    public int getUnsignedShort(int i) {
        throw new IndexOutOfBoundsException();
    }

    public boolean hasArray() {
        return true;
    }

    public boolean hasMemoryAddress() {
        if (EMPTY_BYTE_BUFFER_ADDRESS != 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public int indexOf(int i, int i8, byte b8) {
        checkIndex(i);
        checkIndex(i8);
        return -1;
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        return EMPTY_BYTE_BUFFER;
    }

    public boolean isContiguous() {
        return true;
    }

    public boolean isDirect() {
        return true;
    }

    public boolean isReadOnly() {
        return false;
    }

    public boolean isReadable() {
        return false;
    }

    public boolean isWritable(int i) {
        return false;
    }

    public int maxCapacity() {
        return 0;
    }

    public int maxWritableBytes() {
        return 0;
    }

    public long memoryAddress() {
        if (hasMemoryAddress()) {
            return EMPTY_BYTE_BUFFER_ADDRESS;
        }
        throw new UnsupportedOperationException();
    }

    public ByteBuffer nioBuffer() {
        return EMPTY_BYTE_BUFFER;
    }

    public int nioBufferCount() {
        return 1;
    }

    public ByteBuffer[] nioBuffers() {
        return new ByteBuffer[]{EMPTY_BYTE_BUFFER};
    }

    public ByteOrder order() {
        return this.order;
    }

    public byte readByte() {
        throw new IndexOutOfBoundsException();
    }

    public C0185n readBytes(int i) {
        return checkLength(i);
    }

    public int readInt() {
        throw new IndexOutOfBoundsException();
    }

    public long readLong() {
        throw new IndexOutOfBoundsException();
    }

    public C0185n readRetainedSlice(int i) {
        return checkLength(i);
    }

    public short readShort() {
        throw new IndexOutOfBoundsException();
    }

    public C0185n readSlice(int i) {
        return checkLength(i);
    }

    public short readUnsignedByte() {
        throw new IndexOutOfBoundsException();
    }

    public long readUnsignedInt() {
        throw new IndexOutOfBoundsException();
    }

    public int readUnsignedShort() {
        throw new IndexOutOfBoundsException();
    }

    public int readableBytes() {
        return 0;
    }

    public int readerIndex() {
        return 0;
    }

    public int refCnt() {
        return 1;
    }

    public boolean release() {
        return false;
    }

    public C0185n retain() {
        return this;
    }

    public C0185n retainedDuplicate() {
        return this;
    }

    public C0185n retainedSlice() {
        return this;
    }

    public C0185n setByte(int i, int i8) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        return checkIndex(i, i9);
    }

    public int setCharSequence(int i, CharSequence charSequence, Charset charset) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n setIndex(int i, int i8) {
        checkIndex(i);
        checkIndex(i8);
        return this;
    }

    public C0185n setInt(int i, int i8) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n setLong(int i, long j7) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n setMedium(int i, int i8) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n setShort(int i, int i8) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n setZero(int i, int i8) {
        return checkIndex(i, i8);
    }

    public C0185n skipBytes(int i) {
        return checkLength(i);
    }

    public C0185n slice() {
        return this;
    }

    public String toString(Charset charset) {
        return "";
    }

    public C0185n unwrap() {
        return null;
    }

    public int writableBytes() {
        return 0;
    }

    public C0185n writeByte(int i) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n writeBytes(C0185n nVar) {
        return checkLength(nVar.readableBytes());
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n writeInt(int i) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n writeLong(long j7) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n writeMedium(int i) {
        throw new IndexOutOfBoundsException();
    }

    public C0185n writeShort(int i) {
        throw new IndexOutOfBoundsException();
    }

    public int writerIndex() {
        return 0;
    }

    private H(C0187o oVar, ByteOrder byteOrder) {
        this.alloc = (C0187o) B.checkNotNull(oVar, "alloc");
        this.order = byteOrder;
        StringBuilder sb = new StringBuilder();
        sb.append(n0.simpleClassName((Object) this));
        sb.append(byteOrder == ByteOrder.BIG_ENDIAN ? "BE" : "LE");
        this.str = sb.toString();
    }

    private C0185n checkIndex(int i, int i8) {
        B.checkPositiveOrZero(i8, "length");
        if (i == 0 && i8 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    public C0185n capacity(int i) {
        throw new ReadOnlyBufferException();
    }

    public int compareTo(C0185n nVar) {
        return nVar.isReadable() ? -1 : 0;
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        return checkIndex(i, i9);
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        checkIndex(i, i8);
        return nioBuffer();
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        checkIndex(i, i8);
        return nioBuffers();
    }

    public C0185n order(ByteOrder byteOrder) {
        if (B.checkNotNull(byteOrder, "endianness") == order()) {
            return this;
        }
        H h5 = this.swapped;
        if (h5 != null) {
            return h5;
        }
        H h8 = new H(alloc(), byteOrder);
        this.swapped = h8;
        return h8;
    }

    public C0185n readBytes(C0185n nVar) {
        return checkLength(nVar.writableBytes());
    }

    public C0185n readerIndex(int i) {
        return checkIndex(i);
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        return checkIndex(i, i9);
    }

    public C0185n slice(int i, int i8) {
        return checkIndex(i, i8);
    }

    public String toString() {
        return this.str;
    }

    public C0185n touch(Object obj) {
        return this;
    }

    public C0185n writeBytes(C0185n nVar, int i, int i8) {
        return checkLength(i8);
    }

    public C0185n writerIndex(int i) {
        return checkIndex(i);
    }

    public int ensureWritable(int i, boolean z) {
        B.checkPositiveOrZero(i, "minWritableBytes");
        return i == 0 ? 0 : 1;
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        return checkIndex(i, byteBuffer.remaining());
    }

    public C0185n readBytes(byte[] bArr) {
        return checkLength(bArr.length);
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        return checkIndex(i, byteBuffer.remaining());
    }

    public C0185n writeBytes(byte[] bArr) {
        return checkLength(bArr.length);
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        checkIndex(i, i8);
        return 0;
    }

    public C0185n readBytes(ByteBuffer byteBuffer) {
        return checkLength(byteBuffer.remaining());
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        checkIndex(i, i8);
        return 0;
    }

    public C0185n writeBytes(byte[] bArr, int i, int i8) {
        return checkLength(i8);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        checkLength(i);
        return 0;
    }

    public C0185n writeBytes(ByteBuffer byteBuffer) {
        return checkLength(byteBuffer.remaining());
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i) {
        checkLength(i);
        return 0;
    }
}
