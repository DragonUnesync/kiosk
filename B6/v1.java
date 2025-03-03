package b6;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import X5.C0352c;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;

/* 'enum' modifier removed */
public final class v1 extends w1 {
    public v1(String str, int i, boolean z, C0352c cVar) {
        super(str, i, z, cVar, (C0563j1) null);
    }

    public C0185n allocateWrapBuffer(C1 c12, C0187o oVar, int i, int i8) {
        return ((C0163c) oVar).heapBuffer(Math.max(i, c12.engine.getSession().getPacketBufferSize()));
    }

    public int calculatePendingData(C1 c12, int i) {
        return i;
    }

    public int calculateRequiredOutBufSpace(C1 c12, int i, int i8) {
        return c12.engine.getSession().getPacketBufferSize();
    }

    public boolean jdkCompatibilityMode(SSLEngine sSLEngine) {
        return true;
    }

    public SSLEngineResult unwrap(C1 c12, C0185n nVar, int i, C0185n nVar2) {
        int position;
        int writerIndex = nVar2.writerIndex();
        ByteBuffer access$300 = C1.toByteBuffer(nVar, nVar.readerIndex(), i);
        int position2 = access$300.position();
        SSLEngineResult unwrap = c12.engine.unwrap(access$300, C1.toByteBuffer(nVar2, writerIndex, nVar2.writableBytes()));
        nVar2.writerIndex(unwrap.bytesProduced() + writerIndex);
        if (unwrap.bytesConsumed() != 0 || (position = access$300.position() - position2) == unwrap.bytesConsumed()) {
            return unwrap;
        }
        return new SSLEngineResult(unwrap.getStatus(), unwrap.getHandshakeStatus(), position, unwrap.bytesProduced());
    }
}
