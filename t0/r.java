package T0;

import M0.O;
import P0.h;

public final /* synthetic */ class r implements h {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4897U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ boolean f4898V;

    public /* synthetic */ r(boolean z, int i) {
        this.f4897U = i;
        this.f4898V = z;
    }

    public final void a(Object obj) {
        O o2 = (O) obj;
        switch (this.f4897U) {
            case 0:
                o2.A(this.f4898V);
                return;
            default:
                o2.l(this.f4898V);
                return;
        }
    }
}
