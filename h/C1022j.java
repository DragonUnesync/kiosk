package h;

import Z1.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.e;
import androidx.activity.f;
import androidx.activity.k;
import androidx.fragment.app.C0470v;
import androidx.fragment.app.C0471w;
import androidx.fragment.app.C0472x;
import androidx.fragment.app.L;
import androidx.fragment.app.T;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.J;
import androidx.lifecycle.t;
import b2.C0522a;
import b2.C0526e;
import g7.C0996d;
import j$.util.Objects;
import j0.C1113b;
import j0.C1114c;
import java.util.ArrayList;
import l0.C1169b;
import m.C1184c;
import m.C1189h;
import o.C1292s;
import o.t1;
import q0.C1357d;

/* renamed from: h.j  reason: case insensitive filesystem */
public abstract class C1022j extends k implements C1023k, C1113b, C1114c {

    /* renamed from: m0  reason: collision with root package name */
    public final c f12212m0 = new c(1, (Object) new C0472x(this));

    /* renamed from: n0  reason: collision with root package name */
    public final t f12213n0 = new t(this);

    /* renamed from: o0  reason: collision with root package name */
    public boolean f12214o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f12215q0 = true;

    /* renamed from: r0  reason: collision with root package name */
    public C1000A f12216r0;

    public C1022j() {
        ((C0526e) this.f7291Y.f9082X).e("android:support:lifecycle", new e(1, this));
        g(new C0471w(this, 0));
        this.f7300h0.add(new C0471w(this, 1));
        h(new f(this, 1));
        ((C0526e) this.f7291Y.f9082X).e("androidx:appcompat", new C0522a(this));
        h(new C1021i(this));
    }

