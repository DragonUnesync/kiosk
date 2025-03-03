package S5;

import g6.Y;
import java.nio.ByteBuffer;

public class Q0 extends M0 {
    long memoryAddress;

    public Q0(C0187o oVar, int i, int i8) {
        super(oVar, i, i8);
    }

    public byte _getByte(int i) {
        return U0.getByte(addr(i));
    }

    public int _getInt(int i) {
        return U0.getInt(addr(i));
    }

    public int _getIntLE(int i) {
        return U0.getIntLE(addr(i));
    }

    public long _getLong(int i) {
        return U0.getLong(addr(i));
    }

    public long _getLongLE(int i) {
        return U0.getLongLE(addr(i));
    }

    public short _getShort(int i) {
        return U0.getShort(addr(i));
    }

    public short _getShortLE(int i) {
        return U0.getShortLE(addr(i));
    }

    public int _getUnsignedMedium(int i) {
        return U0.getUnsignedMedium(addr(i));
    }

    public void _setByte(int i, int i8) {
        U0.setByte(addr(i), i8);
    }

    public void _setInt(int i, int i8) {
        U0.setInt(addr(i), i8);
    }

    public void _setLong(int i, long j7) {
        U0.setLong(addr(i), j7);
    }

    public void _setMedium(int i, int i8) {
        U0.setMedium(addr(i), i8);
    }

    public void _setShort(int i, int i8) {
        U0.setShort(addr(i), i8);
    }

    public final long addr(int i) {
        return this.memoryAddress + ((long) i);
    }

    public byte getByte(int i) {
        checkIndex(i);
        return _getByte(i);
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        U0.getBytes((C0159a) this, addr(i), i, nVar, i8, i9);
        return this;
    }

    public int getInt(int i) {
        checkIndex(i, 4);
        return _getInt(i);
    }

    public long getLong(int i) {
        checkIndex(i, 8);
        return _getLong(i);
    }

    public short getShort(int i) {
        checkIndex(i, 2);
        return _getShort(i);
    }

    public int getUnsignedMedium(int i) {
        checkIndex(i, 3);
        return _getUnsignedMedium(i);
    }

    public boolean hasMemoryAddress() {
        return true;
    }

    public long memoryAddress() {
        ensureAccessible();
        return this.memoryAddress;
    }

    public C0 newSwappedByteBuf() {
        if (Y.isUnaligned()) {
            return new V0(this);
        }
        return super.newSwappedByteBuf();
    }

    public C0185n setByte(int i, int i8) {
        checkIndex(i);
        _setByte(i, i8);
        return this;
    }

    public final void setByteBuffer(ByteBuffer byteBuffer, boolean z) {
        super.setByteBuffer(byteBuffer, z);
        this.memoryAddress = Y.directBufferAddress(byteBuffer);
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        U0.setBytes((C0159a) this, addr(i), i, nVar, i8, i9);
        return this;
    }

    public C0185n setInt(int i, int i8) {
        checkIndex(i, 4);
        _setInt(i, i8);
        return this;
    }

    public C0185n setLong(int i, long j7) {
        checkIndex(i, 8);
        _setLong(i, j7);
        return this;
    }

    public C0185n setMedium(int i, int i8) {
        checkIndex(i, 3);
        _setMedium(i, i8);
        return this;
    }

    public C0185n setShort(int i, int i8) {
        checkIndex(i, 2);
        _setShort(i, i8);
        return this;
    }

    public C0185n setZero(int i, int i8) {
        checkIndex(i, i8);
        U0.setZero(addr(i), i8);
        return this;
    }

    public Q0(C0187o oVar, ByteBuffer byteBuffer, int i) {
        super(oVar, byteBuffer, i, false, true);
    }

    public void getBytes(int i, byte[] bArr, int i8, int i9, boolean z) {
        U0.getBytes((C0159a) this, addr(i), i, bArr, i8, i9);
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        U0.setBytes((C0159a) this, addr(i), i, bArr, i8, i9);
        return this;
    }

    public void getBytes(int i, ByteBuffer byteBuffer, boolean z) {
        U0.getBytes(this, addr(i), i, byteBuffer);
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        U0.setBytes(this, addr(i), i, byteBuffer);
        return this;
    }
}
