package S5;

import g6.Y;
import java.nio.ByteBuffer;

public class S0 extends Q0 {
    public S0(C0187o oVar, int i, int i8) {
        super(oVar, i, i8);
    }

    public ByteBuffer allocateDirect(int i) {
        return Y.allocateDirectNoCleaner(i);
    }

    public C0185n capacity(int i) {
        checkNewCapacity(i);
        if (i == capacity()) {
            return this;
        }
        trimIndicesToCapacity(i);
        setByteBuffer(reallocateDirect(this.buffer, i), false);
        return this;
    }

    public void freeDirect(ByteBuffer byteBuffer) {
        Y.freeDirectNoCleaner(byteBuffer);
    }

    public ByteBuffer reallocateDirect(ByteBuffer byteBuffer, int i) {
        return Y.reallocateDirectNoCleaner(byteBuffer, i);
    }
}
