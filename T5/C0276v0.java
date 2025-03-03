package T5;

import g6.x0;

/* renamed from: T5.v0  reason: case insensitive filesystem */
public final class C0276v0 extends C0280x0 {
    final /* synthetic */ C0282y0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0276v0(C0282y0 y0Var, Y y8, W w2) {
        super(y8, w2);
        this.this$0 = y0Var;
    }

    public Y fireExceptionCaught(Throwable th) {
        if (!this.this$0.outboundCtx.removed) {
            try {
                this.this$0.outboundHandler.exceptionCaught(this.this$0.outboundCtx, th);
            } catch (Throwable th2) {
                if (C0282y0.logger.isDebugEnabled()) {
                    C0282y0.logger.debug("An exception {}was thrown by a user handler's exceptionCaught() method while handling the following exception:", x0.stackTraceToString(th2), th);
                } else if (C0282y0.logger.isWarnEnabled()) {
                    C0282y0.logger.warn("An exception '{}' [enable DEBUG level for full stacktrace] was thrown by a user handler's exceptionCaught() method while handling the following exception:", th2, th);
                }
            }
        } else {
            super.fireExceptionCaught(th);
        }
        return this;
    }
}
