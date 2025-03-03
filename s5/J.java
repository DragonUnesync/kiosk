package S5;

import N.e;
import g6.C0978k;
import g6.d0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.util.Collections;
import org.altbeacon.bluetooth.Pdu;

public final class J extends C0175i {
    private static final C0185n[] EMPTY = {D0.EMPTY_BUFFER};
    private final C0187o allocator;
    private final C0185n[] buffers;
    private final int capacity;
    private final boolean direct;
    private final int nioBufferCount;
    private final ByteOrder order;

    public J(C0187o oVar, C0185n... nVarArr) {
        super(Integer.MAX_VALUE);
        int i = 1;
        if (nVarArr.length == 0) {
            this.buffers = EMPTY;
            this.order = ByteOrder.BIG_ENDIAN;
            this.nioBufferCount = 1;
            this.capacity = 0;
            this.direct = D0.EMPTY_BUFFER.isDirect();
        } else {
            C0185n nVar = nVarArr[0];
            this.buffers = nVarArr;
            int nioBufferCount2 = nVar.nioBufferCount();
            int readableBytes = nVar.readableBytes();
            this.order = nVar.order();
            boolean z = true;
            while (i < nVarArr.length) {
                C0185n nVar2 = nVarArr[i];
                if (nVar2.order() == this.order) {
                    nioBufferCount2 += nVar2.nioBufferCount();
                    readableBytes += nVar2.readableBytes();
                    if (!nVar2.isDirect()) {
                        z = false;
                    }
                    i++;
                } else {
                    throw new IllegalArgumentException("All ByteBufs need to have same ByteOrder");
                }
            }
            this.nioBufferCount = nioBufferCount2;
            this.capacity = readableBytes;
            this.direct = z;
        }
        setIndex(0, capacity());
        this.allocator = oVar;
    }

    private C0185n buffer(int i) {
        C0185n nVar = this.buffers[i];
        if (nVar instanceof I) {
            return ((I) nVar).buf;
        }
        return nVar;
    }

