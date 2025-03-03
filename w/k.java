package w;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import n2.a;

public class k extends r {
    public k(int i, Surface surface) {
        super((Object) new j(new OutputConfiguration(i, surface)));
    }

    public void b() {
        ((j) this.f16169a).f16156c = true;
    }

    public Object c() {
        Object obj = this.f16169a;
        a.i(obj instanceof j);
        return ((j) obj).f16154a;
    }

    public String d() {
        return ((j) this.f16169a).f16155b;
    }

    public final Surface e() {
        return ((OutputConfiguration) c()).getSurface();
    }

    public boolean f() {
        return ((j) this.f16169a).f16156c;
    }

    public void g(long j7) {
        ((j) this.f16169a).f16157d = j7;
    }

    public void i(String str) {
        ((j) this.f16169a).f16155b = str;
    }
}
