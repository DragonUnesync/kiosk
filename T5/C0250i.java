package T5;

import V5.c;
import V5.d;
import e6.I;
import f6.C0910C;
import f6.C0911a;
import f6.d0;
import g6.B;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: T5.i  reason: case insensitive filesystem */
public abstract class C0250i implements J {
    private boolean inFlush0;
    private boolean neverRegistered = true;
    private volatile C0263o0 outboundBuffer;
    private n1 recvHandle;
    final /* synthetic */ C0260n this$0;

    public C0250i(C0260n nVar) {
        this.this$0 = nVar;
        this.outboundBuffer = new C0263o0(nVar);
    }

    private void assertEventLoop() {
    }

    private void closeOutboundBufferForShutdown(C0270s0 s0Var, C0263o0 o0Var, Throwable th) {
        o0Var.failFlushed(th, false);
        o0Var.close(th, true);
        ((O0) s0Var).fireUserEventTriggered(c.INSTANCE);
    }

    private void deregister(C0274u0 u0Var, boolean z) {
        if (u0Var.setUncancellable()) {
            if (!this.this$0.registered) {
                safeSetSuccess(u0Var);
            } else {
                invokeLater(new C0246g(this, z, u0Var));
            }
        }
    }

    /* access modifiers changed from: private */
    public void doClose0(C0274u0 u0Var) {
        try {
            this.this$0.doClose();
            this.this$0.closeFuture.setClosed();
            safeSetSuccess(u0Var);
        } catch (Throwable th) {
            this.this$0.closeFuture.setClosed();
            safeSetFailure(u0Var, th);
        }
    }

    /* access modifiers changed from: private */
    public void fireChannelInactiveAndDeregister(boolean z) {
        boolean z6;
        C0274u0 voidPromise = voidPromise();
        if (!z || this.this$0.isActive()) {
            z6 = false;
        } else {
            z6 = true;
        }
        deregister(voidPromise, z6);
    }

    /* access modifiers changed from: private */
    public void invokeLater(Runnable runnable) {
        try {
            ((d0) this.this$0.eventLoop()).execute(runnable);
        } catch (RejectedExecutionException e) {
            C0260n.logger.warn("Can't invoke task later as EventLoop rejected it", (Throwable) e);
        }
    }

    private ClosedChannelException newClosedChannelException(Throwable th, String str) {
        s1 newInstance = s1.newInstance(C0250i.class, str);
        if (th != null) {
            newInstance.initCause(th);
        }
        return newInstance;
    }

    /* access modifiers changed from: private */
    public void register0(C0274u0 u0Var) {
        try {
            if (!u0Var.setUncancellable()) {
                return;
            }
            if (ensureOpen(u0Var)) {
                boolean z = this.neverRegistered;
                this.this$0.doRegister();
                this.neverRegistered = false;
                boolean unused = this.this$0.registered = true;
                this.this$0.pipeline.invokeHandlerAddedIfNeeded();
                safeSetSuccess(u0Var);
                this.this$0.pipeline.fireChannelRegistered();
                if (!this.this$0.isActive()) {
                    return;
                }
                if (z) {
                    this.this$0.pipeline.fireChannelActive();
                } else if (((B0) this.this$0.config()).isAutoRead()) {
                    beginRead();
                }
            }
        } catch (Throwable th) {
            closeForcibly();
            this.this$0.closeFuture.setClosed();
            safeSetFailure(u0Var, th);
        }
    }

    public final Throwable annotateConnectException(Throwable th, SocketAddress socketAddress) {
        if (th instanceof ConnectException) {
            return new C0252j((ConnectException) th, socketAddress);
        }
        if (th instanceof NoRouteToHostException) {
            return new C0254k((NoRouteToHostException) th, socketAddress);
        }
        if (th instanceof SocketException) {
            return new C0256l((SocketException) th, socketAddress);
        }
        return th;
    }

    public final void beginRead() {
        assertEventLoop();
        try {
            this.this$0.doBeginRead();
        } catch (Exception e) {
            invokeLater(new C0248h(this, e));
            close(voidPromise());
        }
    }

