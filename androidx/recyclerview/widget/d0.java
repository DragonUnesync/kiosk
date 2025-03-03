package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public int f8380a;

    /* renamed from: b  reason: collision with root package name */
    public int f8381b;

    /* renamed from: c  reason: collision with root package name */
    public int f8382c;

    /* renamed from: d  reason: collision with root package name */
    public int f8383d;
    public Interpolator e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8384f;

    /* renamed from: g  reason: collision with root package name */
    public int f8385g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f8383d;
        if (i >= 0) {
            this.f8383d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.f8384f = false;
        } else if (this.f8384f) {
            Interpolator interpolator = this.e;
            if (interpolator == null || this.f8382c >= 1) {
                int i8 = this.f8382c;
                if (i8 >= 1) {
                    recyclerView.mViewFlinger.c(this.f8380a, this.f8381b, interpolator, i8);
                    int i9 = this.f8385g + 1;
                    this.f8385g = i9;
                    if (i9 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f8384f = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.f8385g = 0;
        }
    }
}
