package g6;

import java.lang.reflect.AccessibleObject;

public abstract class f0 {
    private static RuntimeException handleInaccessibleObjectException(RuntimeException runtimeException) {
        if ("java.lang.reflect.InaccessibleObjectException".equals(runtimeException.getClass().getName())) {
            return runtimeException;
        }
        throw runtimeException;
    }

    public static Throwable trySetAccessible(AccessibleObject accessibleObject, boolean z) {
        if (z && !X.isExplicitTryReflectionSetAccessible()) {
            return new UnsupportedOperationException("Reflective setAccessible(true) disabled");
        }
        try {
            accessibleObject.setAccessible(true);
            return null;
        } catch (SecurityException e) {
            return e;
        } catch (RuntimeException e8) {
            return handleInaccessibleObjectException(e8);
        }
    }
}
