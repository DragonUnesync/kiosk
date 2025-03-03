package androidx.camera.camera2.internal.compat.quirk;

import D.C0061o0;
import android.os.Build;

public class ExcludedSupportedSizesQuirk implements C0061o0 {
    public static boolean b() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.BRAND) || !"J7XELTE".equalsIgnoreCase(Build.DEVICE) || Build.VERSION.SDK_INT < 27) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.BRAND) || !"ON7XELTE".equalsIgnoreCase(Build.DEVICE) || Build.VERSION.SDK_INT < 27) {
            return false;
        }
        return true;
    }
}
