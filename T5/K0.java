package T5;

import f6.C0911a;
import java.util.concurrent.RejectedExecutionException;

public final class K0 extends L0 {
    final /* synthetic */ O0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K0(O0 o02, F f8) {
        super(f8);
        this.this$0 = o02;
    }

    public void execute() {
        C0911a aVar = (C0911a) this.ctx.executor();
        if (aVar.inEventLoop()) {
            this.this$0.callHandlerAdded0(this.ctx);
            return;
        }
        try {
            aVar.execute(this);
        } catch (RejectedExecutionException e) {
            if (O0.logger.isWarnEnabled()) {
                O0.logger.warn("Can't invoke handlerAdded() as the EventExecutor {} rejected it, removing handler {}.", aVar, this.ctx.name(), e);
            }
            this.this$0.atomicRemoveFromHandlerList(this.ctx);
            this.ctx.setRemoved();
        }
    }

    public void run() {
        this.this$0.callHandlerAdded0(this.ctx);
    }
}
