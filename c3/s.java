package C3;

import B.B;
import B.C0003d;
import N7.a;
import Q0.g;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d4.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.C1260b0;
import v0.C1510H;
import w0.C1573b;

public final class s extends LinearLayout {

    /* renamed from: U  reason: collision with root package name */
    public final TextInputLayout f619U;

    /* renamed from: V  reason: collision with root package name */
    public final FrameLayout f620V;

    /* renamed from: W  reason: collision with root package name */
    public final CheckableImageButton f621W;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f622a0;

    /* renamed from: b0  reason: collision with root package name */
    public PorterDuff.Mode f623b0;

    /* renamed from: c0  reason: collision with root package name */
    public View.OnLongClickListener f624c0;

    /* renamed from: d0  reason: collision with root package name */
    public final CheckableImageButton f625d0;

    /* renamed from: e0  reason: collision with root package name */
    public final r f626e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f627f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public final LinkedHashSet f628g0 = new LinkedHashSet();

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f629h0;

    /* renamed from: i0  reason: collision with root package name */
    public PorterDuff.Mode f630i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f631j0;

    /* renamed from: k0  reason: collision with root package name */
    public ImageView.ScaleType f632k0;

    /* renamed from: l0  reason: collision with root package name */
    public View.OnLongClickListener f633l0;

    /* renamed from: m0  reason: collision with root package name */
    public CharSequence f634m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C1260b0 f635n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f636o0;
    public EditText p0;

    /* renamed from: q0  reason: collision with root package name */
    public final AccessibilityManager f637q0;

    /* renamed from: r0  reason: collision with root package name */
    public B f638r0;

