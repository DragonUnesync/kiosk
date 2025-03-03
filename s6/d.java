package s6;

import B7.g;
import R.e;
import java.util.concurrent.Callable;
import l6.b;
import l6.c;
import p6.C1345a;
import x6.C1608a;

public final class d extends b {

    /* renamed from: V  reason: collision with root package name */
    public final b f15148V;

    /* renamed from: W  reason: collision with root package name */
    public final g f15149W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f15150X = true;

    /* renamed from: Y  reason: collision with root package name */
    public final int f15151Y = 64;

    /* renamed from: Z  reason: collision with root package name */
    public final int f15152Z;

    public d(b bVar, g gVar, int i) {
        C1345a.a(bVar, "source is null");
        this.f15148V = bVar;
        this.f15149W = gVar;
        this.f15152Z = i;
    }

    public final void d(c cVar) {
        C1608a aVar = C1608a.f16319U;
        b bVar = this.f15148V;
        boolean z = bVar instanceof Callable;
        g gVar = this.f15149W;
        if (z) {
            try {
                Object call = ((Callable) bVar).call();
                if (call == null) {
                    cVar.e(aVar);
                    cVar.b();
                    return;
                }
                try {
                    gVar.getClass();
                    b bVar2 = (b) call;
                    if (bVar2 instanceof Callable) {
                        try {
                            Object call2 = ((Callable) bVar2).call();
                            if (call2 == null) {
                                cVar.e(aVar);
                                cVar.b();
                                return;
                            }
                            cVar.e(new x6.b(cVar, call2));
                        } catch (Throwable th) {
                            e.v(th);
                            cVar.e(aVar);
                            cVar.a(th);
                        }
                    } else {
                        bVar2.a(cVar);
                    }
                } catch (Throwable th2) {
                    e.v(th2);
                    cVar.e(aVar);
                    cVar.a(th2);
                }
            } catch (Throwable th3) {
                e.v(th3);
                cVar.e(aVar);
                cVar.a(th3);
            }
        } else {
            c cVar2 = cVar;
            bVar.b(new c(cVar2, gVar, this.f15150X, this.f15151Y, this.f15152Z));
        }
    }
}
