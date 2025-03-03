package A6;

import java.util.concurrent.Callable;

public final class b implements Callable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f125U;

    public /* synthetic */ b(int i) {
        this.f125U = i;
    }

    public final Object call() {
        switch (this.f125U) {
            case 0:
                return a.f124a;
            case 1:
                return c.f126a;
            case 2:
                return d.f127a;
            default:
                return e.f128a;
        }
    }
}
