package v0;

import P0.o;
import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: v0.V  reason: case insensitive filesystem */
public final class C1523V {

    /* renamed from: a  reason: collision with root package name */
    public C1522U f15904a;

    public C1523V(int i, Interpolator interpolator, long j7) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f15904a = new C1521T(o.k(i, interpolator, j7));
        } else {
            this.f15904a = new C1522U(i, interpolator, j7);
        }
    }
}
