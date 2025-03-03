package h6;

import java.security.AccessController;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.spi.ExtendedLoggerWrapper;

public final class i extends ExtendedLoggerWrapper implements C1082c {
    private static final boolean VARARGS_ONLY = ((Boolean) AccessController.doPrivileged(new h())).booleanValue();

    public i(Logger logger) {
        super((ExtendedLogger) logger, logger.getName(), logger.getMessageFactory());
        if (VARARGS_ONLY) {
            throw new UnsupportedOperationException("Log4J2 version mismatch");
        }
    }

    public void warn(Throwable th) {
        log(Level.WARN, "Unexpected exception:", th);
    }
}
