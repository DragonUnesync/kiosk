package b6;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import S5.C0206y;
import S5.D0;
import T5.B0;
import T5.C0250i;
import T5.C0251i0;
import T5.C0263o0;
import T5.C0265p0;
import T5.C0274u0;
import T5.K;
import T5.N;
import T5.P;
import T5.Y;
import X5.C0353d;
import X5.C0364o;
import X5.Q;
import e6.I;
import f6.C0910C;
import f6.C0911a;
import f6.C0916f;
import f6.C0929t;
import f6.H;
import f6.L;
import f6.S;
import f6.Z;
import g6.B;
import g6.x0;
import h6.C1082c;
import h6.d;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSession;

public final class C1 extends C0353d implements C0265p0 {
    private static final Pattern IGNORABLE_CLASS_IN_STACK = Pattern.compile("^.*(?:Socket|Datagram|Sctp|Udt)Channel.*$");
    private static final Pattern IGNORABLE_ERROR_MESSAGE = Pattern.compile("^.*(?:connection.*(?:reset|closed|abort|broken)|broken.*pipe).*$", 2);
    /* access modifiers changed from: private */
    public static final C1082c logger = d.getInstance((Class<?>) C1.class);
    private volatile long closeNotifyFlushTimeoutMillis;
    /* access modifiers changed from: private */
    public volatile long closeNotifyReadTimeoutMillis;
    /* access modifiers changed from: private */
    public volatile Y ctx;
    private final Executor delegatedTaskExecutor;
    /* access modifiers changed from: private */
    public final SSLEngine engine;
    /* access modifiers changed from: private */
    public final w1 engineType;
    private L handshakePromise;
    private volatile long handshakeTimeoutMillis;
    private final boolean jdkCompatibilityMode;
    private int packetLength;
    private x1 pendingUnencryptedWrites;
    /* access modifiers changed from: private */
    public final ByteBuffer[] singleBuffer;
    /* access modifiers changed from: private */
    public final s1 sslClosePromise;
    private final B1 sslTaskRunner;
    private final B1 sslTaskRunnerForUnwrap;
    private final boolean startTls;
    private short state;
    volatile int wrapDataSize;

