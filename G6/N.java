package g6;

import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;

public final class N implements PrivilegedAction {
    public Object run() {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            Throwable trySetAccessible = f0.trySetAccessible(declaredField, false);
            if (trySetAccessible != null) {
                return trySetAccessible;
            }
            return declaredField.get((Object) null);
        } catch (IllegalAccessException | NoClassDefFoundError | NoSuchFieldException | SecurityException e) {
            return e;
        }
    }
}
