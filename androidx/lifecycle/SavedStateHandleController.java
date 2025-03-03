package androidx.lifecycle;

public final class SavedStateHandleController implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public boolean f8135U;

    public final void c(r rVar, C0485l lVar) {
        if (lVar == C0485l.ON_DESTROY) {
            this.f8135U = false;
            rVar.e().f(this);
        }
    }
}
