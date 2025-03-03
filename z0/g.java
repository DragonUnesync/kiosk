package Z0;

import android.os.SystemClock;
import i1.k;
import java.util.List;
import k1.C1134c;

public final class g extends C1134c {

    /* renamed from: g  reason: collision with root package name */
    public int f6784g;

    public final void b(long j7, long j8, long j9, List list, k[] kVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(this.f6784g, elapsedRealtime)) {
            for (int i = this.f12921b - 1; i >= 0; i--) {
                if (!d(i, elapsedRealtime)) {
                    this.f6784g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    public final int n() {
        return 0;
    }

    public final int o() {
        return this.f6784g;
    }

    public final Object r() {
        return null;
    }
}
