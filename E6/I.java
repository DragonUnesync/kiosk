package e6;

import h6.C1082c;
import h6.d;

public abstract class I {
    private static final C1082c logger;

    static {
        Class<I> cls = I.class;
        logger = d.getInstance((Class<?>) cls);
        P.addExclusions(cls, "touch");
    }

    public static boolean release(Object obj) {
        if (obj instanceof J) {
            return ((J) obj).release();
        }
        return false;
    }

    public static void safeRelease(Object obj) {
        try {
            release(obj);
        } catch (Throwable th) {
            logger.warn("Failed to release a message: {}", obj, th);
        }
    }

    public static <T> T touch(T t8, Object obj) {
        if (t8 instanceof J) {
            return ((J) t8).touch(obj);
        }
        return t8;
    }
}
