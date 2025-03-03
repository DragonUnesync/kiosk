package U5;

import java.security.PrivilegedAction;

public final class k implements PrivilegedAction {
    public Void run() {
        System.setProperty("sun.nio.ch.bugLevel", "");
        return null;
    }
}
