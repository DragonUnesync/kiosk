package o;

import B.C0003d;
import Q0.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import b2.C0526e;
import y0.C1624j;
import y0.k;

/* renamed from: o.B  reason: case insensitive filesystem */
public class C1249B extends RadioButton implements C1624j, k {

    /* renamed from: U  reason: collision with root package name */
    public final C0526e f13796U;

    /* renamed from: V  reason: collision with root package name */
    public final t f13797V;

    /* renamed from: W  reason: collision with root package name */
    public final X f13798W;

    /* renamed from: a0  reason: collision with root package name */
    public C1298v f13799a0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1249B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969499);
        e1.a(context);
        d1.a(this, getContext());
        C0526e eVar = new C0526e(this);
        this.f13796U = eVar;
        eVar.d(attributeSet, 2130969499);
        t tVar = new t((View) this);
        this.f13797V = tVar;
        tVar.g(attributeSet, 2130969499);
        X x8 = new X(this);
        this.f13798W = x8;
        x8.f(attributeSet, 2130969499);
        getEmojiTextViewHelper().b(attributeSet, 2130969499);
    }

    private C1298v getEmojiTextViewHelper() {
        if (this.f13799a0 == null) {
            this.f13799a0 = new C1298v(this);
        }
        return this.f13799a0;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f13797V;
        if (tVar != null) {
            tVar.c();
        }
        X x8 = this.f13798W;
        if (x8 != null) {
            x8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f13797V;
        if (tVar != null) {
            return tVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f13797V;
        if (tVar != null) {
            return tVar.f();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0526e eVar = this.f13796U;
        if (eVar != null) {
            return (ColorStateList) eVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0526e eVar = this.f13796U;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f8652f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13798W.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13798W.e();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f13797V;
        if (tVar != null) {
            tVar.h();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t tVar = this.f13797V;
        if (tVar != null) {
            tVar.i(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0526e eVar = this.f13796U;
        if (eVar == null) {
            return;
        }
        if (eVar.f8650c) {
            eVar.f8650c = false;
            return;
        }
        eVar.f8650c = true;
        eVar.a();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f13798W;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f13798W;
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
        t tVar = this.f13797V;
        if (tVar != null) {
            tVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f13797V;
        if (tVar != null) {
            tVar.m(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0526e eVar = this.f13796U;
        if (eVar != null) {
            eVar.e = colorStateList;
            eVar.f8648a = true;
            eVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0526e eVar = this.f13796U;
        if (eVar != null) {
            eVar.f8652f = mode;
            eVar.f8649b = true;
            eVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x8 = this.f13798W;
        x8.l(colorStateList);
        x8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x8 = this.f13798W;
        x8.m(mode);
        x8.b();
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0003d.r(getContext(), i));
    }
}
