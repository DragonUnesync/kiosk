package androidx.lifecycle;

import P6.f;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public C0486m f8152a;

    /* renamed from: b  reason: collision with root package name */
    public C0489p f8153b;

    public final void a(r rVar, C0485l lVar) {
        C0486m a8 = lVar.a();
        C0486m mVar = this.f8152a;
        f.e(mVar, "state1");
        if (a8.compareTo(mVar) < 0) {
            mVar = a8;
        }
        this.f8152a = mVar;
        this.f8153b.c(rVar, lVar);
        this.f8152a = a8;
    }
}