    public void close(C0274u0 u0Var) {
        assertEventLoop();
        s1 newInstance = s1.newInstance(C0260n.class, "close(ChannelPromise)");
        close(u0Var, newInstance, newInstance, false);
    }

    public final void closeForcibly() {
        assertEventLoop();
        try {
            this.this$0.doClose();
        } catch (Exception e) {
            C0260n.logger.warn("Failed to close a channel.", (Throwable) e);
        }
    }

    public final void closeIfClosed() {
        if (!this.this$0.isOpen()) {
            close(voidPromise());
        }
    }

    public final void disconnect(C0274u0 u0Var) {
        assertEventLoop();
        if (u0Var.setUncancellable()) {
            boolean isActive = this.this$0.isActive();
            try {
                this.this$0.doDisconnect();
                SocketAddress unused = this.this$0.remoteAddress = null;
                SocketAddress unused2 = this.this$0.localAddress = null;
                if (isActive && !this.this$0.isActive()) {
                    invokeLater(new C0236b(this));
                }
                safeSetSuccess(u0Var);
                closeIfClosed();
            } catch (Throwable th) {
                safeSetFailure(u0Var, th);
                closeIfClosed();
            }
        }
    }

    public final boolean ensureOpen(C0274u0 u0Var) {
        if (this.this$0.isOpen()) {
            return true;
        }
        safeSetFailure(u0Var, newClosedChannelException(this.this$0.initialCloseCause, "ensureOpen(ChannelPromise)"));
        return false;
    }

    public final void flush() {
        assertEventLoop();
        C0263o0 o0Var = this.outboundBuffer;
        if (o0Var != null) {
            o0Var.addFlush();
            flush0();
        }
    }

    public void flush0() {
        C0263o0 o0Var;
        if (!this.inFlush0 && (o0Var = this.outboundBuffer) != null && !o0Var.isEmpty()) {
            this.inFlush0 = true;
            if (!this.this$0.isActive()) {
                try {
                    if (!o0Var.isEmpty()) {
                        if (this.this$0.isOpen()) {
                            o0Var.failFlushed(new NotYetConnectedException(), true);
                        } else {
                            o0Var.failFlushed(newClosedChannelException(this.this$0.initialCloseCause, "flush0()"), false);
                        }
                    }
                } finally {
                    this.inFlush0 = false;
                }
            } else {
                try {
                    this.this$0.doWrite(o0Var);
                } catch (Throwable th) {
                    this.inFlush0 = false;
                    throw th;
                }
                this.inFlush0 = false;
            }
        }
    }

    public final void handleWriteError(Throwable th) {
        if (!(th instanceof IOException) || !((B0) this.this$0.config()).isAutoClose()) {
            try {
                shutdownOutput(voidPromise(), th);
            } catch (Throwable th2) {
                Throwable unused = this.this$0.initialCloseCause = th;
                close(voidPromise(), th2, newClosedChannelException(th, "flush0()"), false);
            }
        } else {
            Throwable unused2 = this.this$0.initialCloseCause = th;
            close(voidPromise(), th, newClosedChannelException(th, "flush0()"), false);
        }
    }

    public final SocketAddress localAddress() {
        return this.this$0.localAddress0();
    }

    public final C0263o0 outboundBuffer() {
        return this.outboundBuffer;
    }

    public Executor prepareToClose() {
        return null;
    }

    public n1 recvBufAllocHandle() {
        if (this.recvHandle == null) {
            this.recvHandle = ((I) ((B0) this.this$0.config()).getRecvByteBufAllocator()).newHandle();
        }
        return this.recvHandle;
    }

    public final void register(Z0 z02, C0274u0 u0Var) {
        B.checkNotNull(z02, "eventLoop");
        if (this.this$0.isRegistered()) {
            u0Var.setFailure(new IllegalStateException("registered to an event loop already"));
        } else if (!this.this$0.isCompatible(z02)) {
            u0Var.setFailure(new IllegalStateException("incompatible event loop type: ".concat(z02.getClass().getName())));
        } else {
            Z0 unused = this.this$0.eventLoop = z02;
            if (((C0911a) z02).inEventLoop()) {
                register0(u0Var);
                return;
            }
            try {
                ((d0) z02).execute(new C0234a(this, u0Var));
            } catch (Throwable th) {
                C0260n.logger.warn("Force-closing a channel whose registration task was not accepted by an event loop: {}", this.this$0, th);
                closeForcibly();
                this.this$0.closeFuture.setClosed();
                safeSetFailure(u0Var, th);
            }
        }
    }

