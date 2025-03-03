package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import g.C0940a;

public class AlertController$RecycleListView extends ListView {

    /* renamed from: U  reason: collision with root package name */
    public final int f7355U;

    /* renamed from: V  reason: collision with root package name */
    public final int f7356V;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0940a.f11831t);
        this.f7356V = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f7355U = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
