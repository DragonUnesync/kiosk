package b6;

import javax.net.ssl.SSLException;

public final class N0 extends SSLException implements M0 {
    private final int errorCode;

    public N0(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public int errorCode() {
        return this.errorCode;
    }
}
