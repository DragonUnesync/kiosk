package T5;

import f6.C0929t;
import java.net.SocketAddress;

public final class J0 extends F implements C0265p0, C0243e0 {
    final /* synthetic */ O0 this$0;
    private final J unsafe;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J0(O0 o02, O0 o03) {
        super(o03, (C0929t) null, O0.HEAD_NAME, J0.class);
        this.this$0 = o02;
        this.unsafe = o03.channel().unsafe();
        setAddComplete();
    }

    private void readIfIsAutoRead() {
        if (((B0) this.this$0.channel.config()).isAutoRead()) {
            ((C0260n) this.this$0.channel).read();
        }
    }

    public void channelActive(Y y8) {
        y8.fireChannelActive();
        readIfIsAutoRead();
    }

    public void channelInactive(Y y8) {
        y8.fireChannelInactive();
    }

    public void channelRead(Y y8, Object obj) {
        y8.fireChannelRead(obj);
    }

    public void channelReadComplete(Y y8) {
        y8.fireChannelReadComplete();
        readIfIsAutoRead();
    }

    public void channelRegistered(Y y8) {
        this.this$0.invokeHandlerAddedIfNeeded();
        y8.fireChannelRegistered();
    }

    public void channelUnregistered(Y y8) {
        y8.fireChannelUnregistered();
        if (!this.this$0.channel.isOpen()) {
            this.this$0.destroy();
        }
    }

    public void channelWritabilityChanged(Y y8) {
        y8.fireChannelWritabilityChanged();
    }

    public void close(Y y8, C0274u0 u0Var) {
        ((C0250i) this.unsafe).close(u0Var);
    }

    public void connect(Y y8, SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        this.unsafe.connect(socketAddress, socketAddress2, u0Var);
    }

    public void disconnect(Y y8, C0274u0 u0Var) {
        ((C0250i) this.unsafe).disconnect(u0Var);
    }

    public void exceptionCaught(Y y8, Throwable th) {
        y8.fireExceptionCaught(th);
    }

    public void flush(Y y8) {
        ((C0250i) this.unsafe).flush();
    }

    public W handler() {
        return this;
    }

    public void handlerAdded(Y y8) {
    }

    public void handlerRemoved(Y y8) {
    }

    public void read(Y y8) {
        ((C0250i) this.unsafe).beginRead();
    }

    public void userEventTriggered(Y y8, Object obj) {
        y8.fireUserEventTriggered(obj);
    }

    public void write(Y y8, Object obj, C0274u0 u0Var) {
        ((C0250i) this.unsafe).write(obj, u0Var);
    }
}
