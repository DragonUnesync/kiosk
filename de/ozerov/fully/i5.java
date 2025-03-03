package de.ozerov.fully;

import Z1.c;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import d4.k;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n2.a;

public final class i5 {

    /* renamed from: a  reason: collision with root package name */
    public final V4 f10708a;

    /* renamed from: b  reason: collision with root package name */
    public final C0780t4 f10709b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f10710c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public g5 f10711d;
    public final FrameLayout e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f10712f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f10713g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10714h = true;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10715j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10716k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10717l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10718m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10719n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10720o = true;

    /* renamed from: p  reason: collision with root package name */
    public String f10721p;

    /* renamed from: q  reason: collision with root package name */
    public int f10722q;

    /* renamed from: r  reason: collision with root package name */
    public int f10723r;

    /* renamed from: s  reason: collision with root package name */
    public int f10724s;

    /* renamed from: t  reason: collision with root package name */
    public int f10725t = -1;

    /* renamed from: u  reason: collision with root package name */
    public Runnable f10726u;

    /* renamed from: v  reason: collision with root package name */
    public Y2 f10727v;

    /* renamed from: w  reason: collision with root package name */
    public String f10728w;

    public i5(C0780t4 t4Var, V4 v4) {
        this.f10709b = t4Var;
        this.f10708a = v4;
        ViewGroup viewGroup = (ViewGroup) t4Var.getLayoutInflater().inflate(2131558604, (ViewGroup) null, false);
        this.f10712f = viewGroup;
        this.e = (FrameLayout) viewGroup.findViewById(2131362637);
        this.f10713g = (LinearLayout) viewGroup.findViewById(2131362635);
    }

    public final void A(int i8) {
        this.f10724s = i8;
        if (this.f10716k) {
            p();
        }
    }

    public final void B(boolean z) {
        this.f10719n = z;
    }

    public final void a() {
        String str;
        g5 g5Var = this.f10711d;
        C0780t4 t4Var = this.f10709b;
        if (g5Var != null) {
            String k8 = k();
            MyWebView myWebView = this.f10711d.f10664g;
            if (myWebView != null) {
                str = myWebView.f10129i0;
            } else {
                str = null;
            }
            if (k8 != null && str != null) {
                c cVar = new c(10, (Object) t4Var);
                if (str.isEmpty()) {
                    str = "(unknown)";
                }
                new C0704h(cVar, k8, str).execute(new Void[0]);
                return;
            }
            return;
        }
        a.b1(t4Var, "Current URL or Page Title unknown");
    }

    public final void b() {
        Iterator it = this.f10710c.iterator();
        while (it.hasNext()) {
            ((g5) it.next()).b();
        }
    }

    public final void c() {
        Iterator it = this.f10710c.iterator();
        while (it.hasNext()) {
            MyWebView myWebView = ((g5) it.next()).f10664g;
            if (myWebView != null) {
                myWebView.clearCache(true);
            }
        }
        a.C(new File(this.f10709b.getCacheDir(), "uploads"));
    }

    public final void d() {
        while (!this.f10710c.isEmpty()) {
            g5 g5Var = this.f10711d;
            if (g5Var != null) {
                e(g5Var);
            }
        }
    }