    private I findComponent(int i) {
        I i8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            C0185n[] nVarArr = this.buffers;
            if (i9 < nVarArr.length) {
                C0185n nVar = nVarArr[i9];
                if (nVar instanceof I) {
                    I i11 = (I) nVar;
                    i8 = i11;
                    nVar = i11.buf;
                } else {
                    i8 = null;
                }
                i10 += nVar.readableBytes();
                if (i >= i10) {
                    i9++;
                } else if (i8 != null) {
                    return i8;
                } else {
                    I i12 = new I(i9, i10 - nVar.readableBytes(), nVar);
                    this.buffers[i9] = i12;
                    return i12;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public byte _getByte(int i) {
        I findComponent = findComponent(i);
        return findComponent.buf.getByte(i - findComponent.offset);
    }

    public int _getInt(int i) {
        I findComponent = findComponent(i);
        if (i + 4 <= findComponent.endOffset) {
            return findComponent.buf.getInt(i - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (_getShort(i + 2) & 65535) | ((_getShort(i) & 65535) << 16);
        }
        return ((_getShort(i + 2) & 65535) << 16) | (_getShort(i) & 65535);
    }

    public int _getIntLE(int i) {
        I findComponent = findComponent(i);
        if (i + 4 <= findComponent.endOffset) {
            return findComponent.buf.getIntLE(i - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return ((_getShortLE(i + 2) & 65535) << 16) | (_getShortLE(i) & 65535);
        }
        return (_getShortLE(i + 2) & 65535) | ((_getShortLE(i) & 65535) << 16);
    }

    public long _getLong(int i) {
        I findComponent = findComponent(i);
        if (i + 8 <= findComponent.endOffset) {
            return findComponent.buf.getLong(i - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return ((((long) _getInt(i)) & 4294967295L) << 32) | (((long) _getInt(i + 4)) & 4294967295L);
        }
        return (((long) _getInt(i)) & 4294967295L) | ((4294967295L & ((long) _getInt(i + 4))) << 32);
    }

    public long _getLongLE(int i) {
        I findComponent = findComponent(i);
        if (i + 8 <= findComponent.endOffset) {
            return findComponent.buf.getLongLE(i - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (((long) _getIntLE(i)) & 4294967295L) | ((4294967295L & ((long) _getIntLE(i + 4))) << 32);
        }
        return ((((long) _getIntLE(i)) & 4294967295L) << 32) | (((long) _getIntLE(i + 4)) & 4294967295L);
    }

    public short _getShort(int i) {
        I findComponent = findComponent(i);
        if (i + 2 <= findComponent.endOffset) {
            return findComponent.buf.getShort(i - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (short) ((_getByte(i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((_getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8));
        }
        return (short) (((_getByte(i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (_getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE));
    }

    public short _getShortLE(int i) {
        I findComponent = findComponent(i);
        if (i + 2 <= findComponent.endOffset) {
            return findComponent.buf.getShortLE(i - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (short) (((_getByte(i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (_getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE));
        }
        return (short) ((_getByte(i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((_getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8));
    }

    public int _getUnsignedMedium(int i) {
        I findComponent = findComponent(i);
        if (i + 3 <= findComponent.endOffset) {
            return findComponent.buf.getUnsignedMedium(i - findComponent.offset);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (_getByte(i + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((_getShort(i) & 65535) << 8);
        }
        return ((_getByte(i + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | (_getShort(i) & 65535);
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
        int length = this.buffers.length;
        if (length == 0) {
            return C0978k.EMPTY_BYTES;
        }
        if (length == 1) {
            return buffer(0).array();
        }
        throw new UnsupportedOperationException();
    }

    public int arrayOffset() {
        int length = this.buffers.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return buffer(0).arrayOffset();
        }
        throw new UnsupportedOperationException();
    }

    public int capacity() {
        return this.capacity;
    }

    public void deallocate() {
        for (int i = 0; i < this.buffers.length; i++) {
            buffer(i).release();
        }
    }

    public byte getByte(int i) {
        return _getByte(i);
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        checkDstIndex(i, i9, i8, bArr.length);
        if (i9 == 0) {
            return this;
        }
        I findComponent = findComponent(i);
        int access$200 = findComponent.index;
        int access$000 = findComponent.offset;
        C0185n nVar = findComponent.buf;
        while (true) {
            int i10 = i - access$000;
            int min = Math.min(i9, nVar.readableBytes() - i10);
            nVar.getBytes(i10, bArr, i8, min);
            i += min;
            i8 += min;
            i9 -= min;
            access$000 += nVar.readableBytes();
            if (i9 <= 0) {
                return this;
            }
            access$200++;
            nVar = buffer(access$200);
        }
    }

    public boolean hasArray() {
        int length = this.buffers.length;
        if (length == 0) {
            return true;
        }
        if (length != 1) {
            return false;
        }
        return buffer(0).hasArray();
    }

    public boolean hasMemoryAddress() {
        int length = this.buffers.length;
        if (length == 0) {
            return D0.EMPTY_BUFFER.hasMemoryAddress();
        }
        if (length != 1) {
            return false;
        }
        return buffer(0).hasMemoryAddress();
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        if (this.buffers.length == 1) {
            return buffer(0).internalNioBuffer(i, i8);
        }
        throw new UnsupportedOperationException();
    }

    public boolean isDirect() {
        return this.direct;
    }

    public boolean isWritable(int i) {
        return false;
    }

    public int maxCapacity() {
        return this.capacity;
    }

    public long memoryAddress() {
        int length = this.buffers.length;
        if (length == 0) {
            return D0.EMPTY_BUFFER.memoryAddress();
        }
        if (length == 1) {
            return buffer(0).memoryAddress();
        }
        throw new UnsupportedOperationException();
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        checkIndex(i, i8);
        if (this.buffers.length == 1) {
            C0185n buffer = buffer(0);
            if (buffer.nioBufferCount() == 1) {
                return buffer.nioBuffer(i, i8);
            }
        }
        ByteBuffer order2 = ByteBuffer.allocate(i8).order(order());
        ByteBuffer[] nioBuffers = nioBuffers(i, i8);
        for (ByteBuffer put : nioBuffers) {
            order2.put(put);
        }
        order2.flip();
        return order2;
    }

    public int nioBufferCount() {
        return this.nioBufferCount;
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        checkIndex(i, i8);
        if (i8 == 0) {
            return C0978k.EMPTY_BYTE_BUFFERS;
        }
        d0 newInstance = d0.newInstance(this.buffers.length);
        try {
            I findComponent = findComponent(i);
            int access$200 = findComponent.index;
            int access$000 = findComponent.offset;
            C0185n nVar = findComponent.buf;
            while (true) {
                int i9 = i - access$000;
                int min = Math.min(i8, nVar.readableBytes() - i9);
                int nioBufferCount2 = nVar.nioBufferCount();
                if (nioBufferCount2 != 0) {
                    if (nioBufferCount2 != 1) {
                        Collections.addAll(newInstance, nVar.nioBuffers(i9, min));
                    } else {
                        newInstance.add(nVar.nioBuffer(i9, min));
                    }
                    i += min;
                    i8 -= min;
                    access$000 += nVar.readableBytes();
                    if (i8 <= 0) {
                        ByteBuffer[] byteBufferArr = (ByteBuffer[]) newInstance.toArray(C0978k.EMPTY_BYTE_BUFFERS);
                        newInstance.recycle();
                        return byteBufferArr;
                    }
                    access$200++;
                    nVar = buffer(access$200);
                } else {
                    throw new UnsupportedOperationException();
                }
            }
        } catch (Throwable th) {
            newInstance.recycle();
            throw th;
        }
    }

    public ByteOrder order() {
        return this.order;
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

    public String toString() {
        String aVar = super.toString();
        StringBuilder B8 = e.B(aVar.substring(0, aVar.length() - 1), ", components=");
        B8.append(this.buffers.length);
        B8.append(')');
        return B8.toString();
    }

    public C0185n unwrap() {
        return null;
    }

    public C0185n capacity(int i) {
        throw new ReadOnlyBufferException();
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        throw new ReadOnlyBufferException();
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        throw new ReadOnlyBufferException();
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        throw new ReadOnlyBufferException();
    }

    /* JADX INFO: finally extract failed */
    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        checkIndex(i, remaining);
        if (remaining == 0) {
            return this;
        }
        try {
            I findComponent = findComponent(i);
            int access$200 = findComponent.index;
            int access$000 = findComponent.offset;
            C0185n nVar = findComponent.buf;
            while (true) {
                int i8 = i - access$000;
                int min = Math.min(remaining, nVar.readableBytes() - i8);
                byteBuffer.limit(byteBuffer.position() + min);
                nVar.getBytes(i8, byteBuffer);
                i += min;
                remaining -= min;
                access$000 += nVar.readableBytes();
                if (remaining <= 0) {
                    byteBuffer.limit(limit);
                    return this;
                }
                access$200++;
                nVar = buffer(access$200);
            }
        } catch (Throwable th) {
            byteBuffer.limit(limit);
            throw th;
        }
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        checkDstIndex(i, i9, i8, nVar.capacity());
        if (i9 == 0) {
            return this;
        }
        I findComponent = findComponent(i);
        int access$200 = findComponent.index;
        int access$000 = findComponent.offset;
        C0185n nVar2 = findComponent.buf;
        while (true) {
            int i10 = i - access$000;
            int min = Math.min(i9, nVar2.readableBytes() - i10);
            nVar2.getBytes(i10, nVar, i8, min);
            i += min;
            i8 += min;
            i9 -= min;
            access$000 += nVar2.readableBytes();
            if (i9 <= 0) {
                return this;
            }
            access$200++;
            nVar2 = buffer(access$200);
        }
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        if (nioBufferCount() == 1) {
            return gatheringByteChannel.write(internalNioBuffer(i, i8));
        }
        long write = gatheringByteChannel.write(nioBuffers(i, i8));
        if (write > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) write;
    }
}
