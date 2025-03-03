package D3;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.b;
import android.util.TypedValue;
import f3.C0899a;
import o.C1260b0;

public final class a extends C1260b0 {
    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i8 = 0; i8 < iArr.length && i < 0; i8++) {
            int i9 = iArr[i8];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i9, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i9, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            }
        }
        return i;
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (b.C(context, 2130969715, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, C0899a.f11663q);
            int h5 = h(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h5 >= 0) {
                setLineHeight(h5);
            }
        }
    }
}
