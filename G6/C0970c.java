package g6;

import java.nio.ByteBuffer;
import java.security.PrivilegedAction;

/* renamed from: g6.c  reason: case insensitive filesystem */
public final class C0970c implements PrivilegedAction {
    final /* synthetic */ ByteBuffer val$buffer;

    public C0970c(ByteBuffer byteBuffer) {
        this.val$buffer = byteBuffer;
    }

    public Throwable run() {
        try {
            C0971d.freeDirectBuffer0(this.val$buffer);
            return null;
        } catch (Throwable th) {
            return th;
        }
    }
}
