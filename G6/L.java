package g6;

import java.security.PrivilegedAction;

public final class L implements PrivilegedAction {
    final /* synthetic */ Class val$clazz;

    public L(Class cls) {
        this.val$clazz = cls;
    }

    public ClassLoader run() {
        return this.val$clazz.getClassLoader();
    }
}
