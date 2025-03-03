package K2;

import B2.f;
import E2.b;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public final class u extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2639b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f.f383a);

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f2639b);
    }

    public final Bitmap c(b bVar, Bitmap bitmap, int i, int i8) {
        return y.b(bVar, bitmap, i, i8);
    }

    public final boolean equals(Object obj) {
        return obj instanceof u;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
