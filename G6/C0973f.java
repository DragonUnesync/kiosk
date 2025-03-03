package g6;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.PrivilegedAction;

/* renamed from: g6.f  reason: case insensitive filesystem */
public final class C0973f implements PrivilegedAction {
    final /* synthetic */ ByteBuffer val$buffer;

    public C0973f(ByteBuffer byteBuffer) {
        this.val$buffer = byteBuffer;
    }

    public Exception run() {
        try {
            C0974g.INVOKE_CLEANER.invoke(X.UNSAFE, new Object[]{this.val$buffer});
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            return e;
        }
    }
}
