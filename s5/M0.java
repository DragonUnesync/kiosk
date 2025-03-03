package S5;

import g6.B;
import g6.Y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import org.altbeacon.bluetooth.Pdu;

public class M0 extends C0175i {
    private final C0187o alloc;
    ByteBuffer buffer;
    private int capacity;
    private boolean doNotFree;
    private ByteBuffer tmpNioBuf;

    public M0(C0187o oVar, int i, int i8) {
        super(i8);
        B.checkNotNull(oVar, "alloc");
        B.checkPositiveOrZero(i, "initialCapacity");
        B.checkPositiveOrZero(i8, "maxCapacity");
        if (i <= i8) {
            this.alloc = oVar;
            setByteBuffer(allocateDirect(i), false);
            return;
        }
        throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i8)}));
    }

    public byte _getByte(int i) {
        return this.buffer.get(i);
    }

    public int _getInt(int i) {
        return this.buffer.getInt(i);
    }

    public int _getIntLE(int i) {
        return C0206y.swapInt(this.buffer.getInt(i));
    }

    public long _getLong(int i) {
        return this.buffer.getLong(i);
    }

    public long _getLongLE(int i) {
        return C0206y.swapLong(this.buffer.getLong(i));
    }

    public short _getShort(int i) {
        return this.buffer.getShort(i);
    }

    public short _getShortLE(int i) {
        return C0206y.swapShort(this.buffer.getShort(i));
    }

    public int _getUnsignedMedium(int i) {
        return (getByte(i + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((getByte(i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public void _setByte(int i, int i8) {
        this.buffer.put(i, (byte) i8);
    }

    public void _setInt(int i, int i8) {
        this.buffer.putInt(i, i8);
    }

    public void _setLong(int i, long j7) {
        this.buffer.putLong(i, j7);
    }

    public void _setMedium(int i, int i8) {
        setByte(i, (byte) (i8 >>> 16));
        setByte(i + 1, (byte) (i8 >>> 8));
        setByte(i + 2, (byte) i8);
    }

    public void _setShort(int i, int i8) {
        this.buffer.putShort(i, (short) i8);
    }

    public C0187o alloc() {
        return this.alloc;
    }

    public ByteBuffer allocateDirect(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public byte[] array() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public int arrayOffset() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public int capacity() {
        return this.capacity;
    }

    public void deallocate() {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            this.buffer = null;
            if (!this.doNotFree) {
                freeDirect(byteBuffer);
            }
        }
    }

    public void freeDirect(ByteBuffer byteBuffer) {
        Y.freeDirectBuffer(byteBuffer);
    }

    public byte getByte(int i) {
        ensureAccessible();
        return _getByte(i);
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        checkDstIndex(i, i9, i8, nVar.capacity());
        if (nVar.hasArray()) {
            getBytes(i, nVar.array(), nVar.arrayOffset() + i8, i9);
        } else if (nVar.nioBufferCount() > 0) {
            for (ByteBuffer byteBuffer : nVar.nioBuffers(i8, i9)) {
                int remaining = byteBuffer.remaining();
                getBytes(i, byteBuffer);
                i += remaining;
            }
        } else {
            nVar.setBytes(i8, (C0185n) this, i, i9);
        }
        return this;
    }

    public int getInt(int i) {
        ensureAccessible();
        return _getInt(i);
    }

    public long getLong(int i) {
        ensureAccessible();
        return _getLong(i);
    }

    public short getShort(int i) {
        ensureAccessible();
        return _getShort(i);
    }

    public int getUnsignedMedium(int i) {
        ensureAccessible();
        return _getUnsignedMedium(i);
    }

    public boolean hasArray() {
        return false;
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
        return true;
    }

    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        checkIndex(i, i8);
        return ((ByteBuffer) this.buffer.duplicate().position(i).limit(i + i8)).slice();
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

    public C0185n readBytes(byte[] bArr, int i, int i8) {
        checkReadableBytes(i8);
        getBytes(this.readerIndex, bArr, i, i8, true);
        this.readerIndex += i8;
        return this;
    }

    public C0185n setByte(int i, int i8) {
        ensureAccessible();
        _setByte(i, i8);
        return this;
    }

    public void setByteBuffer(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBuffer2;
        if (z && (byteBuffer2 = this.buffer) != null) {
            if (this.doNotFree) {
                this.doNotFree = false;
            } else {
                freeDirect(byteBuffer2);
            }
        }
        this.buffer = byteBuffer;
        this.tmpNioBuf = null;
        this.capacity = byteBuffer.remaining();
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        checkSrcIndex(i, i9, i8, nVar.capacity());
        if (nVar.nioBufferCount() > 0) {
            for (ByteBuffer byteBuffer : nVar.nioBuffers(i8, i9)) {
                int remaining = byteBuffer.remaining();
                setBytes(i, byteBuffer);
                i += remaining;
            }
        } else {
            nVar.getBytes(i8, (C0185n) this, i, i9);
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
        int i8 = this.capacity;
        if (i == i8) {
            return this;
        }
        if (i <= i8) {
            trimIndicesToCapacity(i);
            i8 = i;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer allocateDirect = allocateDirect(i);
        byteBuffer.position(0).limit(i8);
        allocateDirect.position(0).limit(i8);
        allocateDirect.put(byteBuffer).clear();
        setByteBuffer(allocateDirect, true);
        return this;
    }

    private ByteBuffer internalNioBuffer() {
        ByteBuffer byteBuffer = this.tmpNioBuf;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer duplicate = this.buffer.duplicate();
        this.tmpNioBuf = duplicate;
        return duplicate;
    }

    public C0185n readBytes(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        checkReadableBytes(remaining);
        getBytes(this.readerIndex, byteBuffer, true);
        this.readerIndex += remaining;
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        checkSrcIndex(i, i9, i8, bArr.length);
        ByteBuffer internalNioBuffer = internalNioBuffer();
        internalNioBuffer.clear().position(i).limit(i + i9);
        internalNioBuffer.put(bArr, i8, i9);
        return this;
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        checkReadableBytes(i);
        int bytes = getBytes(this.readerIndex, gatheringByteChannel, i, true);
        this.readerIndex += bytes;
        return bytes;
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        getBytes(i, bArr, i8, i9, false);
        return this;
    }

    public M0(C0187o oVar, ByteBuffer byteBuffer, int i) {
        this(oVar, byteBuffer, i, false, true);
    }

    public void getBytes(int i, byte[] bArr, int i8, int i9, boolean z) {
        ByteBuffer byteBuffer;
        checkDstIndex(i, i9, i8, bArr.length);
        if (z) {
            byteBuffer = internalNioBuffer();
        } else {
            byteBuffer = this.buffer.duplicate();
        }
        byteBuffer.clear().position(i).limit(i + i9);
        byteBuffer.get(bArr, i8, i9);
    }

    public M0(C0187o oVar, ByteBuffer byteBuffer, int i, boolean z, boolean z6) {
        super(i);
        B.checkNotNull(oVar, "alloc");
        B.checkNotNull(byteBuffer, "initialBuffer");
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("initialBuffer is not a direct buffer.");
        } else if (!byteBuffer.isReadOnly()) {
            int remaining = byteBuffer.remaining();
            if (remaining <= i) {
                this.alloc = oVar;
                this.doNotFree = !z;
                setByteBuffer((z6 ? byteBuffer.slice() : byteBuffer).order(ByteOrder.BIG_ENDIAN), false);
                writerIndex(remaining);
                return;
            }
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", new Object[]{Integer.valueOf(remaining), Integer.valueOf(i)}));
        } else {
            throw new IllegalArgumentException("initialBuffer is a read-only buffer.");
        }
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        ensureAccessible();
        ByteBuffer internalNioBuffer = internalNioBuffer();
        if (byteBuffer == internalNioBuffer) {
            byteBuffer = byteBuffer.duplicate();
        }
        internalNioBuffer.clear().position(i).limit(byteBuffer.remaining() + i);
        internalNioBuffer.put(byteBuffer);
        return this;
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        getBytes(i, byteBuffer, false);
        return this;
    }

    public void getBytes(int i, ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBuffer2;
        checkIndex(i, byteBuffer.remaining());
        if (z) {
            byteBuffer2 = internalNioBuffer();
        } else {
            byteBuffer2 = this.buffer.duplicate();
        }
        byteBuffer2.clear().position(i).limit(byteBuffer.remaining() + i);
        byteBuffer.put(byteBuffer2);
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        ensureAccessible();
        ByteBuffer internalNioBuffer = internalNioBuffer();
        internalNioBuffer.clear().position(i).limit(i + i8);
        try {
            return scatteringByteChannel.read(internalNioBuffer);
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        return getBytes(i, gatheringByteChannel, i8, false);
    }

    private int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8, boolean z) {
        ByteBuffer byteBuffer;
        ensureAccessible();
        if (i8 == 0) {
            return 0;
        }
        if (z) {
            byteBuffer = internalNioBuffer();
        } else {
            byteBuffer = this.buffer.duplicate();
        }
        byteBuffer.clear().position(i).limit(i + i8);
        return gatheringByteChannel.write(byteBuffer);
    }
}
