package com.google.android.material.appbar;

import C7.e;
import E3.a;
import F.h;
import O7.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.bumptech.glide.d;
import f3.C0899a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import n.m;
import t3.k;
import v0.C1510H;
import v0.C1553z;
import z3.g;

public class MaterialToolbar extends Toolbar {

    /* renamed from: W0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f9143W0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: R0  reason: collision with root package name */
    public Integer f9144R0;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f9145S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f9146T0;

    /* renamed from: U0  reason: collision with root package name */
    public ImageView.ScaleType f9147U0;

    /* renamed from: V0  reason: collision with root package name */
    public Boolean f9148V0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969791, 2132018333), attributeSet, 0);
        ColorStateList colorStateList;
        Context context2 = getContext();
        TypedArray f8 = k.f(context2, attributeSet, C0899a.f11665s, 2130969791, 2132018333, new int[0]);
        if (f8.hasValue(2)) {
            setNavigationIconTint(f8.getColor(2, -1));
        }
        this.f9145S0 = f8.getBoolean(4, false);
        this.f9146T0 = f8.getBoolean(3, false);
        int i = f8.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f9143W0;
            if (i < scaleTypeArr.length) {
                this.f9147U0 = scaleTypeArr[i];
            }
        }
        if (f8.hasValue(0)) {
            this.f9148V0 = Boolean.valueOf(f8.getBoolean(0, false));
        }
        f8.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateList = ColorStateList.valueOf(0);
        } else {
            colorStateList = h.o(background);
        }
        if (colorStateList != null) {
            g gVar = new g();
            gVar.j(colorStateList);
            gVar.h(context2);
            WeakHashMap weakHashMap = C1510H.f15874a;
            gVar.i(C1553z.e(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f9147U0;
    }

    public Integer getNavigationIconTint() {
        return this.f9144R0;
    }

    public final void m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof m;
        if (z) {
            ((m) menu).w();
        }
        super.m(i);
        if (z) {
            ((m) menu).v();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            d.t(this, (g) background);
        }
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        super.onLayout(z, i, i8, i9, i10);
        int i11 = 0;
        ImageView imageView2 = null;
        if (this.f9145S0 || this.f9146T0) {
            ArrayList d8 = k.d(this, getTitle());
            boolean isEmpty = d8.isEmpty();
            e eVar = k.f15463c;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(d8, eVar);
            }
            ArrayList d9 = k.d(this, getSubtitle());
            if (d9.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(d9, eVar);
            }
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i12 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt = getChildAt(i13);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i12 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i12 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f9145S0 && textView != null) {
                    x(textView, pair);
                }
                if (this.f9146T0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i11 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i11);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i11++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f9148V0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9147U0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f8);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f9148V0;
        if (bool == null || bool.booleanValue() != z) {
            this.f9148V0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f9147U0 != scaleType) {
            this.f9147U0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f9144R0 == null)) {
            drawable = E.e.z(drawable.mutate());
            drawable.setTint(this.f9144R0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f9144R0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f9146T0 != z) {
            this.f9146T0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f9145S0 != z) {
            this.f9145S0 = z;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i8 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i8 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i8 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i8 - i, b.MAX_POW2), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i8, textView.getBottom());
    }
}
