package g6;

import java.security.PrivilegedAction;
import sun.misc.Unsafe;

public final class O implements PrivilegedAction {
    final /* synthetic */ Unsafe val$finalUnsafe;

    public O(Unsafe unsafe) {
        this.val$finalUnsafe = unsafe;
    }

    public Object run() {
        try {
            Class<?> cls = this.val$finalUnsafe.getClass();
            Class<Object> cls2 = Object.class;
            Class cls3 = Long.TYPE;
            cls.getDeclaredMethod("copyMemory", new Class[]{cls2, cls3, cls2, cls3, cls3});
            return null;
        } catch (NoSuchMethodException | SecurityException e) {
            return e;
        }
    }
}
