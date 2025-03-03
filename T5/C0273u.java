package T5;

/* renamed from: T5.u  reason: case insensitive filesystem */
public final class C0273u implements Runnable {
    final /* synthetic */ Throwable val$cause;
    final /* synthetic */ F val$next;

    public C0273u(F f8, Throwable th) {
        this.val$next = f8;
        this.val$cause = th;
    }

    public void run() {
        this.val$next.invokeExceptionCaught(this.val$cause);
    }
}
