package B;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: B.o  reason: case insensitive filesystem */
public final class C0014o implements ThreadFactory {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f288U;

    /* renamed from: V  reason: collision with root package name */
    public final AtomicInteger f289V;

    public C0014o(int i) {
        this.f288U = i;
        switch (i) {
            case 1:
                this.f289V = new AtomicInteger(0);
                return;
            case 2:
                this.f289V = new AtomicInteger(0);
                return;
            default:
                this.f289V = new AtomicInteger(0);
                return;
        }
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.f288U) {
            case 0:
                Thread thread = new Thread(runnable);
                Locale locale = Locale.US;
                int andIncrement = this.f289V.getAndIncrement();
                thread.setName("CameraX-core_camera_" + andIncrement);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                int andIncrement2 = this.f289V.getAndIncrement();
                thread2.setName("CameraX-camerax_io_" + andIncrement2);
                return thread2;
            default:
                Thread thread3 = new Thread(runnable);
                thread3.setName("arch_disk_io_" + this.f289V.getAndIncrement());
                return thread3;
        }
    }
}
