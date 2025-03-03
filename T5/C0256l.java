package T5;

import java.net.SocketAddress;
import java.net.SocketException;

/* renamed from: T5.l  reason: case insensitive filesystem */
public final class C0256l extends SocketException {
    public C0256l(SocketException socketException, SocketAddress socketAddress) {
        super(socketException.getMessage() + ": " + socketAddress);
        initCause(socketException);
    }

    public Throwable fillInStackTrace() {
        return this;
    }
}
