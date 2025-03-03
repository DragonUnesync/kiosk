package f6;

import java.util.concurrent.RejectedExecutionException;

public final class X implements W {
    public void rejected(Runnable runnable, d0 d0Var) {
        throw new RejectedExecutionException();
    }
}
