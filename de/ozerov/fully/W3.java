package de.ozerov.fully;

import Q0.g;
import Z1.c;
import android.content.Context;
import android.content.Intent;
import android.hardware.input.InputManager;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import d4.k;
import de.ozerov.fully.receiver.BootReceiver;
import n2.a;

public final class W3 {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f10475n = 0;

    /* renamed from: a  reason: collision with root package name */
    public S3 f10476a;

    /* renamed from: b  reason: collision with root package name */
    public final FullyActivity f10477b;

    /* renamed from: c  reason: collision with root package name */
    public final k f10478c;

    /* renamed from: d  reason: collision with root package name */
    public int f10479d = -1;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10480f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10481g;

    /* renamed from: h  reason: collision with root package name */
    public View f10482h;
    public Handler i;

    /* renamed from: j  reason: collision with root package name */
    public Handler f10483j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f10484k = new Handler();

    /* renamed from: l  reason: collision with root package name */
    public final Handler f10485l = new Handler();

    /* renamed from: m  reason: collision with root package name */
    public final Handler f10486m = new Handler();

    public W3(FullyActivity fullyActivity) {
        this.f10477b = fullyActivity;
        this.f10478c = new k((Context) fullyActivity, 1);
    }

    public static void a(Context context) {
        if (a.b0(context) < 31 && MyAccessibilityService.f10103W) {
            try {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (Exception e8) {
                g.x(e8, new StringBuilder("Error closing system dialogs due to "), "W3");
            }
        }
    }

    public final synchronized void b() {
        if (this.f10482h != null) {
            try {
                ((WindowManager) this.f10477b.getApplicationContext().getSystemService("window")).removeView(this.f10482h);
            } catch (Exception unused) {
                Log.e("W3", "Failed to disableForceImmersive");
            }
            this.f10482h = null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, android.view.View$OnTouchListener] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.view.View$OnFocusChangeListener, java.lang.Object] */
    public final synchronized void c() {
        if (this.f10482h == null) {
            if (a.y0() && !Settings.canDrawOverlays(this.f10477b)) {
                return;
            }
            if (!a.y0() || Settings.canDrawOverlays(this.f10477b)) {
                View view = new View(this.f10477b);
                this.f10482h = view;
                view.setOnTouchListener(new Object());
                this.f10482h.setOnKeyListener(new D4(2, this));
                this.f10482h.setOnFocusChangeListener(new Object());
                WindowManager windowManager = (WindowManager) this.f10477b.getApplicationContext().getSystemService("window");
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = 0;
                layoutParams.width = 0;
                if (!a.B0() || a.b0(this.f10477b) < 26) {
                    layoutParams.type = 2010;
                } else {
                    layoutParams.type = 2038;
                }
                layoutParams.flags = 4849712;
                if (this.f10478c.Z().booleanValue()) {
                    layoutParams.flags |= 128;
                }
                layoutParams.gravity = 81;
                layoutParams.format = -2;
                if (((c) this.f10478c.f9767W).n("colorizeStatusOverlay", false)) {
                    layoutParams.format = 1;
                    this.f10482h.setBackgroundColor(-2139062017);
                }
                if (a.r0()) {
                    layoutParams.alpha = ((InputManager) this.f10477b.getSystemService("input")).getMaximumObscuringOpacityForTouch();
                }
                try {
                    windowManager.addView(this.f10482h, layoutParams);
                    new Handler().postDelayed(new T3(this, 8), 100);
                } catch (Exception e8) {
                    Log.e("W3", "Failed to force immersive mode due to " + e8.getMessage());
                }
            }
        }
    }

    public final int d() {
        int Q2 = C0794w0.Q(this.f10477b);
        int i8 = 1;
        if (this.f10480f && !a.B0() && ((c) this.f10478c.f9767W).n("disableLockscreenPulldown", true)) {
            i8 = 4;
        }
        return Q2 * i8;
    }

    public final void e() {
        boolean z = this.f10477b.f10980u0;
        boolean z6 = true;
        if (this.f10477b.getApplicationContext() instanceof MyApplication) {
            z = !((MyApplication) this.f10477b.getApplicationContext()).f10112a0.isEmpty();
        }
        if ((!C0794w0.g0(this.f10477b) && BootReceiver.a(this.f10477b)) || z) {
            z6 = false;
        }
        if (this.f10480f != z6) {
            this.f10480f = z6;
            S3 s32 = this.f10476a;
            if (s32 != null) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) s32.getLayoutParams();
                layoutParams.height = d();
                ((WindowManager) this.f10477b.getApplicationContext().getSystemService("window")).updateViewLayout(this.f10476a, layoutParams);
            }
            if (this.f10477b.f9921J0.i()) {
                a(this.f10477b);
                C0794w0.b(this.f10477b);
            }
        }
    }

    public final synchronized void f() {
        if (this.f10476a != null) {
            try {
                ((WindowManager) this.f10477b.getApplicationContext().getSystemService("window")).removeView(this.f10476a);
            } catch (Exception e8) {
                Log.e("W3", "Failed to enable status bar due to " + e8.getMessage());
            }
            this.f10476a = null;
        }
    }

    public final void g() {
        k kVar = this.f10478c;
        if (!kVar.Z1().booleanValue() || !kVar.c2().booleanValue()) {
            FullyActivity fullyActivity = this.f10477b;
            if (!fullyActivity.y("preferences")) {
                C0794w0.A0(fullyActivity, kVar.Z1().booleanValue(), kVar.c2().booleanValue());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void h() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = n2.a.r0()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            r4.l()     // Catch:{ all -> 0x0035 }
            boolean r0 = r4.e     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0037
            de.ozerov.fully.FullyActivity r0 = r4.f10477b     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.w()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0037
            de.ozerov.fully.FullyActivity r0 = r4.f10477b     // Catch:{ all -> 0x0035 }
            de.ozerov.fully.C0794w0.b(r0)     // Catch:{ all -> 0x0035 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0035 }
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0035 }
            r0.<init>(r1)     // Catch:{ all -> 0x0035 }
            r4.f10483j = r0     // Catch:{ all -> 0x0035 }
            de.ozerov.fully.T3 r1 = new de.ozerov.fully.T3     // Catch:{ all -> 0x0035 }
            r2 = 4
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0035 }
            r2 = 20
            long r2 = (long) r2     // Catch:{ all -> 0x0035 }
            r0.postDelayed(r1, r2)     // Catch:{ all -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            goto L_0x0039
        L_0x0037:
            monitor-exit(r4)
            return
        L_0x0039:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.W3.h():void");
    }

    public final void i() {
        if (!this.f10477b.f9921J0.i() || !a.B0() || a.r0() || this.e || !this.f10478c.F().booleanValue()) {
            l();
        } else {
            h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r7 = this;
            r0 = 0
            de.ozerov.fully.FullyActivity r1 = r7.f10477b
            b3.a r1 = r1.f9921J0
            boolean r1 = r1.i()
            if (r1 == 0) goto L_0x0105
            d4.k r1 = r7.f10478c
            java.lang.Boolean r1 = r1.F()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0105
            boolean r1 = n2.a.B0()
            if (r1 != 0) goto L_0x0105
            de.ozerov.fully.FullyActivity r1 = r7.f10477b
            boolean r1 = r1.f10981v0
            if (r1 != 0) goto L_0x0041
            d4.k r1 = r7.f10478c
            java.lang.Boolean r1 = r1.c2()
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0035
            de.ozerov.fully.FullyActivity r1 = r7.f10477b
            boolean r1 = r1.f10981v0
            if (r1 == 0) goto L_0x0041
        L_0x0035:
            boolean r1 = r7.f10481g
            if (r1 != 0) goto L_0x0041
            de.ozerov.fully.FullyActivity r1 = r7.f10477b
            boolean r1 = de.ozerov.fully.receiver.BootReceiver.a(r1)
            if (r1 != 0) goto L_0x0105
        L_0x0041:
            java.lang.String r1 = "Error when disabling status bar due to "
            monitor-enter(r7)
            de.ozerov.fully.S3 r2 = r7.f10476a     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x004b
            monitor-exit(r7)
            goto L_0x0108
        L_0x004b:
            boolean r2 = n2.a.y0()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x005f
            de.ozerov.fully.FullyActivity r2 = r7.f10477b     // Catch:{ all -> 0x005c }
            boolean r2 = android.provider.Settings.canDrawOverlays(r2)     // Catch:{ all -> 0x005c }
            if (r2 != 0) goto L_0x005f
            monitor-exit(r7)
            goto L_0x0108
        L_0x005c:
            r0 = move-exception
            goto L_0x0103
        L_0x005f:
            r2 = -1
            de.ozerov.fully.FullyActivity r3 = r7.f10477b     // Catch:{ Exception -> 0x0088 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r4 = "window"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x0088 }
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch:{ Exception -> 0x0088 }
            android.view.WindowManager$LayoutParams r4 = new android.view.WindowManager$LayoutParams     // Catch:{ Exception -> 0x0088 }
            r4.<init>()     // Catch:{ Exception -> 0x0088 }
            boolean r5 = n2.a.B0()     // Catch:{ Exception -> 0x0088 }
            if (r5 == 0) goto L_0x008a
            de.ozerov.fully.FullyActivity r5 = r7.f10477b     // Catch:{ Exception -> 0x0088 }
            int r5 = n2.a.b0(r5)     // Catch:{ Exception -> 0x0088 }
            r6 = 26
            if (r5 < r6) goto L_0x008a
            r5 = 2038(0x7f6, float:2.856E-42)
            r4.type = r5     // Catch:{ Exception -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            r3 = move-exception
            goto L_0x00c9
        L_0x008a:
            r5 = 2010(0x7da, float:2.817E-42)
            r4.type = r5     // Catch:{ Exception -> 0x0088 }
        L_0x008e:
            r5 = 48
            r4.gravity = r5     // Catch:{ Exception -> 0x0088 }
            r5 = 296(0x128, float:4.15E-43)
            r4.flags = r5     // Catch:{ Exception -> 0x0088 }
            r4.width = r2     // Catch:{ Exception -> 0x0088 }
            int r5 = r7.d()     // Catch:{ Exception -> 0x0088 }
            r4.height = r5     // Catch:{ Exception -> 0x0088 }
            r5 = -2
            r4.format = r5     // Catch:{ Exception -> 0x0088 }
            de.ozerov.fully.S3 r5 = new de.ozerov.fully.S3     // Catch:{ Exception -> 0x0088 }
            de.ozerov.fully.FullyActivity r6 = r7.f10477b     // Catch:{ Exception -> 0x0088 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0088 }
            r7.f10476a = r5     // Catch:{ Exception -> 0x0088 }
            d4.k r5 = r7.f10478c     // Catch:{ Exception -> 0x0088 }
            java.lang.String r6 = "colorizeStatusOverlay"
            java.lang.Object r5 = r5.f9767W     // Catch:{ Exception -> 0x0088 }
            Z1.c r5 = (Z1.c) r5     // Catch:{ Exception -> 0x0088 }
            boolean r5 = r5.n(r6, r0)     // Catch:{ Exception -> 0x0088 }
            if (r5 == 0) goto L_0x00c3
            r5 = 1
            r4.format = r5     // Catch:{ Exception -> 0x0088 }
            de.ozerov.fully.S3 r5 = r7.f10476a     // Catch:{ Exception -> 0x0088 }
            r6 = -2139062017(0xffffffff808080ff, float:-1.1801219E-38)
            r5.setBackgroundColor(r6)     // Catch:{ Exception -> 0x0088 }
        L_0x00c3:
            de.ozerov.fully.S3 r5 = r7.f10476a     // Catch:{ Exception -> 0x0088 }
            r3.addView(r5, r4)     // Catch:{ Exception -> 0x0088 }
            goto L_0x00e8
        L_0x00c9:
            r4 = 0
            r7.f10476a = r4     // Catch:{ all -> 0x005c }
            java.lang.String r4 = "W3"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r5.<init>(r1)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x005c }
            r5.append(r1)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x005c }
            android.util.Log.e(r4, r1)     // Catch:{ all -> 0x005c }
            de.ozerov.fully.FullyActivity r1 = r7.f10477b     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "Error when disabling status bar"
            n2.a.b1(r1, r3)     // Catch:{ all -> 0x005c }
        L_0x00e8:
            int r1 = r7.f10479d     // Catch:{ all -> 0x005c }
            if (r1 != r2) goto L_0x0101
            android.os.Handler r1 = r7.i     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x0101
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            r7.i = r1     // Catch:{ all -> 0x005c }
            de.ozerov.fully.T3 r2 = new de.ozerov.fully.T3     // Catch:{ all -> 0x005c }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x005c }
            r3 = 15000(0x3a98, double:7.411E-320)
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x005c }
        L_0x0101:
            monitor-exit(r7)
            goto L_0x0108
        L_0x0103:
            monitor-exit(r7)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x0105:
            r7.f()
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.W3.j():void");
    }

    public final void k() {
        j();
        i();
    }

    public final synchronized void l() {
        Handler handler = this.f10483j;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f10483j = null;
        }
    }
}
