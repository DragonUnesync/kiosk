package C3;

import android.view.View;

/* renamed from: C3.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0026b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f576a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f577b;

    public /* synthetic */ C0026b(t tVar, int i) {
        this.f576a = i;
        this.f577b = tVar;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.f576a) {
            case 0:
                C0029e eVar = (C0029e) this.f577b;
                eVar.t(eVar.u());
                return;
            default:
                n nVar = (n) this.f577b;
                nVar.f604l = z;
                nVar.q();
                if (!z) {
                    nVar.t(false);
                    nVar.f605m = false;
                    return;
                }
                return;
        }
    }
}
