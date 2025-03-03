package de.ozerov.fully;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;

class ClickPref extends Preference {

    /* renamed from: U  reason: collision with root package name */
    public final int f9833U;

    public ClickPref(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0702g3.f10644a);
        this.f9833U = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
}