    /* renamed from: s0  reason: collision with root package name */
    public final o f639s0 = new o(this);

    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Object, C3.r] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(TextInputLayout textInputLayout, k kVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        TextInputLayout textInputLayout2 = textInputLayout;
        k kVar2 = kVar;
        p pVar = new p(this);
        this.f637q0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f619U = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f620V = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a8 = a(this, from, 2131362566);
        this.f621W = a8;
        CheckableImageButton a9 = a(frameLayout, from, 2131362565);
        this.f625d0 = a9;
        ? obj = new Object();
        obj.f617c = new SparseArray();
        obj.f618d = this;
        TypedArray typedArray = (TypedArray) kVar2.f9767W;
        obj.f615a = typedArray.getResourceId(28, 0);
        obj.f616b = typedArray.getResourceId(52, 0);
        this.f626e0 = obj;
        CharSequence charSequence = null;
        C1260b0 b0Var = new C1260b0(getContext(), (AttributeSet) null);
        this.f635n0 = b0Var;
        TypedArray typedArray2 = (TypedArray) kVar2.f9767W;
        if (typedArray2.hasValue(38)) {
            this.f622a0 = c.l(getContext(), kVar2, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f623b0 = t3.k.g(typedArray2.getInt(39, -1), (PorterDuff.Mode) null);
        }
        if (typedArray2.hasValue(37)) {
            i(kVar2.I(37));
        }
        a8.setContentDescription(getResources().getText(2131951716));
        WeakHashMap weakHashMap = C1510H.f15874a;
        a8.setImportantForAccessibility(2);
        a8.setClickable(false);
        a8.setPressable(false);
        a8.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f629h0 = c.l(getContext(), kVar2, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f630i0 = t3.k.g(typedArray2.getInt(33, -1), (PorterDuff.Mode) null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && a9.getContentDescription() != (text = typedArray2.getText(27))) {
                a9.setContentDescription(text);
            }
            a9.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f629h0 = c.l(getContext(), kVar2, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f630i0 = t3.k.g(typedArray2.getInt(55, -1), (PorterDuff.Mode) null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (a9.getContentDescription() != text2) {
                a9.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(2131165932));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f631j0) {
                this.f631j0 = dimensionPixelSize;
                a9.setMinimumWidth(dimensionPixelSize);
                a9.setMinimumHeight(dimensionPixelSize);
                a8.setMinimumWidth(dimensionPixelSize);
                a8.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray2.hasValue(31)) {
                ImageView.ScaleType d8 = d.d(typedArray2.getInt(31, -1));
                this.f632k0 = d8;
                a9.setScaleType(d8);
                a8.setScaleType(d8);
            }
            b0Var.setVisibility(8);
            b0Var.setId(2131362573);
            b0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            b0Var.setAccessibilityLiveRegion(1);
            a.v(b0Var, typedArray2.getResourceId(72, 0));
            if (typedArray2.hasValue(73)) {
                b0Var.setTextColor(kVar2.v(73));
            }
            CharSequence text3 = typedArray2.getText(71);
            this.f634m0 = !TextUtils.isEmpty(text3) ? text3 : charSequence;
            b0Var.setText(text3);
            n();
            frameLayout.addView(a9);
            addView(b0Var);
            addView(frameLayout);
            addView(a8);
            textInputLayout2.f9423Y0.add(pVar);
            if (textInputLayout2.f9425a0 != null) {
                pVar.a(textInputLayout2);
            }
            addOnAttachStateChangeListener(new q(0, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(2131558456, viewGroup, false);
        checkableImageButton.setId(i);
        if (Build.VERSION.SDK_INT <= 22) {
            int[] iArr = x3.d.f16269a;
            checkableImageButton.setBackground(x3.c.b(checkableImageButton.getContext(), (int) TypedValue.applyDimension(1, (float) 4, checkableImageButton.getContext().getResources().getDisplayMetrics())));
        }
        if (c.r(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final t b() {
        t fVar;
        int i = this.f627f0;
        r rVar = this.f626e0;
        SparseArray sparseArray = (SparseArray) rVar.f617c;
        t tVar = (t) sparseArray.get(i);
        if (tVar == null) {
            s sVar = (s) rVar.f618d;
            if (i == -1) {
                fVar = new C0030f(sVar, 0);
            } else if (i == 0) {
                fVar = new C0030f(sVar, 1);
            } else if (i == 1) {
                tVar = new A(sVar, rVar.f616b);
                sparseArray.append(i, tVar);
            } else if (i == 2) {
                fVar = new C0029e(sVar);
            } else if (i == 3) {
                fVar = new n(sVar);
            } else {
                throw new IllegalArgumentException(g.m(i, "Invalid end icon mode: "));
            }
            tVar = fVar;
            sparseArray.append(i, tVar);
        }
        return tVar;
    }

    public final int c() {
        int i;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f625d0;
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        return this.f635n0.getPaddingEnd() + getPaddingEnd() + i;
    }

    public final boolean d() {
        if (this.f620V.getVisibility() == 0 && this.f625d0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f621W.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        boolean z6;
        boolean isActivated;
        boolean z8;
        t b8 = b();
        boolean k8 = b8.k();
        CheckableImageButton checkableImageButton = this.f625d0;
        boolean z9 = true;
        if (!k8 || (z8 = checkableImageButton.f9354a0) == b8.l()) {
            z6 = false;
        } else {
            checkableImageButton.setChecked(!z8);
            z6 = true;
        }
        if (!(b8 instanceof n) || (isActivated = checkableImageButton.isActivated()) == b8.j()) {
            z9 = z6;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z9) {
            d.q(this.f619U, checkableImageButton, this.f629h0);
        }
    }

    public final void g(int i) {
        boolean z;
        Drawable drawable;
        if (this.f627f0 != i) {
            t b8 = b();
            B b9 = this.f638r0;
            AccessibilityManager accessibilityManager = this.f637q0;
            if (!(b9 == null || accessibilityManager == null)) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new C1573b(b9));
            }
            CharSequence charSequence = null;
            this.f638r0 = null;
            b8.s();
            this.f627f0 = i;
            Iterator it = this.f628g0.iterator();
            if (!it.hasNext()) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                h(z);
                t b10 = b();
                int i8 = this.f626e0.f615a;
                if (i8 == 0) {
                    i8 = b10.d();
                }
                if (i8 != 0) {
                    drawable = C0003d.r(getContext(), i8);
                } else {
                    drawable = null;
                }
                CheckableImageButton checkableImageButton = this.f625d0;
                checkableImageButton.setImageDrawable(drawable);
                TextInputLayout textInputLayout = this.f619U;
                if (drawable != null) {
                    d.a(textInputLayout, checkableImageButton, this.f629h0, this.f630i0);
                    d.q(textInputLayout, checkableImageButton, this.f629h0);
                }
                int c8 = b10.c();
                if (c8 != 0) {
                    charSequence = getResources().getText(c8);
                }
                if (checkableImageButton.getContentDescription() != charSequence) {
                    checkableImageButton.setContentDescription(charSequence);
                }
                checkableImageButton.setCheckable(b10.k());
                if (b10.i(textInputLayout.getBoxBackgroundMode())) {
                    b10.r();
                    B h5 = b10.h();
                    this.f638r0 = h5;
                    if (!(h5 == null || accessibilityManager == null)) {
                        WeakHashMap weakHashMap = C1510H.f15874a;
                        if (isAttachedToWindow()) {
                            accessibilityManager.addTouchExplorationStateChangeListener(new C1573b(this.f638r0));
                        }
                    }
                    View.OnClickListener f8 = b10.f();
                    View.OnLongClickListener onLongClickListener = this.f633l0;
                    checkableImageButton.setOnClickListener(f8);
                    d.s(checkableImageButton, onLongClickListener);
                    EditText editText = this.p0;
                    if (editText != null) {
                        b10.m(editText);
                        j(b10);
                    }
                    d.a(textInputLayout, checkableImageButton, this.f629h0, this.f630i0);
                    f(true);
                    return;
                }
                throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
            }
            throw g.k(it);
        }
    }

    public final void h(boolean z) {
        int i;
        if (d() != z) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.f625d0.setVisibility(i);
            k();
            m();
            this.f619U.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f621W;
        checkableImageButton.setImageDrawable(drawable);
        l();
        d.a(this.f619U, checkableImageButton, this.f622a0, this.f623b0);
    }

    public final void j(t tVar) {
        if (this.p0 != null) {
            if (tVar.e() != null) {
                this.p0.setOnFocusChangeListener(tVar.e());
            }
            if (tVar.g() != null) {
                this.f625d0.setOnFocusChangeListener(tVar.g());
            }
        }
    }

    public final void k() {
        int i;
        char c8;
        int i8 = 8;
        if (this.f625d0.getVisibility() != 0 || e()) {
            i = 8;
        } else {
            i = 0;
        }
        this.f620V.setVisibility(i);
        if (this.f634m0 == null || this.f636o0) {
            c8 = 8;
        } else {
            c8 = 0;
        }
        if (d() || e() || c8 == 0) {
            i8 = 0;
        }
        setVisibility(i8);
    }

    public final void l() {
        int i;
        CheckableImageButton checkableImageButton = this.f621W;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f619U;
        if (drawable == null || !textInputLayout.f9437g0.f665q || !textInputLayout.m()) {
            i = 8;
        } else {
            i = 0;
        }
        checkableImageButton.setVisibility(i);
        k();
        m();
        if (this.f627f0 == 0) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f619U;
        if (textInputLayout.f9425a0 != null) {
            if (d() || e()) {
                i = 0;
            } else {
                EditText editText = textInputLayout.f9425a0;
                WeakHashMap weakHashMap = C1510H.f15874a;
                i = editText.getPaddingEnd();
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(2131165802);
            int paddingTop = textInputLayout.f9425a0.getPaddingTop();
            int paddingBottom = textInputLayout.f9425a0.getPaddingBottom();
            WeakHashMap weakHashMap2 = C1510H.f15874a;
            this.f635n0.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    public final void n() {
        int i;
        C1260b0 b0Var = this.f635n0;
        int visibility = b0Var.getVisibility();
        boolean z = false;
        if (this.f634m0 == null || this.f636o0) {
            i = 8;
        } else {
            i = 0;
        }
        if (visibility != i) {
            t b8 = b();
            if (i == 0) {
                z = true;
            }
            b8.p(z);
        }
        k();
        b0Var.setVisibility(i);
        this.f619U.q();
    }
}
