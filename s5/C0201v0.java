package S5;

import g6.C0965A;
import g6.C0989w;
import g6.Y;

/* renamed from: S5.v0  reason: case insensitive filesystem */
public final class C0201v0 extends C0190p0 {
    private static final C0965A RECYCLER = C0965A.newPool(new C0199u0());

    public /* synthetic */ C0201v0(C0989w wVar, int i, C0199u0 u0Var) {
        this(wVar, i);
    }

    public static C0201v0 newUnsafeInstance(int i) {
        C0201v0 v0Var = (C0201v0) RECYCLER.get();
        v0Var.reuse(i);
        return v0Var;
    }

    public byte _getByte(int i) {
        return U0.getByte((byte[]) this.memory, idx(i));
    }

    public int _getInt(int i) {
        return U0.getInt((byte[]) this.memory, idx(i));
    }

    public int _getIntLE(int i) {
        return U0.getIntLE((byte[]) this.memory, idx(i));
    }

    public long _getLong(int i) {
        return U0.getLong((byte[]) this.memory, idx(i));
    }

    public long _getLongLE(int i) {
        return U0.getLongLE((byte[]) this.memory, idx(i));
    }

    public short _getShort(int i) {
        return U0.getShort((byte[]) this.memory, idx(i));
    }

    public short _getShortLE(int i) {
        return U0.getShortLE((byte[]) this.memory, idx(i));
    }

    public int _getUnsignedMedium(int i) {
        return U0.getUnsignedMedium((byte[]) this.memory, idx(i));
    }

    public void _setByte(int i, int i8) {
        U0.setByte((byte[]) this.memory, idx(i), i8);
    }

    public void _setInt(int i, int i8) {
        U0.setInt((byte[]) this.memory, idx(i), i8);
    }

    public void _setLong(int i, long j7) {
        U0.setLong((byte[]) this.memory, idx(i), j7);
    }

    public void _setMedium(int i, int i8) {
        U0.setMedium((byte[]) this.memory, idx(i), i8);
    }

    public void _setShort(int i, int i8) {
        U0.setShort((byte[]) this.memory, idx(i), i8);
    }

    @Deprecated
    public C0 newSwappedByteBuf() {
        if (Y.isUnaligned()) {
            return new W0(this);
        }
        return super.newSwappedByteBuf();
    }

    public C0185n setZero(int i, int i8) {
        if (Y.javaVersion() < 7) {
            return super.setZero(i, i8);
        }
        checkIndex(i, i8);
        U0.setZero((byte[]) this.memory, idx(i), i8);
        return this;
    }

    private C0201v0(C0989w wVar, int i) {
        super(wVar, i);
    }
}
