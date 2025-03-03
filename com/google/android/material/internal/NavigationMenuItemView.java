package com.google.android.material.internal;

import B3.g;
import E.e;
import N7.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.bumptech.glide.c;
import java.util.WeakHashMap;
import l0.l;
import n.o;
import n.z;
import o.C1305y0;
import t3.d;
import v0.C1510H;

public class NavigationMenuItemView extends d implements z {

    /* renamed from: D0  reason: collision with root package name */
    public static final int[] f9357D0 = {16842912};

    /* renamed from: A0  reason: collision with root package name */
    public boolean f9358A0;

    /* renamed from: B0  reason: collision with root package name */
    public Drawable f9359B0;

    /* renamed from: C0  reason: collision with root package name */
    public final g f9360C0;

    /* renamed from: s0  reason: collision with root package name */
    public int f9361s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f9362t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f9363u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f9364v0 = true;

    /* renamed from: w0  reason: collision with root package name */
    public final CheckedTextView f9365w0;

    /* renamed from: x0  reason: collision with root package name */
    public FrameLayout f9366x0;

    /* renamed from: y0  reason: collision with root package name */
    public o f9367y0;

    /* renamed from: z0  reason: collision with root package name */
    public ColorStateList f9368z0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g gVar = new g(4, this);
        this.f9360C0 = gVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131558455, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(2131165308));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131361979);
        this.f9365w0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1510H.p(checkedTextView, gVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f9366x0 == null) {
                this.f9366x0 = (FrameLayout) ((ViewStub) findViewById(2131361978)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f9366x0.removeAllViews();
            this.f9366x0.addView(view);
        }
    }

    public final void a(o oVar) {
        int i;
        StateListDrawable stateListDrawable;
        this.f9367y0 = oVar;
        int i8 = oVar.f13504U;
        if (i8 > 0) {
            setId(i8);
        }
        if (oVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130968816, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f9357D0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = C1510H.f15874a;
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f13508Y);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f13520k0);
        c.w(this, oVar.f13521l0);
        o oVar2 = this.f9367y0;
        CharSequence charSequence = oVar2.f13508Y;
        CheckedTextView checkedTextView = this.f9365w0;
        if (charSequence == null && oVar2.getIcon() == null && this.f9367y0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f9366x0;
            if (frameLayout != null) {
                C1305y0 y0Var = (C1305y0) frameLayout.getLayoutParams();
                y0Var.width = -1;
                this.f9366x0.setLayoutParams(y0Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f9366x0;
        if (frameLayout2 != null) {
            C1305y0 y0Var2 = (C1305y0) frameLayout2.getLayoutParams();
            y0Var2.width = -2;
            this.f9366x0.setLayoutParams(y0Var2);
        }
    }

    public o getItemData() {
        return this.f9367y0;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.f9367y0;
        if (oVar != null && oVar.isCheckable() && this.f9367y0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9357D0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f9363u0 != z) {
            this.f9363u0 = z;
            this.f9360C0.h(this.f9365w0, 2048);
        }
    }

    public void setChecked(boolean z) {
        int i;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f9365w0;
        checkedTextView.setChecked(z);
        Typeface typeface = checkedTextView.getTypeface();
        if (!z || !this.f9364v0) {
            i = 0;
        } else {
            i = 1;
        }
        checkedTextView.setTypeface(typeface, i);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f9358A0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = e.z(drawable).mutate();
                drawable.setTintList(this.f9368z0);
            }
            int i = this.f9361s0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f9362t0) {
            if (this.f9359B0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f13083a;
                Drawable drawable2 = resources.getDrawable(2131231078, theme);
                this.f9359B0 = drawable2;
                if (drawable2 != null) {
                    int i8 = this.f9361s0;
                    drawable2.setBounds(0, 0, i8, i8);
                }
            }
            drawable = this.f9359B0;
        }
        this.f9365w0.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f9365w0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f9361s0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f9368z0 = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f9358A0 = z;
        o oVar = this.f9367y0;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f9365w0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f9362t0 = z;
    }

    public void setTextAppearance(int i) {
        a.v(this.f9365w0, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f9365w0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f9365w0.setText(charSequence);
    }
}
