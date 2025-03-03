package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import v0.C1529b;
import w0.C1575d;
import w0.C1576e;

public final class c extends C1529b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9503d;

    public c(ClockFaceView clockFaceView) {
        this.f9503d = clockFaceView;
    }

    public final void d(View view, C1576e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f15919a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16192a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(2131362249)).intValue();
        if (intValue > 0) {
            View view2 = (View) this.f9503d.f9479t0.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        eVar.b(C1575d.e);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f9503d;
        view.getHitRect(clockFaceView.f9476q0);
        float centerX = (float) clockFaceView.f9476q0.centerX();
        float centerY = (float) clockFaceView.f9476q0.centerY();
        clockFaceView.p0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.p0.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
