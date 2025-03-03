package b6;

import c6.C0619a;
import c6.C0620b;
import g6.B;
import g6.C0978k;
import io.netty.internal.tcnative.SSL;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.security.cert.X509Certificate;

public final class K0 implements Y {
    private volatile int applicationBufferSize = Q0.MAX_PLAINTEXT_LENGTH;
    private String cipher;
    private volatile long creationTime;
    private C0547e0 id = C0547e0.NULL_ID;
    private volatile Certificate[] localCertificateChain;
    private Certificate[] peerCerts;
    private String protocol;
    private final C0544d0 sessionContext;
    final /* synthetic */ Q0 this$0;
    private boolean valid = true;
    private Map<String, Object> values;
    private X509Certificate[] x509PeerCerts;

    public K0(Q0 q02, C0544d0 d0Var) {
        this.this$0 = q02;
        this.sessionContext = d0Var;
    }

    private void initCerts(byte[][] bArr, int i) {
        for (int i8 = 0; i8 < bArr.length; i8++) {
            int i9 = i + i8;
            this.peerCerts[i9] = new C0620b(bArr[i8]);
            if (this.x509PeerCerts != Q0.JAVAX_CERTS_NOT_SUPPORTED) {
                this.x509PeerCerts[i9] = new C0619a(bArr[i8]);
            }
        }
    }

    private SSLSessionBindingEvent newSSLSessionBindingEvent(String str) {
        return new SSLSessionBindingEvent(this.this$0.session, str);
    }

