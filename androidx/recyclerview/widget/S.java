package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class S extends ViewGroup.MarginLayoutParams {

    /* renamed from: U  reason: collision with root package name */
    public j0 f8323U;

    /* renamed from: V  reason: collision with root package name */
    public final Rect f8324V = new Rect();

    /* renamed from: W  reason: collision with root package name */
    public boolean f8325W = true;

    /* renamed from: X  reason: collision with root package name */
    public boolean f8326X = false;

    public S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public S(int i, int i8) {
        super(i, i8);
    }

    public S(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public S(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public S(S s8) {
        super(s8);
    }
}
