package de.ozerov.fully;

import android.content.Intent;
import android.os.IBinder;
import java.util.Timer;

public class TaskProtectorService extends I {

    /* renamed from: V  reason: collision with root package name */
    public Timer f10364V;

    /* renamed from: W  reason: collision with root package name */
    public Z3 f10365W;

    public final synchronized void a() {
        try {
            Z3 z32 = this.f10365W;
            if (z32 != null) {
                z32.b();
                this.f10365W = null;
            }
            Timer timer = this.f10364V;
            if (timer != null) {
                timer.cancel();
                this.f10364V.purge();
                this.f10364V = null;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f10005U;
    }

    public final boolean onUnbind(Intent intent) {
        a();
        return super.onUnbind(intent);
    }
}
