package C3;

import B.C0003d;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.android.material.textfield.TextInputLayout;
import g3.C0958a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C1260b0;
import v0.C1510H;

public final class w {

    /* renamed from: A  reason: collision with root package name */
    public ColorStateList f649A;

    /* renamed from: B  reason: collision with root package name */
    public Typeface f650B;

    /* renamed from: a  reason: collision with root package name */
    public final int f651a;

    /* renamed from: b  reason: collision with root package name */
    public final int f652b;

    /* renamed from: c  reason: collision with root package name */
    public final int f653c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f654d;
    public final TimeInterpolator e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f655f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f656g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f657h;
    public LinearLayout i;

    /* renamed from: j  reason: collision with root package name */
    public int f658j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f659k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f660l;

    /* renamed from: m  reason: collision with root package name */
    public final float f661m;

    /* renamed from: n  reason: collision with root package name */
    public int f662n;

    /* renamed from: o  reason: collision with root package name */
    public int f663o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f664p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f665q;

    /* renamed from: r  reason: collision with root package name */
    public C1260b0 f666r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f667s;

    /* renamed from: t  reason: collision with root package name */
    public int f668t;

    /* renamed from: u  reason: collision with root package name */
    public int f669u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f670v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f671w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f672x;

    /* renamed from: y  reason: collision with root package name */
    public C1260b0 f673y;
    public int z;

    public w(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f656g = context;
        this.f657h = textInputLayout;
        this.f661m = (float) context.getResources().getDimensionPixelSize(2131165330);
        this.f651a = C0003d.I(context, 2130969401, 217);
        this.f652b = C0003d.I(context, 2130969397, 167);
        this.f653c = C0003d.I(context, 2130969401, 167);
        this.f654d = C0003d.J(context, 2130969406, C0958a.f12008d);
        LinearInterpolator linearInterpolator = C0958a.f12005a;
        this.e = C0003d.J(context, 2130969406, linearInterpolator);
        this.f655f = C0003d.J(context, 2130969409, linearInterpolator);
    }

    public final void a(C1260b0 b0Var, int i8) {
        if (this.i == null && this.f659k == null) {
            Context context = this.f656g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f657h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f659k = new FrameLayout(context);
            this.i.addView(this.f659k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i8 == 0 || i8 == 1) {
            this.f659k.setVisibility(0);
            this.f659k.addView(b0Var);
        } else {
            this.i.addView(b0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f658j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f657h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f656g;
                boolean r8 = c.r(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = C1510H.f15874a;
                int paddingStart = editText.getPaddingStart();
                if (r8) {
                    paddingStart = context.getResources().getDimensionPixelSize(2131165800);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165799);
                if (r8) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165801);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (r8) {
                    paddingEnd = context.getResources().getDimensionPixelSize(2131165800);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f660l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z6, C1260b0 b0Var, int i8, int i9, int i10) {
        boolean z8;
        float f8;
        long j7;
        TimeInterpolator timeInterpolator;
        if (b0Var != null && z6) {
            if (i8 == i10 || i8 == i9) {
                if (i10 == i8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b0Var, View.ALPHA, new float[]{f8});
                int i11 = this.f653c;
                if (z8) {
                    j7 = (long) this.f652b;
                } else {
                    j7 = (long) i11;
                }
                ofFloat.setDuration(j7);
                if (z8) {
                    timeInterpolator = this.e;
                } else {
                    timeInterpolator = this.f655f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i8 == i10 && i9 != 0) {
                    ofFloat.setStartDelay((long) i11);
                }
                arrayList.add(ofFloat);
                if (i10 == i8 && i9 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b0Var, View.TRANSLATION_Y, new float[]{-this.f661m, 0.0f});
                    ofFloat2.setDuration((long) this.f651a);
                    ofFloat2.setInterpolator(this.f654d);
                    ofFloat2.setStartDelay((long) i11);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i8) {
        if (i8 == 1) {
            return this.f666r;
        }
        if (i8 != 2) {
            return null;
        }
        return this.f673y;
    }

    public final void f() {
        this.f664p = null;
        c();
        if (this.f662n == 1) {
            if (!this.f672x || TextUtils.isEmpty(this.f671w)) {
                this.f663o = 0;
            } else {
                this.f663o = 2;
            }
        }
        i(this.f662n, this.f663o, h(this.f666r, ""));
    }

    public final void g(C1260b0 b0Var, int i8) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            if ((i8 == 0 || i8 == 1) && (frameLayout = this.f659k) != null) {
                frameLayout.removeView(b0Var);
            } else {
                linearLayout.removeView(b0Var);
            }
            int i9 = this.f658j - 1;
            this.f658j = i9;
            LinearLayout linearLayout2 = this.i;
            if (i9 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(C1260b0 b0Var, CharSequence charSequence) {
        WeakHashMap weakHashMap = C1510H.f15874a;
        TextInputLayout textInputLayout = this.f657h;
        if (!textInputLayout.isLaidOut() || !textInputLayout.isEnabled() || (this.f663o == this.f662n && b0Var != null && TextUtils.equals(b0Var.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    public final void i(int i8, int i9, boolean z6) {
        TextView e8;
        TextView e9;
        int i10 = i8;
        int i11 = i9;
        boolean z8 = z6;
        if (i10 != i11) {
            if (z8) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f660l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i12 = i8;
                int i13 = i9;
                d(arrayList2, this.f672x, this.f673y, 2, i12, i13);
                d(arrayList2, this.f665q, this.f666r, 1, i12, i13);
                int size = arrayList.size();
                long j7 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    Animator animator = (Animator) arrayList.get(i14);
                    j7 = Math.max(j7, animator.getDuration() + animator.getStartDelay());
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
                ofInt.setDuration(j7);
                arrayList.add(0, ofInt);
                animatorSet.playTogether(arrayList);
                animatorSet.addListener(new u(this, i9, e(i8), i8, e(i11)));
                animatorSet.start();
            } else if (i10 != i11) {
                if (!(i11 == 0 || (e9 = e(i11)) == null)) {
                    e9.setVisibility(0);
                    e9.setAlpha(1.0f);
                }
                if (!(i10 == 0 || (e8 = e(i8)) == null)) {
                    e8.setVisibility(4);
                    if (i10 == 1) {
                        e8.setText((CharSequence) null);
                    }
                }
                this.f662n = i11;
            }
            TextInputLayout textInputLayout = this.f657h;
            textInputLayout.r();
            textInputLayout.u(z8, false);
            textInputLayout.x();
        }
    }
}
