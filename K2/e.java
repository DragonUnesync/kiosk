package K2;

import B2.m;
import D2.D;
import E2.b;
import android.content.Context;
import android.graphics.Bitmap;

public abstract class e implements m {
    public final D b(Context context, D d8, int i, int i8) {
        if (W2.m.i(i, i8)) {
            b bVar = com.bumptech.glide.b.a(context).f8970V;
            Bitmap bitmap = (Bitmap) d8.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i8 == Integer.MIN_VALUE) {
                i8 = bitmap.getHeight();
            }
            Bitmap c8 = c(bVar, bitmap, i, i8);
            if (bitmap.equals(c8)) {
                return d8;
            }
            return C0112d.b(bVar, c8);
        }
        throw new IllegalArgumentException(N.e.v("Cannot apply transformation on width: ", i, " or height: ", i8, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    public abstract Bitmap c(b bVar, Bitmap bitmap, int i, int i8);
}
