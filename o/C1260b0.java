package o;

import B.C0003d;
import D.F;
import N7.a;
import Q0.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.b;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k2.C1160q;
import m0.C1200f;
import t0.C1415c;
import t0.C1416d;
import y0.k;

/* renamed from: o.b0  reason: case insensitive filesystem */
public class C1260b0 extends TextView implements k {

    /* renamed from: U  reason: collision with root package name */
    public final t f13919U;

    /* renamed from: V  reason: collision with root package name */
    public final X f13920V;

    /* renamed from: W  reason: collision with root package name */
    public final C1248A f13921W;

    /* renamed from: a0  reason: collision with root package name */
    public C1298v f13922a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f13923b0;

    /* renamed from: c0  reason: collision with root package name */
    public C1160q f13924c0;

    /* renamed from: d0  reason: collision with root package name */
    public Future f13925d0;

    public C1260b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private C1298v getEmojiTextViewHelper() {
        if (this.f13922a0 == null) {
            this.f13922a0 = new C1298v(this);
        }
        return this.f13922a0;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f13919U;
        if (tVar != null) {
            tVar.c();
        }
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void g() {
        Future future = this.f13925d0;
        if (future != null) {
            try {
                this.f13925d0 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                } else if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                } else {
                    a.l(this);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (w1.f14106c) {
            return super.getAutoSizeMaxTextSize();
        }
        X x8 = this.f13920V;
        if (x8 != null) {
            return Math.round(x8.i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (w1.f14106c) {
            return super.getAutoSizeMinTextSize();
        }
        X x8 = this.f13920V;
        if (x8 != null) {
            return Math.round(x8.i.f13959d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (w1.f14106c) {
            return super.getAutoSizeStepGranularity();
        }
        X x8 = this.f13920V;
        if (x8 != null) {
            return Math.round(x8.i.f13958c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (w1.f14106c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        X x8 = this.f13920V;
        if (x8 != null) {
            return x8.i.f13960f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!w1.f14106c) {
            X x8 = this.f13920V;
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

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public Y getSuperCaller() {
        if (this.f13924c0 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f13924c0 = new C1258a0(this);
            } else if (i >= 28) {
                this.f13924c0 = new Z(this);
            } else if (i >= 26) {
                this.f13924c0 = new C1160q(12, (Object) this);
            }
        }
        return this.f13924c0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f13919U;
        if (tVar != null) {
            return tVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f13919U;
        if (tVar != null) {
            return tVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13920V.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13920V.e();
    }

    public CharSequence getText() {
        g();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C1248A a8;
        if (Build.VERSION.SDK_INT >= 28 || (a8 = this.f13921W) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a8.f13795c;
        if (textClassifier == null) {
            return Q.a((TextView) a8.f13794b);
        }
        return textClassifier;
    }

    public C1415c getTextMetricsParamsCompat() {
        return a.l(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f13920V.getClass();
        X.h(editorInfo, onCreateInputConnection, this);
        b.w(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        super.onLayout(z, i, i8, i9, i10);
        X x8 = this.f13920V;
        if (x8 != null && !w1.f14106c) {
            x8.i.a();
        }
    }

    public void onMeasure(int i, int i8) {
        g();
        super.onMeasure(i, i8);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        super.onTextChanged(charSequence, i, i8, i9);
        X x8 = this.f13920V;
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
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.i(i, i8, i9, i10);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (w1.f14106c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.j(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (w1.f14106c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.k(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f13919U;
        if (tVar != null) {
            tVar.h();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t tVar = this.f13919U;
        if (tVar != null) {
            tVar.i(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.b();
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

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().v(i);
        } else {
            a.s(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i);
        } else {
            a.t(this, i);
        }
    }

    public void setLineHeight(int i) {
        a.u(this, i);
    }

    public void setPrecomputedText(C1416d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        a.l(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f13919U;
        if (tVar != null) {
            tVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f13919U;
        if (tVar != null) {
            tVar.m(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x8 = this.f13920V;
        x8.l(colorStateList);
        x8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x8 = this.f13920V;
        x8.m(mode);
        x8.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.g(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C1248A a8;
        if (Build.VERSION.SDK_INT >= 28 || (a8 = this.f13921W) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a8.f13795c = textClassifier;
        }
    }

    public void setTextFuture(Future<C1416d> future) {
        this.f13925d0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1415c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f15174b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (!(textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        int i8 = Build.VERSION.SDK_INT;
        TextPaint textPaint = cVar.f15173a;
        if (i8 < 23) {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(textPaint);
        I.a.o(this, cVar.f15175c);
        I.a.r(this, cVar.f15176d);
    }

    public final void setTextSize(int i, float f8) {
        boolean z = w1.f14106c;
        if (z) {
            super.setTextSize(i, f8);
            return;
        }
        X x8 = this.f13920V;
        if (x8 != null && !z) {
            C1270g0 g0Var = x8.i;
            if (!g0Var.f()) {
                g0Var.g(i, f8);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (!this.f13923b0) {
            if (typeface == null || i <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                D7.b bVar = C1200f.f13323a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f13923b0 = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f13923b0 = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1260b0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e1.a(context);
        this.f13923b0 = false;
        this.f13924c0 = null;
        d1.a(this, getContext());
        t tVar = new t((View) this);
        this.f13919U = tVar;
        tVar.g(attributeSet, i);
        X x8 = new X(this);
        this.f13920V = x8;
        x8.f(attributeSet, i);
        x8.b();
        C1248A a8 = new C1248A();
        a8.f13794b = this;
        this.f13921W = a8;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    public final void setLineHeight(int i, float f8) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            getSuperCaller().B(i, f8);
        } else if (i8 >= 34) {
            F.k(this, i, f8);
        } else {
            a.u(this, Math.round(TypedValue.applyDimension(i, f8, getResources().getDisplayMetrics())));
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i8, int i9, int i10) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable r8 = i != 0 ? C0003d.r(context, i) : null;
        Drawable r9 = i8 != 0 ? C0003d.r(context, i8) : null;
        Drawable r10 = i9 != 0 ? C0003d.r(context, i9) : null;
        if (i10 != 0) {
            drawable = C0003d.r(context, i10);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r9, r10, drawable);
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i8, int i9, int i10) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable r8 = i != 0 ? C0003d.r(context, i) : null;
        Drawable r9 = i8 != 0 ? C0003d.r(context, i8) : null;
        Drawable r10 = i9 != 0 ? C0003d.r(context, i9) : null;
        if (i10 != 0) {
            drawable = C0003d.r(context, i10);
        }
        setCompoundDrawablesWithIntrinsicBounds(r8, r9, r10, drawable);
        X x8 = this.f13920V;
        if (x8 != null) {
            x8.b();
        }
    }
}
