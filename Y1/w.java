package Y1;

import C3.C0025a;
import U.f;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class w {

    /* renamed from: A  reason: collision with root package name */
    public boolean f6541A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f6542B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f6543C = true;

    /* renamed from: a  reason: collision with root package name */
    public final r f6544a;

    /* renamed from: b  reason: collision with root package name */
    public final View f6545b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f6546c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f6547d;
    public final ViewGroup e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f6548f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f6549g;

    /* renamed from: h  reason: collision with root package name */
    public final ViewGroup f6550h;
    public final ViewGroup i;

    /* renamed from: j  reason: collision with root package name */
    public final View f6551j;

    /* renamed from: k  reason: collision with root package name */
    public final View f6552k;

    /* renamed from: l  reason: collision with root package name */
    public final AnimatorSet f6553l;

    /* renamed from: m  reason: collision with root package name */
    public final AnimatorSet f6554m;

    /* renamed from: n  reason: collision with root package name */
    public final AnimatorSet f6555n;

    /* renamed from: o  reason: collision with root package name */
    public final AnimatorSet f6556o;

    /* renamed from: p  reason: collision with root package name */
    public final AnimatorSet f6557p;

    /* renamed from: q  reason: collision with root package name */
    public final ValueAnimator f6558q;

    /* renamed from: r  reason: collision with root package name */
    public final ValueAnimator f6559r;

    /* renamed from: s  reason: collision with root package name */
    public final s f6560s = new s(this, 0);

    /* renamed from: t  reason: collision with root package name */
    public final s f6561t = new s(this, 3);

    /* renamed from: u  reason: collision with root package name */
    public final s f6562u = new s(this, 4);

    /* renamed from: v  reason: collision with root package name */
    public final s f6563v = new s(this, 5);

    /* renamed from: w  reason: collision with root package name */
    public final s f6564w = new s(this, 6);

    /* renamed from: x  reason: collision with root package name */
    public final f f6565x = new f(2, this);

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f6566y = new ArrayList();
    public int z = 0;

    public w(r rVar) {
        r rVar2 = rVar;
        this.f6544a = rVar2;
        this.f6545b = rVar2.findViewById(2131362039);
        this.f6546c = (ViewGroup) rVar2.findViewById(2131362034);
        this.e = (ViewGroup) rVar2.findViewById(2131362050);
        ViewGroup viewGroup = (ViewGroup) rVar2.findViewById(2131362032);
        this.f6547d = viewGroup;
        this.i = (ViewGroup) rVar2.findViewById(2131362075);
        View findViewById = rVar2.findViewById(2131362062);
        this.f6551j = findViewById;
        this.f6548f = (ViewGroup) rVar2.findViewById(2131362031);
        this.f6549g = (ViewGroup) rVar2.findViewById(2131362042);
        this.f6550h = (ViewGroup) rVar2.findViewById(2131362043);
        View findViewById2 = rVar2.findViewById(2131362054);
        this.f6552k = findViewById2;
        View findViewById3 = rVar2.findViewById(2131362053);
        if (!(findViewById2 == null || findViewById3 == null)) {
            findViewById2.setOnClickListener(new C0025a(7, this));
            findViewById3.setOnClickListener(new C0025a(7, this));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new t(this, 3));
        ofFloat.addListener(new u(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new t(this, 0));
        ofFloat2.addListener(new u(this, 1));
        Resources resources = rVar.getResources();
        float dimension = resources.getDimension(2131165357) - resources.getDimension(2131165362);
        float dimension2 = resources.getDimension(2131165357);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6553l = animatorSet;
        animatorSet.setDuration(250);
        animatorSet.addListener(new v(this, rVar2, 0));
        animatorSet.play(ofFloat).with(d(findViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f6554m = animatorSet2;
        animatorSet2.setDuration(250);
        animatorSet2.addListener(new v(this, rVar2, 1));
        animatorSet2.play(d(findViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f6555n = animatorSet3;
        animatorSet3.setDuration(250);
        animatorSet3.addListener(new v(this, rVar2, 2));
        animatorSet3.play(ofFloat).with(d(findViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f6556o = animatorSet4;
        animatorSet4.setDuration(250);
        animatorSet4.addListener(new u(this, 2));
        animatorSet4.play(ofFloat2).with(d(findViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f6557p = animatorSet5;
        animatorSet5.setDuration(250);
        animatorSet5.addListener(new u(this, 3));
        animatorSet5.play(ofFloat2).with(d(findViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f6558q = ofFloat3;
        ofFloat3.setDuration(250);
        ofFloat3.addUpdateListener(new t(this, 1));
        ofFloat3.addListener(new u(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f6559r = ofFloat4;
        ofFloat4.setDuration(250);
        ofFloat4.addUpdateListener(new t(this, 2));
        ofFloat4.addListener(new u(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static ObjectAnimator d(View view, float f8, float f9) {
        return ObjectAnimator.ofFloat(view, "translationY", new float[]{f8, f9});
    }

    public static boolean j(View view) {
        int id = view.getId();
        if (id == 2131362032 || id == 2131362061 || id == 2131362052 || id == 2131362065 || id == 2131362066 || id == 2131362044 || id == 2131362045) {
            return true;
        }
        return false;
    }

    public final void a(float f8) {
        ViewGroup viewGroup = this.f6550h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((float) ((int) ((1.0f - f8) * ((float) viewGroup.getWidth()))));
        }
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f8);
        }
        ViewGroup viewGroup3 = this.f6548f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f8);
        }
    }

    public final boolean b(View view) {
        if (view == null || !this.f6566y.contains(view)) {
            return false;
        }
        return true;
    }

    public final void e(Runnable runnable, long j7) {
        if (j7 >= 0) {
            this.f6544a.postDelayed(runnable, j7);
        }
    }

    public final void f() {
        s sVar = this.f6564w;
        r rVar = this.f6544a;
        rVar.removeCallbacks(sVar);
        rVar.removeCallbacks(this.f6561t);
        rVar.removeCallbacks(this.f6563v);
        rVar.removeCallbacks(this.f6562u);
    }

    public final void g() {
        if (this.z != 3) {
            f();
            int showTimeoutMs = this.f6544a.getShowTimeoutMs();
            if (showTimeoutMs <= 0) {
                return;
            }
            if (!this.f6543C) {
                e(this.f6564w, (long) showTimeoutMs);
            } else if (this.z == 1) {
                e(this.f6562u, 2000);
            } else {
                e(this.f6563v, (long) showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z6) {
        if (view != null) {
            ArrayList arrayList = this.f6566y;
            if (!z6) {
                view.setVisibility(8);
                arrayList.remove(view);
                return;
            }
            if (!this.f6541A || !j(view)) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
            arrayList.add(view);
        }
    }

    public final void i(int i8) {
        int i9 = this.z;
        this.z = i8;
        r rVar = this.f6544a;
        if (i8 == 2) {
            rVar.setVisibility(8);
        } else if (i9 == 2) {
            rVar.setVisibility(0);
        }
        if (i9 != i8) {
            Iterator it = rVar.f6489a0.iterator();
            while (it.hasNext()) {
                rVar.getVisibility();
                z zVar = (z) ((q) it.next());
                zVar.getClass();
                zVar.f6570W.m();
            }
        }
    }

    public final void k() {
        if (!this.f6543C) {
            i(0);
            g();
            return;
        }
        int i8 = this.z;
        if (i8 == 1) {
            this.f6556o.start();
        } else if (i8 == 2) {
            this.f6557p.start();
        } else if (i8 == 3) {
            this.f6542B = true;
        } else if (i8 == 4) {
            return;
        }
        g();
    }
}
