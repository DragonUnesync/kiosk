package B;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public final class N extends A {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ int f189X = 1;

    /* renamed from: Y  reason: collision with root package name */
    public final Object f190Y;

    public N(W w2) {
        super(w2);
        this.f190Y = new AtomicBoolean(false);
    }

    public void close() {
        switch (this.f189X) {
            case 1:
                if (!((AtomicBoolean) this.f190Y).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public N(W w2, O o2) {
        super(w2);
        this.f190Y = new WeakReference(o2);
        k(new M(0, this));
    }
}
