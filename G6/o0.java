package g6;

import java.security.PrivilegedAction;

public final class o0 implements PrivilegedAction {
    final /* synthetic */ String val$key;

    public o0(String str) {
        this.val$key = str;
    }

    public String run() {
        return System.getProperty(this.val$key);
    }
}
