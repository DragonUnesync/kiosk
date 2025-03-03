package androidx.lifecycle;

import N5.m;

class LiveData$LifecycleBoundObserver extends w implements C0489p {

    /* renamed from: Y  reason: collision with root package name */
    public final r f8127Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ x f8128Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(x xVar, r rVar, m mVar) {
        super(xVar, mVar);
        this.f8128Z = xVar;
        this.f8127Y = rVar;
    }

    public final void b() {
        this.f8127Y.e().f(this);
    }

    public final void c(r rVar, C0485l lVar) {
        r rVar2 = this.f8127Y;
        C0486m mVar = rVar2.e().f8156c;
        if (mVar == C0486m.f8145U) {
            this.f8128Z.i(this.f8163U);
            return;
        }
        C0486m mVar2 = null;
        while (mVar2 != mVar) {
            a(e());
            mVar2 = mVar;
            mVar = rVar2.e().f8156c;
        }
    }

    public final boolean d(r rVar) {
        if (this.f8127Y == rVar) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f8127Y.e().f8156c.compareTo(C0486m.f8148X) >= 0) {
            return true;
        }
        return false;
    }
}
