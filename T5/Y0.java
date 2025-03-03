package T5;

import f6.C0910C;
import g6.B;
import g6.C0969b0;
import h6.C1082c;
import h6.d;
import java.util.concurrent.TimeUnit;

public final class Y0 implements C0274u0, U {
    private static final C1082c logger = d.getInstance((Class<?>) Y0.class);
    private final C0274u0 delegate;
    private final boolean logNotifyFailure;

    public Y0(C0274u0 u0Var) {
        this(u0Var, !(u0Var instanceof v1));
    }

    public boolean cancel(boolean z) {
        return this.delegate.cancel(z);
    }

    public Throwable cause() {
        return this.delegate.cause();
    }

    public K channel() {
        return this.delegate.channel();
    }

    public boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    public boolean isDone() {
        return this.delegate.isDone();
    }

    public boolean isSuccess() {
        return this.delegate.isSuccess();
    }

    public boolean isVoid() {
        return this.delegate.isVoid();
    }

    public boolean setUncancellable() {
        return this.delegate.setUncancellable();
    }

    public boolean tryFailure(Throwable th) {
        return this.delegate.tryFailure(th);
    }

    public Y0(C0274u0 u0Var, boolean z) {
        this.delegate = (C0274u0) B.checkNotNull(u0Var, "delegate");
        this.logNotifyFailure = z;
    }

    public Void getNow() {
        return (Void) this.delegate.getNow();
    }

    public void operationComplete(P p3) {
        C1082c cVar = this.logNotifyFailure ? logger : null;
        if (p3.isSuccess()) {
            C0969b0.trySuccess(this.delegate, (Void) p3.get(), cVar);
        } else if (p3.isCancelled()) {
            C0969b0.tryCancel(this.delegate, cVar);
        } else {
            C0969b0.tryFailure(this.delegate, p3.cause(), cVar);
        }
    }

    public C0274u0 removeListener(C0910C c8) {
        this.delegate.removeListener(c8);
        return this;
    }

    public C0274u0 setFailure(Throwable th) {
        this.delegate.setFailure(th);
        return this;
    }

    public C0274u0 setSuccess(Void voidR) {
        this.delegate.setSuccess(voidR);
        return this;
    }

    public boolean trySuccess() {
        return this.delegate.trySuccess();
    }

    public Void get() {
        return (Void) this.delegate.get();
    }

    public C0274u0 setSuccess() {
        this.delegate.setSuccess();
        return this;
    }

    public boolean trySuccess(Void voidR) {
        return this.delegate.trySuccess(voidR);
    }

    public C0274u0 addListener(C0910C c8) {
        this.delegate.addListener(c8);
        return this;
    }

    public Void get(long j7, TimeUnit timeUnit) {
        return (Void) this.delegate.get(j7, timeUnit);
    }
}
