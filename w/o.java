package w;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import n2.a;

public class o extends m {
    public o(int i, Surface surface) {
        super((Object) new n(new OutputConfiguration(i, surface)));
    }

    public Object c() {
        Object obj = this.f16169a;
        a.i(obj instanceof n);
        return ((n) obj).f16161a;
    }

    public final String d() {
        return null;
    }

    public void g(long j7) {
        ((n) this.f16169a).f16162b = j7;
    }

    public final void i(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }
}
