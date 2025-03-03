package o;

import N7.a;
import Q0.t;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import k2.C1160q;
import v0.C1510H;
import v0.C1531d;
import v0.C1533f;
import v0.C1543p;
import y0.C1623i;
import y0.k;

/* renamed from: o.u  reason: case insensitive filesystem */
public class C1296u extends EditText implements C1543p, k {

    /* renamed from: U  reason: collision with root package name */
    public final t f14079U;

    /* renamed from: V  reason: collision with root package name */
    public final X f14080V;

    /* renamed from: W  reason: collision with root package name */
    public final C1248A f14081W;

    /* renamed from: a0  reason: collision with root package name */
    public final C1623i f14082a0 = new Object();

    /* renamed from: b0  reason: collision with root package name */
    public final C1248A f14083b0;

    /* renamed from: c0  reason: collision with root package name */
    public C1294t f14084c0;

    /* JADX WARNING: type inference failed for: r5v5, types: [y0.i, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1296u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968987);
        e1.a(context);
        d1.a(this, getContext());
        t tVar = new t((View) this);
        this.f14079U = tVar;
        tVar.g(attributeSet, 2130968987);
        X x8 = new X(this);
        this.f14080V = x8;
        x8.f(attributeSet, 2130968987);
        x8.b();
        C1248A a8 = new C1248A();
        a8.f13794b = this;
        this.f14081W = a8;
        C1248A a9 = new C1248A((EditText) this);
        this.f14083b0 = a9;
        a9.b(attributeSet, 2130968987);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = a9.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private C1294t getSuperCaller() {
        if (this.f14084c0 == null) {
            this.f14084c0 = new C1294t(this);
        }
        return this.f14084c0;
    }

    public final C1533f a(C1533f fVar) {
        this.f14082a0.getClass();
        return C1623i.a(this, fVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f14079U;
        if (tVar != null) {
            tVar.c();
        }
        X x8 = this.f14080V;
        if (x8 != null) {
            x8.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14079U;
        if (tVar != null) {
            return tVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14079U;
        if (tVar != null) {
            return tVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14080V.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14080V.e();
    }

    public TextClassifier getTextClassifier() {
        C1248A a8;
        if (Build.VERSION.SDK_INT >= 28 || (a8 = this.f14081W) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) a8.f13795c;
        if (textClassifier == null) {
            return Q.a((TextView) a8.f13794b);
        }
        return textClassifier;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r1 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r1 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            o.X r1 = r7.f14080V
            r1.getClass()
            o.X.h(r8, r0, r7)
            android.support.v4.media.session.b.w(r8, r0, r7)
            if (r0 == 0) goto L_0x0078
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L_0x0078
            java.lang.String[] r2 = v0.C1510H.g(r7)
            if (r2 == 0) goto L_0x0078
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L_0x0029
            r8.contentMimeTypes = r2
            goto L_0x003e
        L_0x0029:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L_0x0034
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L_0x0034:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L_0x003e:
            androidx.camera.lifecycle.c r2 = new androidx.camera.lifecycle.c
            r6 = 21
            r2.<init>(r6, r7)
            if (r1 < r5) goto L_0x004e
            x0.c r1 = new x0.c
            r1.<init>(r0, r2)
        L_0x004c:
            r0 = r1
            goto L_0x0078
        L_0x004e:
            java.lang.String[] r6 = x0.C1596b.f16230a
            if (r1 < r5) goto L_0x005a
            java.lang.String[] r1 = r8.contentMimeTypes
            if (r1 == 0) goto L_0x006e
        L_0x0058:
            r6 = r1
            goto L_0x006e
        L_0x005a:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L_0x005f
            goto L_0x006e
        L_0x005f:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L_0x006b
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L_0x006b:
            if (r1 == 0) goto L_0x006e
            goto L_0x0058
        L_0x006e:
            int r1 = r6.length
            if (r1 != 0) goto L_0x0072
            goto L_0x0078
        L_0x0072:
            x0.d r1 = new x0.d
            r1.<init>(r0, r2)
            goto L_0x004c
        L_0x0078:
            o.A r1 = r7.f14083b0
            E0.b r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1296u.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && C1510H.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = C1251D.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i) {
        ClipData clipData;
        C1160q qVar;
        int i8;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31 || C1510H.g(this) == null || (i != 16908322 && i != 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            if (i9 >= 31) {
                qVar = new C1160q(clipData, 1);
            } else {
                C1531d dVar = new C1531d();
                dVar.f15931V = clipData;
                dVar.f15932W = 1;
                qVar = dVar;
            }
            if (i == 16908322) {
                i8 = 0;
            } else {
                i8 = 1;
            }
            qVar.D(i8);
            C1510H.l(this, qVar.d());
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14079U;
        if (tVar != null) {
            tVar.h();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t tVar = this.f14079U;
        if (tVar != null) {
            tVar.i(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f14080V;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f14080V;
        if (x8 != null) {
            x8.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.B(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f14083b0.d(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f14083b0.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14079U;
        if (tVar != null) {
            tVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14079U;
        if (tVar != null) {
            tVar.m(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x8 = this.f14080V;
        x8.l(colorStateList);
        x8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x8 = this.f14080V;
        x8.m(mode);
        x8.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x8 = this.f14080V;
        if (x8 != null) {
            x8.g(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C1248A a8;
        if (Build.VERSION.SDK_INT >= 28 || (a8 = this.f14081W) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a8.f13795c = textClassifier;
        }
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
