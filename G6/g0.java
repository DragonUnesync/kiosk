package g6;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.PrivilegedAction;
import java.util.Enumeration;

public final class g0 implements PrivilegedAction {
    final /* synthetic */ NetworkInterface val$intf;

    public g0(NetworkInterface networkInterface) {
        this.val$intf = networkInterface;
    }

    public Enumeration<InetAddress> run() {
        return this.val$intf.getInetAddresses();
    }
}
