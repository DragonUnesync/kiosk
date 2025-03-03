package b6;

import java.security.cert.Certificate;
import javax.net.ssl.SSLSession;

public interface Y extends SSLSession {
    C0544d0 getSessionContext();

    void handshakeFinished(byte[] bArr, String str, String str2, byte[] bArr2, byte[][] bArr3, long j7, long j8);

    C0547e0 sessionId();

    void setLocalCertificate(Certificate[] certificateArr);

    void tryExpandApplicationBufferSize(int i);
}
