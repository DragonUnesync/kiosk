package androidx.emoji2.text;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import q0.C1361h;
import v6.n;

public final class l implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7802U;

    public /* synthetic */ l(int i) {
        this.f7802U = i;
    }

    private final void a() {
    }

    public final void run() {
        boolean z;
        switch (this.f7802U) {
            case 0:
                try {
                    int i = C1361h.f14708a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.f7792k != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        j.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i8 = C1361h.f14708a;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                return;
            default:
                Iterator it = new ArrayList(n.f16136d.keySet()).iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        n.f16136d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.f7802U) {
            case 1:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
