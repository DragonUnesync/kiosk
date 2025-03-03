package b6;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import X5.C0352c;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;

/* 'enum' modifier removed */
public final class u1 extends w1 {
    public u1(String str, int i, boolean z, C0352c cVar) {
        super(str, i, z, cVar, (C0563j1) null);
    }

    public C0185n allocateWrapBuffer(C1 c12, C0187o oVar, int i, int i8) {
        return ((C0163c) oVar).directBuffer(((C0564k) c12.engine).a(i, i8));
    }

    public int calculatePendingData(C1 c12, int i) {
        return i;
    }

    public int calculateRequiredOutBufSpace(C1 c12, int i, int i8) {
        return ((C0564k) c12.engine).b(i, i8);
    }

    public boolean jdkCompatibilityMode(SSLEngine sSLEngine) {
        return true;
    }

    public SSLEngineResult unwrap(C1 c12, C0185n nVar, int i, C0185n nVar2) {
        SSLEngineResult sSLEngineResult;
        int nioBufferCount = nVar.nioBufferCount();
        int writerIndex = nVar2.writerIndex();
        if (nioBufferCount > 1) {
            try {
                c12.singleBuffer[0] = C1.toByteBuffer(nVar2, writerIndex, nVar2.writableBytes());
                sSLEngineResult = ((C0564k) c12.engine).c(nVar.nioBuffers(nVar.readerIndex(), i), c12.singleBuffer);
            } finally {
                c12.singleBuffer[0] = null;
            }
        } else {
            sSLEngineResult = c12.engine.unwrap(C1.toByteBuffer(nVar, nVar.readerIndex(), i), C1.toByteBuffer(nVar2, writerIndex, nVar2.writableBytes()));
        }
        nVar2.writerIndex(sSLEngineResult.bytesProduced() + writerIndex);
        return sSLEngineResult;
    }
}
