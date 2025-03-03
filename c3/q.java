package C3;

import B.B;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import n.C1223D;
import n.C1231g;
import v0.C1510H;
import v0.C1551x;
import w0.C1573b;

public final class q implements View.OnAttachStateChangeListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f613U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f614V;

    public /* synthetic */ q(int i, Object obj) {
        this.f613U = i;
        this.f614V = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f614V;
        switch (this.f613U) {
            case 0:
                s sVar = (s) obj;
                if (sVar.f638r0 != null && (accessibilityManager = sVar.f637q0) != null) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    if (sVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new C1573b(sVar.f638r0));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = C1510H.f15874a;
                C1551x.c(view2);
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f613U) {
            case 0:
                s sVar = (s) this.f614V;
                B b8 = sVar.f638r0;
                if (b8 != null && (accessibilityManager = sVar.f637q0) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new C1573b(b8));
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                C1231g gVar = (C1231g) this.f614V;
                ViewTreeObserver viewTreeObserver = gVar.f13460r0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f13460r0 = view.getViewTreeObserver();
                    }
                    gVar.f13460r0.removeGlobalOnLayoutListener(gVar.f13446c0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                C1223D d8 = (C1223D) this.f614V;
                ViewTreeObserver viewTreeObserver2 = d8.f13404i0;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d8.f13404i0 = view.getViewTreeObserver();
                    }
                    d8.f13404i0.removeGlobalOnLayoutListener(d8.f13398c0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
