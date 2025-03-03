package z3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class p extends r {

    /* renamed from: h  reason: collision with root package name */
    public static final RectF f16517h = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final float f16518b;

    /* renamed from: c  reason: collision with root package name */
    public final float f16519c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16520d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public float f16521f;

    /* renamed from: g  reason: collision with root package name */
    public float f16522g;

    public p(float f8, float f9, float f10, float f11) {
        this.f16518b = f8;
        this.f16519c = f9;
        this.f16520d = f10;
        this.e = f11;
    }

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f16525a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f16517h;
        rectF.set(this.f16518b, this.f16519c, this.f16520d, this.e);
        path.arcTo(rectF, this.f16521f, this.f16522g, false);
        path.transform(matrix);
    }
}
