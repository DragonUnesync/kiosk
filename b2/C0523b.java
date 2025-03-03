package b2;

import P6.f;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.r;

/* renamed from: b2.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0523b implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0526e f8647U;

    public /* synthetic */ C0523b(C0526e eVar) {
        this.f8647U = eVar;
    }

    public final void c(r rVar, C0485l lVar) {
        C0526e eVar = this.f8647U;
        f.e(eVar, "this$0");
        if (lVar == C0485l.ON_START) {
            eVar.f8650c = true;
        } else if (lVar == C0485l.ON_STOP) {
            eVar.f8650c = false;
        }
    }
}
