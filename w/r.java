package w;

import android.view.Surface;
import j$.util.Objects;
import java.util.List;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16169a;

    public r(Surface surface) {
        this.f16169a = new q(surface);
    }

    public void a(Surface surface) {
        if (e() == surface) {
            throw new IllegalStateException("Surface is already added!");
        } else if (!f()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        } else {
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
    }

    public void b() {
        ((q) this.f16169a).f16167f = true;
    }

    public Object c() {
        return null;
    }

    public String d() {
        return ((q) this.f16169a).e;
    }

    public Surface e() {
        List list = ((q) this.f16169a).f16163a;
        if (list.size() == 0) {
            return null;
        }
        return (Surface) list.get(0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        return Objects.equals(this.f16169a, ((r) obj).f16169a);
    }

    public boolean f() {
        return ((q) this.f16169a).f16167f;
    }

    public void g(long j7) {
        ((q) this.f16169a).f16168g = j7;
    }

    public void h(int i) {
    }

    public final int hashCode() {
        return this.f16169a.hashCode();
    }

    public void i(String str) {
        ((q) this.f16169a).e = str;
    }

    public void j(long j7) {
    }

    public r(Object obj) {
        this.f16169a = obj;
    }
}
