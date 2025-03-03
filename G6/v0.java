package g6;

import java.lang.Thread;

public final class v0 implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread thread, Throwable th) {
        w0.logger.debug("An exception has been raised by {}", thread.getName(), th);
    }
}
