package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

public final class A extends C0513y {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f8262q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f8263r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(Object obj, Context context, int i) {
        super(context);
        this.f8262q = i;
        this.f8263r = obj;
    }

    public int b(View view, int i) {
        switch (this.f8262q) {
            case 1:
                ((CarouselLayoutManager) this.f8263r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    public int c(View view, int i) {
        switch (this.f8262q) {
            case 1:
                ((CarouselLayoutManager) this.f8263r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    public float d(DisplayMetrics displayMetrics) {
        switch (this.f8262q) {
            case 0:
                return 100.0f / ((float) displayMetrics.densityDpi);
            default:
                return super.d(displayMetrics);
        }
    }

    public int e(int i) {
        switch (this.f8262q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    public PointF f(int i) {
        switch (this.f8262q) {
            case 1:
                ((CarouselLayoutManager) this.f8263r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    public void h(View view, d0 d0Var) {
        switch (this.f8262q) {
            case 0:
                B b8 = (B) this.f8263r;
                int[] a8 = b8.a(b8.f8264a.getLayoutManager(), view);
                int i = a8[0];
                int i8 = a8[1];
                int ceil = (int) Math.ceil(((double) e(Math.max(Math.abs(i), Math.abs(i8)))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f8554j;
                    d0Var.f8380a = i;
                    d0Var.f8381b = i8;
                    d0Var.f8382c = ceil;
                    d0Var.e = decelerateInterpolator;
                    d0Var.f8384f = true;
                    return;
                }
                return;
            default:
                super.h(view, d0Var);
                return;
        }
    }
}
