package g6;

import java.security.PrivilegedAction;
import sun.misc.Unsafe;

public final class P implements PrivilegedAction {
    final /* synthetic */ Unsafe val$finalUnsafe;

    public P(Unsafe unsafe) {
        this.val$finalUnsafe = unsafe;
    }

    public Object run() {
        try {
            this.val$finalUnsafe.getClass().getDeclaredMethod("storeFence", (Class[]) null);
            return null;
        } catch (NoSuchMethodException | SecurityException e) {
            return e;
        }
    }
}
