package T5;

import f6.C0910C;
import f6.C0918h;
import f6.C0929t;
import g6.B;

/* renamed from: T5.z0  reason: case insensitive filesystem */
public abstract class C0284z0 extends C0918h implements P {
    private final K channel;

    public C0284z0(K k8, C0929t tVar) {
        super(tVar);
        this.channel = (K) B.checkNotNull(k8, "channel");
    }

    public K channel() {
        return this.channel;
    }

    public C0929t executor() {
        C0929t executor = super.executor();
        if (executor == null) {
            return channel().eventLoop();
        }
        return executor;
    }

    public P addListener(C0910C c8) {
        super.addListener(c8);
        return this;
    }

    public P await() {
        return this;
    }

    public Void getNow() {
        return null;
    }

    public P removeListener(C0910C c8) {
        super.removeListener(c8);
        return this;
    }
}
