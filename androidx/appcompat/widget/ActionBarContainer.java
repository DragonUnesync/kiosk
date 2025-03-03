package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import g.C0940a;
import o.C1259b;
import o.R0;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: U  reason: collision with root package name */
    public boolean f7387U;

    /* renamed from: V  reason: collision with root package name */
    public View f7388V;

    /* renamed from: W  reason: collision with root package name */
    public View f7389W;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f7390a0;

    /* renamed from: b0  reason: collision with root package name */
    public Drawable f7391b0;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f7392c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f7393d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7394e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f7395f0;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1259b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0940a.f11814a);
        boolean z = false;
        this.f7390a0 = obtainStyledAttributes.getDrawable(0);
        this.f7391b0 = obtainStyledAttributes.getDrawable(2);
        this.f7395f0 = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131362503) {
            this.f7393d0 = true;
            this.f7392c0 = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f7393d0 ? this.f7390a0 == null && this.f7391b0 == null : this.f7392c0 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7390a0;
        if (drawable != null && drawable.isStateful()) {
            this.f7390a0.setState(getDrawableState());
        }
        Drawable drawable2 = this.f7391b0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f7391b0.setState(getDrawableState());
        }
        Drawable drawable3 = this.f7392c0;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f7392c0.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7390a0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7391b0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f7392c0;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f7388V = findViewById(2131361847);
        this.f7389W = findViewById(2131361855);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f7387U || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        boolean z6 = true;
        if (this.f7393d0) {
            Drawable drawable = this.f7392c0;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z6 = false;
            }
        } else {
            if (this.f7390a0 == null) {
                z6 = false;
            } else if (this.f7388V.getVisibility() == 0) {
                this.f7390a0.setBounds(this.f7388V.getLeft(), this.f7388V.getTop(), this.f7388V.getRight(), this.f7388V.getBottom());
            } else {
                View view = this.f7389W;
                if (view == null || view.getVisibility() != 0) {
                    this.f7390a0.setBounds(0, 0, 0, 0);
                } else {
                    this.f7390a0.setBounds(this.f7389W.getLeft(), this.f7389W.getTop(), this.f7389W.getRight(), this.f7389W.getBottom());
                }
            }
            this.f7394e0 = false;
        }
        if (z6) {
            invalidate();
        }
    }

    public final void onMeasure(int i, int i8) {
        int i9;
        if (this.f7388V == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f7395f0) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i8);
        if (this.f7388V != null) {
            View.MeasureSpec.getMode(i8);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f7390a0;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f7390a0);
        }
        this.f7390a0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f7388V;
            if (view != null) {
                this.f7390a0.setBounds(view.getLeft(), this.f7388V.getTop(), this.f7388V.getRight(), this.f7388V.getBottom());
            }
        }
        boolean z = false;
        if (!this.f7393d0 ? this.f7390a0 == null && this.f7391b0 == null : this.f7392c0 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f7392c0;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f7392c0);
        }
        this.f7392c0 = drawable;
        boolean z = this.f7393d0;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f7392c0) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? this.f7390a0 == null && this.f7391b0 == null : this.f7392c0 == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f7391b0;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f7391b0);
        }
        this.f7391b0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f7394e0 && this.f7391b0 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f7393d0 ? this.f7390a0 == null && this.f7391b0 == null : this.f7392c0 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(R0 r02) {
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f7387U = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f7390a0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f7391b0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f7392c0;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7390a0;
        boolean z = this.f7393d0;
        if ((drawable != drawable2 || z) && ((drawable != this.f7391b0 || !this.f7394e0) && ((drawable != this.f7392c0 || !z) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
