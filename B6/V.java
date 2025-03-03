package b6;

import S5.C0187o;
import S5.L0;
import io.netty.internal.tcnative.SSL;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509KeyManager;

public class V {
    private final X509KeyManager keyManager;
    private final String password;

    public V(X509KeyManager x509KeyManager, String str) {
        this.keyManager = x509KeyManager;
        this.password = str;
    }

    public static void validateKeyMaterialSupported(X509Certificate[] x509CertificateArr, PrivateKey privateKey, String str) {
        validateSupported(x509CertificateArr);
        validateSupported(privateKey, str);
    }

    private static void validateSupported(PrivateKey privateKey, String str) {
        if (privateKey != null) {
            long j7 = 0;
            try {
                long bio = F0.toBIO((C0187o) L0.DEFAULT, privateKey);
                try {
                    long parsePrivateKey = SSL.parsePrivateKey(bio, str);
                    SSL.freeBIO(bio);
                    if (parsePrivateKey != 0) {
                        SSL.freePrivateKey(parsePrivateKey);
                    }
                } catch (Exception e) {
                    e = e;
                    j7 = bio;
                    try {
                        throw new SSLException("PrivateKey type not supported " + privateKey.getFormat(), e);
                    } catch (Throwable th) {
                        th = th;
                        SSL.freeBIO(j7);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j7 = bio;
                    SSL.freeBIO(j7);
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
                throw new SSLException("PrivateKey type not supported " + privateKey.getFormat(), e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b6.T chooseKeyMaterial(S5.C0187o r21, java.lang.String r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            javax.net.ssl.X509KeyManager r3 = r1.keyManager
            java.security.cert.X509Certificate[] r9 = r3.getCertificateChain(r2)
            if (r9 == 0) goto L_0x008c
            int r3 = r9.length
            if (r3 != 0) goto L_0x0013
            goto L_0x008c
        L_0x0013:
            javax.net.ssl.X509KeyManager r3 = r1.keyManager
            java.security.PrivateKey r2 = r3.getPrivateKey(r2)
            r3 = 1
            b6.r0 r3 = b6.C0584u0.toPEM(r0, r3, r9)
            r10 = 0
            b6.r0 r4 = r3.retain()     // Catch:{ all -> 0x006d }
            long r12 = b6.F0.toBIO((S5.C0187o) r0, (b6.C0578r0) r4)     // Catch:{ all -> 0x006d }
            long r14 = io.netty.internal.tcnative.SSL.parseX509Chain(r12)     // Catch:{ all -> 0x0067 }
            long r7 = b6.F0.toBIO((S5.C0187o) r0, (java.security.PrivateKey) r2)     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x0035
            r16 = r10
            goto L_0x003d
        L_0x0035:
            java.lang.String r0 = r1.password     // Catch:{ all -> 0x005c }
            long r4 = io.netty.internal.tcnative.SSL.parsePrivateKey(r7, r0)     // Catch:{ all -> 0x005c }
            r16 = r4
        L_0x003d:
            b6.l r0 = new b6.l     // Catch:{ all -> 0x0058 }
            r4 = r0
            r5 = r14
            r18 = r7
            r7 = r16
            r4.<init>(r5, r7, r9)     // Catch:{ all -> 0x0054 }
            io.netty.internal.tcnative.SSL.freeBIO(r12)
            io.netty.internal.tcnative.SSL.freeBIO(r18)
            e6.c r3 = (e6.C0844c) r3
            r3.release()
            return r0
        L_0x0054:
            r0 = move-exception
            r7 = r18
            goto L_0x0072
        L_0x0058:
            r0 = move-exception
            r18 = r7
            goto L_0x0072
        L_0x005c:
            r0 = move-exception
            r18 = r7
            r16 = r10
            goto L_0x0072
        L_0x0062:
            r0 = move-exception
            r7 = r10
            r16 = r7
            goto L_0x0072
        L_0x0067:
            r0 = move-exception
            r7 = r10
            r14 = r7
        L_0x006a:
            r16 = r14
            goto L_0x0072
        L_0x006d:
            r0 = move-exception
            r7 = r10
            r12 = r7
            r14 = r12
            goto L_0x006a
        L_0x0072:
            io.netty.internal.tcnative.SSL.freeBIO(r12)
            io.netty.internal.tcnative.SSL.freeBIO(r7)
            int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x007f
            io.netty.internal.tcnative.SSL.freeX509Chain(r14)
        L_0x007f:
            int r2 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0086
            io.netty.internal.tcnative.SSL.freePrivateKey(r16)
        L_0x0086:
            e6.c r3 = (e6.C0844c) r3
            r3.release()
            throw r0
        L_0x008c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.V.chooseKeyMaterial(S5.o, java.lang.String):b6.T");
    }

    public void destroy() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void validateSupported(java.security.cert.X509Certificate[] r7) {
        /*
            if (r7 == 0) goto L_0x0048
            int r0 = r7.length
            if (r0 != 0) goto L_0x0006
            goto L_0x0048
        L_0x0006:
            r0 = 0
            r2 = 0
            S5.L0 r3 = S5.L0.DEFAULT     // Catch:{ Exception -> 0x0034 }
            r4 = 1
            b6.r0 r2 = b6.C0584u0.toPEM(r3, r4, r7)     // Catch:{ Exception -> 0x0034 }
            b6.r0 r7 = r2.retain()     // Catch:{ Exception -> 0x0034 }
            long r3 = b6.F0.toBIO((S5.C0187o) r3, (b6.C0578r0) r7)     // Catch:{ Exception -> 0x0034 }
            long r5 = io.netty.internal.tcnative.SSL.parseX509Chain(r3)     // Catch:{ Exception -> 0x002f, all -> 0x002c }
            io.netty.internal.tcnative.SSL.freeBIO(r3)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0026
            io.netty.internal.tcnative.SSL.freeX509Chain(r5)
        L_0x0026:
            e6.c r2 = (e6.C0844c) r2
            r2.release()
            return
        L_0x002c:
            r7 = move-exception
            r0 = r3
            goto L_0x003d
        L_0x002f:
            r7 = move-exception
            r0 = r3
            goto L_0x0035
        L_0x0032:
            r7 = move-exception
            goto L_0x003d
        L_0x0034:
            r7 = move-exception
        L_0x0035:
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0032 }
            java.lang.String r4 = "Certificate type not supported"
            r3.<init>(r4, r7)     // Catch:{ all -> 0x0032 }
            throw r3     // Catch:{ all -> 0x0032 }
        L_0x003d:
            io.netty.internal.tcnative.SSL.freeBIO(r0)
            if (r2 == 0) goto L_0x0047
            e6.c r2 = (e6.C0844c) r2
            r2.release()
        L_0x0047:
            throw r7
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.V.validateSupported(java.security.cert.X509Certificate[]):void");
    }
}
