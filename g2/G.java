package g2;

import android.graphics.Matrix;
import android.view.View;

public final class G extends F {
    public final void A(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public final float r(View view) {
        return view.getTransitionAlpha();
    }

    public final void v(View view, int i, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i, i8, i9, i10);
    }

    public final void w(View view, float f8) {
        view.setTransitionAlpha(f8);
    }

    public final void y(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public final void z(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
