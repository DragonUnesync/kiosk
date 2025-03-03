package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: o.E  reason: case insensitive filesystem */
public final class C1252E extends SeekBar {

    /* renamed from: U  reason: collision with root package name */
    public final C1253F f13805U;

    public C1252E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969537);
        d1.a(this, getContext());
        C1253F f8 = new C1253F(this);
        this.f13805U = f8;
        f8.b(attributeSet, 2130969537);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1253F f8 = this.f13805U;
        Drawable drawable = f8.f13807f;
        if (drawable != null && drawable.isStateful()) {
            C1252E e = f8.e;
            if (drawable.setState(e.getDrawableState())) {
                e.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13805U.f13807f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f13805U.g(canvas);
    }
}
