package w;

import B.C0022x;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import k2.C1160q;
import n2.a;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1160q f16149a = new C1160q(27, new Object());

    /* renamed from: b  reason: collision with root package name */
    public static final Set f16150b = Collections.singleton(C0022x.f360d);

    public final DynamicRangeProfiles a() {
        return null;
    }

    public final Set b() {
        return f16150b;
    }

    public final Set c(C0022x xVar) {
        boolean equals = C0022x.f360d.equals(xVar);
        a.h("DynamicRange is not supported: " + xVar, equals);
        return f16150b;
    }
}
