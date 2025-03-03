package a0;

public final class l extends i {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ m f7015b0;

    public l(m mVar) {
        this.f7015b0 = mVar;
    }

    public final String g() {
        j jVar = (j) this.f7015b0.f7016U.get();
        if (jVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + jVar.f7011a + "]";
    }
}
