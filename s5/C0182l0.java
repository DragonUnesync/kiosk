package S5;

import g6.C0965A;
import g6.C0989w;
import java.nio.ByteBuffer;
import org.altbeacon.bluetooth.Pdu;

/* renamed from: S5.l0  reason: case insensitive filesystem */
public final class C0182l0 extends C0170f0 {
    private static final C0965A RECYCLER = C0965A.newPool(new C0180k0());

    public /* synthetic */ C0182l0(C0989w wVar, int i, C0180k0 k0Var) {
        this(wVar, i);
    }

    public static C0182l0 newInstance(int i) {
        C0182l0 l0Var = (C0182l0) RECYCLER.get();
        l0Var.reuse(i);
        return l0Var;
    }

    public byte _getByte(int i) {
        return ((ByteBuffer) this.memory).get(idx(i));
    }

    public int _getInt(int i) {
        return ((ByteBuffer) this.memory).getInt(idx(i));
    }

    public int _getIntLE(int i) {
        return C0206y.swapInt(_getInt(i));
    }

    public long _getLong(int i) {
        return ((ByteBuffer) this.memory).getLong(idx(i));
    }

    public long _getLongLE(int i) {
        return C0206y.swapLong(_getLong(i));
    }

    public short _getShort(int i) {
        return ((ByteBuffer) this.memory).getShort(idx(i));
    }

    public short _getShortLE(int i) {
        return C0206y.swapShort(_getShort(i));
    }

    public int _getUnsignedMedium(int i) {
        int idx = idx(i);
        return (((ByteBuffer) this.memory).get(idx + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((((ByteBuffer) this.memory).get(idx) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((((ByteBuffer) this.memory).get(idx + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    public void _setByte(int i, int i8) {
        ((ByteBuffer) this.memory).put(idx(i), (byte) i8);
    }

    public void _setInt(int i, int i8) {
        ((ByteBuffer) this.memory).putInt(idx(i), i8);
    }

    public void _setLong(int i, long j7) {
        ((ByteBuffer) this.memory).putLong(idx(i), j7);
    }

    public void _setMedium(int i, int i8) {
        int idx = idx(i);
        ((ByteBuffer) this.memory).put(idx, (byte) (i8 >>> 16));
        ((ByteBuffer) this.memory).put(idx + 1, (byte) (i8 >>> 8));
        ((ByteBuffer) this.memory).put(idx + 2, (byte) i8);
    }

    public void _setShort(int i, int i8) {
        ((ByteBuffer) this.memory).putShort(idx(i), (short) i8);
    }

    public byte[] array() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public int arrayOffset() {
        throw new UnsupportedOperationException("direct buffer");
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

    public boolean hasArray() {
        return false;
    }

    public boolean hasMemoryAddress() {
        return false;
    }

    public boolean isDirect() {
        return true;
    }

    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }

    public C0185n readBytes(byte[] bArr, int i, int i8) {
        checkDstIndex(i8, i, bArr.length);
        _internalNioBuffer(this.readerIndex, i8, false).get(bArr, i, i8);
        this.readerIndex += i8;
        return this;
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        checkSrcIndex(i, i9, i8, nVar.capacity());
        if (nVar.hasArray()) {
            setBytes(i, nVar.array(), nVar.arrayOffset() + i8, i9);
        } else if (nVar.nioBufferCount() > 0) {
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

    private C0182l0(C0989w wVar, int i) {
        super(wVar, i);
    }

    public ByteBuffer newInternalNioBuffer(ByteBuffer byteBuffer) {
        return byteBuffer.duplicate();
    }

    public C0185n readBytes(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        checkReadableBytes(remaining);
        byteBuffer.put(_internalNioBuffer(this.readerIndex, remaining, false));
        this.readerIndex += remaining;
        return this;
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        checkDstIndex(i, i9, i8, bArr.length);
        _internalNioBuffer(i, i9, true).get(bArr, i8, i9);
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        checkSrcIndex(i, i9, i8, bArr.length);
        _internalNioBuffer(i, i9, false).put(bArr, i8, i9);
        return this;
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        byteBuffer.put(duplicateInternalNioBuffer(i, byteBuffer.remaining()));
        return this;
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        checkIndex(i, remaining);
        ByteBuffer internalNioBuffer = internalNioBuffer();
        if (byteBuffer == internalNioBuffer) {
            byteBuffer = byteBuffer.duplicate();
        }
        int idx = idx(i);
        internalNioBuffer.limit(remaining + idx).position(idx);
        internalNioBuffer.put(byteBuffer);
        return this;
    }
}
