package androidx.lifecycle;

public final class DefaultLifecycleObserverAdapter implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final C0477d f8105U;

    /* renamed from: V  reason: collision with root package name */
    public final C0489p f8106V;

    public DefaultLifecycleObserverAdapter(C0477d dVar, C0489p pVar) {
        this.f8105U = dVar;
        this.f8106V = pVar;
    }

    public final void c(r rVar, C0485l lVar) {
        int i = C0478e.f8143a[lVar.ordinal()];
        C0477d dVar = this.f8105U;
        if (i == 3) {
            dVar.onResume(rVar);
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0489p pVar = this.f8106V;
        if (pVar != null) {
            pVar.c(rVar, lVar);
        }
    }
}
