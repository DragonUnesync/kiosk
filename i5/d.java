package I5;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

public abstract class d extends View {

    /* renamed from: U  reason: collision with root package name */
    public final int f2328U;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2328U = (int) TypedValue.applyDimension(1, 200.0f, context.getResources().getDisplayMetrics());
    }

    public final void onMeasure(int i, int i8) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode == 0) {
            size = size2;
        } else if (mode2 != 0) {
            size = Math.min(size, size2);
        }
        int max = Math.max(size, this.f2328U);
        setMeasuredDimension(max, max);
    }
}
