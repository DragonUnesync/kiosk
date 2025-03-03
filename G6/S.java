package g6;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.PrivilegedAction;

public final class S implements PrivilegedAction {
    final /* synthetic */ ByteBuffer val$direct;

    public S(ByteBuffer byteBuffer) {
        this.val$direct = byteBuffer;
    }

    public Object run() {
        Constructor<?> constructor;
        Constructor<?> constructor2;
        try {
            if (X.javaVersion() >= 21) {
                Class<?> cls = this.val$direct.getClass();
                Class cls2 = Long.TYPE;
                constructor2 = cls.getDeclaredConstructor(new Class[]{cls2, cls2});
            } else {
                constructor2 = this.val$direct.getClass().getDeclaredConstructor(new Class[]{Long.TYPE, Integer.TYPE});
            }
            Throwable trySetAccessible = f0.trySetAccessible(constructor2, true);
            constructor = constructor2;
            if (trySetAccessible != null) {
                return trySetAccessible;
            }
            return constructor;
        } catch (NoSuchMethodException e) {
            constructor = e;
        } catch (SecurityException e8) {
            constructor = e8;
        }
    }
}
