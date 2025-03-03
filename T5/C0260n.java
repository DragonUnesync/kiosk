package T5;

import S5.C0187o;
import e6.C0856o;
import h6.C1082c;
import h6.d;
import java.net.SocketAddress;

/* renamed from: T5.n  reason: case insensitive filesystem */
public abstract class C0260n extends C0856o implements K {
    /* access modifiers changed from: private */
    public static final C1082c logger = d.getInstance((Class<?>) C0260n.class);
    /* access modifiers changed from: private */
    public final C0258m closeFuture = new C0258m(this);
    /* access modifiers changed from: private */
    public boolean closeInitiated;
    /* access modifiers changed from: private */
    public volatile Z0 eventLoop;
    private final C0241d0 id;
    /* access modifiers changed from: private */
    public Throwable initialCloseCause;
    /* access modifiers changed from: private */
    public volatile SocketAddress localAddress;
    private final K parent;
    /* access modifiers changed from: private */
    public final O0 pipeline;
    /* access modifiers changed from: private */
    public volatile boolean registered;
    /* access modifiers changed from: private */
    public volatile SocketAddress remoteAddress;
    private String strVal;
    private boolean strValActive;
    private final J unsafe;
    /* access modifiers changed from: private */
    public final v1 unsafeVoidPromise = new v1(this, false);

    public C0260n(K k8) {
        this.parent = k8;
        this.id = newId();
        this.unsafe = newUnsafe();
        this.pipeline = newChannelPipeline();
    }

    public C0187o alloc() {
        return ((B0) config()).getAllocator();
    }

    public P close() {
        return this.pipeline.close();
    }

    public P connect(SocketAddress socketAddress, C0274u0 u0Var) {
        return this.pipeline.connect(socketAddress, u0Var);
    }

    public abstract void doBeginRead();

    public abstract void doClose();

    public void doDeregister() {
    }

    public abstract void doDisconnect();

    public void doRegister() {
    }

    public void doShutdownOutput() {
        doClose();
    }

    public abstract void doWrite(C0263o0 o0Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public Z0 eventLoop() {
        Z0 z02 = this.eventLoop;
        if (z02 != null) {
            return z02;
        }
        throw new IllegalStateException("channel not registered to an event loop");
    }

    public Object filterOutboundMessage(Object obj) {
        return obj;
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public final C0241d0 id() {
        return this.id;
    }

    public abstract boolean isCompatible(Z0 z02);

    public boolean isRegistered() {
        return this.registered;
    }

    public boolean isWritable() {
        C0263o0 outboundBuffer = ((C0250i) this.unsafe).outboundBuffer();
        if (outboundBuffer == null || !outboundBuffer.isWritable()) {
            return false;
        }
        return true;
    }

    public SocketAddress localAddress() {
        SocketAddress socketAddress = this.localAddress;
        if (socketAddress != null) {
            return socketAddress;
        }
        try {
            SocketAddress localAddress2 = ((C0250i) unsafe()).localAddress();
            this.localAddress = localAddress2;
            return localAddress2;
        } catch (Error e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract SocketAddress localAddress0();

    public O0 newChannelPipeline() {
        return new O0(this);
    }

    public P newFailedFuture(Throwable th) {
        return this.pipeline.newFailedFuture(th);
    }

    public C0241d0 newId() {
        return D0.newInstance();
    }

    public C0274u0 newPromise() {
        return this.pipeline.newPromise();
    }

    public abstract C0250i newUnsafe();

    public C0270s0 pipeline() {
        return this.pipeline;
    }

    public K read() {
        this.pipeline.read();
        return this;
    }

    public SocketAddress remoteAddress() {
        SocketAddress socketAddress = this.remoteAddress;
        if (socketAddress != null) {
            return socketAddress;
        }
        try {
            SocketAddress remoteAddress2 = ((C0250i) unsafe()).remoteAddress();
            this.remoteAddress = remoteAddress2;
            return remoteAddress2;
        } catch (Error e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract SocketAddress remoteAddress0();

    public String toString() {
        String str;
        String str2;
        boolean isActive = isActive();
        if (this.strValActive == isActive && (str2 = this.strVal) != null) {
            return str2;
        }
        SocketAddress remoteAddress2 = remoteAddress();
        SocketAddress localAddress2 = localAddress();
        if (remoteAddress2 != null) {
            StringBuilder sb = new StringBuilder(96);
            sb.append("[id: 0x");
            sb.append(((D0) this.id).asShortText());
            sb.append(", L:");
            sb.append(localAddress2);
            if (isActive) {
                str = " - ";
            } else {
                str = " ! ";
            }
            sb.append(str);
            sb.append("R:");
            sb.append(remoteAddress2);
            sb.append(']');
            this.strVal = sb.toString();
        } else if (localAddress2 != null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("[id: 0x");
            sb2.append(((D0) this.id).asShortText());
            sb2.append(", L:");
            sb2.append(localAddress2);
            sb2.append(']');
            this.strVal = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder(16);
            sb3.append("[id: 0x");
            sb3.append(((D0) this.id).asShortText());
            sb3.append(']');
            this.strVal = sb3.toString();
        }
        this.strValActive = isActive;
        return this.strVal;
    }

    public J unsafe() {
        return this.unsafe;
    }

    public final C0274u0 voidPromise() {
        return this.pipeline.voidPromise();
    }

    public P writeAndFlush(Object obj) {
        return this.pipeline.writeAndFlush(obj);
    }

    public final int compareTo(K k8) {
        if (this == k8) {
            return 0;
        }
        return ((D0) id()).compareTo((Object) ((C0260n) k8).id());
    }

    public P connect(SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        return this.pipeline.connect(socketAddress, socketAddress2, u0Var);
    }
}
