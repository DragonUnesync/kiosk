package D2;

import android.os.Process;

/* renamed from: D2.a  reason: case insensitive filesystem */
public final class C0072a implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1060U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Runnable f1061V;

    public /* synthetic */ C0072a(Runnable runnable, int i) {
        this.f1060U = i;
        this.f1061V = runnable;
    }

    public final void run() {
        switch (this.f1060U) {
            case 0:
                Process.setThreadPriority(10);
                this.f1061V.run();
                return;
            default:
                this.f1061V.run();
                return;
        }
    }
}
