package T5;

import f6.C0929t;

public final class N0 extends F implements C0243e0 {
    final /* synthetic */ O0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N0(O0 o02, O0 o03) {
        super(o03, (C0929t) null, O0.TAIL_NAME, N0.class);
        this.this$0 = o02;
        setAddComplete();
    }

    public void channelActive(Y y8) {
        this.this$0.onUnhandledInboundChannelActive();
    }

    public void channelInactive(Y y8) {
        this.this$0.onUnhandledInboundChannelInactive();
    }

    public void channelRead(Y y8, Object obj) {
        this.this$0.onUnhandledInboundMessage(y8, obj);
    }

    public void channelReadComplete(Y y8) {
        this.this$0.onUnhandledInboundChannelReadComplete();
    }

    public void channelRegistered(Y y8) {
    }

    public void channelUnregistered(Y y8) {
    }

    public void channelWritabilityChanged(Y y8) {
        this.this$0.onUnhandledChannelWritabilityChanged();
    }

    public void exceptionCaught(Y y8, Throwable th) {
        this.this$0.onUnhandledInboundException(th);
    }

    public W handler() {
        return this;
    }

    public void handlerAdded(Y y8) {
    }

    public void handlerRemoved(Y y8) {
    }

    public void userEventTriggered(Y y8, Object obj) {
        this.this$0.onUnhandledInboundUserEventTriggered(obj);
    }
}
