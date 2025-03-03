package h6;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public final class k extends C1080a {
    static final String FQCN = "h6.k";
    final transient Logger logger;
    final boolean traceCapable = isTraceCapable();

    public k(Logger logger2) {
        super(logger2.getName());
        this.logger = logger2;
    }

    private boolean isTraceCapable() {
        try {
            this.logger.isTraceEnabled();
            return true;
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public void debug(String str) {
        this.logger.log(FQCN, Level.DEBUG, str, (Throwable) null);
    }

    public void error(String str) {
        this.logger.log(FQCN, Level.ERROR, str, (Throwable) null);
    }

    public void info(String str) {
        this.logger.log(FQCN, Level.INFO, str, (Throwable) null);
    }

    public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }

    public boolean isErrorEnabled() {
        return this.logger.isEnabledFor(Level.ERROR);
    }

    public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }

    public boolean isTraceEnabled() {
        if (this.traceCapable) {
            return this.logger.isTraceEnabled();
        }
        return this.logger.isDebugEnabled();
    }

    public boolean isWarnEnabled() {
        return this.logger.isEnabledFor(Level.WARN);
    }

    public void trace(String str, Object obj) {
        if (isTraceEnabled()) {
            C1081b format = m.format(str, obj);
            this.logger.log(FQCN, this.traceCapable ? Level.TRACE : Level.DEBUG, format.getMessage(), format.getThrowable());
        }
    }

    public void warn(String str) {
        this.logger.log(FQCN, Level.WARN, str, (Throwable) null);
    }

    public void debug(String str, Object obj) {
        if (this.logger.isDebugEnabled()) {
            C1081b format = m.format(str, obj);
            this.logger.log(FQCN, Level.DEBUG, format.getMessage(), format.getThrowable());
        }
    }

    public void error(String str, Object obj) {
        if (this.logger.isEnabledFor(Level.ERROR)) {
            C1081b format = m.format(str, obj);
            this.logger.log(FQCN, Level.ERROR, format.getMessage(), format.getThrowable());
        }
    }

    public void info(String str, Object obj) {
        if (this.logger.isInfoEnabled()) {
            C1081b format = m.format(str, obj);
            this.logger.log(FQCN, Level.INFO, format.getMessage(), format.getThrowable());
        }
    }

    public void warn(String str, Object obj) {
        if (this.logger.isEnabledFor(Level.WARN)) {
            C1081b format = m.format(str, obj);
            this.logger.log(FQCN, Level.WARN, format.getMessage(), format.getThrowable());
        }
    }

    public void debug(String str, Object obj, Object obj2) {
        if (this.logger.isDebugEnabled()) {
            C1081b format = m.format(str, obj, obj2);
            this.logger.log(FQCN, Level.DEBUG, format.getMessage(), format.getThrowable());
        }
    }

    public void error(String str, Object obj, Object obj2) {
        if (this.logger.isEnabledFor(Level.ERROR)) {
            C1081b format = m.format(str, obj, obj2);
            this.logger.log(FQCN, Level.ERROR, format.getMessage(), format.getThrowable());
        }
    }

    public void info(String str, Object obj, Object obj2) {
        if (this.logger.isInfoEnabled()) {
            C1081b format = m.format(str, obj, obj2);
            this.logger.log(FQCN, Level.INFO, format.getMessage(), format.getThrowable());
        }
    }

    public void warn(String str, Object obj, Object obj2) {
        if (this.logger.isEnabledFor(Level.WARN)) {
            C1081b format = m.format(str, obj, obj2);
            this.logger.log(FQCN, Level.WARN, format.getMessage(), format.getThrowable());
        }
    }

    public void trace(String str, Object obj, Object obj2) {
        if (isTraceEnabled()) {
            C1081b format = m.format(str, obj, obj2);
            this.logger.log(FQCN, this.traceCapable ? Level.TRACE : Level.DEBUG, format.getMessage(), format.getThrowable());
        }
    }

    public void debug(String str, Object... objArr) {
        if (this.logger.isDebugEnabled()) {
            C1081b arrayFormat = m.arrayFormat(str, objArr);
            this.logger.log(FQCN, Level.DEBUG, arrayFormat.getMessage(), arrayFormat.getThrowable());
        }
    }

    public void error(String str, Object... objArr) {
        if (this.logger.isEnabledFor(Level.ERROR)) {
            C1081b arrayFormat = m.arrayFormat(str, objArr);
            this.logger.log(FQCN, Level.ERROR, arrayFormat.getMessage(), arrayFormat.getThrowable());
        }
    }

    public void warn(String str, Object... objArr) {
        if (this.logger.isEnabledFor(Level.WARN)) {
            C1081b arrayFormat = m.arrayFormat(str, objArr);
            this.logger.log(FQCN, Level.WARN, arrayFormat.getMessage(), arrayFormat.getThrowable());
        }
    }

    public void debug(String str, Throwable th) {
        this.logger.log(FQCN, Level.DEBUG, str, th);
    }

    public void error(String str, Throwable th) {
        this.logger.log(FQCN, Level.ERROR, str, th);
    }

    public void trace(String str, Throwable th) {
        this.logger.log(FQCN, this.traceCapable ? Level.TRACE : Level.DEBUG, str, th);
    }

    public void warn(String str, Throwable th) {
        this.logger.log(FQCN, Level.WARN, str, th);
    }
}
