package g6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;

/* renamed from: g6.e  reason: case insensitive filesystem */
public final class C0972e implements PrivilegedAction {
    final /* synthetic */ ByteBuffer val$buffer;

    public C0972e(ByteBuffer byteBuffer) {
        this.val$buffer = byteBuffer;
    }

    public Object run() {
        try {
            Unsafe unsafe = X.UNSAFE;
            Method declaredMethod = unsafe.getClass().getDeclaredMethod("invokeCleaner", new Class[]{ByteBuffer.class});
            declaredMethod.invoke(unsafe, new Object[]{this.val$buffer});
            return declaredMethod;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return e;
        }
    }
}
