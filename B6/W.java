package b6;

import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Map;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

public final class W extends O {
    private final X sessionContext;

    public W(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, C0543d dVar, long j7, long j8, C0561j jVar, String[] strArr, boolean z, boolean z6, String str2, Map.Entry<C0548e1, Object>... entryArr) {
        this(x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, iterable, iVar, F0.toNegotiator(dVar), j7, j8, jVar, strArr, z, z6, str2, entryArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private W(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, C0558i iVar, G g8, long j7, long j8, C0561j jVar, String[] strArr, boolean z, boolean z6, String str2, Map.Entry<C0548e1, Object>... entryArr) {
        super(iterable, iVar, g8, 1, (Certificate[]) x509CertificateArr2, jVar, strArr, z, z6, entryArr);
        try {
            V.validateKeyMaterialSupported(x509CertificateArr2, privateKey, str);
            try {
            } catch (Throwable th) {
                th = th;
                release();
                throw th;
            }
            try {
                this.sessionContext = V0.newSessionContext(this, this.ctx, this.engineMap, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory, str2, j7, j8);
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
