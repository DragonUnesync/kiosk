package f7;

import P6.f;
import P6.j;
import b7.C0595a;
import g7.n;
import java.io.IOException;

public final class i extends C0595a {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f11723f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f11724g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f11723f = obj;
        this.f11724g = obj2;
    }

    public final long a() {
        long a8;
        int i;
        w[] wVarArr;
        w[] wVarArr2;
        switch (this.e) {
            case 0:
                o oVar = (o) this.f11723f;
                oVar.f11738U.a(oVar, (C0936A) ((j) this.f11724g).f3955V);
                return -1;
            case 1:
                try {
                    ((o) this.f11723f).f11738U.b((w) this.f11724g);
                    return -1;
                } catch (IOException e8) {
                    n nVar = n.f12045a;
                    n.f12045a.getClass();
                    n.i(4, "Http2Connection.Listener failure for " + ((o) this.f11723f).f11740W, e8);
                    try {
                        ((w) this.f11724g).c(2, e8);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            default:
                k kVar = (k) this.f11723f;
                C0936A a9 = (C0936A) this.f11724g;
                kVar.getClass();
                j jVar = new j();
                o oVar2 = kVar.f11729V;
                synchronized (oVar2.f11759q0) {
                    synchronized (oVar2) {
                        try {
                            C0936A a10 = oVar2.f11754k0;
                            C0936A a11 = new C0936A();
                            a11.b(a10);
                            a11.b(a9);
                            jVar.f3955V = a11;
                            a8 = ((long) a11.a()) - ((long) a10.a());
                            i = (a8 > 0 ? 1 : (a8 == 0 ? 0 : -1));
                            if (i != 0) {
                                if (!oVar2.f11739V.isEmpty()) {
                                    wVarArr = (w[]) oVar2.f11739V.values().toArray(new w[0]);
                                    wVarArr2 = wVarArr;
                                    C0936A a12 = (C0936A) jVar.f3955V;
                                    f.e(a12, "<set-?>");
                                    oVar2.f11754k0 = a12;
                                    oVar2.f11747d0.c(new i(oVar2.f11740W + " onSettings", oVar2, jVar, 0), 0);
                                }
                            }
                            wVarArr = null;
                            wVarArr2 = wVarArr;
                            C0936A a122 = (C0936A) jVar.f3955V;
                            f.e(a122, "<set-?>");
                            oVar2.f11754k0 = a122;
                            oVar2.f11747d0.c(new i(oVar2.f11740W + " onSettings", oVar2, jVar, 0), 0);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f11759q0.k((C0936A) jVar.f3955V);
                    } catch (IOException e9) {
                        oVar2.k(2, 2, e9);
                    }
                }
                if (wVarArr2 == null) {
                    return -1;
                }
                for (w wVar : wVarArr2) {
                    synchronized (wVar) {
                        wVar.f11794f += a8;
                        if (i > 0) {
                            wVar.notifyAll();
                        }
                    }
                }
                return -1;
        }
    }
}
