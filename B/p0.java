package B;

import D.N;
import G.i;
import L3.b;
import android.util.Size;
import android.view.Surface;

public final class p0 extends N {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f296o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Object f297p;

    public p0(Surface surface, Size size, int i) {
        super(size, i);
        this.f297p = surface;
    }

    public final b f() {
        switch (this.f296o) {
            case 0:
                return ((t0) this.f297p).f310f;
            default:
                return i.c((Surface) this.f297p);
        }
    }

    public p0(Surface surface) {
        super(N.f818k, 0);
        this.f297p = surface;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(t0 t0Var, Size size) {
        super(size, 34);
        this.f297p = t0Var;
    }
}
