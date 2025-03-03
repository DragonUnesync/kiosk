package f6;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: f6.i  reason: case insensitive filesystem */
public final class C0919i implements C0930u {
    private final C0929t[] executors;
    private final AtomicLong idx = new AtomicLong();

    public C0919i(C0929t[] tVarArr) {
        this.executors = tVarArr;
    }

    public C0929t next() {
        return this.executors[(int) Math.abs(this.idx.getAndIncrement() % ((long) this.executors.length))];
    }
}
