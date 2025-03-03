package D2;

import java.util.concurrent.ThreadFactory;
import r0.C1375i;

/* renamed from: D2.b  reason: case insensitive filesystem */
public final class C0073b implements ThreadFactory {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1062U;

    public /* synthetic */ C0073b(int i) {
        this.f1062U = i;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.f1062U) {
            case 0:
                return new Thread(new C0072a(runnable, 0), "glide-active-resources");
            case 1:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            default:
                return new C1375i(runnable);
        }
    }
}
