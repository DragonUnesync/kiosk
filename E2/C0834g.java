package e2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: e2.g  reason: case insensitive filesystem */
public final class C0834g extends Animation {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f11199U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f11200V;

    public /* synthetic */ C0834g(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f11199U = i;
        this.f11200V = swipeRefreshLayout;
    }

    public final void applyTransformation(float f8, Transformation transformation) {
        switch (this.f11199U) {
            case 0:
                this.f11200V.setAnimationProgress(f8);
                return;
            case 1:
                this.f11200V.setAnimationProgress(1.0f - f8);
                return;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f11200V;
                swipeRefreshLayout.getClass();
                int abs = swipeRefreshLayout.f8593u0 - Math.abs(swipeRefreshLayout.f8592t0);
                int i = swipeRefreshLayout.f8591s0;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f8))) - swipeRefreshLayout.f8589q0.getTop());
                C0832e eVar = swipeRefreshLayout.f8595w0;
                float f9 = 1.0f - f8;
                C0831d dVar = eVar.f11191U;
                if (f9 != dVar.f11182p) {
                    dVar.f11182p = f9;
                }
                eVar.invalidateSelf();
                return;
            default:
                this.f11200V.k(f8);
                return;
        }
    }
}
