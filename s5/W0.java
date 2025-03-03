package S5;

import g6.Y;

public final class W0 extends C0179k {
    public W0(C0159a aVar) {
        super(aVar);
    }

    private static int idx(C0185n nVar, int i) {
        return nVar.arrayOffset() + i;
    }

    public int _getInt(C0159a aVar, int i) {
        return Y.getInt(aVar.array(), idx(aVar, i));
    }

    public long _getLong(C0159a aVar, int i) {
        return Y.getLong(aVar.array(), idx(aVar, i));
    }

    public short _getShort(C0159a aVar, int i) {
        return Y.getShort(aVar.array(), idx(aVar, i));
    }

    public void _setInt(C0159a aVar, int i, int i8) {
        Y.putInt(aVar.array(), idx(aVar, i), i8);
    }

    public void _setLong(C0159a aVar, int i, long j7) {
        Y.putLong(aVar.array(), idx(aVar, i), j7);
    }

    public void _setShort(C0159a aVar, int i, short s8) {
        Y.putShort(aVar.array(), idx(aVar, i), s8);
    }
}
