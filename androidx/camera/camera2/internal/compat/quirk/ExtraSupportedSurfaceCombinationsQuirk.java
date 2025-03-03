package androidx.camera.camera2.internal.compat.quirk;

import D.C0050j;
import D.C0061o0;
import D.F0;
import D.G0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import u.C1477r;

public class ExtraSupportedSurfaceCombinationsQuirk implements C0061o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final F0 f7615a;

    /* renamed from: b  reason: collision with root package name */
    public static final F0 f7616b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashSet f7617c = new HashSet(Arrays.asList(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"}));

    /* renamed from: d  reason: collision with root package name */
    public static final HashSet f7618d = new HashSet(Arrays.asList(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"}));

    static {
        F0 f02 = new F0();
        G0 g02 = G0.VGA;
        C1477r.f(2, g02, 0, f02);
        G0 g03 = G0.PREVIEW;
        C1477r.f(1, g03, 0, f02);
        G0 g04 = G0.MAXIMUM;
        C1477r.f(2, g04, 0, f02);
        f7615a = f02;
        F0 f03 = new F0();
        f03.a(new C0050j(1, g03, 0));
        f03.a(new C0050j(1, g02, 0));
        C1477r.f(2, g04, 0, f03);
        f7616b = f03;
    }

    public static boolean b() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f7618d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
