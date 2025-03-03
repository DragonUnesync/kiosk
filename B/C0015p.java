package B;

import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u.C1468i;

/* renamed from: B.p  reason: case insensitive filesystem */
public final class C0015p implements Executor {

    /* renamed from: W  reason: collision with root package name */
    public static final C0014o f293W = new C0014o(0);

    /* renamed from: U  reason: collision with root package name */
    public final Object f294U = new Object();

    /* renamed from: V  reason: collision with root package name */
    public ThreadPoolExecutor f295V;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public C0015p() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f293W);
        threadPoolExecutor.setRejectedExecutionHandler(new Object());
        this.f295V = threadPoolExecutor;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public final void a(C1468i iVar) {
        ThreadPoolExecutor threadPoolExecutor;
        iVar.getClass();
        synchronized (this.f294U) {
            try {
                if (this.f295V.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f293W);
                    threadPoolExecutor2.setRejectedExecutionHandler(new Object());
                    this.f295V = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f295V;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        int max = Math.max(1, new LinkedHashSet(iVar.f15651f).size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f294U) {
            this.f295V.execute(runnable);
        }
    }
}
