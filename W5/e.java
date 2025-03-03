package W5;

import S5.C0185n;
import T5.B0;
import T5.C0250i;
import T5.C0263o0;
import T5.C0274u0;
import T5.K;
import T5.N;
import T5.P;
import T5.R0;
import U5.c;
import U5.p;
import V5.f;
import V5.g;
import V5.h;
import g6.Y;
import g6.m0;
import h6.C1082c;
import h6.d;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;

public final class e extends c implements g {
    private static final SelectorProvider DEFAULT_SELECTOR_PROVIDER = SelectorProvider.provider();
    private static final Method OPEN_SOCKET_CHANNEL_WITH_FAMILY = h.findOpenMethod("openSocketChannel");
    private static final C1082c logger = d.getInstance((Class<?>) e.class);
    private final h config;

    public e() {
        this(DEFAULT_SELECTOR_PROVIDER);
    }

    private void adjustMaxBytesPerGatheringWrite(int i, int i8, int i9) {
        int i10;
        if (i == i8) {
            int i11 = i << 1;
            if (i11 > i9) {
                ((c) this.config).setMaxBytesPerGatheringWrite(i11);
            }
        } else if (i > 4096 && i8 < (i10 = i >>> 1)) {
            ((c) this.config).setMaxBytesPerGatheringWrite(i10);
        }
    }

    private void doBind0(SocketAddress socketAddress) {
        if (Y.javaVersion() >= 7) {
            m0.bind(javaChannel(), socketAddress);
        } else {
            m0.bind(javaChannel().socket(), socketAddress);
        }
    }

    private static SocketChannel newChannel(SelectorProvider selectorProvider, f fVar) {
        try {
            SocketChannel socketChannel = (SocketChannel) h.newChannel(OPEN_SOCKET_CHANNEL_WITH_FAMILY, selectorProvider, fVar);
            if (socketChannel == null) {
                return selectorProvider.openSocketChannel();
            }
            return socketChannel;
        } catch (IOException e) {
            throw new N("Failed to open a socket.", e);
        }
    }

    /* access modifiers changed from: private */
    public void shutdownInput0(C0274u0 u0Var) {
        try {
            shutdownInput0();
            u0Var.setSuccess();
        } catch (Throwable th) {
            u0Var.setFailure(th);
        }
    }

    public void doClose() {
        super.doClose();
        javaChannel().close();
    }

