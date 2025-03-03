package S5;

import g6.C0965A;
import g6.C0989w;
import g6.Y;
import java.nio.ByteBuffer;

/* renamed from: S5.p0  reason: case insensitive filesystem */
public class C0190p0 extends C0170f0 {
    private static final C0965A RECYCLER = C0965A.newPool(new C0188o0());

    public C0190p0(C0989w wVar, int i) {
        super(wVar, i);
    }

    public static C0190p0 newInstance(int i) {
        C0190p0 p0Var = (C0190p0) RECYCLER.get();
        p0Var.reuse(i);
        return p0Var;
    }

    public byte _getByte(int i) {
        return K.getByte((byte[]) this.memory, idx(i));
    }

    public int _getInt(int i) {
        return K.getInt((byte[]) this.memory, idx(i));
    }

    public int _getIntLE(int i) {
        return K.getIntLE((byte[]) this.memory, idx(i));
    }

    public long _getLong(int i) {
        return K.getLong((byte[]) this.memory, idx(i));
    }

    public long _getLongLE(int i) {
        return K.getLongLE((byte[]) this.memory, idx(i));
    }

    public short _getShort(int i) {
        return K.getShort((byte[]) this.memory, idx(i));
    }

    public short _getShortLE(int i) {
        return K.getShortLE((byte[]) this.memory, idx(i));
    }

    public int _getUnsignedMedium(int i) {
        return K.getUnsignedMedium((byte[]) this.memory, idx(i));
    }

    public void _setByte(int i, int i8) {
        K.setByte((byte[]) this.memory, idx(i), i8);
    }

    public void _setInt(int i, int i8) {
        K.setInt((byte[]) this.memory, idx(i), i8);
    }

    public void _setLong(int i, long j7) {
        K.setLong((byte[]) this.memory, idx(i), j7);
    }

    public void _setMedium(int i, int i8) {
        K.setMedium((byte[]) this.memory, idx(i), i8);
    }

    public void _setShort(int i, int i8) {
        K.setShort((byte[]) this.memory, idx(i), i8);
    }

    public final byte[] array() {
        ensureAccessible();
        return (byte[]) this.memory;
    }

    public final int arrayOffset() {
        return this.offset;
    }

    public final ByteBuffer duplicateInternalNioBuffer(int i, int i8) {
        checkIndex(i, i8);
        return ByteBuffer.wrap((byte[]) this.memory, idx(i), i8).slice();
    }

    public final C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        checkDstIndex(i, i9, i8, nVar.capacity());
        if (nVar.hasMemoryAddress()) {
            Y.copyMemory((byte[]) this.memory, idx(i), ((long) i8) + nVar.memoryAddress(), (long) i9);
        } else if (nVar.hasArray()) {
            getBytes(i, nVar.array(), nVar.arrayOffset() + i8, i9);
        } else {
            nVar.setBytes(i8, (byte[]) this.memory, idx(i), i9);
        }
        return this;
    }

    public final boolean hasArray() {
        return true;
    }

    public final boolean hasMemoryAddress() {
        return false;
    }

    public final boolean isDirect() {
        return false;
    }

    public final long memoryAddress() {
        throw new UnsupportedOperationException();
    }

    public final C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        checkSrcIndex(i, i9, i8, nVar.capacity());
        if (nVar.hasMemoryAddress()) {
            Y.copyMemory(nVar.memoryAddress() + ((long) i8), (byte[]) this.memory, idx(i), (long) i9);
        } else if (nVar.hasArray()) {
            setBytes(i, nVar.array(), nVar.arrayOffset() + i8, i9);
        } else {
            nVar.getBytes(i8, (byte[]) this.memory, idx(i), i9);
        }
        return this;
    }

    public final ByteBuffer newInternalNioBuffer(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    public final C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        checkDstIndex(i, i9, i8, bArr.length);
        System.arraycopy(this.memory, idx(i), bArr, i8, i9);
        return this;
    }

    public final C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        checkSrcIndex(i, i9, i8, bArr.length);
        System.arraycopy(bArr, i8, this.memory, idx(i), i9);
        return this;
    }

    public final C0185n getBytes(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        checkIndex(i, remaining);
        byteBuffer.put((byte[]) this.memory, idx(i), remaining);
        return this;
    }

    public final C0185n setBytes(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        checkIndex(i, remaining);
        byteBuffer.get((byte[]) this.memory, idx(i), remaining);
        return this;
    }
}
