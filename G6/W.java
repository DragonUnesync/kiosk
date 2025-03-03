package g6;

import java.nio.ByteBuffer;
import java.security.PrivilegedAction;

public final class W implements PrivilegedAction {
    public Object run() {
        try {
            return ByteBuffer.class.getDeclaredMethod("alignedSlice", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }
}
