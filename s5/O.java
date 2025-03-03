package S5;

import g6.Y;
import java.nio.ByteBuffer;

public final class O extends S {
    public O(C0176i0 i0Var, int i, int i8, int i9, int i10) {
        super(i0Var, i, i8, i9, i10);
    }

    private static ByteBuffer allocateDirect(int i) {
        if (Y.useDirectBufferNoCleaner()) {
            return Y.allocateDirectNoCleaner(i);
        }
        return ByteBuffer.allocateDirect(i);
    }

    public void destroyChunk(T t8) {
        if (Y.useDirectBufferNoCleaner()) {
            Y.freeDirectNoCleaner((ByteBuffer) t8.base);
        } else {
            Y.freeDirectBuffer((ByteBuffer) t8.base);
        }
    }

    public boolean isDirect() {
        return true;
    }

    public C0170f0 newByteBuf(int i) {
        if (S.HAS_UNSAFE) {
            return C0197t0.newInstance(i);
        }
        return C0182l0.newInstance(i);
    }

    public T newChunk(int i, int i8, int i9, int i10) {
        int i11 = this.directMemoryCacheAlignment;
        if (i11 == 0) {
            ByteBuffer allocateDirect = allocateDirect(i10);
            return new T(this, allocateDirect, allocateDirect, i, i9, i10, i8);
        }
        ByteBuffer allocateDirect2 = allocateDirect(i11 + i10);
        return new T(this, allocateDirect2, Y.alignDirectBuffer(allocateDirect2, this.directMemoryCacheAlignment), i, i9, i10, i8);
    }

    public T newUnpooledChunk(int i) {
        int i8 = this.directMemoryCacheAlignment;
        if (i8 == 0) {
            ByteBuffer allocateDirect = allocateDirect(i);
            return new T(this, allocateDirect, allocateDirect, i);
        }
        ByteBuffer allocateDirect2 = allocateDirect(i8 + i);
        return new T(this, allocateDirect2, Y.alignDirectBuffer(allocateDirect2, this.directMemoryCacheAlignment), i);
    }

    public void memoryCopy(ByteBuffer byteBuffer, int i, C0170f0 f0Var, int i8) {
        if (i8 != 0) {
            if (S.HAS_UNSAFE) {
                Y.copyMemory(Y.directBufferAddress(byteBuffer) + ((long) i), Y.directBufferAddress((ByteBuffer) f0Var.memory) + ((long) f0Var.offset), (long) i8);
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            ByteBuffer internalNioBuffer = f0Var.internalNioBuffer();
            duplicate.position(i).limit(i + i8);
            internalNioBuffer.position(f0Var.offset);
            internalNioBuffer.put(duplicate);
        }
    }
}
