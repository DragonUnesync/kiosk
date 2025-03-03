package E;

import Q0.g;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import n2.a;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f1294a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f1294a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate((float) i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean b(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(g.m(i, "Invalid rotation degrees: "));
    }

    public static boolean c(Size size, boolean z, Size size2) {
        float f8;
        float f9;
        if (z) {
            f8 = ((float) size.getWidth()) / ((float) size.getHeight());
            f9 = f8;
        } else {
            f8 = (((float) size.getWidth()) + 1.0f) / (((float) size.getHeight()) - 1.0f);
            f9 = (((float) size.getWidth()) - 1.0f) / (((float) size.getHeight()) + 1.0f);
        }
        float width = (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f);
        if (f8 < (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) || width < f9) {
            return false;
        }
        return true;
    }

    public static Size d(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size e(Size size, int i) {
        boolean z;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        a.h("Invalid rotation degrees: " + i, z);
        if (b(f(i))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    public static int f(int i) {
        return ((i % 360) + 360) % 360;
    }
}
