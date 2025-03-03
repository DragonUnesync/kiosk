package g6;

import java.security.PrivilegedAction;

public final class V implements PrivilegedAction {
    final /* synthetic */ Object val$finalInternalUnsafe;

    public V(Object obj) {
        this.val$finalInternalUnsafe = obj;
    }

    public Object run() {
        try {
            return this.val$finalInternalUnsafe.getClass().getDeclaredMethod("allocateUninitializedArray", new Class[]{Class.class, Integer.TYPE});
        } catch (NoSuchMethodException | SecurityException e) {
            return e;
        }
    }
}
