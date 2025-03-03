package T5;

import N.e;
import S5.C0187o;
import e6.I;
import e6.T;
import f6.C0911a;
import f6.C0929t;
import f6.K;
import g6.B;
import g6.C0969b0;
import g6.n0;
import g6.x0;
import h6.C1082c;
import h6.d;
import java.net.SocketAddress;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class F implements Y, T {
    private static final AtomicIntegerFieldUpdater<F> HANDLER_STATE_UPDATER;
    private static final C1082c logger;
    private final int executionMask;
    final C0929t executor;
    private volatile int handlerState = 0;
    private C invokeTasks;
    private final String name;
    volatile F next;
    private final boolean ordered;
    /* access modifiers changed from: private */
    public final O0 pipeline;
    volatile F prev;

    static {
        Class<F> cls = F.class;
        logger = d.getInstance((Class<?>) cls);
        HANDLER_STATE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(cls, "handlerState");
    }

    public F(O0 o02, C0929t tVar, String str, Class<? extends W> cls) {
        boolean z = false;
        this.name = (String) B.checkNotNull(str, "name");
        this.pipeline = o02;
        this.executor = tVar;
        this.executionMask = C0239c0.mask(cls);
        this.ordered = (tVar == null || (tVar instanceof K)) ? true : z;
    }

    private F findContextInbound(int i) {
        C0929t executor2 = executor();
        F f8 = this;
        do {
            f8 = f8.next;
        } while (skipContext(f8, executor2, i, 510));
        return f8;
    }

    private F findContextOutbound(int i) {
        C0929t executor2 = executor();
        F f8 = this;
        do {
            f8 = f8.prev;
        } while (skipContext(f8, executor2, i, 130560));
        return f8;
    }

    public static void invokeChannelActive(F f8) {
        C0911a aVar = (C0911a) f8.executor();
        if (aVar.inEventLoop()) {
            f8.invokeChannelActive();
        } else {
            aVar.execute(new C0269s(f8));
        }
    }

    public static void invokeChannelInactive(F f8) {
        C0911a aVar = (C0911a) f8.executor();
        if (aVar.inEventLoop()) {
            f8.invokeChannelInactive();
        } else {
            aVar.execute(new C0271t(f8));
        }
    }

    public static void invokeChannelRead(F f8, Object obj) {
        Object obj2 = f8.pipeline.touch(B.checkNotNull(obj, "msg"), f8);
        C0911a aVar = (C0911a) f8.executor();
        if (aVar.inEventLoop()) {
            f8.invokeChannelRead(obj2);
        } else {
            aVar.execute(new C0277w(f8, obj2));
        }
    }

    public static void invokeChannelReadComplete(F f8) {
        C0911a aVar = (C0911a) f8.executor();
        if (aVar.inEventLoop()) {
            f8.invokeChannelReadComplete();
            return;
        }
        C c8 = f8.invokeTasks;
        if (c8 == null) {
            c8 = new C(f8);
            f8.invokeTasks = c8;
        }
        aVar.execute(c8.invokeChannelReadCompleteTask);
    }

    public static void invokeChannelRegistered(F f8) {
        C0911a aVar = (C0911a) f8.executor();
        if (aVar.inEventLoop()) {
            f8.invokeChannelRegistered();
        } else {
            aVar.execute(new C0266q(f8));
        }
    }

    public static void invokeChannelUnregistered(F f8) {
        C0911a aVar = (C0911a) f8.executor();
        if (aVar.inEventLoop()) {
            f8.invokeChannelUnregistered();
        } else {
            aVar.execute(new r(f8));
        }
    }

    public static void invokeChannelWritabilityChanged(F f8) {
        C0911a aVar = (C0911a) f8.executor();
        if (aVar.inEventLoop()) {
            f8.invokeChannelWritabilityChanged();
            return;
        }
        C c8 = f8.invokeTasks;
        if (c8 == null) {
            c8 = new C(f8);
            f8.invokeTasks = c8;
        }
        aVar.execute(c8.invokeChannelWritableStateChangedTask);
    }

    /* access modifiers changed from: private */
    public void invokeClose(C0274u0 u0Var) {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.close(this, u0Var);
                } else if (handler instanceof M) {
                    ((M) handler).close(this, u0Var);
                } else {
                    ((C0265p0) handler).close(this, u0Var);
                }
            } catch (Throwable th) {
                notifyOutboundHandlerException(th, u0Var);
            }
        } else {
            close(u0Var);
        }
    }

    /* access modifiers changed from: private */
    public void invokeConnect(SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.connect(this, socketAddress, socketAddress2, u0Var);
                } else if (handler instanceof M) {
                    ((M) handler).connect(this, socketAddress, socketAddress2, u0Var);
                } else {
                    ((C0265p0) handler).connect(this, socketAddress, socketAddress2, u0Var);
                }
            } catch (Throwable th) {
                notifyOutboundHandlerException(th, u0Var);
            }
        } else {
            connect(socketAddress, socketAddress2, u0Var);
        }
    }

    /* access modifiers changed from: private */
    public void invokeDisconnect(C0274u0 u0Var) {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.disconnect(this, u0Var);
                } else if (handler instanceof M) {
                    ((M) handler).disconnect(this, u0Var);
                } else {
                    ((C0265p0) handler).disconnect(this, u0Var);
                }
            } catch (Throwable th) {
                notifyOutboundHandlerException(th, u0Var);
            }
        } else {
            disconnect(u0Var);
        }
    }

    public static void invokeExceptionCaught(F f8, Throwable th) {
        B.checkNotNull(th, "cause");
        C0911a aVar = (C0911a) f8.executor();
        if (aVar.inEventLoop()) {
            f8.invokeExceptionCaught(th);
            return;
        }
        try {
            aVar.execute(new C0273u(f8, th));
        } catch (Throwable th2) {
            C1082c cVar = logger;
            if (cVar.isWarnEnabled()) {
                cVar.warn("Failed to submit an exceptionCaught() event.", th2);
                cVar.warn("The exceptionCaught() event that was failed to submit was:", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public void invokeFlush() {
        if (invokeHandler()) {
            invokeFlush0();
        } else {
            flush();
        }
    }

    private void invokeFlush0() {
        try {
            W handler = handler();
            J0 j02 = this.pipeline.head;
            if (handler == j02) {
                j02.flush(this);
            } else if (handler instanceof M) {
                ((M) handler).flush(this);
            } else {
                ((C0265p0) handler).flush(this);
            }
        } catch (Throwable th) {
            invokeExceptionCaught(th);
        }
    }

    private boolean invokeHandler() {
        int i = this.handlerState;
        if (i == 2) {
            return true;
        }
        if (this.ordered || i != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void invokeRead() {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.read(this);
                } else if (handler instanceof M) {
                    ((M) handler).read(this);
                } else {
                    ((C0265p0) handler).read(this);
                }
            } catch (Throwable th) {
                invokeExceptionCaught(th);
            }
        } else {
            read();
        }
    }

    public static void invokeUserEventTriggered(F f8, Object obj) {
        B.checkNotNull(obj, "event");
        C0911a aVar = (C0911a) f8.executor();
        if (aVar.inEventLoop()) {
            f8.invokeUserEventTriggered(obj);
        } else {
            aVar.execute(new C0275v(f8, obj));
        }
    }

    private void invokeWrite0(Object obj, C0274u0 u0Var) {
        try {
            W handler = handler();
            J0 j02 = this.pipeline.head;
            if (handler == j02) {
                j02.write(this, obj, u0Var);
            } else if (handler instanceof M) {
                ((M) handler).write(this, obj, u0Var);
            } else {
                ((C0265p0) handler).write(this, obj, u0Var);
            }
        } catch (Throwable th) {
            notifyOutboundHandlerException(th, u0Var);
        }
    }

    private boolean isNotValidPromise(C0274u0 u0Var, boolean z) {
        B.checkNotNull(u0Var, "promise");
        if (u0Var.isDone()) {
            if (u0Var.isCancelled()) {
                return true;
            }
            throw new IllegalArgumentException("promise already done: " + u0Var);
        } else if (u0Var.channel() != channel()) {
            throw new IllegalArgumentException(String.format("promise.channel does not match: %s (expected: %s)", new Object[]{u0Var.channel(), channel()}));
        } else if (u0Var.getClass() == P0.class) {
            return false;
        } else {
            if (!z && (u0Var instanceof v1)) {
                throw new IllegalArgumentException(n0.simpleClassName((Class<?>) v1.class) + " not allowed for this operation");
            } else if (!(u0Var instanceof C0258m)) {
                return false;
            } else {
                throw new IllegalArgumentException(n0.simpleClassName((Class<?>) C0258m.class) + " not allowed in a pipeline");
            }
        }
    }

    private static void notifyOutboundHandlerException(Throwable th, C0274u0 u0Var) {
        C1082c cVar;
        if (u0Var instanceof v1) {
            cVar = null;
        } else {
            cVar = logger;
        }
        C0969b0.tryFailure(u0Var, th, cVar);
    }

    private static boolean safeExecute(C0929t tVar, Runnable runnable, C0274u0 u0Var, Object obj, boolean z) {
        if (z) {
            try {
                if (tVar instanceof C0911a) {
                    ((C0911a) tVar).lazyExecute(runnable);
                    return true;
                }
            } catch (Throwable th) {
                u0Var.setFailure(th);
                throw th;
            }
        }
        tVar.execute(runnable);
        return true;
    }

    private static boolean skipContext(F f8, C0929t tVar, int i, int i8) {
        if (((i8 | i) & f8.executionMask) == 0 || (f8.executor() == tVar && (f8.executionMask & i) == 0)) {
            return true;
        }
        return false;
    }

    public C0187o alloc() {
        return ((B0) channel().config()).getAllocator();
    }

    public final void callHandlerAdded() {
        if (setAddComplete()) {
            handler().handlerAdded(this);
        }
    }

    public final void callHandlerRemoved() {
        try {
            if (this.handlerState == 2) {
                handler().handlerRemoved(this);
            }
        } finally {
            setRemoved();
        }
    }

    public K channel() {
        return this.pipeline.channel();
    }

    public P close() {
        return close(newPromise());
    }

    public P connect(SocketAddress socketAddress, C0274u0 u0Var) {
        return connect(socketAddress, (SocketAddress) null, u0Var);
    }

    public P disconnect(C0274u0 u0Var) {
        if (!channel().metadata().hasDisconnect()) {
            return close(u0Var);
        }
        if (isNotValidPromise(u0Var, false)) {
            return u0Var;
        }
        F findContextOutbound = findContextOutbound(2048);
        C0911a aVar = (C0911a) findContextOutbound.executor();
        if (aVar.inEventLoop()) {
            findContextOutbound.invokeDisconnect(u0Var);
        } else {
            safeExecute(aVar, new C0262o(this, findContextOutbound, u0Var), u0Var, (Object) null, false);
        }
        return u0Var;
    }

    public C0929t executor() {
        C0929t tVar = this.executor;
        if (tVar == null) {
            return channel().eventLoop();
        }
        return tVar;
    }

    public Y fireChannelActive() {
        invokeChannelActive(findContextInbound(8));
        return this;
    }

    public Y fireChannelInactive() {
        invokeChannelInactive(findContextInbound(16));
        return this;
    }

    public Y fireChannelRead(Object obj) {
        invokeChannelRead(findContextInbound(32), obj);
        return this;
    }

    public Y fireChannelReadComplete() {
        invokeChannelReadComplete(findContextInbound(64));
        return this;
    }

    public Y fireChannelRegistered() {
        invokeChannelRegistered(findContextInbound(2));
        return this;
    }

    public Y fireChannelUnregistered() {
        invokeChannelUnregistered(findContextInbound(4));
        return this;
    }

    public Y fireChannelWritabilityChanged() {
        invokeChannelWritabilityChanged(findContextInbound(256));
        return this;
    }

    public Y fireExceptionCaught(Throwable th) {
        invokeExceptionCaught(findContextInbound(1), th);
        return this;
    }

    public Y fireUserEventTriggered(Object obj) {
        invokeUserEventTriggered(findContextInbound(128), obj);
        return this;
    }

    public Y flush() {
        F findContextOutbound = findContextOutbound(65536);
        C0911a aVar = (C0911a) findContextOutbound.executor();
        if (aVar.inEventLoop()) {
            findContextOutbound.invokeFlush();
        } else {
            C c8 = findContextOutbound.invokeTasks;
            if (c8 == null) {
                c8 = new C(findContextOutbound);
                findContextOutbound.invokeTasks = c8;
            }
            safeExecute(aVar, c8.invokeFlushTask, ((C0260n) channel()).voidPromise(), (Object) null, false);
        }
        return this;
    }

    public void invokeWrite(Object obj, C0274u0 u0Var) {
        if (invokeHandler()) {
            invokeWrite0(obj, u0Var);
        } else {
            write(obj, u0Var);
        }
    }

    public void invokeWriteAndFlush(Object obj, C0274u0 u0Var) {
        if (invokeHandler()) {
            invokeWrite0(obj, u0Var);
            invokeFlush0();
            return;
        }
        writeAndFlush(obj, u0Var);
    }

    public boolean isRemoved() {
        if (this.handlerState == 3) {
            return true;
        }
        return false;
    }

    public String name() {
        return this.name;
    }

    public P newFailedFuture(Throwable th) {
        return new c1(channel(), executor(), th);
    }

    public C0274u0 newPromise() {
        return new P0(channel(), executor());
    }

    public C0270s0 pipeline() {
        return this.pipeline;
    }

    public Y read() {
        F findContextOutbound = findContextOutbound(16384);
        C0911a aVar = (C0911a) findContextOutbound.executor();
        if (aVar.inEventLoop()) {
            findContextOutbound.invokeRead();
        } else {
            C c8 = findContextOutbound.invokeTasks;
            if (c8 == null) {
                c8 = new C(findContextOutbound);
                findContextOutbound.invokeTasks = c8;
            }
            aVar.execute(c8.invokeReadTask);
        }
        return this;
    }

    public final boolean setAddComplete() {
        int i;
        do {
            i = this.handlerState;
            if (i == 3) {
                return false;
            }
        } while (!HANDLER_STATE_UPDATER.compareAndSet(this, i, 2));
        return true;
    }

    public final void setAddPending() {
        HANDLER_STATE_UPDATER.compareAndSet(this, 0, 1);
    }

    public final void setRemoved() {
        this.handlerState = 3;
    }

    public String toHintString() {
        return e.A(new StringBuilder("'"), this.name, "' will handle the message from this point.");
    }

    public String toString() {
        return n0.simpleClassName((Class<?>) Y.class) + '(' + this.name + ", " + channel() + ')';
    }

    public C0274u0 voidPromise() {
        return ((C0260n) channel()).voidPromise();
    }

    public P write(Object obj) {
        return write(obj, newPromise());
    }

    public P writeAndFlush(Object obj, C0274u0 u0Var) {
        write(obj, true, u0Var);
        return u0Var;
    }

    public P close(C0274u0 u0Var) {
        if (isNotValidPromise(u0Var, false)) {
            return u0Var;
        }
        F findContextOutbound = findContextOutbound(4096);
        C0911a aVar = (C0911a) findContextOutbound.executor();
        if (aVar.inEventLoop()) {
            findContextOutbound.invokeClose(u0Var);
        } else {
            safeExecute(aVar, new C0264p(this, findContextOutbound, u0Var), u0Var, (Object) null, false);
        }
        return u0Var;
    }

    public P connect(SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        B.checkNotNull(socketAddress, "remoteAddress");
        if (isNotValidPromise(u0Var, false)) {
            return u0Var;
        }
        F findContextOutbound = findContextOutbound(1024);
        C0911a aVar = (C0911a) findContextOutbound.executor();
        if (aVar.inEventLoop()) {
            findContextOutbound.invokeConnect(socketAddress, socketAddress2, u0Var);
        } else {
            safeExecute(aVar, new C0279x(this, findContextOutbound, socketAddress, socketAddress2, u0Var), u0Var, (Object) null, false);
        }
        return u0Var;
    }

    public P write(Object obj, C0274u0 u0Var) {
        write(obj, false, u0Var);
        return u0Var;
    }

    public P writeAndFlush(Object obj) {
        return writeAndFlush(obj, newPromise());
    }

    private void write(Object obj, boolean z, C0274u0 u0Var) {
        B.checkNotNull(obj, "msg");
        try {
            if (isNotValidPromise(u0Var, true)) {
                I.release(obj);
                return;
            }
            F findContextOutbound = findContextOutbound(z ? 98304 : 32768);
            Object obj2 = this.pipeline.touch(obj, findContextOutbound);
            C0911a aVar = (C0911a) findContextOutbound.executor();
            if (!aVar.inEventLoop()) {
                E newInstance = E.newInstance(findContextOutbound, obj2, u0Var, z);
                if (!safeExecute(aVar, newInstance, u0Var, obj2, !z)) {
                    newInstance.cancel();
                }
            } else if (z) {
                findContextOutbound.invokeWriteAndFlush(obj2, u0Var);
            } else {
                findContextOutbound.invokeWrite(obj2, u0Var);
            }
        } catch (RuntimeException e) {
            I.release(obj);
            throw e;
        }
    }

    /* access modifiers changed from: private */
    public void invokeChannelActive() {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.channelActive(this);
                } else if (handler instanceof M) {
                    ((M) handler).channelActive(this);
                } else {
                    ((C0243e0) handler).channelActive(this);
                }
            } catch (Throwable th) {
                invokeExceptionCaught(th);
            }
        } else {
            fireChannelActive();
        }
    }

    /* access modifiers changed from: private */
    public void invokeChannelInactive() {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.channelInactive(this);
                } else if (handler instanceof M) {
                    ((M) handler).channelInactive(this);
                } else {
                    ((C0243e0) handler).channelInactive(this);
                }
            } catch (Throwable th) {
                invokeExceptionCaught(th);
            }
        } else {
            fireChannelInactive();
        }
    }

    /* access modifiers changed from: private */
    public void invokeChannelRegistered() {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.channelRegistered(this);
                } else if (handler instanceof M) {
                    ((M) handler).channelRegistered(this);
                } else {
                    ((C0243e0) handler).channelRegistered(this);
                }
            } catch (Throwable th) {
                invokeExceptionCaught(th);
            }
        } else {
            fireChannelRegistered();
        }
    }

    /* access modifiers changed from: private */
    public void invokeChannelUnregistered() {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.channelUnregistered(this);
                } else if (handler instanceof M) {
                    ((M) handler).channelUnregistered(this);
                } else {
                    ((C0243e0) handler).channelUnregistered(this);
                }
            } catch (Throwable th) {
                invokeExceptionCaught(th);
            }
        } else {
            fireChannelUnregistered();
        }
    }

    /* access modifiers changed from: private */
    public void invokeChannelRead(Object obj) {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.channelRead(this, obj);
                } else if (handler instanceof M) {
                    ((M) handler).channelRead(this, obj);
                } else {
                    ((C0243e0) handler).channelRead(this, obj);
                }
            } catch (Throwable th) {
                invokeExceptionCaught(th);
            }
        } else {
            fireChannelRead(obj);
        }
    }

    /* access modifiers changed from: private */
    public void invokeUserEventTriggered(Object obj) {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.userEventTriggered(this, obj);
                } else if (handler instanceof M) {
                    ((M) handler).userEventTriggered(this, obj);
                } else {
                    ((C0243e0) handler).userEventTriggered(this, obj);
                }
            } catch (Throwable th) {
                invokeExceptionCaught(th);
            }
        } else {
            fireUserEventTriggered(obj);
        }
    }

    /* access modifiers changed from: private */
    public void invokeChannelReadComplete() {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.channelReadComplete(this);
                } else if (handler instanceof M) {
                    ((M) handler).channelReadComplete(this);
                } else {
                    ((C0243e0) handler).channelReadComplete(this);
                }
            } catch (Throwable th) {
                invokeExceptionCaught(th);
            }
        } else {
            fireChannelReadComplete();
        }
    }

    /* access modifiers changed from: private */
    public void invokeChannelWritabilityChanged() {
        if (invokeHandler()) {
            try {
                W handler = handler();
                J0 j02 = this.pipeline.head;
                if (handler == j02) {
                    j02.channelWritabilityChanged(this);
                } else if (handler instanceof M) {
                    ((M) handler).channelWritabilityChanged(this);
                } else {
                    ((C0243e0) handler).channelWritabilityChanged(this);
                }
            } catch (Throwable th) {
                invokeExceptionCaught(th);
            }
        } else {
            fireChannelWritabilityChanged();
        }
    }

    /* access modifiers changed from: private */
    public void invokeExceptionCaught(Throwable th) {
        if (invokeHandler()) {
            try {
                handler().exceptionCaught(this, th);
            } catch (Throwable th2) {
                C1082c cVar = logger;
                if (cVar.isDebugEnabled()) {
                    cVar.debug("An exception {}was thrown by a user handler's exceptionCaught() method while handling the following exception:", x0.stackTraceToString(th2), th);
                } else if (cVar.isWarnEnabled()) {
                    cVar.warn("An exception '{}' [enable DEBUG level for full stacktrace] was thrown by a user handler's exceptionCaught() method while handling the following exception:", th2, th);
                }
            }
        } else {
            fireExceptionCaught(th);
        }
    }
}
