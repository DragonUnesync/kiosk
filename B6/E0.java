package b6;

import g6.Y;
import java.util.Map;

public final class E0 implements S {
    private final Map<Long, Q0> engines;

    private E0() {
        this.engines = Y.newConcurrentHashMap();
    }

    public void add(Q0 q02) {
        this.engines.put(Long.valueOf(q02.sslPointer()), q02);
    }

    public Q0 remove(long j7) {
        return this.engines.remove(Long.valueOf(j7));
    }

    public /* synthetic */ E0(A0 a02) {
        this();
    }
}
