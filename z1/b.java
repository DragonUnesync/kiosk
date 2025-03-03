package Z1;

import java.util.concurrent.Executor;

public final /* synthetic */ class b implements Executor {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6953U;

    public /* synthetic */ b(int i) {
        this.f6953U = i;
    }

    private final void a(Runnable runnable) {
    }

    public final void execute(Runnable runnable) {
        switch (this.f6953U) {
            case 0:
                runnable.run();
                return;
            default:
                return;
        }
    }
}
