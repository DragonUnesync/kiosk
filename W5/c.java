package W5;

import T5.C0251i0;
import V5.e;
import g6.Y;
import java.net.Socket;

public final class c extends e {
    private volatile int maxBytesPerGatheringWrite;
    final /* synthetic */ e this$0;

    public /* synthetic */ c(e eVar, e eVar2, Socket socket, a aVar) {
        this(eVar, eVar2, socket);
    }

    private void calculateMaxBytesPerGatheringWrite() {
        int sendBufferSize = getSendBufferSize() << 1;
        if (sendBufferSize > 0) {
            setMaxBytesPerGatheringWrite(sendBufferSize);
        }
    }

    public void autoReadCleared() {
        this.this$0.clearReadPending();
    }

    public int getMaxBytesPerGatheringWrite() {
        return this.maxBytesPerGatheringWrite;
    }

    public <T> T getOption(C0251i0 i0Var) {
        Y.javaVersion();
        return super.getOption(i0Var);
    }

    public void setMaxBytesPerGatheringWrite(int i) {
        this.maxBytesPerGatheringWrite = i;
    }

    public <T> boolean setOption(C0251i0 i0Var, T t8) {
        Y.javaVersion();
        return super.setOption(i0Var, t8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(e eVar, e eVar2, Socket socket) {
        super(eVar2, socket);
        this.this$0 = eVar;
        this.maxBytesPerGatheringWrite = Integer.MAX_VALUE;
        calculateMaxBytesPerGatheringWrite();
    }

    public c setSendBufferSize(int i) {
        super.setSendBufferSize(i);
        calculateMaxBytesPerGatheringWrite();
        return this;
    }
}
