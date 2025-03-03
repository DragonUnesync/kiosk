package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* renamed from: androidx.recyclerview.widget.k  reason: case insensitive filesystem */
public final class C0500k extends N {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f8439d = {16843284};

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f8440a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8441b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f8442c = new Rect();

    public C0500k(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f8439d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f8440a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.f8441b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, f0 f0Var) {
        Drawable drawable = this.f8440a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f8441b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, f0 f0Var) {
        Drawable drawable;
        int i;
        int i8;
        int i9;
        int i10;
        if (recyclerView.getLayoutManager() != null && (drawable = this.f8440a) != null) {
            int i11 = this.f8441b;
            Rect rect = this.f8442c;
            int i12 = 0;
            if (i11 == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i10 = recyclerView.getPaddingLeft();
                    i9 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i10, recyclerView.getPaddingTop(), i9, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i9 = recyclerView.getWidth();
                    i10 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i12 < childCount) {
                    View childAt = recyclerView.getChildAt(i12);
                    recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                    int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                    drawable.setBounds(i10, round - drawable.getIntrinsicHeight(), i9, round);
                    drawable.draw(canvas);
                    i12++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i8 = recyclerView.getPaddingTop();
                i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i8, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
            } else {
                i = recyclerView.getHeight();
                i8 = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i12 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i12);
                recyclerView.getLayoutManager().K(childAt2, rect);
                int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
                drawable.setBounds(round2 - drawable.getIntrinsicWidth(), i8, round2, i);
                drawable.draw(canvas);
                i12++;
            }
            canvas.restore();
        }
    }
}
