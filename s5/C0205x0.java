package S5;

import g6.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import org.altbeacon.bluetooth.Pdu;

/* renamed from: S5.x0  reason: case insensitive filesystem */
public class C0205x0 extends C0175i {
    private final C0187o allocator;
    protected final ByteBuffer buffer;
    private ByteBuffer tmpNioBuf;

    public C0205x0(C0187o oVar, ByteBuffer byteBuffer) {
        super(byteBuffer.remaining());
        if (byteBuffer.isReadOnly()) {
            this.allocator = oVar;
            ByteBuffer order = byteBuffer.slice().order(ByteOrder.BIG_ENDIAN);
            this.buffer = order;
            writerIndex(order.limit());
            return;
        }
        throw new IllegalArgumentException("must be a readonly buffer: " + n0.simpleClassName((Object) byteBuffer));
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
        return this.allocator;
    }

    public byte[] array() {
        return this.buffer.array();
    }

    public int arrayOffset() {
        return this.buffer.arrayOffset();
    }

    public int capacity() {
        return maxCapacity();
    }

    public void deallocate() {
    }

    public C0185n ensureWritable(int i) {
        throw new ReadOnlyBufferException();
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
        return this.buffer.hasArray();
    }

    public boolean hasMemoryAddress() {
        return false;
    }

    public final ByteBuffer internalNioBuffer() {
        ByteBuffer byteBuffer = this.tmpNioBuf;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer duplicate = this.buffer.duplicate();
        this.tmpNioBuf = duplicate;
        return duplicate;
    }

    public final boolean isContiguous() {
        return true;
    }

    public boolean isDirect() {
        return this.buffer.isDirect();
    }

    public boolean isReadOnly() {
        return this.buffer.isReadOnly();
    }

    public boolean isWritable(int i) {
        return false;
    }

    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        checkIndex(i, i8);
        return (ByteBuffer) this.buffer.duplicate().position(i).limit(i + i8);
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

    public C0185n unwrap() {
        return null;
    }

    public C0185n capacity(int i) {
        throw new ReadOnlyBufferException();
    }

    public int ensureWritable(int i, boolean z) {
        return 1;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        throw new ReadOnlyBufferException();
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        ensureAccessible();
        return (ByteBuffer) internalNioBuffer().clear().position(i).limit(i + i8);
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        throw new ReadOnlyBufferException();
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        throw new ReadOnlyBufferException();
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        checkDstIndex(i, i9, i8, bArr.length);
        ByteBuffer internalNioBuffer = internalNioBuffer();
        internalNioBuffer.clear().position(i).limit(i + i9);
        internalNioBuffer.get(bArr, i8, i9);
        return this;
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        checkIndex(i, byteBuffer.remaining());
        ByteBuffer internalNioBuffer = internalNioBuffer();
        internalNioBuffer.clear().position(i).limit(byteBuffer.remaining() + i);
        byteBuffer.put(internalNioBuffer);
        return this;
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        ensureAccessible();
        if (i8 == 0) {
            return 0;
        }
        ByteBuffer internalNioBuffer = internalNioBuffer();
        internalNioBuffer.clear().position(i).limit(i + i8);
        return gatheringByteChannel.write(internalNioBuffer);
    }
}
