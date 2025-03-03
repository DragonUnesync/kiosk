package T5;

import e6.z;
import f6.C0928s;
import f6.J;
import g6.p0;
import h6.C1082c;
import h6.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public abstract class h1 extends J implements a1 {
    private static final int DEFAULT_EVENT_LOOP_THREADS;
    private static final C1082c logger;

    static {
        C1082c instance = d.getInstance((Class<?>) h1.class);
        logger = instance;
        int max = Math.max(1, p0.getInt("io.netty.eventLoopThreads", z.availableProcessors() * 2));
        DEFAULT_EVENT_LOOP_THREADS = max;
        if (instance.isDebugEnabled()) {
            instance.debug("-Dio.netty.eventLoopThreads: {}", (Object) Integer.valueOf(max));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h1(int i, Executor executor, Object... objArr) {
        super(i == 0 ? DEFAULT_EVENT_LOOP_THREADS : i, executor, objArr);
    }

    public ThreadFactory newDefaultThreadFactory() {
        return new C0928s(getClass(), 10);
    }

    public P register(K k8) {
        return ((r1) next()).register(k8);
    }

    public Z0 next() {
        return (Z0) super.next();
    }
}
