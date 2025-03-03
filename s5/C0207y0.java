package S5;

import Q0.g;
import g6.B;
import g6.Y;
import java.nio.ByteBuffer;

/* renamed from: S5.y0  reason: case insensitive filesystem */
public final class C0207y0 extends C0205x0 {
    private final long memoryAddress = Y.directBufferAddress(this.buffer);

    public C0207y0(C0187o oVar, ByteBuffer byteBuffer) {
        super(oVar, byteBuffer);
    }

    private long addr(int i) {
        return this.memoryAddress + ((long) i);
    }

    public byte _getByte(int i) {
        return U0.getByte(addr(i));
    }

    public int _getInt(int i) {
        return U0.getInt(addr(i));
    }

    public long _getLong(int i) {
        return U0.getLong(addr(i));
    }

    public short _getShort(int i) {
        return U0.getShort(addr(i));
    }

    public int _getUnsignedMedium(int i) {
        return U0.getUnsignedMedium(addr(i));
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        checkIndex(i, i9);
        B.checkNotNull(nVar, "dst");
        if (i8 < 0 || i8 > nVar.capacity() - i9) {
            throw new IndexOutOfBoundsException(g.m(i8, "dstIndex: "));
        }
        if (nVar.hasMemoryAddress()) {
            Y.copyMemory(addr(i), ((long) i8) + nVar.memoryAddress(), (long) i9);
        } else if (nVar.hasArray()) {
            Y.copyMemory(addr(i), nVar.array(), nVar.arrayOffset() + i8, (long) i9);
        } else {
            nVar.setBytes(i8, (C0185n) this, i, i9);
        }
        return this;
    }

    public boolean hasMemoryAddress() {
        return true;
    }

    public long memoryAddress() {
        return this.memoryAddress;
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        checkIndex(i, i9);
        B.checkNotNull(bArr, "dst");
        if (i8 < 0 || i8 > bArr.length - i9) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", new Object[]{Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(bArr.length)}));
        }
        if (i9 != 0) {
            Y.copyMemory(addr(i), bArr, i8, (long) i9);
        }
        return this;
    }
}
