package w0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import k2.C1160q;

/* renamed from: w0.f  reason: case insensitive filesystem */
public class C1577f extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final C1160q f16194a;

    public C1577f(C1160q qVar) {
        this.f16194a = qVar;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1576e E8 = this.f16194a.E(i);
        if (E8 == null) {
            return null;
        }
        return E8.f16192a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f16194a.getClass();
        return null;
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        C1576e F8 = this.f16194a.F(i);
        if (F8 == null) {
            return null;
        }
        return F8.f16192a;
    }

    public final boolean performAction(int i, int i8, Bundle bundle) {
        return this.f16194a.L(i, i8, bundle);
    }
}
