package v0;

import android.view.animation.Interpolator;

/* renamed from: v0.U  reason: case insensitive filesystem */
public abstract class C1522U {

    /* renamed from: a  reason: collision with root package name */
    public final int f15900a;

    /* renamed from: b  reason: collision with root package name */
    public float f15901b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f15902c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15903d;

    public C1522U(int i, Interpolator interpolator, long j7) {
        this.f15900a = i;
        this.f15902c = interpolator;
        this.f15903d = j7;
    }

    public long a() {
        return this.f15903d;
    }

    public float b() {
        Interpolator interpolator = this.f15902c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f15901b);
        }
        return this.f15901b;
    }

    public int c() {
        return this.f15900a;
    }

    public void d(float f8) {
        this.f15901b = f8;
    }
}
