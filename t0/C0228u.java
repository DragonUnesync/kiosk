package T0;

import D2.o;
import M0.C0129q;
import M0.O;
import M0.h0;
import M0.r;
import P0.h;
import U0.a;

/* renamed from: T0.u  reason: case insensitive filesystem */
public final /* synthetic */ class C0228u implements h {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4903U = 0;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ h0 f4904V;

    public /* synthetic */ C0228u(h0 h0Var) {
        this.f4904V = h0Var;
    }

    public final void a(Object obj) {
        switch (this.f4903U) {
            case 0:
                ((O) obj).E(this.f4904V);
                return;
            default:
                U0.h hVar = (U0.h) obj;
                o oVar = hVar.f5359o;
                h0 h0Var = this.f4904V;
                if (oVar != null) {
                    r rVar = (r) oVar.f1138W;
                    if (rVar.f3044v == -1) {
                        C0129q a8 = rVar.a();
                        a8.f3006t = h0Var.f2953a;
                        a8.f3007u = h0Var.f2954b;
                        hVar.f5359o = new o((Object) new r(a8), oVar.f1137V, (String) oVar.f1139X, 6);
                    }
                }
                int i = h0Var.f2953a;
                return;
        }
    }

    public /* synthetic */ C0228u(a aVar, h0 h0Var) {
        this.f4904V = h0Var;
    }
}
