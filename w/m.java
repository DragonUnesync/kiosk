package w;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import n2.a;

public class m extends k {
    public m(int i, Surface surface) {
        super((Object) new l(new OutputConfiguration(i, surface)));
    }

    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    public Object c() {
        Object obj = this.f16169a;
        a.i(obj instanceof l);
        return ((l) obj).f16158a;
    }

    public String d() {
        return ((l) this.f16169a).f16159b;
    }

    public final boolean f() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    public void g(long j7) {
        ((l) this.f16169a).f16160c = j7;
    }

    public void i(String str) {
        ((l) this.f16169a).f16159b = str;
    }
}
