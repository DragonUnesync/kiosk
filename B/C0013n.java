package B;

import F.h;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: B.n  reason: case insensitive filesystem */
public final /* synthetic */ class C0013n implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        h.l("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
