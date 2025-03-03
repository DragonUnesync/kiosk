package D;

import android.content.Context;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

public abstract class F {
    public static Context a(Context context, int i) {
        return context.createDeviceContext(i);
    }

    public static AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void d(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int f(Context context) {
        return context.getDeviceId();
    }

    public static int g(Context context) {
        return context.getDeviceId();
    }

    public static int h(ViewConfiguration viewConfiguration, int i, int i8, int i9) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i8, i9);
    }

    public static int i(ViewConfiguration viewConfiguration, int i, int i8, int i9) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i8, i9);
    }

    public static boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void k(TextView textView, int i, float f8) {
        textView.setLineHeight(i, f8);
    }
}
