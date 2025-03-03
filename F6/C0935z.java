package f6;

import g6.B;

/* renamed from: f6.z  reason: case insensitive filesystem */
public final class C0935z implements Runnable {
    private final Runnable runnable;

    private C0935z(Runnable runnable2) {
        this.runnable = (Runnable) B.checkNotNull(runnable2, "runnable");
    }

    public static Runnable wrap(Runnable runnable2) {
        if (runnable2 instanceof C0935z) {
            return runnable2;
        }
        return new C0935z(runnable2);
    }

    public void run() {
        try {
            this.runnable.run();
        } finally {
            C0934y.removeAll();
        }
    }
}
