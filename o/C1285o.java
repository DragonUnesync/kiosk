package o;

import B.C0003d;
import N7.a;
import Q0.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.b;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import y0.k;

/* renamed from: o.o  reason: case insensitive filesystem */
public class C1285o extends AutoCompleteTextView implements k {

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f14016a0 = {16843126};

    /* renamed from: U  reason: collision with root package name */
    public final t f14017U;

    /* renamed from: V  reason: collision with root package name */
    public final X f14018V;

    /* renamed from: W  reason: collision with root package name */
    public final C1248A f14019W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1285o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968641);
        e1.a(context);
        d1.a(this, getContext());
        d4.k K22 = d4.k.K2(getContext(), attributeSet, f14016a0, 2130968641);
        if (((TypedArray) K22.f9767W).hasValue(0)) {
            setDropDownBackgroundDrawable(K22.I(0));
        }
        K22.M2();
        t tVar = new t((View) this);
        this.f14017U = tVar;
        tVar.g(attributeSet, 2130968641);
        X x8 = new X(this);
        this.f14018V = x8;
        x8.f(attributeSet, 2130968641);
        x8.b();
        C1248A a8 = new C1248A((EditText) this);
        this.f14019W = a8;
        a8.b(attributeSet, 2130968641);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a9 = a8.a(keyListener);
            if (a9 != keyListener) {
                super.setKeyListener(a9);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f14017U;
        if (tVar != null) {
            tVar.c();
        }
        X x8 = this.f14018V;
        if (x8 != null) {
            x8.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14017U;
        if (tVar != null) {
            return tVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14017U;
        if (tVar != null) {
            return tVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14018V.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14018V.e();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.w(editorInfo, onCreateInputConnection, this);
        return this.f14019W.c(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14017U;
        if (tVar != null) {
            tVar.h();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t tVar = this.f14017U;
        if (tVar != null) {
            tVar.i(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f14018V;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f14018V;
        if (x8 != null) {
            x8.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.B(callback, this));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0003d.r(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f14019W.d(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14019W.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14017U;
        if (tVar != null) {
            tVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14017U;
        if (tVar != null) {
            tVar.m(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x8 = this.f14018V;
        x8.l(colorStateList);
        x8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x8 = this.f14018V;
        x8.m(mode);
        x8.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x8 = this.f14018V;
        if (x8 != null) {
            x8.g(context, i);
        }
    }
}
