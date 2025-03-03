package o;

import Q0.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ToggleButton;
import y0.k;

/* renamed from: o.h0  reason: case insensitive filesystem */
public final class C1272h0 extends ToggleButton implements k {

    /* renamed from: U  reason: collision with root package name */
    public final t f13968U;

    /* renamed from: V  reason: collision with root package name */
    public final X f13969V;

    /* renamed from: W  reason: collision with root package name */
    public C1298v f13970W;

    public C1272h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        d1.a(this, getContext());
        t tVar = new t((View) this);
        this.f13968U = tVar;
        tVar.g(attributeSet, 16842827);
        X x8 = new X(this);
        this.f13969V = x8;
        x8.f(attributeSet, 16842827);
        getEmojiTextViewHelper().b(attributeSet, 16842827);
    }

    private C1298v getEmojiTextViewHelper() {
        if (this.f13970W == null) {
            this.f13970W = new C1298v(this);
        }
        return this.f13970W;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f13968U;
        if (tVar != null) {
            tVar.c();
        }
        X x8 = this.f13969V;
        if (x8 != null) {
            x8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f13968U;
        if (tVar != null) {
            return tVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f13968U;
        if (tVar != null) {
            return tVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13969V.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13969V.e();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f13968U;
        if (tVar != null) {
            tVar.h();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t tVar = this.f13968U;
        if (tVar != null) {
            tVar.i(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f13969V;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f13969V;
        if (x8 != null) {
            x8.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f13968U;
        if (tVar != null) {
            tVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f13968U;
        if (tVar != null) {
            tVar.m(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x8 = this.f13969V;
        x8.l(colorStateList);
        x8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x8 = this.f13969V;
        x8.m(mode);
        x8.b();
    }
}
