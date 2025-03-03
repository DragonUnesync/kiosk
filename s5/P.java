package S5;

import g6.Y;

public final class P extends S {
    public P(C0176i0 i0Var, int i, int i8, int i9) {
        super(i0Var, i, i8, i9, 0);
    }

    private static byte[] newByteArray(int i) {
        return Y.allocateUninitializedArray(i);
    }

    public void destroyChunk(T t8) {
    }

    public boolean isDirect() {
        return false;
    }

    public C0170f0 newByteBuf(int i) {
        if (S.HAS_UNSAFE) {
            return C0201v0.newUnsafeInstance(i);
        }
        return C0190p0.newInstance(i);
    }

    public T newChunk(int i, int i8, int i9, int i10) {
        return new T(this, (Object) null, newByteArray(i10), i, i9, i10, i8);
    }

    public T newUnpooledChunk(int i) {
        return new T(this, (Object) null, newByteArray(i), i);
    }

    public void memoryCopy(byte[] bArr, int i, C0170f0 f0Var, int i8) {
        if (i8 != 0) {
            System.arraycopy(bArr, i, f0Var.memory, f0Var.offset, i8);
        }
    }
}
