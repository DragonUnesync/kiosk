package e6;

import g6.B;
import g6.p0;
import java.util.Locale;

/* renamed from: e6.y  reason: case insensitive filesystem */
public final class C0865y {
    private int availableProcessors;

    public synchronized int availableProcessors() {
        try {
            if (this.availableProcessors == 0) {
                setAvailableProcessors(p0.getInt("io.netty.availableProcessors", Runtime.getRuntime().availableProcessors()));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.availableProcessors;
    }

    public synchronized void setAvailableProcessors(int i) {
        B.checkPositive(i, "availableProcessors");
        int i8 = this.availableProcessors;
        if (i8 == 0) {
            this.availableProcessors = i;
        } else {
            Locale locale = Locale.ROOT;
            throw new IllegalStateException("availableProcessors is already set to [" + i8 + "], rejecting [" + i + "]");
        }
    }
}
