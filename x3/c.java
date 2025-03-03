package x3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.media.session.b;
import android.util.TypedValue;
import j0.f;

public abstract class c {
    /* access modifiers changed from: private */
    public static Drawable b(Context context, int i) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable(gradientDrawable, i, i, i, i);
        ColorStateList valueOf = ColorStateList.valueOf(0);
        TypedValue B8 = b.B(context, 2130968816);
        if (B8 != null) {
            int i8 = B8.resourceId;
            if (i8 != 0) {
                colorStateList = f.c(context, i8);
            } else {
                colorStateList = ColorStateList.valueOf(B8.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            valueOf = colorStateList;
        }
        return new RippleDrawable(valueOf, (Drawable) null, insetDrawable);
    }
}
