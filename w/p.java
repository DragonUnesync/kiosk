package w;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import n2.a;

public final class p extends o {
    public p(int i, Surface surface) {
        super((Object) new OutputConfiguration(i, surface));
    }

    public final Object c() {
        Object obj = this.f16169a;
        a.i(obj instanceof OutputConfiguration);
        return obj;
    }

    public final void g(long j7) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j7);
    }

    public final void h(int i) {
        ((OutputConfiguration) c()).setMirrorMode(i);
    }

    public final void j(long j7) {
        if (j7 != -1) {
            ((OutputConfiguration) c()).setStreamUseCase(j7);
        }
    }
}
