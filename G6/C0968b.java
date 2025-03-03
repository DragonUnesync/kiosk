package g6;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.PrivilegedAction;

/* renamed from: g6.b  reason: case insensitive filesystem */
public final class C0968b implements PrivilegedAction {
    final /* synthetic */ ByteBuffer val$direct;

    public C0968b(ByteBuffer byteBuffer) {
        this.val$direct = byteBuffer;
    }

    public Object run() {
        try {
            Field declaredField = this.val$direct.getClass().getDeclaredField("cleaner");
            if (Y.hasUnsafe()) {
                return declaredField;
            }
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return th;
        }
    }
}
