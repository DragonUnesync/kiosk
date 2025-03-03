package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import g.C0940a;
import java.util.WeakHashMap;
import v0.C1510H;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: U  reason: collision with root package name */
    public boolean f7457U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f7458V;

    /* renamed from: W  reason: collision with root package name */
    public int f7459W = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = C0940a.f11822k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C1510H.o(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f7457U = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f7457U);
        }
    }

    private void setStacked(boolean z) {
        int i;
        int i8;
        if (this.f7458V == z) {
            return;
        }
        if (!z || this.f7457U) {
            this.f7458V = z;
            setOrientation(z ? 1 : 0);
            if (z) {
                i = 8388613;
            } else {
                i = 80;
            }
            setGravity(i);
            View findViewById = findViewById(2131362498);
            if (findViewById != null) {
                if (z) {
                    i8 = 8;
                } else {
                    i8 = 4;
                }
                findViewById.setVisibility(i8);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i, int i8) {
        boolean z;
        int i9;
        int i10;
        int size = View.MeasureSpec.getSize(i);
        int i11 = 0;
        if (this.f7457U) {
            if (size > this.f7459W && this.f7458V) {
                setStacked(false);
            }
            this.f7459W = size;
        }
        if (this.f7458V || View.MeasureSpec.getMode(i) != 1073741824) {
            i9 = i;
            z = false;
        } else {
            i9 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z = true;
        }
        super.onMeasure(i9, i8);
        if (this.f7457U && !this.f7458V && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i8);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= childCount) {
                i12 = -1;
                break;
            } else if (getChildAt(i12).getVisibility() == 0) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f7458V) {
                int i13 = i12 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i13 >= childCount2) {
                        break;
                    } else if (getChildAt(i13).getVisibility() == 0) {
                        i10 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i10 >= 0) {
                    i11 = getChildAt(i10).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i11 = measuredHeight;
                }
            } else {
                i11 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (getMinimumHeight() != i11) {
            setMinimumHeight(i11);
            if (i8 == 0) {
                super.onMeasure(i, i8);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f7457U != z) {
            this.f7457U = z;
            if (!z && this.f7458V) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
