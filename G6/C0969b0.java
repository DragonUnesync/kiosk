package g6;

import f6.L;
import h6.C1082c;

/* renamed from: g6.b0  reason: case insensitive filesystem */
public abstract class C0969b0 {
    public static void tryCancel(L l8, C1082c cVar) {
        if (!l8.cancel(false) && cVar != null) {
            Throwable cause = l8.cause();
            if (cause == null) {
                cVar.warn("Failed to cancel promise because it has succeeded already: {}", (Object) l8);
            } else {
                cVar.warn("Failed to cancel promise because it has failed already: {}, unnotified cause:", l8, cause);
            }
        }
    }

    public static void tryFailure(L l8, Throwable th, C1082c cVar) {
        if (!l8.tryFailure(th) && cVar != null) {
            Throwable cause = l8.cause();
            if (cause == null) {
                cVar.warn("Failed to mark a promise as failure because it has succeeded already: {}", l8, th);
            } else if (cVar.isWarnEnabled()) {
                cVar.warn("Failed to mark a promise as failure because it has failed already: {}, unnotified cause: {}", l8, x0.stackTraceToString(cause), th);
            }
        }
    }

    public static <V> void trySuccess(L l8, V v4, C1082c cVar) {
        if (!l8.trySuccess(v4) && cVar != null) {
            Throwable cause = l8.cause();
            if (cause == null) {
                cVar.warn("Failed to mark a promise as success because it has succeeded already: {}", (Object) l8);
            } else {
                cVar.warn("Failed to mark a promise as success because it has failed already: {}, unnotified cause:", l8, cause);
            }
        }
    }
}
