package h6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.spi.LocationAwareLogger;

public final class p extends d {
    public static final d INSTANCE = new p();

    @Deprecated
    public p() {
    }

    public static d getInstanceWithNopCheck() {
        return o.INSTANCE_WITH_NOP_CHECK;
    }

    public static C1082c wrapLogger(Logger logger) {
        if (logger instanceof LocationAwareLogger) {
            return new g((LocationAwareLogger) logger);
        }
        return new n(logger);
    }

    public C1082c newInstance(String str) {
        return wrapLogger(LoggerFactory.getLogger(str));
    }

    public p(boolean z) {
        if (LoggerFactory.getILoggerFactory() instanceof NOPLoggerFactory) {
            throw new NoClassDefFoundError("NOPLoggerFactory not supported");
        }
    }
}
