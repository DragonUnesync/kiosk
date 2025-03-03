package K2;

import B2.f;
import E2.b;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

public final class h extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2613b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f.f383a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f2613b);
    }

    public final Bitmap c(b bVar, Bitmap bitmap, int i, int i8) {
        float f8;
        float f9;
        Bitmap.Config config;
        Paint paint = y.f2653a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i8) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f10 = 0.0f;
        if (bitmap.getWidth() * i8 > bitmap.getHeight() * i) {
            f9 = ((float) i8) / ((float) bitmap.getHeight());
            f10 = (((float) i) - (((float) bitmap.getWidth()) * f9)) * 0.5f;
            f8 = 0.0f;
        } else {
            f9 = ((float) i) / ((float) bitmap.getWidth());
            f8 = (((float) i8) - (((float) bitmap.getHeight()) * f9)) * 0.5f;
        }
        matrix.setScale(f9, f9);
        matrix.postTranslate((float) ((int) (f10 + 0.5f)), (float) ((int) (f8 + 0.5f)));
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap g8 = bVar.g(i, i8, config);
        g8.setHasAlpha(bitmap.hasAlpha());
        y.a(bitmap, g8, matrix);
        return g8;
    }

    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    public final int hashCode() {
        return -599754482;
    }
}
