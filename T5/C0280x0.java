package T5;

import S5.C0187o;
import f6.C0911a;
import f6.C0929t;
import java.net.SocketAddress;

/* renamed from: T5.x0  reason: case insensitive filesystem */
public class C0280x0 implements Y {
    private final Y ctx;
    private final W handler;
    boolean removed;

    public C0280x0(Y y8, W w2) {
        this.ctx = y8;
        this.handler = w2;
    }

    /* access modifiers changed from: private */
    public void remove0() {
        if (!this.removed) {
            this.removed = true;
            try {
                this.handler.handlerRemoved(this);
            } catch (Throwable th) {
                fireExceptionCaught(new C0272t0(this.handler.getClass().getName().concat(".handlerRemoved() has thrown an exception."), th));
            }
        }
    }

    public C0187o alloc() {
        return this.ctx.alloc();
    }

    public K channel() {
        return this.ctx.channel();
    }

    public P close() {
        return this.ctx.close();
    }

    public P connect(SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        return this.ctx.connect(socketAddress, socketAddress2, u0Var);
    }

    public P disconnect(C0274u0 u0Var) {
        return this.ctx.disconnect(u0Var);
    }

    public C0929t executor() {
        return this.ctx.executor();
    }

    public Y fireChannelActive() {
        this.ctx.fireChannelActive();
        return this;
    }

    public Y fireChannelInactive() {
        this.ctx.fireChannelInactive();
        return this;
    }

    public Y fireChannelRead(Object obj) {
        this.ctx.fireChannelRead(obj);
        return this;
    }

    public Y fireChannelReadComplete() {
        this.ctx.fireChannelReadComplete();
        return this;
    }

    public Y fireChannelRegistered() {
        this.ctx.fireChannelRegistered();
        return this;
    }

    public Y fireChannelUnregistered() {
        this.ctx.fireChannelUnregistered();
        return this;
    }

    public Y fireChannelWritabilityChanged() {
        this.ctx.fireChannelWritabilityChanged();
        return this;
    }

    public Y fireExceptionCaught(Throwable th) {
        this.ctx.fireExceptionCaught(th);
        return this;
    }

    public Y fireUserEventTriggered(Object obj) {
        this.ctx.fireUserEventTriggered(obj);
        return this;
    }

    public Y flush() {
        this.ctx.flush();
        return this;
    }

    public W handler() {
        return this.ctx.handler();
    }

    public boolean isRemoved() {
        if (this.removed || this.ctx.isRemoved()) {
            return true;
        }
        return false;
    }

    public String name() {
        return this.ctx.name();
    }

    public P newFailedFuture(Throwable th) {
        return this.ctx.newFailedFuture(th);
    }

    public C0274u0 newPromise() {
        return this.ctx.newPromise();
    }

    public C0270s0 pipeline() {
        return this.ctx.pipeline();
    }

    public Y read() {
        this.ctx.read();
        return this;
    }

    public final void remove() {
        C0911a aVar = (C0911a) executor();
        if (aVar.inEventLoop()) {
            remove0();
        } else {
            aVar.execute(new C0278w0(this));
        }
    }

    public C0274u0 voidPromise() {
        return this.ctx.voidPromise();
    }

    public P write(Object obj) {
        return this.ctx.write(obj);
    }

    public P writeAndFlush(Object obj, C0274u0 u0Var) {
        return this.ctx.writeAndFlush(obj, u0Var);
    }

    public P close(C0274u0 u0Var) {
        return this.ctx.close(u0Var);
    }

    public P write(Object obj, C0274u0 u0Var) {
        return this.ctx.write(obj, u0Var);
    }

    public P writeAndFlush(Object obj) {
        return this.ctx.writeAndFlush(obj);
    }
}
