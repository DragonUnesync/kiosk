package f1;

import Q0.g;
import Y0.e;
import Y0.h;
import a1.C0410a;
import h1.X;
import l1.p;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final n f11580a;

    /* renamed from: b  reason: collision with root package name */
    public final p f11581b;

    /* renamed from: c  reason: collision with root package name */
    public final X f11582c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11583d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f11584f;

    public o(p pVar, t tVar, int i, C0410a aVar) {
        this.f11584f = pVar;
        this.f11581b = new p(g.m(i, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        X x8 = new X(pVar.f11585U, (h) null, (e) null);
        this.f11582c = x8;
        this.f11580a = new n(pVar, tVar, i, x8, aVar);
        x8.f12411f = pVar.f11587W;
    }

    public final void a() {
        if (!this.f11583d) {
            this.f11580a.f11577b.f11519d0 = true;
            this.f11583d = true;
            p.w(this.f11584f);
        }
    }

    public final void b() {
        this.f11581b.f(this.f11580a.f11577b, this.f11584f.f11587W, 0);
    }
}
