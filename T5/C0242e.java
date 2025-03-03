package T5;

import java.nio.channels.ClosedChannelException;

/* renamed from: T5.e  reason: case insensitive filesystem */
public final class C0242e implements Runnable {
    final /* synthetic */ C0250i this$1;
    final /* synthetic */ Throwable val$cause;
    final /* synthetic */ ClosedChannelException val$closeCause;
    final /* synthetic */ boolean val$notify;
    final /* synthetic */ C0263o0 val$outboundBuffer;
    final /* synthetic */ C0274u0 val$promise;
    final /* synthetic */ boolean val$wasActive;

    public C0242e(C0250i iVar, C0274u0 u0Var, C0263o0 o0Var, Throwable th, boolean z, ClosedChannelException closedChannelException, boolean z6) {
        this.this$1 = iVar;
        this.val$promise = u0Var;
        this.val$outboundBuffer = o0Var;
        this.val$cause = th;
        this.val$notify = z;
        this.val$closeCause = closedChannelException;
        this.val$wasActive = z6;
    }

    public void run() {
        try {
            this.this$1.doClose0(this.val$promise);
        } finally {
            this.this$1.invokeLater(new C0240d(this));
        }
    }
}
