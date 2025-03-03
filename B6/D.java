package b6;

import g6.Y;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public final class D extends C {
    public D(Provider provider, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, C0543d dVar, long j7, long j8, C0561j jVar, String[] strArr, boolean z, String str2) {
        super(newSSLContext(provider, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, j7, j8, str2), false, iterable, iVar, C.toNegotiator(dVar, true), jVar, strArr, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[Catch:{ Exception -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC, Splitter:B:21:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c A[Catch:{ Exception -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[Catch:{ Exception -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[Catch:{ Exception -> 0x001f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static javax.net.ssl.SSLContext newSSLContext(java.security.Provider r13, java.security.cert.X509Certificate[] r14, javax.net.ssl.TrustManagerFactory r15, java.security.cert.X509Certificate[] r16, java.security.PrivateKey r17, java.lang.String r18, javax.net.ssl.KeyManagerFactory r19, long r20, long r22, java.lang.String r24) {
        /*
            r0 = r13
            r1 = r14
            r2 = r15
            r7 = r20
            r9 = r22
            if (r17 != 0) goto L_0x0014
            if (r19 == 0) goto L_0x000c
            goto L_0x0014
        L_0x000c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key, keyManagerFactory"
            r0.<init>(r1)
            throw r0
        L_0x0014:
            r11 = 0
            if (r1 == 0) goto L_0x0021
            r3 = r24
            javax.net.ssl.TrustManagerFactory r1 = b6.C0539b1.buildTrustManagerFactory(r14, r15, r3)     // Catch:{ Exception -> 0x001f }
        L_0x001d:
            r12 = r1
            goto L_0x0030
        L_0x001f:
            r0 = move-exception
            goto L_0x0081
        L_0x0021:
            if (r2 != 0) goto L_0x002f
            java.lang.String r1 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ Exception -> 0x001f }
            javax.net.ssl.TrustManagerFactory r1 = javax.net.ssl.TrustManagerFactory.getInstance(r1)     // Catch:{ Exception -> 0x001f }
            r1.init(r11)     // Catch:{ Exception -> 0x001f }
            goto L_0x001d
        L_0x002f:
            r12 = r2
        L_0x0030:
            if (r17 == 0) goto L_0x0041
            r2 = 0
            r6 = 0
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            javax.net.ssl.KeyManagerFactory r1 = b6.C0539b1.buildKeyManagerFactory(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x001f }
            goto L_0x0043
        L_0x0041:
            r1 = r19
        L_0x0043:
            java.lang.String r2 = "TLS"
            if (r0 != 0) goto L_0x004c
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r2)     // Catch:{ Exception -> 0x001f }
            goto L_0x0050
        L_0x004c:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r2, r13)     // Catch:{ Exception -> 0x001f }
        L_0x0050:
            javax.net.ssl.KeyManager[] r1 = r1.getKeyManagers()     // Catch:{ Exception -> 0x001f }
            javax.net.ssl.TrustManager[] r2 = r12.getTrustManagers()     // Catch:{ Exception -> 0x001f }
            javax.net.ssl.TrustManager[] r2 = wrapTrustManagerIfNeeded(r2)     // Catch:{ Exception -> 0x001f }
            r0.init(r1, r2, r11)     // Catch:{ Exception -> 0x001f }
            javax.net.ssl.SSLSessionContext r1 = r0.getServerSessionContext()     // Catch:{ Exception -> 0x001f }
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r4 = 0
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0074
            long r6 = java.lang.Math.min(r7, r2)     // Catch:{ Exception -> 0x001f }
            int r7 = (int) r6     // Catch:{ Exception -> 0x001f }
            r1.setSessionCacheSize(r7)     // Catch:{ Exception -> 0x001f }
        L_0x0074:
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0080
            long r2 = java.lang.Math.min(r9, r2)     // Catch:{ Exception -> 0x001f }
            int r3 = (int) r2     // Catch:{ Exception -> 0x001f }
            r1.setSessionTimeout(r3)     // Catch:{ Exception -> 0x001f }
        L_0x0080:
            return r0
        L_0x0081:
            boolean r1 = r0 instanceof javax.net.ssl.SSLException
            if (r1 == 0) goto L_0x0088
            javax.net.ssl.SSLException r0 = (javax.net.ssl.SSLException) r0
            throw r0
        L_0x0088:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            java.lang.String r2 = "failed to initialize the server-side SSL context"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.D.newSSLContext(java.security.Provider, java.security.cert.X509Certificate[], javax.net.ssl.TrustManagerFactory, java.security.cert.X509Certificate[], java.security.PrivateKey, java.lang.String, javax.net.ssl.KeyManagerFactory, long, long, java.lang.String):javax.net.ssl.SSLContext");
    }

    private static TrustManager[] wrapTrustManagerIfNeeded(TrustManager[] trustManagerArr) {
        if (Y.javaVersion() >= 7) {
            for (int i = 0; i < trustManagerArr.length; i++) {
                TrustManager trustManager = trustManagerArr[i];
                if (C0579s.C(trustManager)) {
                    trustManagerArr[i] = new C0568m(C0579s.l(trustManager));
                }
            }
        }
        return trustManagerArr;
    }
}