    public static boolean n(L l8) {
        C1022j jVar;
        C0486m mVar = C0486m.f8147W;
        boolean z = false;
        for (C0470v vVar : l8.f7875c.J()) {
            if (vVar != null) {
                C0472x xVar = vVar.f8079o0;
                if (xVar == null) {
                    jVar = null;
                } else {
                    jVar = xVar.f8096h0;
                }
                if (jVar != null) {
                    z |= n(vVar.i());
                }
                T t8 = vVar.f8054J0;
                C0486m mVar2 = C0486m.f8148X;
                if (t8 != null) {
                    t8.f();
                    if (t8.f7938X.f8156c.compareTo(mVar2) >= 0) {
                        t tVar = vVar.f8054J0.f7938X;
                        tVar.c("setCurrentState");
                        tVar.e(mVar);
                        z = true;
                    }
                }
                if (vVar.f8053I0.f8156c.compareTo(mVar2) >= 0) {
                    t tVar2 = vVar.f8053I0;
                    tVar2.c("setCurrentState");
                    tVar2.e(mVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        C1000A a8 = (C1000A) j();
        a8.x();
        ((ViewGroup) a8.f12093u0.findViewById(16908290)).addView(view, layoutParams);
        a8.f12080g0.a(a8.f12079f0.getCallback());
    }

    public final void attachBaseContext(Context context) {
        C1000A a8 = (C1000A) j();
        a8.f12058I0 = true;
        int i = a8.f12062M0;
        if (i == -100) {
            i = o.f12222V;
        }
        int E8 = a8.E(context, i);
        if (o.c(context) && o.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (o.f12229c0) {
                    try {
                        C1357d dVar = o.f12223W;
                        if (dVar == null) {
                            if (o.f12224X == null) {
                                o.f12224X = C1357d.b(j0.f.i(context));
                            }
                            if (!o.f12224X.f14703a.isEmpty()) {
                                o.f12223W = o.f12224X;
                            }
                        } else if (!dVar.equals(o.f12224X)) {
                            C1357d dVar2 = o.f12223W;
                            o.f12224X = dVar2;
                            j0.f.h(context, dVar2.f14703a.a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!o.f12226Z) {
                o.f12221U.execute(new Z1.f(context, 4));
            }
        }
        C1357d o2 = C1000A.o(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(C1000A.u(context, E8, o2, (Configuration) null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C1184c) {
            try {
                ((C1184c) context).a(C1000A.u(context, E8, o2, (Configuration) null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (C1000A.f12049d1) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f8 = configuration3.fontScale;
                    float f9 = configuration4.fontScale;
                    if (f8 != f9) {
                        configuration.fontScale = f9;
                    }
                    int i8 = configuration3.mcc;
                    int i9 = configuration4.mcc;
                    if (i8 != i9) {
                        configuration.mcc = i9;
                    }
                    int i10 = configuration3.mnc;
                    int i11 = configuration4.mnc;
                    if (i10 != i11) {
                        configuration.mnc = i11;
                    }
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 24) {
                        u.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i13 = configuration3.touchscreen;
                    int i14 = configuration4.touchscreen;
                    if (i13 != i14) {
                        configuration.touchscreen = i14;
                    }
                    int i15 = configuration3.keyboard;
                    int i16 = configuration4.keyboard;
                    if (i15 != i16) {
                        configuration.keyboard = i16;
                    }
                    int i17 = configuration3.keyboardHidden;
                    int i18 = configuration4.keyboardHidden;
                    if (i17 != i18) {
                        configuration.keyboardHidden = i18;
                    }
                    int i19 = configuration3.navigation;
                    int i20 = configuration4.navigation;
                    if (i19 != i20) {
                        configuration.navigation = i20;
                    }
                    int i21 = configuration3.navigationHidden;
                    int i22 = configuration4.navigationHidden;
                    if (i21 != i22) {
                        configuration.navigationHidden = i22;
                    }
                    int i23 = configuration3.orientation;
                    int i24 = configuration4.orientation;
                    if (i23 != i24) {
                        configuration.orientation = i24;
                    }
                    int i25 = configuration3.screenLayout & 15;
                    int i26 = configuration4.screenLayout & 15;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.screenLayout & 192;
                    int i28 = configuration4.screenLayout & 192;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 48;
                    int i30 = configuration4.screenLayout & 48;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 768;
                    int i32 = configuration4.screenLayout & 768;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    if (i12 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 3);
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 12);
                        }
                    }
                    int i33 = configuration3.uiMode & 15;
                    int i34 = configuration4.uiMode & 15;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.uiMode & 48;
                    int i36 = configuration4.uiMode & 48;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration3.screenWidthDp;
                    int i38 = configuration4.screenWidthDp;
                    if (i37 != i38) {
                        configuration.screenWidthDp = i38;
                    }
                    int i39 = configuration3.screenHeightDp;
                    int i40 = configuration4.screenHeightDp;
                    if (i39 != i40) {
                        configuration.screenHeightDp = i40;
                    }
                    int i41 = configuration3.smallestScreenWidthDp;
                    int i42 = configuration4.smallestScreenWidthDp;
                    if (i41 != i42) {
                        configuration.smallestScreenWidthDp = i42;
                    }
                    int i43 = configuration3.densityDpi;
                    int i44 = configuration4.densityDpi;
                    if (i43 != i44) {
                        configuration.densityDpi = i44;
                    }
                }
            }
            Configuration u3 = C1000A.u(context, E8, o2, configuration, true);
            C1184c cVar = new C1184c(context, 2132017746);
            cVar.a(u3);
            try {
                if (context.getTheme() != null) {
                    C1169b.l(cVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    public final void closeOptionsMenu() {
        b k8 = k();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (k8 == null || !k8.f()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        b k8 = k();
        if (keyCode != 82 || k8 == null || !k8.z(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r0.equals("--list-dumpables") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r0.equals("--dump-dumpable") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        /*
            r3 = this;
            super.dump(r4, r5, r6, r7)
            if (r7 == 0) goto L_0x005d
            int r0 = r7.length
            if (r0 != 0) goto L_0x0009
            goto L_0x005d
        L_0x0009:
            r0 = 0
            r0 = r7[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L_0x004d;
                case 100470631: goto L_0x003d;
                case 472614934: goto L_0x0034;
                case 1159329357: goto L_0x0024;
                case 1455016274: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x005d
        L_0x0014:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x005d
        L_0x001d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x005d
            goto L_0x005c
        L_0x0024:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002d
            goto L_0x005d
        L_0x002d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x005d
            goto L_0x005c
        L_0x0034:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0046
            goto L_0x005d
        L_0x003d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0046
            goto L_0x005d
        L_0x0046:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x005d
            goto L_0x005c
        L_0x004d:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0056
            goto L_0x005d
        L_0x0056:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x005d
        L_0x005c:
            return
        L_0x005d:
            r6.print(r4)
            java.lang.String r0 = "Local FragmentActivity "
            r6.print(r0)
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r6.print(r0)
            java.lang.String r0 = " State:"
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.print(r0)
            java.lang.String r1 = "mCreated="
            r6.print(r1)
            boolean r1 = r3.f12214o0
            r6.print(r1)
            java.lang.String r1 = " mResumed="
            r6.print(r1)
            boolean r1 = r3.p0
            r6.print(r1)
            java.lang.String r1 = " mStopped="
            r6.print(r1)
            boolean r1 = r3.f12215q0
            r6.print(r1)
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto L_0x00b9
            A1.d r1 = new A1.d
            androidx.lifecycle.O r2 = r3.d()
            r1.<init>((androidx.lifecycle.r) r3, (androidx.lifecycle.O) r2)
            r1.o(r0, r6)
        L_0x00b9:
            Z1.c r0 = r3.f12212m0
            java.lang.Object r0 = r0.f6955V
            androidx.fragment.app.x r0 = (androidx.fragment.app.C0472x) r0
            androidx.fragment.app.L r0 = r0.f8095g0
            r0.v(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1022j.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final View findViewById(int i) {
        C1000A a8 = (C1000A) j();
        a8.x();
        return a8.f12079f0.findViewById(i);
    }

    public final MenuInflater getMenuInflater() {
        Context context;
        C1000A a8 = (C1000A) j();
        if (a8.f12083j0 == null) {
            a8.C();
            b bVar = a8.f12082i0;
            if (bVar != null) {
                context = bVar.p();
            } else {
                context = a8.f12078e0;
            }
            a8.f12083j0 = new C1189h(context);
        }
        return a8.f12083j0;
    }

    public final Resources getResources() {
        int i = t1.f14078a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        j().b();
    }

    public final o j() {
        if (this.f12216r0 == null) {
            n nVar = o.f12221U;
            this.f12216r0 = new C1000A(this, (Window) null, this, this);
        }
        return this.f12216r0;
    }

    public final b k() {
        C1000A a8 = (C1000A) j();
        a8.C();
        return a8.f12082i0;
    }

    public final L l() {
        return ((C0472x) this.f12212m0.f6955V).f8095g0;
    }

    public final void m() {
        J.b(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        P6.f.e(decorView, "<this>");
        decorView.setTag(2131362626, this);
        R.e.t(getWindow().getDecorView(), this);
        C0996d.y(getWindow().getDecorView(), this);
    }

    public final void o() {
        super.onDestroy();
        ((C0472x) this.f12212m0.f6955V).f8095g0.l();
        this.f12213n0.d(C0485l.ON_DESTROY);
    }

    public void onActivityResult(int i, int i8, Intent intent) {
        this.f12212m0.s();
        super.onActivityResult(i, i8, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1000A a8 = (C1000A) j();
        if (a8.f12098z0 && a8.f12092t0) {
            a8.C();
            b bVar = a8.f12082i0;
            if (bVar != null) {
                bVar.v();
            }
        }
        C1292s a9 = C1292s.a();
        Context context = a8.f12078e0;
        synchronized (a9) {
            a9.f14067a.l(context);
        }
        a8.f12061L0 = new Configuration(a8.f12078e0.getResources().getConfiguration());
        a8.m(false, false);
    }

    public final void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12213n0.d(C0485l.ON_CREATE);
        L l8 = ((C0472x) this.f12212m0.f6955V).f8095g0;
        l8.f7864H = false;
        l8.f7865I = false;
        l8.f7871O.f7908f = false;
        l8.u(1);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0472x) this.f12212m0.f6955V).f8095g0.f7877f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        o();
        j().e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (p(i, menuItem)) {
            return true;
        }
        b k8 = k();
        if (menuItem.getItemId() != 16908332 || k8 == null || (k8.m() & 4) == 0) {
            return false;
        }
        return t();
    }

    public void onPause() {
        super.onPause();
        this.p0 = false;
        ((C0472x) this.f12212m0.f6955V).f8095g0.u(5);
        this.f12213n0.d(C0485l.ON_PAUSE);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((C1000A) j()).x();
    }

    public void onPostResume() {
        q();
        C1000A a8 = (C1000A) j();
        a8.C();
        b bVar = a8.f12082i0;
        if (bVar != null) {
            bVar.I(true);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f12212m0.s();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        c cVar = this.f12212m0;
        cVar.s();
        super.onResume();
        this.p0 = true;
        ((C0472x) cVar.f6955V).f8095g0.z(true);
    }

    public void onStart() {
        r();
        ((C1000A) j()).m(true, false);
    }

    public final void onStateNotSaved() {
        this.f12212m0.s();
    }

    public void onStop() {
        s();
        C1000A a8 = (C1000A) j();
        a8.C();
        b bVar = a8.f12082i0;
        if (bVar != null) {
            bVar.I(false);
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        j().l(charSequence);
    }

    public final void openOptionsMenu() {
        b k8 = k();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (k8 == null || !k8.A()) {
            super.openOptionsMenu();
        }
    }

    public final boolean p(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0472x) this.f12212m0.f6955V).f8095g0.j();
        }
        return false;
    }

    public final void q() {
        super.onPostResume();
        this.f12213n0.d(C0485l.ON_RESUME);
        L l8 = ((C0472x) this.f12212m0.f6955V).f8095g0;
        l8.f7864H = false;
        l8.f7865I = false;
        l8.f7871O.f7908f = false;
        l8.u(7);
    }

    public final void r() {
        c cVar = this.f12212m0;
        cVar.s();
        super.onStart();
        this.f12215q0 = false;
        boolean z = this.f12214o0;
        C0472x xVar = (C0472x) cVar.f6955V;
        if (!z) {
            this.f12214o0 = true;
            L l8 = xVar.f8095g0;
            l8.f7864H = false;
            l8.f7865I = false;
            l8.f7871O.f7908f = false;
            l8.u(4);
        }
        xVar.f8095g0.z(true);
        this.f12213n0.d(C0485l.ON_START);
        L l9 = xVar.f8095g0;
        l9.f7864H = false;
        l9.f7865I = false;
        l9.f7871O.f7908f = false;
        l9.u(5);
    }

    public final void s() {
        super.onStop();
        this.f12215q0 = true;
        do {
        } while (n(l()));
        L l8 = ((C0472x) this.f12212m0.f6955V).f8095g0;
        l8.f7865I = true;
        l8.f7871O.f7908f = true;
        l8.u(4);
        this.f12213n0.d(C0485l.ON_STOP);
    }

    public final void setContentView(int i) {
        m();
        j().h(i);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        ((C1000A) j()).f12063N0 = i;
    }

    public boolean t() {
        Intent e = j0.f.e(this);
        if (e == null) {
            return false;
        }
        if (shouldUpRecreateTask(e)) {
            ArrayList arrayList = new ArrayList();
            Intent e8 = j0.f.e(this);
            if (e8 == null) {
                e8 = j0.f.e(this);
            }
            if (e8 != null) {
                ComponentName component = e8.getComponent();
                if (component == null) {
                    component = e8.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent f8 = j0.f.f(this, component);
                    while (f8 != null) {
                        arrayList.add(size, f8);
                        f8 = j0.f.f(this, f8.getComponent());
                    }
                    arrayList.add(e8);
                } catch (PackageManager.NameNotFoundException e9) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e9);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                startActivities(intentArr, (Bundle) null);
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(e);
            return true;
        }
    }

    public void setContentView(View view) {
        m();
        j().i(view);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0472x) this.f12212m0.f6955V).f8095g0.f7877f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        j().j(view, layoutParams);
    }
}
