package M;

import B.C0007h;
import D.M;
import G.a;
import G.k;
import L3.b;
import android.view.Surface;

public final /* synthetic */ class i implements a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ k f2750U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ j f2751V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f2752W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C0007h f2753X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0007h f2754Y;

    public /* synthetic */ i(k kVar, j jVar, int i, C0007h hVar, C0007h hVar2) {
        this.f2750U = kVar;
        this.f2751V = jVar;
        this.f2752W = i;
        this.f2753X = hVar;
        this.f2754Y = hVar2;
    }

    public final b apply(Object obj) {
        boolean z;
        j jVar = this.f2751V;
        Surface surface = (Surface) obj;
        k kVar = this.f2750U;
        kVar.getClass();
        surface.getClass();
        try {
            jVar.d();
            l lVar = new l(surface, this.f2752W, kVar.f2764g.f904a, this.f2753X, this.f2754Y);
            lVar.f2781d0.f7017V.d(new g(jVar, 1), D7.b.l());
            if (jVar.f2758r == null) {
                z = true;
            } else {
                z = false;
            }
            n2.a.m("Consumer can only be linked once.", z);
            jVar.f2758r = lVar;
            return G.i.c(lVar);
        } catch (M e) {
            return new k(1, e);
        }
    }
}
