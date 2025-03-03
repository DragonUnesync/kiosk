package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.w0  reason: case insensitive filesystem */
public final class C1301w0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f14102U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1303x0 f14103V;

    public /* synthetic */ C1301w0(C1303x0 x0Var, int i) {
        this.f14102U = i;
        this.f14103V = x0Var;
    }

    public final void run() {
        switch (this.f14102U) {
            case 0:
                ViewParent parent = this.f14103V.f14113X.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                C1303x0 x0Var = this.f14103V;
                x0Var.a();
                View view = x0Var.f14113X;
                if (view.isEnabled() && !view.isLongClickable() && x0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    x0Var.f14116a0 = true;
                    return;
                }
                return;
        }
    }
}
