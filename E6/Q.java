package e6;

import g6.Y;
import g6.p0;
import java.lang.reflect.Constructor;

public final class Q extends S {
    private final Constructor<?> customClassConstructor;
    private final Constructor<?> obsoleteCustomClassConstructor;

    public Q() {
        String str;
        try {
            str = p0.get("io.netty.customResourceLeakDetector");
        } catch (Throwable th) {
            S.logger.error("Could not access System property: io.netty.customResourceLeakDetector", th);
            str = null;
        }
        if (str == null) {
            this.customClassConstructor = null;
            this.obsoleteCustomClassConstructor = null;
            return;
        }
        this.obsoleteCustomClassConstructor = obsoleteCustomClassConstructor(str);
        this.customClassConstructor = customClassConstructor(str);
    }

    private static Constructor<?> customClassConstructor(String str) {
        try {
            Class<?> cls = Class.forName(str, true, Y.getSystemClassLoader());
            if (P.class.isAssignableFrom(cls)) {
                return cls.getConstructor(new Class[]{Class.class, Integer.TYPE});
            }
            S.logger.error("Class {} does not inherit from ResourceLeakDetector.", (Object) str);
            return null;
        } catch (Throwable th) {
            S.logger.error("Could not load custom resource leak detector class provided: {}", str, th);
            return null;
        }
    }

    private static Constructor<?> obsoleteCustomClassConstructor(String str) {
        try {
            Class<?> cls = Class.forName(str, true, Y.getSystemClassLoader());
            if (P.class.isAssignableFrom(cls)) {
                return cls.getConstructor(new Class[]{Class.class, Integer.TYPE, Long.TYPE});
            }
            S.logger.error("Class {} does not inherit from ResourceLeakDetector.", (Object) str);
            return null;
        } catch (Throwable th) {
            S.logger.error("Could not load custom resource leak detector class provided: {}", str, th);
            return null;
        }
    }

    public <T> P newResourceLeakDetector(Class<T> cls, int i) {
        Constructor<?> constructor = this.customClassConstructor;
        if (constructor != null) {
            try {
                P p3 = (P) constructor.newInstance(new Object[]{cls, Integer.valueOf(i)});
                S.logger.debug("Loaded custom ResourceLeakDetector: {}", (Object) this.customClassConstructor.getDeclaringClass().getName());
                return p3;
            } catch (Throwable th) {
                S.logger.error("Could not load custom resource leak detector provided: {} with the given resource: {}", this.customClassConstructor.getDeclaringClass().getName(), cls, th);
            }
        }
        P p8 = new P(cls, i);
        S.logger.debug("Loaded default ResourceLeakDetector: {}", (Object) p8);
        return p8;
    }
}
