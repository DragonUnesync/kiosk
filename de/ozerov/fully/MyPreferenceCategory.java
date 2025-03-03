package de.ozerov.fully;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;

public class MyPreferenceCategory extends PreferenceCategory {

    /* renamed from: U  reason: collision with root package name */
    public final String f10114U;

    public MyPreferenceCategory(Context context) {
        super(context);
        setLayoutResource(2131558581);
    }

    public MyPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutResource(2131558581);
        this.f10114U = context.obtainStyledAttributes(attributeSet, C0702g3.f10646c).getString(0);
    }
}
