package C3;

import A.d;
import B.C0003d;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import g3.C0958a;

/* renamed from: C3.e  reason: case insensitive filesystem */
public final class C0029e extends t {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f582f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f583g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f584h;
    public EditText i;

    /* renamed from: j  reason: collision with root package name */
    public final C0025a f585j = new C0025a(0, this);

    /* renamed from: k  reason: collision with root package name */
    public final C0026b f586k = new C0026b(this, 0);

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f587l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f588m;

    public C0029e(s sVar) {
        super(sVar);
        this.e = C0003d.I(sVar.getContext(), 2130969400, 100);
        this.f582f = C0003d.I(sVar.getContext(), 2130969400, 150);
        this.f583g = C0003d.J(sVar.getContext(), 2130969409, C0958a.f12005a);
        this.f584h = C0003d.J(sVar.getContext(), 2130969407, C0958a.f12008d);
    }

    public final void a() {
        if (this.f641b.f634m0 == null) {
            t(u());
        }
    }

    public final int c() {
        return 2131951671;
    }

    public final int d() {
        return 2131231056;
    }

    public final View.OnFocusChangeListener e() {
        return this.f586k;
    }

    public final View.OnClickListener f() {
        return this.f585j;
    }

    public final View.OnFocusChangeListener g() {
        return this.f586k;
    }

    public final void m(EditText editText) {
        this.i = editText;
        this.f640a.setEndIconVisible(u());
    }

    public final void p(boolean z) {
        if (this.f641b.f634m0 != null) {
            t(z);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f584h);
        ofFloat.setDuration((long) this.f582f);
        ofFloat.addUpdateListener(new C0027c(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.f583g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i8 = this.e;
        ofFloat2.setDuration((long) i8);
        ofFloat2.addUpdateListener(new C0027c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f587l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f587l.addListener(new C0028d(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i8);
        ofFloat3.addUpdateListener(new C0027c(this, 0));
        this.f588m = ofFloat3;
        ofFloat3.addListener(new C0028d(this, 1));
    }

    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new d(6, this));
        }
    }

    public final void t(boolean z) {
        boolean z6;
        if (this.f641b.d() == z) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z && !this.f587l.isRunning()) {
            this.f588m.cancel();
            this.f587l.start();
            if (z6) {
                this.f587l.end();
            }
        } else if (!z) {
            this.f587l.cancel();
            this.f588m.start();
            if (z6) {
                this.f588m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText == null || ((!editText.hasFocus() && !this.f643d.hasFocus()) || this.i.getText().length() <= 0)) {
            return false;
        }
        return true;
    }
}
