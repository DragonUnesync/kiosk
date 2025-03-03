package com.google.android.material.button;

import B.C0003d;
import B0.b;
import E.e;
import E3.a;
import Q0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.bumptech.glide.d;
import f3.C0899a;
import j0.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k2.C1160q;
import l3.C1173a;
import l3.C1174b;
import l3.c;
import o.C1287p;
import t3.k;
import v0.C1510H;
import z3.C1646a;
import z3.j;
import z3.u;

public class MaterialButton extends C1287p implements Checkable, u {

    /* renamed from: o0  reason: collision with root package name */
    public static final int[] f9216o0 = {16842911};
    public static final int[] p0 = {16842912};

    /* renamed from: a0  reason: collision with root package name */
    public final c f9217a0;

    /* renamed from: b0  reason: collision with root package name */
    public final LinkedHashSet f9218b0 = new LinkedHashSet();

    /* renamed from: c0  reason: collision with root package name */
    public C1173a f9219c0;

    /* renamed from: d0  reason: collision with root package name */
    public PorterDuff.Mode f9220d0;

    /* renamed from: e0  reason: collision with root package name */
    public ColorStateList f9221e0;

    /* renamed from: f0  reason: collision with root package name */
    public Drawable f9222f0;

    /* renamed from: g0  reason: collision with root package name */
    public String f9223g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f9224h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f9225i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f9226j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f9227k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f9228l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f9229m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f9230n0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969318, 2132018233), attributeSet, 2130969318);
        boolean z = false;
        this.f9228l0 = false;
        this.f9229m0 = false;
        Context context2 = getContext();
        TypedArray f8 = k.f(context2, attributeSet, C0899a.f11656j, 2130969318, 2132018233, new int[0]);
        this.f9227k0 = f8.getDimensionPixelSize(12, 0);
        int i = f8.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f9220d0 = k.g(i, mode);
        this.f9221e0 = com.bumptech.glide.c.j(getContext(), f8, 14);
        this.f9222f0 = com.bumptech.glide.c.o(getContext(), f8, 10);
        this.f9230n0 = f8.getInteger(11, 1);
        this.f9224h0 = f8.getDimensionPixelSize(13, 0);
        c cVar = new c(this, z3.k.b(context2, attributeSet, 2130969318, 2132018233).a());
        this.f9217a0 = cVar;
        cVar.f13174c = f8.getDimensionPixelOffset(1, 0);
        cVar.f13175d = f8.getDimensionPixelOffset(2, 0);
        cVar.e = f8.getDimensionPixelOffset(3, 0);
        cVar.f13176f = f8.getDimensionPixelOffset(4, 0);
        if (f8.hasValue(8)) {
            int dimensionPixelSize = f8.getDimensionPixelSize(8, -1);
            cVar.f13177g = dimensionPixelSize;
            float f9 = (float) dimensionPixelSize;
            j e = cVar.f13173b.e();
            e.e = new C1646a(f9);
            e.f16495f = new C1646a(f9);
            e.f16496g = new C1646a(f9);
            e.f16497h = new C1646a(f9);
            cVar.c(e.a());
            cVar.f13185p = true;
        }
        cVar.f13178h = f8.getDimensionPixelSize(20, 0);
        cVar.i = k.g(f8.getInt(7, -1), mode);
        cVar.f13179j = com.bumptech.glide.c.j(getContext(), f8, 6);
        cVar.f13180k = com.bumptech.glide.c.j(getContext(), f8, 19);
        cVar.f13181l = com.bumptech.glide.c.j(getContext(), f8, 16);
        cVar.f13186q = f8.getBoolean(5, false);
        cVar.f13189t = f8.getDimensionPixelSize(9, 0);
        cVar.f13187r = f8.getBoolean(21, true);
        WeakHashMap weakHashMap = C1510H.f15874a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f8.hasValue(0)) {
            cVar.f13184o = true;
            setSupportBackgroundTintList(cVar.f13179j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f13174c, paddingTop + cVar.e, paddingEnd + cVar.f13175d, paddingBottom + cVar.f13176f);
        f8.recycle();
        setCompoundDrawablePadding(this.f9227k0);
        d(this.f9222f0 != null ? true : z);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f8 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f8 = Math.max(f8, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil((double) f8);
    }

    public final boolean a() {
        c cVar = this.f9217a0;
        if (cVar == null || !cVar.f13186q) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        c cVar = this.f9217a0;
        if (cVar == null || cVar.f13184o) {
            return false;
        }
        return true;
    }

    public final void c() {
        int i = this.f9230n0;
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.f9222f0, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i == 3 || i == 4) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.f9222f0, (Drawable) null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative((Drawable) null, this.f9222f0, (Drawable) null, (Drawable) null);
        }
    }

    public final void d(boolean z) {
        Drawable drawable = this.f9222f0;
        if (drawable != null) {
            Drawable mutate = e.z(drawable).mutate();
            this.f9222f0 = mutate;
            mutate.setTintList(this.f9221e0);
            PorterDuff.Mode mode = this.f9220d0;
            if (mode != null) {
                this.f9222f0.setTintMode(mode);
            }
            int i = this.f9224h0;
            if (i == 0) {
                i = this.f9222f0.getIntrinsicWidth();
            }
            int i8 = this.f9224h0;
            if (i8 == 0) {
                i8 = this.f9222f0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9222f0;
            int i9 = this.f9225i0;
            int i10 = this.f9226j0;
            drawable2.setBounds(i9, i10, i + i9, i8 + i10);
            this.f9222f0.setVisible(true, z);
        }
        if (z) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.f9230n0;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f9222f0) || (((i11 == 3 || i11 == 4) && drawable5 != this.f9222f0) || ((i11 == 16 || i11 == 32) && drawable4 != this.f9222f0))) {
            c();
        }
    }

    public final void e(int i, int i8) {
        boolean z;
        boolean z6;
        if (this.f9222f0 != null && getLayout() != null) {
            int i9 = this.f9230n0;
            boolean z8 = true;
            if (i9 == 1 || i9 == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z || i9 == 3 || i9 == 4) {
                this.f9226j0 = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i10 = this.f9230n0;
                if (i10 == 1 || i10 == 3 || ((i10 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i10 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f9225i0 = 0;
                    d(false);
                    return;
                }
                int i11 = this.f9224h0;
                if (i11 == 0) {
                    i11 = this.f9222f0.getIntrinsicWidth();
                }
                int textLayoutWidth = i - getTextLayoutWidth();
                WeakHashMap weakHashMap = C1510H.f15874a;
                int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i11) - this.f9227k0) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    paddingEnd /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.f9230n0 != 4) {
                    z8 = false;
                }
                if (z6 != z8) {
                    paddingEnd = -paddingEnd;
                }
                if (this.f9225i0 != paddingEnd) {
                    this.f9225i0 = paddingEnd;
                    d(false);
                }
            } else if (i9 == 16 || i9 == 32) {
                this.f9225i0 = 0;
                if (i9 == 16) {
                    this.f9226j0 = 0;
                    d(false);
                    return;
                }
                int i12 = this.f9224h0;
                if (i12 == 0) {
                    i12 = this.f9222f0.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i8 - getTextHeight()) - getPaddingTop()) - i12) - this.f9227k0) - getPaddingBottom()) / 2);
                if (this.f9226j0 != max) {
                    this.f9226j0 = max;
                    d(false);
                }
            }
        }
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f9223g0)) {
            return this.f9223g0;
        }
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f9217a0.f13177g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f9222f0;
    }

    public int getIconGravity() {
        return this.f9230n0;
    }

    public int getIconPadding() {
        return this.f9227k0;
    }

    public int getIconSize() {
        return this.f9224h0;
    }

    public ColorStateList getIconTint() {
        return this.f9221e0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f9220d0;
    }

    public int getInsetBottom() {
        return this.f9217a0.f13176f;
    }

    public int getInsetTop() {
        return this.f9217a0.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f9217a0.f13181l;
        }
        return null;
    }

    public z3.k getShapeAppearanceModel() {
        if (b()) {
            return this.f9217a0.f13173b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f9217a0.f13180k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f9217a0.f13178h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f9217a0.f13179j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f9217a0.i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.f9228l0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            d.t(this, this.f9217a0.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f9216o0);
        }
        if (this.f9228l0) {
            View.mergeDrawableStates(onCreateDrawableState, p0);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f9228l0);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f9228l0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        c cVar;
        super.onLayout(z, i, i8, i9, i10);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f9217a0) != null) {
            int i11 = i10 - i8;
            int i12 = i9 - i;
            Drawable drawable = cVar.f13182m;
            if (drawable != null) {
                drawable.setBounds(cVar.f13174c, cVar.e, i12 - cVar.f13175d, i11 - cVar.f13176f);
            }
        }
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1174b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1174b bVar = (C1174b) parcelable;
        super.onRestoreInstanceState(bVar.f367U);
        setChecked(bVar.f13169W);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, l3.b, B0.b] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new b(super.onSaveInstanceState());
        bVar.f13169W = this.f9228l0;
        return bVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        super.onTextChanged(charSequence, i, i8, i9);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.f9217a0.f13187r) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f9222f0 != null) {
            if (this.f9222f0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f9223g0 = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (b()) {
            c cVar = this.f9217a0;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            c cVar = this.f9217a0;
            cVar.f13184o = true;
            ColorStateList colorStateList = cVar.f13179j;
            MaterialButton materialButton = cVar.f13172a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(cVar.i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0003d.r(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (b()) {
            this.f9217a0.f13186q = z;
        }
    }

    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.f9228l0 != z) {
            this.f9228l0 = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z6 = this.f9228l0;
                if (!materialButtonToggleGroup.f9237c0) {
                    materialButtonToggleGroup.b(getId(), z6);
                }
            }
            if (!this.f9229m0) {
                this.f9229m0 = true;
                Iterator it = this.f9218b0.iterator();
                if (!it.hasNext()) {
                    this.f9229m0 = false;
                    return;
                }
                throw g.k(it);
            }
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c cVar = this.f9217a0;
            if (!cVar.f13185p || cVar.f13177g != i) {
                cVar.f13177g = i;
                cVar.f13185p = true;
                float f8 = (float) i;
                j e = cVar.f13173b.e();
                e.e = new C1646a(f8);
                e.f16495f = new C1646a(f8);
                e.f16496g = new C1646a(f8);
                e.f16497h = new C1646a(f8);
                cVar.c(e.a());
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        if (b()) {
            this.f9217a0.b(false).i(f8);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f9222f0 != drawable) {
            this.f9222f0 = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f9230n0 != i) {
            this.f9230n0 = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f9227k0 != i) {
            this.f9227k0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0003d.r(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f9224h0 != i) {
            this.f9224h0 = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f9221e0 != colorStateList) {
            this.f9221e0 = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f9220d0 != mode) {
            this.f9220d0 = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(f.c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.f9217a0;
        cVar.d(cVar.e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.f9217a0;
        cVar.d(i, cVar.f13176f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C1173a aVar) {
        this.f9219c0 = aVar;
    }

    public void setPressed(boolean z) {
        C1173a aVar = this.f9219c0;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((C1160q) aVar).f13026V).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f9217a0;
            if (cVar.f13181l != colorStateList) {
                cVar.f13181l = colorStateList;
                boolean z = c.f13170u;
                MaterialButton materialButton = cVar.f13172a;
                if (z && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(x3.d.a(colorStateList));
                } else if (!z && (materialButton.getBackground() instanceof x3.b)) {
                    ((x3.b) materialButton.getBackground()).setTintList(x3.d.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(f.c(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(z3.k kVar) {
        if (b()) {
            this.f9217a0.c(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (b()) {
            c cVar = this.f9217a0;
            cVar.f13183n = z;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f9217a0;
            if (cVar.f13180k != colorStateList) {
                cVar.f13180k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(f.c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            c cVar = this.f9217a0;
            if (cVar.f13178h != i) {
                cVar.f13178h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f9217a0;
            if (cVar.f13179j != colorStateList) {
                cVar.f13179j = colorStateList;
                if (cVar.b(false) != null) {
                    cVar.b(false).setTintList(cVar.f13179j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            c cVar = this.f9217a0;
            if (cVar.i != mode) {
                cVar.i = mode;
                if (cVar.b(false) != null && cVar.i != null) {
                    cVar.b(false).setTintMode(cVar.i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f9217a0.f13187r = z;
    }

    public final void toggle() {
        setChecked(!this.f9228l0);
    }
}