    public boolean doConnect(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            doBind0(socketAddress2);
        }
        try {
            boolean connect = m0.connect(javaChannel(), socketAddress);
            if (!connect) {
                selectionKey().interestOps(8);
            }
            return connect;
        } catch (Throwable th) {
            doClose();
            throw th;
        }
    }

    public void doDisconnect() {
        doClose();
    }

    public void doFinishConnect() {
        if (!javaChannel().finishConnect()) {
            throw new Error();
        }
    }

    public int doReadBytes(C0185n nVar) {
        R0 r02 = (R0) ((C0250i) unsafe()).recvBufAllocHandle();
        r02.attemptedBytesRead(nVar.writableBytes());
        return nVar.writeBytes(javaChannel(), r02.attemptedBytesRead());
    }

    public final void doShutdownOutput() {
        if (Y.javaVersion() >= 7) {
            javaChannel().shutdownOutput();
        } else {
            javaChannel().socket().shutdownOutput();
        }
    }

    public void doWrite(C0263o0 o0Var) {
        SocketChannel javaChannel = javaChannel();
        int writeSpinCount = ((B0) config()).getWriteSpinCount();
        while (!o0Var.isEmpty()) {
            int maxBytesPerGatheringWrite = ((c) this.config).getMaxBytesPerGatheringWrite();
            ByteBuffer[] nioBuffers = o0Var.nioBuffers(1024, (long) maxBytesPerGatheringWrite);
            int nioBufferCount = o0Var.nioBufferCount();
            boolean z = false;
            if (nioBufferCount != 0) {
                if (nioBufferCount != 1) {
                    long nioBufferSize = o0Var.nioBufferSize();
                    long write = javaChannel.write(nioBuffers, 0, nioBufferCount);
                    if (write <= 0) {
                        incompleteWrite(true);
                        return;
                    } else {
                        adjustMaxBytesPerGatheringWrite((int) nioBufferSize, (int) write, maxBytesPerGatheringWrite);
                        o0Var.removeBytes(write);
                    }
                } else {
                    ByteBuffer byteBuffer = nioBuffers[0];
                    int remaining = byteBuffer.remaining();
                    int write2 = javaChannel.write(byteBuffer);
                    if (write2 <= 0) {
                        incompleteWrite(true);
                        return;
                    } else {
                        adjustMaxBytesPerGatheringWrite(remaining, write2, maxBytesPerGatheringWrite);
                        o0Var.removeBytes((long) write2);
                    }
                }
                writeSpinCount--;
                continue;
            } else {
                writeSpinCount -= doWrite0(o0Var);
                continue;
            }
            if (writeSpinCount <= 0) {
                if (writeSpinCount < 0) {
                    z = true;
                }
                incompleteWrite(z);
                return;
            }
        }
        clearOpWrite();
    }

    public int doWriteBytes(C0185n nVar) {
        return nVar.readBytes(javaChannel(), nVar.readableBytes());
    }

    public boolean isActive() {
        SocketChannel javaChannel = javaChannel();
        if (!javaChannel.isOpen() || !javaChannel.isConnected()) {
            return false;
        }
        return true;
    }

    public boolean isInputShutdown() {
        if (javaChannel().socket().isInputShutdown() || !isActive()) {
            return true;
        }
        return false;
    }

    public boolean isInputShutdown0() {
        return isInputShutdown();
    }

    public SocketAddress localAddress0() {
        return javaChannel().socket().getLocalSocketAddress();
    }

    public SocketAddress remoteAddress0() {
        return javaChannel().socket().getRemoteSocketAddress();
    }

    public P shutdownInput() {
        return shutdownInput(newPromise());
    }

    public P shutdownOutput() {
        return shutdownOutput(newPromise());
    }

    public e(SelectorProvider selectorProvider) {
        this(selectorProvider, (f) null);
    }

    public h config() {
        return this.config;
    }

    public SocketChannel javaChannel() {
        return (SocketChannel) super.javaChannel();
    }

    public InetSocketAddress localAddress() {
        return (InetSocketAddress) super.localAddress();
    }

    public U5.g newUnsafe() {
        return new d(this, (a) null);
    }

    public InetSocketAddress remoteAddress() {
        return (InetSocketAddress) super.remoteAddress();
    }

    public P shutdownInput(C0274u0 u0Var) {
        p eventLoop = eventLoop();
        if (eventLoop.inEventLoop()) {
            shutdownInput0(u0Var);
        } else {
            eventLoop.execute(new b(this, u0Var));
        }
        return u0Var;
    }

    public P shutdownOutput(C0274u0 u0Var) {
        p eventLoop = eventLoop();
        if (eventLoop.inEventLoop()) {
            ((C0250i) unsafe()).shutdownOutput(u0Var);
        } else {
            eventLoop.execute(new a(this, u0Var));
        }
        return u0Var;
    }

    public e(SelectorProvider selectorProvider, f fVar) {
        this(newChannel(selectorProvider, fVar));
    }

    public e(SocketChannel socketChannel) {
        this((K) null, socketChannel);
    }

    private void shutdownInput0() {
        if (Y.javaVersion() >= 7) {
            javaChannel().shutdownInput();
        } else {
            javaChannel().socket().shutdownInput();
        }
    }

    public e(K k8, SocketChannel socketChannel) {
        super(k8, socketChannel);
        this.config = new c(this, this, socketChannel.socket(), (a) null);
    }
}
