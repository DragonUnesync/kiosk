package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ int f9499n0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final Chip f9500m0;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g gVar = new g(this);
        LayoutInflater.from(context).inflate(2131558518, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(2131362232);
        ((MaterialButtonToggleGroup) findViewById(2131362237)).f9234W.add(new f(this));
        Chip chip = (Chip) findViewById(2131362242);
        Chip chip2 = (Chip) findViewById(2131362239);
        this.f9500m0 = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(2131362233);
        i iVar = new i(new GestureDetector(getContext(), new h(this)));
        chip.setOnTouchListener(iVar);
        chip2.setOnTouchListener(iVar);
        chip.setTag(2131362469, 12);
        chip2.setTag(2131362469, 10);
        chip.setOnClickListener(gVar);
        chip2.setOnClickListener(gVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f9500m0.sendAccessibilityEvent(8);
        }
    }
}
