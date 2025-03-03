package S5;

import g6.Y;
import java.nio.ByteOrder;

/* renamed from: S5.k  reason: case insensitive filesystem */
public abstract class C0179k extends C0 {
    private final boolean nativeByteOrder;
    private final C0159a wrapped;

    public C0179k(C0159a aVar) {
        super(aVar);
        boolean z;
        this.wrapped = aVar;
        boolean z6 = Y.BIG_ENDIAN_NATIVE_ORDER;
        boolean z8 = false;
        if (order() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        this.nativeByteOrder = z6 == z ? true : z8;
    }

    public abstract int _getInt(C0159a aVar, int i);

    public abstract long _getLong(C0159a aVar, int i);

    public abstract short _getShort(C0159a aVar, int i);

    public abstract void _setInt(C0159a aVar, int i, int i8);

    public abstract void _setLong(C0159a aVar, int i, long j7);

    public abstract void _setShort(C0159a aVar, int i, short s8);

    public final int getInt(int i) {
        this.wrapped.checkIndex(i, 4);
        int _getInt = _getInt(this.wrapped, i);
        if (this.nativeByteOrder) {
            return _getInt;
        }
        return Integer.reverseBytes(_getInt);
    }

    public final long getLong(int i) {
        this.wrapped.checkIndex(i, 8);
        long _getLong = _getLong(this.wrapped, i);
        if (this.nativeByteOrder) {
            return _getLong;
        }
        return Long.reverseBytes(_getLong);
    }

    public final short getShort(int i) {
        this.wrapped.checkIndex(i, 2);
        short _getShort = _getShort(this.wrapped, i);
        if (this.nativeByteOrder) {
            return _getShort;
        }
        return Short.reverseBytes(_getShort);
    }

    public final long getUnsignedInt(int i) {
        return ((long) getInt(i)) & 4294967295L;
    }

    public final int getUnsignedShort(int i) {
        return getShort(i) & 65535;
    }

    public final C0185n setInt(int i, int i8) {
        this.wrapped.checkIndex(i, 4);
        C0159a aVar = this.wrapped;
        if (!this.nativeByteOrder) {
            i8 = Integer.reverseBytes(i8);
        }
        _setInt(aVar, i, i8);
        return this;
    }

    public final C0185n setLong(int i, long j7) {
        this.wrapped.checkIndex(i, 8);
        C0159a aVar = this.wrapped;
        if (!this.nativeByteOrder) {
            j7 = Long.reverseBytes(j7);
        }
        _setLong(aVar, i, j7);
        return this;
    }

    public final C0185n setShort(int i, int i8) {
        this.wrapped.checkIndex(i, 2);
        C0159a aVar = this.wrapped;
        short s8 = (short) i8;
        if (!this.nativeByteOrder) {
            s8 = Short.reverseBytes(s8);
        }
        _setShort(aVar, i, s8);
        return this;
    }

    public final C0185n writeInt(int i) {
        this.wrapped.ensureWritable0(4);
        C0159a aVar = this.wrapped;
        int i8 = aVar.writerIndex;
        if (!this.nativeByteOrder) {
            i = Integer.reverseBytes(i);
        }
        _setInt(aVar, i8, i);
        this.wrapped.writerIndex += 4;
        return this;
    }

    public final C0185n writeLong(long j7) {
        this.wrapped.ensureWritable0(8);
        C0159a aVar = this.wrapped;
        int i = aVar.writerIndex;
        if (!this.nativeByteOrder) {
            j7 = Long.reverseBytes(j7);
        }
        _setLong(aVar, i, j7);
        this.wrapped.writerIndex += 8;
        return this;
    }

    public final C0185n writeShort(int i) {
        this.wrapped.ensureWritable0(2);
        C0159a aVar = this.wrapped;
        int i8 = aVar.writerIndex;
        short s8 = (short) i;
        if (!this.nativeByteOrder) {
            s8 = Short.reverseBytes(s8);
        }
        _setShort(aVar, i8, s8);
        this.wrapped.writerIndex += 2;
        return this;
    }
}
