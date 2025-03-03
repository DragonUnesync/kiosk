package U5;

import S5.C0185n;
import T5.C0270s0;
import T5.H;
import T5.O0;
import T5.n1;
import V5.a;
import W5.e;
import java.io.IOException;

public abstract class b extends g {
    final /* synthetic */ c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar);
        this.this$0 = cVar;
    }

    private void closeOnRead(C0270s0 s0Var) {
        if (!this.this$0.isInputShutdown0()) {
            if (c.isAllowHalfClosure(((e) this.this$0).config())) {
                this.this$0.shutdownInput();
                ((O0) s0Var).fireUserEventTriggered(a.INSTANCE);
                return;
            }
            close(voidPromise());
        } else if (!this.this$0.inputClosedSeenErrorOnRead) {
            boolean unused = this.this$0.inputClosedSeenErrorOnRead = true;
            ((O0) s0Var).fireUserEventTriggered(V5.b.INSTANCE);
        }
    }

    private void handleReadException(C0270s0 s0Var, C0185n nVar, Throwable th, boolean z, n1 n1Var) {
        if (nVar != null) {
            if (nVar.isReadable()) {
                this.this$0.readPending = false;
                ((O0) s0Var).fireChannelRead(nVar);
            } else {
                nVar.release();
            }
        }
        ((H) n1Var).readComplete();
        O0 o02 = (O0) s0Var;
        o02.fireChannelReadComplete();
        o02.fireExceptionCaught(th);
        if (z || (th instanceof OutOfMemoryError) || (th instanceof IOException)) {
            closeOnRead(o02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r5.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r7.lastBytesRead() >= 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r9 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r10.this$0.readPending = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r5 = r1;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r8.readComplete();
        r1 = (T5.O0) r3;
        r1.fireChannelReadComplete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        if (r2 == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        closeOnRead(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r5 = r1;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r10.this$0.readPending != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        if (r0.isAutoRead() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read() {
        /*
            r10 = this;
            U5.c r0 = r10.this$0
            W5.e r0 = (W5.e) r0
            T5.L r0 = r0.config()
            U5.c r1 = r10.this$0
            boolean r1 = r1.shouldBreakReadReady(r0)
            if (r1 == 0) goto L_0x0016
            U5.c r0 = r10.this$0
            r0.clearReadPending()
            return
        L_0x0016:
            U5.c r1 = r10.this$0
            T5.s0 r3 = r1.pipeline()
            T5.B0 r0 = (T5.B0) r0
            S5.o r1 = r0.getAllocator()
            T5.n1 r2 = r10.recvBufAllocHandle()
            r7 = r2
            T5.R0 r7 = (T5.R0) r7
            r7.reset(r0)
        L_0x002c:
            r2 = 0
            r4 = 0
            S5.n r5 = r7.allocate(r1)     // Catch:{ all -> 0x005d }
            U5.c r6 = r10.this$0     // Catch:{ all -> 0x0061 }
            int r6 = r6.doReadBytes(r5)     // Catch:{ all -> 0x0061 }
            r8 = r7
            T5.H r8 = (T5.H) r8     // Catch:{ all -> 0x0061 }
            r8.lastBytesRead(r6)     // Catch:{ all -> 0x0061 }
            int r6 = r7.lastBytesRead()     // Catch:{ all -> 0x0061 }
            r9 = 1
            if (r6 > 0) goto L_0x0066
            r5.release()     // Catch:{ all -> 0x0061 }
            int r1 = r7.lastBytesRead()     // Catch:{ all -> 0x005d }
            if (r1 >= 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r9 = 0
        L_0x0050:
            if (r9 == 0) goto L_0x005b
            U5.c r1 = r10.this$0     // Catch:{ all -> 0x0057 }
            r1.readPending = r2     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r1 = move-exception
            r5 = r1
            r6 = r9
            goto L_0x009c
        L_0x005b:
            r2 = r9
            goto L_0x0079
        L_0x005d:
            r1 = move-exception
            r5 = r1
            r6 = 0
            goto L_0x009c
        L_0x0061:
            r1 = move-exception
            r4 = r5
            r6 = 0
            r5 = r1
            goto L_0x009c
        L_0x0066:
            r7.incMessagesRead(r9)     // Catch:{ all -> 0x0061 }
            U5.c r6 = r10.this$0     // Catch:{ all -> 0x0061 }
            r6.readPending = r2     // Catch:{ all -> 0x0061 }
            r6 = r3
            T5.O0 r6 = (T5.O0) r6     // Catch:{ all -> 0x0061 }
            r6.fireChannelRead(r5)     // Catch:{ all -> 0x0061 }
            boolean r5 = r7.continueReading()     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x002c
        L_0x0079:
            r8.readComplete()     // Catch:{ all -> 0x0088 }
            r1 = r3
            T5.O0 r1 = (T5.O0) r1     // Catch:{ all -> 0x0088 }
            r1.fireChannelReadComplete()     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x008c
            r10.closeOnRead(r1)     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r1 = move-exception
            r5 = r1
            r6 = r2
            goto L_0x009c
        L_0x008c:
            U5.c r1 = r10.this$0
            boolean r1 = r1.readPending
            if (r1 != 0) goto L_0x00ad
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L_0x00ad
        L_0x0098:
            r10.removeReadOp()
            goto L_0x00ad
        L_0x009c:
            r2 = r10
            r2.handleReadException(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ae }
            U5.c r1 = r10.this$0
            boolean r1 = r1.readPending
            if (r1 != 0) goto L_0x00ad
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L_0x00ad
            goto L_0x0098
        L_0x00ad:
            return
        L_0x00ae:
            r1 = move-exception
            U5.c r2 = r10.this$0
            boolean r2 = r2.readPending
            if (r2 != 0) goto L_0x00be
            boolean r0 = r0.isAutoRead()
            if (r0 != 0) goto L_0x00be
            r10.removeReadOp()
        L_0x00be:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.b.read():void");
    }
}
