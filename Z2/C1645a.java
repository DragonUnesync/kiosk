package z2;

import java.util.concurrent.ThreadFactory;

/* renamed from: z2.a  reason: case insensitive filesystem */
public final class C1645a implements ThreadFactory {
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
