package h;

import Y.i;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.woxthebox.draglistview.R;
import g.C0940a;
import j0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.C1182a;
import m.C1184c;
import m.C1189h;
import n.k;
import n.m;
import o.C1269g;
import o.C1276j0;
import o.C1277k;
import o.C1292s;
import o.o1;
import o.w1;
import q0.C1357d;
import q0.C1359f;
import v0.C1510H;
import v0.C1514L;
import v0.C1553z;

/* renamed from: h.A  reason: case insensitive filesystem */
public final class C1000A extends o implements k, LayoutInflater.Factory2 {

    /* renamed from: b1  reason: collision with root package name */
    public static final i f12047b1 = new i((Object) null);

    /* renamed from: c1  reason: collision with root package name */
    public static final int[] f12048c1 = {16842836};

    /* renamed from: d1  reason: collision with root package name */
    public static final boolean f12049d1 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: A0  reason: collision with root package name */
    public boolean f12050A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f12051B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f12052C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f12053D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f12054E0;

    /* renamed from: F0  reason: collision with root package name */
    public z[] f12055F0;

    /* renamed from: G0  reason: collision with root package name */
    public z f12056G0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f12057H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f12058I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f12059J0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f12060K0;

    /* renamed from: L0  reason: collision with root package name */
    public Configuration f12061L0;

    /* renamed from: M0  reason: collision with root package name */
    public final int f12062M0 = -100;

    /* renamed from: N0  reason: collision with root package name */
    public int f12063N0;

    /* renamed from: O0  reason: collision with root package name */
    public int f12064O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f12065P0;

    /* renamed from: Q0  reason: collision with root package name */
    public x f12066Q0;

    /* renamed from: R0  reason: collision with root package name */
    public x f12067R0;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f12068S0;

    /* renamed from: T0  reason: collision with root package name */
    public int f12069T0;

    /* renamed from: U0  reason: collision with root package name */
    public final p f12070U0 = new p(this, 0);

    /* renamed from: V0  reason: collision with root package name */
    public boolean f12071V0;

    /* renamed from: W0  reason: collision with root package name */
    public Rect f12072W0;

    /* renamed from: X0  reason: collision with root package name */
    public Rect f12073X0;

    /* renamed from: Y0  reason: collision with root package name */
    public C1003D f12074Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public OnBackInvokedDispatcher f12075Z0;

    /* renamed from: a1  reason: collision with root package name */
    public OnBackInvokedCallback f12076a1;

    /* renamed from: d0  reason: collision with root package name */
    public final Object f12077d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f12078e0;

    /* renamed from: f0  reason: collision with root package name */
    public Window f12079f0;

    /* renamed from: g0  reason: collision with root package name */
    public w f12080g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f12081h0;

    /* renamed from: i0  reason: collision with root package name */
    public b f12082i0;

    /* renamed from: j0  reason: collision with root package name */
    public C1189h f12083j0;

    /* renamed from: k0  reason: collision with root package name */
    public CharSequence f12084k0;

    /* renamed from: l0  reason: collision with root package name */
    public C1276j0 f12085l0;

    /* renamed from: m0  reason: collision with root package name */
    public q f12086m0;

    /* renamed from: n0  reason: collision with root package name */
    public q f12087n0;

    /* renamed from: o0  reason: collision with root package name */
    public C1182a f12088o0;
    public ActionBarContextView p0;

    /* renamed from: q0  reason: collision with root package name */
    public PopupWindow f12089q0;

    /* renamed from: r0  reason: collision with root package name */
    public p f12090r0;

    /* renamed from: s0  reason: collision with root package name */
    public C1514L f12091s0 = null;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f12092t0;

    /* renamed from: u0  reason: collision with root package name */
    public ViewGroup f12093u0;

    /* renamed from: v0  reason: collision with root package name */
    public TextView f12094v0;

    /* renamed from: w0  reason: collision with root package name */
    public View f12095w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f12096x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f12097y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f12098z0;

