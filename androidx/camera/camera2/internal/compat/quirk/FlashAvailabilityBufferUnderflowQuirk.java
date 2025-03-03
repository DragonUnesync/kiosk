package androidx.camera.camera2.internal.compat.quirk;

import D.C0061o0;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;

public class FlashAvailabilityBufferUnderflowQuirk implements C0061o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f7619a;

    static {
        HashSet hashSet = new HashSet();
        f7619a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
