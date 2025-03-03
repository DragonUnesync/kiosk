package Y1;

import E2.a;
import H3.O;
import M0.Q;
import M0.Y;
import M0.Z;
import T0.C0232y;
import android.view.View;
import k1.C1140i;
import k1.C1141j;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0373f f6455U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Q f6456V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Y f6457W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C0382o f6458X;

    public /* synthetic */ p(C0373f fVar, Q q7, Y y8, C0382o oVar) {
        this.f6455U = fVar;
        this.f6456V = q7;
        this.f6457W = y8;
        this.f6458X = oVar;
    }

    public final void onClick(View view) {
        C0373f fVar = this.f6455U;
        fVar.getClass();
        a aVar = (a) this.f6456V;
        if (aVar.e(29)) {
            C0232y yVar = (C0232y) aVar;
            C1141j F8 = yVar.F();
            F8.getClass();
            C1140i iVar = new C1140i(F8);
            C0382o oVar = this.f6458X;
            Z z = new Z(this.f6457W, O.r(Integer.valueOf(oVar.f6453b)));
            Y y8 = z.f2889a;
            iVar.a(y8.f2887c);
            iVar.f2912q.put(y8, z);
            iVar.f(oVar.f6452a.f2935b.f2887c);
            yVar.R(new C1141j(iVar));
            String str = oVar.f6454c;
            switch (fVar.f6433c) {
                case 0:
                    fVar.f6434d.f6493c0.f6447b[1] = str;
                    break;
            }
            fVar.f6432b.f6503h0.dismiss();
        }
    }
}