    public C1000A(Context context, Window window, C1023k kVar, Object obj) {
        C1022j jVar = null;
        this.f12078e0 = context;
        this.f12077d0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C1022j)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        jVar = (C1022j) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (jVar != null) {
                this.f12062M0 = ((C1000A) jVar.j()).f12062M0;
            }
        }
        if (this.f12062M0 == -100) {
            i iVar = f12047b1;
            Integer num = (Integer) iVar.get(this.f12077d0.getClass().getName());
            if (num != null) {
                this.f12062M0 = num.intValue();
                iVar.remove(this.f12077d0.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C1292s.d();
    }

    public static C1357d A(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return u.b(configuration);
        }
        return C1357d.b(s.b(configuration.locale));
    }

    public static C1357d o(Context context) {
        C1357d dVar;
        C1357d dVar2;
        Locale locale;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (dVar = o.f12223W) == null) {
            return null;
        }
        C1357d A8 = A(context.getApplicationContext().getResources().getConfiguration());
        C1359f fVar = dVar.f14703a;
        int i8 = 0;
        if (i >= 24) {
            if (fVar.isEmpty()) {
                dVar2 = C1357d.f14702b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (true) {
                    if (i8 >= A8.f14703a.size() + fVar.size()) {
                        break;
                    }
                    if (i8 < fVar.size()) {
                        locale = fVar.get(i8);
                    } else {
                        locale = A8.f14703a.get(i8 - fVar.size());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                    i8++;
                }
                dVar2 = C1357d.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (fVar.isEmpty()) {
            dVar2 = C1357d.f14702b;
        } else {
            dVar2 = C1357d.b(s.b(fVar.get(0)));
        }
        if (dVar2.f14703a.isEmpty()) {
            return A8;
        }
        return dVar2;
    }

    public static Configuration u(Context context, int i, C1357d dVar, Configuration configuration, boolean z) {
        int i8;
        if (i == 1) {
            i8 = 16;
        } else if (i == 2) {
            i8 = 32;
        } else if (z) {
            i8 = 0;
        } else {
            i8 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & -49);
        if (dVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                u.d(configuration2, dVar);
            } else {
                C1359f fVar = dVar.f14703a;
                configuration2.setLocale(fVar.get(0));
                configuration2.setLayoutDirection(fVar.get(0));
            }
        }
        return configuration2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: h.z[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: h.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: h.z[]} */
    /* JADX WARNING: type inference failed for: r2v1, types: [h.z, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h.z B(int r5) {
        /*
            r4 = this;
            h.z[] r0 = r4.f12055F0
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.length
            if (r2 > r5) goto L_0x0015
        L_0x0008:
            int r2 = r5 + 1
            h.z[] r2 = new h.z[r2]
            if (r0 == 0) goto L_0x0012
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L_0x0012:
            r4.f12055F0 = r2
            r0 = r2
        L_0x0015:
            r2 = r0[r5]
            if (r2 != 0) goto L_0x0024
            h.z r2 = new h.z
            r2.<init>()
            r2.f12246a = r5
            r2.f12257n = r1
            r0[r5] = r2
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1000A.B(int):h.z");
    }

    public final void C() {
        x();
        if (this.f12098z0 && this.f12082i0 == null) {
            Object obj = this.f12077d0;
            if (obj instanceof Activity) {
                this.f12082i0 = new C1012M((Activity) obj, this.f12050A0);
            } else if (obj instanceof Dialog) {
                this.f12082i0 = new C1012M((Dialog) obj);
            }
            b bVar = this.f12082i0;
            if (bVar != null) {
                bVar.F(this.f12071V0);
            }
        }
    }

    public final void D(int i) {
        this.f12069T0 = (1 << i) | this.f12069T0;
        if (!this.f12068S0) {
            View decorView = this.f12079f0.getDecorView();
            p pVar = this.f12070U0;
            WeakHashMap weakHashMap = C1510H.f15874a;
            decorView.postOnAnimation(pVar);
            this.f12068S0 = true;
        }
    }

    public final int E(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.f12067R0 == null) {
                            this.f12067R0 = new x(this, context);
                        }
                        return this.f12067R0.e();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return z(context).e();
            } else {
                return -1;
            }
        }
        return i;
    }

    public final boolean F() {
        boolean z = this.f12057H0;
        this.f12057H0 = false;
        z B8 = B(0);
        if (B8.f12256m) {
            if (!z) {
                t(B8, true);
            }
            return true;
        }
        C1182a aVar = this.f12088o0;
        if (aVar != null) {
            aVar.a();
            return true;
        }
        C();
        b bVar = this.f12082i0;
        if (bVar == null || !bVar.g()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0153, code lost:
        if (r3 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0173, code lost:
        if (r3.f13470Z.getCount() > 0) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(h.z r18, android.view.KeyEvent r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.f12256m
            if (r2 != 0) goto L_0x01d7
            boolean r2 = r0.f12060K0
            if (r2 == 0) goto L_0x000e
            goto L_0x01d7
        L_0x000e:
            int r2 = r1.f12246a
            android.content.Context r3 = r0.f12078e0
            if (r2 != 0) goto L_0x0024
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L_0x0024
            return
        L_0x0024:
            android.view.Window r4 = r0.f12079f0
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L_0x0039
            n.m r6 = r1.f12252h
            boolean r4 = r4.onMenuOpened(r2, r6)
            if (r4 != 0) goto L_0x0039
            r0.t(r1, r5)
            return
        L_0x0039:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r17.I(r18, r19)
            if (r6 != 0) goto L_0x004b
            return
        L_0x004b:
            h.y r6 = r1.e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L_0x0068
            boolean r9 = r1.f12257n
            if (r9 == 0) goto L_0x0056
            goto L_0x0068
        L_0x0056:
            android.view.View r3 = r1.f12251g
            if (r3 == 0) goto L_0x01ae
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x01ae
            int r3 = r3.width
            r6 = -1
            if (r3 != r6) goto L_0x01ae
            r10 = -1
            goto L_0x01af
        L_0x0068:
            if (r6 != 0) goto L_0x00e3
            r17.C()
            android.support.v4.media.session.b r6 = r0.f12082i0
            if (r6 == 0) goto L_0x0076
            android.content.Context r6 = r6.p()
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r6
        L_0x007b:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r3.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r3.getTheme()
            r9.setTo(r10)
            r10 = 2130968578(0x7f040002, float:1.7545814E38)
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L_0x009c
            r9.applyStyle(r10, r5)
        L_0x009c:
            r10 = 2130969456(0x7f040370, float:1.7547594E38)
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto L_0x00aa
            r9.applyStyle(r6, r5)
            goto L_0x00b0
        L_0x00aa:
            r6 = 2132017734(0x7f140246, float:1.9673755E38)
            r9.applyStyle(r6, r5)
        L_0x00b0:
            m.c r6 = new m.c
            r6.<init>(r3, r7)
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.setTo(r9)
            r1.f12253j = r6
            int[] r3 = g.C0940a.f11821j
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r3)
            r6 = 86
            int r6 = r3.getResourceId(r6, r7)
            r1.f12247b = r6
            int r6 = r3.getResourceId(r5, r7)
            r1.f12249d = r6
            r3.recycle()
            h.y r3 = new h.y
            m.c r6 = r1.f12253j
            r3.<init>(r0, r6)
            r1.e = r3
            r3 = 81
            r1.f12248c = r3
            goto L_0x00f2
        L_0x00e3:
            boolean r3 = r1.f12257n
            if (r3 == 0) goto L_0x00f2
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L_0x00f2
            h.y r3 = r1.e
            r3.removeAllViews()
        L_0x00f2:
            android.view.View r3 = r1.f12251g
            if (r3 == 0) goto L_0x00f9
            r1.f12250f = r3
            goto L_0x0155
        L_0x00f9:
            n.m r3 = r1.f12252h
            if (r3 != 0) goto L_0x00ff
            goto L_0x01d5
        L_0x00ff:
            h.q r3 = r0.f12087n0
            if (r3 != 0) goto L_0x010b
            h.q r3 = new h.q
            r6 = 3
            r3.<init>(r0, r6)
            r0.f12087n0 = r3
        L_0x010b:
            h.q r3 = r0.f12087n0
            n.i r6 = r1.i
            if (r6 != 0) goto L_0x0123
            n.i r6 = new n.i
            m.c r9 = r1.f12253j
            r6.<init>(r9)
            r1.i = r6
            r6.f13469Y = r3
            n.m r3 = r1.f12252h
            android.content.Context r9 = r3.f13478U
            r3.b(r6, r9)
        L_0x0123:
            n.i r3 = r1.i
            h.y r6 = r1.e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r3.f13468X
            if (r9 != 0) goto L_0x014f
            android.view.LayoutInflater r9 = r3.f13466V
            r10 = 2131558413(0x7f0d000d, float:1.8742141E38)
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r3.f13468X = r6
            n.h r6 = r3.f13470Z
            if (r6 != 0) goto L_0x0143
            n.h r6 = new n.h
            r6.<init>(r3)
            r3.f13470Z = r6
        L_0x0143:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.f13468X
            n.h r9 = r3.f13470Z
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.f13468X
            r6.setOnItemClickListener(r3)
        L_0x014f:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r3.f13468X
            r1.f12250f = r3
            if (r3 == 0) goto L_0x01d5
        L_0x0155:
            android.view.View r3 = r1.f12250f
            if (r3 != 0) goto L_0x015b
            goto L_0x01d5
        L_0x015b:
            android.view.View r3 = r1.f12251g
            if (r3 == 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            n.i r3 = r1.i
            n.h r6 = r3.f13470Z
            if (r6 != 0) goto L_0x016d
            n.h r6 = new n.h
            r6.<init>(r3)
            r3.f13470Z = r6
        L_0x016d:
            n.h r3 = r3.f13470Z
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x01d5
        L_0x0175:
            android.view.View r3 = r1.f12250f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0182
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r8, r8)
        L_0x0182:
            int r6 = r1.f12247b
            h.y r9 = r1.e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f12250f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x019a
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f12250f
            r6.removeView(r9)
        L_0x019a:
            h.y r6 = r1.e
            android.view.View r9 = r1.f12250f
            r6.addView(r9, r3)
            android.view.View r3 = r1.f12250f
            boolean r3 = r3.hasFocus()
            if (r3 != 0) goto L_0x01ae
            android.view.View r3 = r1.f12250f
            r3.requestFocus()
        L_0x01ae:
            r10 = -2
        L_0x01af:
            r1.f12255l = r7
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r11 = -2
            r12 = 0
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r6 = r1.f12248c
            r3.gravity = r6
            int r6 = r1.f12249d
            r3.windowAnimations = r6
            h.y r6 = r1.e
            r4.addView(r6, r3)
            r1.f12256m = r5
            if (r2 != 0) goto L_0x01d4
            r17.K()
        L_0x01d4:
            return
        L_0x01d5:
            r1.f12257n = r5
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1000A.G(h.z, android.view.KeyEvent):void");
    }

    public final boolean H(z zVar, int i, KeyEvent keyEvent) {
        m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f12254k || I(zVar, keyEvent)) && (mVar = zVar.f12252h) != null) {
            return mVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean I(z zVar, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z6;
        C1276j0 j0Var;
        C1276j0 j0Var2;
        C1276j0 j0Var3;
        Resources.Theme theme;
        C1276j0 j0Var4;
        if (this.f12060K0) {
            return false;
        }
        if (zVar.f12254k) {
            return true;
        }
        z zVar2 = this.f12056G0;
        if (!(zVar2 == null || zVar2 == zVar)) {
            t(zVar2, false);
        }
        Window.Callback callback = this.f12079f0.getCallback();
        int i8 = zVar.f12246a;
        if (callback != null) {
            zVar.f12251g = callback.onCreatePanelView(i8);
        }
        if (i8 == 0 || i8 == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && (j0Var4 = this.f12085l0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j0Var4;
            actionBarOverlayLayout.k();
            ((o1) actionBarOverlayLayout.f7422b0).f14032l = true;
        }
        if (zVar.f12251g == null && (!z || !(this.f12082i0 instanceof C1007H))) {
            m mVar = zVar.f12252h;
            if (mVar == null || zVar.f12258o) {
                if (mVar == null) {
                    Context context = this.f12078e0;
                    if ((i8 == 0 || i8 == 108) && this.f12085l0 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(2130968585, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(2130968586, typedValue, true);
                        } else {
                            theme2.resolveAttribute(2130968586, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C1184c cVar = new C1184c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    m mVar2 = new m(context);
                    mVar2.f13482Y = this;
                    m mVar3 = zVar.f12252h;
                    if (mVar2 != mVar3) {
                        if (mVar3 != null) {
                            mVar3.r(zVar.i);
                        }
                        zVar.f12252h = mVar2;
                        n.i iVar = zVar.i;
                        if (iVar != null) {
                            mVar2.b(iVar, mVar2.f13478U);
                        }
                    }
                    if (zVar.f12252h == null) {
                        return false;
                    }
                }
                if (z && (j0Var3 = this.f12085l0) != null) {
                    if (this.f12086m0 == null) {
                        this.f12086m0 = new q(this, 2);
                    }
                    ((ActionBarOverlayLayout) j0Var3).l(zVar.f12252h, this.f12086m0);
                }
                zVar.f12252h.w();
                if (!callback.onCreatePanelMenu(i8, zVar.f12252h)) {
                    m mVar4 = zVar.f12252h;
                    if (mVar4 != null) {
                        if (mVar4 != null) {
                            mVar4.r(zVar.i);
                        }
                        zVar.f12252h = null;
                    }
                    if (z && (j0Var2 = this.f12085l0) != null) {
                        ((ActionBarOverlayLayout) j0Var2).l((m) null, this.f12086m0);
                    }
                    return false;
                }
                zVar.f12258o = false;
            }
            zVar.f12252h.w();
            Bundle bundle = zVar.f12259p;
            if (bundle != null) {
                zVar.f12252h.s(bundle);
                zVar.f12259p = null;
            }
            if (!callback.onPreparePanel(0, zVar.f12251g, zVar.f12252h)) {
                if (z && (j0Var = this.f12085l0) != null) {
                    ((ActionBarOverlayLayout) j0Var).l((m) null, this.f12086m0);
                }
                zVar.f12252h.v();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            zVar.f12252h.setQwertyMode(z6);
            zVar.f12252h.v();
        }
        zVar.f12254k = true;
        zVar.f12255l = false;
        this.f12056G0 = zVar;
        return true;
    }

    public final void J() {
        if (this.f12092t0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f12075Z0 != null && (B(0).f12256m || this.f12088o0 != null)) {
                z = true;
            }
            if (z && this.f12076a1 == null) {
                this.f12076a1 = v.b(this.f12075Z0, this);
            } else if (!z && (onBackInvokedCallback = this.f12076a1) != null) {
                v.c(this.f12075Z0, onBackInvokedCallback);
                this.f12076a1 = null;
            }
        }
    }

    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f12078e0);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof C1000A)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void b() {
        if (this.f12082i0 != null) {
            C();
            if (!this.f12082i0.t()) {
                D(0);
            }
        }
    }

    public final void d() {
        String str;
        this.f12058I0 = true;
        m(false, true);
        y();
        Object obj = this.f12077d0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = f.g(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                b bVar = this.f12082i0;
                if (bVar == null) {
                    this.f12071V0 = true;
                } else {
                    bVar.F(true);
                }
            }
            synchronized (o.f12228b0) {
                o.f(this);
                o.f12227a0.add(new WeakReference(this));
            }
        }
        this.f12061L0 = new Configuration(this.f12078e0.getResources().getConfiguration());
        this.f12059J0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12077d0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = h.o.f12228b0
            monitor-enter(r0)
            h.o.f(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f12068S0
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f12079f0
            android.view.View r0 = r0.getDecorView()
            h.p r1 = r3.f12070U0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.f12060K0 = r0
            int r0 = r3.f12062M0
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f12077d0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            Y.i r0 = f12047b1
            java.lang.Object r1 = r3.f12077d0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f12062M0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            Y.i r0 = f12047b1
            java.lang.Object r1 = r3.f12077d0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            android.support.v4.media.session.b r0 = r3.f12082i0
            if (r0 == 0) goto L_0x0063
            r0.x()
        L_0x0063:
            h.x r0 = r3.f12066Q0
            if (r0 == 0) goto L_0x006a
            r0.c()
        L_0x006a:
            h.x r0 = r3.f12067R0
            if (r0 == 0) goto L_0x0071
            r0.c()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1000A.e():void");
    }

    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f12053D0 && i == 108) {
            return false;
        }
        if (this.f12098z0 && i == 1) {
            this.f12098z0 = false;
        }
        if (i == 1) {
            J();
            this.f12053D0 = true;
            return true;
        } else if (i == 2) {
            J();
            this.f12096x0 = true;
            return true;
        } else if (i == 5) {
            J();
            this.f12097y0 = true;
            return true;
        } else if (i == 10) {
            J();
            this.f12051B0 = true;
            return true;
        } else if (i == 108) {
            J();
            this.f12098z0 = true;
            return true;
        } else if (i != 109) {
            return this.f12079f0.requestFeature(i);
        } else {
            J();
            this.f12050A0 = true;
            return true;
        }
    }

    public final void h(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f12093u0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f12078e0).inflate(i, viewGroup);
        this.f12080g0.a(this.f12079f0.getCallback());
    }

    public final void i(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f12093u0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f12080g0.a(this.f12079f0.getCallback());
    }

    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f12093u0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f12080g0.a(this.f12079f0.getCallback());
    }

    public final void l(CharSequence charSequence) {
        this.f12084k0 = charSequence;
        C1276j0 j0Var = this.f12085l0;
        if (j0Var != null) {
            j0Var.setWindowTitle(charSequence);
            return;
        }
        b bVar = this.f12082i0;
        if (bVar != null) {
            bVar.K(charSequence);
            return;
        }
        TextView textView = this.f12094v0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01e0 A[SYNTHETIC, Splitter:B:138:0x01e0] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x020e A[SYNTHETIC, Splitter:B:159:0x020e] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0105 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(boolean r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1.f12060K0
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r1.f12062M0
            r3 = -100
            if (r0 == r3) goto L_0x0010
        L_0x000e:
            r3 = r0
            goto L_0x0013
        L_0x0010:
            int r0 = h.o.f12222V
            goto L_0x000e
        L_0x0013:
            android.content.Context r4 = r1.f12078e0
            int r0 = r1.E(r4, r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 33
            r7 = 0
            if (r5 >= r6) goto L_0x0025
            q0.d r6 = o(r4)
            goto L_0x0026
        L_0x0025:
            r6 = r7
        L_0x0026:
            if (r18 != 0) goto L_0x0036
            if (r6 == 0) goto L_0x0036
            android.content.res.Resources r6 = r4.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            q0.d r6 = A(r6)
        L_0x0036:
            android.content.res.Configuration r8 = u(r4, r0, r6, r7, r2)
            boolean r0 = r1.f12065P0
            java.lang.Object r9 = r1.f12077d0
            r10 = 24
            r11 = 1
            if (r0 != 0) goto L_0x007a
            boolean r0 = r9 instanceof android.app.Activity
            if (r0 == 0) goto L_0x007a
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            if (r0 != 0) goto L_0x004f
            r0 = 0
            goto L_0x007e
        L_0x004f:
            r12 = 29
            if (r5 < r12) goto L_0x0056
            r5 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x005c
        L_0x0056:
            if (r5 < r10) goto L_0x005b
            r5 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            android.content.ComponentName r12 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0070 }
            java.lang.Class r13 = r9.getClass()     // Catch:{ NameNotFoundException -> 0x0070 }
            r12.<init>(r4, r13)     // Catch:{ NameNotFoundException -> 0x0070 }
            android.content.pm.ActivityInfo r0 = r0.getActivityInfo(r12, r5)     // Catch:{ NameNotFoundException -> 0x0070 }
            if (r0 == 0) goto L_0x007a
            int r0 = r0.configChanges     // Catch:{ NameNotFoundException -> 0x0070 }
            r1.f12064O0 = r0     // Catch:{ NameNotFoundException -> 0x0070 }
            goto L_0x007a
        L_0x0070:
            r0 = move-exception
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r12 = "Exception while getting ActivityInfo"
            android.util.Log.d(r5, r12, r0)
            r1.f12064O0 = r2
        L_0x007a:
            r1.f12065P0 = r11
            int r0 = r1.f12064O0
        L_0x007e:
            android.content.res.Configuration r5 = r1.f12061L0
            if (r5 != 0) goto L_0x008a
            android.content.res.Resources r5 = r4.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
        L_0x008a:
            int r12 = r5.uiMode
            r12 = r12 & 48
            int r13 = r8.uiMode
            r13 = r13 & 48
            q0.d r5 = A(r5)
            if (r6 != 0) goto L_0x009a
            r6 = r7
            goto L_0x009e
        L_0x009a:
            q0.d r6 = A(r8)
        L_0x009e:
            if (r12 == r13) goto L_0x00a3
            r12 = 512(0x200, float:7.175E-43)
            goto L_0x00a4
        L_0x00a3:
            r12 = 0
        L_0x00a4:
            if (r6 == 0) goto L_0x00ae
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x00ae
            r12 = r12 | 8196(0x2004, float:1.1485E-41)
        L_0x00ae:
            int r5 = ~r0
            r5 = r5 & r12
            r14 = 28
            if (r5 == 0) goto L_0x0102
            if (r17 == 0) goto L_0x0102
            boolean r5 = r1.f12058I0
            if (r5 == 0) goto L_0x0102
            boolean r5 = f12049d1
            if (r5 != 0) goto L_0x00c2
            boolean r5 = r1.f12059J0
            if (r5 == 0) goto L_0x0102
        L_0x00c2:
            boolean r5 = r9 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0102
            r5 = r9
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r15 = r5.isChild()
            if (r15 != 0) goto L_0x0102
            int r15 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r15 < r11) goto L_0x00e8
            r11 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x00e8
            android.view.Window r11 = r5.getWindow()
            android.view.View r11 = r11.getDecorView()
            int r8 = r8.getLayoutDirection()
            r11.setLayoutDirection(r8)
        L_0x00e8:
            if (r15 < r14) goto L_0x00ee
            r5.recreate()
            goto L_0x0100
        L_0x00ee:
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r11 = r5.getMainLooper()
            r8.<init>(r11)
            D7.d r11 = new D7.d
            r15 = 1
            r11.<init>(r5, r15)
            r8.post(r11)
        L_0x0100:
            r5 = 1
            goto L_0x0103
        L_0x0102:
            r5 = 0
        L_0x0103:
            if (r5 != 0) goto L_0x0266
            if (r12 == 0) goto L_0x0266
            r0 = r0 & r12
            if (r0 != r12) goto L_0x010c
            r5 = 1
            goto L_0x010d
        L_0x010c:
            r5 = 0
        L_0x010d:
            android.content.res.Resources r8 = r4.getResources()
            android.content.res.Configuration r11 = new android.content.res.Configuration
            android.content.res.Configuration r0 = r8.getConfiguration()
            r11.<init>(r0)
            android.content.res.Configuration r0 = r8.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & -49
            r0 = r0 | r13
            r11.uiMode = r0
            if (r6 == 0) goto L_0x013f
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x012f
            h.u.d(r11, r6)
            goto L_0x013f
        L_0x012f:
            q0.f r0 = r6.f14703a
            java.util.Locale r13 = r0.get(r2)
            r11.setLocale(r13)
            java.util.Locale r0 = r0.get(r2)
            r11.setLayoutDirection(r0)
        L_0x013f:
            r8.updateConfiguration(r11, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            r15 = 23
            if (r0 >= r13) goto L_0x0220
            if (r0 < r14) goto L_0x014e
            goto L_0x0220
        L_0x014e:
            java.lang.String r13 = "mDrawableCache"
            java.lang.Class<android.content.res.Resources> r14 = android.content.res.Resources.class
            java.lang.String r7 = "ResourcesFlusher"
            if (r0 < r10) goto L_0x01be
            boolean r0 = com.bumptech.glide.d.f8983h
            if (r0 != 0) goto L_0x0171
            java.lang.String r0 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r14.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0168 }
            com.bumptech.glide.d.f8982g = r0     // Catch:{ NoSuchFieldException -> 0x0168 }
            r14 = 1
            r0.setAccessible(r14)     // Catch:{ NoSuchFieldException -> 0x0168 }
        L_0x0166:
            r14 = 1
            goto L_0x016f
        L_0x0168:
            r0 = move-exception
            java.lang.String r14 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r7, r14, r0)
            goto L_0x0166
        L_0x016f:
            com.bumptech.glide.d.f8983h = r14
        L_0x0171:
            java.lang.reflect.Field r0 = com.bumptech.glide.d.f8982g
            if (r0 != 0) goto L_0x0177
            goto L_0x0220
        L_0x0177:
            java.lang.Object r0 = r0.get(r8)     // Catch:{ IllegalAccessException -> 0x017d }
            r8 = r0
            goto L_0x0185
        L_0x017d:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r7, r0, r8)
            r8 = 0
        L_0x0185:
            if (r8 != 0) goto L_0x0189
            goto L_0x0220
        L_0x0189:
            boolean r0 = com.bumptech.glide.d.f8978b
            if (r0 != 0) goto L_0x01a6
            java.lang.Class r0 = r8.getClass()     // Catch:{ NoSuchFieldException -> 0x019d }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r13)     // Catch:{ NoSuchFieldException -> 0x019d }
            com.bumptech.glide.d.f8977a = r0     // Catch:{ NoSuchFieldException -> 0x019d }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x019d }
        L_0x019b:
            r13 = 1
            goto L_0x01a4
        L_0x019d:
            r0 = move-exception
            java.lang.String r13 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r7, r13, r0)
            goto L_0x019b
        L_0x01a4:
            com.bumptech.glide.d.f8978b = r13
        L_0x01a6:
            java.lang.reflect.Field r0 = com.bumptech.glide.d.f8977a
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r7 = r0.get(r8)     // Catch:{ IllegalAccessException -> 0x01af }
            goto L_0x01b7
        L_0x01af:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r7, r0, r8)
        L_0x01b6:
            r7 = 0
        L_0x01b7:
            if (r7 == 0) goto L_0x0220
            com.bumptech.glide.d.g(r7)
            goto L_0x0220
        L_0x01be:
            java.lang.String r2 = "Could not retrieve value from Resources#mDrawableCache"
            java.lang.String r10 = "Could not retrieve Resources#mDrawableCache field"
            if (r0 < r15) goto L_0x01f2
            boolean r0 = com.bumptech.glide.d.f8978b
            if (r0 != 0) goto L_0x01dc
            java.lang.reflect.Field r0 = r14.getDeclaredField(r13)     // Catch:{ NoSuchFieldException -> 0x01d5 }
            com.bumptech.glide.d.f8977a = r0     // Catch:{ NoSuchFieldException -> 0x01d5 }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x01d3 }
            goto L_0x01da
        L_0x01d3:
            r0 = move-exception
            goto L_0x01d7
        L_0x01d5:
            r0 = move-exception
            r13 = 1
        L_0x01d7:
            android.util.Log.e(r7, r10, r0)
        L_0x01da:
            com.bumptech.glide.d.f8978b = r13
        L_0x01dc:
            java.lang.reflect.Field r0 = com.bumptech.glide.d.f8977a
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r7 = r0.get(r8)     // Catch:{ IllegalAccessException -> 0x01e5 }
            goto L_0x01eb
        L_0x01e5:
            r0 = move-exception
            r8 = r0
            android.util.Log.e(r7, r2, r8)
        L_0x01ea:
            r7 = 0
        L_0x01eb:
            if (r7 != 0) goto L_0x01ee
            goto L_0x0220
        L_0x01ee:
            com.bumptech.glide.d.g(r7)
            goto L_0x0220
        L_0x01f2:
            boolean r0 = com.bumptech.glide.d.f8978b
            if (r0 != 0) goto L_0x020a
            java.lang.reflect.Field r0 = r14.getDeclaredField(r13)     // Catch:{ NoSuchFieldException -> 0x0203 }
            com.bumptech.glide.d.f8977a = r0     // Catch:{ NoSuchFieldException -> 0x0203 }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x0201 }
            goto L_0x0208
        L_0x0201:
            r0 = move-exception
            goto L_0x0205
        L_0x0203:
            r0 = move-exception
            r13 = 1
        L_0x0205:
            android.util.Log.e(r7, r10, r0)
        L_0x0208:
            com.bumptech.glide.d.f8978b = r13
        L_0x020a:
            java.lang.reflect.Field r0 = com.bumptech.glide.d.f8977a
            if (r0 == 0) goto L_0x0220
            java.lang.Object r0 = r0.get(r8)     // Catch:{ IllegalAccessException -> 0x0216 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IllegalAccessException -> 0x0216 }
            r7 = r0
            goto L_0x021b
        L_0x0216:
            r0 = move-exception
            android.util.Log.e(r7, r2, r0)
            r7 = 0
        L_0x021b:
            if (r7 == 0) goto L_0x0220
            r7.clear()
        L_0x0220:
            int r0 = r1.f12063N0
            if (r0 == 0) goto L_0x0236
            r4.setTheme(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r15) goto L_0x0236
            android.content.res.Resources$Theme r0 = r4.getTheme()
            int r2 = r1.f12063N0
            r7 = 1
            r0.applyStyle(r2, r7)
            goto L_0x0237
        L_0x0236:
            r7 = 1
        L_0x0237:
            if (r5 == 0) goto L_0x0264
            boolean r0 = r9 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0264
            r0 = r9
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r0 instanceof androidx.lifecycle.r
            if (r2 == 0) goto L_0x0259
            r2 = r0
            androidx.lifecycle.r r2 = (androidx.lifecycle.r) r2
            androidx.lifecycle.t r2 = r2.e()
            androidx.lifecycle.m r2 = r2.f8156c
            androidx.lifecycle.m r5 = androidx.lifecycle.C0486m.f8147W
            int r2 = r2.compareTo(r5)
            if (r2 < 0) goto L_0x0264
            r0.onConfigurationChanged(r11)
            goto L_0x0264
        L_0x0259:
            boolean r2 = r1.f12059J0
            if (r2 == 0) goto L_0x0264
            boolean r2 = r1.f12060K0
            if (r2 != 0) goto L_0x0264
            r0.onConfigurationChanged(r11)
        L_0x0264:
            r11 = 1
            goto L_0x0267
        L_0x0266:
            r11 = r5
        L_0x0267:
            if (r11 == 0) goto L_0x027a
            boolean r0 = r9 instanceof h.C1022j
            if (r0 == 0) goto L_0x027a
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0274
            r0 = r9
            h.j r0 = (h.C1022j) r0
        L_0x0274:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x027a
            h.j r9 = (h.C1022j) r9
        L_0x027a:
            if (r6 == 0) goto L_0x029c
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            q0.d r0 = A(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r2 < r5) goto L_0x0292
            h.u.c(r0)
            goto L_0x029c
        L_0x0292:
            q0.f r0 = r0.f14703a
            r2 = 0
            java.util.Locale r0 = r0.get(r2)
            java.util.Locale.setDefault(r0)
        L_0x029c:
            if (r3 != 0) goto L_0x02a6
            I2.b r0 = r1.z(r4)
            r0.i()
            goto L_0x02ad
        L_0x02a6:
            h.x r0 = r1.f12066Q0
            if (r0 == 0) goto L_0x02ad
            r0.c()
        L_0x02ad:
            r0 = 3
            if (r3 != r0) goto L_0x02c1
            h.x r0 = r1.f12067R0
            if (r0 != 0) goto L_0x02bb
            h.x r0 = new h.x
            r0.<init>((h.C1000A) r1, (android.content.Context) r4)
            r1.f12067R0 = r0
        L_0x02bb:
            h.x r0 = r1.f12067R0
            r0.i()
            goto L_0x02c8
        L_0x02c1:
            h.x r0 = r1.f12067R0
            if (r0 == 0) goto L_0x02c8
            r0.c()
        L_0x02c8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1000A.m(boolean, boolean):boolean");
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f12079f0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof w)) {
                w wVar = new w(this, callback);
                this.f12080g0 = wVar;
                window.setCallback(wVar);
                int[] iArr = f12048c1;
                Context context = this.f12078e0;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    C1292s a8 = C1292s.a();
                    synchronized (a8) {
                        drawable = a8.f14067a.g(context, resourceId, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f12079f0 = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f12075Z0) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f12076a1) == null)) {
                        v.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f12076a1 = null;
                    }
                    Object obj = this.f12077d0;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f12075Z0 = v.a(activity);
                            K();
                            return;
                        }
                    }
                    this.f12075Z0 = null;
                    K();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Class[], java.lang.Object[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        if (r2.equals("ImageButton") == false) goto L_0x009d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = 3
            r6 = -1
            r7 = 4
            r8 = 1
            h.D r0 = r1.f12074Y0
            r9 = 0
            if (r0 != 0) goto L_0x0061
            int[] r0 = g.C0940a.f11821j
            android.content.Context r10 = r1.f12078e0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0)
            r11 = 116(0x74, float:1.63E-43)
            java.lang.String r11 = r0.getString(r11)
            r0.recycle()
            if (r11 != 0) goto L_0x002c
            h.D r0 = new h.D
            r0.<init>()
            r1.f12074Y0 = r0
            goto L_0x0061
        L_0x002c:
            java.lang.ClassLoader r0 = r10.getClassLoader()     // Catch:{ all -> 0x0041 }
            java.lang.Class r0 = r0.loadClass(r11)     // Catch:{ all -> 0x0041 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r9)     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.newInstance(r9)     // Catch:{ all -> 0x0041 }
            h.D r0 = (h.C1003D) r0     // Catch:{ all -> 0x0041 }
            r1.f12074Y0 = r0     // Catch:{ all -> 0x0041 }
            goto L_0x0061
        L_0x0041:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "Failed to instantiate custom view inflater "
            r10.<init>(r12)
            r10.append(r11)
            java.lang.String r11 = ". Falling back to default."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "AppCompatDelegate"
            android.util.Log.i(r11, r10, r0)
            h.D r0 = new h.D
            r0.<init>()
            r1.f12074Y0 = r0
        L_0x0061:
            h.D r0 = r1.f12074Y0
            int r10 = o.t1.f14078a
            r0.getClass()
            int[] r10 = g.C0940a.z
            r15 = 0
            android.content.res.TypedArray r10 = r3.obtainStyledAttributes(r4, r10, r15, r15)
            int r11 = r10.getResourceId(r7, r15)
            if (r11 == 0) goto L_0x007c
            java.lang.String r12 = "AppCompatViewInflater"
            java.lang.String r13 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r12, r13)
        L_0x007c:
            r10.recycle()
            if (r11 == 0) goto L_0x0092
            boolean r10 = r3 instanceof m.C1184c
            if (r10 == 0) goto L_0x008c
            r10 = r3
            m.c r10 = (m.C1184c) r10
            int r10 = r10.f13258a
            if (r10 == r11) goto L_0x0092
        L_0x008c:
            m.c r10 = new m.c
            r10.<init>(r3, r11)
            goto L_0x0093
        L_0x0092:
            r10 = r3
        L_0x0093:
            r19.getClass()
            int r11 = r19.hashCode()
            switch(r11) {
                case -1946472170: goto L_0x013b;
                case -1455429095: goto L_0x012f;
                case -1346021293: goto L_0x0123;
                case -938935918: goto L_0x0117;
                case -937446323: goto L_0x010e;
                case -658531749: goto L_0x0103;
                case -339785223: goto L_0x00f8;
                case 776382189: goto L_0x00ed;
                case 799298502: goto L_0x00e1;
                case 1125864064: goto L_0x00d4;
                case 1413872058: goto L_0x00c7;
                case 1601505219: goto L_0x00ba;
                case 1666676343: goto L_0x00ad;
                case 2001146706: goto L_0x00a0;
                default: goto L_0x009d;
            }
        L_0x009d:
            r7 = -1
            goto L_0x0146
        L_0x00a0:
            java.lang.String r7 = "Button"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00a9
            goto L_0x009d
        L_0x00a9:
            r7 = 13
            goto L_0x0146
        L_0x00ad:
            java.lang.String r7 = "EditText"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00b6
            goto L_0x009d
        L_0x00b6:
            r7 = 12
            goto L_0x0146
        L_0x00ba:
            java.lang.String r7 = "CheckBox"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00c3
            goto L_0x009d
        L_0x00c3:
            r7 = 11
            goto L_0x0146
        L_0x00c7:
            java.lang.String r7 = "AutoCompleteTextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00d0
            goto L_0x009d
        L_0x00d0:
            r7 = 10
            goto L_0x0146
        L_0x00d4:
            java.lang.String r7 = "ImageView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00dd
            goto L_0x009d
        L_0x00dd:
            r7 = 9
            goto L_0x0146
        L_0x00e1:
            java.lang.String r7 = "ToggleButton"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00ea
            goto L_0x009d
        L_0x00ea:
            r7 = 8
            goto L_0x0146
        L_0x00ed:
            java.lang.String r7 = "RadioButton"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00f6
            goto L_0x009d
        L_0x00f6:
            r7 = 7
            goto L_0x0146
        L_0x00f8:
            java.lang.String r7 = "Spinner"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0101
            goto L_0x009d
        L_0x0101:
            r7 = 6
            goto L_0x0146
        L_0x0103:
            java.lang.String r7 = "SeekBar"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x010c
            goto L_0x009d
        L_0x010c:
            r7 = 5
            goto L_0x0146
        L_0x010e:
            java.lang.String r11 = "ImageButton"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L_0x0146
            goto L_0x009d
        L_0x0117:
            java.lang.String r7 = "TextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0121
            goto L_0x009d
        L_0x0121:
            r7 = 3
            goto L_0x0146
        L_0x0123:
            java.lang.String r7 = "MultiAutoCompleteTextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x012d
            goto L_0x009d
        L_0x012d:
            r7 = 2
            goto L_0x0146
        L_0x012f:
            java.lang.String r7 = "CheckedTextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0139
            goto L_0x009d
        L_0x0139:
            r7 = 1
            goto L_0x0146
        L_0x013b:
            java.lang.String r7 = "RatingBar"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0145
            goto L_0x009d
        L_0x0145:
            r7 = 0
        L_0x0146:
            switch(r7) {
                case 0: goto L_0x0194;
                case 1: goto L_0x018e;
                case 2: goto L_0x0188;
                case 3: goto L_0x0183;
                case 4: goto L_0x017d;
                case 5: goto L_0x0177;
                case 6: goto L_0x0171;
                case 7: goto L_0x016c;
                case 8: goto L_0x0166;
                case 9: goto L_0x0160;
                case 10: goto L_0x015b;
                case 11: goto L_0x0156;
                case 12: goto L_0x0150;
                case 13: goto L_0x014b;
                default: goto L_0x0149;
            }
        L_0x0149:
            r7 = r9
            goto L_0x0199
        L_0x014b:
            o.p r7 = r0.b(r10, r4)
            goto L_0x0199
        L_0x0150:
            o.u r7 = new o.u
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x0156:
            o.q r7 = r0.c(r10, r4)
            goto L_0x0199
        L_0x015b:
            o.o r7 = r0.a(r10, r4)
            goto L_0x0199
        L_0x0160:
            o.x r7 = new o.x
            r7.<init>(r10, r4, r15)
            goto L_0x0199
        L_0x0166:
            o.h0 r7 = new o.h0
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x016c:
            o.B r7 = r0.d(r10, r4)
            goto L_0x0199
        L_0x0171:
            o.P r7 = new o.P
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x0177:
            o.E r7 = new o.E
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x017d:
            o.w r7 = new o.w
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x0183:
            o.b0 r7 = r0.e(r10, r4)
            goto L_0x0199
        L_0x0188:
            o.y r7 = new o.y
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x018e:
            o.r r7 = new o.r
            r7.<init>(r10, r4)
            goto L_0x0199
        L_0x0194:
            o.C r7 = new o.C
            r7.<init>(r10, r4)
        L_0x0199:
            if (r7 != 0) goto L_0x01e9
            if (r3 == r10) goto L_0x01e9
            java.lang.Object[] r3 = r0.f12110a
            java.lang.String r7 = "view"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x01ad
            java.lang.String r2 = "class"
            java.lang.String r2 = r4.getAttributeValue(r9, r2)
        L_0x01ad:
            r3[r15] = r10     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            r3[r8] = r4     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            r7 = 46
            int r7 = r2.indexOf(r7)     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            if (r6 != r7) goto L_0x01d5
            r6 = 0
        L_0x01ba:
            java.lang.String[] r7 = h.C1003D.f12108g     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            if (r6 >= r5) goto L_0x01d0
            r7 = r7[r6]     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            android.view.View r7 = r0.f(r10, r2, r7)     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            if (r7 == 0) goto L_0x01cc
            r3[r15] = r9
            r3[r8] = r9
            r9 = r7
            goto L_0x01e8
        L_0x01cc:
            int r6 = r6 + r8
            goto L_0x01ba
        L_0x01ce:
            r0 = move-exception
            goto L_0x01df
        L_0x01d0:
            r3[r15] = r9
            r3[r8] = r9
            goto L_0x01e8
        L_0x01d5:
            android.view.View r0 = r0.f(r10, r2, r9)     // Catch:{ Exception -> 0x01e4, all -> 0x01ce }
            r3[r15] = r9
            r3[r8] = r9
            r9 = r0
            goto L_0x01e8
        L_0x01df:
            r3[r15] = r9
            r3[r8] = r9
            throw r0
        L_0x01e4:
            r3[r15] = r9
            r3[r8] = r9
        L_0x01e8:
            r7 = r9
        L_0x01e9:
            if (r7 == 0) goto L_0x0288
            android.content.Context r0 = r7.getContext()
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0211
            boolean r2 = r7.hasOnClickListeners()
            if (r2 != 0) goto L_0x01fa
            goto L_0x0211
        L_0x01fa:
            int[] r2 = h.C1003D.f12105c
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r4, r2)
            java.lang.String r2 = r0.getString(r15)
            if (r2 == 0) goto L_0x020e
            h.C r3 = new h.C
            r3.<init>(r7, r2)
            r7.setOnClickListener(r3)
        L_0x020e:
            r0.recycle()
        L_0x0211:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 <= r2) goto L_0x0219
            goto L_0x0288
        L_0x0219:
            int[] r0 = h.C1003D.f12106d
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r4, r0)
            boolean r3 = r0.hasValue(r15)
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            if (r3 == 0) goto L_0x0244
            boolean r3 = r0.getBoolean(r15, r15)
            java.util.WeakHashMap r6 = v0.C1510H.f15874a
            v0.v r6 = new v0.v
            r12 = 2131362538(0x7f0a02ea, float:1.834486E38)
            r16 = 3
            r11 = r6
            r13 = r5
            r14 = r15
            r8 = 0
            r15 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6.d(r7, r3)
            goto L_0x0245
        L_0x0244:
            r8 = 0
        L_0x0245:
            r0.recycle()
            int[] r0 = h.C1003D.e
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r4, r0)
            boolean r3 = r0.hasValue(r8)
            if (r3 == 0) goto L_0x025b
            java.lang.String r3 = r0.getString(r8)
            v0.C1510H.q(r7, r3)
        L_0x025b:
            r0.recycle()
            int[] r0 = h.C1003D.f12107f
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r4, r0)
            boolean r3 = r0.hasValue(r8)
            if (r3 == 0) goto L_0x0285
            boolean r3 = r0.getBoolean(r8, r8)
            java.util.WeakHashMap r4 = v0.C1510H.f15874a
            v0.v r4 = new v0.v
            r12 = 2131362543(0x7f0a02ef, float:1.834487E38)
            r16 = 0
            r11 = r4
            r13 = r5
            r14 = r8
            r15 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r4.d(r7, r2)
        L_0x0285:
            r0.recycle()
        L_0x0288:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1000A.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX INFO: finally extract failed */
    public final void p(int i, z zVar, m mVar) {
        if (mVar == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f12055F0;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                mVar = zVar.f12252h;
            }
        }
        if ((zVar == null || zVar.f12256m) && !this.f12060K0) {
            w wVar = this.f12080g0;
            Window.Callback callback = this.f12079f0.getCallback();
            wVar.getClass();
            try {
                wVar.f12240Y = true;
                callback.onPanelClosed(i, mVar);
                wVar.f12240Y = false;
            } catch (Throwable th) {
                wVar.f12240Y = false;
                throw th;
            }
        }
    }

    public final boolean q(m mVar, MenuItem menuItem) {
        int i;
        z zVar;
        Window.Callback callback = this.f12079f0.getCallback();
        if (callback != null && !this.f12060K0) {
            m k8 = mVar.k();
            z[] zVarArr = this.f12055F0;
            if (zVarArr != null) {
                i = zVarArr.length;
            } else {
                i = 0;
            }
            int i8 = 0;
            while (true) {
                if (i8 < i) {
                    zVar = zVarArr[i8];
                    if (zVar != null && zVar.f12252h == k8) {
                        break;
                    }
                    i8++;
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f12246a, menuItem);
            }
        }
        return false;
    }

    public final void r(m mVar) {
        C1277k kVar;
        if (!this.f12054E0) {
            this.f12054E0 = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f12085l0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((o1) actionBarOverlayLayout.f7422b0).f14023a.f7576U;
            if (!(actionMenuView == null || (kVar = actionMenuView.f7448q0) == null)) {
                kVar.c();
                C1269g gVar = kVar.f13997n0;
                if (gVar != null && gVar.b()) {
                    gVar.i.dismiss();
                }
            }
            Window.Callback callback = this.f12079f0.getCallback();
            if (callback != null && !this.f12060K0) {
                callback.onPanelClosed(108, mVar);
            }
            this.f12054E0 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r6.e() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(n.m r6) {
        /*
            r5 = this;
            o.j0 r6 = r5.f12085l0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x00d3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            o.k0 r6 = r6.f7422b0
            o.o1 r6 = (o.o1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f14023a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto L_0x00d3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f7576U
            if (r6 == 0) goto L_0x00d3
            boolean r6 = r6.p0
            if (r6 == 0) goto L_0x00d3
            android.content.Context r6 = r5.f12078e0
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x004a
            o.j0 r6 = r5.f12085l0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            o.k0 r6 = r6.f7422b0
            o.o1 r6 = (o.o1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f14023a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f7576U
            if (r6 == 0) goto L_0x00d3
            o.k r6 = r6.f7448q0
            if (r6 == 0) goto L_0x00d3
            o.i r2 = r6.f13998o0
            if (r2 != 0) goto L_0x004a
            boolean r6 = r6.e()
            if (r6 == 0) goto L_0x00d3
        L_0x004a:
            android.view.Window r6 = r5.f12079f0
            android.view.Window$Callback r6 = r6.getCallback()
            o.j0 r2 = r5.f12085l0
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            o.k0 r2 = r2.f7422b0
            o.o1 r2 = (o.o1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f14023a
            boolean r2 = r2.p()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L_0x008c
            o.j0 r0 = r5.f12085l0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            o.k0 r0 = r0.f7422b0
            o.o1 r0 = (o.o1) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f14023a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f7576U
            if (r0 == 0) goto L_0x007e
            o.k r0 = r0.f7448q0
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.c()
        L_0x007e:
            boolean r0 = r5.f12060K0
            if (r0 != 0) goto L_0x00e0
            h.z r0 = r5.B(r1)
            n.m r0 = r0.f12252h
            r6.onPanelClosed(r3, r0)
            goto L_0x00e0
        L_0x008c:
            if (r6 == 0) goto L_0x00e0
            boolean r2 = r5.f12060K0
            if (r2 != 0) goto L_0x00e0
            boolean r2 = r5.f12068S0
            if (r2 == 0) goto L_0x00a9
            int r2 = r5.f12069T0
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00a9
            android.view.Window r0 = r5.f12079f0
            android.view.View r0 = r0.getDecorView()
            h.p r2 = r5.f12070U0
            r0.removeCallbacks(r2)
            r2.run()
        L_0x00a9:
            h.z r0 = r5.B(r1)
            n.m r2 = r0.f12252h
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r0.f12258o
            if (r4 != 0) goto L_0x00e0
            android.view.View r4 = r0.f12251g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto L_0x00e0
            n.m r0 = r0.f12252h
            r6.onMenuOpened(r3, r0)
            o.j0 r6 = r5.f12085l0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            o.k0 r6 = r6.f7422b0
            o.o1 r6 = (o.o1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f14023a
            r6.v()
            goto L_0x00e0
        L_0x00d3:
            h.z r6 = r5.B(r1)
            r6.f12257n = r0
            r5.t(r6, r1)
            r0 = 0
            r5.G(r6, r0)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1000A.s(n.m):void");
    }

    public final void t(z zVar, boolean z) {
        y yVar;
        C1276j0 j0Var;
        if (z && zVar.f12246a == 0 && (j0Var = this.f12085l0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j0Var;
            actionBarOverlayLayout.k();
            if (((o1) actionBarOverlayLayout.f7422b0).f14023a.p()) {
                r(zVar.f12252h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f12078e0.getSystemService("window");
        if (!(windowManager == null || !zVar.f12256m || (yVar = zVar.e) == null)) {
            windowManager.removeView(yVar);
            if (z) {
                p(zVar.f12246a, zVar, (m) null);
            }
        }
        zVar.f12254k = false;
        zVar.f12255l = false;
        zVar.f12256m = false;
        zVar.f12250f = null;
        zVar.f12257n = true;
        if (this.f12056G0 == zVar) {
            this.f12056G0 = null;
        }
        if (zVar.f12246a == 0) {
            K();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ef, code lost:
        if (r7.c() != false) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f12077d0
            boolean r1 = r0 instanceof v0.C1536i
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof h.C1020h
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f12079f0
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = E.e.j(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 0
            r3 = 82
            if (r0 != r3) goto L_0x003d
            h.w r0 = r6.f12080g0
            android.view.Window r4 = r6.f12079f0
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f12239X = r2     // Catch:{ all -> 0x0039 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0039 }
            r0.f12239X = r1
            if (r4 == 0) goto L_0x003d
            return r2
        L_0x0039:
            r7 = move-exception
            r0.f12239X = r1
            throw r7
        L_0x003d:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L_0x006f
            if (r0 == r5) goto L_0x0060
            if (r0 == r3) goto L_0x004d
            goto L_0x006c
        L_0x004d:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x013a
            h.z r0 = r6.B(r1)
            boolean r1 = r0.f12256m
            if (r1 != 0) goto L_0x013a
            r6.I(r0, r7)
            goto L_0x013a
        L_0x0060:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            r6.f12057H0 = r2
        L_0x006c:
            r2 = 0
            goto L_0x013a
        L_0x006f:
            if (r0 == r5) goto L_0x0134
            if (r0 == r3) goto L_0x0074
            goto L_0x006c
        L_0x0074:
            m.a r0 = r6.f12088o0
            if (r0 == 0) goto L_0x007a
            goto L_0x013a
        L_0x007a:
            h.z r0 = r6.B(r1)
            o.j0 r3 = r6.f12085l0
            android.content.Context r4 = r6.f12078e0
            if (r3 == 0) goto L_0x00f2
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            o.k0 r3 = r3.f7422b0
            o.o1 r3 = (o.o1) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f14023a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L_0x00f2
            androidx.appcompat.widget.ActionMenuView r3 = r3.f7576U
            if (r3 == 0) goto L_0x00f2
            boolean r3 = r3.p0
            if (r3 == 0) goto L_0x00f2
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L_0x00f2
            o.j0 r3 = r6.f12085l0
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            o.k0 r3 = r3.f7422b0
            o.o1 r3 = (o.o1) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f14023a
            boolean r3 = r3.p()
            if (r3 != 0) goto L_0x00d6
            boolean r3 = r6.f12060K0
            if (r3 != 0) goto L_0x0112
            boolean r7 = r6.I(r0, r7)
            if (r7 == 0) goto L_0x0112
            o.j0 r7 = r6.f12085l0
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            o.k0 r7 = r7.f7422b0
            o.o1 r7 = (o.o1) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f14023a
            boolean r7 = r7.v()
            goto L_0x0118
        L_0x00d6:
            o.j0 r7 = r6.f12085l0
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            o.k0 r7 = r7.f7422b0
            o.o1 r7 = (o.o1) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f14023a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f7576U
            if (r7 == 0) goto L_0x0112
            o.k r7 = r7.f7448q0
            if (r7 == 0) goto L_0x0112
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x0112
            goto L_0x0110
        L_0x00f2:
            boolean r3 = r0.f12256m
            if (r3 != 0) goto L_0x0114
            boolean r5 = r0.f12255l
            if (r5 == 0) goto L_0x00fb
            goto L_0x0114
        L_0x00fb:
            boolean r3 = r0.f12254k
            if (r3 == 0) goto L_0x0112
            boolean r3 = r0.f12258o
            if (r3 == 0) goto L_0x010a
            r0.f12254k = r1
            boolean r3 = r6.I(r0, r7)
            goto L_0x010b
        L_0x010a:
            r3 = 1
        L_0x010b:
            if (r3 == 0) goto L_0x0112
            r6.G(r0, r7)
        L_0x0110:
            r7 = 1
            goto L_0x0118
        L_0x0112:
            r7 = 0
            goto L_0x0118
        L_0x0114:
            r6.t(r0, r2)
            r7 = r3
        L_0x0118:
            if (r7 == 0) goto L_0x013a
            android.content.Context r7 = r4.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x012c
            r7.playSoundEffect(r1)
            goto L_0x013a
        L_0x012c:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x013a
        L_0x0134:
            boolean r7 = r6.F()
            if (r7 == 0) goto L_0x006c
        L_0x013a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1000A.v(android.view.KeyEvent):boolean");
    }

    public final void w(int i) {
        z B8 = B(i);
        if (B8.f12252h != null) {
            Bundle bundle = new Bundle();
            B8.f12252h.t(bundle);
            if (bundle.size() > 0) {
                B8.f12259p = bundle;
            }
            B8.f12252h.w();
            B8.f12252h.clear();
        }
        B8.f12258o = true;
        B8.f12257n = true;
        if ((i == 108 || i == 0) && this.f12085l0 != null) {
            z B9 = B(0);
            B9.f12254k = false;
            I(B9, (KeyEvent) null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f12092t0) {
            int[] iArr = C0940a.f11821j;
            Context context2 = this.f12078e0;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    g(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    g(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    g(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    g(10);
                }
                this.f12052C0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                y();
                this.f12079f0.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (this.f12053D0) {
                    viewGroup = this.f12051B0 ? (ViewGroup) from.inflate(2131558422, (ViewGroup) null) : (ViewGroup) from.inflate(2131558421, (ViewGroup) null);
                } else if (this.f12052C0) {
                    viewGroup = (ViewGroup) from.inflate(2131558412, (ViewGroup) null);
                    this.f12050A0 = false;
                    this.f12098z0 = false;
                } else if (this.f12098z0) {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(2130968585, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C1184c(context2, typedValue.resourceId);
                    } else {
                        context = context2;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(2131558423, (ViewGroup) null);
                    C1276j0 j0Var = (C1276j0) viewGroup.findViewById(2131361973);
                    this.f12085l0 = j0Var;
                    j0Var.setWindowCallback(this.f12079f0.getCallback());
                    if (this.f12050A0) {
                        ((ActionBarOverlayLayout) this.f12085l0).j(109);
                    }
                    if (this.f12096x0) {
                        ((ActionBarOverlayLayout) this.f12085l0).j(2);
                    }
                    if (this.f12097y0) {
                        ((ActionBarOverlayLayout) this.f12085l0).j(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    q qVar = new q(this, 0);
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    C1553z.m(viewGroup, qVar);
                    if (this.f12085l0 == null) {
                        this.f12094v0 = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    boolean z = w1.f14104a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, (Object[]) null);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (IllegalAccessException e8) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e8);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131361848);
                    ViewGroup viewGroup2 = (ViewGroup) this.f12079f0.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f12079f0.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new q(this, 1));
                    this.f12093u0 = viewGroup;
                    Object obj = this.f12077d0;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f12084k0;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        C1276j0 j0Var2 = this.f12085l0;
                        if (j0Var2 != null) {
                            j0Var2.setWindowTitle(charSequence);
                        } else {
                            b bVar = this.f12082i0;
                            if (bVar != null) {
                                bVar.K(charSequence);
                            } else {
                                TextView textView = this.f12094v0;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f12093u0.findViewById(16908290);
                    View decorView = this.f12079f0.getDecorView();
                    contentFrameLayout2.f7466d0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f12092t0 = true;
                    z B8 = B(0);
                    if (!this.f12060K0 && B8.f12252h == null) {
                        D(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f12098z0 + ", windowActionBarOverlay: " + this.f12050A0 + ", android:windowIsFloating: " + this.f12052C0 + ", windowActionModeOverlay: " + this.f12051B0 + ", windowNoTitle: " + this.f12053D0 + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void y() {
        if (this.f12079f0 == null) {
            Object obj = this.f12077d0;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f12079f0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final I2.b z(Context context) {
        if (this.f12066Q0 == null) {
            if (d4.k.f9764Y == null) {
                Context applicationContext = context.getApplicationContext();
                d4.k.f9764Y = new d4.k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f12066Q0 = new x(this, d4.k.f9764Y);
        }
        return this.f12066Q0;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
