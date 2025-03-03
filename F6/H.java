package f6;

import g6.B;
import java.util.concurrent.Executor;

public final class H implements Executor {
    public static final H INSTANCE = new H();

    private H() {
    }

    public void execute(Runnable runnable) {
        ((Runnable) B.checkNotNull(runnable, "command")).run();
    }
}
