package g6;

import java.security.PrivilegedAction;

public final class M implements PrivilegedAction {
    public ClassLoader run() {
        return ClassLoader.getSystemClassLoader();
    }
}
