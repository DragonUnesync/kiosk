package androidx.activity;

import P6.f;
import androidx.fragment.app.D;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;

final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements C0489p, c {

    /* renamed from: U  reason: collision with root package name */
    public final t f7268U;

    /* renamed from: V  reason: collision with root package name */
    public final D f7269V;

    /* renamed from: W  reason: collision with root package name */
    public s f7270W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ u f7271X;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(u uVar, t tVar, D d8) {
        f.e(d8, "onBackPressedCallback");
        this.f7271X = uVar;
        this.f7268U = tVar;
        this.f7269V = d8;
        tVar.a(this);
    }

    public final void c(r rVar, C0485l lVar) {
        if (lVar == C0485l.ON_START) {
            u uVar = this.f7271X;
            uVar.getClass();
            D d8 = this.f7269V;
            f.e(d8, "onBackPressedCallback");
            uVar.f7350b.addLast(d8);
            s sVar = new s(uVar, d8);
            d8.f7839b.add(sVar);
            uVar.d();
            d8.f7840c = new t(1, uVar);
            this.f7270W = sVar;
        } else if (lVar == C0485l.ON_STOP) {
            s sVar2 = this.f7270W;
            if (sVar2 != null) {
                sVar2.cancel();
            }
        } else if (lVar == C0485l.ON_DESTROY) {
            cancel();
        }
    }

    public final void cancel() {
        this.f7268U.f(this);
        this.f7269V.f7839b.remove(this);
        s sVar = this.f7270W;
        if (sVar != null) {
            sVar.cancel();
        }
        this.f7270W = null;
    }
}
