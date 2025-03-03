package c6;

import g6.B;
import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.util.Date;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

/* renamed from: c6.a  reason: case insensitive filesystem */
public final class C0619a extends X509Certificate {
    private final byte[] bytes;
    private X509Certificate wrapped;

    public C0619a(byte[] bArr) {
        this.bytes = (byte[]) B.checkNotNull(bArr, "bytes");
    }

    private X509Certificate unwrap() {
        X509Certificate x509Certificate = this.wrapped;
        if (x509Certificate != null) {
            return x509Certificate;
        }
        try {
            X509Certificate instance = X509Certificate.getInstance(this.bytes);
            this.wrapped = instance;
            return instance;
        } catch (CertificateException e) {
            throw new IllegalStateException(e);
        }
    }

    public void checkValidity() {
        unwrap().checkValidity();
    }

    public byte[] getEncoded() {
        return (byte[]) this.bytes.clone();
    }

    public Principal getIssuerDN() {
        return unwrap().getIssuerDN();
    }

    public Date getNotAfter() {
        return unwrap().getNotAfter();
    }

    public Date getNotBefore() {
        return unwrap().getNotBefore();
    }

    public PublicKey getPublicKey() {
        return unwrap().getPublicKey();
    }

    public BigInteger getSerialNumber() {
        return unwrap().getSerialNumber();
    }

    public String getSigAlgName() {
        return unwrap().getSigAlgName();
    }

    public String getSigAlgOID() {
        return unwrap().getSigAlgOID();
    }

    public byte[] getSigAlgParams() {
        return unwrap().getSigAlgParams();
    }

    public Principal getSubjectDN() {
        return unwrap().getSubjectDN();
    }

    public int getVersion() {
        return unwrap().getVersion();
    }

    public String toString() {
        return unwrap().toString();
    }

    public void verify(PublicKey publicKey) {
        unwrap().verify(publicKey);
    }

    public void checkValidity(Date date) {
        unwrap().checkValidity(date);
    }

    public void verify(PublicKey publicKey, String str) {
        unwrap().verify(publicKey, str);
    }
}
