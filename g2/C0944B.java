package g2;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: g2.B  reason: case insensitive filesystem */
public abstract class C0944B {
    public static void a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