    private void notifyUnbound(Object obj, String str) {
        if (obj instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) obj).valueUnbound(newSSLSessionBindingEvent(str));
        }
    }

    public int getApplicationBufferSize() {
        return this.applicationBufferSize;
    }

    public String getCipherSuite() {
        synchronized (this.this$0) {
            try {
                String str = this.cipher;
                if (str == null) {
                    return "SSL_NULL_WITH_NULL_NULL";
                }
                return str;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long getCreationTime() {
        long j7;
        synchronized (this.this$0) {
            j7 = this.creationTime;
        }
        return j7;
    }

    public byte[] getId() {
        return sessionId().cloneBytes();
    }

    public long getLastAccessedTime() {
        long access$900 = this.this$0.lastAccessed;
        if (access$900 == -1) {
            return getCreationTime();
        }
        return access$900;
    }

    public Certificate[] getLocalCertificates() {
        Certificate[] certificateArr = this.localCertificateChain;
        if (certificateArr == null) {
            return null;
        }
        return (Certificate[]) certificateArr.clone();
    }

    public Principal getLocalPrincipal() {
        Certificate[] certificateArr = this.localCertificateChain;
        if (certificateArr == null || certificateArr.length == 0) {
            return null;
        }
        return ((java.security.cert.X509Certificate) certificateArr[0]).getSubjectX500Principal();
    }

    public int getPacketBufferSize() {
        return SSL.SSL_MAX_ENCRYPTED_LENGTH;
    }

    public X509Certificate[] getPeerCertificateChain() {
        X509Certificate[] x509CertificateArr;
        synchronized (this.this$0) {
            try {
                if (this.x509PeerCerts == Q0.JAVAX_CERTS_NOT_SUPPORTED) {
                    throw new UnsupportedOperationException();
                } else if (!Q0.isEmpty((Object[]) this.x509PeerCerts)) {
                    x509CertificateArr = (X509Certificate[]) this.x509PeerCerts.clone();
                } else {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x509CertificateArr;
    }

    public Certificate[] getPeerCertificates() {
        Certificate[] certificateArr;
        synchronized (this.this$0) {
            try {
                if (!Q0.isEmpty((Object[]) this.peerCerts)) {
                    certificateArr = (Certificate[]) this.peerCerts.clone();
                } else {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return certificateArr;
    }

    public String getPeerHost() {
        return this.this$0.getPeerHost();
    }

    public int getPeerPort() {
        return this.this$0.getPeerPort();
    }

    public Principal getPeerPrincipal() {
        return ((java.security.cert.X509Certificate) getPeerCertificates()[0]).getSubjectX500Principal();
    }

    public String getProtocol() {
        String str = this.protocol;
        if (str == null) {
            synchronized (this.this$0) {
                try {
                    if (!this.this$0.isDestroyed()) {
                        str = SSL.getVersion(this.this$0.ssl);
                    } else {
                        str = "";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return str;
    }

    public Object getValue(String str) {
        B.checkNotNull(str, "name");
        synchronized (this) {
            try {
                Map<String, Object> map = this.values;
                if (map == null) {
                    return null;
                }
                Object obj = map.get(str);
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String[] getValueNames() {
        synchronized (this) {
            try {
                Map<String, Object> map = this.values;
                if (map != null) {
                    if (!map.isEmpty()) {
                        String[] strArr = (String[]) map.keySet().toArray(C0978k.EMPTY_STRINGS);
                        return strArr;
                    }
                }
                String[] strArr2 = C0978k.EMPTY_STRINGS;
                return strArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void handshakeFinished(byte[] bArr, String str, String str2, byte[] bArr2, byte[][] bArr3, long j7, long j8) {
        synchronized (this.this$0) {
            try {
                if (!this.this$0.isDestroyed()) {
                    this.creationTime = j7;
                    C0547e0 e0Var = this.id;
                    C0547e0 e0Var2 = C0547e0.NULL_ID;
                    if (e0Var == e0Var2) {
                        if (bArr != null) {
                            e0Var2 = new C0547e0(bArr);
                        }
                        this.id = e0Var2;
                    }
                    this.cipher = this.this$0.toJavaCipherSuite(str);
                    this.protocol = str2;
                    if (this.this$0.clientMode) {
                        if (Q0.isEmpty((Object[]) bArr3)) {
                            this.peerCerts = C0978k.EMPTY_CERTIFICATES;
                            if (F.JAVAX_CERTIFICATE_CREATION_SUPPORTED) {
                                this.x509PeerCerts = C0978k.EMPTY_JAVAX_X509_CERTIFICATES;
                            } else {
                                this.x509PeerCerts = Q0.JAVAX_CERTS_NOT_SUPPORTED;
                            }
                        } else {
                            this.peerCerts = new Certificate[bArr3.length];
                            if (F.JAVAX_CERTIFICATE_CREATION_SUPPORTED) {
                                this.x509PeerCerts = new X509Certificate[bArr3.length];
                            } else {
                                this.x509PeerCerts = Q0.JAVAX_CERTS_NOT_SUPPORTED;
                            }
                            initCerts(bArr3, 0);
                        }
                    } else if (Q0.isEmpty(bArr2)) {
                        this.peerCerts = C0978k.EMPTY_CERTIFICATES;
                        this.x509PeerCerts = C0978k.EMPTY_JAVAX_X509_CERTIFICATES;
                    } else if (Q0.isEmpty((Object[]) bArr3)) {
                        this.peerCerts = new Certificate[]{new C0620b(bArr2)};
                        if (F.JAVAX_CERTIFICATE_CREATION_SUPPORTED) {
                            this.x509PeerCerts = new X509Certificate[]{new C0619a(bArr2)};
                        } else {
                            this.x509PeerCerts = Q0.JAVAX_CERTS_NOT_SUPPORTED;
                        }
                    } else {
                        Certificate[] certificateArr = new Certificate[(bArr3.length + 1)];
                        this.peerCerts = certificateArr;
                        certificateArr[0] = new C0620b(bArr2);
                        if (F.JAVAX_CERTIFICATE_CREATION_SUPPORTED) {
                            X509Certificate[] x509CertificateArr = new X509Certificate[(bArr3.length + 1)];
                            this.x509PeerCerts = x509CertificateArr;
                            x509CertificateArr[0] = new C0619a(bArr2);
                        } else {
                            this.x509PeerCerts = Q0.JAVAX_CERTS_NOT_SUPPORTED;
                        }
                        initCerts(bArr3, 1);
                    }
                    this.this$0.calculateMaxWrapOverhead();
                    L0 unused = this.this$0.handshakeState = L0.FINISHED;
                } else {
                    throw new SSLException("Already closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void invalidate() {
        synchronized (this.this$0) {
            this.valid = false;
            this.sessionContext.removeFromCache(this.id);
        }
    }

    public boolean isValid() {
        boolean z;
        synchronized (this.this$0) {
            try {
                if (!this.valid) {
                    if (!this.sessionContext.isInCache(this.id)) {
                        z = false;
                    }
                }
                z = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void putValue(String str, Object obj) {
        Object put;
        B.checkNotNull(str, "name");
        B.checkNotNull(obj, "value");
        synchronized (this) {
            try {
                Map map = this.values;
                if (map == null) {
                    map = new HashMap(2);
                    this.values = map;
                }
                put = map.put(str, obj);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (obj instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) obj).valueBound(newSSLSessionBindingEvent(str));
        }
        notifyUnbound(put, str);
    }

    public void removeValue(String str) {
        B.checkNotNull(str, "name");
        synchronized (this) {
            try {
                Map<String, Object> map = this.values;
                if (map != null) {
                    Object remove = map.remove(str);
                    notifyUnbound(remove, str);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public C0547e0 sessionId() {
        C0547e0 e0Var;
        byte[] sessionId;
        synchronized (this.this$0) {
            try {
                if (this.id == C0547e0.NULL_ID && !this.this$0.isDestroyed() && (sessionId = SSL.getSessionId(this.this$0.ssl)) != null) {
                    this.id = new C0547e0(sessionId);
                }
                e0Var = this.id;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e0Var;
    }

    public void setLocalCertificate(Certificate[] certificateArr) {
        this.localCertificateChain = certificateArr;
    }

    public String toString() {
        return "DefaultOpenSslSession{sessionContext=" + this.sessionContext + ", id=" + this.id + '}';
    }

    public void tryExpandApplicationBufferSize(int i) {
        int i8;
        if (i > Q0.MAX_PLAINTEXT_LENGTH && this.applicationBufferSize != (i8 = Q0.MAX_RECORD_SIZE)) {
            this.applicationBufferSize = i8;
        }
    }

    public C0544d0 getSessionContext() {
        return this.sessionContext;
    }
}
