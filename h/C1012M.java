package h;

import B3.q;
import Z1.c;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import de.ozerov.fully.K2;
import g.C0940a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C1182a;
import m.C1190i;
import m.C1191j;
import n.m;
import n.o;
import o.C1263d;
import o.C1278k0;
import o.R0;
import o.j1;
import o.o1;
import v0.C1510H;
import v0.C1513K;
import v0.C1514L;
import v0.C1551x;
import v0.C1553z;

/* renamed from: h.M  reason: case insensitive filesystem */
public final class C1012M extends b implements C1263d {

    /* renamed from: A  reason: collision with root package name */
    public static final DecelerateInterpolator f12133A = new DecelerateInterpolator();
    public static final AccelerateInterpolator z = new AccelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f12134a;

    /* renamed from: b  reason: collision with root package name */
    public Context f12135b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f12136c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f12137d;
    public C1278k0 e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f12138f;

    /* renamed from: g  reason: collision with root package name */
    public final View f12139g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12140h;
    public C1011L i;

    /* renamed from: j  reason: collision with root package name */
    public C1011L f12141j;

    /* renamed from: k  reason: collision with root package name */
    public K2 f12142k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12143l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f12144m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public int f12145n = 0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12146o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12147p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12148q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12149r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12150s = true;

    /* renamed from: t  reason: collision with root package name */
    public C1191j f12151t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12152u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f12153v;

    /* renamed from: w  reason: collision with root package name */
    public final C1010K f12154w = new C1010K(this, 0);

    /* renamed from: x  reason: collision with root package name */
    public final C1010K f12155x = new C1010K(this, 1);

    /* renamed from: y  reason: collision with root package name */
    public final c f12156y = new c(25, (Object) this);

