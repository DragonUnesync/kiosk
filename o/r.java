package o;

import B.C0003d;
import N7.a;
import Q0.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.b;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import b2.C0526e;
import y0.k;

public final class r extends CheckedTextView implements k {

    /* renamed from: U  reason: collision with root package name */
    public final C0526e f14049U = new C0526e(this);

    /* renamed from: V  reason: collision with root package name */
    public final t f14050V;

    /* renamed from: W  reason: collision with root package name */
    public final X f14051W;

    /* renamed from: a0  reason: collision with root package name */
    public C1298v f14052a0;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            o.e1.a(r9)
            r6 = 2130968763(0x7f0400bb, float:1.7546189E38)
            r8.<init>(r9, r10, r6)
            android.content.Context r9 = r8.getContext()
            o.d1.a(r8, r9)
            o.X r9 = new o.X
            r9.<init>(r8)
            r8.f14051W = r9
            r9.f(r10, r6)
            r9.b()
            Q0.t r9 = new Q0.t
            r9.<init>((android.view.View) r8)
            r8.f14050V = r9
            r9.g(r10, r6)
            b2.e r9 = new b2.e
            r9.<init>(r8)
            r8.f14049U = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = g.C0940a.f11823l
            d4.k r9 = d4.k.K2(r9, r10, r2, r6)
            java.lang.Object r0 = r9.f9767W
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.lang.Object r0 = r9.f9767W
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r8
            r3 = r10
            r5 = r6
            v0.C1510H.o(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r7.hasValue(r0)     // Catch:{ all -> 0x0066 }
            r2 = 0
            if (r1 == 0) goto L_0x0068
            int r0 = r7.getResourceId(r0, r2)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0068
            android.content.Context r1 = r8.getContext()     // Catch:{ NotFoundException -> 0x0068 }
            android.graphics.drawable.Drawable r0 = B.C0003d.r(r1, r0)     // Catch:{ NotFoundException -> 0x0068 }
            r8.setCheckMarkDrawable((android.graphics.drawable.Drawable) r0)     // Catch:{ NotFoundException -> 0x0068 }
            goto L_0x007f
        L_0x0066:
            r10 = move-exception
            goto L_0x00ac
        L_0x0068:
            boolean r0 = r7.hasValue(r2)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x007f
            int r0 = r7.getResourceId(r2, r2)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x007f
            android.content.Context r1 = r8.getContext()     // Catch:{ all -> 0x0066 }
            android.graphics.drawable.Drawable r0 = B.C0003d.r(r1, r0)     // Catch:{ all -> 0x0066 }
            r8.setCheckMarkDrawable((android.graphics.drawable.Drawable) r0)     // Catch:{ all -> 0x0066 }
        L_0x007f:
            r0 = 2
            boolean r1 = r7.hasValue(r0)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x008d
            android.content.res.ColorStateList r0 = r9.v(r0)     // Catch:{ all -> 0x0066 }
            r8.setCheckMarkTintList(r0)     // Catch:{ all -> 0x0066 }
        L_0x008d:
            r0 = 3
            boolean r1 = r7.hasValue(r0)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x00a1
            r1 = -1
            int r0 = r7.getInt(r0, r1)     // Catch:{ all -> 0x0066 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = o.C1286o0.c(r0, r1)     // Catch:{ all -> 0x0066 }
            r8.setCheckMarkTintMode(r0)     // Catch:{ all -> 0x0066 }
        L_0x00a1:
            r9.M2()
            o.v r9 = r8.getEmojiTextViewHelper()
            r9.b(r10, r6)
            return
        L_0x00ac:
            r9.M2()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C1298v getEmojiTextViewHelper() {
        if (this.f14052a0 == null) {
            this.f14052a0 = new C1298v(this);
        }
        return this.f14052a0;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        X x8 = this.f14051W;
        if (x8 != null) {
            x8.b();
        }
        t tVar = this.f14050V;
        if (tVar != null) {
            tVar.c();
        }
        C0526e eVar = this.f14049U;
        if (eVar != null) {
            eVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        t tVar = this.f14050V;
        if (tVar != null) {
            return tVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        t tVar = this.f14050V;
        if (tVar != null) {
            return tVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0526e eVar = this.f14049U;
        if (eVar != null) {
            return (ColorStateList) eVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0526e eVar = this.f14049U;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f8652f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14051W.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14051W.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.w(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t tVar = this.f14050V;
        if (tVar != null) {
            tVar.h();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        t tVar = this.f14050V;
        if (tVar != null) {
            tVar.i(i);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0526e eVar = this.f14049U;
        if (eVar == null) {
            return;
        }
        if (eVar.f8650c) {
            eVar.f8650c = false;
            return;
        }
        eVar.f8650c = true;
        eVar.b();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f14051W;
        if (x8 != null) {
            x8.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x8 = this.f14051W;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t tVar = this.f14050V;
        if (tVar != null) {
            tVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t tVar = this.f14050V;
        if (tVar != null) {
            tVar.m(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0526e eVar = this.f14049U;
        if (eVar != null) {
            eVar.e = colorStateList;
            eVar.f8648a = true;
            eVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0526e eVar = this.f14049U;
        if (eVar != null) {
            eVar.f8652f = mode;
            eVar.f8649b = true;
            eVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x8 = this.f14051W;
        x8.l(colorStateList);
        x8.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x8 = this.f14051W;
        x8.m(mode);
        x8.b();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x8 = this.f14051W;
        if (x8 != null) {
            x8.g(context, i);
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0003d.r(getContext(), i));
    }
}
