package H4;

import F4.b;
import T5.C0274u0;
import T5.M;
import T5.Y;
import Z5.i0;
import j$.util.Map;
import java.util.LinkedHashMap;

public final class c extends M {

    /* renamed from: U  reason: collision with root package name */
    public final LinkedHashMap f2151U;

    public c(LinkedHashMap linkedHashMap) {
        this.f2151U = linkedHashMap;
    }

    public final void write(Y y8, Object obj, C0274u0 u0Var) {
        if (obj instanceof i0) {
            Map.-EL.forEach(this.f2151U, new b(1, (i0) obj));
        }
        super.write(y8, obj, u0Var);
    }
}
