package o;

import n.C1222C;

/* renamed from: o.G  reason: case insensitive filesystem */
public final class C1254G extends C1303x0 {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ L f13812d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ P f13813e0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1254G(P p3, P p8, L l8) {
        super(p8);
        this.f13813e0 = p3;
        this.f13812d0 = l8;
    }

    public final C1222C b() {
        return this.f13812d0;
    }

    public final boolean c() {
        P p3 = this.f13813e0;
        if (p3.getInternalPopup().b()) {
            return true;
        }
        p3.f13878c0.k(p3.getTextDirection(), p3.getTextAlignment());
        return true;
    }
}
