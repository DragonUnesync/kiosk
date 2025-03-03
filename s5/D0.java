package S5;

import g6.Y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class D0 {
    private static final C0187o ALLOC;
    public static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
    public static final C0185n EMPTY_BUFFER;
    public static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;

    static {
        L0 l02 = L0.DEFAULT;
        ALLOC = l02;
        EMPTY_BUFFER = l02.buffer(0, 0);
    }

    public static C0185n buffer(int i) {
        return ((C0163c) ALLOC).heapBuffer(i);
    }

    public static C0185n directBuffer(int i) {
        return ((C0163c) ALLOC).directBuffer(i);
    }

    @Deprecated
    public static C0185n unmodifiableBuffer(C0185n nVar) {
        ByteOrder order = nVar.order();
        ByteOrder byteOrder = BIG_ENDIAN;
        if (order == byteOrder) {
            return new C0203w0(nVar);
        }
        return new C0203w0(nVar.order(byteOrder)).order(LITTLE_ENDIAN);
    }

    public static C0185n unreleasableBuffer(C0185n nVar) {
        return new T0(nVar);
    }

    public static C0185n wrappedBuffer(byte[] bArr) {
        if (bArr.length == 0) {
            return EMPTY_BUFFER;
        }
        return new O0(ALLOC, bArr, bArr.length);
    }

    public static C0185n wrappedUnmodifiableBuffer(C0185n... nVarArr) {
        return wrappedUnmodifiableBuffer(false, nVarArr);
    }

    public static C0185n directBuffer(int i, int i8) {
        return ((C0163c) ALLOC).directBuffer(i, i8);
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static S5.C0185n wrappedUnmodifiableBuffer(boolean r2, S5.C0185n... r3) {
        /*
            int r0 = r3.length
            if (r0 == 0) goto L_0x0022
            r1 = 1
            if (r0 == r1) goto L_0x001a
            if (r2 == 0) goto L_0x0012
            int r2 = r3.length
            java.lang.Class<S5.n[]> r0 = S5.C0185n[].class
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2, r0)
            r3 = r2
            S5.n[] r3 = (S5.C0185n[]) r3
        L_0x0012:
            S5.J r2 = new S5.J
            S5.o r0 = ALLOC
            r2.<init>(r0, r3)
            return r2
        L_0x001a:
            r2 = 0
            r2 = r3[r2]
            S5.n r2 = r2.asReadOnly()
            return r2
        L_0x0022:
            S5.n r2 = EMPTY_BUFFER
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.D0.wrappedUnmodifiableBuffer(boolean, S5.n[]):S5.n");
    }

    public static C0185n wrappedBuffer(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return EMPTY_BUFFER;
        }
        if (i == 0 && i8 == bArr.length) {
            return wrappedBuffer(bArr);
        }
        return wrappedBuffer(bArr).slice(i, i8);
    }

    public static C0185n wrappedBuffer(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return EMPTY_BUFFER;
        }
        if (!byteBuffer.isDirect() && byteBuffer.hasArray()) {
            return wrappedBuffer(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining()).order(byteBuffer.order());
        } else if (Y.hasUnsafe()) {
            if (!byteBuffer.isReadOnly()) {
                return new Q0(ALLOC, byteBuffer, byteBuffer.remaining());
            }
            if (byteBuffer.isDirect()) {
                return new C0207y0(ALLOC, byteBuffer);
            }
            return new C0205x0(ALLOC, byteBuffer);
        } else if (byteBuffer.isReadOnly()) {
            return new C0205x0(ALLOC, byteBuffer);
        } else {
            return new M0(ALLOC, byteBuffer, byteBuffer.remaining());
        }
    }
}
