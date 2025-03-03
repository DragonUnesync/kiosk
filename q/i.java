package Q;

import D.C0069x;
import D.S;
import E.f;
import java.util.UUID;

public final class i extends S {

    /* renamed from: b  reason: collision with root package name */
    public final String f4007b;

    /* renamed from: c  reason: collision with root package name */
    public int f4008c;

    public i(C0069x xVar) {
        super(xVar);
        this.f4007b = "virtual-" + xVar.e() + "-" + UUID.randomUUID().toString();
    }

    public final int c() {
        return g(0);
    }

    public final String e() {
        return this.f4007b;
    }

    public final int g(int i) {
        return f.f(this.f846a.g(i) - this.f4008c);
    }
}
