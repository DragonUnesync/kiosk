package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9502U;

    public b(ClockFaceView clockFaceView) {
        this.f9502U = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f9502U;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.p0.f9489a0) - clockFaceView.f9483x0;
        if (height != clockFaceView.f9505n0) {
            clockFaceView.f9505n0 = height;
            clockFaceView.f();
            int i = clockFaceView.f9505n0;
            ClockHandView clockHandView = clockFaceView.p0;
            clockHandView.f9497i0 = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
