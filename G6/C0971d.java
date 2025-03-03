package g6;

import h6.C1082c;
import h6.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AccessController;

/* renamed from: g6.d  reason: case insensitive filesystem */
public final class C0971d implements C0966a {
    private static final Field CLEANER_FIELD;
    private static final long CLEANER_FIELD_OFFSET;
    private static final Method CLEAN_METHOD;
    private static final C1082c logger = d.getInstance((Class<?>) C0971d.class);

    static {
        Method method;
        Field field;
        long j7;
        Object obj;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1);
        long j8 = -1;
        Throwable th = null;
        try {
            Object doPrivileged = AccessController.doPrivileged(new C0968b(allocateDirect));
            if (!(doPrivileged instanceof Throwable)) {
                field = (Field) doPrivileged;
                if (Y.hasUnsafe()) {
                    j7 = X.objectFieldOffset(field);
                    obj = X.getObject(allocateDirect, j7);
                } else {
                    obj = field.get(allocateDirect);
                    j7 = -1;
                }
                method = obj.getClass().getDeclaredMethod("clean", (Class[]) null);
                method.invoke(obj, (Object[]) null);
                j8 = j7;
                if (th == null) {
                    logger.debug("java.nio.ByteBuffer.cleaner(): available");
                } else {
                    logger.debug("java.nio.ByteBuffer.cleaner(): unavailable", th);
                }
                CLEANER_FIELD = field;
                CLEANER_FIELD_OFFSET = j8;
                CLEAN_METHOD = method;
                return;
            }
            throw ((Throwable) doPrivileged);
        } catch (Throwable th2) {
            field = null;
            method = null;
            th = th2;
        }
    }

    /* access modifiers changed from: private */
    public static void freeDirectBuffer0(ByteBuffer byteBuffer) {
        Object obj;
        long j7 = CLEANER_FIELD_OFFSET;
        if (j7 == -1) {
            obj = CLEANER_FIELD.get(byteBuffer);
        } else {
            obj = X.getObject(byteBuffer, j7);
        }
        if (obj != null) {
            CLEAN_METHOD.invoke(obj, (Object[]) null);
        }
    }

    private static void freeDirectBufferPrivileged(ByteBuffer byteBuffer) {
        Throwable th = (Throwable) AccessController.doPrivileged(new C0970c(byteBuffer));
        if (th != null) {
            X.throwException(th);
        }
    }

    public static boolean isSupported() {
        if (CLEANER_FIELD_OFFSET == -1 && CLEANER_FIELD == null) {
            return false;
        }
        return true;
    }

    public void freeDirectBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (System.getSecurityManager() == null) {
                try {
                    freeDirectBuffer0(byteBuffer);
                } catch (Throwable th) {
                    X.throwException(th);
                }
            } else {
                freeDirectBufferPrivileged(byteBuffer);
            }
        }
    }
}
