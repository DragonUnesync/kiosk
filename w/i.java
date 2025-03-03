package w;

import android.os.Build;
import android.view.Surface;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final r f16153a;

    public i(int i, Surface surface) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            this.f16153a = new p(i, surface);
        } else if (i8 >= 28) {
            this.f16153a = new o(i, surface);
        } else if (i8 >= 26) {
            this.f16153a = new m(i, surface);
        } else if (i8 >= 24) {
            this.f16153a = new k(i, surface);
        } else {
            this.f16153a = new r(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f16153a.equals(((i) obj).f16153a);
    }

    public final int hashCode() {
        return this.f16153a.hashCode();
    }

    public i(k kVar) {
        this.f16153a = kVar;
    }
}
