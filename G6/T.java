package g6;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;

public final class T implements PrivilegedAction {
    public Object run() {
        String str;
        try {
            Class<?> cls = Class.forName("java.nio.Bits", false, X.getSystemClassLoader());
            int javaVersion = X.javaVersion();
            if (X.unsafeStaticFieldOffsetSupported() && javaVersion >= 9) {
                if (javaVersion >= 11) {
                    str = "UNALIGNED";
                } else {
                    str = "unaligned";
                }
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    if (declaredField.getType() == Boolean.TYPE) {
                        Unsafe unsafe = X.UNSAFE;
                        return Boolean.valueOf(unsafe.getBoolean(unsafe.staticFieldBase(declaredField), unsafe.staticFieldOffset(declaredField)));
                    }
                } catch (NoSuchFieldException unused) {
                }
            }
            Method declaredMethod = cls.getDeclaredMethod("unaligned", (Class[]) null);
            Throwable trySetAccessible = f0.trySetAccessible(declaredMethod, true);
            if (trySetAccessible != null) {
                return trySetAccessible;
            }
            return declaredMethod.invoke((Object) null, (Object[]) null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            return e;
        }
    }
}
