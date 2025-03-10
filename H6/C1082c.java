package h6;

/* renamed from: h6.c  reason: case insensitive filesystem */
public interface C1082c {
    void debug(String str);

    void debug(String str, Object obj);

    void debug(String str, Object obj, Object obj2);

    void debug(String str, Throwable th);

    void debug(String str, Object... objArr);

    void error(String str);

    void error(String str, Object obj);

    void error(String str, Object obj, Object obj2);

    void error(String str, Throwable th);

    void error(String str, Object... objArr);

    void info(String str);

    void info(String str, Object obj);

    void info(String str, Object obj, Object obj2);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void trace(String str, Object obj);

    void trace(String str, Object obj, Object obj2);

    void trace(String str, Throwable th);

    void warn(String str);

    void warn(String str, Object obj);

    void warn(String str, Object obj, Object obj2);

    void warn(String str, Throwable th);

    void warn(String str, Object... objArr);

    void warn(Throwable th);
}
