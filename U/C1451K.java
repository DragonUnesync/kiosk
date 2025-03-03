package u;

import B.C0022x;
import android.hardware.camera2.CameraCharacteristics;
import android.view.accessibility.AccessibilityNodeInfo;
import v.k;
import w.C1571a;

/* renamed from: u.K  reason: case insensitive filesystem */
public abstract class C1451K {
    public static C0022x a(k kVar) {
        Long l8 = (Long) kVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l8 != null) {
            return (C0022x) C1571a.f16146a.get(l8);
        }
        return null;
    }

    public static String b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
