package T5;

import f6.W;
import f6.d0;
import g6.B;
import g6.p0;
import java.util.Queue;
import java.util.concurrent.Executor;

public abstract class r1 extends d0 implements Z0 {
    protected static final int DEFAULT_MAX_PENDING_TASKS = Math.max(16, p0.getInt("io.netty.eventLoop.maxPendingTasks", Integer.MAX_VALUE));
    private final Queue<Runnable> tailTasks;

    public r1(a1 a1Var, Executor executor, boolean z, Queue<Runnable> queue, Queue<Runnable> queue2, W w2) {
        super(a1Var, executor, z, queue, w2);
        this.tailTasks = (Queue) B.checkNotNull(queue2, "tailTaskQueue");
    }

    public void afterRunningAllTasks() {
        runAllTasksFrom(this.tailTasks);
    }

    public boolean hasTasks() {
        if (super.hasTasks() || !this.tailTasks.isEmpty()) {
            return true;
        }
        return false;
    }

    public P register(K k8) {
        return register((C0274u0) new P0(k8, this));
    }

    public Z0 next() {
        return (Z0) super.next();
    }

    public P register(C0274u0 u0Var) {
        B.checkNotNull(u0Var, "promise");
        ((C0250i) u0Var.channel().unsafe()).register(this, u0Var);
        return u0Var;
    }
}
