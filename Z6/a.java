package Z6;

import P6.f;
import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ String f6980U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ boolean f6981V;

    public /* synthetic */ a(String str, boolean z) {
        this.f6980U = str;
        this.f6981V = z;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f6980U;
        f.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f6981V);
        return thread;
    }
}
