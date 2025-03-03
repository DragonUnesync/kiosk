package T5;

import f6.C0910C;
import f6.C0913c;
import g6.B;
import java.util.concurrent.TimeUnit;

public final class v1 extends C0913c implements C0274u0 {
    private final K channel;
    private final U fireExceptionListener;

    public v1(K k8, boolean z) {
        B.checkNotNull(k8, "channel");
        this.channel = k8;
        if (z) {
            this.fireExceptionListener = new u1(this);
        } else {
            this.fireExceptionListener = null;
        }
    }

    private static void fail() {
        throw new IllegalStateException("void future");
    }

    /* access modifiers changed from: private */
    public void fireException0(Throwable th) {
        if (this.fireExceptionListener != null && ((C0260n) this.channel).isRegistered()) {
            ((O0) ((C0260n) this.channel).pipeline()).fireExceptionCaught(th);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public Throwable cause() {
        return null;
    }

    public K channel() {
        return this.channel;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }

    public boolean isSuccess() {
        return false;
    }

    public boolean isVoid() {
        return true;
    }

    public boolean setUncancellable() {
        return true;
    }

    public boolean tryFailure(Throwable th) {
        fireException0(th);
        return false;
    }

    public v1 await() {
        if (!Thread.interrupted()) {
            return this;
        }
        throw new InterruptedException();
    }

    public Void getNow() {
        return null;
    }

    public boolean trySuccess() {
        return false;
    }

    public v1 removeListener(C0910C c8) {
        return this;
    }

    public v1 setFailure(Throwable th) {
        fireException0(th);
        return this;
    }

    public boolean trySuccess(Void voidR) {
        return false;
    }

    public boolean await(long j7, TimeUnit timeUnit) {
        fail();
        return false;
    }

    public v1 setSuccess() {
        return this;
    }

    public v1 addListener(C0910C c8) {
        fail();
        return this;
    }

    public v1 setSuccess(Void voidR) {
        return this;
    }
}
