package T5;

import java.net.NoRouteToHostException;
import java.net.SocketAddress;

/* renamed from: T5.k  reason: case insensitive filesystem */
public final class C0254k extends NoRouteToHostException {
    public C0254k(NoRouteToHostException noRouteToHostException, SocketAddress socketAddress) {
        super(noRouteToHostException.getMessage() + ": " + socketAddress);
        initCause(noRouteToHostException);
    }

    public Throwable fillInStackTrace() {
        return this;
    }
}
