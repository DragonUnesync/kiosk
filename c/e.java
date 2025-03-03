package C;

import B.j0;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f485U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ j0 f486V;

    public /* synthetic */ e(j0 j0Var, int i) {
        this.f485U = i;
        this.f486V = j0Var;
    }

    public final void run() {
        switch (this.f485U) {
            case 0:
                this.f486V.r();
                return;
            case 1:
                j0 j0Var = this.f486V;
                if (j0Var != null) {
                    j0Var.r();
                    return;
                }
                return;
            default:
                this.f486V.r();
                return;
        }
    }
}
