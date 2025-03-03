package S5;

public class P0 extends C0177j {
    public P0(C0159a aVar, int i, int i8) {
        super(aVar, i, i8);
    }

    public byte _getByte(int i) {
        return unwrap()._getByte(idx(i));
    }

    public int _getInt(int i) {
        return unwrap()._getInt(idx(i));
    }

    public int _getIntLE(int i) {
        return unwrap()._getIntLE(idx(i));
    }

    public long _getLong(int i) {
        return unwrap()._getLong(idx(i));
    }

    public long _getLongLE(int i) {
        return unwrap()._getLongLE(idx(i));
    }

    public short _getShort(int i) {
        return unwrap()._getShort(idx(i));
    }

    public short _getShortLE(int i) {
        return unwrap()._getShortLE(idx(i));
    }

    public int _getUnsignedMedium(int i) {
        return unwrap()._getUnsignedMedium(idx(i));
    }

    public void _setByte(int i, int i8) {
        unwrap()._setByte(idx(i), i8);
    }

    public void _setInt(int i, int i8) {
        unwrap()._setInt(idx(i), i8);
    }

    public void _setLong(int i, long j7) {
        unwrap()._setLong(idx(i), j7);
    }

    public void _setMedium(int i, int i8) {
        unwrap()._setMedium(idx(i), i8);
    }

    public void _setShort(int i, int i8) {
        unwrap()._setShort(idx(i), i8);
    }

    public int capacity() {
        return maxCapacity();
    }

    public C0159a unwrap() {
        return (C0159a) super.unwrap();
    }
}
