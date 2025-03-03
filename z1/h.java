package Z1;

import android.view.Choreographer;

public abstract class h {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new g(runnable));
    }
}
