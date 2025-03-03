package n;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import o.L;
import o.L0;
import o.P;

/* renamed from: n.d  reason: case insensitive filesystem */
public final class C1228d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13430U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f13431V;

    public /* synthetic */ C1228d(int i, Object obj) {
        this.f13430U = i;
        this.f13431V = obj;
    }

    public final void onGlobalLayout() {
        switch (this.f13430U) {
            case 0:
                C1231g gVar = (C1231g) this.f13431V;
                if (gVar.b()) {
                    ArrayList arrayList = gVar.f13445b0;
                    if (arrayList.size() > 0 && !((C1230f) arrayList.get(0)).f13436a.f13840s0) {
                        View view = gVar.f13452i0;
                        if (view == null || !view.isShown()) {
                            gVar.dismiss();
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C1230f) it.next()).f13436a.c();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C1223D d8 = (C1223D) this.f13431V;
                if (d8.b()) {
                    L0 l02 = d8.f13397b0;
                    if (!l02.f13840s0) {
                        View view2 = d8.f13402g0;
                        if (view2 == null || !view2.isShown()) {
                            d8.dismiss();
                            return;
                        } else {
                            l02.c();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                P p3 = (P) this.f13431V;
                if (!p3.getInternalPopup().b()) {
                    p3.f13878c0.k(p3.getTextDirection(), p3.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = p3.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                L l8 = (L) this.f13431V;
                P p8 = l8.f13855B0;
                l8.getClass();
                if (!p8.isAttachedToWindow() || !p8.getGlobalVisibleRect(l8.f13858z0)) {
                    l8.dismiss();
                    return;
                }
                l8.r();
                l8.c();
                return;
        }
    }
}
