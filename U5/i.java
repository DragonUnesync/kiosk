package U5;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import S5.C0206y;
import S5.D0;
import T5.C0260n;
import T5.C0274u0;
import T5.K;
import T5.N;
import T5.Z0;
import e6.I;
import f6.C0909B;
import h6.C1082c;
import h6.d;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

public abstract class i extends C0260n {
    private static final C1082c logger = d.getInstance((Class<?>) i.class);
    private final SelectableChannel ch;
    private final Runnable clearReadPendingRunnable = new d(this);
    /* access modifiers changed from: private */
    public C0274u0 connectPromise;
    /* access modifiers changed from: private */
    public C0909B connectTimeoutFuture;
    protected final int readInterestOp;
    boolean readPending;
    /* access modifiers changed from: private */
    public SocketAddress requestedRemoteAddress;
    volatile SelectionKey selectionKey;

    public i(K k8, SelectableChannel selectableChannel, int i) {
        super(k8);
        this.ch = selectableChannel;
        this.readInterestOp = i;
        try {
            selectableChannel.configureBlocking(false);
        } catch (IOException e) {
            try {
                selectableChannel.close();
            } catch (IOException e8) {
                logger.warn("Failed to close a partially initialized socket.", (Throwable) e8);
            }
            throw new N("Failed to enter non-blocking mode.", e);
        }
    }

    /* access modifiers changed from: private */
    public void clearReadPending0() {
        this.readPending = false;
        ((g) unsafe()).removeReadOp();
    }

    public final void clearReadPending() {
        if (isRegistered()) {
            p eventLoop = eventLoop();
            if (eventLoop.inEventLoop()) {
                clearReadPending0();
            } else {
                eventLoop.execute(this.clearReadPendingRunnable);
            }
        } else {
            this.readPending = false;
        }
    }

    public void doBeginRead() {
        SelectionKey selectionKey2 = this.selectionKey;
        if (selectionKey2.isValid()) {
            this.readPending = true;
            int interestOps = selectionKey2.interestOps();
            int i = this.readInterestOp;
            if ((interestOps & i) == 0) {
                selectionKey2.interestOps(interestOps | i);
            }
        }
    }

    public void doClose() {
        C0274u0 u0Var = this.connectPromise;
        if (u0Var != null) {
            u0Var.tryFailure(new ClosedChannelException());
            this.connectPromise = null;
        }
        C0909B b8 = this.connectTimeoutFuture;
        if (b8 != null) {
            b8.cancel(false);
            this.connectTimeoutFuture = null;
        }
    }

    public abstract boolean doConnect(SocketAddress socketAddress, SocketAddress socketAddress2);

    public void doDeregister() {
        eventLoop().cancel(selectionKey());
    }

    public abstract void doFinishConnect();

    public void doRegister() {
        boolean z = false;
        while (true) {
            try {
                this.selectionKey = javaChannel().register(eventLoop().unwrappedSelector(), 0, this);
                return;
            } catch (CancelledKeyException e) {
                if (!z) {
                    eventLoop().selectNow();
                    z = true;
                } else {
                    throw e;
                }
            }
        }
    }

    public boolean isCompatible(Z0 z02) {
        return z02 instanceof p;
    }

    public boolean isOpen() {
        return this.ch.isOpen();
    }

    public SelectableChannel javaChannel() {
        return this.ch;
    }

    public final C0185n newDirectBuffer(C0185n nVar) {
        int readableBytes = nVar.readableBytes();
        if (readableBytes == 0) {
            I.safeRelease(nVar);
            return D0.EMPTY_BUFFER;
        }
        C0187o alloc = alloc();
        if (alloc.isDirectBufferPooled()) {
            C0185n directBuffer = ((C0163c) alloc).directBuffer(readableBytes);
            directBuffer.writeBytes(nVar, nVar.readerIndex(), readableBytes);
            I.safeRelease(nVar);
            return directBuffer;
        }
        C0185n threadLocalDirectBuffer = C0206y.threadLocalDirectBuffer();
        if (threadLocalDirectBuffer == null) {
            return nVar;
        }
        threadLocalDirectBuffer.writeBytes(nVar, nVar.readerIndex(), readableBytes);
        I.safeRelease(nVar);
        return threadLocalDirectBuffer;
    }

    public SelectionKey selectionKey() {
        return this.selectionKey;
    }

    public p eventLoop() {
        return (p) super.eventLoop();
    }

    public h unsafe() {
        return (h) super.unsafe();
    }
}
