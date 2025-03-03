package D4;

import V4.a;
import com.bumptech.glide.c;
import l5.C1179a;
import l6.g;
import m4.C1214b;
import o6.C1326b;
import s6.e;

public final class b extends c {

    /* renamed from: U  reason: collision with root package name */
    public final C1214b f1206U;

    /* renamed from: V  reason: collision with root package name */
    public final a f1207V;

    public b(C1214b bVar, a aVar) {
        this.f1206U = bVar;
        this.f1207V = aVar;
    }

    public final void y(g gVar) {
        j5.b b8 = this.f1206U.b();
        b8.getClass();
        if (j5.b.f12895Z.contains(b8)) {
            c cVar = (c) ((B6.a) this.f1206U.f13360f.e).get();
            f fVar = cVar.f1211X;
            a aVar = new a(gVar, this.f1206U, cVar);
            gVar.c(aVar);
            g gVar2 = new g(this.f1207V, aVar);
            int i = l6.b.f13197U;
            e eVar = new e(gVar2);
            synchronized (fVar) {
                while (fVar.f1229W == 0) {
                    try {
                        fVar.wait();
                    } catch (InterruptedException e) {
                        f.f1227X.error("thread interrupted while waiting to publish.", e);
                        return;
                    }
                }
                fVar.f1228V.f(eVar);
                fVar.f1229W--;
            }
            return;
        }
        C1179a z = Q7.g.z();
        gVar.c(C1326b.f14277U);
        gVar.a(z);
    }
}
