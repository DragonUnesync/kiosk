package S5;

import java.nio.ByteBuffer;

public final class J0 extends S0 {
    public J0(L0 l02, int i, int i8) {
        super(l02, i, i8);
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

    public ByteBuffer reallocateDirect(ByteBuffer byteBuffer, int i) {
        int capacity = byteBuffer.capacity();
        ByteBuffer reallocateDirect = super.reallocateDirect(byteBuffer, i);
        ((L0) alloc()).incrementDirect(reallocateDirect.capacity() - capacity);
        return reallocateDirect;
    }
}
