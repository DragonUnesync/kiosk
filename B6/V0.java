package b6;

import h6.C1082c;
import h6.d;
import io.netty.internal.tcnative.SSLContext;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class V0 extends F0 {
    private static final byte[] ID = {110, 101, 116, 116, 121};
    private static final C1082c logger = d.getInstance((Class<?>) V0.class);
    private final X sessionContext;

    public V0(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, C0543d dVar, long j7, long j8, C0561j jVar, String[] strArr, boolean z, boolean z6, String str2, Map.Entry<C0548e1, Object>... entryArr) {
        this(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, iVar, F0.toNegotiator(dVar), j7, j8, jVar, strArr, z, z6, str2, entryArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b6.X newSessionContext(b6.F0 r16, long r17, b6.S r19, java.security.cert.X509Certificate[] r20, javax.net.ssl.TrustManagerFactory r21, java.security.cert.X509Certificate[] r22, java.security.PrivateKey r23, java.lang.String r24, javax.net.ssl.KeyManagerFactory r25, java.lang.String r26, long r27, long r29) {
        /*
            r0 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r26
            r9 = r27
            r11 = r29
            java.lang.String r13 = "unable to setup accepted issuers for trustmanager "
            r14 = 0
            r15 = 10
            r11 = 0
            io.netty.internal.tcnative.SSLContext.setVerify(r0, r14, r15)     // Catch:{ Exception -> 0x0032 }
            boolean r12 = b6.F.useKeyManagerFactory()     // Catch:{ Exception -> 0x0032 }
            if (r12 != 0) goto L_0x003d
            if (r25 != 0) goto L_0x0035
            java.lang.String r12 = "keyCertChain"
            g6.B.checkNotNull(r5, r12)     // Catch:{ Exception -> 0x0032 }
            b6.F0.setKeyMaterial(r0, r5, r6, r7)     // Catch:{ Exception -> 0x0032 }
            r5 = r11
            goto L_0x007b
        L_0x002f:
            r0 = move-exception
            goto L_0x012d
        L_0x0032:
            r0 = move-exception
            goto L_0x0125
        L_0x0035:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = "KeyManagerFactory not supported"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0032 }
            throw r0     // Catch:{ Exception -> 0x0032 }
        L_0x003d:
            if (r25 != 0) goto L_0x0068
            char[] r12 = b6.C0539b1.keyStorePassword(r24)     // Catch:{ Exception -> 0x0032 }
            java.security.KeyStore r5 = b6.C0539b1.buildKeyStore(r5, r6, r12, r8)     // Catch:{ Exception -> 0x0032 }
            java.util.Enumeration r6 = r5.aliases()     // Catch:{ Exception -> 0x0032 }
            boolean r6 = r6.hasMoreElements()     // Catch:{ Exception -> 0x0032 }
            if (r6 == 0) goto L_0x0057
            b6.k0 r6 = new b6.k0     // Catch:{ Exception -> 0x0032 }
            r6.<init>()     // Catch:{ Exception -> 0x0032 }
            goto L_0x0064
        L_0x0057:
            b6.J r6 = new b6.J     // Catch:{ Exception -> 0x0032 }
            java.lang.String r14 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()     // Catch:{ Exception -> 0x0032 }
            javax.net.ssl.KeyManagerFactory r14 = javax.net.ssl.KeyManagerFactory.getInstance(r14)     // Catch:{ Exception -> 0x0032 }
            r6.<init>(r14)     // Catch:{ Exception -> 0x0032 }
        L_0x0064:
            r6.init(r5, r12)     // Catch:{ Exception -> 0x0032 }
            goto L_0x006a
        L_0x0068:
            r6 = r25
        L_0x006a:
            b6.V r5 = b6.F0.providerFor(r6, r7)     // Catch:{ Exception -> 0x0032 }
            b6.S0 r6 = new b6.S0     // Catch:{ Exception -> 0x0123 }
            b6.U r7 = new b6.U     // Catch:{ Exception -> 0x0123 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x0123 }
            r6.<init>(r2, r7)     // Catch:{ Exception -> 0x0123 }
            io.netty.internal.tcnative.SSLContext.setCertificateCallback(r0, r6)     // Catch:{ Exception -> 0x0123 }
        L_0x007b:
            if (r3 == 0) goto L_0x008c
            javax.net.ssl.TrustManagerFactory r3 = b6.C0539b1.buildTrustManagerFactory(r3, r4, r8)     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            goto L_0x009b
        L_0x0082:
            r0 = move-exception
            r11 = r5
            goto L_0x012d
        L_0x0086:
            r0 = move-exception
            goto L_0x011a
        L_0x0089:
            r0 = move-exception
            goto L_0x0122
        L_0x008c:
            if (r4 != 0) goto L_0x009a
            java.lang.String r3 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            javax.net.ssl.TrustManagerFactory r3 = javax.net.ssl.TrustManagerFactory.getInstance(r3)     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            r3.init(r11)     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            goto L_0x009b
        L_0x009a:
            r3 = r4
        L_0x009b:
            javax.net.ssl.TrustManager[] r3 = r3.getTrustManagers()     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            javax.net.ssl.X509TrustManager r3 = b6.F0.chooseTrustManager(r3)     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            setVerifyCallback(r0, r2, r3)     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            java.security.cert.X509Certificate[] r4 = r3.getAcceptedIssuers()     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            r6 = 0
            if (r4 == 0) goto L_0x00db
            int r8 = r4.length     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            if (r8 <= 0) goto L_0x00db
            S5.o r8 = S5.C0187o.DEFAULT     // Catch:{ all -> 0x00d6 }
            long r11 = b6.F0.toBIO((S5.C0187o) r8, (java.security.cert.X509Certificate[]) r4)     // Catch:{ all -> 0x00d6 }
            boolean r4 = io.netty.internal.tcnative.SSLContext.setCACertificateBio(r0, r11)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00c1
            b6.F0.freeBio(r11)     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            goto L_0x00db
        L_0x00c1:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r1.<init>(r13)     // Catch:{ all -> 0x00d3 }
            r1.append(r3)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            r6 = r11
            goto L_0x00d7
        L_0x00d6:
            r0 = move-exception
        L_0x00d7:
            b6.F0.freeBio(r6)     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            throw r0     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
        L_0x00db:
            int r3 = g6.Y.javaVersion()     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            r4 = 8
            if (r3 < r4) goto L_0x00eb
            b6.T0 r3 = new b6.T0     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            r3.<init>(r2)     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
            io.netty.internal.tcnative.SSLContext.setSniHostnameMatcher(r0, r3)     // Catch:{ SSLException -> 0x0089, Exception -> 0x0086 }
        L_0x00eb:
            b6.X r0 = new b6.X     // Catch:{ all -> 0x0082 }
            r1 = r16
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0082 }
            byte[] r1 = ID     // Catch:{ all -> 0x0082 }
            r0.setSessionIdContext(r1)     // Catch:{ all -> 0x0082 }
            boolean r1 = b6.F0.SERVER_ENABLE_SESSION_CACHE     // Catch:{ all -> 0x0082 }
            r0.setSessionCacheEnabled(r1)     // Catch:{ all -> 0x0082 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x010b
            long r3 = java.lang.Math.min(r9, r1)     // Catch:{ all -> 0x0082 }
            int r4 = (int) r3     // Catch:{ all -> 0x0082 }
            r0.setSessionCacheSize(r4)     // Catch:{ all -> 0x0082 }
        L_0x010b:
            r3 = r29
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0119
            long r1 = java.lang.Math.min(r3, r1)     // Catch:{ all -> 0x0082 }
            int r2 = (int) r1     // Catch:{ all -> 0x0082 }
            r0.setSessionTimeout(r2)     // Catch:{ all -> 0x0082 }
        L_0x0119:
            return r0
        L_0x011a:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "unable to setup trustmanager"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0082 }
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0122:
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0123:
            r0 = move-exception
            r11 = r5
        L_0x0125:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "failed to set certificate and key"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x002f }
            throw r1     // Catch:{ all -> 0x002f }
        L_0x012d:
            if (r11 == 0) goto L_0x0132
            r11.destroy()
        L_0x0132:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.V0.newSessionContext(b6.F0, long, b6.S, java.security.cert.X509Certificate[], javax.net.ssl.TrustManagerFactory, java.security.cert.X509Certificate[], java.security.PrivateKey, java.lang.String, javax.net.ssl.KeyManagerFactory, java.lang.String, long, long):b6.X");
    }

    private static void setVerifyCallback(long j7, S s8, X509TrustManager x509TrustManager) {
        if (F0.useExtendedTrustManager(x509TrustManager)) {
            SSLContext.setCertVerifyCallback(j7, new R0(s8, C0579s.m(x509TrustManager)));
        } else {
            SSLContext.setCertVerifyCallback(j7, new U0(s8, x509TrustManager));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public V0(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, G g8, long j7, long j8, C0561j jVar, String[] strArr, boolean z, boolean z6, String str2, Map.Entry<C0548e1, Object>... entryArr) {
        super(iterable, iVar, g8, 1, x509CertificateArr2, jVar, strArr, z, z6, true, entryArr);
        X newSessionContext;
        try {
            try {
                newSessionContext = newSessionContext(this, this.ctx, this.engineMap, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, str2, j7, j8);
            } catch (Throwable th) {
                th = th;
                release();
                throw th;
            }
            try {
                this.sessionContext = newSessionContext;
                if (F0.SERVER_ENABLE_SESSION_TICKET) {
                    newSessionContext.setTicketKeys(new C0553g0[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            release();
            throw th;
        }
    }

    public X sessionContext() {
        return this.sessionContext;
    }
}
