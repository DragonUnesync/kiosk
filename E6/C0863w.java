package e6;

import java.net.InetAddress;
import java.net.NetworkInterface;

/* renamed from: e6.w  reason: case insensitive filesystem */
public final class C0863w {
    private final InetAddress address;
    private final NetworkInterface iface;

    public C0863w(NetworkInterface networkInterface, InetAddress inetAddress) {
        this.iface = networkInterface;
        this.address = inetAddress;
    }

    public InetAddress address() {
        return this.address;
    }

    public NetworkInterface iface() {
        return this.iface;
    }
}
