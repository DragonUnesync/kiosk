package de.ozerov.fully;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.C1260b0;

public class TextViewShadowDips extends C1260b0 {
    public TextViewShadowDips(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0702g3.f10648f);
        float min = Math.min(obtainStyledAttributes.getDimension(3, 0.0f), 25.0f);
        float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(2, 0.0f);
        int color = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            setShadowLayer(min, dimension, dimension2, color);
        } else {
            getPaint().clearShadowLayer();
        }
        obtainStyledAttributes.recycle();
    }
}