    public C1012M(Activity activity, boolean z6) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        W(decorView);
        if (!z6) {
            this.f12139g = decorView.findViewById(16908290);
        }
    }

    public final void E(Drawable drawable) {
        this.f12137d.setPrimaryBackground(drawable);
    }

    public final void F(boolean z6) {
        if (!this.f12140h) {
            G(z6);
        }
    }

    public final void G(boolean z6) {
        int i8;
        if (z6) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        o1 o1Var = (o1) this.e;
        int i9 = o1Var.f14024b;
        this.f12140h = true;
        o1Var.a((i8 & 4) | (i9 & -5));
    }

    public final void H(Drawable drawable) {
        o1 o1Var = (o1) this.e;
        o1Var.f14027f = drawable;
        int i8 = o1Var.f14024b & 4;
        Toolbar toolbar = o1Var.f14023a;
        if (i8 != 0) {
            if (drawable == null) {
                drawable = o1Var.f14035o;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        toolbar.setNavigationIcon((Drawable) null);
    }

    public final void I(boolean z6) {
        C1191j jVar;
        this.f12152u = z6;
        if (!z6 && (jVar = this.f12151t) != null) {
            jVar.a();
        }
    }

    public final void J(CharSequence charSequence) {
        o1 o1Var = (o1) this.e;
        o1Var.f14028g = true;
        o1Var.f14029h = charSequence;
        if ((o1Var.f14024b & 8) != 0) {
            Toolbar toolbar = o1Var.f14023a;
            toolbar.setTitle(charSequence);
            if (o1Var.f14028g) {
                C1510H.q(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void K(CharSequence charSequence) {
        o1 o1Var = (o1) this.e;
        if (!o1Var.f14028g) {
            o1Var.f14029h = charSequence;
            if ((o1Var.f14024b & 8) != 0) {
                Toolbar toolbar = o1Var.f14023a;
                toolbar.setTitle(charSequence);
                if (o1Var.f14028g) {
                    C1510H.q(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void L() {
        if (this.f12147p) {
            this.f12147p = false;
            Y(false);
        }
    }

    public final C1182a M(K2 k22) {
        C1011L l8 = this.i;
        if (l8 != null) {
            l8.a();
        }
        this.f12136c.setHideOnContentScrollEnabled(false);
        this.f12138f.e();
        C1011L l9 = new C1011L(this, this.f12138f.getContext(), k22);
        m mVar = l9.f12129X;
        mVar.w();
        try {
            if (!((q) l9.f12130Y.f10050V).X(l9, mVar)) {
                return null;
            }
            this.i = l9;
            l9.g();
            this.f12138f.c(l9);
            V(true);
            return l9;
        } finally {
            mVar.v();
        }
    }

    public final void V(boolean z6) {
        C1514L l8;
        C1514L l9;
        long j7;
        if (z6) {
            if (!this.f12149r) {
                this.f12149r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12136c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                Y(false);
            }
        } else if (this.f12149r) {
            this.f12149r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12136c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            Y(false);
        }
        if (this.f12137d.isLaidOut()) {
            if (z6) {
                o1 o1Var = (o1) this.e;
                l9 = C1510H.a(o1Var.f14023a);
                l9.a(0.0f);
                l9.c(100);
                l9.d(new C1190i(o1Var, 4));
                l8 = this.f12138f.i(0, 200);
            } else {
                o1 o1Var2 = (o1) this.e;
                C1514L a8 = C1510H.a(o1Var2.f14023a);
                a8.a(1.0f);
                a8.c(200);
                a8.d(new C1190i(o1Var2, 0));
                C1514L l10 = a8;
                l9 = this.f12138f.i(8, 100);
                l8 = l10;
            }
            C1191j jVar = new C1191j();
            ArrayList arrayList = jVar.f13310a;
            arrayList.add(l9);
            View view = (View) l9.f15887a.get();
            if (view != null) {
                j7 = view.animate().getDuration();
            } else {
                j7 = 0;
            }
            View view2 = (View) l8.f15887a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j7);
            }
            arrayList.add(l8);
            jVar.b();
        } else if (z6) {
            ((o1) this.e).f14023a.setVisibility(4);
            this.f12138f.setVisibility(0);
        } else {
            ((o1) this.e).f14023a.setVisibility(0);
            this.f12138f.setVisibility(8);
        }
    }

    public final void W(View view) {
        C1278k0 k0Var;
        boolean z6;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(2131361973);
        this.f12136c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(2131361847);
        if (findViewById instanceof C1278k0) {
            k0Var = (C1278k0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            k0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.e = k0Var;
        this.f12138f = (ActionBarContextView) view.findViewById(2131361855);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(2131361849);
        this.f12137d = actionBarContainer;
        C1278k0 k0Var2 = this.e;
        if (k0Var2 == null || this.f12138f == null || actionBarContainer == null) {
            throw new IllegalStateException(C1012M.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((o1) k0Var2).f14023a.getContext();
        this.f12134a = context;
        if ((((o1) this.e).f14024b & 4) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            this.f12140h = true;
        }
        int i8 = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        X(context.getResources().getBoolean(2131034112));
        TypedArray obtainStyledAttributes = this.f12134a.obtainStyledAttributes((AttributeSet) null, C0940a.f11814a, 2130968581, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12136c;
            if (actionBarOverlayLayout2.f7424d0) {
                this.f12153v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f12137d;
            WeakHashMap weakHashMap = C1510H.f15874a;
            C1553z.l(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void X(boolean z6) {
        if (!z6) {
            ((o1) this.e).getClass();
            this.f12137d.setTabContainer((R0) null);
        } else {
            this.f12137d.setTabContainer((R0) null);
            ((o1) this.e).getClass();
        }
        o1 o1Var = (o1) this.e;
        o1Var.getClass();
        o1Var.f14023a.setCollapsible(false);
        this.f12136c.setHasNonEmbeddedTabs(false);
    }

    public final void Y(boolean z6) {
        boolean z8;
        boolean z9 = this.f12147p;
        boolean z10 = this.f12148q;
        if (!this.f12149r && (z9 || z10)) {
            z8 = false;
        } else {
            z8 = true;
        }
        View view = this.f12139g;
        C1513K k8 = null;
        c cVar = this.f12156y;
        if (z8) {
            if (!this.f12150s) {
                this.f12150s = true;
                C1191j jVar = this.f12151t;
                if (jVar != null) {
                    jVar.a();
                }
                this.f12137d.setVisibility(0);
                int i8 = this.f12145n;
                C1010K k9 = this.f12155x;
                if (i8 != 0 || (!this.f12152u && !z6)) {
                    this.f12137d.setAlpha(1.0f);
                    this.f12137d.setTranslationY(0.0f);
                    if (this.f12146o && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    k9.a();
                } else {
                    this.f12137d.setTranslationY(0.0f);
                    float f8 = (float) (-this.f12137d.getHeight());
                    if (z6) {
                        int[] iArr = {0, 0};
                        this.f12137d.getLocationInWindow(iArr);
                        f8 -= (float) iArr[1];
                    }
                    this.f12137d.setTranslationY(f8);
                    C1191j jVar2 = new C1191j();
                    C1514L a8 = C1510H.a(this.f12137d);
                    a8.e(0.0f);
                    View view2 = (View) a8.f15887a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            k8 = new C1513K(cVar, view2);
                        }
                        view2.animate().setUpdateListener(k8);
                    }
                    boolean z11 = jVar2.e;
                    ArrayList arrayList = jVar2.f13310a;
                    if (!z11) {
                        arrayList.add(a8);
                    }
                    if (this.f12146o && view != null) {
                        view.setTranslationY(f8);
                        C1514L a9 = C1510H.a(view);
                        a9.e(0.0f);
                        if (!jVar2.e) {
                            arrayList.add(a9);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f12133A;
                    boolean z12 = jVar2.e;
                    if (!z12) {
                        jVar2.f13312c = decelerateInterpolator;
                    }
                    if (!z12) {
                        jVar2.f13311b = 250;
                    }
                    if (!z12) {
                        jVar2.f13313d = k9;
                    }
                    this.f12151t = jVar2;
                    jVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12136c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    C1551x.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f12150s) {
            this.f12150s = false;
            C1191j jVar3 = this.f12151t;
            if (jVar3 != null) {
                jVar3.a();
            }
            int i9 = this.f12145n;
            C1010K k10 = this.f12154w;
            if (i9 != 0 || (!this.f12152u && !z6)) {
                k10.a();
                return;
            }
            this.f12137d.setAlpha(1.0f);
            this.f12137d.setTransitioning(true);
            C1191j jVar4 = new C1191j();
            float f9 = (float) (-this.f12137d.getHeight());
            if (z6) {
                int[] iArr2 = {0, 0};
                this.f12137d.getLocationInWindow(iArr2);
                f9 -= (float) iArr2[1];
            }
            C1514L a10 = C1510H.a(this.f12137d);
            a10.e(f9);
            View view3 = (View) a10.f15887a.get();
            if (view3 != null) {
                if (cVar != null) {
                    k8 = new C1513K(cVar, view3);
                }
                view3.animate().setUpdateListener(k8);
            }
            boolean z13 = jVar4.e;
            ArrayList arrayList2 = jVar4.f13310a;
            if (!z13) {
                arrayList2.add(a10);
            }
            if (this.f12146o && view != null) {
                C1514L a11 = C1510H.a(view);
                a11.e(f9);
                if (!jVar4.e) {
                    arrayList2.add(a11);
                }
            }
            AccelerateInterpolator accelerateInterpolator = z;
            boolean z14 = jVar4.e;
            if (!z14) {
                jVar4.f13312c = accelerateInterpolator;
            }
            if (!z14) {
                jVar4.f13311b = 250;
            }
            if (!z14) {
                jVar4.f13313d = k10;
            }
            this.f12151t = jVar4;
            jVar4.b();
        }
    }

    public final boolean g() {
        j1 j1Var;
        o oVar;
        C1278k0 k0Var = this.e;
        if (k0Var == null || (j1Var = ((o1) k0Var).f14023a.f7568J0) == null || j1Var.f13976V == null) {
            return false;
        }
        j1 j1Var2 = ((o1) k0Var).f14023a.f7568J0;
        if (j1Var2 == null) {
            oVar = null;
        } else {
            oVar = j1Var2.f13976V;
        }
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    public final void k(boolean z6) {
        if (z6 != this.f12143l) {
            this.f12143l = z6;
            ArrayList arrayList = this.f12144m;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final int m() {
        return ((o1) this.e).f14024b;
    }

    public final Context p() {
        if (this.f12135b == null) {
            TypedValue typedValue = new TypedValue();
            this.f12134a.getTheme().resolveAttribute(2130968586, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                this.f12135b = new ContextThemeWrapper(this.f12134a, i8);
            } else {
                this.f12135b = this.f12134a;
            }
        }
        return this.f12135b;
    }

    public final void q() {
        if (!this.f12147p) {
            this.f12147p = true;
            Y(false);
        }
    }

    public final void v() {
        X(this.f12134a.getResources().getBoolean(2131034112));
    }

    public final boolean y(int i8, KeyEvent keyEvent) {
        m mVar;
        int i9;
        C1011L l8 = this.i;
        if (l8 == null || (mVar = l8.f12129X) == null) {
            return false;
        }
        if (keyEvent != null) {
            i9 = keyEvent.getDeviceId();
        } else {
            i9 = -1;
        }
        boolean z6 = true;
        if (KeyCharacterMap.load(i9).getKeyboardType() == 1) {
            z6 = false;
        }
        mVar.setQwertyMode(z6);
        return mVar.performShortcut(i8, keyEvent, 0);
    }

    public C1012M(Dialog dialog) {
        new ArrayList();
        W(dialog.getWindow().getDecorView());
    }
}
