package de.ozerov.fully;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.SwitchPreference;
import android.util.AttributeSet;

public class SwitchPref extends SwitchPreference {

    /* renamed from: U  reason: collision with root package name */
    public final int f10347U;

    public SwitchPref(Context context) {
        super(context);
    }

    public SwitchPref(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0702g3.f10647d);
        this.f10347U = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
}
