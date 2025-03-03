package de.ozerov.fully;

import Q0.g;
import android.app.AlertDialog;
import android.content.Context;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.JsResult;
import android.webkit.WebView;
import androidx.camera.lifecycle.c;
import b.C0518d;
import java.io.File;
import n2.a;

public class MyWebView extends WebView {

    /* renamed from: C0  reason: collision with root package name */
    public static final /* synthetic */ int f10115C0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public AlertDialog f10116A0 = null;

    /* renamed from: B0  reason: collision with root package name */
    public volatile int f10117B0 = 1;

    /* renamed from: U  reason: collision with root package name */
    public U0 f10118U;

    /* renamed from: V  reason: collision with root package name */
    public GestureDetector f10119V;

    /* renamed from: W  reason: collision with root package name */
    public GestureDetector f10120W;

    /* renamed from: a0  reason: collision with root package name */
    public C0766r2 f10121a0;

    /* renamed from: b0  reason: collision with root package name */
    public C0780t4 f10122b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f10123c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public g5 f10124d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f10125e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f10126f0;

    /* renamed from: g0  reason: collision with root package name */
    public String f10127g0;

    /* renamed from: h0  reason: collision with root package name */
    public String f10128h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f10129i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f10130j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f10131k0 = true;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f10132l0 = true;

    /* renamed from: m0  reason: collision with root package name */
    public String f10133m0 = null;

    /* renamed from: n0  reason: collision with root package name */
    public String f10134n0 = null;

    /* renamed from: o0  reason: collision with root package name */
    public Runnable f10135o0;
    public final C0749o2 p0 = new C0749o2(0, this);

    /* renamed from: q0  reason: collision with root package name */
    public final C0749o2 f10136q0 = new C0749o2(1, this);

    /* renamed from: r0  reason: collision with root package name */
    public volatile boolean f10137r0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public volatile boolean f10138s0 = false;

    /* renamed from: t0  reason: collision with root package name */
    public volatile boolean f10139t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    public volatile boolean f10140u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f10141v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public long f10142w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public int f10143x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public final c f10144y0 = new c(8, this);

    /* renamed from: z0  reason: collision with root package name */
    public JsResult f10145z0 = null;

