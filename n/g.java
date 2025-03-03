package N;

import C7.d;
import D.C0;
import D.C0048i;
import D.C0071z;
import D.L0;
import M.k;
import java.util.List;
import java.util.Map;
import u.C1479t;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3222U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f3223V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f3224W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f3225X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f3226Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f3227Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ Object f3228a0;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f3222U = i;
        this.f3223V = obj;
        this.f3224W = obj2;
        this.f3225X = obj3;
        this.f3226Y = obj4;
        this.f3227Z = obj5;
        this.f3228a0 = obj6;
    }

    public final void run() {
        switch (this.f3222U) {
            case 0:
                ((d) this.f3223V).i((C0071z) this.f3224W, (C0071z) this.f3225X, (k) this.f3226Y, (k) this.f3227Z, (Map.Entry) this.f3228a0);
                return;
            default:
                C1479t tVar = (C1479t) this.f3223V;
                String str = (String) this.f3224W;
                tVar.getClass();
                tVar.u("Use case " + str + " RESET", (Throwable) null);
                tVar.f15686U.L(str, (C0) this.f3225X, (L0) this.f3226Y, (C0048i) this.f3227Z, (List) this.f3228a0);
                tVar.q();
                tVar.E();
                tVar.L();
                if (tVar.f15685B0 == 9) {
                    tVar.C();
                    return;
                }
                return;
        }
    }
}
