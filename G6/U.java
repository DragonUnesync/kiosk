package g6;

import java.security.PrivilegedAction;

public final class U implements PrivilegedAction {
    public Object run() {
        try {
            return X.getClassLoader(X.class).loadClass("jdk.internal.misc.Unsafe").getDeclaredMethod("getUnsafe", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Throwable th) {
            return th;
        }
    }
}
