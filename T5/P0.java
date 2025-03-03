package T5;

import f6.C0910C;
import f6.C0929t;
import f6.r;
import g6.B;

public class P0 extends r implements C0274u0 {
    private final K channel;

    public P0(K k8) {
        this.channel = (K) B.checkNotNull(k8, "channel");
    }

    public K channel() {
        return this.channel;
    }

    public void checkDeadLock() {
        if (((C0260n) channel()).isRegistered()) {
            super.checkDeadLock();
        }
    }

    public C0929t executor() {
        C0929t executor = super.executor();
        if (executor == null) {
            return channel().eventLoop();
        }
        return executor;
    }

    public boolean isVoid() {
        return false;
    }

    public boolean trySuccess() {
        return trySuccess((Object) null);
    }

    public C0274u0 setFailure(Throwable th) {
        super.setFailure(th);
        return this;
    }

    public C0274u0 setSuccess() {
        return setSuccess((Void) null);
    }

    public P0(K k8, C0929t tVar) {
        super(tVar);
        this.channel = (K) B.checkNotNull(k8, "channel");
    }

    public C0274u0 await() {
        super.await();
        return this;
    }

    public C0274u0 removeListener(C0910C c8) {
        super.removeListener(c8);
        return this;
    }

    public C0274u0 setSuccess(Void voidR) {
        super.setSuccess(voidR);
        return this;
    }

    public C0274u0 addListener(C0910C c8) {
        super.addListener(c8);
        return this;
    }
}
