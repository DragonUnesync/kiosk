package g6;

import h6.C1082c;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AccessController;

/* renamed from: g6.g  reason: case insensitive filesystem */
public final class C0974g implements C0966a {
    /* access modifiers changed from: private */
    public static final Method INVOKE_CLEANER;
    private static final C1082c logger;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    static {
        /*
            java.lang.Class<g6.g> r0 = g6.C0974g.class
            h6.c r0 = h6.d.getInstance((java.lang.Class<?>) r0)
            logger = r0
            boolean r1 = g6.X.hasUnsafe()
            r2 = 0
            if (r1 == 0) goto L_0x0027
            r1 = 1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            g6.e r3 = new g6.e
            r3.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r3)
            boolean r3 = r1 instanceof java.lang.Throwable
            if (r3 == 0) goto L_0x0024
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            goto L_0x002e
        L_0x0024:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            goto L_0x0031
        L_0x0027:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "sun.misc.Unsafe unavailable"
            r1.<init>(r3)
        L_0x002e:
            r4 = r2
            r2 = r1
            r1 = r4
        L_0x0031:
            if (r2 != 0) goto L_0x0039
            java.lang.String r2 = "java.nio.ByteBuffer.cleaner(): available"
            r0.debug(r2)
            goto L_0x003e
        L_0x0039:
            java.lang.String r3 = "java.nio.ByteBuffer.cleaner(): unavailable"
            r0.debug((java.lang.String) r3, (java.lang.Throwable) r2)
        L_0x003e:
            INVOKE_CLEANER = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C0974g.<clinit>():void");
    }

    private static void freeDirectBufferPrivileged(ByteBuffer byteBuffer) {
        Exception exc = (Exception) AccessController.doPrivileged(new C0973f(byteBuffer));
        if (exc != null) {
            X.throwException(exc);
        }
    }

    public static boolean isSupported() {
        if (INVOKE_CLEANER != null) {
            return true;
        }
        return false;
    }

    public void freeDirectBuffer(ByteBuffer byteBuffer) {
        if (System.getSecurityManager() == null) {
            try {
                INVOKE_CLEANER.invoke(X.UNSAFE, new Object[]{byteBuffer});
            } catch (Throwable th) {
                X.throwException(th);
            }
        } else {
            freeDirectBufferPrivileged(byteBuffer);
        }
    }
}
