package S0;

import b1.C0521b;

public final class h extends Thread {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0521b f4393U;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(C0521b bVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f4393U = bVar;
    }

    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.f4393U.h());
    }
}
