package A;

import F.i;
import a0.j;
import a0.k;

public final /* synthetic */ class a implements k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f0U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ e f1V;

    public /* synthetic */ a(e eVar, int i) {
        this.f0U = i;
        this.f1V = eVar;
    }

    public final Object h(j jVar) {
        switch (this.f0U) {
            case 0:
                e eVar = this.f1V;
                eVar.getClass();
                ((i) eVar.f13d).execute(new c(eVar, jVar, 1));
                return "addCaptureRequestOptions";
            default:
                e eVar2 = this.f1V;
                eVar2.getClass();
                ((i) eVar2.f13d).execute(new c(eVar2, jVar, 0));
                return "clearCaptureRequestOptions";
        }
    }
}