    public final void e(g5 g5Var) {
        ArrayList arrayList = this.f10710c;
        if (!arrayList.isEmpty() && g5Var != null && arrayList.contains(g5Var)) {
            C0780t4 t4Var = this.f10709b;
            k kVar = new k((Context) t4Var, 1);
            g5Var.f10664g.a();
            this.e.removeView(g5Var.f10659a);
            g5Var.f10678v.removeCallbacksAndMessages((Object) null);
            MyWebView myWebView = g5Var.f10664g;
            if (myWebView != null) {
                try {
                    ((ViewGroup) myWebView.getParent()).removeView(g5Var.f10664g);
                    g5Var.f10664g.clearHistory();
                    g5Var.f10664g.removeAllViews();
                    g5Var.f10664g.destroy();
                    g5Var.f10664g = null;
                } catch (Exception unused) {
                    Log.e("g5", "Error when destroying Webview");
                }
            }
            if (arrayList.size() > 1 && !g5Var.f10669m && !this.f10716k && ((c) kVar.f9767W).n("showTabToasts", true)) {
                a.b1(t4Var, "Tab closed");
            }
            int indexOf = arrayList.indexOf(g5Var);
            arrayList.remove(g5Var);
            if (g5Var == this.f10711d) {
                if (indexOf > 0) {
                    indexOf--;
                }
                try {
                    i((g5) arrayList.get(indexOf));
                } catch (IndexOutOfBoundsException unused2) {
                    this.f10711d = null;
                }
            }
            p();
            if (t4Var instanceof FullyActivity) {
                ((FullyActivity) t4Var).f9960y1.e(false, false);
            }
            P.Q(t4Var);
            U0.e("onTabRemoved", (HashMap) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final de.ozerov.fully.g5 f(boolean r10, boolean r11, boolean r12) {
        /*
            r9 = this;
            d4.k r0 = new d4.k
            de.ozerov.fully.t4 r1 = r9.f10709b
            r2 = 1
            r0.<init>((android.content.Context) r1, (int) r2)
            boolean r3 = r9.f10716k
            if (r3 != 0) goto L_0x0025
            if (r12 != 0) goto L_0x0025
            de.ozerov.fully.g5 r3 = r9.f10711d
            if (r3 == 0) goto L_0x0025
            if (r10 == 0) goto L_0x0025
            java.lang.String r3 = "showTabToasts"
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            boolean r0 = r0.n(r3, r2)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "New tab"
            n2.a.b1(r1, r0)
        L_0x0025:
            de.ozerov.fully.g5 r0 = new de.ozerov.fully.g5
            de.ozerov.fully.t4 r4 = r9.f10709b
            de.ozerov.fully.V4 r6 = r9.f10708a
            r3 = r0
            r5 = r9
            r7 = r11
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            android.view.ViewGroup r11 = r0.f10659a
            r12 = 0
            if (r11 == 0) goto L_0x006c
            java.util.ArrayList r3 = r9.f10710c
            r3.add(r0)     // Catch:{ Exception -> 0x0051 }
            android.widget.FrameLayout r4 = r9.e     // Catch:{ Exception -> 0x0051 }
            r5 = 0
            if (r10 == 0) goto L_0x0043
            r6 = -1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            r4.addView(r11, r6)     // Catch:{ Exception -> 0x0051 }
            int r11 = r3.size()     // Catch:{ Exception -> 0x0051 }
            if (r11 <= r2) goto L_0x0053
            r0.j()     // Catch:{ Exception -> 0x0051 }
            goto L_0x006d
        L_0x0051:
            r11 = move-exception
            goto L_0x0060
        L_0x0053:
            de.ozerov.fully.MyWebView r11 = r0.f10664g     // Catch:{ Exception -> 0x0051 }
            if (r11 == 0) goto L_0x005a
            r11.setBackgroundColor(r5)     // Catch:{ Exception -> 0x0051 }
        L_0x005a:
            android.widget.FrameLayout r11 = r0.f10663f     // Catch:{ Exception -> 0x0051 }
            r11.setBackgroundColor(r5)     // Catch:{ Exception -> 0x0051 }
            goto L_0x006d
        L_0x0060:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed adding new tab due to "
            r0.<init>(r2)
            java.lang.String r2 = "i5"
            Q0.g.x(r11, r0, r2)
        L_0x006c:
            r0 = r12
        L_0x006d:
            if (r0 == 0) goto L_0x0075
            if (r10 == 0) goto L_0x0075
            r9.i(r0)
            goto L_0x0078
        L_0x0075:
            r9.p()
        L_0x0078:
            if (r0 == 0) goto L_0x0082
            de.ozerov.fully.P.Q(r1)
            java.lang.String r10 = "onTabAdded"
            de.ozerov.fully.U0.e(r10, r12)
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.i5.f(boolean, boolean, boolean):de.ozerov.fully.g5");
    }

    public final void g() {
        g5 g5Var;
        ArrayList arrayList = this.f10710c;
        if (arrayList.size() > 1 && (g5Var = this.f10711d) != null && arrayList.contains(g5Var)) {
            int indexOf = arrayList.indexOf(this.f10711d) + 1;
            if (indexOf >= arrayList.size()) {
                indexOf = 0;
            }
            i((g5) arrayList.get(indexOf));
        }
    }

    public final void h() {
        g5 g5Var;
        ArrayList arrayList = this.f10710c;
        if (arrayList.size() > 1 && (g5Var = this.f10711d) != null && arrayList.contains(g5Var)) {
            int indexOf = arrayList.indexOf(this.f10711d) - 1;
            if (indexOf < 0) {
                indexOf = arrayList.size() - 1;
            }
            i((g5) arrayList.get(indexOf));
        }
    }

    public final void i(g5 g5Var) {
        g5 g5Var2;
        boolean z = this.f10719n;
        ArrayList arrayList = this.f10710c;
        if (!arrayList.isEmpty() && g5Var != null && arrayList.contains(g5Var) && g5Var != (g5Var2 = this.f10711d)) {
            if (g5Var2 != null) {
                g5Var2.f10659a.setDescendantFocusability(393216);
            }
            ViewGroup viewGroup = g5Var.f10659a;
            viewGroup.setDescendantFocusability(262144);
            this.f10711d = g5Var;
            FrameLayout frameLayout = this.e;
            if (frameLayout.indexOfChild(viewGroup) != frameLayout.getChildCount() - 1) {
                frameLayout.removeView(this.f10711d.f10659a);
                frameLayout.addView(this.f10711d.f10659a);
            }
            p();
            if (z) {
                g5 g5Var3 = this.f10711d;
                g5Var3.getClass();
                U0.e("onTabFocus", (HashMap) null);
                MyWebView myWebView = g5Var3.f10664g;
                if (myWebView != null && myWebView.isFocusable()) {
                    g5Var3.f10664g.requestFocus();
                }
            }
        }
    }

    public final void j(int i8) {
        ArrayList arrayList = this.f10710c;
        if (!arrayList.isEmpty() && i8 >= 0 && i8 < arrayList.size()) {
            i((g5) arrayList.get(i8));
        }
    }

    public final String k() {
        g5 g5Var = this.f10711d;
        if (g5Var == null) {
            return null;
        }
        return g5Var.e();
    }

    public final g5 l(int i8) {
        ArrayList arrayList = this.f10710c;
        if (arrayList.isEmpty() || i8 < 0 || i8 >= arrayList.size()) {
            return null;
        }
        return (g5) arrayList.get(i8);
    }

    public final boolean m() {
        C0737m2 m2Var;
        g5 g5Var = this.f10711d;
        if (g5Var == null || (m2Var = g5Var.f10665h) == null || !m2Var.a()) {
            return false;
        }
        return true;
    }

    public final void n(String str, boolean z) {
        int i8;
        int i9;
        String[] e12 = a.e1(str);
        g5 g5Var = this.f10711d;
        ArrayList arrayList = this.f10710c;
        if (g5Var == null || !arrayList.contains(g5Var)) {
            i8 = -1;
        } else {
            i8 = arrayList.indexOf(this.f10711d);
        }
        if (i8 != -1) {
            i9 = 0;
            while (i8 < arrayList.size() && i9 < e12.length) {
                int i10 = i8 + 1;
                g5 g5Var2 = (g5) arrayList.get(i8);
                if (z) {
                    g5Var2.f10670n = z;
                }
                g5Var2.g(e12[i9]);
                i8 = i10;
                i9++;
            }
        } else {
            i9 = 0;
        }
        while (i9 < e12.length) {
            g5 f8 = f(arrayList.isEmpty(), false, false);
            if (f8 != null) {
                if (z) {
                    f8.f10670n = z;
                }
                f8.g(e12[i9]);
                i9++;
            } else {
                Log.w("i5", "loadUrl failed as new tab was not available");
                return;
            }
        }
    }

    public final void o() {
        Iterator it = this.f10710c.iterator();
        while (it.hasNext()) {
            MyWebView myWebView = ((g5) it.next()).f10664g;
            if (myWebView != null) {
                myWebView.onPause();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r12 = this;
            boolean r0 = r12.f10716k
            if (r0 == 0) goto L_0x017d
            android.widget.LinearLayout r0 = r12.f10713g
            r0.removeAllViews()
            java.util.ArrayList r1 = r12.f10710c
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
            r4 = r3
        L_0x0011:
            boolean r5 = r2.hasNext()
            r6 = 2131558603(0x7f0d00cb, float:1.8742526E38)
            r7 = 8
            r8 = 2131361921(0x7f0a0081, float:1.8343608E38)
            de.ozerov.fully.t4 r9 = r12.f10709b
            r10 = 0
            r11 = 2131362578(0x7f0a0312, float:1.834494E38)
            if (r5 == 0) goto L_0x0109
            java.lang.Object r5 = r2.next()
            de.ozerov.fully.g5 r5 = (de.ozerov.fully.g5) r5
            android.view.LayoutInflater r9 = r9.getLayoutInflater()
            android.view.View r6 = r9.inflate(r6, r0, r10)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            boolean r9 = r12.f10717l
            if (r9 == 0) goto L_0x0052
            boolean r9 = r5.f10670n
            if (r9 != 0) goto L_0x0052
            android.view.View r7 = r6.findViewById(r8)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            de.ozerov.fully.b5 r8 = new de.ozerov.fully.b5
            r9 = 1
            r8.<init>(r12, r5, r9)
            r7.setOnClickListener(r8)
            int r8 = r12.f10724s
            r7.setColorFilter(r8)
            goto L_0x0059
        L_0x0052:
            android.view.View r8 = r6.findViewById(r8)
            r8.setVisibility(r7)
        L_0x0059:
            android.view.View r7 = r6.findViewById(r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r8 = r12.f10724s
            r7.setTextColor(r8)
            de.ozerov.fully.b5 r7 = new de.ozerov.fully.b5
            r8 = 2
            r7.<init>(r12, r5, r8)
            r6.setOnClickListener(r7)
            de.ozerov.fully.MyWebView r7 = r5.f10664g
            if (r7 == 0) goto L_0x0074
            java.lang.String r8 = r7.f10129i0
            goto L_0x0075
        L_0x0074:
            r8 = r3
        L_0x0075:
            if (r8 == 0) goto L_0x0099
            if (r7 == 0) goto L_0x007c
            java.lang.String r7 = r7.f10129i0
            goto L_0x007d
        L_0x007c:
            r7 = r3
        L_0x007d:
            java.lang.String r8 = r5.e()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0099
            android.view.View r7 = r6.findViewById(r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            de.ozerov.fully.MyWebView r8 = r5.f10664g
            if (r8 == 0) goto L_0x0094
            java.lang.String r8 = r8.f10129i0
            goto L_0x0095
        L_0x0094:
            r8 = r3
        L_0x0095:
            r7.setText(r8)
            goto L_0x00de
        L_0x0099:
            java.lang.String r7 = r5.e()
            if (r7 == 0) goto L_0x00c1
            android.view.View r7 = r6.findViewById(r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r8 = r5.e()
            java.lang.String r9 = "https://"
            java.lang.String r10 = ""
            java.lang.String r8 = r8.replace(r9, r10)
            java.lang.String r9 = "http://"
            java.lang.String r8 = r8.replace(r9, r10)
            java.lang.String r9 = "file://"
            java.lang.String r8 = r8.replace(r9, r10)
            r7.setText(r8)
            goto L_0x00de
        L_0x00c1:
            java.lang.String r7 = r12.k()
            if (r7 != 0) goto L_0x00d3
            android.view.View r7 = r6.findViewById(r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r8 = "(new tab)"
            r7.setText(r8)
            goto L_0x00de
        L_0x00d3:
            android.view.View r7 = r6.findViewById(r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r8 = "(unknown)"
            r7.setText(r8)
        L_0x00de:
            de.ozerov.fully.g5 r7 = r12.f10711d
            if (r7 != r5) goto L_0x00e3
            r4 = r6
        L_0x00e3:
            if (r7 != r5) goto L_0x00f1
            android.graphics.drawable.Drawable r7 = r6.getBackground()
            android.graphics.drawable.GradientDrawable r7 = (android.graphics.drawable.GradientDrawable) r7
            int r8 = r12.f10722q
            r7.setColor(r8)
            goto L_0x00fc
        L_0x00f1:
            android.graphics.drawable.Drawable r7 = r6.getBackground()
            android.graphics.drawable.GradientDrawable r7 = (android.graphics.drawable.GradientDrawable) r7
            int r8 = r12.f10723r
            r7.setColor(r8)
        L_0x00fc:
            de.ozerov.fully.h5 r7 = new de.ozerov.fully.h5
            r7.<init>(r12, r6, r5)
            r6.setOnFocusChangeListener(r7)
            r0.addView(r6)
            goto L_0x0011
        L_0x0109:
            boolean r2 = r12.f10718m
            if (r2 == 0) goto L_0x016d
            int r1 = r1.size()
            r2 = 10
            if (r1 >= r2) goto L_0x016d
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            android.view.View r1 = r1.inflate(r6, r0, r10)
            android.view.View r2 = r1.findViewById(r8)
            r2.setVisibility(r7)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r3 = 1112014848(0x42480000, float:50.0)
            int r3 = n2.a.p(r3, r9)
            r2.width = r3
            android.view.View r2 = r1.findViewById(r11)
            r2.setVisibility(r7)
            r2 = 2131361922(0x7f0a0082, float:1.834361E38)
            android.view.View r3 = r1.findViewById(r2)
            r3.setVisibility(r10)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r3 = r12.f10724s
            r2.setColorFilter(r3)
            C3.a r2 = new C3.a
            r3 = 18
            r2.<init>(r3, r12)
            r1.setOnClickListener(r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            int r3 = r12.f10723r
            r2.setColor(r3)
            de.ozerov.fully.c5 r2 = new de.ozerov.fully.c5
            r3 = 2
            r2.<init>(r12, r1, r3)
            r1.setOnFocusChangeListener(r2)
            r0.addView(r1)
        L_0x016d:
            if (r4 == 0) goto L_0x017d
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            de.ozerov.fully.M2 r1 = new de.ozerov.fully.M2
            r2 = 7
            r1.<init>((int) r2, (java.lang.Object) r4)
            r0.post(r1)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.i5.p():void");
    }

    public final void q() {
        Iterator it = this.f10710c.iterator();
        while (it.hasNext()) {
            g5 g5Var = (g5) it.next();
            MyWebView myWebView = g5Var.f10664g;
            if (myWebView != null) {
                myWebView.onResume();
                new Handler().postDelayed(new M2(6, (Object) g5Var), 1000);
                if (((c) g5Var.f10677u.f9767W).n("resumeVideoAudio", true)) {
                    if (g5Var.f10664g.getUrl() == null || (!g5Var.f10664g.getUrl().startsWith("https://youtube/video") && !g5Var.f10664g.getUrl().startsWith("https://youtube/playlist"))) {
                        g5Var.f10664g.evaluateJavascript("(function() { if (document.getElementsByTagName('video').length) document.getElementsByTagName('video')[0].play(); })();void(0);", (ValueCallback) null);
                    } else {
                        g5Var.f10664g.evaluateJavascript("player.playVideo();", (ValueCallback) null);
                    }
                    g5Var.f10664g.evaluateJavascript("(function() { if (document.getElementsByTagName('audio').length) document.getElementsByTagName('audio')[0].play(); })();void(0);", (ValueCallback) null);
                }
            }
        }
    }

    public final void r(int i8) {
        this.f10723r = i8;
        if (this.f10716k) {
            p();
        }
    }

    public final void s(boolean z) {
        Iterator it = this.f10710c.iterator();
        while (it.hasNext()) {
            MyWebView myWebView = ((g5) it.next()).f10664g;
            if (myWebView != null) {
                myWebView.setNetworkAvailable(z);
            }
        }
    }

    public final void t(String str) {
        this.f10721p = str;
    }

    public final void u(boolean z) {
        this.f10715j = z;
    }

    public final void v(boolean z) {
        this.f10718m = z;
    }

    public final void w(boolean z) {
        this.i = z;
    }

    public final void x(boolean z) {
        this.f10717l = z;
        if (this.f10716k) {
            p();
        }
    }

    public final void y(boolean z) {
        int i8;
        this.f10716k = z;
        if (z) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        this.f10713g.setVisibility(i8);
        if (z) {
            p();
        }
    }

    public final void z(int i8) {
        this.f10722q = i8;
        if (this.f10716k) {
            p();
        }
    }

    public i5(C0780t4 t4Var, V4 v4, int i8) {
        this.f10709b = t4Var;
        this.f10708a = v4;
        ViewGroup viewGroup = (ViewGroup) t4Var.getLayoutInflater().inflate(2131558604, (FrameLayout) t4Var.findViewById(i8), true);
        this.f10712f = viewGroup;
        this.e = (FrameLayout) viewGroup.findViewById(2131362637);
        this.f10713g = (LinearLayout) viewGroup.findViewById(2131362635);
    }
}
