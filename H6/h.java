package h6;

import java.security.PrivilegedAction;
import org.apache.logging.log4j.Logger;

public final class h implements PrivilegedAction {
    public Boolean run() {
        try {
            Logger.class.getMethod("debug", new Class[]{String.class, Object.class});
            return Boolean.FALSE;
        } catch (NoSuchMethodException unused) {
            return Boolean.TRUE;
        } catch (SecurityException unused2) {
            return Boolean.FALSE;
        }
    }
}
