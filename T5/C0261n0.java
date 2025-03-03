package T5;

import S5.D0;
import e6.E;
import e6.I;
import g6.C0965A;
import g6.C0989w;
import java.nio.ByteBuffer;

/* renamed from: T5.n0  reason: case insensitive filesystem */
public final class C0261n0 {
    private static final C0965A RECYCLER = C0965A.newPool(new C0259m0());
    ByteBuffer buf;
    ByteBuffer[] bufs;
    boolean cancelled;
    int count;
    private final E handle;
    Object msg;
    C0261n0 next;
    int pendingSize;
    long progress;
    C0274u0 promise;
    long total;

    public /* synthetic */ C0261n0(C0989w wVar, C0253j0 j0Var) {
        this(wVar);
    }

    public static C0261n0 newInstance(Object obj, int i, long j7, C0274u0 u0Var) {
        C0261n0 n0Var = (C0261n0) RECYCLER.get();
        n0Var.msg = obj;
        n0Var.pendingSize = i + C0263o0.CHANNEL_OUTBOUND_BUFFER_ENTRY_OVERHEAD;
        n0Var.total = j7;
        n0Var.promise = u0Var;
        return n0Var;
    }

    public int cancel() {
        if (this.cancelled) {
            return 0;
        }
        this.cancelled = true;
        int i = this.pendingSize;
        I.safeRelease(this.msg);
        this.msg = D0.EMPTY_BUFFER;
        this.pendingSize = 0;
        this.total = 0;
        this.progress = 0;
        this.bufs = null;
        this.buf = null;
        return i;
    }

    public void unguardedRecycle() {
        this.next = null;
        this.bufs = null;
        this.buf = null;
        this.msg = null;
        this.promise = null;
        this.progress = 0;
        this.total = 0;
        this.pendingSize = 0;
        this.count = -1;
        this.cancelled = false;
        this.handle.unguardedRecycle(this);
    }

    public C0261n0 unguardedRecycleAndGetNext() {
        C0261n0 n0Var = this.next;
        unguardedRecycle();
        return n0Var;
    }

    private C0261n0(C0989w wVar) {
        this.count = -1;
        this.handle = (E) wVar;
    }
}
