package g6;

import java.net.NetworkInterface;
import java.security.PrivilegedExceptionAction;

public final class h0 implements PrivilegedExceptionAction {
    final /* synthetic */ NetworkInterface val$intf;

    public h0(NetworkInterface networkInterface) {
        this.val$intf = networkInterface;
    }

    public byte[] run() {
        return this.val$intf.getHardwareAddress();
    }
}
