package S5;

import g6.Y;

public final class V0 extends C0179k {
    public V0(C0159a aVar) {
        super(aVar);
    }

    private static long addr(C0159a aVar, int i) {
        return aVar.memoryAddress() + ((long) i);
    }

    public int _getInt(C0159a aVar, int i) {
        return Y.getInt(addr(aVar, i));
    }

    public long _getLong(C0159a aVar, int i) {
        return Y.getLong(addr(aVar, i));
    }

    public short _getShort(C0159a aVar, int i) {
        return Y.getShort(addr(aVar, i));
    }

    public void _setInt(C0159a aVar, int i, int i8) {
        Y.putInt(addr(aVar, i), i8);
    }

    public void _setLong(C0159a aVar, int i, long j7) {
        Y.putLong(addr(aVar, i), j7);
    }

    public void _setShort(C0159a aVar, int i, short s8) {
        Y.putShort(addr(aVar, i), s8);
    }
}
