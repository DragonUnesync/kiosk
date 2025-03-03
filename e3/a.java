package E3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.C1184c;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1364a = {16842752, 2130969742};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1365b = {2130969354};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i8) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1365b, i, i8);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (!(context instanceof C1184c) || ((C1184c) context).f13258a != resourceId) {
            z = false;
        } else {
            z = true;
        }
        if (resourceId == 0 || z) {
            return context;
        }
        C1184c cVar = new C1184c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1364a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
