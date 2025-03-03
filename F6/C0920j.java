package f6;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f6.j  reason: case insensitive filesystem */
public final class C0920j implements C0930u {
    private final C0929t[] executors;
    private final AtomicInteger idx = new AtomicInteger();

    public C0920j(C0929t[] tVarArr) {
        this.executors = tVarArr;
    }

    public C0929t next() {
        return this.executors[this.idx.getAndIncrement() & (this.executors.length - 1)];
    }
}
