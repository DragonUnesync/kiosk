package b6;

import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLSessionBindingListener;
import javax.security.cert.X509Certificate;

/* renamed from: b6.o  reason: case insensitive filesystem */
public abstract class C0572o extends ExtendedSSLSession implements Y {
    private static final String[] LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS = {"SHA512withRSA", "SHA512withECDSA", "SHA384withRSA", "SHA384withECDSA", "SHA256withRSA", "SHA256withECDSA", "SHA224withRSA", "SHA224withECDSA", "SHA1withRSA", "SHA1withECDSA", "RSASSA-PSS"};
    private final Y wrapped;

    public C0572o(Y y8) {
        this.wrapped = y8;
    }

    public final int getApplicationBufferSize() {
        return this.wrapped.getApplicationBufferSize();
    }

    public final String getCipherSuite() {
        return this.wrapped.getCipherSuite();
    }

    public final long getCreationTime() {
        return this.wrapped.getCreationTime();
    }

    public final byte[] getId() {
        return this.wrapped.getId();
    }

    public final long getLastAccessedTime() {
        return this.wrapped.getLastAccessedTime();
    }

    public final Certificate[] getLocalCertificates() {
        return this.wrapped.getLocalCertificates();
    }

    public final Principal getLocalPrincipal() {
        return this.wrapped.getLocalPrincipal();
    }

    public final String[] getLocalSupportedSignatureAlgorithms() {
        return (String[]) LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS.clone();
    }

    public final int getPacketBufferSize() {
        return this.wrapped.getPacketBufferSize();
    }

    public final X509Certificate[] getPeerCertificateChain() {
        return this.wrapped.getPeerCertificateChain();
    }

    public final Certificate[] getPeerCertificates() {
        return this.wrapped.getPeerCertificates();
    }

    public final String getPeerHost() {
        return this.wrapped.getPeerHost();
    }

    public final int getPeerPort() {
        return this.wrapped.getPeerPort();
    }

    public final Principal getPeerPrincipal() {
        return this.wrapped.getPeerPrincipal();
    }

    public String getProtocol() {
        return this.wrapped.getProtocol();
    }

    public final Object getValue(String str) {
        Object value = this.wrapped.getValue(str);
        if (value instanceof C0570n) {
            return ((C0570n) value).delegate;
        }
        return value;
    }

    public final String[] getValueNames() {
        return this.wrapped.getValueNames();
    }

    public void handshakeFinished(byte[] bArr, String str, String str2, byte[] bArr2, byte[][] bArr3, long j7, long j8) {
        this.wrapped.handshakeFinished(bArr, str, str2, bArr2, bArr3, j7, j8);
    }

    public final void invalidate() {
        this.wrapped.invalidate();
    }

    public final boolean isValid() {
        return this.wrapped.isValid();
    }

    public final void putValue(String str, Object obj) {
        if (obj instanceof SSLSessionBindingListener) {
            obj = new C0570n(this, (SSLSessionBindingListener) obj);
        }
        this.wrapped.putValue(str, obj);
    }

    public final void removeValue(String str) {
        this.wrapped.removeValue(str);
    }

    public C0547e0 sessionId() {
        return this.wrapped.sessionId();
    }

    public final void setLocalCertificate(Certificate[] certificateArr) {
        this.wrapped.setLocalCertificate(certificateArr);
    }

    public String toString() {
        return "ExtendedOpenSslSession{wrapped=" + this.wrapped + '}';
    }

    public final void tryExpandApplicationBufferSize(int i) {
        this.wrapped.tryExpandApplicationBufferSize(i);
    }

    public final C0544d0 getSessionContext() {
        return this.wrapped.getSessionContext();
    }
}
