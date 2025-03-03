package K2;

import B2.f;
import E2.b;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

public final class i extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2614b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f.f383a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f2614b);
    }

    public final Bitmap c(b bVar, Bitmap bitmap, int i, int i8) {
        Paint paint = y.f2653a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i8) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return y.b(bVar, bitmap, i, i8);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    public final int hashCode() {
        return -670243078;
    }
}
