package T5;

import g6.C0980m;
import java.util.Map;

public abstract class X implements W {
    boolean added;

    public void ensureNotSharable() {
        if (isSharable()) {
            throw new IllegalStateException("ChannelHandler " + getClass().getName() + " is not allowed to be shared");
        }
    }

    @Deprecated
    @C0237b0
    public void exceptionCaught(Y y8, Throwable th) {
        y8.fireExceptionCaught(th);
    }

    public void handlerAdded(Y y8) {
    }

    public void handlerRemoved(Y y8) {
    }

    public boolean isSharable() {
        Class<?> cls = getClass();
        Map<Class<?>, Boolean> handlerSharableCache = C0980m.get().handlerSharableCache();
        Boolean bool = handlerSharableCache.get(cls);
        if (bool == null) {
            bool = Boolean.valueOf(cls.isAnnotationPresent(V.class));
            handlerSharableCache.put(cls, bool);
        }
        return bool.booleanValue();
    }
}
