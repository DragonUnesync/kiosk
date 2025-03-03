package de.ozerov.fully;

import android.content.Context;
import android.util.AttributeSet;
import o.C1300w;

public class DimmableImageButton extends C1300w {
    public DimmableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setEnabled(boolean z) {
        int i;
        if (isEnabled() != z) {
            if (z) {
                i = 255;
            } else {
                i = 63;
            }
            setImageAlpha(i);
        }
        super.setEnabled(z);
    }
}
