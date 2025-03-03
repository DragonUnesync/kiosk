package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.RatingBar;

/* renamed from: o.C  reason: case insensitive filesystem */
public final class C1250C extends RatingBar {

    /* renamed from: U  reason: collision with root package name */
    public final C1248A f13800U;

    public C1250C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969501);
        d1.a(this, getContext());
        C1248A a8 = new C1248A((AbsSeekBar) this);
        this.f13800U = a8;
        a8.b(attributeSet, 2130969501);
    }

    public final synchronized void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        Bitmap bitmap = (Bitmap) this.f13800U.f13795c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
