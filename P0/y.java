package P0;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class y implements ThreadFactory {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3746U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ String f3747V;

    public /* synthetic */ y(String str, int i) {
        this.f3746U = i;
        this.f3747V = str;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.f3746U) {
            case 0:
                return new Thread(runnable, this.f3747V);
            default:
                Thread thread = new Thread(runnable, this.f3747V);
                thread.setPriority(10);
                return thread;
        }
    }
}
