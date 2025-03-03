package b6;

import N.e;
import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import e6.C0844c;
import e6.J;
import e6.P;
import e6.S;
import e6.U;
import g6.B;
import g6.C0978k;
import g6.Y;
import g6.x0;
import h6.C1082c;
import h6.d;
import io.netty.internal.tcnative.AsyncTask;
import io.netty.internal.tcnative.Buffer;
import io.netty.internal.tcnative.SSL;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;
import u.C1477r;

public class Q0 extends SSLEngine implements J {
    private static final SSLEngineResult CLOSED_NOT_HANDSHAKING;
    /* access modifiers changed from: private */
    public static final X509Certificate[] JAVAX_CERTS_NOT_SUPPORTED = new X509Certificate[0];
    static final int MAX_PLAINTEXT_LENGTH = SSL.SSL_MAX_PLAINTEXT_LENGTH;
    static final int MAX_RECORD_SIZE = SSL.SSL_MAX_RECORD_LENGTH;
    private static final SSLEngineResult NEED_UNWRAP_CLOSED;
    private static final SSLEngineResult NEED_UNWRAP_OK;
    private static final SSLEngineResult NEED_WRAP_CLOSED;
    private static final SSLEngineResult NEED_WRAP_OK;
    private static final int[] OPENSSL_OP_NO_PROTOCOLS = {SSL.SSL_OP_NO_SSLv2, SSL.SSL_OP_NO_SSLv3, SSL.SSL_OP_NO_TLSv1, SSL.SSL_OP_NO_TLSv1_1, SSL.SSL_OP_NO_TLSv1_2, SSL.SSL_OP_NO_TLSv1_3};
    private static final P leakDetector;
    private static final C1082c logger;
    private Object algorithmConstraints;
    final C0187o alloc;
    private final G apn;
    private volatile String applicationProtocol;
    private volatile C0561j clientAuth;
    /* access modifiers changed from: private */
    public final boolean clientMode;
    private volatile boolean destroyed;
    private final boolean enableOcsp;
    private String endPointIdentificationAlgorithm;
    private final S engineMap;
    private String[] explicitlyEnabledProtocols;
    /* access modifiers changed from: private */
    public L0 handshakeState = L0.NOT_STARTED;
    private boolean isInboundDone;
    final boolean jdkCompatibilityMode;
    /* access modifiers changed from: private */
    public volatile long lastAccessed;
    /* access modifiers changed from: private */
    public final U leak;
    private volatile Collection<?> matchers;
    private int maxWrapBufferSize;
    private int maxWrapOverhead;
    private volatile boolean needTask;
    private long networkBIO;
    private boolean outboundClosed;
    /* access modifiers changed from: private */
    public final F0 parentContext;
    private Throwable pendingException;
    private boolean receivedShutdown;
    private final C0844c refCnt = new G0(this);
    /* access modifiers changed from: private */
    public final Y session;
    private boolean sessionSet;
    private final ByteBuffer[] singleDstBuffer;
    private final ByteBuffer[] singleSrcBuffer;
    /* access modifiers changed from: private */
    public List<String> sniHostNames;
    /* access modifiers changed from: private */
    public long ssl;

