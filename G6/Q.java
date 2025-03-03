package g6;

import com.samsung.android.knox.accounts.HostAuth;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;

public final class Q implements PrivilegedAction {
    final /* synthetic */ ByteBuffer val$direct;
    final /* synthetic */ Unsafe val$finalUnsafe;

    public Q(Unsafe unsafe, ByteBuffer byteBuffer) {
        this.val$finalUnsafe = unsafe;
        this.val$direct = byteBuffer;
    }

    public Object run() {
        try {
            Field declaredField = Buffer.class.getDeclaredField(HostAuth.ADDRESS);
            if (this.val$finalUnsafe.getLong(this.val$direct, this.val$finalUnsafe.objectFieldOffset(declaredField)) == 0) {
                return null;
            }
            return declaredField;
        } catch (NoSuchFieldException | SecurityException e) {
            return e;
        }
    }
}
