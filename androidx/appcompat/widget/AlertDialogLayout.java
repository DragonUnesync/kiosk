package androidx.appcompat.widget;

import O7.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import o.C1305y0;
import o.C1307z0;
import v0.C1510H;

public class AlertDialogLayout extends C1307z0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int l(View view) {
        WeakHashMap weakHashMap = C1510H.f15874a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0039
            r4 = 80
            if (r3 == r4) goto L_0x0030
            int r12 = r9.getPaddingTop()
            goto L_0x0043
        L_0x0030:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L_0x0043
        L_0x0039:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L_0x0043:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L_0x004c
            r14 = 0
            goto L_0x0050
        L_0x004c:
            int r14 = r14.getIntrinsicHeight()
        L_0x0050:
            if (r0 >= r1) goto L_0x00b0
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x00ad
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00ad
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            o.y0 r6 = (o.C1305y0) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L_0x0073
            r7 = r2
        L_0x0073:
            int r8 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x008d
            r8 = 5
            if (r7 == r8) goto L_0x0087
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0098
        L_0x0087:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
        L_0x008b:
            int r7 = r7 - r8
            goto L_0x0098
        L_0x008d:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
            goto L_0x008b
        L_0x0098:
            boolean r8 = r9.k(r0)
            if (r8 == 0) goto L_0x009f
            int r12 = r12 + r14
        L_0x009f:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        L_0x00ad:
            int r0 = r0 + 1
            goto L_0x0050
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == 2131362586) {
                    view = childAt;
                } else if (id == 2131361916) {
                    view2 = childAt;
                } else if ((id == 2131361953 || id == 2131361967) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i, i8);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i14, 0);
            paddingBottom += view.getMeasuredHeight();
            i9 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i9 = 0;
        }
        if (view2 != null) {
            view2.measure(i14, 0);
            i11 = l(view2);
            i10 = view2.getMeasuredHeight() - i11;
            paddingBottom += i11;
            i9 = View.combineMeasuredStates(i9, view2.getMeasuredState());
        } else {
            i11 = 0;
            i10 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                i13 = 0;
            } else {
                i13 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view3.measure(i14, i13);
            i12 = view3.getMeasuredHeight();
            paddingBottom += i12;
            i9 = View.combineMeasuredStates(i9, view3.getMeasuredState());
        } else {
            i12 = 0;
        }
        int i16 = size - paddingBottom;
        if (view2 != null) {
            int i17 = paddingBottom - i11;
            int min = Math.min(i16, i10);
            if (min > 0) {
                i16 -= min;
                i11 += min;
            }
            view2.measure(i14, View.MeasureSpec.makeMeasureSpec(i11, b.MAX_POW2));
            paddingBottom = i17 + view2.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, view2.getMeasuredState());
        }
        if (view3 != null && i16 > 0) {
            view3.measure(i14, View.MeasureSpec.makeMeasureSpec(i12 + i16, mode));
            paddingBottom = (paddingBottom - i12) + view3.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, view3.getMeasuredState());
        }
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                i18 = Math.max(i18, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i18, i14, i9), View.resolveSizeAndState(paddingBottom, i8, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), b.MAX_POW2);
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                if (childAt3.getVisibility() != 8) {
                    C1305y0 y0Var = (C1305y0) childAt3.getLayoutParams();
                    if (y0Var.width == -1) {
                        int i21 = y0Var.height;
                        y0Var.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i8, 0);
                        y0Var.height = i21;
                    }
                }
            }
        }
    }
}
