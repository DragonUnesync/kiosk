package androidx.camera.camera2.internal.compat.quirk;

import D.C0061o0;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ZslDisablerQuirk implements C0061o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List f7638a = Arrays.asList(new String[]{"SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1"});

    /* renamed from: b  reason: collision with root package name */
    public static final List f7639b = Arrays.asList(new String[]{"MI 8"});

    public static boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
