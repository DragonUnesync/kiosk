package b6;

import io.netty.internal.tcnative.SSLContext;
import j$.util.DesugarCollections;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: b6.z0  reason: case insensitive filesystem */
public final class C0594z0 extends F0 {
    private static final Set<String> SUPPORTED_KEY_TYPES = DesugarCollections.unmodifiableSet(new LinkedHashSet(Arrays.asList(new String[]{"RSA", "DH_RSA", "EC", "EC_RSA", "EC_EC"})));
    private final C0544d0 sessionContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0594z0(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, C0543d dVar, String[] strArr, long j7, long j8, boolean z, String str2, Map.Entry<C0548e1, Object>... entryArr) {
        super(iterable, iVar, F0.toNegotiator(dVar), 0, x509CertificateArr2, C0561j.NONE, strArr, false, z, true, entryArr);
        try {
            try {
            } catch (Throwable th) {
                th = th;
                release();
                throw th;
            }
            try {
                this.sessionContext = newSessionContext(this, this.ctx, this.engineMap, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, str2, j7, j8);
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

    /* JADX WARNING: Removed duplicated region for block: B:69:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b6.C0544d0 newSessionContext(b6.F0 r16, long r17, b6.S r19, java.security.cert.X509Certificate[] r20, javax.net.ssl.TrustManagerFactory r21, java.security.cert.X509Certificate[] r22, java.security.PrivateKey r23, java.lang.String r24, javax.net.ssl.KeyManagerFactory r25, java.lang.String r26, long r27, long r29) {
        /*
            r0 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r12 = r29
            if (r6 != 0) goto L_0x001a
            if (r5 != 0) goto L_0x001f
        L_0x001a:
            if (r6 == 0) goto L_0x0027
            if (r5 == 0) goto L_0x001f
            goto L_0x0027
        L_0x001f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Either both keyCertChain and key needs to be null or none of them"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            r14 = 0
            boolean r15 = b6.F.useKeyManagerFactory()     // Catch:{ Exception -> 0x0039 }
            if (r15 != 0) goto L_0x0046
            if (r8 != 0) goto L_0x003e
            if (r5 == 0) goto L_0x003c
            b6.F0.setKeyMaterial(r0, r5, r6, r7)     // Catch:{ Exception -> 0x0039 }
            goto L_0x003c
        L_0x0036:
            r0 = move-exception
            goto L_0x0108
        L_0x0039:
            r0 = move-exception
            goto L_0x0100
        L_0x003c:
            r5 = r14
            goto L_0x0096
        L_0x003e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = "KeyManagerFactory not supported"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0039 }
            throw r0     // Catch:{ Exception -> 0x0039 }
        L_0x0046:
            if (r8 != 0) goto L_0x0077
            if (r5 == 0) goto L_0x0077
            char[] r8 = b6.C0539b1.keyStorePassword(r24)     // Catch:{ Exception -> 0x0039 }
            java.security.KeyStore r5 = b6.C0539b1.buildKeyStore(r5, r6, r8, r9)     // Catch:{ Exception -> 0x0039 }
            java.util.Enumeration r6 = r5.aliases()     // Catch:{ Exception -> 0x0039 }
            boolean r6 = r6.hasMoreElements()     // Catch:{ Exception -> 0x0039 }
            if (r6 == 0) goto L_0x0062
            b6.k0 r6 = new b6.k0     // Catch:{ Exception -> 0x0039 }
            r6.<init>()     // Catch:{ Exception -> 0x0039 }
            goto L_0x006f
        L_0x0062:
            b6.J r6 = new b6.J     // Catch:{ Exception -> 0x0039 }
            java.lang.String r15 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()     // Catch:{ Exception -> 0x0039 }
            javax.net.ssl.KeyManagerFactory r15 = javax.net.ssl.KeyManagerFactory.getInstance(r15)     // Catch:{ Exception -> 0x0039 }
            r6.<init>(r15)     // Catch:{ Exception -> 0x0039 }
        L_0x006f:
            r6.init(r5, r8)     // Catch:{ Exception -> 0x0039 }
            b6.V r5 = b6.F0.providerFor(r6, r7)     // Catch:{ Exception -> 0x0039 }
            goto L_0x007f
        L_0x0077:
            if (r8 == 0) goto L_0x007e
            b6.V r5 = b6.F0.providerFor(r8, r7)     // Catch:{ Exception -> 0x0039 }
            goto L_0x007f
        L_0x007e:
            r5 = r14
        L_0x007f:
            if (r5 == 0) goto L_0x0096
            b6.U r6 = new b6.U     // Catch:{ Exception -> 0x0093 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0093 }
            b6.w0 r7 = new b6.w0     // Catch:{ Exception -> 0x0093 }
            r7.<init>(r2, r6)     // Catch:{ Exception -> 0x0093 }
            io.netty.internal.tcnative.SSLContext.setCertificateCallback(r0, r7)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0096
        L_0x008f:
            r0 = move-exception
            r14 = r5
            goto L_0x0108
        L_0x0093:
            r0 = move-exception
            r14 = r5
            goto L_0x0100
        L_0x0096:
            r6 = 1
            r7 = 10
            io.netty.internal.tcnative.SSLContext.setVerify(r0, r6, r7)     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x00a5
            javax.net.ssl.TrustManagerFactory r3 = b6.C0539b1.buildTrustManagerFactory(r3, r4, r9)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00b4
        L_0x00a3:
            r0 = move-exception
            goto L_0x00f3
        L_0x00a5:
            if (r4 != 0) goto L_0x00b3
            java.lang.String r3 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ Exception -> 0x00a3 }
            javax.net.ssl.TrustManagerFactory r3 = javax.net.ssl.TrustManagerFactory.getInstance(r3)     // Catch:{ Exception -> 0x00a3 }
            r3.init(r14)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00b4
        L_0x00b3:
            r3 = r4
        L_0x00b4:
            javax.net.ssl.TrustManager[] r3 = r3.getTrustManagers()     // Catch:{ Exception -> 0x00a3 }
            javax.net.ssl.X509TrustManager r3 = b6.F0.chooseTrustManager(r3)     // Catch:{ Exception -> 0x00a3 }
            setVerifyCallback(r0, r2, r3)     // Catch:{ Exception -> 0x00a3 }
            b6.x0 r0 = new b6.x0     // Catch:{ all -> 0x008f }
            r1 = r16
            r0.<init>(r1, r5)     // Catch:{ all -> 0x008f }
            boolean r1 = b6.F0.CLIENT_ENABLE_SESSION_CACHE     // Catch:{ all -> 0x008f }
            r0.setSessionCacheEnabled(r1)     // Catch:{ all -> 0x008f }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r3 = 0
            int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x00dc
            long r6 = java.lang.Math.min(r10, r1)     // Catch:{ all -> 0x008f }
            int r7 = (int) r6     // Catch:{ all -> 0x008f }
            r0.setSessionCacheSize(r7)     // Catch:{ all -> 0x008f }
        L_0x00dc:
            int r6 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e8
            long r1 = java.lang.Math.min(r12, r1)     // Catch:{ all -> 0x008f }
            int r2 = (int) r1     // Catch:{ all -> 0x008f }
            r0.setSessionTimeout(r2)     // Catch:{ all -> 0x008f }
        L_0x00e8:
            boolean r1 = b6.F0.CLIENT_ENABLE_SESSION_TICKET     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x00f2
            r1 = 0
            b6.g0[] r1 = new b6.C0553g0[r1]     // Catch:{ all -> 0x008f }
            r0.setTicketKeys(r1)     // Catch:{ all -> 0x008f }
        L_0x00f2:
            return r0
        L_0x00f3:
            if (r5 == 0) goto L_0x00f8
            r5.destroy()     // Catch:{ all -> 0x008f }
        L_0x00f8:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "unable to setup trustmanager"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x008f }
            throw r1     // Catch:{ all -> 0x008f }
        L_0x0100:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "failed to set certificate and key"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0036 }
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0108:
            if (r14 == 0) goto L_0x010d
            r14.destroy()
        L_0x010d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0594z0.newSessionContext(b6.F0, long, b6.S, java.security.cert.X509Certificate[], javax.net.ssl.TrustManagerFactory, java.security.cert.X509Certificate[], java.security.PrivateKey, java.lang.String, javax.net.ssl.KeyManagerFactory, java.lang.String, long, long):b6.d0");
    }

    private static void setVerifyCallback(long j7, S s8, X509TrustManager x509TrustManager) {
        if (F0.useExtendedTrustManager(x509TrustManager)) {
            SSLContext.setCertVerifyCallback(j7, new C0586v0(s8, C0579s.m(x509TrustManager)));
        } else {
            SSLContext.setCertVerifyCallback(j7, new C0592y0(s8, x509TrustManager));
        }
    }

    public C0544d0 sessionContext() {
        return this.sessionContext;
    }
}
