package b6;

import g6.x0;
import javax.net.ssl.SSLHandshakeException;

public final class I1 extends SSLHandshakeException {
    private I1(String str) {
        super(str);
    }

    public static I1 newInstance(String str, Class<?> cls, String str2) {
        return (I1) x0.unknownStackTrace(new I1(str), cls, str2);
    }

    public Throwable fillInStackTrace() {
        return this;
    }
}