    public C1(SSLEngine sSLEngine, boolean z) {
        this(sSLEngine, z, H.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static void addCloseListener(P p3, C0274u0 u0Var) {
        S.cascade(false, p3, u0Var);
    }

    private C0185n allocate(Y y8, int i) {
        C0187o alloc = y8.alloc();
        if (this.engineType.wantsDirectBuffer) {
            return ((C0163c) alloc).directBuffer(i);
        }
        return ((C0163c) alloc).buffer(i);
    }

    private C0185n allocateOutNetBuf(Y y8, int i, int i8) {
        return this.engineType.allocateWrapBuffer(this, y8.alloc(), i, i8);
    }

    private void applyHandshakeTimeout() {
        L l8 = this.handshakePromise;
        long j7 = this.handshakeTimeoutMillis;
        if (j7 > 0 && !l8.isDone()) {
            l8.addListener(new p1(this, ((C0916f) this.ctx.executor()).schedule((Runnable) new o1(this, l8, j7), j7, TimeUnit.MILLISECONDS)));
        }
    }

    /* access modifiers changed from: private */
    public static boolean attemptCopyToCumulation(C0185n nVar, C0185n nVar2, int i) {
        int readableBytes = nVar2.readableBytes();
        int capacity = nVar.capacity();
        if (i - nVar.readableBytes() < readableBytes || ((!nVar.isWritable(readableBytes) || capacity < i) && (capacity >= i || !C0206y.ensureWritableSuccess(nVar.ensureWritable(readableBytes, false))))) {
            return false;
        }
        nVar.writeBytes(nVar2);
        nVar2.release();
        return true;
    }

    /* access modifiers changed from: private */
    public void channelReadComplete0(Y y8) {
        discardSomeReadBytes();
        flushIfNeeded(y8);
        readIfNeeded(y8);
        clearState(256);
        y8.fireChannelReadComplete();
    }

    /* access modifiers changed from: private */
    public void clearState(int i) {
        this.state = (short) ((~i) & this.state);
    }

    private void closeOutboundAndChannel(Y y8, C0274u0 u0Var, boolean z) {
        boolean isStateSet;
        setState(32);
        this.engine.closeOutbound();
        if (y8.channel().isActive()) {
            C0274u0 newPromise = y8.newPromise();
            try {
                flush(y8, newPromise);
                if (isStateSet) {
                    this.sslClosePromise.addListener((C0910C) new n1(this, u0Var));
                }
            } finally {
                if (!isStateSet(64)) {
                    setState(64);
                    safeClose(y8, newPromise, (C0274u0) S.cascade(false, y8.newPromise(), u0Var));
                } else {
                    this.sslClosePromise.addListener((C0910C) new n1(this, u0Var));
                }
            }
        } else if (z) {
            y8.disconnect(u0Var);
        } else {
            y8.close(u0Var);
        }
    }

    private void decodeJdkCompatible(Y y8, C0185n nVar) {
        int i = this.packetLength;
        if (i <= 0) {
            int readableBytes = nVar.readableBytes();
            if (readableBytes >= 5) {
                int encryptedPacketLength = H1.getEncryptedPacketLength(nVar, nVar.readerIndex());
                if (encryptedPacketLength == -2) {
                    E e = new E("not an SSL/TLS record: " + C0206y.hexDump(nVar));
                    nVar.skipBytes(nVar.readableBytes());
                    setHandshakeFailure(y8, e);
                    throw e;
                } else if (encryptedPacketLength > readableBytes) {
                    this.packetLength = encryptedPacketLength;
                    return;
                } else {
                    i = encryptedPacketLength;
                }
            } else {
                return;
            }
        } else if (nVar.readableBytes() < i) {
            return;
        }
        this.packetLength = 0;
        try {
            unwrap(y8, nVar, i);
        } catch (Throwable th) {
            handleUnwrapThrowable(y8, th);
        }
    }

    private void decodeNonJdkCompatible(Y y8, C0185n nVar) {
        try {
            unwrap(y8, nVar, nVar.readableBytes());
        } catch (Throwable th) {
            handleUnwrapThrowable(y8, th);
        }
    }

    private void executeChannelRead(Y y8, C0185n nVar) {
        try {
            y8.executor().execute(new m1(this, y8, nVar));
        } catch (RejectedExecutionException e) {
            nVar.release();
            throw e;
        }
    }

    private void executeDelegatedTask(boolean z) {
        executeDelegatedTask(getTaskRunner(z));
    }

    private void executeNotifyClosePromise(Y y8) {
        try {
            y8.executor().execute(new l1(this));
        } catch (RejectedExecutionException e) {
            notifyClosePromise(e);
        }
    }

    private void flushIfNeeded(Y y8) {
        if (isStateSet(16)) {
            forceFlush(y8);
        }
    }

    /* access modifiers changed from: private */
    public void forceFlush(Y y8) {
        clearState(16);
        y8.flush();
    }

    /* access modifiers changed from: private */
    public B1 getTaskRunner(boolean z) {
        if (z) {
            return this.sslTaskRunnerForUnwrap;
        }
        return this.sslTaskRunner;
    }

    /* access modifiers changed from: private */
    public void handleUnwrapThrowable(Y y8, Throwable th) {
        try {
            if (this.handshakePromise.tryFailure(th)) {
                y8.fireUserEventTriggered(new D1(th));
            }
            if (this.pendingUnencryptedWrites != null) {
                wrapAndFlush(y8);
            }
            setHandshakeFailure(y8, th, true, false, true);
        } catch (SSLException e) {
            logger.debug("SSLException during trying to call SSLEngine.wrap(...) because of an previous SSLException, ignoring...", (Throwable) e);
            setHandshakeFailure(y8, th, true, false, true);
        } catch (Throwable th2) {
            setHandshakeFailure(y8, th, true, false, true);
            throw th2;
        }
        g6.Y.throwException(th);
    }

    private void handshake(boolean z) {
        if (this.engine.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING && !this.handshakePromise.isDone()) {
            Y y8 = this.ctx;
            try {
                this.engine.beginHandshake();
                wrapNonAppData(y8, false);
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    forceFlush(y8);
                }
                throw th;
            }
            forceFlush(y8);
        }
    }

    private boolean ignoreException(Throwable th) {
        Class<C1> cls = C1.class;
        if (!(th instanceof SSLException) && (th instanceof IOException) && this.sslClosePromise.isDone()) {
            String message = th.getMessage();
            if (message != null && IGNORABLE_ERROR_MESSAGE.matcher(message).matches()) {
                return true;
            }
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                if (!className.startsWith("io.netty.") && "read".equals(methodName)) {
                    if (IGNORABLE_CLASS_IN_STACK.matcher(className).matches()) {
                        return true;
                    }
                    try {
                        Class<?> loadClass = g6.Y.getClassLoader(cls).loadClass(className);
                        if (!SocketChannel.class.isAssignableFrom(loadClass)) {
                            if (!DatagramChannel.class.isAssignableFrom(loadClass)) {
                                if (g6.Y.javaVersion() >= 7 && "com.sun.nio.sctp.SctpChannel".equals(loadClass.getSuperclass().getName())) {
                                    return true;
                                }
                            }
                        }
                        return true;
                    } catch (Throwable th2) {
                        C1082c cVar = logger;
                        if (cVar.isDebugEnabled()) {
                            cVar.debug("Unexpected exception while loading class {} classname {}", cls, className, th2);
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean inEventLoop(Executor executor) {
        if (!(executor instanceof C0929t) || !((C0911a) ((C0929t) executor)).inEventLoop()) {
            return false;
        }
        return true;
    }

    private boolean isStateSet(int i) {
        if ((this.state & i) == i) {
            return true;
        }
        return false;
    }

    private static IllegalStateException newPendingWritesNullException() {
        return new IllegalStateException("pendingUnencryptedWrites is null, handlerRemoved0 called?");
    }

    /* access modifiers changed from: private */
    public void notifyClosePromise(Throwable th) {
        if (th == null) {
            if (this.sslClosePromise.trySuccess(this.ctx.channel())) {
                this.ctx.fireUserEventTriggered(X0.SUCCESS);
            }
        } else if (this.sslClosePromise.tryFailure(th)) {
            this.ctx.fireUserEventTriggered(new X0(th));
        }
    }

    private void readIfNeeded(Y y8) {
        if (((B0) y8.channel().config()).isAutoRead()) {
            return;
        }
        if (!isStateSet(256) || !this.handshakePromise.isDone()) {
            y8.read();
        }
    }

    /* access modifiers changed from: private */
    public void releaseAndFailAll(Y y8, Throwable th) {
        x1 x1Var = this.pendingUnencryptedWrites;
        if (x1Var != null) {
            x1Var.releaseAndFailAll(y8, th);
        }
    }

    private boolean runDelegatedTasks(boolean z) {
        Executor executor = this.delegatedTaskExecutor;
        if (executor == H.INSTANCE || inEventLoop(executor)) {
            while (true) {
                Runnable delegatedTask = this.engine.getDelegatedTask();
                if (delegatedTask == null) {
                    return true;
                }
                setState(128);
                if (delegatedTask instanceof C0549f) {
                    try {
                        r1 r1Var = new r1(this, z);
                        ((J0) ((C0549f) delegatedTask)).run(r1Var);
                        boolean resumeLater = r1Var.resumeLater();
                        if (resumeLater) {
                            if (!resumeLater) {
                                clearState(128);
                            }
                            return false;
                        } else if (!resumeLater) {
                        }
                    } finally {
                        clearState(128);
                    }
                } else {
                    try {
                        delegatedTask.run();
                    } finally {
                        clearState(128);
                    }
                }
            }
        } else {
            executeDelegatedTask(z);
            return false;
        }
    }

    private void safeClose(Y y8, P p3, C0274u0 u0Var) {
        if (!y8.channel().isActive()) {
            y8.close(u0Var);
            return;
        }
        Z z = null;
        if (!p3.isDone()) {
            long j7 = this.closeNotifyFlushTimeoutMillis;
            if (j7 > 0) {
                z = ((C0916f) y8.executor()).schedule((Runnable) new q1(this, p3, y8, u0Var), j7, TimeUnit.MILLISECONDS);
            }
        }
        p3.addListener(new C0557h1(this, z, y8, u0Var));
    }

    /* access modifiers changed from: private */
    public void setHandshakeFailure(Y y8, Throwable th) {
        setHandshakeFailure(y8, th, true, true, false);
    }

    /* access modifiers changed from: private */
    public void setHandshakeFailureTransportFailure(Y y8, Throwable th) {
        try {
            SSLException sSLException = new SSLException("failure when writing TLS control frames", th);
            releaseAndFailAll(y8, sSLException);
            if (this.handshakePromise.tryFailure(sSLException)) {
                y8.fireUserEventTriggered(new D1(sSLException));
            }
        } finally {
            y8.close();
        }
    }

    /* access modifiers changed from: private */
    public boolean setHandshakeSuccess() {
        boolean z;
        if (this.handshakePromise.isDone() || !this.handshakePromise.trySuccess(this.ctx.channel())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1082c cVar = logger;
            if (cVar.isDebugEnabled()) {
                SSLSession session = this.engine.getSession();
                cVar.debug("{} HANDSHAKEN: protocol:{} cipher suite:{}", this.ctx.channel(), session.getProtocol(), session.getCipherSuite());
            }
            this.ctx.fireUserEventTriggered(D1.SUCCESS);
        }
        if (isStateSet(4)) {
            clearState(4);
            if (!((B0) this.ctx.channel().config()).isAutoRead()) {
                this.ctx.read();
            }
        }
        return z;
    }

    private boolean setHandshakeSuccessUnwrapMarkReentry() {
        boolean isStateSet = isStateSet(512);
        if (!isStateSet) {
            setState(512);
        }
        try {
            return setHandshakeSuccess();
        } finally {
            if (!isStateSet) {
                clearState(512);
            }
        }
    }

    private void setOpensslEngineSocketFd(K k8) {
    }

    private void setState(int i) {
        this.state = (short) (i | this.state);
    }

    private void startHandshakeProcessing(boolean z) {
        if (!isStateSet(8)) {
            setState(8);
            if (this.engine.getUseClientMode()) {
                handshake(z);
            }
            applyHandshakeTimeout();
        } else if (isStateSet(16)) {
            forceFlush(this.ctx);
        }
    }

    /* access modifiers changed from: private */
    public static ByteBuffer toByteBuffer(C0185n nVar, int i, int i8) {
        if (nVar.nioBufferCount() == 1) {
            return nVar.internalNioBuffer(i, i8);
        }
        return nVar.nioBuffer(i, i8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (setHandshakeSuccess() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d2, code lost:
        if (r13 != javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d4, code lost:
        readIfNeeded(r17);
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x00cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a5 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00d0 A[EDGE_INSN: B:97:0x00d0->B:70:0x00d0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int unwrap(T5.Y r17, S5.C0185n r18, int r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            r3 = r19
            S5.n r4 = r1.allocate(r2, r3)
            r6 = r3
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0010:
            b6.w1 r11 = r1.engineType     // Catch:{ all -> 0x0034 }
            javax.net.ssl.SSLEngineResult r11 = r11.unwrap(r1, r0, r6, r4)     // Catch:{ all -> 0x0034 }
            javax.net.ssl.SSLEngineResult$Status r12 = r11.getStatus()     // Catch:{ all -> 0x0034 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = r11.getHandshakeStatus()     // Catch:{ all -> 0x0034 }
            int r14 = r11.bytesProduced()     // Catch:{ all -> 0x0034 }
            int r11 = r11.bytesConsumed()     // Catch:{ all -> 0x0034 }
            r0.skipBytes(r11)     // Catch:{ all -> 0x0034 }
            int r6 = r6 - r11
            javax.net.ssl.SSLEngineResult$HandshakeStatus r15 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x0034 }
            r5 = 1
            if (r13 == r15) goto L_0x0037
            javax.net.ssl.SSLEngineResult$HandshakeStatus r10 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x0034 }
            if (r13 != r10) goto L_0x0051
            goto L_0x0037
        L_0x0034:
            r0 = move-exception
            goto L_0x0103
        L_0x0037:
            boolean r10 = r4.isReadable()     // Catch:{ all -> 0x0034 }
            if (r10 == 0) goto L_0x0044
            boolean r10 = r16.setHandshakeSuccessUnwrapMarkReentry()     // Catch:{ all -> 0x0034 }
            if (r10 == 0) goto L_0x004a
            goto L_0x004f
        L_0x0044:
            boolean r10 = r16.setHandshakeSuccess()     // Catch:{ all -> 0x0034 }
            if (r10 != 0) goto L_0x004f
        L_0x004a:
            if (r13 != r15) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r10 = 0
            goto L_0x0050
        L_0x004f:
            r10 = 1
        L_0x0050:
            r7 = r7 | r10
        L_0x0051:
            boolean r10 = r4.isReadable()     // Catch:{ all -> 0x0034 }
            if (r10 == 0) goto L_0x0071
            r10 = 256(0x100, float:3.59E-43)
            r1.setState(r10)     // Catch:{ all -> 0x0034 }
            r10 = 512(0x200, float:7.175E-43)
            boolean r10 = r1.isStateSet(r10)     // Catch:{ all -> 0x0034 }
            if (r10 == 0) goto L_0x006d
            r1.executeChannelRead(r2, r4)     // Catch:{ all -> 0x0069 }
            r9 = 1
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            r9 = 1
            goto L_0x0103
        L_0x006d:
            r2.fireChannelRead(r4)     // Catch:{ all -> 0x0034 }
        L_0x0070:
            r4 = 0
        L_0x0071:
            javax.net.ssl.SSLEngineResult$Status r10 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x0034 }
            if (r12 != r10) goto L_0x0077
            r8 = 1
            goto L_0x0099
        L_0x0077:
            javax.net.ssl.SSLEngineResult$Status r10 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x0034 }
            if (r12 != r10) goto L_0x0099
            if (r4 == 0) goto L_0x0080
            r4.release()     // Catch:{ all -> 0x0034 }
        L_0x0080:
            javax.net.ssl.SSLEngine r10 = r1.engine     // Catch:{ all -> 0x0034 }
            javax.net.ssl.SSLSession r10 = r10.getSession()     // Catch:{ all -> 0x0034 }
            int r10 = r10.getApplicationBufferSize()     // Catch:{ all -> 0x0034 }
            b6.w1 r11 = r1.engineType     // Catch:{ all -> 0x0034 }
            if (r10 >= r14) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            int r10 = r10 - r14
        L_0x0090:
            int r10 = r11.calculatePendingData(r1, r10)     // Catch:{ all -> 0x0034 }
            S5.n r4 = r1.allocate(r2, r10)     // Catch:{ all -> 0x0034 }
            goto L_0x00c9
        L_0x0099:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r10 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ all -> 0x0034 }
            if (r13 != r10) goto L_0x00a5
            boolean r15 = r1.runDelegatedTasks(r5)     // Catch:{ all -> 0x0034 }
            if (r15 != 0) goto L_0x00b2
            r7 = 0
            goto L_0x00d7
        L_0x00a5:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r15 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x0034 }
            if (r13 != r15) goto L_0x00b2
            boolean r15 = r1.wrapNonAppData(r2, r5)     // Catch:{ all -> 0x0034 }
            if (r15 == 0) goto L_0x00b2
            if (r6 != 0) goto L_0x00b2
            goto L_0x00d7
        L_0x00b2:
            javax.net.ssl.SSLEngineResult$Status r15 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ all -> 0x0034 }
            if (r12 == r15) goto L_0x00d0
            if (r13 == r10) goto L_0x00c3
            if (r11 != 0) goto L_0x00bc
            if (r14 == 0) goto L_0x00d0
        L_0x00bc:
            if (r6 != 0) goto L_0x00c3
            javax.net.ssl.SSLEngineResult$HandshakeStatus r10 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x0034 }
            if (r13 != r10) goto L_0x00c3
            goto L_0x00d0
        L_0x00c3:
            if (r4 != 0) goto L_0x00c9
            S5.n r4 = r1.allocate(r2, r6)     // Catch:{ all -> 0x0034 }
        L_0x00c9:
            boolean r10 = r17.isRemoved()     // Catch:{ all -> 0x0034 }
            if (r10 == 0) goto L_0x0010
            goto L_0x00d7
        L_0x00d0:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ all -> 0x0034 }
            if (r13 != r0) goto L_0x00d7
            r16.readIfNeeded(r17)     // Catch:{ all -> 0x0034 }
        L_0x00d7:
            r0 = 2
            boolean r10 = r1.isStateSet(r0)     // Catch:{ all -> 0x0034 }
            if (r10 == 0) goto L_0x00ea
            f6.L r10 = r1.handshakePromise     // Catch:{ all -> 0x0034 }
            boolean r10 = r10.isDone()     // Catch:{ all -> 0x0034 }
            if (r10 == 0) goto L_0x00ea
            r1.clearState(r0)     // Catch:{ all -> 0x0034 }
            r7 = 1
        L_0x00ea:
            if (r7 == 0) goto L_0x00ef
            r1.wrap(r2, r5)     // Catch:{ all -> 0x0034 }
        L_0x00ef:
            if (r4 == 0) goto L_0x00f4
            r4.release()
        L_0x00f4:
            if (r8 == 0) goto L_0x0100
            if (r9 == 0) goto L_0x00fc
            r16.executeNotifyClosePromise(r17)
            goto L_0x0100
        L_0x00fc:
            r2 = 0
            r1.notifyClosePromise(r2)
        L_0x0100:
            int r0 = r3 - r6
            return r0
        L_0x0103:
            if (r4 == 0) goto L_0x0108
            r4.release()
        L_0x0108:
            if (r8 == 0) goto L_0x0114
            if (r9 == 0) goto L_0x0110
            r16.executeNotifyClosePromise(r17)
            goto L_0x0114
        L_0x0110:
            r2 = 0
            r1.notifyClosePromise(r2)
        L_0x0114:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C1.unwrap(T5.Y, S5.n, int):int");
    }

    /* access modifiers changed from: private */
    public int unwrapNonAppData(Y y8) {
        return unwrap(y8, D0.EMPTY_BUFFER, 0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e0, code lost:
        if (r5 != 5) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e2, code lost:
        readIfNeeded(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e5, code lost:
        if (r4 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e7, code lost:
        r4.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ea, code lost:
        if (r12 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ec, code lost:
        setState(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010a, code lost:
        throw new java.lang.IllegalStateException("Unknown handshake status: " + r7.getHandshakeStatus());
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void wrap(T5.Y r11, boolean r12) {
        /*
            r10 = this;
            S5.o r0 = r11.alloc()
            r1 = 16
            r2 = 0
            int r3 = r10.wrapDataSize     // Catch:{ all -> 0x0081 }
            r4 = r2
        L_0x000a:
            boolean r5 = r11.isRemoved()     // Catch:{ all -> 0x001d }
            if (r5 != 0) goto L_0x012d
            T5.u0 r5 = r11.newPromise()     // Catch:{ all -> 0x001d }
            if (r3 <= 0) goto L_0x0021
            b6.x1 r6 = r10.pendingUnencryptedWrites     // Catch:{ all -> 0x001d }
            S5.n r6 = r6.remove(r0, r3, r5)     // Catch:{ all -> 0x001d }
            goto L_0x0027
        L_0x001d:
            r11 = move-exception
            r2 = r4
            goto L_0x0138
        L_0x0021:
            b6.x1 r6 = r10.pendingUnencryptedWrites     // Catch:{ all -> 0x001d }
            S5.n r6 = r6.removeFirst(r5)     // Catch:{ all -> 0x001d }
        L_0x0027:
            if (r6 != 0) goto L_0x002b
            goto L_0x012d
        L_0x002b:
            int r7 = r6.readableBytes()     // Catch:{ all -> 0x001d }
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r7 <= r8) goto L_0x0051
            int r7 = r6.readableBytes()     // Catch:{ all -> 0x001d }
            int r8 = r7 / 16384
            int r9 = r7 % 16384
            if (r9 == 0) goto L_0x003f
            int r8 = r8 + 1
        L_0x003f:
            if (r4 != 0) goto L_0x004a
            int r9 = r6.nioBufferCount()     // Catch:{ all -> 0x001d }
            int r9 = r9 + r8
            S5.n r4 = r10.allocateOutNetBuf(r11, r7, r9)     // Catch:{ all -> 0x001d }
        L_0x004a:
            javax.net.ssl.SSLEngine r7 = r10.engine     // Catch:{ all -> 0x001d }
            javax.net.ssl.SSLEngineResult r7 = r10.wrapMultiple(r0, r7, r6, r4)     // Catch:{ all -> 0x001d }
            goto L_0x0065
        L_0x0051:
            if (r4 != 0) goto L_0x005f
            int r7 = r6.readableBytes()     // Catch:{ all -> 0x001d }
            int r8 = r6.nioBufferCount()     // Catch:{ all -> 0x001d }
            S5.n r4 = r10.allocateOutNetBuf(r11, r7, r8)     // Catch:{ all -> 0x001d }
        L_0x005f:
            javax.net.ssl.SSLEngine r7 = r10.engine     // Catch:{ all -> 0x001d }
            javax.net.ssl.SSLEngineResult r7 = r10.wrap(r0, r7, r6, r4)     // Catch:{ all -> 0x001d }
        L_0x0065:
            boolean r8 = r6.isReadable()     // Catch:{ all -> 0x001d }
            if (r8 == 0) goto L_0x0072
            b6.x1 r8 = r10.pendingUnencryptedWrites     // Catch:{ all -> 0x001d }
            r8.addFirst((S5.C0185n) r6, (T5.C0274u0) r5)     // Catch:{ all -> 0x001d }
            r5 = r2
            goto L_0x0075
        L_0x0072:
            r6.release()     // Catch:{ all -> 0x001d }
        L_0x0075:
            boolean r6 = r4.isReadable()     // Catch:{ all -> 0x001d }
            if (r6 == 0) goto L_0x0089
            if (r5 == 0) goto L_0x0084
            r11.write(r4, r5)     // Catch:{ all -> 0x0081 }
            goto L_0x0087
        L_0x0081:
            r11 = move-exception
            goto L_0x0138
        L_0x0084:
            r11.write(r4)     // Catch:{ all -> 0x0081 }
        L_0x0087:
            r4 = r2
            goto L_0x0090
        L_0x0089:
            if (r5 == 0) goto L_0x0090
            S5.n r6 = S5.D0.EMPTY_BUFFER     // Catch:{ all -> 0x001d }
            r11.write(r6, r5)     // Catch:{ all -> 0x001d }
        L_0x0090:
            javax.net.ssl.SSLEngineResult$Status r5 = r7.getStatus()     // Catch:{ all -> 0x001d }
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x001d }
            if (r5 != r6) goto L_0x00c7
            b6.x1 r0 = r10.pendingUnencryptedWrites     // Catch:{ all -> 0x001d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x00bc
            f6.L r0 = r10.handshakePromise     // Catch:{ all -> 0x001d }
            java.lang.Throwable r0 = r0.cause()     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x00b7
            b6.s1 r0 = r10.sslClosePromise     // Catch:{ all -> 0x001d }
            java.lang.Throwable r0 = r0.cause()     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x00b7
            b6.Y0 r0 = new b6.Y0     // Catch:{ all -> 0x001d }
            java.lang.String r2 = "SSLEngine closed already"
            r0.<init>(r2)     // Catch:{ all -> 0x001d }
        L_0x00b7:
            b6.x1 r2 = r10.pendingUnencryptedWrites     // Catch:{ all -> 0x001d }
            r2.releaseAndFailAll(r11, r0)     // Catch:{ all -> 0x001d }
        L_0x00bc:
            if (r4 == 0) goto L_0x00c1
            r4.release()
        L_0x00c1:
            if (r12 == 0) goto L_0x00c6
            r10.setState(r1)
        L_0x00c6:
            return
        L_0x00c7:
            int[] r5 = b6.C0560i1.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch:{ all -> 0x001d }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = r7.getHandshakeStatus()     // Catch:{ all -> 0x001d }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x001d }
            r5 = r5[r6]     // Catch:{ all -> 0x001d }
            r6 = 1
            if (r5 == r6) goto L_0x0127
            r6 = 2
            if (r5 == r6) goto L_0x0122
            r6 = 3
            if (r5 == r6) goto L_0x0122
            r6 = 4
            if (r5 == r6) goto L_0x010b
            r0 = 5
            if (r5 != r0) goto L_0x00f0
            r10.readIfNeeded(r11)     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x00ea
            r4.release()
        L_0x00ea:
            if (r12 == 0) goto L_0x00ef
            r10.setState(r1)
        L_0x00ef:
            return
        L_0x00f0:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x001d }
            r0.<init>()     // Catch:{ all -> 0x001d }
            java.lang.String r2 = "Unknown handshake status: "
            r0.append(r2)     // Catch:{ all -> 0x001d }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r7.getHandshakeStatus()     // Catch:{ all -> 0x001d }
            r0.append(r2)     // Catch:{ all -> 0x001d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x001d }
            r11.<init>(r0)     // Catch:{ all -> 0x001d }
            throw r11     // Catch:{ all -> 0x001d }
        L_0x010b:
            int r5 = r7.bytesProduced()     // Catch:{ all -> 0x001d }
            if (r5 <= 0) goto L_0x000a
            b6.x1 r5 = r10.pendingUnencryptedWrites     // Catch:{ all -> 0x001d }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x001d }
            if (r5 == 0) goto L_0x000a
            b6.x1 r5 = r10.pendingUnencryptedWrites     // Catch:{ all -> 0x001d }
            S5.n r6 = S5.D0.EMPTY_BUFFER     // Catch:{ all -> 0x001d }
            r5.add(r6)     // Catch:{ all -> 0x001d }
            goto L_0x000a
        L_0x0122:
            r10.setHandshakeSuccess()     // Catch:{ all -> 0x001d }
            goto L_0x000a
        L_0x0127:
            boolean r5 = r10.runDelegatedTasks(r12)     // Catch:{ all -> 0x001d }
            if (r5 != 0) goto L_0x000a
        L_0x012d:
            if (r4 == 0) goto L_0x0132
            r4.release()
        L_0x0132:
            if (r12 == 0) goto L_0x0137
            r10.setState(r1)
        L_0x0137:
            return
        L_0x0138:
            if (r2 == 0) goto L_0x013d
            r2.release()
        L_0x013d:
            if (r12 == 0) goto L_0x0142
            r10.setState(r1)
        L_0x0142:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C1.wrap(T5.Y, boolean):void");
    }

    private void wrapAndFlush(Y y8) {
        if (this.pendingUnencryptedWrites.isEmpty()) {
            this.pendingUnencryptedWrites.add(D0.EMPTY_BUFFER, y8.newPromise());
        }
        if (!this.handshakePromise.isDone()) {
            setState(2);
        }
        try {
            wrap(y8, false);
        } finally {
            forceFlush(y8);
        }
    }

    private SSLEngineResult wrapMultiple(C0187o oVar, SSLEngine sSLEngine, C0185n nVar, C0185n nVar2) {
        SSLEngineResult wrap;
        SSLEngineResult sSLEngineResult = null;
        while (true) {
            int min = Math.min(16384, nVar.readableBytes());
            int calculateRequiredOutBufSpace = this.engineType.calculateRequiredOutBufSpace(this, min, nVar.nioBufferCount());
            if (!nVar2.isWritable(calculateRequiredOutBufSpace)) {
                if (sSLEngineResult != null) {
                    return sSLEngineResult;
                }
                nVar2.ensureWritable(calculateRequiredOutBufSpace);
            }
            C0185n readSlice = nVar.readSlice(min);
            wrap = wrap(oVar, sSLEngine, readSlice, nVar2);
            if (wrap.getStatus() == SSLEngineResult.Status.CLOSED) {
                break;
            }
            if (readSlice.isReadable()) {
                nVar.readerIndex(nVar.readerIndex() - readSlice.readableBytes());
            }
            if (nVar.readableBytes() <= 0) {
                break;
            }
            sSLEngineResult = wrap;
        }
        return wrap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a1, code lost:
        if (setHandshakeSuccess() == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a3, code lost:
        if (r11 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ab, code lost:
        if (r9.pendingUnencryptedWrites.isEmpty() != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ad, code lost:
        wrap(r10, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b0, code lost:
        if (r2 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b2, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b5, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean wrapNonAppData(T5.Y r10, boolean r11) {
        /*
            r9 = this;
            S5.o r0 = r10.alloc()
            r1 = 0
            r2 = r1
        L_0x0006:
            boolean r3 = r10.isRemoved()     // Catch:{ all -> 0x0017 }
            r4 = 0
            if (r3 != 0) goto L_0x00d6
            r3 = 1
            if (r2 != 0) goto L_0x001a
            r5 = 2048(0x800, float:2.87E-42)
            S5.n r2 = r9.allocateOutNetBuf(r10, r5, r3)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r10 = move-exception
            goto L_0x00dc
        L_0x001a:
            javax.net.ssl.SSLEngine r5 = r9.engine     // Catch:{ all -> 0x0017 }
            S5.n r6 = S5.D0.EMPTY_BUFFER     // Catch:{ all -> 0x0017 }
            javax.net.ssl.SSLEngineResult r5 = r9.wrap(r0, r5, r6, r2)     // Catch:{ all -> 0x0017 }
            int r6 = r5.bytesProduced()     // Catch:{ all -> 0x0017 }
            if (r6 <= 0) goto L_0x003c
            T5.P r6 = r10.write(r2)     // Catch:{ all -> 0x0017 }
            b6.k1 r7 = new b6.k1     // Catch:{ all -> 0x0017 }
            r7.<init>(r9, r10)     // Catch:{ all -> 0x0017 }
            r6.addListener(r7)     // Catch:{ all -> 0x0017 }
            if (r11 == 0) goto L_0x003b
            r6 = 16
            r9.setState(r6)     // Catch:{ all -> 0x0017 }
        L_0x003b:
            r2 = r1
        L_0x003c:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = r5.getHandshakeStatus()     // Catch:{ all -> 0x0017 }
            int[] r7 = b6.C0560i1.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus     // Catch:{ all -> 0x0017 }
            int r8 = r6.ordinal()     // Catch:{ all -> 0x0017 }
            r7 = r7[r8]     // Catch:{ all -> 0x0017 }
            if (r7 == r3) goto L_0x00b6
            r8 = 2
            if (r7 == r8) goto L_0x009d
            r8 = 3
            if (r7 == r8) goto L_0x007f
            r3 = 4
            if (r7 == r3) goto L_0x00bd
            r3 = 5
            if (r7 != r3) goto L_0x0064
            if (r11 != 0) goto L_0x005e
            int r3 = r9.unwrapNonAppData(r10)     // Catch:{ all -> 0x0017 }
            if (r3 > 0) goto L_0x00bd
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.release()
        L_0x0063:
            return r4
        L_0x0064:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0017 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            r11.<init>()     // Catch:{ all -> 0x0017 }
            java.lang.String r0 = "Unknown handshake status: "
            r11.append(r0)     // Catch:{ all -> 0x0017 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r5.getHandshakeStatus()     // Catch:{ all -> 0x0017 }
            r11.append(r0)     // Catch:{ all -> 0x0017 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0017 }
            r10.<init>(r11)     // Catch:{ all -> 0x0017 }
            throw r10     // Catch:{ all -> 0x0017 }
        L_0x007f:
            boolean r0 = r9.setHandshakeSuccess()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0092
            if (r11 == 0) goto L_0x0092
            b6.x1 r0 = r9.pendingUnencryptedWrites     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0092
            r9.wrap(r10, r3)     // Catch:{ all -> 0x0017 }
        L_0x0092:
            if (r11 != 0) goto L_0x0097
            r9.unwrapNonAppData(r10)     // Catch:{ all -> 0x0017 }
        L_0x0097:
            if (r2 == 0) goto L_0x009c
            r2.release()
        L_0x009c:
            return r3
        L_0x009d:
            boolean r0 = r9.setHandshakeSuccess()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x00b0
            if (r11 == 0) goto L_0x00b0
            b6.x1 r11 = r9.pendingUnencryptedWrites     // Catch:{ all -> 0x0017 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r11 != 0) goto L_0x00b0
            r9.wrap(r10, r3)     // Catch:{ all -> 0x0017 }
        L_0x00b0:
            if (r2 == 0) goto L_0x00b5
            r2.release()
        L_0x00b5:
            return r4
        L_0x00b6:
            boolean r3 = r9.runDelegatedTasks(r11)     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x00bd
            goto L_0x00d6
        L_0x00bd:
            int r3 = r5.bytesProduced()     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x00c8
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ all -> 0x0017 }
            if (r6 == r3) goto L_0x00c8
            goto L_0x00d6
        L_0x00c8:
            int r3 = r5.bytesConsumed()     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x0006
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r5.getHandshakeStatus()     // Catch:{ all -> 0x0017 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x0017 }
            if (r3 != r5) goto L_0x0006
        L_0x00d6:
            if (r2 == 0) goto L_0x00db
            r2.release()
        L_0x00db:
            return r4
        L_0x00dc:
            if (r2 == 0) goto L_0x00e1
            r2.release()
        L_0x00e1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C1.wrapNonAppData(T5.Y, boolean):boolean");
    }

    public void channelActive(Y y8) {
        setOpensslEngineSocketFd(y8.channel());
        if (!this.startTls) {
            startHandshakeProcessing(true);
        }
        y8.fireChannelActive();
    }

    public void channelInactive(Y y8) {
        boolean z;
        if (this.handshakePromise.cause() != null) {
            z = true;
        } else {
            z = false;
        }
        ClosedChannelException closedChannelException = new ClosedChannelException();
        if (isStateSet(8) && !this.handshakePromise.isDone()) {
            x0.addSuppressed((Throwable) closedChannelException, (Throwable) I1.newInstance("Connection closed while SSL/TLS handshake was in progress", C1.class, "channelInactive"));
        }
        setHandshakeFailure(y8, closedChannelException, !isStateSet(32), isStateSet(8), false);
        notifyClosePromise(closedChannelException);
        try {
            super.channelInactive(y8);
        } catch (C0364o e) {
            if (!z || !(e.getCause() instanceof SSLException)) {
                throw e;
            }
        }
    }

    public void channelReadComplete(Y y8) {
        channelReadComplete0(y8);
    }

    public void close(Y y8, C0274u0 u0Var) {
        closeOutboundAndChannel(y8, u0Var, false);
    }

    public void connect(Y y8, SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var) {
        y8.connect(socketAddress, socketAddress2, u0Var);
    }

    public void decode(Y y8, C0185n nVar, List<Object> list) {
        if (!isStateSet(128)) {
            if (this.jdkCompatibilityMode) {
                decodeJdkCompatible(y8, nVar);
            } else {
                decodeNonJdkCompatible(y8, nVar);
            }
        }
    }

    public void disconnect(Y y8, C0274u0 u0Var) {
        closeOutboundAndChannel(y8, u0Var, true);
    }

    public SSLEngine engine() {
        return this.engine;
    }

    public void exceptionCaught(Y y8, Throwable th) {
        if (ignoreException(th)) {
            C1082c cVar = logger;
            if (cVar.isDebugEnabled()) {
                cVar.debug("{} Swallowing a harmless 'connection reset by peer / broken pipe' error that occurred while writing close_notify in response to the peer's close_notify", y8.channel(), th);
            }
            if (y8.channel().isActive()) {
                y8.close();
                return;
            }
            return;
        }
        y8.fireExceptionCaught(th);
    }

    public void flush(Y y8) {
        if (this.startTls && !isStateSet(1)) {
            setState(1);
            this.pendingUnencryptedWrites.writeAndRemoveAll(y8);
            forceFlush(y8);
            startHandshakeProcessing(true);
        } else if (!isStateSet(128)) {
            try {
                wrapAndFlush(y8);
            } catch (Throwable th) {
                setHandshakeFailure(y8, th);
                g6.Y.throwException(th);
            }
        }
    }

    public void handlerAdded(Y y8) {
        this.ctx = y8;
        K channel = y8.channel();
        this.pendingUnencryptedWrites = new x1(this, channel, 16);
        setOpensslEngineSocketFd(channel);
        boolean equals = Boolean.TRUE.equals(channel.config().getOption(C0251i0.TCP_FASTOPEN_CONNECT));
        boolean isActive = channel.isActive();
        if (isActive || equals) {
            startHandshakeProcessing(isActive);
            if (equals) {
                C0263o0 outboundBuffer = ((C0250i) channel.unsafe()).outboundBuffer();
                if (outboundBuffer == null || outboundBuffer.totalPendingWriteBytes() > 0) {
                    setState(16);
                }
            }
        }
    }

    public void handlerRemoved0(Y y8) {
        try {
            x1 x1Var = this.pendingUnencryptedWrites;
            if (x1Var != null && !x1Var.isEmpty()) {
                this.pendingUnencryptedWrites.releaseAndFailAll(y8, new N("Pending write on removal of SslHandler"));
            }
            SSLException sSLException = null;
            this.pendingUnencryptedWrites = null;
            if (!this.handshakePromise.isDone()) {
                sSLException = new SSLHandshakeException("SslHandler removed before handshake completed");
                if (this.handshakePromise.tryFailure(sSLException)) {
                    y8.fireUserEventTriggered(new D1(sSLException));
                }
            }
            if (!this.sslClosePromise.isDone()) {
                if (sSLException == null) {
                    sSLException = new SSLException("SslHandler removed before SSLEngine was closed");
                }
                notifyClosePromise(sSLException);
            }
            I.release(this.engine);
        } catch (Throwable th) {
            I.release(this.engine);
            throw th;
        }
    }

    public void read(Y y8) {
        if (!this.handshakePromise.isDone()) {
            setState(4);
        }
        y8.read();
    }

    public void setHandshakeTimeoutMillis(long j7) {
        this.handshakeTimeoutMillis = B.checkPositiveOrZero(j7, "handshakeTimeoutMillis");
    }

    public void write(Y y8, Object obj, C0274u0 u0Var) {
        if (!(obj instanceof C0185n)) {
            Q q7 = new Q(obj, C0185n.class);
            I.safeRelease(obj);
            u0Var.setFailure(q7);
            return;
        }
        x1 x1Var = this.pendingUnencryptedWrites;
        if (x1Var == null) {
            I.safeRelease(obj);
            u0Var.setFailure(newPendingWritesNullException());
            return;
        }
        x1Var.add((C0185n) obj, u0Var);
    }

    public C1(SSLEngine sSLEngine, boolean z, Executor executor) {
        this.singleBuffer = new ByteBuffer[1];
        this.sslTaskRunnerForUnwrap = new B1(this, true);
        this.sslTaskRunner = new B1(this, false);
        this.handshakePromise = new s1(this, (C0563j1) null);
        this.sslClosePromise = new s1(this, (C0563j1) null);
        this.handshakeTimeoutMillis = 10000;
        this.closeNotifyFlushTimeoutMillis = 3000;
        this.wrapDataSize = 16384;
        this.engine = (SSLEngine) B.checkNotNull(sSLEngine, "engine");
        this.delegatedTaskExecutor = (Executor) B.checkNotNull(executor, "delegatedTaskExecutor");
        w1 forEngine = w1.forEngine(sSLEngine);
        this.engineType = forEngine;
        this.startTls = z;
        this.jdkCompatibilityMode = forEngine.jdkCompatibilityMode(sSLEngine);
        setCumulator(forEngine.cumulator);
    }

    /* access modifiers changed from: private */
    public void executeDelegatedTask(B1 b12) {
        setState(128);
        try {
            this.delegatedTaskExecutor.execute(b12);
        } catch (RejectedExecutionException e) {
            clearState(128);
            throw e;
        }
    }

    private void setHandshakeFailure(Y y8, Throwable th, boolean z, boolean z6, boolean z8) {
        String message;
        try {
            setState(32);
            this.engine.closeOutbound();
            if (z) {
                this.engine.closeInbound();
            }
        } catch (SSLException e) {
            C1082c cVar = logger;
            if (cVar.isDebugEnabled() && ((message = e.getMessage()) == null || (!message.contains("possible truncation attack") && !message.contains("closing inbound before receiving peer's close_notify")))) {
                cVar.debug("{} SSLEngine.closeInbound() raised an exception.", y8.channel(), e);
            }
        } catch (Throwable th2) {
            releaseAndFailAll(y8, th);
            throw th2;
        }
        if (this.handshakePromise.tryFailure(th) || z8) {
            H1.handleHandshakeFailure(y8, th, z6);
        }
        releaseAndFailAll(y8, th);
    }

    private void flush(Y y8, C0274u0 u0Var) {
        x1 x1Var = this.pendingUnencryptedWrites;
        if (x1Var != null) {
            x1Var.add(D0.EMPTY_BUFFER, u0Var);
        } else {
            u0Var.setFailure(newPendingWritesNullException());
        }
        flush(y8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private javax.net.ssl.SSLEngineResult wrap(S5.C0187o r7, javax.net.ssl.SSLEngine r8, S5.C0185n r9, S5.C0185n r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            int r2 = r9.readerIndex()     // Catch:{ all -> 0x0033 }
            int r3 = r9.readableBytes()     // Catch:{ all -> 0x0033 }
            boolean r4 = r9.isDirect()     // Catch:{ all -> 0x0033 }
            if (r4 != 0) goto L_0x0035
            b6.w1 r4 = r6.engineType     // Catch:{ all -> 0x0033 }
            boolean r4 = r4.wantsDirectBuffer     // Catch:{ all -> 0x0033 }
            if (r4 != 0) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            S5.c r7 = (S5.C0163c) r7     // Catch:{ all -> 0x002f }
            S5.n r7 = r7.directBuffer(r3)     // Catch:{ all -> 0x002f }
            r7.writeBytes((S5.C0185n) r9, (int) r2, (int) r3)     // Catch:{ all -> 0x002d }
            java.nio.ByteBuffer[] r2 = r6.singleBuffer     // Catch:{ all -> 0x002d }
            int r4 = r7.readerIndex()     // Catch:{ all -> 0x002d }
            java.nio.ByteBuffer r3 = r7.internalNioBuffer(r4, r3)     // Catch:{ all -> 0x002d }
            r2[r0] = r3     // Catch:{ all -> 0x002d }
            goto L_0x0050
        L_0x002d:
            r8 = move-exception
            goto L_0x0091
        L_0x002f:
            r7 = move-exception
            r8 = r7
        L_0x0031:
            r7 = r1
            goto L_0x0091
        L_0x0033:
            r8 = move-exception
            goto L_0x0031
        L_0x0035:
            boolean r7 = r9 instanceof S5.E     // Catch:{ all -> 0x0033 }
            if (r7 != 0) goto L_0x004b
            int r7 = r9.nioBufferCount()     // Catch:{ all -> 0x0033 }
            r4 = 1
            if (r7 != r4) goto L_0x004b
            java.nio.ByteBuffer[] r7 = r6.singleBuffer     // Catch:{ all -> 0x0033 }
            java.nio.ByteBuffer r2 = r9.internalNioBuffer(r2, r3)     // Catch:{ all -> 0x0033 }
            r7[r0] = r2     // Catch:{ all -> 0x0033 }
            r2 = r7
        L_0x0049:
            r7 = r1
            goto L_0x0050
        L_0x004b:
            java.nio.ByteBuffer[] r2 = r9.nioBuffers()     // Catch:{ all -> 0x0033 }
            goto L_0x0049
        L_0x0050:
            int r3 = r10.writerIndex()     // Catch:{ all -> 0x002d }
            int r4 = r10.writableBytes()     // Catch:{ all -> 0x002d }
            java.nio.ByteBuffer r3 = toByteBuffer(r10, r3, r4)     // Catch:{ all -> 0x002d }
            javax.net.ssl.SSLEngineResult r3 = r8.wrap(r2, r3)     // Catch:{ all -> 0x002d }
            int r4 = r3.bytesConsumed()     // Catch:{ all -> 0x002d }
            r9.skipBytes(r4)     // Catch:{ all -> 0x002d }
            int r4 = r10.writerIndex()     // Catch:{ all -> 0x002d }
            int r5 = r3.bytesProduced()     // Catch:{ all -> 0x002d }
            int r4 = r4 + r5
            r10.writerIndex(r4)     // Catch:{ all -> 0x002d }
            javax.net.ssl.SSLEngineResult$Status r4 = r3.getStatus()     // Catch:{ all -> 0x002d }
            javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x002d }
            if (r4 != r5) goto L_0x0087
            javax.net.ssl.SSLSession r3 = r8.getSession()     // Catch:{ all -> 0x002d }
            int r3 = r3.getPacketBufferSize()     // Catch:{ all -> 0x002d }
            r10.ensureWritable(r3)     // Catch:{ all -> 0x002d }
            goto L_0x0050
        L_0x0087:
            java.nio.ByteBuffer[] r8 = r6.singleBuffer
            r8[r0] = r1
            if (r7 == 0) goto L_0x0090
            r7.release()
        L_0x0090:
            return r3
        L_0x0091:
            java.nio.ByteBuffer[] r9 = r6.singleBuffer
            r9[r0] = r1
            if (r7 == 0) goto L_0x009a
            r7.release()
        L_0x009a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C1.wrap(S5.o, javax.net.ssl.SSLEngine, S5.n, S5.n):javax.net.ssl.SSLEngineResult");
    }
}
