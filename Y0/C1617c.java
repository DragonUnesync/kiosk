package y0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: y0.c  reason: case insensitive filesystem */
public abstract class C1617c {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f8, float f9) {
        try {
            return edgeEffect.onPullDistance(f8, f9);
        } catch (Throwable unused) {
            edgeEffect.onPull(f8, f9);
            return 0.0f;
        }
    }
}
