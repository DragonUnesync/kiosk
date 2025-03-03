package R5;

import T5.K;
import T5.P0;
import f6.C0929t;
import f6.G;

public final class a extends P0 {
    private volatile boolean registered;

    public a(K k8) {
        super(k8);
    }

    public C0929t executor() {
        if (this.registered) {
            return super.executor();
        }
        return G.INSTANCE;
    }

    public void registered() {
        this.registered = true;
    }
}
