package T5;

import androidx.recyclerview.widget.RecyclerView;
import g6.C0965A;
import g6.C0989w;
import g6.p0;

public final class E implements Runnable {
    private static final boolean ESTIMATE_TASK_SIZE_ON_SUBMIT = p0.getBoolean("io.netty.transport.estimateSizeOnSubmit", true);
    private static final C0965A RECYCLER = C0965A.newPool(new D());
    private static final int WRITE_TASK_OVERHEAD = p0.getInt("io.netty.transport.writeTaskSizeOverhead", 32);
    private F ctx;
    private final C0989w handle;
    private Object msg;
    private C0274u0 promise;
    private int size;

    public /* synthetic */ E(C0989w wVar, C0266q qVar) {
        this(wVar);
    }

    private void decrementPendingOutboundBytes() {
        if (ESTIMATE_TASK_SIZE_ON_SUBMIT) {
            this.ctx.pipeline.decrementPendingOutboundBytes((long) (this.size & Integer.MAX_VALUE));
        }
    }

    public static void init(E e, F f8, Object obj, C0274u0 u0Var, boolean z) {
        e.ctx = f8;
        e.msg = obj;
        e.promise = u0Var;
        if (ESTIMATE_TASK_SIZE_ON_SUBMIT) {
            e.size = f8.pipeline.estimatorHandle().size(obj) + WRITE_TASK_OVERHEAD;
            f8.pipeline.incrementPendingOutboundBytes((long) e.size);
        } else {
            e.size = 0;
        }
        if (z) {
            e.size |= RecyclerView.UNDEFINED_DURATION;
        }
    }

    public static E newInstance(F f8, Object obj, C0274u0 u0Var, boolean z) {
        E e = (E) RECYCLER.get();
        init(e, f8, obj, u0Var, z);
        return e;
    }

    private void recycle() {
        this.ctx = null;
        this.msg = null;
        this.promise = null;
        this.handle.recycle(this);
    }

    public void cancel() {
        try {
            decrementPendingOutboundBytes();
        } finally {
            recycle();
        }
    }

    public void run() {
        try {
            decrementPendingOutboundBytes();
            if (this.size >= 0) {
                this.ctx.invokeWrite(this.msg, this.promise);
            } else {
                this.ctx.invokeWriteAndFlush(this.msg, this.promise);
            }
        } finally {
            recycle();
        }
    }

    private E(C0989w wVar) {
        this.handle = wVar;
    }
}
