package T5;

/* renamed from: T5.f0  reason: case insensitive filesystem */
public abstract class C0245f0 extends X implements C0243e0 {
    @C0237b0
    public void channelActive(Y y8) {
        y8.fireChannelActive();
    }

    @C0237b0
    public void channelInactive(Y y8) {
        y8.fireChannelInactive();
    }

    @C0237b0
    public void channelRead(Y y8, Object obj) {
        y8.fireChannelRead(obj);
    }

    @C0237b0
    public void channelReadComplete(Y y8) {
        y8.fireChannelReadComplete();
    }

    @C0237b0
    public void channelRegistered(Y y8) {
        y8.fireChannelRegistered();
    }

    @C0237b0
    public void channelUnregistered(Y y8) {
        y8.fireChannelUnregistered();
    }

    @C0237b0
    public void channelWritabilityChanged(Y y8) {
        y8.fireChannelWritabilityChanged();
    }

    @C0237b0
    public void exceptionCaught(Y y8, Throwable th) {
        y8.fireExceptionCaught(th);
    }

    @C0237b0
    public void userEventTriggered(Y y8, Object obj) {
        y8.fireUserEventTriggered(obj);
    }
}
