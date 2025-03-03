package h1;

import P0.c;
import Y0.e;
import g1.g;

/* renamed from: h1.D  reason: case insensitive filesystem */
public final /* synthetic */ class C1033D implements c {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12281U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ e f12282V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ C1053t f12283W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ g f12284X;

    public /* synthetic */ C1033D(e eVar, C1053t tVar, g gVar, int i) {
        this.f12281U = i;
        this.f12282V = eVar;
        this.f12283W = tVar;
        this.f12284X = gVar;
    }

    public final void accept(Object obj) {
        G g8 = (G) obj;
        switch (this.f12281U) {
            case 0:
                e eVar = this.f12282V;
                g8.x(eVar.f6315a, eVar.f6316b, this.f12283W, this.f12284X);
                return;
            case 1:
                e eVar2 = this.f12282V;
                g8.r(eVar2.f6315a, eVar2.f6316b, this.f12283W, this.f12284X);
                return;
            default:
                e eVar3 = this.f12282V;
                g8.g(eVar3.f6315a, eVar3.f6316b, this.f12283W, this.f12284X);
                return;
        }
    }
}
