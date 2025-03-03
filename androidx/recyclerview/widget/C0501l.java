package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.recyclerview.widget.l  reason: case insensitive filesystem */
public final class C0501l implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f8444U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f8445V;

    public /* synthetic */ C0501l(int i, Object obj) {
        this.f8444U = i;
        this.f8445V = obj;
    }

    public final void run() {
        Object obj = this.f8445V;
        switch (this.f8444U) {
            case 0:
                C0505p pVar = (C0505p) obj;
                int i = pVar.f8462A;
                ValueAnimator valueAnimator = pVar.z;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                pVar.f8462A = 3;
                valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
                valueAnimator.setDuration((long) 500);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).P0();
                return;
        }
    }
}
