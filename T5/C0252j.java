package T5;

import java.net.ConnectException;
import java.net.SocketAddress;

/* renamed from: T5.j  reason: case insensitive filesystem */
public final class C0252j extends ConnectException {
    public C0252j(ConnectException connectException, SocketAddress socketAddress) {
        super(connectException.getMessage() + ": " + socketAddress);
        initCause(connectException);
    }

    public Throwable fillInStackTrace() {
        return this;
    }
}
