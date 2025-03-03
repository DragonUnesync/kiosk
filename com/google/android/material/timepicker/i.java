package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

public final class i implements View.OnTouchListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f9510U;

    public i(GestureDetector gestureDetector) {
        this.f9510U = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f9510U.onTouchEvent(motionEvent);
        }
        return false;
    }
}