    public final SocketAddress remoteAddress() {
        return this.this$0.remoteAddress0();
    }

    public final void safeSetFailure(C0274u0 u0Var, Throwable th) {
        if (!(u0Var instanceof v1) && !u0Var.tryFailure(th)) {
            C0260n.logger.warn("Failed to mark a promise as failure because it's done already: {}", u0Var, th);
        }
    }

    public final void safeSetSuccess(C0274u0 u0Var) {
        if (!(u0Var instanceof v1) && !u0Var.trySuccess()) {
            C0260n.logger.warn("Failed to mark a promise as success because it is done already: {}", (Object) u0Var);
        }
    }

    public final void shutdownOutput(C0274u0 u0Var) {
        assertEventLoop();
        shutdownOutput(u0Var, (Throwable) null);
    }

    public final C0274u0 voidPromise() {
        assertEventLoop();
        return this.this$0.unsafeVoidPromise;
    }

    public final void write(Object obj, C0274u0 u0Var) {
        assertEventLoop();
        C0263o0 o0Var = this.outboundBuffer;
        if (o0Var == null) {
            try {
                I.release(obj);
            } finally {
                safeSetFailure(u0Var, newClosedChannelException(this.this$0.initialCloseCause, "write(Object, ChannelPromise)"));
            }
        } else {
            try {
                Object filterOutboundMessage = this.this$0.filterOutboundMessage(obj);
                int size = this.this$0.pipeline.estimatorHandle().size(filterOutboundMessage);
                if (size < 0) {
                    size = 0;
                }
                o0Var.addMessage(filterOutboundMessage, size, u0Var);
            } catch (Throwable th) {
                safeSetFailure(u0Var, th);
                throw th;
            }
        }
    }

    private void shutdownOutput(C0274u0 u0Var, Throwable th) {
        if (u0Var.setUncancellable()) {
            C0263o0 o0Var = this.outboundBuffer;
            if (o0Var == null) {
                u0Var.setFailure(new ClosedChannelException());
                return;
            }
            this.outboundBuffer = null;
            d dVar = th == null ? new d("Channel output shutdown") : new d("Channel output shutdown", th);
            try {
                this.this$0.doShutdownOutput();
                u0Var.setSuccess();
            } catch (Throwable th2) {
                closeOutboundBufferForShutdown(this.this$0.pipeline, o0Var, dVar);
                throw th2;
            }
            closeOutboundBufferForShutdown(this.this$0.pipeline, o0Var, dVar);
        }
    }

    private void close(C0274u0 u0Var, Throwable th, ClosedChannelException closedChannelException, boolean z) {
        if (u0Var.setUncancellable()) {
            if (!this.this$0.closeInitiated) {
                boolean unused = this.this$0.closeInitiated = true;
                boolean isActive = this.this$0.isActive();
                C0263o0 o0Var = this.outboundBuffer;
                this.outboundBuffer = null;
                Executor prepareToClose = prepareToClose();
                if (prepareToClose != null) {
                    prepareToClose.execute(new C0242e(this, u0Var, o0Var, th, z, closedChannelException, isActive));
                    return;
                }
                try {
                    doClose0(u0Var);
                    if (this.inFlush0) {
                        invokeLater(new C0244f(this, isActive));
                    } else {
                        fireChannelInactiveAndDeregister(isActive);
                    }
                } finally {
                    if (o0Var != null) {
                        o0Var.failFlushed(th, z);
                        o0Var.close(closedChannelException);
                    }
                }
            } else if (this.this$0.closeFuture.isDone()) {
                safeSetSuccess(u0Var);
            } else if (!(u0Var instanceof v1)) {
                this.this$0.closeFuture.addListener((C0910C) new C0238c(this, u0Var));
            }
        }
    }
}
