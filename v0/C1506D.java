package v0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: v0.D  reason: case insensitive filesystem */
public abstract class C1506D {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i8) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i8);
    }
}
