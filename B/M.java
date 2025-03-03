package B;

import A.d;
import java.lang.ref.WeakReference;

public final /* synthetic */ class M implements C0024z {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f187U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f188V;

    public /* synthetic */ M(int i, Object obj) {
        this.f187U = i;
        this.f188V = obj;
    }

    public final void a(A a8) {
        C0024z zVar;
        switch (this.f187U) {
            case 0:
                O o2 = (O) ((WeakReference) ((N) this.f188V).f190Y).get();
                if (o2 != null) {
                    o2.f191n0.execute(new d(2, o2));
                    return;
                }
                return;
            default:
                j0 j0Var = (j0) this.f188V;
                synchronized (j0Var.f266W) {
                    try {
                        int i = j0Var.f264U - 1;
                        j0Var.f264U = i;
                        if (j0Var.f265V && i == 0) {
                            j0Var.close();
                        }
                        zVar = (C0024z) j0Var.f269Z;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                if (zVar != null) {
                    zVar.a(a8);
                    return;
                }
                return;
        }
    }
}
