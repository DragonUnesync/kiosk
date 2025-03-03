package de.ozerov.fully;

import android.view.GestureDetector;
import android.view.MotionEvent;

public final class f5 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10639U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ g5 f10640V;

    public /* synthetic */ f5(g5 g5Var, int i) {
        this.f10639U = i;
        this.f10640V = g5Var;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        g5 g5Var = this.f10640V;
        switch (this.f10639U) {
            case 0:
                if (motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1) {
                    try {
                        if (motionEvent.getY() - motionEvent2.getY() > 20.0f) {
                            g5Var.f(true);
                        } else if (motionEvent2.getY() - motionEvent.getY() > 20.0f) {
                            g5Var.l(true);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return false;
            case 1:
                int a8 = g5.a(g5Var, motionEvent, motionEvent2, f8);
                if (a8 > 0) {
                    g5Var.d();
                } else if (a8 >= 0) {
                    return false;
                } else {
                    g5Var.c();
                }
                return true;
            default:
                int a9 = g5.a(g5Var, motionEvent, motionEvent2, f8);
                if (a9 > 0) {
                    g5Var.f10666j.g();
                } else if (a9 >= 0) {
                    return false;
                } else {
                    g5Var.f10666j.h();
                }
                return true;
        }
    }
}
