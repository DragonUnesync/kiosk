package c6;

import g6.B;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: c6.b  reason: case insensitive filesystem */
public final class C0620b extends X509Certificate {
    static final CertificateFactory X509_CERT_FACTORY;
    private final byte[] bytes;
    private X509Certificate wrapped;

    static {
        try {
            X509_CERT_FACTORY = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public C0620b(byte[] bArr) {
        this.bytes = (byte[]) B.checkNotNull(bArr, "bytes");
    }

    private X509Certificate unwrap() {
        X509Certificate x509Certificate = this.wrapped;
        if (x509Certificate != null) {
            return x509Certificate;
        }
        try {
            X509Certificate x509Certificate2 = (X509Certificate) X509_CERT_FACTORY.generateCertificate(new ByteArrayInputStream(this.bytes));
            this.wrapped = x509Certificate2;
            return x509Certificate2;
        } catch (CertificateException e) {
            throw new IllegalStateException(e);
        }
    }

    public void checkValidity() {
        unwrap().checkValidity();
    }

    public int getBasicConstraints() {
        return unwrap().getBasicConstraints();
    }

    public Set<String> getCriticalExtensionOIDs() {
        return unwrap().getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() {
        return (byte[]) this.bytes.clone();
    }

    public List<String> getExtendedKeyUsage() {
        return unwrap().getExtendedKeyUsage();
    }

    public byte[] getExtensionValue(String str) {
        return unwrap().getExtensionValue(str);
    }

    public Collection<List<?>> getIssuerAlternativeNames() {
        return unwrap().getSubjectAlternativeNames();
    }

    public Principal getIssuerDN() {
        return unwrap().getIssuerDN();
    }

    public boolean[] getIssuerUniqueID() {
        return unwrap().getIssuerUniqueID();
    }

    public X500Principal getIssuerX500Principal() {
        return unwrap().getIssuerX500Principal();
    }

    public boolean[] getKeyUsage() {
        return unwrap().getKeyUsage();
    }

    public Set<String> getNonCriticalExtensionOIDs() {
        return unwrap().getNonCriticalExtensionOIDs();
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

    public byte[] getSignature() {
        return unwrap().getSignature();
    }

    public Collection<List<?>> getSubjectAlternativeNames() {
        return unwrap().getSubjectAlternativeNames();
    }

    public Principal getSubjectDN() {
        return unwrap().getSubjectDN();
    }

    public boolean[] getSubjectUniqueID() {
        return unwrap().getSubjectUniqueID();
    }

    public X500Principal getSubjectX500Principal() {
        return unwrap().getSubjectX500Principal();
    }

    public byte[] getTBSCertificate() {
        return unwrap().getTBSCertificate();
    }

    public int getVersion() {
        return unwrap().getVersion();
    }

    public boolean hasUnsupportedCriticalExtension() {
        return unwrap().hasUnsupportedCriticalExtension();
    }

    public String toString() {
        return unwrap().toString();
    }

    public void verify(PublicKey publicKey, Provider provider) {
        unwrap().verify(publicKey, provider);
    }

    public void checkValidity(Date date) {
        unwrap().checkValidity(date);
    }

    public void verify(PublicKey publicKey) {
        unwrap().verify(publicKey);
    }

    public void verify(PublicKey publicKey, String str) {
        unwrap().verify(publicKey, str);
    }
}
