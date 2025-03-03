package S5;

import java.nio.ByteBuffer;

/* renamed from: S5.d0  reason: case insensitive filesystem */
public final class C0166d0 extends C0162b0 {
    public C0166d0(int i) {
        super(i, Q.Small);
    }

    public void initBuf(T t8, ByteBuffer byteBuffer, long j7, C0170f0 f0Var, int i, C0168e0 e0Var) {
        t8.initBufWithSubpage(f0Var, byteBuffer, j7, i, e0Var);
    }
}
