package o;

import N7.a;
import Q0.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import y0.k;

/* renamed from: o.p  reason: case insensitive filesystem */
public class C1287p extends Button implements k {

    /* renamed from: U  reason: collision with root package name */
    public final t f14036U;

    /* renamed from: V  reason: collision with root package name */
    public final X f14037V;

    /* renamed from: W  reason: collision with root package name */
    public C1298v f14038W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1287p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e1.a(context);
        d1.a(this, getContext());
        t tVar = new t((View) this);
        this.f14036U = tVar;
        tVar.g(attributeSet, i);
        X x8 = new X(this);
        this.f14037V = x8;
        x8.f(attributeSet, i);
        x8.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private C1298v getEmojiTextViewHelper() {
        if (this.f14038W == null) {
            this.f14038W = new C1298v(this);
        }
        return this.f14038W;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f14036U;
        if (tVar != null) {
            tVar.c();
        }
        X x8 = this.f14037V;
        if (x8 != null) {
            x8.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (w1.f14106c) {
            return super.getAutoSizeMaxTextSize();
        }
        X x8 = this.f14037V;
        if (x8 != null) {
            return Math.round(x8.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (w1.f14106c) {
            return super.getAutoSizeMinTextSize();
        }
        X x8 = this.f14037V;
        if (x8 != null) {
            return Math.round(x8.i.f13959d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (w1.f14106c) {
            return super.getAutoSizeStepGranularity();
        }
        X x8 = this.f14037V;
        if (x8 != null) {
            return Math.round(x8.i.f13958c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (w1.f14106c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        X x8 = this.f14037V;
        if (x8 != null) {
            return x8.i.f13960f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!w1.f14106c) {
            X x8 = this.f14037V;
            if (x8 != null) {
                return x8.i.f13956a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14036U;
        if (tVar != null) {
            return tVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14036U;
        if (tVar != null) {
            return tVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14037V.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14037V.e();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        X x8 = this.f14037V;
        if (x8 != null && !w1.f14106c) {
            x8.i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        super.onTextChanged(charSequence, i, i8, i9);
        X x8 = this.f14037V;
        if (x8 != null && !w1.f14106c) {
            C1270g0 g0Var = x8.i;
            if (g0Var.f()) {
                g0Var.a();
            }
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i8, int i9, int i10) {
        if (w1.f14106c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i8, i9, i10);
            return;
        }
        X x8 = this.f14037V;
        if (x8 != null) {
            x8.i(i, i8, i9, i10);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (w1.f14106c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        X x8 = this.f14037V;
        if (x8 != null) {
            x8.j(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (w1.f14106c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        X x8 = this.f14037V;
        if (x8 != null) {
            x8.k(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14036U;
        if (tVar != null) {
            tVar.h();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t tVar = this.f14036U;
        if (tVar != null) {
            tVar.i(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.B(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        X x8 = this.f14037V;
        if (x8 != null) {
            x8.f13896a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14036U;
        if (tVar != null) {
            tVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14036U;
        if (tVar != null) {
            tVar.m(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x8 = this.f14037V;
        x8.l(colorStateList);
        x8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x8 = this.f14037V;
        x8.m(mode);
        x8.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x8 = this.f14037V;
        if (x8 != null) {
            x8.g(context, i);
        }
    }

    public final void setTextSize(int i, float f8) {
        boolean z = w1.f14106c;
        if (z) {
            super.setTextSize(i, f8);
            return;
        }
        X x8 = this.f14037V;
        if (x8 != null && !z) {
            C1270g0 g0Var = x8.i;
            if (!g0Var.f()) {
                g0Var.g(i, f8);
            }
        }
    }
}
