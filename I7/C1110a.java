package i7;

import F.h;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* renamed from: i7.a  reason: case insensitive filesystem */
public final class C1110a extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final C1110a f12762a = new ProxySelector();

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public final List select(URI uri) {
        if (uri != null) {
            return h.w(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
