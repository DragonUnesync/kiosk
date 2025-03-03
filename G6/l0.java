package g6;

import java.net.InetAddress;
import java.security.PrivilegedExceptionAction;

public final class l0 implements PrivilegedExceptionAction {
    final /* synthetic */ String val$hostname;

    public l0(String str) {
        this.val$hostname = str;
    }

    public InetAddress run() {
        return InetAddress.getByName(this.val$hostname);
    }
}
