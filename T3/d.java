package t3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import f3.C0899a;
import o.C1307z0;

public abstract class d extends C1307z0 {

    /* renamed from: m0  reason: collision with root package name */
    public Drawable f15438m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Rect f15439n0 = new Rect();

    /* renamed from: o0  reason: collision with root package name */
    public final Rect f15440o0 = new Rect();
    public int p0 = 119;

    /* renamed from: q0  reason: collision with root package name */
    public final boolean f15441q0 = true;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f15442r0 = false;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int[] iArr = C0899a.f11655h;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.p0 = obtainStyledAttributes.getInt(1, this.p0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f15441q0 = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f15438m0;
        if (drawable != null) {
            if (this.f15442r0) {
                this.f15442r0 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f15441q0;
                Rect rect = this.f15439n0;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.p0;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f15440o0;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.f15438m0;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f15438m0;
        if (drawable != null && drawable.isStateful()) {
            this.f15438m0.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f15438m0;
    }

    public int getForegroundGravity() {
        return this.p0;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15438m0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        this.f15442r0 = z | this.f15442r0;
    }

    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f15442r0 = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f15438m0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f15438m0);
            }
            this.f15438m0 = drawable;
            this.f15442r0 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.p0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.p0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.p0 = i;
            if (i == 119 && this.f15438m0 != null) {
                this.f15438m0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f15438m0) {
            return true;
        }
        return false;
    }
}
