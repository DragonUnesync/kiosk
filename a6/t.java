package a6;

import T5.C0260n;
import T5.C0274u0;
import T5.O0;
import T5.P;
import T5.U;
import T5.W;
import T5.Y;
import Z5.C;
import Z5.j0;

public final class t implements U {
    final /* synthetic */ C0427A this$0;
    final /* synthetic */ C0274u0 val$promise;

    public t(C0427A a8, C0274u0 u0Var) {
        this.this$0 = a8;
        this.val$promise = u0Var;
    }

    public void operationComplete(P p3) {
        if (p3.isSuccess()) {
            O0 o02 = (O0) ((C0260n) p3.channel()).pipeline();
            Y context = o02.context((Class<? extends W>) j0.class);
            if (context == null) {
                context = o02.context((Class<? extends W>) C.class);
            }
            if (context == null) {
                this.val$promise.setFailure(new IllegalStateException("ChannelPipeline does not contain an HttpRequestEncoder or HttpClientCodec"));
                return;
            }
            o02.addAfter(context.name(), "ws-encoder", this.this$0.newWebSocketEncoder());
            this.val$promise.setSuccess();
            return;
        }
        this.val$promise.setFailure(p3.cause());
    }
}
