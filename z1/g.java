package Z1;

import android.view.Choreographer;

public final /* synthetic */ class g implements Choreographer.FrameCallback {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ Runnable f6966U;

    public /* synthetic */ g(Runnable runnable) {
        this.f6966U = runnable;
    }

    public final void doFrame(long j7) {
        this.f6966U.run();
    }
}
