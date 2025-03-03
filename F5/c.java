package F5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public final class c extends ViewGroup {

    /* renamed from: U  reason: collision with root package name */
    public int f1573U = 0;

    /* renamed from: V  reason: collision with root package name */
    public View f1574V;

    /* renamed from: W  reason: collision with root package name */
    public View f1575W;

    /* renamed from: a0  reason: collision with root package name */
    public int f1576a0 = ((int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));

    /* renamed from: b0  reason: collision with root package name */
    public int f1577b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1578c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1579d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1580e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Paint f1581f0 = new Paint();

    /* renamed from: g0  reason: collision with root package name */
    public float f1582g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f1583h0;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f1584i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1585j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f1586k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1587l0 = true;

    /* renamed from: m0  reason: collision with root package name */
    public Bitmap f1588m0;

    /* renamed from: n0  reason: collision with root package name */
    public View f1589n0;

    public c(Context context) {
        super(context, (AttributeSet) null);
    }

    private int getSelectorTop() {
        return ((this.f1589n0.getHeight() - this.f1588m0.getHeight()) / 2) + this.f1589n0.getTop();
    }

    public final void a(View view, Canvas canvas, float f8) {
        View view2;
        if (this.f1587l0 && this.f1588m0 != null && (view2 = this.f1589n0) != null && ((String) view2.getTag(2131362468)).equals("CustomViewBehindSelectedView")) {
            canvas.save();
            int width = (int) (((float) this.f1588m0.getWidth()) * f8);
            int i = this.f1579d0;
            if (i == 0) {
                int left = view.getLeft();
                int i8 = left - width;
                canvas.clipRect(i8, 0, left, getHeight());
                canvas.drawBitmap(this.f1588m0, (float) i8, (float) getSelectorTop(), (Paint) null);
            } else if (i == 1) {
                int right = view.getRight();
                int i9 = width + right;
                canvas.clipRect(right, 0, i9, getHeight());
                Bitmap bitmap = this.f1588m0;
                canvas.drawBitmap(bitmap, (float) (i9 - bitmap.getWidth()), (float) getSelectorTop(), (Paint) null);
            }
            canvas.restore();
        }
    }

    public final boolean b(View view, int i, float f8) {
        int i8 = this.f1579d0;
        if (i8 == 0 || (i8 == 2 && i == 0)) {
            if (f8 >= ((float) view.getLeft())) {
                return true;
            }
            return false;
        } else if ((i8 == 1 || (i8 == 2 && i == 2)) && f8 <= ((float) view.getRight())) {
            return true;
        } else {
            return false;
        }
    }

    public final void c(View view, int i, int i8) {
        int i9;
        int i10;
        int i11 = this.f1579d0;
        int i12 = 4;
        int i13 = 0;
        if (i11 == 0) {
            if (i < view.getLeft()) {
                i12 = 0;
            }
            super.scrollTo((int) (((float) (getBehindWidth() + i)) * this.f1582g0), i8);
        } else if (i11 == 1) {
            if (i > view.getLeft()) {
                i12 = 0;
            }
            super.scrollTo((int) ((((float) (i - getBehindWidth())) * this.f1582g0) + ((float) (getBehindWidth() - getWidth()))), i8);
        } else {
            if (i11 == 2) {
                View view2 = this.f1574V;
                if (i >= view.getLeft()) {
                    i9 = 4;
                } else {
                    i9 = 0;
                }
                view2.setVisibility(i9);
                View view3 = this.f1575W;
                if (i <= view.getLeft()) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                view3.setVisibility(i10);
                if (i != 0) {
                    i12 = 0;
                }
                if (i <= view.getLeft()) {
                    super.scrollTo((int) (((float) (getBehindWidth() + i)) * this.f1582g0), i8);
                } else {
                    super.scrollTo((int) ((((float) (i - getBehindWidth())) * this.f1582g0) + ((float) (getBehindWidth() - getWidth()))), i8);
                }
            }
            setVisibility(i13);
        }
        i13 = i12;
        setVisibility(i13);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public int getBehindWidth() {
        return this.f1574V.getWidth();
    }

    public View getContent() {
        return this.f1574V;
    }

    public int getMarginThreshold() {
        return this.f1576a0;
    }

    public int getMode() {
        return this.f1579d0;
    }

    public float getScrollScale() {
        return this.f1582g0;
    }

    public View getSecondaryContent() {
        return this.f1575W;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f1578c0;
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int i11 = i9 - i;
        int i12 = i10 - i8;
        this.f1574V.layout(0, 0, i11 - this.f1577b0, i12);
        View view = this.f1575W;
        if (view != null) {
            view.layout(0, 0, i11 - this.f1577b0, i12);
        }
    }

    public final void onMeasure(int i, int i8) {
        int defaultSize = View.getDefaultSize(0, i);
        int defaultSize2 = View.getDefaultSize(0, i8);
        setMeasuredDimension(defaultSize, defaultSize2);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, 0, defaultSize - this.f1577b0);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, 0, defaultSize2);
        this.f1574V.measure(childMeasureSpec, childMeasureSpec2);
        View view = this.f1575W;
        if (view != null) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f1578c0;
    }

    public void setCanvasTransformer(e eVar) {
    }

    public void setChildrenEnabled(boolean z) {
        this.f1578c0 = z;
    }

    public void setContent(View view) {
        View view2 = this.f1574V;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1574V = view;
        addView(view);
    }

    public void setCustomViewAbove(b bVar) {
    }

    public void setFadeDegree(float f8) {
        if (f8 > 1.0f || f8 < 0.0f) {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        }
        this.f1586k0 = f8;
    }

    public void setFadeEnabled(boolean z) {
        this.f1580e0 = z;
    }

    public void setMarginThreshold(int i) {
        this.f1576a0 = i;
    }

    public void setMode(int i) {
        if (i == 0 || i == 1) {
            View view = this.f1574V;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f1575W;
            if (view2 != null) {
                view2.setVisibility(4);
            }
        }
        this.f1579d0 = i;
    }

    public void setScrollScale(float f8) {
        this.f1582g0 = f8;
    }

    public void setSecondaryContent(View view) {
        View view2 = this.f1575W;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1575W = view;
        addView(view);
    }

    public void setSecondaryShadowDrawable(Drawable drawable) {
        this.f1584i0 = drawable;
        invalidate();
    }

    public void setSelectedView(View view) {
        View view2 = this.f1589n0;
        if (view2 != null) {
            view2.setTag(2131362468, (Object) null);
            this.f1589n0 = null;
        }
        if (view != null && view.getParent() != null) {
            this.f1589n0 = view;
            view.setTag(2131362468, "CustomViewBehindSelectedView");
            invalidate();
        }
    }

    public void setSelectorBitmap(Bitmap bitmap) {
        this.f1588m0 = bitmap;
        refreshDrawableState();
    }

    public void setSelectorEnabled(boolean z) {
        this.f1587l0 = z;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f1583h0 = drawable;
        invalidate();
    }

    public void setShadowWidth(int i) {
        this.f1585j0 = i;
        invalidate();
    }

    public void setTouchMode(int i) {
        this.f1573U = i;
    }

    public void setWidthOffset(int i) {
        this.f1577b0 = i;
        requestLayout();
    }
}
