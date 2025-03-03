package Z5;

import T5.C0282y0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

public final class C extends C0282y0 {
    /* access modifiers changed from: private */
    public boolean done;
    /* access modifiers changed from: private */
    public final boolean failOnMissingResponse;
    /* access modifiers changed from: private */
    public final boolean parseHttpAfterConnectRequest;
    /* access modifiers changed from: private */
    public final Queue<T> queue;
    /* access modifiers changed from: private */
    public final AtomicLong requestResponseCounter;

    public C() {
        this(4096, 8192, 8192, false);
    }

    public C(int i, int i8, int i9, boolean z) {
        this(i, i8, i9, z, true);
    }

    public C(int i, int i8, int i9, boolean z, boolean z6) {
        this(i, i8, i9, z, z6, false);
    }

    public C(int i, int i8, int i9, boolean z, boolean z6, boolean z8) {
        this.queue = new ArrayDeque();
        this.requestResponseCounter = new AtomicLong();
        init(new A(this, i, i8, i9, z6), new B(this));
        this.failOnMissingResponse = z;
        this.parseHttpAfterConnectRequest = z8;
    }
}
