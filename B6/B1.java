package b6;

import S5.D0;
import X5.C0364o;
import f6.C0911a;
import java.util.concurrent.RejectedExecutionException;
import javax.net.ssl.SSLException;

public final class B1 implements Runnable {
    private final boolean inUnwrap;
    private final Runnable runCompleteTask = new y1(this);
    final /* synthetic */ C1 this$0;

    public B1(C1 c12, boolean z) {
        this.this$0 = c12;
        this.inUnwrap = z;
    }

    private void handleException(Throwable th) {
        C0911a aVar = (C0911a) this.this$0.ctx.executor();
        if (aVar.inEventLoop()) {
            this.this$0.clearState(128);
            safeExceptionCaught(th);
            return;
        }
        try {
            aVar.execute(new A1(this, th));
        } catch (RejectedExecutionException unused) {
            this.this$0.clearState(128);
            this.this$0.ctx.fireExceptionCaught(th);
        }
    }

    /* access modifiers changed from: private */
    public void resumeOnEventExecutor() {
        this.this$0.clearState(128);
        try {
            int i = C0560i1.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[this.this$0.engine.getHandshakeStatus().ordinal()];
            if (i == 1) {
                this.this$0.executeDelegatedTask(this);
            } else if (i == 2 || i == 3) {
                boolean unused = this.this$0.setHandshakeSuccess();
                try {
                    C1 c12 = this.this$0;
                    c12.wrap(c12.ctx, this.inUnwrap);
                    if (this.inUnwrap) {
                        C1 c13 = this.this$0;
                        int unused2 = c13.unwrapNonAppData(c13.ctx);
                    }
                    C1 c14 = this.this$0;
                    c14.forceFlush(c14.ctx);
                    tryDecodeAgain();
                } catch (Throwable th) {
                    taskError(th);
                }
            } else if (i == 4) {
                try {
                    C1 c15 = this.this$0;
                    if (!c15.wrapNonAppData(c15.ctx, false) && this.inUnwrap) {
                        C1 c16 = this.this$0;
                        int unused3 = c16.unwrapNonAppData(c16.ctx);
                    }
                    C1 c17 = this.this$0;
                    c17.forceFlush(c17.ctx);
                    tryDecodeAgain();
                } catch (Throwable th2) {
                    taskError(th2);
                }
            } else if (i == 5) {
                C1 c18 = this.this$0;
                int unused4 = c18.unwrapNonAppData(c18.ctx);
                tryDecodeAgain();
            } else {
                throw new AssertionError();
            }
        } catch (SSLException e) {
            C1 c19 = this.this$0;
            c19.handleUnwrapThrowable(c19.ctx, e);
        } catch (Throwable th3) {
            safeExceptionCaught(th3);
        }
    }

    /* access modifiers changed from: private */
    public void safeExceptionCaught(Throwable th) {
        try {
            C1 c12 = this.this$0;
            c12.exceptionCaught(c12.ctx, wrapIfNeeded(th));
        } catch (Throwable th2) {
            this.this$0.ctx.fireExceptionCaught(th2);
        }
    }

    private void taskError(Throwable th) {
        if (this.inUnwrap) {
            try {
                C1 c12 = this.this$0;
                c12.handleUnwrapThrowable(c12.ctx, th);
            } catch (Throwable th2) {
                safeExceptionCaught(th2);
            }
        } else {
            C1 c13 = this.this$0;
            c13.setHandshakeFailure(c13.ctx, th);
            C1 c14 = this.this$0;
            c14.forceFlush(c14.ctx);
        }
    }

    private void tryDecodeAgain() {
        try {
            C1 c12 = this.this$0;
            c12.channelRead(c12.ctx, D0.EMPTY_BUFFER);
        } catch (Throwable th) {
            this.this$0.channelReadComplete0(this.this$0.ctx);
            throw th;
        }
        C1 c13 = this.this$0;
        c13.channelReadComplete0(c13.ctx);
    }

    private Throwable wrapIfNeeded(Throwable th) {
        if (this.inUnwrap && !(th instanceof C0364o)) {
            return new C0364o(th);
        }
        return th;
    }

    public void run() {
        try {
            Runnable delegatedTask = this.this$0.engine.getDelegatedTask();
            if (delegatedTask != null) {
                if (delegatedTask instanceof C0549f) {
                    ((J0) ((C0549f) delegatedTask)).run(this.runCompleteTask);
                    return;
                }
                delegatedTask.run();
                runComplete();
            }
        } catch (Throwable th) {
            handleException(th);
        }
    }

    public void runComplete() {
        this.this$0.ctx.executor().execute(new z1(this));
    }
}