    static {
        Class<Q0> cls = Q0.class;
        logger = d.getInstance((Class<?>) cls);
        leakDetector = S.instance().newResourceLeakDetector(cls);
        SSLEngineResult.Status status = SSLEngineResult.Status.OK;
        SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
        NEED_UNWRAP_OK = new SSLEngineResult(status, handshakeStatus, 0, 0);
        SSLEngineResult.Status status2 = SSLEngineResult.Status.CLOSED;
        NEED_UNWRAP_CLOSED = new SSLEngineResult(status2, handshakeStatus, 0, 0);
        SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.NEED_WRAP;
        NEED_WRAP_OK = new SSLEngineResult(status, handshakeStatus2, 0, 0);
        NEED_WRAP_CLOSED = new SSLEngineResult(status2, handshakeStatus2, 0, 0);
        CLOSED_NOT_HANDSHAKING = new SSLEngineResult(status2, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
    }

    public Q0(F0 f02, C0187o oVar, String str, int i, boolean z, boolean z6) {
        super(str, i);
        U u3;
        boolean z8;
        C0561j jVar = C0561j.NONE;
        this.clientAuth = jVar;
        this.lastAccessed = -1;
        this.singleSrcBuffer = new ByteBuffer[1];
        this.singleDstBuffer = new ByteBuffer[1];
        F.ensureAvailability();
        this.engineMap = f02.engineMap;
        boolean z9 = f02.enableOcsp;
        this.enableOcsp = z9;
        this.jdkCompatibilityMode = z;
        this.alloc = (C0187o) B.checkNotNull(oVar, "alloc");
        this.apn = (G) f02.applicationProtocolNegotiator();
        boolean isClient = f02.isClient();
        this.clientMode = isClient;
        if (Y.javaVersion() >= 7) {
            this.session = new H0(this, new K0(this, f02.sessionContext()));
        } else {
            this.session = new K0(this, f02.sessionContext());
        }
        if (!f02.sessionContext().useKeyManager()) {
            this.session.setLocalCertificate(f02.keyCertChain);
        }
        Lock readLock = f02.ctxLock.readLock();
        readLock.lock();
        try {
            long newSSL = SSL.newSSL(f02.ctx, !f02.isClient());
            synchronized (this) {
                this.ssl = newSSL;
                try {
                    this.networkBIO = SSL.bioNewByteBuffer(newSSL, f02.getBioNonApplicationBufferSize());
                    if (!isClient) {
                        jVar = f02.clientAuth;
                    }
                    setClientAuth(jVar);
                    String[] strArr = f02.protocols;
                    if (strArr != null) {
                        setEnabledProtocols0(strArr, true);
                    } else {
                        this.explicitlyEnabledProtocols = getEnabledProtocols();
                    }
                    if (isClient && H1.isValidHostNameForSNI(str)) {
                        if (Y.javaVersion() < 8) {
                            SSL.setTlsExtHostName(this.ssl, str);
                            this.sniHostNames = Collections.singletonList(str);
                        } else if (C0581t.isValidHostNameForSNI(str)) {
                            SSL.setTlsExtHostName(this.ssl, str);
                            this.sniHostNames = Collections.singletonList(str);
                        }
                    }
                    if (z9) {
                        SSL.enableOcsp(this.ssl);
                    }
                    if (!z) {
                        long j7 = this.ssl;
                        SSL.setMode(j7, SSL.getMode(j7) | SSL.SSL_MODE_ENABLE_PARTIAL_WRITE);
                    }
                    if (isProtocolEnabled(SSL.getOptions(this.ssl), SSL.SSL_OP_NO_TLSv1_3, "TLSv1.3")) {
                        if (isClient) {
                            z8 = F0.CLIENT_ENABLE_SESSION_TICKET_TLSV13;
                        } else {
                            z8 = F0.SERVER_ENABLE_SESSION_TICKET_TLSV13;
                        }
                        if (z8) {
                            SSL.clearOptions(this.ssl, SSL.SSL_OP_NO_TICKET);
                        }
                    }
                    if (F.isBoringSSL() && isClient) {
                        SSL.setRenegotiateMode(this.ssl, SSL.SSL_RENEGOTIATE_ONCE);
                    }
                    calculateMaxWrapOverhead();
                } catch (Throwable th) {
                    shutdown();
                    Y.throwException(th);
                }
            }
            this.parentContext = f02;
            f02.retain();
            if (z6) {
                u3 = leakDetector.track(this);
            } else {
                u3 = null;
            }
            this.leak = u3;
        } finally {
            readLock.unlock();
        }
    }

    private static long bufferAddress(ByteBuffer byteBuffer) {
        if (Y.hasUnsafe()) {
            return Y.directBufferAddress(byteBuffer);
        }
        return Buffer.address(byteBuffer);
    }

    /* access modifiers changed from: private */
    public void calculateMaxWrapOverhead() {
        int i;
        this.maxWrapOverhead = SSL.getMaxWrapOverhead(this.ssl);
        if (this.jdkCompatibilityMode) {
            i = maxEncryptedPacketLength0();
        } else {
            i = maxEncryptedPacketLength0() << 4;
        }
        this.maxWrapBufferSize = i;
    }

    private void checkEngineClosed() {
        if (isDestroyed()) {
            throw new SSLException("engine closed");
        }
    }

    private void closeAll() {
        this.receivedShutdown = true;
        closeOutbound();
        closeInbound();
    }

    private boolean doSSLShutdown() {
        if (SSL.isInInit(this.ssl) != 0) {
            return false;
        }
        int shutdownSSL = SSL.shutdownSSL(this.ssl);
        if (shutdownSSL >= 0) {
            return true;
        }
        int error = SSL.getError(this.ssl, shutdownSSL);
        if (error == SSL.SSL_ERROR_SYSCALL || error == SSL.SSL_ERROR_SSL) {
            C1082c cVar = logger;
            if (cVar.isDebugEnabled()) {
                int lastErrorNumber = SSL.getLastErrorNumber();
                cVar.debug("SSL_shutdown failed: OpenSSL error: {} {}", Integer.valueOf(lastErrorNumber), SSL.getErrorString((long) lastErrorNumber));
            }
            shutdown();
            return false;
        }
        SSL.clearError();
        return true;
    }

    private SSLEngineResult handleUnwrapException(int i, int i8, SSLException sSLException) {
        int lastErrorNumber = SSL.getLastErrorNumber();
        if (lastErrorNumber != 0) {
            return sslReadErrorResult(SSL.SSL_ERROR_SSL, lastErrorNumber, i, i8);
        }
        throw sSLException;
    }

    private SSLEngineResult.HandshakeStatus handshake() {
        if (this.needTask) {
            return SSLEngineResult.HandshakeStatus.NEED_TASK;
        }
        if (this.handshakeState == L0.FINISHED) {
            return SSLEngineResult.HandshakeStatus.FINISHED;
        }
        checkEngineClosed();
        if (this.pendingException != null) {
            if (SSL.doHandshake(this.ssl) <= 0) {
                SSL.clearError();
            }
            return handshakeException();
        }
        ((E0) this.engineMap).add(this);
        if (!this.sessionSet) {
            this.parentContext.sessionContext().setSessionFromCache(getPeerHost(), getPeerPort(), this.ssl);
            this.sessionSet = true;
        }
        if (this.lastAccessed == -1) {
            this.lastAccessed = System.currentTimeMillis();
        }
        int doHandshake = SSL.doHandshake(this.ssl);
        if (doHandshake <= 0) {
            int error = SSL.getError(this.ssl, doHandshake);
            if (error == SSL.SSL_ERROR_WANT_READ || error == SSL.SSL_ERROR_WANT_WRITE) {
                return pendingStatus(SSL.bioLengthNonApplication(this.networkBIO));
            }
            if (error == SSL.SSL_ERROR_WANT_X509_LOOKUP || error == SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY || error == SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION) {
                return SSLEngineResult.HandshakeStatus.NEED_TASK;
            }
            if (needWrapAgain(SSL.getLastErrorNumber())) {
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
            if (this.pendingException != null) {
                return handshakeException();
            }
            throw shutdownWithError("SSL_do_handshake", error);
        } else if (SSL.bioLengthNonApplication(this.networkBIO) > 0) {
            return SSLEngineResult.HandshakeStatus.NEED_WRAP;
        } else {
            this.session.handshakeFinished(SSL.getSessionId(this.ssl), SSL.getCipherForSSL(this.ssl), SSL.getVersion(this.ssl), SSL.getPeerCertificate(this.ssl), SSL.getPeerCertChain(this.ssl), SSL.getTime(this.ssl) * 1000, 1000 * this.parentContext.sessionTimeout());
            selectApplicationProtocol();
            return SSLEngineResult.HandshakeStatus.FINISHED;
        }
    }

    private SSLEngineResult.HandshakeStatus handshakeException() {
        if (SSL.bioLengthNonApplication(this.networkBIO) > 0) {
            return SSLEngineResult.HandshakeStatus.NEED_WRAP;
        }
        Throwable th = this.pendingException;
        this.pendingException = null;
        shutdown();
        if (th instanceof SSLHandshakeException) {
            throw ((SSLHandshakeException) th);
        }
        SSLHandshakeException sSLHandshakeException = new SSLHandshakeException("General OpenSslEngine problem");
        sSLHandshakeException.initCause(th);
        throw sSLHandshakeException;
    }

    private boolean isBytesAvailableEnoughForWrap(int i, int i8, int i9) {
        if (((long) i) - (((long) this.maxWrapOverhead) * ((long) i9)) >= ((long) i8)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean isDestroyed() {
        return this.destroyed;
    }

    /* access modifiers changed from: private */
    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    private static boolean isEndPointVerificationEnabled(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }

    private static boolean isProtocolEnabled(int i, int i8, String str) {
        if ((i & i8) != 0 || !F.SUPPORTED_PROTOCOLS_SET.contains(str)) {
            return false;
        }
        return true;
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i8) {
        if ((handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP && i8 > 0) || (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP && i > 0)) {
            return handshake();
        }
        SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.FINISHED;
        if (handshakeStatus != handshakeStatus2) {
            handshakeStatus2 = getHandshakeStatus();
        }
        return mayFinishHandshake(handshakeStatus2);
    }

    private boolean needPendingStatus() {
        if (this.handshakeState == L0.NOT_STARTED || isDestroyed() || (this.handshakeState == L0.FINISHED && !isInboundDone() && !isOutboundDone())) {
            return false;
        }
        return true;
    }

    private boolean needWrapAgain(int i) {
        if (SSL.bioLengthNonApplication(this.networkBIO) <= 0) {
            return false;
        }
        Throwable th = this.pendingException;
        if (th == null) {
            this.pendingException = newSSLExceptionForError(i);
        } else if (shouldAddSuppressed(th, i)) {
            x0.addSuppressed(this.pendingException, (Throwable) newSSLExceptionForError(i));
        }
        SSL.clearError();
        return true;
    }

    private SSLEngineResult newResult(SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i8) {
        return newResult(SSLEngineResult.Status.OK, handshakeStatus, i, i8);
    }

    private SSLEngineResult newResultMayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i8) {
        return newResult(mayFinishHandshake(handshakeStatus, i, i8), i, i8);
    }

    private SSLException newSSLExceptionForError(int i) {
        String errorString = SSL.getErrorString((long) i);
        if (this.handshakeState == L0.FINISHED) {
            return new N0(errorString, i);
        }
        return new O0(errorString, i);
    }

    private static SSLEngineResult.HandshakeStatus pendingStatus(int i) {
        if (i > 0) {
            return SSLEngineResult.HandshakeStatus.NEED_WRAP;
        }
        return SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
    }

    /* JADX INFO: finally extract failed */
    private int readPlaintextData(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            int readFromSSL = SSL.readFromSSL(this.ssl, bufferAddress(byteBuffer) + ((long) position), byteBuffer.limit() - position);
            if (readFromSSL <= 0) {
                return readFromSSL;
            }
            byteBuffer.position(position + readFromSSL);
            return readFromSSL;
        }
        int limit = byteBuffer.limit();
        int min = Math.min(maxEncryptedPacketLength0(), limit - position);
        C0185n directBuffer = ((C0163c) this.alloc).directBuffer(min);
        try {
            int readFromSSL2 = SSL.readFromSSL(this.ssl, F.memoryAddress(directBuffer), min);
            if (readFromSSL2 > 0) {
                byteBuffer.limit(position + readFromSSL2);
                directBuffer.getBytes(directBuffer.readerIndex(), byteBuffer);
                byteBuffer.limit(limit);
            }
            directBuffer.release();
            return readFromSSL2;
        } catch (Throwable th) {
            directBuffer.release();
            throw th;
        }
    }

    private void rejectRemoteInitiatedRenegotiation() {
        if (isDestroyed()) {
            return;
        }
        if (((!this.clientMode && SSL.getHandshakeCount(this.ssl) > 1) || (this.clientMode && SSL.getHandshakeCount(this.ssl) > 2)) && !"TLSv1.3".equals(this.session.getProtocol()) && this.handshakeState == L0.FINISHED) {
            shutdown();
            throw new SSLHandshakeException("remote-initiated renegotiation not allowed");
        }
    }

    private void resetSingleDstBuffer() {
        this.singleDstBuffer[0] = null;
    }

    private void resetSingleSrcBuffer() {
        this.singleSrcBuffer[0] = null;
    }

    /* access modifiers changed from: private */
    public synchronized void runAndResetNeedTask(Runnable runnable) {
        try {
            if (isDestroyed()) {
                this.needTask = false;
                return;
            }
            runnable.run();
            this.needTask = false;
        } catch (Throwable th) {
            this.needTask = false;
            throw th;
        }
    }

    private void selectApplicationProtocol() {
        C0537b selectedListenerFailureBehavior = this.apn.selectedListenerFailureBehavior();
        List<String> protocols = this.apn.protocols();
        int i = I0.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol[this.apn.protocol().ordinal()];
        if (i == 1) {
            return;
        }
        if (i == 2) {
            String alpnSelected = SSL.getAlpnSelected(this.ssl);
            if (alpnSelected != null) {
                this.applicationProtocol = selectApplicationProtocol(protocols, selectedListenerFailureBehavior, alpnSelected);
            }
        } else if (i == 3) {
            String nextProtoNegotiated = SSL.getNextProtoNegotiated(this.ssl);
            if (nextProtoNegotiated != null) {
                this.applicationProtocol = selectApplicationProtocol(protocols, selectedListenerFailureBehavior, nextProtoNegotiated);
            }
        } else if (i == 4) {
            String alpnSelected2 = SSL.getAlpnSelected(this.ssl);
            if (alpnSelected2 == null) {
                alpnSelected2 = SSL.getNextProtoNegotiated(this.ssl);
            }
            if (alpnSelected2 != null) {
                this.applicationProtocol = selectApplicationProtocol(protocols, selectedListenerFailureBehavior, alpnSelected2);
            }
        } else {
            throw new Error();
        }
    }

    private void setClientAuth(C0561j jVar) {
        if (!this.clientMode) {
            synchronized (this) {
                try {
                    if (this.clientAuth != jVar) {
                        if (!isDestroyed()) {
                            int i = I0.$SwitchMap$io$netty$handler$ssl$ClientAuth[jVar.ordinal()];
                            if (i == 1) {
                                SSL.setVerify(this.ssl, 0, 10);
                            } else if (i == 2) {
                                SSL.setVerify(this.ssl, 2, 10);
                            } else if (i == 3) {
                                SSL.setVerify(this.ssl, 1, 10);
                            } else {
                                throw new Error(jVar.toString());
                            }
                        }
                        this.clientAuth = jVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void setEnabledProtocols0(String[] strArr, boolean z) {
        B.checkNotNullWithIAE(strArr, "protocols");
        int length = OPENSSL_OP_NO_PROTOCOLS.length;
        int length2 = strArr.length;
        int i = 0;
        int i8 = 0;
        while (i < length2) {
            String str = strArr[i];
            if (F.SUPPORTED_PROTOCOLS_SET.contains(str)) {
                if (str.equals("SSLv2")) {
                    if (length > 0) {
                        length = 0;
                    }
                    if (i8 < 0) {
                        i8 = 0;
                    }
                } else if (str.equals("SSLv3")) {
                    if (length > 1) {
                        length = 1;
                    }
                    if (i8 < 1) {
                        i8 = 1;
                    }
                } else if (str.equals("TLSv1")) {
                    if (length > 2) {
                        length = 2;
                    }
                    if (i8 < 2) {
                        i8 = 2;
                    }
                } else if (str.equals("TLSv1.1")) {
                    if (length > 3) {
                        length = 3;
                    }
                    if (i8 < 3) {
                        i8 = 3;
                    }
                } else if (str.equals("TLSv1.2")) {
                    if (length > 4) {
                        length = 4;
                    }
                    if (i8 < 4) {
                        i8 = 4;
                    }
                } else if (str.equals("TLSv1.3")) {
                    if (length > 5) {
                        length = 5;
                    }
                    if (i8 < 5) {
                        i8 = 5;
                    }
                }
                i++;
            } else {
                throw new IllegalArgumentException(e.y("Protocol ", str, " is not supported."));
            }
        }
        synchronized (this) {
            if (z) {
                try {
                    this.explicitlyEnabledProtocols = strArr;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!isDestroyed()) {
                SSL.clearOptions(this.ssl, SSL.SSL_OP_NO_SSLv2 | SSL.SSL_OP_NO_SSLv3 | SSL.SSL_OP_NO_TLSv1 | SSL.SSL_OP_NO_TLSv1_1 | SSL.SSL_OP_NO_TLSv1_2 | SSL.SSL_OP_NO_TLSv1_3);
                int i9 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    i9 |= OPENSSL_OP_NO_PROTOCOLS[i10];
                }
                int i11 = i8 + 1;
                while (true) {
                    int[] iArr = OPENSSL_OP_NO_PROTOCOLS;
                    if (i11 < iArr.length) {
                        i9 |= iArr[i11];
                        i11++;
                    } else {
                        SSL.setOptions(this.ssl, i9);
                    }
                }
            } else {
                throw new IllegalStateException("failed to enable protocols: " + Arrays.asList(strArr));
            }
        }
    }

    private static boolean shouldAddSuppressed(Throwable th, int i) {
        for (Throwable th2 : x0.getSuppressed(th)) {
            if ((th2 instanceof M0) && ((M0) th2).errorCode() == i) {
                return false;
            }
        }
        return true;
    }

    private SSLException shutdownWithError(String str, int i) {
        return shutdownWithError(str, i, SSL.getLastErrorNumber());
    }

    private ByteBuffer[] singleDstBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleDstBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private ByteBuffer[] singleSrcBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleSrcBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private int sslPending0() {
        if (this.handshakeState != L0.FINISHED) {
            return 0;
        }
        return SSL.sslPending(this.ssl);
    }

    private SSLEngineResult sslReadErrorResult(int i, int i8, int i9, int i10) {
        if (needWrapAgain(i8)) {
            return new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, i9, i10);
        }
        throw shutdownWithError("SSL_read", i, i8);
    }

    /* access modifiers changed from: private */
    public String toJavaCipherSuite(String str) {
        if (str == null) {
            return null;
        }
        return C0555h.toJava(str, toJavaCipherSuitePrefix(SSL.getVersion(this.ssl)));
    }

    private static String toJavaCipherSuitePrefix(String str) {
        char c8 = 0;
        if (str != null && !str.isEmpty()) {
            c8 = str.charAt(0);
        }
        if (c8 == 'S') {
            return "SSL";
        }
        if (c8 != 'T') {
            return "UNKNOWN";
        }
        return "TLS";
    }

    private C0185n writeEncryptedData(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            SSL.bioSetByteBuffer(this.networkBIO, bufferAddress(byteBuffer) + ((long) position), i, false);
            return null;
        }
        C0185n directBuffer = ((C0163c) this.alloc).directBuffer(i);
        try {
            int limit = byteBuffer.limit();
            byteBuffer.limit(position + i);
            directBuffer.writeBytes(byteBuffer);
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            SSL.bioSetByteBuffer(this.networkBIO, F.memoryAddress(directBuffer), i, false);
            return directBuffer;
        } catch (Throwable th) {
            directBuffer.release();
            Y.throwException(th);
            return null;
        }
    }

    private int writePlaintextData(ByteBuffer byteBuffer, int i) {
        int i8;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        if (byteBuffer.isDirect()) {
            i8 = SSL.writeToSSL(this.ssl, bufferAddress(byteBuffer) + ((long) position), i);
            if (i8 > 0) {
                byteBuffer.position(position + i8);
            }
        } else {
            C0185n directBuffer = ((C0163c) this.alloc).directBuffer(i);
            try {
                byteBuffer.limit(position + i);
                directBuffer.setBytes(0, byteBuffer);
                byteBuffer.limit(limit);
                i8 = SSL.writeToSSL(this.ssl, F.memoryAddress(directBuffer), i);
                if (i8 > 0) {
                    byteBuffer.position(position + i8);
                } else {
                    byteBuffer.position(position);
                }
            } finally {
                directBuffer.release();
            }
        }
        return i8;
    }

    public final synchronized void beginHandshake() {
        try {
            int i = I0.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState[this.handshakeState.ordinal()];
            if (i == 1) {
                this.handshakeState = L0.STARTED_EXPLICITLY;
                if (handshake() == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                    this.needTask = true;
                }
                calculateMaxWrapOverhead();
            } else if (i == 2) {
                throw new SSLException("renegotiation unsupported");
            } else if (i == 3) {
                checkEngineClosed();
                this.handshakeState = L0.STARTED_EXPLICITLY;
                calculateMaxWrapOverhead();
            } else if (i != 4) {
                throw new Error();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final int calculateMaxLengthForWrap(int i, int i8) {
        return (int) Math.min((long) this.maxWrapBufferSize, (((long) this.maxWrapOverhead) * ((long) i8)) + ((long) i));
    }

    public final int calculateOutNetBufSize(int i, int i8) {
        return (int) Math.min(2147483647L, (((long) this.maxWrapOverhead) * ((long) i8)) + ((long) i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void closeInbound() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isInboundDone     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            r2.isInboundDone = r0     // Catch:{ all -> 0x0014 }
            boolean r0 = r2.isOutboundDone()     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0016
            r2.shutdown()     // Catch:{ all -> 0x0014 }
            goto L_0x0016
        L_0x0014:
            r0 = move-exception
            goto L_0x002b
        L_0x0016:
            b6.L0 r0 = r2.handshakeState     // Catch:{ all -> 0x0014 }
            b6.L0 r1 = b6.L0.NOT_STARTED     // Catch:{ all -> 0x0014 }
            if (r0 == r1) goto L_0x0029
            boolean r0 = r2.receivedShutdown     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Inbound closed before receiving peer's close_notify: possible truncation attack?"
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0029:
            monitor-exit(r2)
            return
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.Q0.closeInbound():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void closeOutbound() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.outboundClosed     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            r2.outboundClosed = r0     // Catch:{ all -> 0x0027 }
            b6.L0 r0 = r2.handshakeState     // Catch:{ all -> 0x0027 }
            b6.L0 r1 = b6.L0.NOT_STARTED     // Catch:{ all -> 0x0027 }
            if (r0 == r1) goto L_0x0029
            boolean r0 = r2.isDestroyed()     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0029
            long r0 = r2.ssl     // Catch:{ all -> 0x0027 }
            int r0 = io.netty.internal.tcnative.SSL.getShutdown(r0)     // Catch:{ all -> 0x0027 }
            int r1 = io.netty.internal.tcnative.SSL.SSL_SENT_SHUTDOWN     // Catch:{ all -> 0x0027 }
            r0 = r0 & r1
            int r1 = io.netty.internal.tcnative.SSL.SSL_SENT_SHUTDOWN     // Catch:{ all -> 0x0027 }
            if (r0 == r1) goto L_0x002c
            r2.doSSLShutdown()     // Catch:{ all -> 0x0027 }
            goto L_0x002c
        L_0x0027:
            r0 = move-exception
            goto L_0x002e
        L_0x0029:
            r2.shutdown()     // Catch:{ all -> 0x0027 }
        L_0x002c:
            monitor-exit(r2)
            return
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.Q0.closeOutbound():void");
    }

    public String getApplicationProtocol() {
        return this.applicationProtocol;
    }

    public final synchronized Runnable getDelegatedTask() {
        if (isDestroyed()) {
            return null;
        }
        AsyncTask task = SSL.getTask(this.ssl);
        if (task == null) {
            return null;
        }
        if (task instanceof AsyncTask) {
            return new J0(this, task);
        }
        return new P0(this, task);
    }

    public final boolean getEnableSessionCreation() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return g6.C0978k.EMPTY_STRINGS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r4 = new java.util.LinkedHashSet(r0.length + r1.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r2 >= r0.length) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r5 = toJavaCipherSuite(r0[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r5 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r5 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r3 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (b6.F.isTlsv13Supported() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (b6.H1.isTLSv13Cipher(r5) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        r4.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        java.util.Collections.addAll(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        return (java.lang.String[]) r4.toArray(g6.C0978k.EMPTY_STRINGS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] getEnabledCipherSuites() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isDestroyed()     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x006a
            long r0 = r7.ssl     // Catch:{ all -> 0x0022 }
            java.lang.String[] r0 = io.netty.internal.tcnative.SSL.getCiphers(r0)     // Catch:{ all -> 0x0022 }
            long r1 = r7.ssl     // Catch:{ all -> 0x0022 }
            int r1 = io.netty.internal.tcnative.SSL.getOptions(r1)     // Catch:{ all -> 0x0022 }
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = "TLSv1.3"
            boolean r1 = isProtocolEnabled(r1, r2, r3)     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 == 0) goto L_0x0024
            java.lang.String[] r1 = b6.F.EXTRA_SUPPORTED_TLS_1_3_CIPHERS     // Catch:{ all -> 0x0022 }
            r3 = 1
            goto L_0x0027
        L_0x0022:
            r0 = move-exception
            goto L_0x006e
        L_0x0024:
            java.lang.String[] r1 = g6.C0978k.EMPTY_STRINGS     // Catch:{ all -> 0x0022 }
            r3 = 0
        L_0x0027:
            monitor-exit(r7)     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x002d
            java.lang.String[] r0 = g6.C0978k.EMPTY_STRINGS
            return r0
        L_0x002d:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            int r5 = r0.length
            int r6 = r1.length
            int r5 = r5 + r6
            r4.<init>(r5)
            monitor-enter(r7)
        L_0x0036:
            int r5 = r0.length     // Catch:{ all -> 0x0044 }
            if (r2 >= r5) goto L_0x005b
            r5 = r0[r2]     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = r7.toJavaCipherSuite(r5)     // Catch:{ all -> 0x0044 }
            if (r5 != 0) goto L_0x0046
            r5 = r0[r2]     // Catch:{ all -> 0x0044 }
            goto L_0x0046
        L_0x0044:
            r0 = move-exception
            goto L_0x0068
        L_0x0046:
            if (r3 == 0) goto L_0x004e
            boolean r6 = b6.F.isTlsv13Supported()     // Catch:{ all -> 0x0044 }
            if (r6 != 0) goto L_0x0055
        L_0x004e:
            boolean r6 = b6.H1.isTLSv13Cipher(r5)     // Catch:{ all -> 0x0044 }
            if (r6 == 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r4.add(r5)     // Catch:{ all -> 0x0044 }
        L_0x0058:
            int r2 = r2 + 1
            goto L_0x0036
        L_0x005b:
            java.util.Collections.addAll(r4, r1)     // Catch:{ all -> 0x0044 }
            monitor-exit(r7)     // Catch:{ all -> 0x0044 }
            java.lang.String[] r0 = g6.C0978k.EMPTY_STRINGS
            java.lang.Object[] r0 = r4.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0068:
            monitor-exit(r7)     // Catch:{ all -> 0x0044 }
            throw r0
        L_0x006a:
            java.lang.String[] r0 = g6.C0978k.EMPTY_STRINGS     // Catch:{ all -> 0x0022 }
            monitor-exit(r7)     // Catch:{ all -> 0x0022 }
            return r0
        L_0x006e:
            monitor-exit(r7)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.Q0.getEnabledCipherSuites():java.lang.String[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (isProtocolEnabled(r1, io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1, "TLSv1.1") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r0.add("TLSv1.1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (isProtocolEnabled(r1, io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_2, "TLSv1.2") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0.add("TLSv1.2");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (isProtocolEnabled(r1, io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3, "TLSv1.3") == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        r0.add("TLSv1.3");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (isProtocolEnabled(r1, io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2, "SSLv2") == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r0.add("SSLv2");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (isProtocolEnabled(r1, io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3, "SSLv3") == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r0.add("SSLv3");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        return (java.lang.String[]) r0.toArray(g6.C0978k.EMPTY_STRINGS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (isProtocolEnabled(r1, io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1, "TLSv1") == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r0.add("TLSv1");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] getEnabledProtocols() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 6
            r0.<init>(r1)
            java.lang.String r1 = "SSLv2Hello"
            r0.add(r1)
            monitor-enter(r4)
            boolean r1 = r4.isDestroyed()     // Catch:{ all -> 0x007c }
            if (r1 != 0) goto L_0x007e
            long r1 = r4.ssl     // Catch:{ all -> 0x007c }
            int r1 = io.netty.internal.tcnative.SSL.getOptions(r1)     // Catch:{ all -> 0x007c }
            monitor-exit(r4)     // Catch:{ all -> 0x007c }
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1
            java.lang.String r3 = "TLSv1"
            boolean r2 = isProtocolEnabled(r1, r2, r3)
            if (r2 == 0) goto L_0x0028
            java.lang.String r2 = "TLSv1"
            r0.add(r2)
        L_0x0028:
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1
            java.lang.String r3 = "TLSv1.1"
            boolean r2 = isProtocolEnabled(r1, r2, r3)
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = "TLSv1.1"
            r0.add(r2)
        L_0x0037:
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_2
            java.lang.String r3 = "TLSv1.2"
            boolean r2 = isProtocolEnabled(r1, r2, r3)
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = "TLSv1.2"
            r0.add(r2)
        L_0x0046:
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3
            java.lang.String r3 = "TLSv1.3"
            boolean r2 = isProtocolEnabled(r1, r2, r3)
            if (r2 == 0) goto L_0x0055
            java.lang.String r2 = "TLSv1.3"
            r0.add(r2)
        L_0x0055:
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2
            java.lang.String r3 = "SSLv2"
            boolean r2 = isProtocolEnabled(r1, r2, r3)
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = "SSLv2"
            r0.add(r2)
        L_0x0064:
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3
            java.lang.String r3 = "SSLv3"
            boolean r1 = isProtocolEnabled(r1, r2, r3)
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = "SSLv3"
            r0.add(r1)
        L_0x0073:
            java.lang.String[] r1 = g6.C0978k.EMPTY_STRINGS
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x007c:
            r0 = move-exception
            goto L_0x0088
        L_0x007e:
            java.lang.String[] r1 = g6.C0978k.EMPTY_STRINGS     // Catch:{ all -> 0x007c }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x007c }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x007c }
            monitor-exit(r4)     // Catch:{ all -> 0x007c }
            return r0
        L_0x0088:
            monitor-exit(r4)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.Q0.getEnabledProtocols():java.lang.String[]");
    }

    public String getHandshakeApplicationProtocol() {
        return this.applicationProtocol;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized javax.net.ssl.SSLSession getHandshakeSession() {
        /*
            r2 = this;
            monitor-enter(r2)
            int[] r0 = b6.I0.$SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState     // Catch:{ all -> 0x0015 }
            b6.L0 r1 = r2.handshakeState     // Catch:{ all -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0015 }
            r0 = r0[r1]     // Catch:{ all -> 0x0015 }
            r1 = 1
            if (r0 == r1) goto L_0x0017
            r1 = 2
            if (r0 == r1) goto L_0x0017
            b6.Y r0 = r2.session     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)
            return r0
        L_0x0015:
            r0 = move-exception
            goto L_0x001a
        L_0x0017:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.Q0.getHandshakeSession():javax.net.ssl.SSLSession");
    }

    public final synchronized SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        if (!needPendingStatus()) {
            return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        } else if (this.needTask) {
            return SSLEngineResult.HandshakeStatus.NEED_TASK;
        } else {
            return pendingStatus(SSL.bioLengthNonApplication(this.networkBIO));
        }
    }

    public final boolean getNeedClientAuth() {
        if (this.clientAuth == C0561j.REQUIRE) {
            return true;
        }
        return false;
    }

    public final synchronized SSLParameters getSSLParameters() {
        SSLParameters sSLParameters;
        boolean z;
        try {
            sSLParameters = super.getSSLParameters();
            int javaVersion = Y.javaVersion();
            if (javaVersion >= 7) {
                sSLParameters.setEndpointIdentificationAlgorithm(this.endPointIdentificationAlgorithm);
                r.setAlgorithmConstraints(sSLParameters, this.algorithmConstraints);
                if (javaVersion >= 8) {
                    List<String> list = this.sniHostNames;
                    if (list != null) {
                        C0581t.setSniHostNames(sSLParameters, list);
                    }
                    if (!isDestroyed()) {
                        if ((SSL.getOptions(this.ssl) & SSL.SSL_OP_CIPHER_SERVER_PREFERENCE) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C0581t.setUseCipherSuitesOrder(sSLParameters, z);
                    }
                    C0581t.setSNIMatchers(sSLParameters, this.matchers);
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return sSLParameters;
    }

    public final SSLSession getSession() {
        return this.session;
    }

    public final String[] getSupportedCipherSuites() {
        return (String[]) F.AVAILABLE_CIPHER_SUITES.toArray(C0978k.EMPTY_STRINGS);
    }

    public final String[] getSupportedProtocols() {
        return (String[]) F.SUPPORTED_PROTOCOLS_SET.toArray(C0978k.EMPTY_STRINGS);
    }

    public final boolean getUseClientMode() {
        return this.clientMode;
    }

    public final boolean getWantClientAuth() {
        if (this.clientAuth == C0561j.OPTIONAL) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isInboundDone() {
        return this.isInboundDone;
    }

    public final synchronized boolean isOutboundDone() {
        boolean z;
        if (this.outboundClosed) {
            long j7 = this.networkBIO;
            if (j7 == 0 || SSL.bioLengthNonApplication(j7) == 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final int maxEncryptedPacketLength0() {
        return this.maxWrapOverhead + MAX_PLAINTEXT_LENGTH;
    }

    public final int refCnt() {
        return this.refCnt.refCnt();
    }

    public final boolean release() {
        return this.refCnt.release();
    }

    public final void setEnableSessionCreation(boolean z) {
        if (z) {
            throw new UnsupportedOperationException();
        }
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        B.checkNotNull(strArr, "cipherSuites");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        C0555h.convertToCipherStrings(Arrays.asList(strArr), sb, sb2, F.isBoringSSL());
        String sb3 = sb.toString();
        String sb4 = sb2.toString();
        if (F.isTlsv13Supported() || sb4.isEmpty()) {
            synchronized (this) {
                try {
                    if (!isDestroyed()) {
                        SSL.setCipherSuites(this.ssl, sb3, false);
                        if (F.isTlsv13Supported()) {
                            SSL.setCipherSuites(this.ssl, F.checkTls13Ciphers(logger, sb4), true);
                        }
                        HashSet hashSet = new HashSet(this.explicitlyEnabledProtocols.length);
                        Collections.addAll(hashSet, this.explicitlyEnabledProtocols);
                        if (sb3.isEmpty()) {
                            hashSet.remove("TLSv1");
                            hashSet.remove("TLSv1.1");
                            hashSet.remove("TLSv1.2");
                            hashSet.remove("SSLv3");
                            hashSet.remove("SSLv2");
                            hashSet.remove("SSLv2Hello");
                        }
                        if (sb4.isEmpty()) {
                            hashSet.remove("TLSv1.3");
                        }
                        setEnabledProtocols0((String[]) hashSet.toArray(C0978k.EMPTY_STRINGS), false);
                    } else {
                        throw new IllegalStateException("failed to enable cipher suites: " + sb3);
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("failed to enable cipher suites: " + sb3, e);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("TLSv1.3 is not supported by this java version.");
    }

    public final void setEnabledProtocols(String[] strArr) {
        setEnabledProtocols0(strArr, true);
    }

    public final void setNeedClientAuth(boolean z) {
        C0561j jVar;
        if (z) {
            jVar = C0561j.REQUIRE;
        } else {
            jVar = C0561j.NONE;
        }
        setClientAuth(jVar);
    }

    public final synchronized void setSSLParameters(SSLParameters sSLParameters) {
        try {
            int javaVersion = Y.javaVersion();
            if (javaVersion >= 7) {
                if (sSLParameters.getAlgorithmConstraints() == null) {
                    boolean isDestroyed = isDestroyed();
                    if (javaVersion >= 8) {
                        if (!isDestroyed) {
                            if (this.clientMode) {
                                List<String> sniHostNames2 = C0581t.getSniHostNames(sSLParameters);
                                for (String tlsExtHostName : sniHostNames2) {
                                    SSL.setTlsExtHostName(this.ssl, tlsExtHostName);
                                }
                                this.sniHostNames = sniHostNames2;
                            }
                            if (C0581t.getUseCipherSuitesOrder(sSLParameters)) {
                                SSL.setOptions(this.ssl, SSL.SSL_OP_CIPHER_SERVER_PREFERENCE);
                            } else {
                                SSL.clearOptions(this.ssl, SSL.SSL_OP_CIPHER_SERVER_PREFERENCE);
                            }
                        }
                        this.matchers = sSLParameters.getSNIMatchers();
                    }
                    String i = sSLParameters.getEndpointIdentificationAlgorithm();
                    if (!isDestroyed && this.clientMode && isEndPointVerificationEnabled(i)) {
                        SSL.setVerify(this.ssl, 2, -1);
                    }
                    this.endPointIdentificationAlgorithm = i;
                    this.algorithmConstraints = sSLParameters.getAlgorithmConstraints();
                } else {
                    throw new IllegalArgumentException("AlgorithmConstraints are not supported.");
                }
            }
            super.setSSLParameters(sSLParameters);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void setUseClientMode(boolean z) {
        if (z != this.clientMode) {
            throw new UnsupportedOperationException();
        }
    }

    public final void setWantClientAuth(boolean z) {
        C0561j jVar;
        if (z) {
            jVar = C0561j.OPTIONAL;
        } else {
            jVar = C0561j.NONE;
        }
        setClientAuth(jVar);
    }

    public final synchronized void shutdown() {
        try {
            if (!this.destroyed) {
                this.destroyed = true;
                S s8 = this.engineMap;
                if (s8 != null) {
                    ((E0) s8).remove(this.ssl);
                }
                SSL.freeSSL(this.ssl);
                this.networkBIO = 0;
                this.ssl = 0;
                this.outboundClosed = true;
                this.isInboundDone = true;
            }
            SSL.clearError();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized int sslPending() {
        return sslPending0();
    }

    public final synchronized long sslPointer() {
        return this.ssl;
    }

    public final J touch(Object obj) {
        this.refCnt.touch(obj);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x017e, code lost:
        if (r13 != null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01b3, code lost:
        if (r10 <= 0) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01b5, code lost:
        r0 = newResult(javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW, r17, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01c1, code lost:
        r6 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01c7, code lost:
        if (isInboundDone() == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01c9, code lost:
        r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01cc, code lost:
        r0 = javax.net.ssl.SSLEngineResult.Status.OK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ce, code lost:
        r0 = newResultMayFinishHandshake(r0, r6, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d2, code lost:
        if (r13 == null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        io.netty.internal.tcnative.SSL.bioClearByteBuffer(r1.networkBIO);
        rejectRemoteInitiatedRenegotiation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01e0, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01f2, code lost:
        if (r13 == null) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01f5, code lost:
        r6 = r17;
        r7 = io.netty.internal.tcnative.SSL.getError(r1.ssl, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01ff, code lost:
        if (r7 == io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_READ) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0203, code lost:
        if (r7 != io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_WRITE) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0209, code lost:
        if (r7 != io.netty.internal.tcnative.SSL.SSL_ERROR_ZERO_RETURN) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x020d, code lost:
        if (r1.receivedShutdown != false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x020f, code lost:
        closeAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0216, code lost:
        if (isInboundDone() == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0218, code lost:
        r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x021b, code lost:
        r0 = javax.net.ssl.SSLEngineResult.Status.OK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x021d, code lost:
        r0 = newResultMayFinishHandshake(r0, r6, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0221, code lost:
        if (r13 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        io.netty.internal.tcnative.SSL.bioClearByteBuffer(r1.networkBIO);
        rejectRemoteInitiatedRenegotiation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x022f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0232, code lost:
        if (r7 == io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_X509_LOOKUP) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0236, code lost:
        if (r7 == io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x023a, code lost:
        if (r7 != io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x023d, code lost:
        r0 = sslReadErrorResult(r7, io.netty.internal.tcnative.SSL.getLastErrorNumber(), r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0245, code lost:
        if (r13 == null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        io.netty.internal.tcnative.SSL.bioClearByteBuffer(r1.networkBIO);
        rejectRemoteInitiatedRenegotiation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0253, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0258, code lost:
        if (isInboundDone() == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x025a, code lost:
        r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x025d, code lost:
        r0 = javax.net.ssl.SSLEngineResult.Status.OK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x025f, code lost:
        r0 = newResult(r0, javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0265, code lost:
        if (r13 == null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        io.netty.internal.tcnative.SSL.bioClearByteBuffer(r1.networkBIO);
        rejectRemoteInitiatedRenegotiation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0273, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0274, code lost:
        r2 = r2 + 1;
        r7 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0278, code lost:
        if (r2 < r7) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x027a, code lost:
        if (r13 == null) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x02ab, code lost:
        if (r13 == null) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        r13.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x02b0, code lost:
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x016a A[Catch:{ all -> 0x01be, all -> 0x0167, all -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x02a0 A[Catch:{ all -> 0x01be, all -> 0x0167, all -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x02a3 A[Catch:{ all -> 0x01be, all -> 0x0167, all -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0157 A[Catch:{ all -> 0x01be, all -> 0x0167, all -> 0x007b }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:169:0x0226=Splitter:B:169:0x0226, B:136:0x01d7=Splitter:B:136:0x01d7, B:185:0x024a=Splitter:B:185:0x024a, B:198:0x026a=Splitter:B:198:0x026a, B:229:0x02bf=Splitter:B:229:0x02bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer[] r19, int r20, int r21, java.nio.ByteBuffer[] r22, int r23, int r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            java.lang.String r7 = "srcs"
            g6.B.checkNotNullWithIAE(r0, r7)
            int r7 = r0.length
            if (r2 >= r7) goto L_0x0309
            int r7 = r2 + r3
            int r8 = r0.length
            if (r7 > r8) goto L_0x0309
            java.lang.String r3 = "dsts"
            g6.B.checkNotNullWithIAE(r4, r3)
            int r3 = r4.length
            if (r5 >= r3) goto L_0x02f2
            int r3 = r5 + r6
            int r8 = r4.length
            if (r3 > r8) goto L_0x02f2
            r6 = r5
            r10 = 0
        L_0x002b:
            if (r6 >= r3) goto L_0x004c
            r12 = r4[r6]
            java.lang.String r13 = "dsts"
            java.lang.Object r12 = g6.B.checkNotNullArrayParam(r12, r6, r13)
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12
            boolean r13 = r12.isReadOnly()
            if (r13 != 0) goto L_0x0046
            int r12 = r12.remaining()
            long r12 = (long) r12
            long r10 = r10 + r12
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0046:
            java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
            r0.<init>()
            throw r0
        L_0x004c:
            r6 = r2
            r12 = 0
        L_0x004f:
            if (r6 >= r7) goto L_0x0064
            r14 = r0[r6]
            java.lang.String r15 = "srcs"
            java.lang.Object r14 = g6.B.checkNotNullArrayParam(r14, r6, r15)
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14
            int r14 = r14.remaining()
            long r14 = (long) r14
            long r12 = r12 + r14
            int r6 = r6 + 1
            goto L_0x004f
        L_0x0064:
            monitor-enter(r18)
            boolean r6 = r18.isInboundDone()     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x0082
            boolean r0 = r18.isOutboundDone()     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x007e
            boolean r0 = r18.isDestroyed()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0078
            goto L_0x007e
        L_0x0078:
            javax.net.ssl.SSLEngineResult r0 = NEED_WRAP_CLOSED     // Catch:{ all -> 0x007b }
            goto L_0x0080
        L_0x007b:
            r0 = move-exception
            goto L_0x02f0
        L_0x007e:
            javax.net.ssl.SSLEngineResult r0 = CLOSED_NOT_HANDSHAKING     // Catch:{ all -> 0x007b }
        L_0x0080:
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x0082:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x007b }
            b6.L0 r14 = r1.handshakeState     // Catch:{ all -> 0x007b }
            b6.L0 r15 = b6.L0.FINISHED     // Catch:{ all -> 0x007b }
            r8 = 0
            if (r14 == r15) goto L_0x00b1
            b6.L0 r6 = b6.L0.STARTED_EXPLICITLY     // Catch:{ all -> 0x007b }
            if (r14 == r6) goto L_0x0093
            b6.L0 r6 = b6.L0.STARTED_IMPLICITLY     // Catch:{ all -> 0x007b }
            r1.handshakeState = r6     // Catch:{ all -> 0x007b }
        L_0x0093:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = r18.handshake()     // Catch:{ all -> 0x007b }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ all -> 0x007b }
            if (r6 != r9) goto L_0x00a1
            javax.net.ssl.SSLEngineResult r0 = r1.newResult(r6, r8, r8)     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x00a1:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x007b }
            if (r6 != r9) goto L_0x00a9
            javax.net.ssl.SSLEngineResult r0 = NEED_WRAP_OK     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x00a9:
            boolean r9 = r1.isInboundDone     // Catch:{ all -> 0x007b }
            if (r9 == 0) goto L_0x00b1
            javax.net.ssl.SSLEngineResult r0 = NEED_WRAP_CLOSED     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x00b1:
            int r9 = r18.sslPending0()     // Catch:{ all -> 0x007b }
            boolean r8 = r1.jdkCompatibilityMode     // Catch:{ all -> 0x007b }
            if (r8 != 0) goto L_0x00e7
            if (r14 == r15) goto L_0x00bc
            goto L_0x00e7
        L_0x00bc:
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x00cd
            if (r9 > 0) goto L_0x00cd
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ all -> 0x007b }
            r2 = 0
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r2, r2)     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x00cd:
            r14 = 0
            int r8 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x00dc
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x007b }
            r2 = 0
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r2, r2)     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x00dc:
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r10 = java.lang.Math.min(r10, r12)     // Catch:{ all -> 0x007b }
            int r8 = (int) r10     // Catch:{ all -> 0x007b }
            r15 = r3
        L_0x00e5:
            r2 = 0
            goto L_0x014a
        L_0x00e7:
            r14 = 5
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x00f6
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ all -> 0x007b }
            r2 = 0
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r2, r2)     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x00f6:
            int r8 = b6.H1.getEncryptedPacketLength((java.nio.ByteBuffer[]) r19, (int) r20)     // Catch:{ all -> 0x007b }
            r14 = -2
            if (r8 == r14) goto L_0x02e8
            int r14 = r8 + -5
            r15 = r3
            long r2 = (long) r14     // Catch:{ all -> 0x007b }
            int r16 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x013c
            int r0 = MAX_RECORD_SIZE     // Catch:{ all -> 0x007b }
            if (r14 > r0) goto L_0x0117
            b6.Y r0 = r1.session     // Catch:{ all -> 0x007b }
            r0.tryExpandApplicationBufferSize(r14)     // Catch:{ all -> 0x007b }
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x007b }
            r2 = 0
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r2, r2)     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x0117:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x007b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r2.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "Illegal packet length: "
            r2.append(r3)     // Catch:{ all -> 0x007b }
            r2.append(r14)     // Catch:{ all -> 0x007b }
            java.lang.String r3 = " > "
            r2.append(r3)     // Catch:{ all -> 0x007b }
            b6.Y r3 = r1.session     // Catch:{ all -> 0x007b }
            int r3 = r3.getApplicationBufferSize()     // Catch:{ all -> 0x007b }
            r2.append(r3)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007b }
            r0.<init>(r2)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x013c:
            long r2 = (long) r8     // Catch:{ all -> 0x007b }
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x00e5
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ all -> 0x007b }
            r2 = 0
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r2, r2)     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x014a:
            r2 = r20
            r10 = r9
            r3 = 0
            r9 = 0
        L_0x014f:
            r11 = r0[r2]     // Catch:{ all -> 0x0167 }
            int r12 = r11.remaining()     // Catch:{ all -> 0x0167 }
            if (r12 != 0) goto L_0x016a
            if (r10 > 0) goto L_0x015f
            int r2 = r2 + 1
            if (r2 < r7) goto L_0x014f
            goto L_0x027e
        L_0x015f:
            long r12 = r1.networkBIO     // Catch:{ all -> 0x0167 }
            int r12 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r12)     // Catch:{ all -> 0x0167 }
            r13 = 0
            goto L_0x0172
        L_0x0167:
            r0 = move-exception
            goto L_0x02df
        L_0x016a:
            int r12 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x0167 }
            S5.n r13 = r1.writeEncryptedData(r11, r12)     // Catch:{ SSLException -> 0x02cf }
        L_0x0172:
            r14 = r4[r5]     // Catch:{ all -> 0x01be }
            boolean r16 = r14.hasRemaining()     // Catch:{ all -> 0x01be }
            if (r16 != 0) goto L_0x0185
            int r5 = r5 + 1
            if (r5 < r15) goto L_0x0172
            if (r13 == 0) goto L_0x027e
        L_0x0180:
            r13.release()     // Catch:{ all -> 0x0167 }
            goto L_0x027e
        L_0x0185:
            r20 = r10
            int r10 = r1.readPlaintextData(r14)     // Catch:{ SSLException -> 0x02b4 }
            r17 = r6
            r16 = r7
            long r6 = r1.networkBIO     // Catch:{ all -> 0x01be }
            int r6 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r6)     // Catch:{ all -> 0x01be }
            int r6 = r12 - r6
            int r3 = r3 + r6
            int r8 = r8 - r6
            int r12 = r12 - r6
            int r7 = r11.position()     // Catch:{ all -> 0x01be }
            int r7 = r7 + r6
            r11.position(r7)     // Catch:{ all -> 0x01be }
            if (r10 <= 0) goto L_0x01f5
            int r9 = r9 + r10
            boolean r6 = r14.hasRemaining()     // Catch:{ all -> 0x01be }
            if (r6 != 0) goto L_0x01e4
            int r10 = r18.sslPending0()     // Catch:{ all -> 0x01be }
            int r5 = r5 + 1
            if (r5 < r15) goto L_0x01e1
            if (r10 <= 0) goto L_0x01c1
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x01be }
            r6 = r17
            javax.net.ssl.SSLEngineResult r0 = r1.newResult(r0, r6, r3, r9)     // Catch:{ all -> 0x01be }
            goto L_0x01d2
        L_0x01be:
            r0 = move-exception
            goto L_0x02c9
        L_0x01c1:
            r6 = r17
            boolean r0 = r18.isInboundDone()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x01cc
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x01be }
            goto L_0x01ce
        L_0x01cc:
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ all -> 0x01be }
        L_0x01ce:
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r3, r9)     // Catch:{ all -> 0x01be }
        L_0x01d2:
            if (r13 == 0) goto L_0x01d7
            r13.release()     // Catch:{ all -> 0x0167 }
        L_0x01d7:
            long r2 = r1.networkBIO     // Catch:{ all -> 0x007b }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch:{ all -> 0x007b }
            r18.rejectRemoteInitiatedRenegotiation()     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x01e1:
            r6 = r17
            goto L_0x01ef
        L_0x01e4:
            r6 = r17
            if (r8 == 0) goto L_0x01f2
            boolean r7 = r1.jdkCompatibilityMode     // Catch:{ all -> 0x01be }
            if (r7 == 0) goto L_0x01ed
            goto L_0x01f2
        L_0x01ed:
            r10 = r20
        L_0x01ef:
            r7 = r16
            goto L_0x0172
        L_0x01f2:
            if (r13 == 0) goto L_0x027e
            goto L_0x0180
        L_0x01f5:
            r6 = r17
            long r11 = r1.ssl     // Catch:{ all -> 0x01be }
            int r7 = io.netty.internal.tcnative.SSL.getError(r11, r10)     // Catch:{ all -> 0x01be }
            int r10 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_READ     // Catch:{ all -> 0x01be }
            if (r7 == r10) goto L_0x0274
            int r10 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_WRITE     // Catch:{ all -> 0x01be }
            if (r7 != r10) goto L_0x0207
            goto L_0x0274
        L_0x0207:
            int r0 = io.netty.internal.tcnative.SSL.SSL_ERROR_ZERO_RETURN     // Catch:{ all -> 0x01be }
            if (r7 != r0) goto L_0x0230
            boolean r0 = r1.receivedShutdown     // Catch:{ all -> 0x01be }
            if (r0 != 0) goto L_0x0212
            r18.closeAll()     // Catch:{ all -> 0x01be }
        L_0x0212:
            boolean r0 = r18.isInboundDone()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x021b
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x01be }
            goto L_0x021d
        L_0x021b:
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ all -> 0x01be }
        L_0x021d:
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r3, r9)     // Catch:{ all -> 0x01be }
            if (r13 == 0) goto L_0x0226
            r13.release()     // Catch:{ all -> 0x0167 }
        L_0x0226:
            long r2 = r1.networkBIO     // Catch:{ all -> 0x007b }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch:{ all -> 0x007b }
            r18.rejectRemoteInitiatedRenegotiation()     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x0230:
            int r0 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_X509_LOOKUP     // Catch:{ all -> 0x01be }
            if (r7 == r0) goto L_0x0254
            int r0 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY     // Catch:{ all -> 0x01be }
            if (r7 == r0) goto L_0x0254
            int r0 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION     // Catch:{ all -> 0x01be }
            if (r7 != r0) goto L_0x023d
            goto L_0x0254
        L_0x023d:
            int r0 = io.netty.internal.tcnative.SSL.getLastErrorNumber()     // Catch:{ all -> 0x01be }
            javax.net.ssl.SSLEngineResult r0 = r1.sslReadErrorResult(r7, r0, r3, r9)     // Catch:{ all -> 0x01be }
            if (r13 == 0) goto L_0x024a
            r13.release()     // Catch:{ all -> 0x0167 }
        L_0x024a:
            long r2 = r1.networkBIO     // Catch:{ all -> 0x007b }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch:{ all -> 0x007b }
            r18.rejectRemoteInitiatedRenegotiation()     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x0254:
            boolean r0 = r18.isInboundDone()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x025d
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x01be }
            goto L_0x025f
        L_0x025d:
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ all -> 0x01be }
        L_0x025f:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ all -> 0x01be }
            javax.net.ssl.SSLEngineResult r0 = r1.newResult(r0, r2, r3, r9)     // Catch:{ all -> 0x01be }
            if (r13 == 0) goto L_0x026a
            r13.release()     // Catch:{ all -> 0x0167 }
        L_0x026a:
            long r2 = r1.networkBIO     // Catch:{ all -> 0x007b }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch:{ all -> 0x007b }
            r18.rejectRemoteInitiatedRenegotiation()     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x0274:
            int r2 = r2 + 1
            r7 = r16
            if (r2 < r7) goto L_0x02ab
            if (r13 == 0) goto L_0x027e
            goto L_0x0180
        L_0x027e:
            long r4 = r1.networkBIO     // Catch:{ all -> 0x007b }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r4)     // Catch:{ all -> 0x007b }
            r18.rejectRemoteInitiatedRenegotiation()     // Catch:{ all -> 0x007b }
            boolean r0 = r1.receivedShutdown     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x029a
            long r4 = r1.ssl     // Catch:{ all -> 0x007b }
            int r0 = io.netty.internal.tcnative.SSL.getShutdown(r4)     // Catch:{ all -> 0x007b }
            int r2 = io.netty.internal.tcnative.SSL.SSL_RECEIVED_SHUTDOWN     // Catch:{ all -> 0x007b }
            r0 = r0 & r2
            int r2 = io.netty.internal.tcnative.SSL.SSL_RECEIVED_SHUTDOWN     // Catch:{ all -> 0x007b }
            if (r0 != r2) goto L_0x029a
            r18.closeAll()     // Catch:{ all -> 0x007b }
        L_0x029a:
            boolean r0 = r18.isInboundDone()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x02a3
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x007b }
            goto L_0x02a5
        L_0x02a3:
            javax.net.ssl.SSLEngineResult$Status r0 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ all -> 0x007b }
        L_0x02a5:
            javax.net.ssl.SSLEngineResult r0 = r1.newResultMayFinishHandshake(r0, r6, r3, r9)     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x02ab:
            if (r13 == 0) goto L_0x02b0
            r13.release()     // Catch:{ all -> 0x0167 }
        L_0x02b0:
            r10 = r20
            goto L_0x014f
        L_0x02b4:
            r0 = move-exception
            r2 = r0
            javax.net.ssl.SSLEngineResult r0 = r1.handleUnwrapException(r3, r9, r2)     // Catch:{ all -> 0x01be }
            if (r13 == 0) goto L_0x02bf
            r13.release()     // Catch:{ all -> 0x0167 }
        L_0x02bf:
            long r2 = r1.networkBIO     // Catch:{ all -> 0x007b }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch:{ all -> 0x007b }
            r18.rejectRemoteInitiatedRenegotiation()     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x02c9:
            if (r13 == 0) goto L_0x02ce
            r13.release()     // Catch:{ all -> 0x0167 }
        L_0x02ce:
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x02cf:
            r0 = move-exception
            r2 = r0
            javax.net.ssl.SSLEngineResult r0 = r1.handleUnwrapException(r3, r9, r2)     // Catch:{ all -> 0x0167 }
            long r2 = r1.networkBIO     // Catch:{ all -> 0x007b }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch:{ all -> 0x007b }
            r18.rejectRemoteInitiatedRenegotiation()     // Catch:{ all -> 0x007b }
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            return r0
        L_0x02df:
            long r2 = r1.networkBIO     // Catch:{ all -> 0x007b }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch:{ all -> 0x007b }
            r18.rejectRemoteInitiatedRenegotiation()     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x02e8:
            b6.E r0 = new b6.E     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "not an SSL/TLS record"
            r0.<init>(r2)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x02f0:
            monitor-exit(r18)     // Catch:{ all -> 0x007b }
            throw r0
        L_0x02f2:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "offset: "
            java.lang.String r3 = ", length: "
            java.lang.String r7 = " (expected: offset <= offset + length <= dsts.length ("
            java.lang.StringBuilder r2 = u.C1477r.e(r2, r5, r3, r6, r7)
            int r3 = r4.length
            java.lang.String r4 = "))"
            java.lang.String r2 = N.e.z(r2, r3, r4)
            r0.<init>(r2)
            throw r0
        L_0x0309:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "offset: "
            java.lang.String r5 = ", length: "
            java.lang.String r6 = " (expected: offset <= offset + length <= srcs.length ("
            r7 = r20
            java.lang.StringBuilder r3 = u.C1477r.e(r4, r7, r5, r3, r6)
            int r0 = r0.length
            java.lang.String r4 = "))"
            java.lang.String r0 = N.e.z(r3, r0, r4)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.Q0.unwrap(java.nio.ByteBuffer[], int, int, java.nio.ByteBuffer[], int, int):javax.net.ssl.SSLEngineResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0186, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b3, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e7, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0224, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0253, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0281, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02f4, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0320, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0374, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03bb, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0414, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x043a, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0464, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0490, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x04b6, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x04f0, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0514, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e2, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0112, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013f, code lost:
        return r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0527 A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0536 A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:342:0x0520=Splitter:B:342:0x0520, B:147:0x0234=Splitter:B:147:0x0234} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r12, int r13, int r14, java.nio.ByteBuffer r15) {
        /*
            r11 = this;
            java.lang.String r0 = "srcs"
            g6.B.checkNotNullWithIAE(r12, r0)
            java.lang.String r0 = "dst"
            g6.B.checkNotNullWithIAE(r15, r0)
            int r0 = r12.length
            if (r13 >= r0) goto L_0x0547
            int r0 = r13 + r14
            int r1 = r12.length
            if (r0 > r1) goto L_0x0547
            boolean r14 = r15.isReadOnly()
            if (r14 != 0) goto L_0x0541
            monitor-enter(r11)
            boolean r14 = r11.isOutboundDone()     // Catch:{ all -> 0x002f }
            if (r14 == 0) goto L_0x0036
            boolean r12 = r11.isInboundDone()     // Catch:{ all -> 0x002f }
            if (r12 != 0) goto L_0x0032
            boolean r12 = r11.isDestroyed()     // Catch:{ all -> 0x002f }
            if (r12 == 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            javax.net.ssl.SSLEngineResult r12 = NEED_UNWRAP_CLOSED     // Catch:{ all -> 0x002f }
            goto L_0x0034
        L_0x002f:
            r12 = move-exception
            goto L_0x053f
        L_0x0032:
            javax.net.ssl.SSLEngineResult r12 = CLOSED_NOT_HANDSHAKING     // Catch:{ all -> 0x002f }
        L_0x0034:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0036:
            r14 = 0
            r1 = 0
            boolean r2 = r15.isDirect()     // Catch:{ all -> 0x0054 }
            if (r2 == 0) goto L_0x0057
            long r3 = r11.networkBIO     // Catch:{ all -> 0x0054 }
            long r5 = bufferAddress(r15)     // Catch:{ all -> 0x0054 }
            int r2 = r15.position()     // Catch:{ all -> 0x0054 }
            long r7 = (long) r2     // Catch:{ all -> 0x0054 }
            long r5 = r5 + r7
            int r7 = r15.remaining()     // Catch:{ all -> 0x0054 }
            r8 = 1
            io.netty.internal.tcnative.SSL.bioSetByteBuffer(r3, r5, r7, r8)     // Catch:{ all -> 0x0054 }
            r2 = r14
            goto L_0x0071
        L_0x0054:
            r12 = move-exception
            goto L_0x0520
        L_0x0057:
            S5.o r2 = r11.alloc     // Catch:{ all -> 0x0054 }
            int r3 = r15.remaining()     // Catch:{ all -> 0x0054 }
            S5.c r2 = (S5.C0163c) r2     // Catch:{ all -> 0x0054 }
            S5.n r2 = r2.directBuffer(r3)     // Catch:{ all -> 0x0054 }
            long r3 = r11.networkBIO     // Catch:{ all -> 0x00b1 }
            long r5 = b6.F.memoryAddress(r2)     // Catch:{ all -> 0x00b1 }
            int r7 = r2.writableBytes()     // Catch:{ all -> 0x00b1 }
            r8 = 1
            io.netty.internal.tcnative.SSL.bioSetByteBuffer(r3, r5, r7, r8)     // Catch:{ all -> 0x00b1 }
        L_0x0071:
            long r3 = r11.networkBIO     // Catch:{ all -> 0x00b1 }
            int r3 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r3)     // Catch:{ all -> 0x00b1 }
            boolean r4 = r11.outboundClosed     // Catch:{ all -> 0x00b1 }
            r5 = 1
            if (r4 == 0) goto L_0x0145
            int r12 = r15.remaining()     // Catch:{ all -> 0x00b1 }
            r13 = 2
            boolean r12 = r11.isBytesAvailableEnoughForWrap(r12, r13, r5)     // Catch:{ all -> 0x00b1 }
            if (r12 != 0) goto L_0x00b5
            javax.net.ssl.SSLEngineResult r12 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x00b1 }
            javax.net.ssl.SSLEngineResult$Status r13 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x00b1 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r14 = r11.getHandshakeStatus()     // Catch:{ all -> 0x00b1 }
            r12.<init>(r13, r14, r1, r1)     // Catch:{ all -> 0x00b1 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x00a1
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x00af
        L_0x00a1:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r1)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x00af:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x00b1:
            r12 = move-exception
        L_0x00b2:
            r14 = r2
            goto L_0x0520
        L_0x00b5:
            long r12 = r11.networkBIO     // Catch:{ all -> 0x00b1 }
            int r12 = io.netty.internal.tcnative.SSL.bioFlushByteBuffer(r12)     // Catch:{ all -> 0x00b1 }
            if (r12 > 0) goto L_0x00e7
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x00e3 }
            javax.net.ssl.SSLEngineResult r13 = r11.newResultMayFinishHandshake(r13, r1, r1)     // Catch:{ all -> 0x00e3 }
            long r0 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x00d3
            int r14 = r15.position()     // Catch:{ all -> 0x002f }
            int r14 = r14 + r12
            r15.position(r14)     // Catch:{ all -> 0x002f }
            goto L_0x00e1
        L_0x00d3:
            int r14 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r12 = r2.internalNioBuffer(r14, r12)     // Catch:{ all -> 0x002f }
            r15.put(r12)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x00e1:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r13
        L_0x00e3:
            r13 = move-exception
            r1 = r12
            r12 = r13
            goto L_0x00b2
        L_0x00e7:
            boolean r13 = r11.doSSLShutdown()     // Catch:{ all -> 0x00e3 }
            if (r13 != 0) goto L_0x0113
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x00e3 }
            javax.net.ssl.SSLEngineResult r13 = r11.newResultMayFinishHandshake(r13, r1, r12)     // Catch:{ all -> 0x00e3 }
            long r0 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0103
            int r14 = r15.position()     // Catch:{ all -> 0x002f }
            int r14 = r14 + r12
            r15.position(r14)     // Catch:{ all -> 0x002f }
            goto L_0x0111
        L_0x0103:
            int r14 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r12 = r2.internalNioBuffer(r14, r12)     // Catch:{ all -> 0x002f }
            r15.put(r12)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0111:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r13
        L_0x0113:
            long r13 = r11.networkBIO     // Catch:{ all -> 0x00e3 }
            int r12 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r13)     // Catch:{ all -> 0x00e3 }
            int r3 = r3 - r12
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x0140 }
            javax.net.ssl.SSLEngineResult r12 = r11.newResultMayFinishHandshake(r12, r1, r3)     // Catch:{ all -> 0x0140 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0130
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r3
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x013e
        L_0x0130:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r3)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x013e:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0140:
            r12 = move-exception
            r14 = r2
            r1 = r3
            goto L_0x0520
        L_0x0145:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x00b1 }
            b6.L0 r6 = r11.handshakeState     // Catch:{ all -> 0x00b1 }
            b6.L0 r7 = b6.L0.FINISHED     // Catch:{ all -> 0x00b1 }
            if (r6 == r7) goto L_0x0282
            b6.L0 r4 = b6.L0.STARTED_EXPLICITLY     // Catch:{ all -> 0x00b1 }
            if (r6 == r4) goto L_0x0155
            b6.L0 r4 = b6.L0.STARTED_IMPLICITLY     // Catch:{ all -> 0x00b1 }
            r11.handshakeState = r4     // Catch:{ all -> 0x00b1 }
        L_0x0155:
            long r8 = r11.networkBIO     // Catch:{ all -> 0x00b1 }
            int r4 = io.netty.internal.tcnative.SSL.bioFlushByteBuffer(r8)     // Catch:{ all -> 0x00b1 }
            java.lang.Throwable r8 = r11.pendingException     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x01b4
            if (r4 <= 0) goto L_0x018c
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r1, r4)     // Catch:{ all -> 0x0187 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0177
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r4
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x0185
        L_0x0177:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r4)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0185:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0187:
            r12 = move-exception
            r14 = r2
            r1 = r4
            goto L_0x0520
        L_0x018c:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = r11.handshakeException()     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r1, r1)     // Catch:{ all -> 0x0187 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x01a4
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r4
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x01b2
        L_0x01a4:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r4)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x01b2:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x01b4:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = r11.handshake()     // Catch:{ all -> 0x0187 }
            long r9 = r11.networkBIO     // Catch:{ all -> 0x0187 }
            int r4 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r9)     // Catch:{ all -> 0x0187 }
            int r4 = r3 - r4
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ all -> 0x0187 }
            if (r8 != r9) goto L_0x01e8
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r8, r1, r4)     // Catch:{ all -> 0x0187 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x01d8
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r4
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x01e6
        L_0x01d8:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r4)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x01e6:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x01e8:
            if (r4 <= 0) goto L_0x0225
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x0187 }
            if (r8 == r12) goto L_0x01fd
            if (r4 != r3) goto L_0x01f3
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x0187 }
            goto L_0x01fd
        L_0x01f3:
            long r12 = r11.networkBIO     // Catch:{ all -> 0x0187 }
            int r12 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r12)     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = r11.getHandshakeStatus(r12)     // Catch:{ all -> 0x0187 }
        L_0x01fd:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = r11.mayFinishHandshake(r12)     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r1, r4)     // Catch:{ all -> 0x0187 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0215
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r4
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x0223
        L_0x0215:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r4)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0223:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0225:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ all -> 0x0187 }
            if (r8 != r9) goto L_0x0254
            boolean r12 = r11.isOutboundDone()     // Catch:{ all -> 0x0187 }
            if (r12 == 0) goto L_0x0232
            javax.net.ssl.SSLEngineResult r12 = NEED_UNWRAP_CLOSED     // Catch:{ all -> 0x0187 }
            goto L_0x0234
        L_0x0232:
            javax.net.ssl.SSLEngineResult r12 = NEED_UNWRAP_OK     // Catch:{ all -> 0x0187 }
        L_0x0234:
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0244
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r4
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x0252
        L_0x0244:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r4)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0252:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0254:
            boolean r9 = r11.outboundClosed     // Catch:{ all -> 0x0187 }
            if (r9 == 0) goto L_0x0284
            long r12 = r11.networkBIO     // Catch:{ all -> 0x0187 }
            int r12 = io.netty.internal.tcnative.SSL.bioFlushByteBuffer(r12)     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLEngineResult r13 = r11.newResultMayFinishHandshake(r8, r1, r12)     // Catch:{ all -> 0x00e3 }
            long r0 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0272
            int r14 = r15.position()     // Catch:{ all -> 0x002f }
            int r14 = r14 + r12
            r15.position(r14)     // Catch:{ all -> 0x002f }
            goto L_0x0280
        L_0x0272:
            int r14 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r12 = r2.internalNioBuffer(r14, r12)     // Catch:{ all -> 0x002f }
            r15.put(r12)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0280:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r13
        L_0x0282:
            r8 = r4
            r4 = 0
        L_0x0284:
            boolean r9 = r11.jdkCompatibilityMode     // Catch:{ all -> 0x0187 }
            if (r9 != 0) goto L_0x028a
            if (r6 == r7) goto L_0x02f5
        L_0x028a:
            r6 = r13
            r7 = 0
        L_0x028c:
            if (r6 >= r0) goto L_0x02c0
            r9 = r12[r6]     // Catch:{ all -> 0x0187 }
            if (r9 == 0) goto L_0x02a4
            int r10 = MAX_PLAINTEXT_LENGTH     // Catch:{ all -> 0x0187 }
            if (r7 != r10) goto L_0x0297
            goto L_0x02a1
        L_0x0297:
            int r9 = r9.remaining()     // Catch:{ all -> 0x0187 }
            int r7 = r7 + r9
            if (r7 > r10) goto L_0x02a0
            if (r7 >= 0) goto L_0x02a1
        L_0x02a0:
            r7 = r10
        L_0x02a1:
            int r6 = r6 + 1
            goto L_0x028c
        L_0x02a4:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r13.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r14 = "srcs["
            r13.append(r14)     // Catch:{ all -> 0x0187 }
            r13.append(r6)     // Catch:{ all -> 0x0187 }
            java.lang.String r14 = "] is null"
            r13.append(r14)     // Catch:{ all -> 0x0187 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0187 }
            r12.<init>(r13)     // Catch:{ all -> 0x0187 }
            throw r12     // Catch:{ all -> 0x0187 }
        L_0x02c0:
            int r6 = r15.remaining()     // Catch:{ all -> 0x0187 }
            boolean r5 = r11.isBytesAvailableEnoughForWrap(r6, r7, r5)     // Catch:{ all -> 0x0187 }
            if (r5 != 0) goto L_0x02f5
            javax.net.ssl.SSLEngineResult r12 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLEngineResult$Status r13 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r14 = r11.getHandshakeStatus()     // Catch:{ all -> 0x0187 }
            r12.<init>(r13, r14, r1, r1)     // Catch:{ all -> 0x0187 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x02e5
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r4
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x02f3
        L_0x02e5:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r4)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x02f3:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x02f5:
            long r5 = r11.networkBIO     // Catch:{ all -> 0x0187 }
            int r4 = io.netty.internal.tcnative.SSL.bioFlushByteBuffer(r5)     // Catch:{ all -> 0x0187 }
            if (r4 <= 0) goto L_0x0321
            javax.net.ssl.SSLEngineResult r12 = r11.newResultMayFinishHandshake(r8, r1, r4)     // Catch:{ all -> 0x0187 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0311
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r4
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x031f
        L_0x0311:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r4)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x031f:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0321:
            java.lang.Throwable r5 = r11.pendingException     // Catch:{ all -> 0x0187 }
            if (r5 != 0) goto L_0x0515
        L_0x0325:
            if (r13 >= r0) goto L_0x04f1
            r14 = r12[r13]     // Catch:{ all -> 0x0187 }
            int r5 = r14.remaining()     // Catch:{ all -> 0x0187 }
            if (r5 != 0) goto L_0x0330
            goto L_0x0395
        L_0x0330:
            boolean r6 = r11.jdkCompatibilityMode     // Catch:{ all -> 0x0187 }
            if (r6 == 0) goto L_0x0340
            int r6 = MAX_PLAINTEXT_LENGTH     // Catch:{ all -> 0x0187 }
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)     // Catch:{ all -> 0x0187 }
            int r14 = r11.writePlaintextData(r14, r5)     // Catch:{ all -> 0x0187 }
            goto L_0x037d
        L_0x0340:
            int r6 = r15.remaining()     // Catch:{ all -> 0x0187 }
            int r6 = r6 - r4
            int r7 = r11.maxWrapOverhead     // Catch:{ all -> 0x0187 }
            int r6 = r6 - r7
            if (r6 > 0) goto L_0x0375
            javax.net.ssl.SSLEngineResult r12 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLEngineResult$Status r13 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r14 = r11.getHandshakeStatus()     // Catch:{ all -> 0x0187 }
            r12.<init>(r13, r14, r1, r4)     // Catch:{ all -> 0x0187 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0365
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r4
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x0373
        L_0x0365:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r4)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0373:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0375:
            int r5 = java.lang.Math.min(r5, r6)     // Catch:{ all -> 0x0187 }
            int r14 = r11.writePlaintextData(r14, r5)     // Catch:{ all -> 0x0187 }
        L_0x037d:
            long r5 = r11.networkBIO     // Catch:{ all -> 0x0187 }
            int r5 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r5)     // Catch:{ all -> 0x0187 }
            int r3 = r3 - r5
            int r3 = r3 + r4
            if (r14 <= 0) goto L_0x03bc
            int r1 = r1 + r14
            boolean r14 = r11.jdkCompatibilityMode     // Catch:{ all -> 0x0140 }
            if (r14 != 0) goto L_0x0398
            int r14 = r15.remaining()     // Catch:{ all -> 0x0140 }
            if (r3 != r14) goto L_0x0393
            goto L_0x0398
        L_0x0393:
            r4 = r3
            r3 = r5
        L_0x0395:
            int r13 = r13 + 1
            goto L_0x0325
        L_0x0398:
            javax.net.ssl.SSLEngineResult r12 = r11.newResultMayFinishHandshake(r8, r1, r3)     // Catch:{ all -> 0x0140 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x03ac
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r3
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x03ba
        L_0x03ac:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r3)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x03ba:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x03bc:
            long r12 = r11.ssl     // Catch:{ all -> 0x0140 }
            int r12 = io.netty.internal.tcnative.SSL.getError(r12, r14)     // Catch:{ all -> 0x0140 }
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_ZERO_RETURN     // Catch:{ all -> 0x0140 }
            if (r12 != r13) goto L_0x043b
            boolean r12 = r11.receivedShutdown     // Catch:{ all -> 0x0140 }
            if (r12 != 0) goto L_0x0415
            r11.closeAll()     // Catch:{ all -> 0x0140 }
            long r12 = r11.networkBIO     // Catch:{ all -> 0x0140 }
            int r12 = io.netty.internal.tcnative.SSL.bioLengthByteBuffer(r12)     // Catch:{ all -> 0x0140 }
            int r5 = r5 - r12
            int r12 = r5 + r3
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x00e3 }
            if (r8 == r13) goto L_0x03ed
            int r13 = r15.remaining()     // Catch:{ all -> 0x00e3 }
            if (r12 != r13) goto L_0x03e3
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x00e3 }
            goto L_0x03ed
        L_0x03e3:
            long r13 = r11.networkBIO     // Catch:{ all -> 0x00e3 }
            int r13 = io.netty.internal.tcnative.SSL.bioLengthNonApplication(r13)     // Catch:{ all -> 0x00e3 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = r11.getHandshakeStatus(r13)     // Catch:{ all -> 0x00e3 }
        L_0x03ed:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = r11.mayFinishHandshake(r13)     // Catch:{ all -> 0x00e3 }
            javax.net.ssl.SSLEngineResult r13 = r11.newResult(r13, r1, r12)     // Catch:{ all -> 0x00e3 }
            long r0 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0405
            int r14 = r15.position()     // Catch:{ all -> 0x002f }
            int r14 = r14 + r12
            r15.position(r14)     // Catch:{ all -> 0x002f }
            goto L_0x0413
        L_0x0405:
            int r14 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r12 = r2.internalNioBuffer(r14, r12)     // Catch:{ all -> 0x002f }
            r15.put(r12)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0413:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r13
        L_0x0415:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x0140 }
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r1, r3)     // Catch:{ all -> 0x0140 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x042b
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r3
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x0439
        L_0x042b:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r3)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0439:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x043b:
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_READ     // Catch:{ all -> 0x0140 }
            if (r12 != r13) goto L_0x0465
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ all -> 0x0140 }
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r1, r3)     // Catch:{ all -> 0x0140 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0455
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r3
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x0463
        L_0x0455:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r3)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0463:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0465:
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_WRITE     // Catch:{ all -> 0x0140 }
            if (r12 != r13) goto L_0x04b7
            if (r3 <= 0) goto L_0x0491
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x0140 }
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r1, r3)     // Catch:{ all -> 0x0140 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0481
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r3
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x048f
        L_0x0481:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r3)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x048f:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0491:
            javax.net.ssl.SSLEngineResult$Status r12 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x0140 }
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r8, r1, r3)     // Catch:{ all -> 0x0140 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x04a7
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r3
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x04b5
        L_0x04a7:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r3)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x04b5:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x04b7:
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_X509_LOOKUP     // Catch:{ all -> 0x0140 }
            if (r12 == r13) goto L_0x04cb
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_CERTIFICATE_VERIFY     // Catch:{ all -> 0x0140 }
            if (r12 == r13) goto L_0x04cb
            int r13 = io.netty.internal.tcnative.SSL.SSL_ERROR_WANT_PRIVATE_KEY_OPERATION     // Catch:{ all -> 0x0140 }
            if (r12 != r13) goto L_0x04c4
            goto L_0x04cb
        L_0x04c4:
            java.lang.String r13 = "SSL_write"
            javax.net.ssl.SSLException r12 = r11.shutdownWithError(r13, r12)     // Catch:{ all -> 0x0140 }
            throw r12     // Catch:{ all -> 0x0140 }
        L_0x04cb:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ all -> 0x0140 }
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r12, r1, r3)     // Catch:{ all -> 0x0140 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x04e1
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r3
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x04ef
        L_0x04e1:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r3)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x04ef:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x04f1:
            javax.net.ssl.SSLEngineResult r12 = r11.newResultMayFinishHandshake(r8, r1, r4)     // Catch:{ all -> 0x0187 }
            long r13 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r13)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x0505
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r4
            r15.position(r13)     // Catch:{ all -> 0x002f }
            goto L_0x0513
        L_0x0505:
            int r13 = r2.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r2.internalNioBuffer(r13, r4)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r2.release()     // Catch:{ all -> 0x002f }
        L_0x0513:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            return r12
        L_0x0515:
            r11.pendingException = r14     // Catch:{ all -> 0x0187 }
            r11.shutdown()     // Catch:{ all -> 0x0187 }
            javax.net.ssl.SSLException r12 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0187 }
            r12.<init>(r5)     // Catch:{ all -> 0x0187 }
            throw r12     // Catch:{ all -> 0x0187 }
        L_0x0520:
            long r2 = r11.networkBIO     // Catch:{ all -> 0x002f }
            io.netty.internal.tcnative.SSL.bioClearByteBuffer(r2)     // Catch:{ all -> 0x002f }
            if (r14 == 0) goto L_0x0536
            int r13 = r14.readerIndex()     // Catch:{ all -> 0x002f }
            java.nio.ByteBuffer r13 = r14.internalNioBuffer(r13, r1)     // Catch:{ all -> 0x002f }
            r15.put(r13)     // Catch:{ all -> 0x002f }
            r14.release()     // Catch:{ all -> 0x002f }
            goto L_0x053e
        L_0x0536:
            int r13 = r15.position()     // Catch:{ all -> 0x002f }
            int r13 = r13 + r1
            r15.position(r13)     // Catch:{ all -> 0x002f }
        L_0x053e:
            throw r12     // Catch:{ all -> 0x002f }
        L_0x053f:
            monitor-exit(r11)     // Catch:{ all -> 0x002f }
            throw r12
        L_0x0541:
            java.nio.ReadOnlyBufferException r12 = new java.nio.ReadOnlyBufferException
            r12.<init>()
            throw r12
        L_0x0547:
            java.lang.IndexOutOfBoundsException r15 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "offset: "
            java.lang.String r1 = ", length: "
            java.lang.String r2 = " (expected: offset <= offset + length <= srcs.length ("
            java.lang.StringBuilder r13 = u.C1477r.e(r0, r13, r1, r14, r2)
            int r12 = r12.length
            java.lang.String r14 = "))"
            java.lang.String r12 = N.e.z(r13, r12, r14)
            r15.<init>(r12)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.Q0.wrap(java.nio.ByteBuffer[], int, int, java.nio.ByteBuffer):javax.net.ssl.SSLEngineResult");
    }

    /* access modifiers changed from: private */
    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    private SSLEngineResult newResult(SSLEngineResult.Status status, SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i8) {
        if (isOutboundDone()) {
            if (isInboundDone()) {
                handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                shutdown();
            }
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, handshakeStatus, i, i8);
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
            this.needTask = true;
        }
        return new SSLEngineResult(status, handshakeStatus, i, i8);
    }

    private SSLEngineResult newResultMayFinishHandshake(SSLEngineResult.Status status, SSLEngineResult.HandshakeStatus handshakeStatus, int i, int i8) {
        return newResult(status, mayFinishHandshake(handshakeStatus, i, i8), i, i8);
    }

    private SSLException shutdownWithError(String str, int i, int i8) {
        C1082c cVar = logger;
        if (cVar.isDebugEnabled()) {
            String errorString = SSL.getErrorString((long) i8);
            cVar.debug("{} failed with {}: OpenSSL error: {} {}", str, Integer.valueOf(i), Integer.valueOf(i8), errorString);
        }
        shutdown();
        SSLException newSSLExceptionForError = newSSLExceptionForError(i8);
        Throwable th = this.pendingException;
        if (th != null) {
            newSSLExceptionForError.initCause(th);
            this.pendingException = null;
        }
        return newSSLExceptionForError;
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus) {
        if (handshakeStatus != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            return handshakeStatus;
        }
        if (this.handshakeState != L0.FINISHED) {
            return handshake();
        }
        return (isDestroyed() || SSL.bioLengthNonApplication(this.networkBIO) <= 0) ? handshakeStatus : SSLEngineResult.HandshakeStatus.NEED_WRAP;
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatus(int i) {
        if (!needPendingStatus()) {
            return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        if (this.needTask) {
            return SSLEngineResult.HandshakeStatus.NEED_TASK;
        }
        return pendingStatus(i);
    }

    private String selectApplicationProtocol(List<String> list, C0537b bVar, String str) {
        if (bVar == C0537b.ACCEPT) {
            return str;
        }
        int size = list.size();
        if (list.contains(str)) {
            return str;
        }
        if (bVar == C0537b.CHOOSE_MY_LAST_PROTOCOL) {
            return list.get(size - 1);
        }
        throw new SSLException(C1477r.d("unknown protocol ", str));
    }

    public final SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) {
        return unwrap(byteBufferArr, 0, byteBufferArr.length, byteBufferArr2, 0, byteBufferArr2.length);
    }

    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i8) {
        SSLEngineResult unwrap;
        try {
            unwrap = unwrap(singleSrcBuffer(byteBuffer), 0, 1, byteBufferArr, i, i8);
            resetSingleSrcBuffer();
        } catch (Throwable th) {
            resetSingleSrcBuffer();
            throw th;
        }
        return unwrap;
    }

    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult unwrap;
        try {
            unwrap = unwrap(singleSrcBuffer(byteBuffer), singleDstBuffer(byteBuffer2));
            resetSingleSrcBuffer();
            resetSingleDstBuffer();
        } catch (Throwable th) {
            resetSingleSrcBuffer();
            resetSingleDstBuffer();
            throw th;
        }
        return unwrap;
    }

    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        SSLEngineResult unwrap;
        try {
            unwrap = unwrap(singleSrcBuffer(byteBuffer), byteBufferArr);
            resetSingleSrcBuffer();
        } catch (Throwable th) {
            resetSingleSrcBuffer();
            throw th;
        }
        return unwrap;
    }

    public final synchronized SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult wrap;
        try {
            wrap = wrap(singleSrcBuffer(byteBuffer), byteBuffer2);
            resetSingleSrcBuffer();
        } catch (Throwable th) {
            resetSingleSrcBuffer();
            throw th;
        }
        return wrap;
    }
}
