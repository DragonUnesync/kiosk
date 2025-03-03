package H;

import B.C0008i;
import B.C0009j;
import M.c;
import M.e;
import M.l;
import N.f;
import O.i;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import u0.C1486a;

public final /* synthetic */ class d implements C1486a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1766a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1767b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1768c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f1766a = i;
        this.f1767b = obj;
        this.f1768c = obj2;
    }

    public final void accept(Object obj) {
        switch (this.f1766a) {
            case 0:
                C0009j jVar = (C0009j) obj;
                ((Surface) this.f1767b).release();
                ((SurfaceTexture) this.f1768c).release();
                return;
            case 1:
                C0008i iVar = (C0008i) obj;
                c cVar = (c) this.f1767b;
                cVar.getClass();
                l lVar = (l) this.f1768c;
                lVar.close();
                Surface surface = (Surface) cVar.f2726b0.remove(lVar);
                if (surface != null) {
                    e eVar = cVar.f2719U;
                    i.d(eVar.f2732a, true);
                    i.c(eVar.f2734c);
                    eVar.i(surface, true);
                    return;
                }
                return;
            default:
                C0008i iVar2 = (C0008i) obj;
                f fVar = (f) this.f1767b;
                fVar.getClass();
                l lVar2 = (l) this.f1768c;
                lVar2.close();
                Surface surface2 = (Surface) fVar.f3219b0.remove(lVar2);
                if (surface2 != null) {
                    N.c cVar2 = fVar.f3212U;
                    i.d(cVar2.f2732a, true);
                    i.c(cVar2.f2734c);
                    cVar2.i(surface2, true);
                    return;
                }
                return;
        }
    }
}
