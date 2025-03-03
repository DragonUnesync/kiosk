package androidx.camera.camera2.internal.compat.quirk;

import D.C0061o0;
import android.os.Build;

public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, C0061o0 {
    public final boolean a() {
        String str = Build.BRAND;
        if ((!"blu".equalsIgnoreCase(str) || !"studio x10".equalsIgnoreCase(Build.MODEL)) && ((!"itel".equalsIgnoreCase(str) || !"itel w6004".equalsIgnoreCase(Build.MODEL)) && ((!"vivo".equalsIgnoreCase(str) || !"vivo 1805".equalsIgnoreCase(Build.MODEL)) && (!"positivo".equalsIgnoreCase(str) || !"twist 2 pro".equalsIgnoreCase(Build.MODEL))))) {
            return false;
        }
        return true;
    }
}
