package de.ozerov.fully;

import Q0.g;
import Z1.c;
import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import d4.k;
import n2.a;

/* renamed from: de.ozerov.fully.r3  reason: case insensitive filesystem */
public final class C0767r3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10913a = C0767r3.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final Context f10914b;

    /* renamed from: c  reason: collision with root package name */
    public View f10915c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10916d = false;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10917f = false;

    /* renamed from: g  reason: collision with root package name */
    public int f10918g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f10919h = -1;
    public int i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f10920j = 48;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10921k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10922l = false;

    /* renamed from: m  reason: collision with root package name */
    public volatile boolean f10923m = false;

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f10924n = false;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f10925o = false;

    /* renamed from: p  reason: collision with root package name */
    public String f10926p;

    /* renamed from: q  reason: collision with root package name */
    public final k f10927q;

    /* renamed from: r  reason: collision with root package name */
    public Handler f10928r;

    public C0767r3(Context context) {
        this.f10914b = context;
        this.f10927q = new k(context, 1);
    }

    public final void a() {
        try {
            WindowManager.LayoutParams d8 = d();
            this.f10915c.setVisibility(8);
            ((WindowManager) this.f10914b.getApplicationContext().getSystemService("window")).addView(this.f10915c, d8);
            this.f10923m = true;
            this.f10924n = false;
            String str = this.f10913a;
            Log.i(str, "Screen Overlay Added " + this.f10926p + " by context " + this.f10914b.hashCode());
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Error when adding overlay due to "), this.f10913a);
            a.b1(this.f10914b, "Error when adding overlay");
        }
    }

    public final void b() {
        Handler handler = this.f10928r;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f10928r = null;
        }
        if (this.f10923m) {
            c();
            return;
        }
        String str = this.f10913a;
        Log.i(str, "Screen overlay " + this.f10926p + " not attached");
    }

    public final void c() {
        try {
            ((WindowManager) this.f10914b.getApplicationContext().getSystemService("window")).removeView(this.f10915c);
            this.f10923m = false;
            this.f10924n = false;
            String str = this.f10913a;
            Log.i(str, "Screen Overlay Removed " + this.f10926p + " by context " + this.f10914b.hashCode());
        } catch (Exception e8) {
            String str2 = this.f10913a;
            Log.e(str2, "Failed to remove overlay " + this.f10926p + " due to " + e8.getMessage());
        }
    }

    public final WindowManager.LayoutParams d() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        boolean B02 = a.B0();
        Context context = this.f10914b;
        if (B02 && a.b0(context) >= 26) {
            layoutParams.type = 2038;
        } else if (this.f10916d) {
            layoutParams.type = 2006;
        } else {
            layoutParams.type = 2010;
        }
        layoutParams.width = this.f10918g;
        layoutParams.height = this.f10919h;
        layoutParams.gravity = this.f10920j;
        layoutParams.flags = 16777256;
        if (a.C0()) {
            if (((c) this.f10927q.f9767W).n("renderInCutoutArea", true)) {
                layoutParams.layoutInDisplayCutoutMode = 3;
            } else {
                layoutParams.layoutInDisplayCutoutMode = 0;
            }
        }
        boolean z = this.f10916d;
        if (z) {
            layoutParams.flags |= 16;
        }
        if (this.e) {
            layoutParams.flags |= 256;
        }
        if (this.f10917f) {
            layoutParams.flags |= 262144;
        }
        if (this.f10921k) {
            layoutParams.flags |= 4718592;
        }
        if (this.f10922l) {
            layoutParams.flags |= 2097152;
        }
        layoutParams.screenOrientation = this.i;
        layoutParams.format = -2;
        if (z && a.r0()) {
            layoutParams.alpha = ((InputManager) context.getSystemService("input")).getMaximumObscuringOpacityForTouch();
        }
        return layoutParams;
    }

    public final void e() {
        this.f10925o = false;
        f();
    }

    public final void f() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            i();
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.f10928r = handler;
        handler.post(new M2(2, (Object) this));
    }

    public final void g(int i8) {
        if (this.f10923m) {
            c();
        }
        View inflate = ((LayoutInflater) this.f10914b.getSystemService("layout_inflater")).inflate(i8, (ViewGroup) null);
        this.f10915c = inflate;
        if (inflate == null) {
            throw new IllegalStateException("Could not inflate layout for overlay");
        }
    }

    public final void h(View view) {
        if (this.f10923m) {
            c();
        }
        this.f10915c = view;
    }

    public final synchronized void i() {
        try {
            if (!this.f10925o || !this.f10924n) {
                if (this.f10925o && !this.f10924n) {
                    if (!this.f10923m) {
                        a();
                    }
                    this.f10915c.setVisibility(0);
                    this.f10924n = true;
                } else if (this.f10925o || this.f10924n) {
                    if (!this.f10925o && this.f10924n) {
                        this.f10915c.setVisibility(8);
                        this.f10924n = false;
                    }
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void j() {
        if (this.f10915c == null) {
            throw new IllegalStateException("Content is not initialized for ScreenOverlay");
        } else if (!a.y0() || Settings.canDrawOverlays(this.f10914b)) {
            this.f10925o = true;
            f();
        } else {
            String str = this.f10913a;
            Log.w(str, "Can't show overlay " + this.f10926p + " due to missing permission");
        }
    }
}
