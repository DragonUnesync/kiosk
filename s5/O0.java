package S5;

import g6.B;
import g6.C0978k;
import g6.Y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class O0 extends C0175i {
    private final C0187o alloc;
    byte[] array;
    private ByteBuffer tmpNioBuf;

    public O0(C0187o oVar, int i, int i8) {
        super(i8);
        if (i <= i8) {
            this.alloc = (C0187o) B.checkNotNull(oVar, "alloc");
            setArray(allocateArray(i));
            setIndex(0, 0);
            return;
        }
        throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i8)}));
    }

    private void setArray(byte[] bArr) {
        this.array = bArr;
        this.tmpNioBuf = null;
    }

    public byte _getByte(int i) {
        return K.getByte(this.array, i);
    }

    public int _getInt(int i) {
        return K.getInt(this.array, i);
    }

    public int _getIntLE(int i) {
        return K.getIntLE(this.array, i);
    }

    public long _getLong(int i) {
        return K.getLong(this.array, i);
    }

    public long _getLongLE(int i) {
        return K.getLongLE(this.array, i);
    }

    public short _getShort(int i) {
        return K.getShort(this.array, i);
    }

    public short _getShortLE(int i) {
        return K.getShortLE(this.array, i);
    }

    public int _getUnsignedMedium(int i) {
        return K.getUnsignedMedium(this.array, i);
    }

    public void _setByte(int i, int i8) {
        K.setByte(this.array, i, i8);
    }

    public void _setInt(int i, int i8) {
        K.setInt(this.array, i, i8);
    }

    public void _setLong(int i, long j7) {
        K.setLong(this.array, i, j7);
    }

    public void _setMedium(int i, int i8) {
        K.setMedium(this.array, i, i8);
    }

    public void _setShort(int i, int i8) {
        K.setShort(this.array, i, i8);
    }

    public C0187o alloc() {
        return this.alloc;
    }

    public byte[] allocateArray(int i) {
        return new byte[i];
    }

    public byte[] array() {
        ensureAccessible();
        return this.array;
    }

    public int arrayOffset() {
        return 0;
    }

    public int capacity() {
        return this.array.length;
    }

    public void deallocate() {
        freeArray(this.array);
        this.array = C0978k.EMPTY_BYTES;
    }

    public void freeArray(byte[] bArr) {
    }

    public byte getByte(int i) {
        ensureAccessible();
        return _getByte(i);
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        checkDstIndex(i, i9, i8, nVar.capacity());
        if (nVar.hasMemoryAddress()) {
            Y.copyMemory(this.array, i, nVar.memoryAddress() + ((long) i8), (long) i9);
        } else if (nVar.hasArray()) {
            getBytes(i, nVar.array(), nVar.arrayOffset() + i8, i9);
        } else {
            nVar.setBytes(i8, this.array, i, i9);
        }
        return this;
    }

    public int getInt(int i) {
        ensureAccessible();
        return _getInt(i);
    }

    public int getIntLE(int i) {
        ensureAccessible();
        return _getIntLE(i);
    }

    public long getLong(int i) {
        ensureAccessible();
        return _getLong(i);
    }

    public long getLongLE(int i) {
        ensureAccessible();
        return _getLongLE(i);
    }

    public short getShort(int i) {
        ensureAccessible();
        return _getShort(i);
    }

    public short getShortLE(int i) {
        ensureAccessible();
        return _getShortLE(i);
    }

    public int getUnsignedMedium(int i) {
        ensureAccessible();
        return _getUnsignedMedium(i);
    }

    public boolean hasArray() {
        return true;
    }

    public boolean hasMemoryAddress() {
        return false;
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        checkIndex(i, i8);
        return (ByteBuffer) internalNioBuffer().clear().position(i).limit(i + i8);
    }

    public final boolean isContiguous() {
        return true;
    }

    public boolean isDirect() {
        return false;
    }

    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        ensureAccessible();
        return ByteBuffer.wrap(this.array, i, i8).slice();
    }

    public int nioBufferCount() {
        return 1;
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        return new ByteBuffer[]{nioBuffer(i, i8)};
    }

    public ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        checkReadableBytes(i);
        int bytes = getBytes(this.readerIndex, gatheringByteChannel, i, true);
        this.readerIndex += bytes;
        return bytes;
    }

    public C0185n setByte(int i, int i8) {
        ensureAccessible();
        _setByte(i, i8);
        return this;
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        checkSrcIndex(i, i9, i8, nVar.capacity());
        if (nVar.hasMemoryAddress()) {
            Y.copyMemory(nVar.memoryAddress() + ((long) i8), this.array, i, (long) i9);
        } else if (nVar.hasArray()) {
            setBytes(i, nVar.array(), nVar.arrayOffset() + i8, i9);
        } else {
            nVar.getBytes(i8, this.array, i, i9);
        }
        return this;
    }

    public C0185n setInt(int i, int i8) {
        ensureAccessible();
        _setInt(i, i8);
        return this;
    }

    public C0185n setLong(int i, long j7) {
        ensureAccessible();
        _setLong(i, j7);
        return this;
    }

    public C0185n setMedium(int i, int i8) {
        ensureAccessible();
        _setMedium(i, i8);
        return this;
    }

    public C0185n setShort(int i, int i8) {
        ensureAccessible();
        _setShort(i, i8);
        return this;
    }

    public C0185n unwrap() {
        return null;
    }

    public C0185n capacity(int i) {
        checkNewCapacity(i);
        byte[] bArr = this.array;
        int length = bArr.length;
        if (i == length) {
            return this;
        }
        if (i <= length) {
            trimIndicesToCapacity(i);
            length = i;
        }
        byte[] allocateArray = allocateArray(i);
        System.arraycopy(bArr, 0, allocateArray, 0, length);
        setArray(allocateArray);
        freeArray(bArr);
        return this;
    }

    private ByteBuffer internalNioBuffer() {
        ByteBuffer byteBuffer = this.tmpNioBuf;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.array);
        this.tmpNioBuf = wrap;
        return wrap;
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        checkDstIndex(i, i9, i8, bArr.length);
        System.arraycopy(this.array, i, bArr, i8, i9);
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        checkSrcIndex(i, i9, i8, bArr.length);
        System.arraycopy(bArr, i8, this.array, i, i9);
        return this;
    }

    public O0(C0187o oVar, byte[] bArr, int i) {
        super(i);
        B.checkNotNull(oVar, "alloc");
        B.checkNotNull(bArr, "initialArray");
        if (bArr.length <= i) {
            this.alloc = oVar;
            setArray(bArr);
            setIndex(0, bArr.length);
            return;
        }
        throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i)}));
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        ensureAccessible();
        byteBuffer.put(this.array, i, byteBuffer.remaining());
        return this;
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        ensureAccessible();
        byteBuffer.get(this.array, i, byteBuffer.remaining());
        return this;
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        ensureAccessible();
        return getBytes(i, gatheringByteChannel, i8, false);
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        ensureAccessible();
        try {
            return scatteringByteChannel.read((ByteBuffer) internalNioBuffer().clear().position(i).limit(i + i8));
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    private int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8, boolean z) {
        ByteBuffer byteBuffer;
        ensureAccessible();
        if (z) {
            byteBuffer = internalNioBuffer();
        } else {
            byteBuffer = ByteBuffer.wrap(this.array);
        }
        return gatheringByteChannel.write((ByteBuffer) byteBuffer.clear().position(i).limit(i + i8));
    }
}
