package v0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import m0.C1197c;

/* renamed from: v0.O  reason: case insensitive filesystem */
public final class C1517O implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1523V f15888a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j0 f15889b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j0 f15890c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f15891d;
    public final /* synthetic */ View e;

    public C1517O(C1523V v4, j0 j0Var, j0 j0Var2, int i, View view) {
        this.f15888a = v4;
        this.f15889b = j0Var;
        this.f15890c = j0Var2;
        this.f15891d = i;
        this.e = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a0 a0Var;
        float f8;
        C1523V v4;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C1523V v8 = this.f15888a;
        v8.f15904a.d(animatedFraction);
        float b8 = v8.f15904a.b();
        PathInterpolator pathInterpolator = C1519Q.e;
        int i = Build.VERSION.SDK_INT;
        j0 j0Var = this.f15889b;
        if (i >= 30) {
            a0Var = new C1527Z(j0Var);
        } else if (i >= 29) {
            a0Var = new C1526Y(j0Var);
        } else {
            a0Var = new C1525X(j0Var);
        }
        int i8 = 1;
        while (i8 <= 256) {
            int i9 = this.f15891d & i8;
            g0 g0Var = j0Var.f15952a;
            if (i9 == 0) {
                a0Var.c(i8, g0Var.f(i8));
                f8 = b8;
                v4 = v8;
            } else {
                C1197c f9 = g0Var.f(i8);
                C1197c f10 = this.f15890c.f15952a.f(i8);
                float f11 = 1.0f - b8;
                f8 = b8;
                v4 = v8;
                a0Var.c(i8, j0.e(f9, (int) (((double) (((float) (f9.f13316a - f10.f13316a)) * f11)) + 0.5d), (int) (((double) (((float) (f9.f13317b - f10.f13317b)) * f11)) + 0.5d), (int) (((double) (((float) (f9.f13318c - f10.f13318c)) * f11)) + 0.5d), (int) (((double) (((float) (f9.f13319d - f10.f13319d)) * f11)) + 0.5d)));
            }
            i8 <<= 1;
            b8 = f8;
            v8 = v4;
        }
        C1519Q.g(this.e, a0Var.b(), Collections.singletonList(v8));
    }
}
