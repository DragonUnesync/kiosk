package de.ozerov.fully;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.util.Log;

public final class S1 extends AccessibilityService.GestureResultCallback {
    public final void onCancelled(GestureDescription gestureDescription) {
        super.onCancelled(gestureDescription);
        Log.d("MyAccessibilityService", "Gesture cancelled");
    }

    public final void onCompleted(GestureDescription gestureDescription) {
        super.onCompleted(gestureDescription);
        Log.d("MyAccessibilityService", "Gesture completed");
    }
}