    public MyWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addJavascriptInterface(new C0755p2(this), "FullyKiosk");
    }

    public static void e(Context context) {
        File file = new File(context.getApplicationInfo().dataDir);
        a.x(new File(file.getPath() + "/app_webview"));
        a.x(new File(file.getPath() + "/cache/WebView"));
    }

    public final void a() {
        JsResult jsResult = this.f10145z0;
        if (jsResult != null) {
            jsResult.cancel();
            this.f10145z0 = null;
        }
        AlertDialog alertDialog = this.f10116A0;
        if (alertDialog != null && alertDialog.isShowing() && !this.f10122b0.isFinishing()) {
            this.f10116A0.dismiss();
            this.f10116A0 = null;
        }
    }

    public final void b() {
        U0 u02 = this.f10118U;
        if (u02 != null) {
            u02.c();
        }
        a();
        if (isFocusable()) {
            requestFocus();
        }
    }

    public final void c(FullyActivity fullyActivity) {
        hashCode();
        if (this.f10118U == null) {
            U0 u02 = new U0(fullyActivity, this);
            U0.i.add(u02);
            this.f10118U = u02;
        }
        addJavascriptInterface(this.f10118U, "fully");
    }

    public final void computeScroll() {
        if (this.f10131k0) {
            super.computeScroll();
        }
    }

    public final void d() {
        String str;
        if (this.f10142w0 == 0 || System.currentTimeMillis() >= this.f10142w0 + 1000) {
            this.f10142w0 = System.currentTimeMillis();
            int i = this.f10143x0;
            if (i == 1 || i == 2 || i == 3) {
                Log.w("MyWebView", "Print request ignored as last print request still open, state: " + this.f10143x0);
                return;
            }
            PrintManager printManager = (PrintManager) getContext().getSystemService("print");
            String str2 = this.f10129i0;
            if (str2 == null || str2.isEmpty()) {
                str = "Fully Print";
            } else {
                str = this.f10129i0;
            }
            C0780t4 t4Var = this.f10122b0;
            if (t4Var instanceof FullyActivity) {
                ((FullyActivity) t4Var).f9948k1.z("com.android.printspooler");
            }
            try {
                printManager.print(str, new C0518d(createPrintDocumentAdapter(str), this.f10144y0), new PrintAttributes.Builder().build());
            } catch (Exception e) {
                g.z(e, new StringBuilder("Could not initiate print job due to "), "MyWebView");
            }
        } else {
            Log.w("MyWebView", "Print request ignored as last print request within 1 second");
        }
    }

    public final void destroy() {
        U0 u02 = this.f10118U;
        if (u02 != null) {
            U0.a(u02);
            this.f10118U = null;
        }
        super.destroy();
    }

    public final void f() {
        if (!this.f10141v0) {
            g();
        } else if (!this.f10137r0 && !this.f10139t0 && !this.f10138s0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 17432578);
            loadAnimation.setAnimationListener(this.f10136q0);
            startAnimation(loadAnimation);
            this.f10141v0 = false;
        }
    }

    public final void g() {
        if (!this.f10137r0 && !this.f10139t0 && !this.f10138s0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 2130772013);
            loadAnimation.setAnimationListener(this.f10136q0);
            startAnimation(loadAnimation);
            this.f10141v0 = false;
        }
    }

    public g5 getWebTab() {
        return this.f10124d0;
    }

    public final void h() {
        if (!this.f10137r0 && !this.f10139t0 && !this.f10140u0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 2130772014);
            loadAnimation.setAnimationListener(this.p0);
            startAnimation(loadAnimation);
            this.f10141v0 = false;
        }
    }

    public final boolean onCheckIsTextEditor() {
        try {
            return super.onCheckIsTextEditor();
        } catch (Throwable unused) {
            return true;
        }
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (this.f10132l0) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        return PointerIcon.getSystemIcon(this.f10122b0, 0);
    }

    public final void onScrollChanged(int i, int i8, int i9, int i10) {
        super.onScrollChanged(i, i8, i9, i10);
        C0766r2 r2Var = this.f10121a0;
        if (r2Var != null) {
            g5 g5Var = ((Z4) r2Var).f10539a;
            if (i8 < 10) {
                g5Var.l(true);
            } else {
                g5Var.getClass();
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f10119V;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        GestureDetector gestureDetector2 = this.f10120W;
        if (gestureDetector2 == null || !gestureDetector2.onTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean overScrollBy(int i, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z) {
        if (this.f10131k0) {
            return super.overScrollBy(i, i8, i9, i10, i11, i12, i13, i14, z);
        }
        return false;
    }

    public final void scrollTo(int i, int i8) {
        if (this.f10131k0) {
            super.scrollTo(i, i8);
        }
    }

    public void setGestureDetectorScroll(GestureDetector gestureDetector) {
        this.f10119V = gestureDetector;
    }

    public void setGestureDetectorSwipe(GestureDetector gestureDetector) {
        this.f10120W = gestureDetector;
    }

    public void setMousePointerEnabled(boolean z) {
        this.f10132l0 = z;
    }

    public void setOnScrollChangedCallback(C0766r2 r2Var) {
        this.f10121a0 = r2Var;
    }

    public void setRunOncePageFinished(Runnable runnable) {
        this.f10135o0 = runnable;
    }

    public void setScrollingEnabled(boolean z) {
        this.f10131k0 = z;
    }

    public void setUniversalActivity(C0780t4 t4Var) {
        this.f10122b0 = t4Var;
    }

    public void setWebTab(g5 g5Var) {
        this.f10124d0 = g5Var;
    }

    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        try {
            return super.startActionMode(callback, i);
        } catch (Exception e) {
            g.x(e, new StringBuilder("startActionMode failed due to "), "MyWebView");
            return null;
        }
    }
}
