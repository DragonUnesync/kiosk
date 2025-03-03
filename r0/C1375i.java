package r0;

import android.os.Process;

/* renamed from: r0.i  reason: case insensitive filesystem */
public final class C1375i extends Thread {

    /* renamed from: U  reason: collision with root package name */
    public final int f14813U = 10;

    public C1375i(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public final void run() {
        Process.setThreadPriority(this.f14813U);
        super.run();
    }
}
