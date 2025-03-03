package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g.C0940a;
import j0.f;
import m0.C1195a;

public abstract class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f13945a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f13946b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f13947c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f13948d = {16842919};
    public static final int[] e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f13949f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f13950g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0940a.f11821j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d8 = d(context, i);
        if (d8 != null && d8.isStateful()) {
            return d8.getColorForState(f13946b, d8.getDefaultColor());
        }
        ThreadLocal threadLocal = f13945a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f8 = typedValue.getFloat();
        int c8 = c(context, i);
        return C1195a.d(c8, Math.round(((float) Color.alpha(c8)) * f8));
    }

    public static int c(Context context, int i) {
        int[] iArr = f13950g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f13950g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = f.c(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
