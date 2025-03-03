package C3;

import A.d;
import B.B;
import B.C0003d;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.bumptech.glide.c;
import com.google.android.material.textfield.TextInputLayout;
import g3.C0958a;
import java.util.WeakHashMap;
import v0.C1510H;
import w0.C1576e;

public final class n extends t {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f599f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f600g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f601h;
    public final C0025a i = new C0025a(1, this);

    /* renamed from: j  reason: collision with root package name */
    public final C0026b f602j = new C0026b(this, 1);

    /* renamed from: k  reason: collision with root package name */
    public final B f603k = new B(3, this);

    /* renamed from: l  reason: collision with root package name */
    public boolean f604l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f605m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f606n;

    /* renamed from: o  reason: collision with root package name */
    public long f607o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f608p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f609q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f610r;

    public n(s sVar) {
        super(sVar);
        this.f599f = C0003d.I(sVar.getContext(), 2130969400, 67);
        this.e = C0003d.I(sVar.getContext(), 2130969400, 50);
        this.f600g = C0003d.J(sVar.getContext(), 2130969409, C0958a.f12005a);
    }

    public final void a() {
        if (this.f608p.isTouchExplorationEnabled() && c.q(this.f601h) && !this.f643d.hasFocus()) {
            this.f601h.dismissDropDown();
        }
        this.f601h.post(new d(7, this));
    }

    public final int c() {
        return 2131951772;
    }

    public final int d() {
        return 2131231053;
    }

    public final View.OnFocusChangeListener e() {
        return this.f602j;
    }

    public final View.OnClickListener f() {
        return this.i;
    }

    public final B h() {
        return this.f603k;
    }

    public final boolean i(int i8) {
        if (i8 != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return this.f604l;
    }

    public final boolean l() {
        return this.f606n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f601h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new k(0, this));
            this.f601h.setOnDismissListener(new l(this));
            this.f601h.setThreshold(0);
            TextInputLayout textInputLayout = this.f640a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!c.q(editText) && this.f608p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = C1510H.f15874a;
                this.f643d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(C1576e eVar) {
        boolean z;
        if (!c.q(this.f601h)) {
            eVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z = eVar.f16192a.isShowingHintText();
        } else {
            z = eVar.e(4);
        }
        if (z) {
            eVar.j((String) null);
        }
    }

    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.f608p.isEnabled() && !c.q(this.f601h)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f606n && !this.f601h.isPopupShowing()) {
                z = true;
            } else {
                z = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                u();
                this.f605m = true;
                this.f607o = System.currentTimeMillis();
            }
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f600g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f599f);
        ofFloat.addUpdateListener(new j(0, this));
        this.f610r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.e);
        ofFloat2.addUpdateListener(new j(0, this));
        this.f609q = ofFloat2;
        ofFloat2.addListener(new m(0, this));
        this.f608p = (AccessibilityManager) this.f642c.getSystemService("accessibility");
    }

    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f601h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.f601h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z) {
        if (this.f606n != z) {
            this.f606n = z;
            this.f610r.cancel();
            this.f609q.start();
        }
    }

    public final void u() {
        boolean z;
        if (this.f601h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f607o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f605m = false;
            }
            if (!this.f605m) {
                t(!this.f606n);
                if (this.f606n) {
                    this.f601h.requestFocus();
                    this.f601h.showDropDown();
                    return;
                }
                this.f601h.dismissDropDown();
                return;
            }
            this.f605m = false;
        }
    }
}
