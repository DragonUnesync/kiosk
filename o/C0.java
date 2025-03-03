package o;

public final class C0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13801U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ G0 f13802V;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f13801U = i;
        this.f13802V = g02;
    }

    public final void run() {
        switch (this.f13801U) {
            case 0:
                C1297u0 u0Var = this.f13802V.f13819W;
                if (u0Var != null) {
                    u0Var.setListSelectionHidden(true);
                    u0Var.requestLayout();
                    return;
                }
                return;
            default:
                G0 g02 = this.f13802V;
                C1297u0 u0Var2 = g02.f13819W;
                if (u0Var2 != null && u0Var2.isAttachedToWindow() && g02.f13819W.getCount() > g02.f13819W.getChildCount() && g02.f13819W.getChildCount() <= g02.f13829g0) {
                    g02.f13841t0.setInputMethodMode(2);
                    g02.c();
                    return;
                }
                return;
        }
    }
}
