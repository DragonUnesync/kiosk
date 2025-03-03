package T5;

import g6.B;
import h6.C1082c;
import h6.d;
import java.net.SocketAddress;

/* renamed from: T5.y0  reason: case insensitive filesystem */
public abstract class C0282y0 extends M {
    /* access modifiers changed from: private */
    public static final C1082c logger = d.getInstance((Class<?>) C0282y0.class);
    private volatile boolean handlerAdded;
    private C0280x0 inboundCtx;
    private C0243e0 inboundHandler;
    /* access modifiers changed from: private */
    public C0280x0 outboundCtx;
    /* access modifiers changed from: private */
    public C0265p0 outboundHandler;

    public C0282y0() {
        ensureNotSharable();
    }

    private void checkAdded() {
        if (!this.handlerAdded) {
            throw new IllegalStateException("handler not added to pipeline yet");
        }
    }

    private void validate(C0243e0 e0Var, C0265p0 p0Var) {
        if (this.inboundHandler == null) {
            B.checkNotNull(e0Var, "inboundHandler");
            B.checkNotNull(p0Var, "outboundHandler");
            if (e0Var instanceof C0265p0) {
                throw new IllegalArgumentException("inboundHandler must not implement " + C0265p0.class.getSimpleName() + " to get combined.");
            } else if (p0Var instanceof C0243e0) {
                throw new IllegalArgumentException("outboundHandler must not implement " + C0243e0.class.getSimpleName() + " to get combined.");
            }
        } else {
            throw new IllegalStateException("init() can not be invoked if " + C0282y0.class.getSimpleName() + " was constructed with non-default constructor.");
        }
    }

    public void channelActive(Y y8) {
        C0280x0 x0Var = this.inboundCtx;
        if (!x0Var.removed) {
            this.inboundHandler.channelActive(x0Var);
        } else {
            x0Var.fireChannelActive();
        }
    }

    public void channelInactive(Y y8) {
        C0280x0 x0Var = this.inboundCtx;
        if (!x0Var.removed) {
            this.inboundHandler.channelInactive(x0Var);
        } else {
            x0Var.fireChannelInactive();
        }
    }

    public void channelRead(Y y8, Object obj) {
        C0280x0 x0Var = this.inboundCtx;
        if (!x0Var.removed) {
            this.inboundHandler.channelRead(x0Var, obj);
        } else {
            x0Var.fireChannelRead(obj);
        }
    }

    public void channelReadComplete(Y y8) {
        C0280x0 x0Var = this.inboundCtx;
        if (!x0Var.removed) {
            this.inboundHandler.channelReadComplete(x0Var);
        } else {
            x0Var.fireChannelReadComplete();
        }
    }

    public void channelRegistered(Y y8) {
        C0280x0 x0Var = this.inboundCtx;
        if (!x0Var.removed) {
            this.inboundHandler.channelRegistered(x0Var);
        } else {
            x0Var.fireChannelRegistered();
        }
    }

    public void channelUnregistered(Y y8) {
        C0280x0 x0Var = this.inboundCtx;
        if (!x0Var.removed) {
            this.inboundHandler.channelUnregistered(x0Var);
        } else {
            x0Var.fireChannelUnregistered();
        }
    }

    public void channelWritabilityChanged(Y y8) {
        C0280x0 x0Var = this.inboundCtx;
        if (!x0Var.removed) {
            this.inboundHandler.channelWritabilityChanged(x0Var);
        } else {
            x0Var.fireChannelWritabilityChanged();
        }
    }

    public void close(Y y8, C0274u0 u0Var) {
        C0280x0 x0Var = this.outboundCtx;
        if (!x0Var.removed) {
            this.outboundHandler.close(x0Var, u0Var);
        } else {
            x0Var.close(u0Var);
        }
    }

    public void connect(Y y8, SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        C0280x0 x0Var = this.outboundCtx;
        if (!x0Var.removed) {
            this.outboundHandler.connect(x0Var, socketAddress, socketAddress2, u0Var);
        } else {
            x0Var.connect(socketAddress, socketAddress2, u0Var);
        }
    }

    public void disconnect(Y y8, C0274u0 u0Var) {
        C0280x0 x0Var = this.outboundCtx;
        if (!x0Var.removed) {
            this.outboundHandler.disconnect(x0Var, u0Var);
        } else {
            x0Var.disconnect(u0Var);
        }
    }

    public void exceptionCaught(Y y8, Throwable th) {
        C0280x0 x0Var = this.inboundCtx;
        if (!x0Var.removed) {
            this.inboundHandler.exceptionCaught(x0Var, th);
        } else {
            x0Var.fireExceptionCaught(th);
        }
    }

    public void flush(Y y8) {
        C0280x0 x0Var = this.outboundCtx;
        if (!x0Var.removed) {
            this.outboundHandler.flush(x0Var);
        } else {
            x0Var.flush();
        }
    }

    public void handlerAdded(Y y8) {
        if (this.inboundHandler != null) {
            this.outboundCtx = new C0280x0(y8, this.outboundHandler);
            this.inboundCtx = new C0276v0(this, y8, this.inboundHandler);
            this.handlerAdded = true;
            try {
                this.inboundHandler.handlerAdded(this.inboundCtx);
            } finally {
                this.outboundHandler.handlerAdded(this.outboundCtx);
            }
        } else {
            throw new IllegalStateException("init() must be invoked before being added to a " + C0270s0.class.getSimpleName() + " if " + C0282y0.class.getSimpleName() + " was constructed with the default constructor.");
        }
    }

    public void handlerRemoved(Y y8) {
        try {
            this.inboundCtx.remove();
        } finally {
            this.outboundCtx.remove();
        }
    }

    public final void init(C0243e0 e0Var, C0265p0 p0Var) {
        validate(e0Var, p0Var);
        this.inboundHandler = e0Var;
        this.outboundHandler = p0Var;
    }

    public void read(Y y8) {
        C0280x0 x0Var = this.outboundCtx;
        if (!x0Var.removed) {
            this.outboundHandler.read(x0Var);
        } else {
            x0Var.read();
        }
    }

    public final void removeOutboundHandler() {
        checkAdded();
        this.outboundCtx.remove();
    }

    public void userEventTriggered(Y y8, Object obj) {
        C0280x0 x0Var = this.inboundCtx;
        if (!x0Var.removed) {
            this.inboundHandler.userEventTriggered(x0Var, obj);
        } else {
            x0Var.fireUserEventTriggered(obj);
        }
    }

    public void write(Y y8, Object obj, C0274u0 u0Var) {
        C0280x0 x0Var = this.outboundCtx;
        if (!x0Var.removed) {
            this.outboundHandler.write(x0Var, obj, u0Var);
        } else {
            x0Var.write(obj, u0Var);
        }
    }
}
