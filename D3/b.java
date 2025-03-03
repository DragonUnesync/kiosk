package d3;

import java.util.ArrayDeque;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9720U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ g f9721V;

    public /* synthetic */ b(g gVar, int i) {
        this.f9720U = i;
        this.f9721V = gVar;
    }

    public final void run() {
        switch (this.f9720U) {
            case 0:
                g gVar = this.f9721V;
                gVar.f9733V.setOnItemClickListener(gVar);
                return;
            case 1:
                g gVar2 = this.f9721V;
                ArrayDeque arrayDeque = gVar2.f9748k0;
                if (!arrayDeque.isEmpty()) {
                    gVar2.f9733V.setSelection(((Integer) arrayDeque.pop()).intValue());
                    return;
                }
                return;
            default:
                g gVar3 = this.f9721V;
                gVar3.f9748k0.push(Integer.valueOf(gVar3.f9733V.getFirstVisiblePosition()));
                gVar3.f9733V.setSelection(0);
                return;
        }
    }
}
