package androidx.activity;

import D6.g;
import P6.f;
import androidx.fragment.app.D;

public final class s implements c {

    /* renamed from: U  reason: collision with root package name */
    public final D f7345U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ u f7346V;

    public s(u uVar, D d8) {
        f.e(d8, "onBackPressedCallback");
        this.f7346V = uVar;
        this.f7345U = d8;
    }

    public final void cancel() {
        u uVar = this.f7346V;
        g gVar = uVar.f7350b;
        D d8 = this.f7345U;
        gVar.remove((Object) d8);
        if (f.a(uVar.f7351c, d8)) {
            d8.a();
            uVar.f7351c = null;
        }
        d8.f7839b.remove(this);
        t tVar = d8.f7840c;
        if (tVar != null) {
            tVar.invoke();
        }
        d8.f7840c = null;
    }
}
