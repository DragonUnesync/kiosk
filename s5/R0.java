package S5;

import g6.Y;

public class R0 extends O0 {
    public R0(C0187o oVar, int i, int i8) {
        super(oVar, i, i8);
    }

    public byte _getByte(int i) {
        return U0.getByte(this.array, i);
    }

    public int _getInt(int i) {
        return U0.getInt(this.array, i);
    }

    public int _getIntLE(int i) {
        return U0.getIntLE(this.array, i);
    }

    public long _getLong(int i) {
        return U0.getLong(this.array, i);
    }

    public long _getLongLE(int i) {
        return U0.getLongLE(this.array, i);
    }

    public short _getShort(int i) {
        return U0.getShort(this.array, i);
    }

    public short _getShortLE(int i) {
        return U0.getShortLE(this.array, i);
    }

    public int _getUnsignedMedium(int i) {
        return U0.getUnsignedMedium(this.array, i);
    }

    public void _setByte(int i, int i8) {
        U0.setByte(this.array, i, i8);
    }

    public void _setInt(int i, int i8) {
        U0.setInt(this.array, i, i8);
    }

    public void _setLong(int i, long j7) {
        U0.setLong(this.array, i, j7);
    }

    public void _setMedium(int i, int i8) {
        U0.setMedium(this.array, i, i8);
    }

    public void _setShort(int i, int i8) {
        U0.setShort(this.array, i, i8);
    }

    public byte[] allocateArray(int i) {
        return Y.allocateUninitializedArray(i);
    }

    public byte getByte(int i) {
        checkIndex(i);
        return _getByte(i);
    }

    public int getInt(int i) {
        checkIndex(i, 4);
        return _getInt(i);
    }

    public int getIntLE(int i) {
        checkIndex(i, 4);
        return _getIntLE(i);
    }

    public long getLong(int i) {
        checkIndex(i, 8);
        return _getLong(i);
    }

    public long getLongLE(int i) {
        checkIndex(i, 8);
        return _getLongLE(i);
    }

    public short getShort(int i) {
        checkIndex(i, 2);
        return _getShort(i);
    }

    public short getShortLE(int i) {
        checkIndex(i, 2);
        return _getShortLE(i);
    }

    public int getUnsignedMedium(int i) {
        checkIndex(i, 3);
        return _getUnsignedMedium(i);
    }

    @Deprecated
    public C0 newSwappedByteBuf() {
        if (Y.isUnaligned()) {
            return new W0(this);
        }
        return super.newSwappedByteBuf();
    }

    public C0185n setByte(int i, int i8) {
        checkIndex(i);
        _setByte(i, i8);
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
        if (Y.javaVersion() < 7) {
            return super.setZero(i, i8);
        }
        checkIndex(i, i8);
        U0.setZero(this.array, i, i8);
        return this;
    }
}
