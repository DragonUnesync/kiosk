package R;

import F.h;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

public final class d extends e {

    /* renamed from: d  reason: collision with root package name */
    public static ExtensionVersionImpl f4232d;

    /* renamed from: c  reason: collision with root package name */
    public final a f4233c;

    public d() {
        if (f4232d == null) {
            f4232d = new ExtensionVersionImpl();
        }
        a c8 = a.c(f4232d.checkApiVersion(b.a().d()));
        if (c8 != null && b.a().b().b() == c8.b()) {
            this.f4233c = c8;
        }
        h.j("ExtenderVersion", "Selected vendor runtime: " + this.f4233c);
    }

    public final a i() {
        return this.f4233c;
    }
}
