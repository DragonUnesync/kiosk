package b6;

import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

public final class L extends O {
    private final C0544d0 sessionContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public L(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, C0543d dVar, String[] strArr, long j7, long j8, boolean z, String str2, Map.Entry<C0548e1, Object>... entryArr) {
        super(iterable, iVar, dVar, 0, (Certificate[]) x509CertificateArr2, C0561j.NONE, strArr, false, z, entryArr);
        try {
            V.validateKeyMaterialSupported(x509CertificateArr2, privateKey, str);
            try {
            } catch (Throwable th) {
                th = th;
                release();
                throw th;
            }
            try {
                this.sessionContext = C0594z0.newSessionContext(this, this.ctx, this.engineMap, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, str2, j7, j8);
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

    public C0544d0 sessionContext() {
        return this.sessionContext;
    }
}
