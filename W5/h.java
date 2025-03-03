package W5;

import J4.b;
import V5.f;
import g6.Y;
import h6.C1082c;
import h6.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.Channel;
import java.nio.channels.spi.SelectorProvider;

public abstract class h {
    private static final C1082c logger = d.getInstance((Class<?>) h.class);

    public static Method findOpenMethod(String str) {
        if (Y.javaVersion() < 15) {
            return null;
        }
        try {
            return SelectorProvider.class.getMethod(str, new Class[]{b.e()});
        } catch (Throwable th) {
            logger.debug("SelectorProvider.{}(ProtocolFamily) not available, will use default", str, th);
            return null;
        }
    }

    public static <C extends Channel> C newChannel(Method method, SelectorProvider selectorProvider, f fVar) {
        if (fVar == null || method == null) {
            return null;
        }
        try {
            return (Channel) method.invoke(selectorProvider, new Object[]{g.convert(fVar)});
        } catch (InvocationTargetException e) {
            throw new IOException(e);
        } catch (IllegalAccessException e8) {
            throw new IOException(e8);
        }
    }
}
