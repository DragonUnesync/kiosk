package b6;

import g6.Y;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: b6.p0  reason: case insensitive filesystem */
public final class C0575p0 implements C0573o0 {
    private final long spiOffset;
    private final long tmOffset;

    public C0575p0(long j7, long j8) {
        this.spiOffset = j7;
        this.tmOffset = j8;
    }

    public X509TrustManager wrapIfNeeded(X509TrustManager x509TrustManager) {
        if (!C0579s.D(x509TrustManager)) {
            try {
                SSLContext access$000 = C0577q0.newSSLContext();
                access$000.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                Object object = Y.getObject(access$000, this.spiOffset);
                if (object != null) {
                    Object object2 = Y.getObject(object, this.tmOffset);
                    if (C0579s.A(object2)) {
                        return (X509TrustManager) object2;
                    }
                }
            } catch (NoSuchAlgorithmException e) {
                Y.throwException(e);
            } catch (KeyManagementException e8) {
                Y.throwException(e8);
            } catch (NoSuchProviderException e9) {
                Y.throwException(e9);
            }
        }
        return x509TrustManager;
    }
}
