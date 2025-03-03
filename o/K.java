package o;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import n.C1228d;

public final class K implements PopupWindow.OnDismissListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1228d f13848U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ L f13849V;

    public K(L l8, C1228d dVar) {
        this.f13849V = l8;
        this.f13848U = dVar;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f13849V.f13855B0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f13848U);
        }
    }
}
