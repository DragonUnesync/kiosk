package b6;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import e6.C0844c;
import e6.J;
import e6.P;
import e6.U;
import g6.B;
import g6.Y;
import g6.p0;
import h6.C1082c;
import io.netty.internal.tcnative.SSL;
import io.netty.internal.tcnative.SSLContext;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;

public abstract class F0 extends C0539b1 implements J {
    static final boolean CLIENT_ENABLE_SESSION_CACHE = p0.getBoolean("io.netty.handler.ssl.openssl.sessionCacheClient", true);
    static final boolean CLIENT_ENABLE_SESSION_TICKET = p0.getBoolean("jdk.tls.client.enableSessionTicketExtension", false);
    static final boolean CLIENT_ENABLE_SESSION_TICKET_TLSV13 = p0.getBoolean("jdk.tls.client.enableSessionTicketExtension", true);
    private static final int DEFAULT_BIO_NON_APPLICATION_BUFFER_SIZE = Math.max(1, p0.getInt("io.netty.handler.ssl.openssl.bioNonApplicationBufferSize", 2048));
    private static final Integer DH_KEY_LENGTH;
    static final G NONE_PROTOCOL_NEGOTIATOR = new B0();
    static final boolean SERVER_ENABLE_SESSION_CACHE = p0.getBoolean("io.netty.handler.ssl.openssl.sessionCacheServer", true);
    static final boolean SERVER_ENABLE_SESSION_TICKET = p0.getBoolean("jdk.tls.server.enableSessionTicketExtension", false);
    static final boolean SERVER_ENABLE_SESSION_TICKET_TLSV13 = p0.getBoolean("jdk.tls.server.enableSessionTicketExtension", true);
    static final boolean USE_TASKS = p0.getBoolean("io.netty.handler.ssl.openssl.useTasks", true);
    private static final P leakDetector;
    private static final C1082c logger;
    private final G apn;
    private volatile int bioNonApplicationBufferSize = DEFAULT_BIO_NON_APPLICATION_BUFFER_SIZE;
    final C0561j clientAuth;
    protected long ctx;
    final ReadWriteLock ctxLock = new ReentrantReadWriteLock();
    final boolean enableOcsp;
    final S engineMap = new E0((A0) null);
    final Certificate[] keyCertChain;
    /* access modifiers changed from: private */
    public final U leak;
    private final int mode;
    final String[] protocols;
    private final C0844c refCnt = new A0(this);
    final boolean tlsFalseStart;
    private final List<String> unmodifiableCiphers;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        logger.debug("ReferenceCountedOpenSslContext supports -Djdk.tls.ephemeralDHKeySize={int}, but got: ".concat(r2));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x006d */
    static {
        /*
            java.lang.String r0 = "ReferenceCountedOpenSslContext supports -Djdk.tls.ephemeralDHKeySize={int}, but got: "
            java.lang.Class<b6.F0> r1 = b6.F0.class
            h6.c r2 = h6.d.getInstance((java.lang.Class<?>) r1)
            logger = r2
            java.lang.String r2 = "io.netty.handler.ssl.openssl.bioNonApplicationBufferSize"
            r3 = 2048(0x800, float:2.87E-42)
            int r2 = g6.p0.getInt(r2, r3)
            r3 = 1
            int r2 = java.lang.Math.max(r3, r2)
            DEFAULT_BIO_NON_APPLICATION_BUFFER_SIZE = r2
            java.lang.String r2 = "io.netty.handler.ssl.openssl.useTasks"
            boolean r2 = g6.p0.getBoolean(r2, r3)
            USE_TASKS = r2
            e6.S r2 = e6.S.instance()
            e6.P r1 = r2.newResourceLeakDetector(r1)
            leakDetector = r1
            java.lang.String r1 = "jdk.tls.client.enableSessionTicketExtension"
            r2 = 0
            boolean r4 = g6.p0.getBoolean(r1, r2)
            CLIENT_ENABLE_SESSION_TICKET = r4
            boolean r1 = g6.p0.getBoolean(r1, r3)
            CLIENT_ENABLE_SESSION_TICKET_TLSV13 = r1
            java.lang.String r1 = "jdk.tls.server.enableSessionTicketExtension"
            boolean r2 = g6.p0.getBoolean(r1, r2)
            SERVER_ENABLE_SESSION_TICKET = r2
            boolean r1 = g6.p0.getBoolean(r1, r3)
            SERVER_ENABLE_SESSION_TICKET_TLSV13 = r1
            java.lang.String r1 = "io.netty.handler.ssl.openssl.sessionCacheServer"
            boolean r1 = g6.p0.getBoolean(r1, r3)
            SERVER_ENABLE_SESSION_CACHE = r1
            java.lang.String r1 = "io.netty.handler.ssl.openssl.sessionCacheClient"
            boolean r1 = g6.p0.getBoolean(r1, r3)
            CLIENT_ENABLE_SESSION_CACHE = r1
            b6.B0 r1 = new b6.B0
            r1.<init>()
            NONE_PROTOCOL_NEGOTIATOR = r1
            r1 = 0
            java.lang.String r2 = "jdk.tls.ephemeralDHKeySize"
            java.lang.String r2 = g6.p0.get(r2)     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0076
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x006d }
            goto L_0x0076
        L_0x006d:
            h6.c r3 = logger     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x0076 }
            r3.debug(r0)     // Catch:{ all -> 0x0076 }
        L_0x0076:
            DH_KEY_LENGTH = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.F0.<clinit>():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.security.cert.Certificate[]} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public F0(java.lang.Iterable<java.lang.String> r17, b6.C0558i r18, b6.G r19, int r20, java.security.cert.Certificate[] r21, b6.C0561j r22, java.lang.String[] r23, boolean r24, boolean r25, boolean r26, java.util.Map.Entry<b6.C0548e1, java.lang.Object>... r27) {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            r2 = r20
            r3 = r25
            r4 = r27
            java.lang.String r5 = ""
            r6 = r24
            r1.<init>(r6)
            b6.A0 r6 = new b6.A0
            r6.<init>(r1)
            r1.refCnt = r6
            b6.E0 r6 = new b6.E0
            r7 = 0
            r6.<init>(r7)
            r1.engineMap = r6
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r6.<init>()
            r1.ctxLock = r6
            int r6 = DEFAULT_BIO_NON_APPLICATION_BUFFER_SIZE
            r1.bioNonApplicationBufferSize = r6
            b6.F.ensureAvailability()
            if (r3 == 0) goto L_0x003f
            boolean r6 = b6.F.isOcspSupported()
            if (r6 == 0) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "OCSP is not supported."
            r0.<init>(r2)
            throw r0
        L_0x003f:
            r6 = 1
            if (r2 == r6) goto L_0x004d
            if (r2 != 0) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "mode most be either SSL.SSL_MODE_SERVER or SSL.SSL_MODE_CLIENT"
            r0.<init>(r2)
            throw r0
        L_0x004d:
            boolean r8 = USE_TASKS
            r9 = 0
            if (r4 == 0) goto L_0x00da
            int r10 = r4.length
            r13 = r7
            r11 = 0
            r12 = 0
        L_0x0056:
            if (r11 >= r10) goto L_0x00dc
            r14 = r4[r11]
            java.lang.Object r15 = r14.getKey()
            b6.e1 r15 = (b6.C0548e1) r15
            b6.P r7 = b6.P.TLS_FALSE_START
            if (r15 != r7) goto L_0x006f
            java.lang.Object r7 = r14.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r12 = r7.booleanValue()
            goto L_0x00d4
        L_0x006f:
            b6.P r7 = b6.P.USE_TASKS
            if (r15 != r7) goto L_0x007f
            java.lang.Object r7 = r14.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = r7
            goto L_0x00d4
        L_0x007f:
            b6.P r7 = b6.P.PRIVATE_KEY_METHOD
            if (r15 != r7) goto L_0x008b
            java.lang.Object r7 = r14.getValue()
            N.e.G(r7)
            goto L_0x00d4
        L_0x008b:
            b6.P r7 = b6.P.ASYNC_PRIVATE_KEY_METHOD
            if (r15 != r7) goto L_0x0097
            java.lang.Object r7 = r14.getValue()
            N.e.G(r7)
            goto L_0x00d4
        L_0x0097:
            b6.P r7 = b6.P.CERTIFICATE_COMPRESSION_ALGORITHMS
            if (r15 != r7) goto L_0x00a3
            java.lang.Object r7 = r14.getValue()
            N.e.G(r7)
            goto L_0x00d4
        L_0x00a3:
            b6.P r7 = b6.P.MAX_CERTIFICATE_LIST_BYTES
            if (r15 != r7) goto L_0x00af
            java.lang.Object r7 = r14.getValue()
            r13 = r7
            java.lang.Integer r13 = (java.lang.Integer) r13
            goto L_0x00d4
        L_0x00af:
            h6.c r7 = logger
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r6 = "Skipping unsupported "
            r15.<init>(r6)
            java.lang.Class<b6.e1> r6 = b6.C0548e1.class
            java.lang.String r6 = r6.getSimpleName()
            r15.append(r6)
            java.lang.String r6 = ": "
            r15.append(r6)
            java.lang.Object r6 = r14.getKey()
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            r7.debug(r6)
        L_0x00d4:
            int r11 = r11 + 1
            r6 = 1
            r7 = 0
            goto L_0x0056
        L_0x00da:
            r12 = 0
            r13 = 0
        L_0x00dc:
            r1.tlsFalseStart = r12
            if (r26 == 0) goto L_0x00e7
            e6.P r4 = leakDetector
            e6.U r4 = r4.track(r1)
            goto L_0x00e8
        L_0x00e7:
            r4 = 0
        L_0x00e8:
            r1.leak = r4
            r1.mode = r2
            boolean r4 = r16.isServer()
            if (r4 == 0) goto L_0x00fd
            java.lang.String r4 = "clientAuth"
            r6 = r22
            java.lang.Object r4 = g6.B.checkNotNull(r6, r4)
            b6.j r4 = (b6.C0561j) r4
            goto L_0x00ff
        L_0x00fd:
            b6.j r4 = b6.C0561j.NONE
        L_0x00ff:
            r1.clientAuth = r4
            if (r23 != 0) goto L_0x010d
            if (r2 != 0) goto L_0x0107
            r4 = 1
            goto L_0x0108
        L_0x0107:
            r4 = 0
        L_0x0108:
            java.lang.String[] r4 = b6.F.defaultProtocols(r4)
            goto L_0x010f
        L_0x010d:
            r4 = r23
        L_0x010f:
            r1.protocols = r4
            r1.enableOcsp = r3
            if (r21 != 0) goto L_0x0117
            r7 = 0
            goto L_0x011e
        L_0x0117:
            java.lang.Object r4 = r21.clone()
            r7 = r4
            java.security.cert.Certificate[] r7 = (java.security.cert.Certificate[]) r7
        L_0x011e:
            r1.keyCertChain = r7
            java.lang.String r4 = "cipherFilter"
            r6 = r18
            java.lang.Object r4 = g6.B.checkNotNull(r6, r4)
            b6.i r4 = (b6.C0558i) r4
            java.util.List<java.lang.String> r6 = b6.F.DEFAULT_CIPHERS
            java.util.Set r7 = b6.F.availableJavaCipherSuites()
            r10 = r17
            java.lang.String[] r4 = r4.filterCipherSuites(r10, r6, r7)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            int r7 = r4.length
            r6.<init>(r7)
            java.util.Collections.addAll(r6, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r6)
            r1.unmodifiableCiphers = r4
            java.lang.String r6 = "apn"
            java.lang.Object r6 = g6.B.checkNotNull(r0, r6)
            b6.G r6 = (b6.G) r6
            r1.apn = r6
            boolean r6 = b6.F.isTlsv13Supported()     // Catch:{ all -> 0x017f }
            if (r6 == 0) goto L_0x0159
            r7 = 62
            goto L_0x015b
        L_0x0159:
            r7 = 30
        L_0x015b:
            long r10 = io.netty.internal.tcnative.SSLContext.make(r7, r2)     // Catch:{ Exception -> 0x0287 }
            r1.ctx = r10     // Catch:{ Exception -> 0x0287 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017f }
            r2.<init>()     // Catch:{ all -> 0x017f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x017f }
            r7.<init>()     // Catch:{ all -> 0x017f }
            boolean r10 = r4.isEmpty()     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            if (r10 == 0) goto L_0x0188
            long r10 = r1.ctx     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r10, r5, r9)     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            if (r6 == 0) goto L_0x01aa
            long r9 = r1.ctx     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            r4 = 1
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r9, r5, r4)     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            goto L_0x01aa
        L_0x017f:
            r0 = move-exception
            goto L_0x0290
        L_0x0182:
            r0 = move-exception
            goto L_0x026d
        L_0x0185:
            r0 = move-exception
            goto L_0x0286
        L_0x0188:
            boolean r5 = b6.F.isBoringSSL()     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            b6.C0555h.convertToCipherStrings(r4, r2, r7, r5)     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            long r4 = r1.ctx     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            java.lang.String r10 = r2.toString()     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r4, r10, r9)     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            if (r6 == 0) goto L_0x01aa
            long r4 = r1.ctx     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            h6.c r9 = logger     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            java.lang.String r7 = r7.toString()     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            java.lang.String r7 = b6.F.checkTls13Ciphers(r9, r7)     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
            r9 = 1
            io.netty.internal.tcnative.SSLContext.setCipherSuite(r4, r7, r9)     // Catch:{ SSLException -> 0x0185, Exception -> 0x0182 }
        L_0x01aa:
            long r4 = r1.ctx     // Catch:{ all -> 0x017f }
            int r4 = io.netty.internal.tcnative.SSLContext.getOptions(r4)     // Catch:{ all -> 0x017f }
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2     // Catch:{ all -> 0x017f }
            r4 = r4 | r5
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3     // Catch:{ all -> 0x017f }
            r4 = r4 | r5
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1     // Catch:{ all -> 0x017f }
            r4 = r4 | r5
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1     // Catch:{ all -> 0x017f }
            r4 = r4 | r5
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_CIPHER_SERVER_PREFERENCE     // Catch:{ all -> 0x017f }
            r4 = r4 | r5
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_COMPRESSION     // Catch:{ all -> 0x017f }
            r4 = r4 | r5
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TICKET     // Catch:{ all -> 0x017f }
            r4 = r4 | r5
            int r2 = r2.length()     // Catch:{ all -> 0x017f }
            if (r2 != 0) goto L_0x01da
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv2     // Catch:{ all -> 0x017f }
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_SSLv3     // Catch:{ all -> 0x017f }
            r2 = r2 | r5
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1     // Catch:{ all -> 0x017f }
            r2 = r2 | r5
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_1     // Catch:{ all -> 0x017f }
            r2 = r2 | r5
            int r5 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_2     // Catch:{ all -> 0x017f }
            r2 = r2 | r5
            r4 = r4 | r2
        L_0x01da:
            if (r6 != 0) goto L_0x01df
            int r2 = io.netty.internal.tcnative.SSL.SSL_OP_NO_TLSv1_3     // Catch:{ all -> 0x017f }
            r4 = r4 | r2
        L_0x01df:
            long r5 = r1.ctx     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.setOptions(r5, r4)     // Catch:{ all -> 0x017f }
            long r4 = r1.ctx     // Catch:{ all -> 0x017f }
            int r2 = io.netty.internal.tcnative.SSLContext.getMode(r4)     // Catch:{ all -> 0x017f }
            int r6 = io.netty.internal.tcnative.SSL.SSL_MODE_ACCEPT_MOVING_WRITE_BUFFER     // Catch:{ all -> 0x017f }
            r2 = r2 | r6
            io.netty.internal.tcnative.SSLContext.setMode(r4, r2)     // Catch:{ all -> 0x017f }
            java.lang.Integer r2 = DH_KEY_LENGTH     // Catch:{ all -> 0x017f }
            if (r2 == 0) goto L_0x01fd
            long r4 = r1.ctx     // Catch:{ all -> 0x017f }
            int r2 = r2.intValue()     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.setTmpDHLength(r4, r2)     // Catch:{ all -> 0x017f }
        L_0x01fd:
            b6.B0 r0 = (b6.B0) r0     // Catch:{ all -> 0x017f }
            java.util.List r2 = r0.protocols()     // Catch:{ all -> 0x017f }
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x017f }
            if (r4 != 0) goto L_0x024a
            java.lang.String[] r4 = g6.C0978k.EMPTY_STRINGS     // Catch:{ all -> 0x017f }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ all -> 0x017f }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x017f }
            b6.c r4 = r0.selectorFailureBehavior()     // Catch:{ all -> 0x017f }
            int r4 = opensslSelectorFailureBehavior(r4)     // Catch:{ all -> 0x017f }
            int[] r5 = b6.C0.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch:{ all -> 0x017f }
            b6.a r0 = r0.protocol()     // Catch:{ all -> 0x017f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x017f }
            r0 = r5[r0]     // Catch:{ all -> 0x017f }
            r5 = 1
            if (r0 == r5) goto L_0x0245
            r5 = 2
            if (r0 == r5) goto L_0x023f
            r5 = 3
            if (r0 != r5) goto L_0x0239
            long r5 = r1.ctx     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.setNpnProtos(r5, r2, r4)     // Catch:{ all -> 0x017f }
            long r5 = r1.ctx     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.setAlpnProtos(r5, r2, r4)     // Catch:{ all -> 0x017f }
            goto L_0x024a
        L_0x0239:
            java.lang.Error r0 = new java.lang.Error     // Catch:{ all -> 0x017f }
            r0.<init>()     // Catch:{ all -> 0x017f }
            throw r0     // Catch:{ all -> 0x017f }
        L_0x023f:
            long r5 = r1.ctx     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.setAlpnProtos(r5, r2, r4)     // Catch:{ all -> 0x017f }
            goto L_0x024a
        L_0x0245:
            long r5 = r1.ctx     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.setNpnProtos(r5, r2, r4)     // Catch:{ all -> 0x017f }
        L_0x024a:
            if (r3 == 0) goto L_0x0255
            long r2 = r1.ctx     // Catch:{ all -> 0x017f }
            boolean r0 = r16.isClient()     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.enableOcsp(r2, r0)     // Catch:{ all -> 0x017f }
        L_0x0255:
            long r2 = r1.ctx     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.setUseTasks(r2, r8)     // Catch:{ all -> 0x017f }
            if (r13 == 0) goto L_0x0265
            long r2 = r1.ctx     // Catch:{ all -> 0x017f }
            int r0 = r13.intValue()     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.setMaxCertList(r2, r0)     // Catch:{ all -> 0x017f }
        L_0x0265:
            long r2 = r1.ctx     // Catch:{ all -> 0x017f }
            java.lang.String[] r0 = b6.F.NAMED_GROUPS     // Catch:{ all -> 0x017f }
            io.netty.internal.tcnative.SSLContext.setCurvesList(r2, r0)     // Catch:{ all -> 0x017f }
            return
        L_0x026d:
            javax.net.ssl.SSLException r2 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x017f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x017f }
            r3.<init>()     // Catch:{ all -> 0x017f }
            java.lang.String r4 = "failed to set cipher suite: "
            r3.append(r4)     // Catch:{ all -> 0x017f }
            java.util.List<java.lang.String> r4 = r1.unmodifiableCiphers     // Catch:{ all -> 0x017f }
            r3.append(r4)     // Catch:{ all -> 0x017f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x017f }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x017f }
            throw r2     // Catch:{ all -> 0x017f }
        L_0x0286:
            throw r0     // Catch:{ all -> 0x017f }
        L_0x0287:
            r0 = move-exception
            javax.net.ssl.SSLException r2 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x017f }
            java.lang.String r3 = "failed to create an SSL_CTX"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x017f }
            throw r2     // Catch:{ all -> 0x017f }
        L_0x0290:
            r16.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.F0.<init>(java.lang.Iterable, b6.i, b6.G, int, java.security.cert.Certificate[], b6.j, java.lang.String[], boolean, boolean, boolean, java.util.Map$Entry[]):void");
    }

    public static X509TrustManager chooseTrustManager(TrustManager[] trustManagerArr) {
        for (X509TrustManager x509TrustManager : trustManagerArr) {
            if (x509TrustManager instanceof X509TrustManager) {
                X509TrustManager x509TrustManager2 = x509TrustManager;
                if (Y.javaVersion() < 7) {
                    return x509TrustManager2;
                }
                X509TrustManager wrapIfNeeded = C0577q0.wrapIfNeeded(x509TrustManager2);
                if (useExtendedTrustManager(wrapIfNeeded)) {
                    return new C0568m(wrapIfNeeded);
                }
                return wrapIfNeeded;
            }
        }
        throw new IllegalStateException("no X509TrustManager found");
    }

    public static X509KeyManager chooseX509KeyManager(KeyManager[] keyManagerArr) {
        for (X509KeyManager x509KeyManager : keyManagerArr) {
            if (x509KeyManager instanceof X509KeyManager) {
                return x509KeyManager;
            }
        }
        throw new IllegalStateException("no X509KeyManager found");
    }

    /* access modifiers changed from: private */
    public void destroy() {
        Lock writeLock = this.ctxLock.writeLock();
        writeLock.lock();
        try {
            long j7 = this.ctx;
            if (j7 != 0) {
                if (this.enableOcsp) {
                    SSLContext.disableOcsp(j7);
                }
                SSLContext.free(this.ctx);
                this.ctx = 0;
                C0544d0 sessionContext = sessionContext();
                if (sessionContext != null) {
                    sessionContext.destroy();
                }
            }
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public static void freeBio(long j7) {
        if (j7 != 0) {
            SSL.freeBIO(j7);
        }
    }

    private static long newBIO(C0185n nVar) {
        try {
            long newMemBIO = SSL.newMemBIO();
            int readableBytes = nVar.readableBytes();
            if (SSL.bioWrite(newMemBIO, F.memoryAddress(nVar) + ((long) nVar.readerIndex()), readableBytes) == readableBytes) {
                return newMemBIO;
            }
            SSL.freeBIO(newMemBIO);
            throw new IllegalStateException("Could not write data to memory BIO");
        } finally {
            nVar.release();
        }
    }

    private static int opensslSelectorFailureBehavior(C0540c cVar) {
        int i = C0.$SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior[cVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new Error();
    }

    public static V providerFor(KeyManagerFactory keyManagerFactory, String str) {
        if (keyManagerFactory instanceof C0565k0) {
            return ((C0565k0) keyManagerFactory).newProvider();
        }
        if (keyManagerFactory instanceof J) {
            return ((J) keyManagerFactory).newProvider(str);
        }
        return new V(chooseX509KeyManager(keyManagerFactory.getKeyManagers()), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setKeyMaterial(long r16, java.security.cert.X509Certificate[] r18, java.security.PrivateKey r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = 0
            r3 = 0
            S5.o r4 = S5.C0187o.DEFAULT     // Catch:{ SSLException -> 0x008a, Exception -> 0x0088, all -> 0x0086 }
            r5 = 1
            r6 = r18
            b6.r0 r3 = b6.C0584u0.toPEM(r4, r5, r6)     // Catch:{ SSLException -> 0x008a, Exception -> 0x0088, all -> 0x0086 }
            b6.r0 r6 = r3.retain()     // Catch:{ SSLException -> 0x0080, Exception -> 0x007a, all -> 0x0074 }
            long r14 = toBIO((S5.C0187o) r4, (b6.C0578r0) r6)     // Catch:{ SSLException -> 0x0080, Exception -> 0x007a, all -> 0x0074 }
            b6.r0 r6 = r3.retain()     // Catch:{ SSLException -> 0x006f, Exception -> 0x006a, all -> 0x0065 }
            long r11 = toBIO((S5.C0187o) r4, (b6.C0578r0) r6)     // Catch:{ SSLException -> 0x006f, Exception -> 0x006a, all -> 0x0065 }
            if (r0 == 0) goto L_0x002e
            long r1 = toBIO((S5.C0187o) r4, (java.security.PrivateKey) r0)     // Catch:{ SSLException -> 0x002b, Exception -> 0x0028 }
            goto L_0x002e
        L_0x0025:
            r0 = move-exception
            goto L_0x0095
        L_0x0028:
            r0 = move-exception
            goto L_0x008c
        L_0x002b:
            r0 = move-exception
            goto L_0x0094
        L_0x002e:
            if (r20 != 0) goto L_0x0034
            java.lang.String r0 = ""
            r13 = r0
            goto L_0x0036
        L_0x0034:
            r13 = r20
        L_0x0036:
            r7 = r16
            r9 = r14
            r18 = r3
            r3 = r11
            r11 = r1
            io.netty.internal.tcnative.SSLContext.setCertificateBio(r7, r9, r11, r13)     // Catch:{ SSLException -> 0x0060, Exception -> 0x005b, all -> 0x0056 }
            r6 = r16
            io.netty.internal.tcnative.SSLContext.setCertificateChainBio(r6, r3, r5)     // Catch:{ SSLException -> 0x0060, Exception -> 0x005b, all -> 0x0056 }
            freeBio(r1)
            freeBio(r14)
            freeBio(r3)
            r3 = r18
            e6.c r3 = (e6.C0844c) r3
            r3.release()
            return
        L_0x0056:
            r0 = move-exception
            r11 = r3
            r3 = r18
            goto L_0x0095
        L_0x005b:
            r0 = move-exception
            r11 = r3
            r3 = r18
            goto L_0x008c
        L_0x0060:
            r0 = move-exception
            r11 = r3
            r3 = r18
            goto L_0x0094
        L_0x0065:
            r0 = move-exception
            r18 = r3
            r11 = r1
            goto L_0x0095
        L_0x006a:
            r0 = move-exception
            r18 = r3
            r11 = r1
            goto L_0x008c
        L_0x006f:
            r0 = move-exception
            r18 = r3
            r11 = r1
            goto L_0x0094
        L_0x0074:
            r0 = move-exception
            r18 = r3
        L_0x0077:
            r11 = r1
            r14 = r11
            goto L_0x0095
        L_0x007a:
            r0 = move-exception
            r18 = r3
        L_0x007d:
            r11 = r1
            r14 = r11
            goto L_0x008c
        L_0x0080:
            r0 = move-exception
            r18 = r3
        L_0x0083:
            r11 = r1
            r14 = r11
            goto L_0x0094
        L_0x0086:
            r0 = move-exception
            goto L_0x0077
        L_0x0088:
            r0 = move-exception
            goto L_0x007d
        L_0x008a:
            r0 = move-exception
            goto L_0x0083
        L_0x008c:
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0025 }
            java.lang.String r5 = "failed to set certificate and key"
            r4.<init>(r5, r0)     // Catch:{ all -> 0x0025 }
            throw r4     // Catch:{ all -> 0x0025 }
        L_0x0094:
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0095:
            freeBio(r1)
            freeBio(r14)
            freeBio(r11)
            if (r3 == 0) goto L_0x00a5
            e6.c r3 = (e6.C0844c) r3
            r3.release()
        L_0x00a5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.F0.setKeyMaterial(long, java.security.cert.X509Certificate[], java.security.PrivateKey, java.lang.String):void");
    }

    public static long toBIO(C0187o oVar, PrivateKey privateKey) {
        if (privateKey == null) {
            return 0;
        }
        C0578r0 pem = C0580s0.toPEM(oVar, true, privateKey);
        try {
            return toBIO(oVar, pem.retain());
        } finally {
            ((C0844c) pem).release();
        }
    }

    public static G toNegotiator(C0543d dVar) {
        return NONE_PROTOCOL_NEGOTIATOR;
    }

    public static boolean useExtendedTrustManager(X509TrustManager x509TrustManager) {
        if (Y.javaVersion() < 7 || !C0579s.D(x509TrustManager)) {
            return false;
        }
        return true;
    }

    public C0546e applicationProtocolNegotiator() {
        return this.apn;
    }

    public int getBioNonApplicationBufferSize() {
        return this.bioNonApplicationBufferSize;
    }

    public final boolean isClient() {
        if (this.mode == 0) {
            return true;
        }
        return false;
    }

    public final SSLEngine newEngine(C0187o oVar, String str, int i) {
        return newEngine0(oVar, str, i, true);
    }

    public SSLEngine newEngine0(C0187o oVar, String str, int i, boolean z) {
        return new Q0(this, oVar, str, i, z, true);
    }

    public final C1 newHandler(C0187o oVar, String str, int i, boolean z) {
        return new C1(newEngine0(oVar, str, i, false), z);
    }

    public final int refCnt() {
        return this.refCnt.refCnt();
    }

    public final boolean release() {
        return this.refCnt.release();
    }

    public final J retain() {
        this.refCnt.retain();
        return this;
    }

    public abstract C0544d0 sessionContext();

    public final J touch(Object obj) {
        this.refCnt.touch(obj);
        return this;
    }

    public static long toBIO(C0187o oVar, X509Certificate... x509CertificateArr) {
        if (x509CertificateArr == null) {
            return 0;
        }
        B.checkNonEmpty((T[]) x509CertificateArr, "certChain");
        C0578r0 pem = C0584u0.toPEM(oVar, true, x509CertificateArr);
        try {
            return toBIO(oVar, pem.retain());
        } finally {
            ((C0844c) pem).release();
        }
    }

    public static long toBIO(C0187o oVar, C0578r0 r0Var) {
        C0185n directBuffer;
        long newBIO;
        try {
            C0185n content = r0Var.content();
            if (content.isDirect()) {
                newBIO = newBIO(content.retainedSlice());
            } else {
                directBuffer = ((C0163c) oVar).directBuffer(content.readableBytes());
                directBuffer.writeBytes(content, content.readerIndex(), content.readableBytes());
                newBIO = newBIO(directBuffer.retainedSlice());
                if (r0Var.isSensitive()) {
                    H1.zeroout(directBuffer);
                }
                directBuffer.release();
            }
            ((C0844c) r0Var).release();
            return newBIO;
        } catch (Throwable th) {
            ((C0844c) r0Var).release();
            throw th;
        }
    }
}
