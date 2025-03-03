package androidx.camera.camera2.internal.compat.quirk;

import D.C0061o0;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import u.C1477r;

public class ExtraCroppingQuirk implements C0061o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f7614a;

    static {
        HashMap hashMap = new HashMap();
        f7614a = hashMap;
        hashMap.put("SM-T580", (Object) null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", (Object) null);
        hashMap.put("SM-G570M", (Object) null);
        hashMap.put("SM-G610F", (Object) null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size b(int i) {
        if (!c()) {
            return null;
        }
        int h5 = C1477r.h(i);
        if (h5 == 0) {
            return new Size(1920, 1080);
        }
        if (h5 == 1) {
            return new Size(1280, 720);
        }
        if (h5 != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }

    public static boolean c() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        HashMap hashMap = f7614a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!hashMap.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) hashMap.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
