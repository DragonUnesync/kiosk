package C;

import B.C0009j;
import B.C0010k;
import D.O;
import E.f;
import M.h;
import M.k;
import O.b;
import a0.j;
import g7.l;
import java.util.Map;
import u0.C1486a;

public final /* synthetic */ class d implements C1486a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f483a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f484b;

    public /* synthetic */ d(int i, Object obj) {
        this.f483a = i;
        this.f484b = obj;
    }

    public final void accept(Object obj) {
        switch (this.f483a) {
            case 0:
                b bVar = (b) obj;
                ((A1.d) this.f484b).getClass();
                l.a();
                return;
            case 1:
                C0010k kVar = (C0010k) obj;
                for (Map.Entry entry : ((Map) this.f484b).entrySet()) {
                    int i = kVar.f272b - ((b) entry.getKey()).f3471f;
                    if (((b) entry.getKey()).f3472g) {
                        i = -i;
                    }
                    int f8 = f.f(i);
                    k kVar2 = (k) entry.getValue();
                    kVar2.getClass();
                    l.n(new h(kVar2, f8, -1));
                }
                return;
            case 2:
                C0009j jVar = (C0009j) obj;
                F.h.j("SurfaceViewImpl", "Safe to release surface.");
                O o2 = (O) this.f484b;
                if (o2 != null) {
                    o2.a();
                    return;
                }
                return;
            default:
                ((j) this.f484b).a((C0009j) obj);
                return;
        }
    }
}
