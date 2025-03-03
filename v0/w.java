package V0;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class w implements Executor {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ Handler f5609U;

    public /* synthetic */ w(Handler handler) {
        this.f5609U = handler;
    }

    public final void execute(Runnable runnable) {
        this.f5609U.post(runnable);
    }
}
