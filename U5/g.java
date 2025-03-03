package U5;

import T5.B0;
import T5.C0250i;
import T5.C0274u0;
import T5.O0;
import W5.e;
import f6.C0909B;
import java.net.SocketAddress;
import java.nio.channels.ConnectionPendingException;
import java.nio.channels.SelectionKey;
import java.util.concurrent.TimeUnit;

public abstract class g extends C0250i implements h {
    final /* synthetic */ i this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(iVar);
        this.this$0 = iVar;
    }

    private void fulfillConnectPromise(C0274u0 u0Var, boolean z) {
        if (u0Var != null) {
            boolean isActive = ((e) this.this$0).isActive();
            boolean trySuccess = u0Var.trySuccess();
            if (!z && isActive) {
                ((O0) this.this$0.pipeline()).fireChannelActive();
            }
            if (!trySuccess) {
                close(voidPromise());
            }
        }
    }

    private boolean isFlushPending() {
        SelectionKey selectionKey = this.this$0.selectionKey();
        if (!selectionKey.isValid() || (selectionKey.interestOps() & 4) == 0) {
            return false;
        }
        return true;
    }

    public final void connect(SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        if (u0Var.setUncancellable() && ensureOpen(u0Var)) {
            try {
                if (this.this$0.connectPromise == null) {
                    boolean isActive = ((e) this.this$0).isActive();
                    if (this.this$0.doConnect(socketAddress, socketAddress2)) {
                        fulfillConnectPromise(u0Var, isActive);
                        return;
                    }
                    C0274u0 unused = this.this$0.connectPromise = u0Var;
                    SocketAddress unused2 = this.this$0.requestedRemoteAddress = socketAddress;
                    int connectTimeoutMillis = ((B0) ((e) this.this$0).config()).getConnectTimeoutMillis();
                    if (connectTimeoutMillis > 0) {
                        i iVar = this.this$0;
                        C0909B unused3 = iVar.connectTimeoutFuture = iVar.eventLoop().schedule((Runnable) new e(this, socketAddress), (long) connectTimeoutMillis, TimeUnit.MILLISECONDS);
                    }
                    u0Var.addListener(new f(this));
                    return;
                }
                throw new ConnectionPendingException();
            } catch (Throwable th) {
                u0Var.tryFailure(annotateConnectException(th, socketAddress));
                closeIfClosed();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (U5.i.access$400(r5.this$0) == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        if (U5.i.access$400(r5.this$0) != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        U5.i.access$400(r5.this$0).cancel(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        U5.i.access$202(r5.this$0, (T5.C0274u0) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finishConnect() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            U5.i r2 = r5.this$0     // Catch:{ all -> 0x002f }
            W5.e r2 = (W5.e) r2     // Catch:{ all -> 0x002f }
            boolean r2 = r2.isActive()     // Catch:{ all -> 0x002f }
            U5.i r3 = r5.this$0     // Catch:{ all -> 0x002f }
            r3.doFinishConnect()     // Catch:{ all -> 0x002f }
            U5.i r3 = r5.this$0     // Catch:{ all -> 0x002f }
            T5.u0 r3 = r3.connectPromise     // Catch:{ all -> 0x002f }
            r5.fulfillConnectPromise((T5.C0274u0) r3, (boolean) r2)     // Catch:{ all -> 0x002f }
            U5.i r2 = r5.this$0
            f6.B r2 = r2.connectTimeoutFuture
            if (r2 == 0) goto L_0x0029
        L_0x0020:
            U5.i r2 = r5.this$0
            f6.B r2 = r2.connectTimeoutFuture
            r2.cancel(r1)
        L_0x0029:
            U5.i r1 = r5.this$0
            T5.C0274u0 unused = r1.connectPromise = r0
            goto L_0x004c
        L_0x002f:
            r2 = move-exception
            U5.i r3 = r5.this$0     // Catch:{ all -> 0x004d }
            T5.u0 r3 = r3.connectPromise     // Catch:{ all -> 0x004d }
            U5.i r4 = r5.this$0     // Catch:{ all -> 0x004d }
            java.net.SocketAddress r4 = r4.requestedRemoteAddress     // Catch:{ all -> 0x004d }
            java.lang.Throwable r2 = r5.annotateConnectException(r2, r4)     // Catch:{ all -> 0x004d }
            r5.fulfillConnectPromise((T5.C0274u0) r3, (java.lang.Throwable) r2)     // Catch:{ all -> 0x004d }
            U5.i r2 = r5.this$0
            f6.B r2 = r2.connectTimeoutFuture
            if (r2 == 0) goto L_0x0029
            goto L_0x0020
        L_0x004c:
            return
        L_0x004d:
            r2 = move-exception
            U5.i r3 = r5.this$0
            f6.B r3 = r3.connectTimeoutFuture
            if (r3 == 0) goto L_0x005f
            U5.i r3 = r5.this$0
            f6.B r3 = r3.connectTimeoutFuture
            r3.cancel(r1)
        L_0x005f:
            U5.i r1 = r5.this$0
            T5.C0274u0 unused = r1.connectPromise = r0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.g.finishConnect():void");
    }

    public final void flush0() {
        if (!isFlushPending()) {
            super.flush0();
        }
    }

    public final void forceFlush() {
        super.flush0();
    }

    public final void removeReadOp() {
        SelectionKey selectionKey = this.this$0.selectionKey();
        if (selectionKey.isValid()) {
            int interestOps = selectionKey.interestOps();
            int i = this.this$0.readInterestOp;
            if ((interestOps & i) != 0) {
                selectionKey.interestOps(interestOps & (~i));
            }
        }
    }

    private void fulfillConnectPromise(C0274u0 u0Var, Throwable th) {
        if (u0Var != null) {
            u0Var.tryFailure(th);
            closeIfClosed();
        }
    }
}
