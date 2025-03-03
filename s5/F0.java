package S5;

import java.nio.ByteBuffer;

public final class F0 extends M0 {
    public F0(L0 l02, int i, int i8) {
        super((C0187o) l02, i, i8);
    }

    public ByteBuffer allocateDirect(int i) {
        ByteBuffer allocateDirect = super.allocateDirect(i);
        ((L0) alloc()).incrementDirect(allocateDirect.capacity());
        return allocateDirect;
    }

    public void freeDirect(ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        super.freeDirect(byteBuffer);
        ((L0) alloc()).decrementDirect(capacity);
    }
}
