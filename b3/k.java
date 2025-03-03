package B3;

import B.C0003d;
import D7.b;
import I0.a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import g3.C0958a;
import h0.C1029d;
import java.util.List;
import java.util.WeakHashMap;
import v0.C1510H;
import v0.C1553z;

public abstract class k {

    /* renamed from: u  reason: collision with root package name */
    public static final a f413u = C0958a.f12006b;

    /* renamed from: v  reason: collision with root package name */
    public static final LinearInterpolator f414v = C0958a.f12005a;

    /* renamed from: w  reason: collision with root package name */
    public static final a f415w = C0958a.f12008d;

    /* renamed from: x  reason: collision with root package name */
    public static final Handler f416x = new Handler(Looper.getMainLooper(), new d(0));

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f417y = {2130969602};
    public static final String z = k.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final int f418a;

    /* renamed from: b  reason: collision with root package name */
    public final int f419b;

    /* renamed from: c  reason: collision with root package name */
    public final int f420c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f421d;
    public final TimeInterpolator e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f422f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f423g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f424h;
    public final j i;

    /* renamed from: j  reason: collision with root package name */
    public final SnackbarContentLayout f425j;

    /* renamed from: k  reason: collision with root package name */
    public int f426k;

    /* renamed from: l  reason: collision with root package name */
    public final e f427l = new e(this, 0);

    /* renamed from: m  reason: collision with root package name */
    public int f428m;

    /* renamed from: n  reason: collision with root package name */
    public int f429n;

    /* renamed from: o  reason: collision with root package name */
    public int f430o;

    /* renamed from: p  reason: collision with root package name */
    public int f431p;

    /* renamed from: q  reason: collision with root package name */
    public int f432q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f433r;

    /* renamed from: s  reason: collision with root package name */
    public final AccessibilityManager f434s;

    /* renamed from: t  reason: collision with root package name */
    public final h f435t = new h(this);

    public k(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i8;
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (snackbarContentLayout2 != null) {
            this.f423g = viewGroup;
            this.f425j = snackbarContentLayout2;
            this.f424h = context;
            t3.k.c(context, t3.k.f15461a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f417y);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                i8 = 2131558544;
            } else {
                i8 = 2131558445;
            }
            j jVar = (j) from.inflate(i8, viewGroup, false);
            this.i = jVar;
            jVar.setBaseTransientBottomBar(this);
            float actionTextColorAlpha = jVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f9391V.setTextColor(b.F(actionTextColorAlpha, b.o(snackbarContentLayout, 2130968856), snackbarContentLayout.f9391V.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(jVar.getMaxInlineActionWidth());
            jVar.addView(snackbarContentLayout);
            WeakHashMap weakHashMap = C1510H.f15874a;
            jVar.setAccessibilityLiveRegion(1);
            jVar.setImportantForAccessibility(1);
            jVar.setFitsSystemWindows(true);
            C1553z.m(jVar, new f(this));
            C1510H.p(jVar, new g(0, this));
            this.f434s = (AccessibilityManager) context.getSystemService("accessibility");
            this.f420c = C0003d.I(context, 2130969391, 250);
            this.f418a = C0003d.I(context, 2130969391, 150);
            this.f419b = C0003d.I(context, 2130969394, 75);
            this.f421d = C0003d.J(context, 2130969407, f414v);
            this.f422f = C0003d.J(context, 2130969407, f415w);
            this.e = C0003d.J(context, 2130969407, f413u);
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public final void a(int i8) {
        boolean z6;
        q K4 = q.K();
        h hVar = this.f435t;
        synchronized (K4.f449U) {
            try {
                if (K4.R(hVar)) {
                    K4.p((p) K4.f451W, i8);
                } else {
                    p pVar = (p) K4.f452X;
                    if (pVar == null || pVar.f444a.get() != hVar) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z6) {
                        K4.p((p) K4.f452X, i8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        q K4 = q.K();
        h hVar = this.f435t;
        synchronized (K4.f449U) {
            try {
                if (K4.R(hVar)) {
                    K4.f451W = null;
                    if (((p) K4.f452X) != null) {
                        K4.o0();
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        q K4 = q.K();
        h hVar = this.f435t;
        synchronized (K4.f449U) {
            try {
                if (K4.R(hVar)) {
                    K4.j0((p) K4.f451W);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z6 = true;
        AccessibilityManager accessibilityManager = this.f434s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z6 = false;
        }
        j jVar = this.i;
        if (z6) {
            jVar.post(new e(this, 2));
            return;
        }
        if (jVar.getParent() != null) {
            jVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        boolean z6;
        j jVar = this.i;
        ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
        boolean z8 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = z;
        if (!z8) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (jVar.f411g0 == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
        } else if (jVar.getParent() != null) {
            int i8 = this.f428m;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = jVar.f411g0;
            int i9 = rect.bottom + i8;
            int i10 = rect.left + this.f429n;
            int i11 = rect.right + this.f430o;
            int i12 = rect.top;
            if (marginLayoutParams.bottomMargin == i9 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.topMargin == i12) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6) {
                marginLayoutParams.bottomMargin = i9;
                marginLayoutParams.leftMargin = i10;
                marginLayoutParams.rightMargin = i11;
                marginLayoutParams.topMargin = i12;
                jVar.requestLayout();
            }
            if ((z6 || this.f432q != this.f431p) && Build.VERSION.SDK_INT >= 29 && this.f431p > 0) {
                ViewGroup.LayoutParams layoutParams2 = jVar.getLayoutParams();
                if ((layoutParams2 instanceof C1029d) && (((C1029d) layoutParams2).f12261a instanceof SwipeDismissBehavior)) {
                    e eVar = this.f427l;
                    jVar.removeCallbacks(eVar);
                    jVar.post(eVar);
                }
            }
        }
    }
}
