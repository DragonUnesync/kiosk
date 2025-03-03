package g6;

import java.util.concurrent.atomic.AtomicLong;

public final class H extends AtomicLong implements C0982o {
    private H() {
    }

    public void add(long j7) {
        addAndGet(j7);
    }

    public void increment() {
        incrementAndGet();
    }

    public long value() {
        return get();
    }

    public /* synthetic */ H(D d8) {
        this();
    }
}
