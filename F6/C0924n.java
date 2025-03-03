package f6;

/* renamed from: f6.n  reason: case insensitive filesystem */
public final class C0924n implements Runnable {
    final /* synthetic */ C0909B val$future;
    final /* synthetic */ C0910C val$listener;

    public C0924n(C0909B b8, C0910C c8) {
        this.val$future = b8;
        this.val$listener = c8;
    }

    public void run() {
        r.notifyListener0(this.val$future, this.val$listener);
    }
}
