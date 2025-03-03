package v0;

import H.j;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import g2.C0957j;
import h.C1014b;
import j$.util.Objects;
import m0.C1197c;
import v.i;

/* renamed from: v0.P  reason: case insensitive filesystem */
public final class C1518P implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final j f15892a;

    /* renamed from: b  reason: collision with root package name */
    public j0 f15893b;

    public C1518P(View view, j jVar) {
        j0 j0Var;
        a0 a0Var;
        this.f15892a = jVar;
        j0 h5 = C1510H.h(view);
        if (h5 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                a0Var = new C1527Z(h5);
            } else if (i >= 29) {
                a0Var = new C1526Y(h5);
            } else {
                a0Var = new C1525X(h5);
            }
            j0Var = a0Var.b();
        } else {
            j0Var = null;
        }
        this.f15893b = j0Var;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        g0 g0Var;
        Interpolator interpolator;
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        if (!view.isLaidOut()) {
            this.f15893b = j0.g(view, windowInsets);
            return C1519Q.i(view, windowInsets);
        }
        j0 g8 = j0.g(view, windowInsets);
        if (this.f15893b == null) {
            this.f15893b = C1510H.h(view);
        }
        if (this.f15893b == null) {
            this.f15893b = g8;
            return C1519Q.i(view, windowInsets);
        }
        j j7 = C1519Q.j(view);
        if (j7 != null && Objects.equals((WindowInsets) j7.f1796c, windowInsets2)) {
            return C1519Q.i(view, windowInsets);
        }
        j0 j0Var = this.f15893b;
        int i = 0;
        int i8 = 1;
        while (true) {
            g0Var = g8.f15952a;
            if (i8 > 256) {
                break;
            }
            if (!g0Var.f(i8).equals(j0Var.f15952a.f(i8))) {
                i |= i8;
            }
            i8 <<= 1;
        }
        if (i == 0) {
            return C1519Q.i(view, windowInsets);
        }
        j0 j0Var2 = this.f15893b;
        if ((i & 8) == 0) {
            interpolator = C1519Q.f15895g;
        } else if (g0Var.f(8).f13319d > j0Var2.f15952a.f(8).f13319d) {
            interpolator = C1519Q.e;
        } else {
            interpolator = C1519Q.f15894f;
        }
        C1523V v4 = new C1523V(i, interpolator, 160);
        v4.f15904a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(v4.f15904a.a());
        C1197c f8 = g0Var.f(i);
        C1197c f9 = j0Var2.f15952a.f(i);
        int min = Math.min(f8.f13316a, f9.f13316a);
        int i9 = f8.f13317b;
        int i10 = f9.f13317b;
        int min2 = Math.min(i9, i10);
        int i11 = f8.f13318c;
        int i12 = f9.f13318c;
        int min3 = Math.min(i11, i12);
        ValueAnimator valueAnimator = duration;
        int i13 = f8.f13319d;
        int i14 = i;
        int i15 = f9.f13319d;
        i iVar = new i(C1197c.b(min, min2, min3, Math.min(i13, i15)), 4, C1197c.b(Math.max(f8.f13316a, f9.f13316a), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i15)));
        C1519Q.f(view2, windowInsets2, false);
        ValueAnimator valueAnimator2 = valueAnimator;
        valueAnimator2.addUpdateListener(new C1517O(v4, g8, j0Var2, i14, view));
        valueAnimator2.addListener(new C0957j(v4, view2, 2));
        C1544q.a(view2, new C1014b(view2, v4, iVar, valueAnimator2));
        this.f15893b = g8;
        return C1519Q.i(view, windowInsets);
    }
}
