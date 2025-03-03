package z3;

import android.graphics.Matrix;
import android.graphics.Path;

public final class q extends r {

    /* renamed from: b  reason: collision with root package name */
    public float f16523b;

    /* renamed from: c  reason: collision with root package name */
    public float f16524c;

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f16525a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f16523b, this.f16524c);
        path.transform(matrix);
    }
}
