package b6;

import javax.net.ssl.SSLHandshakeException;

public final class O0 extends SSLHandshakeException implements M0 {
    private final int errorCode;

    public O0(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public int errorCode() {
        return this.errorCode;
    }
}
