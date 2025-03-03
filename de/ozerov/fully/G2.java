package de.ozerov.fully;

import B3.n;
import Z1.c;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import d4.k;
import de.ozerov.fully.receiver.BootReceiver;
import java.net.URISyntaxException;
import n2.a;

public final class G2 {

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f9966a;

    /* renamed from: b  reason: collision with root package name */
    public final k f9967b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f9968c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f9969d = null;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9970f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9971g;

    /* renamed from: h  reason: collision with root package name */
    public Handler f9972h;
    public Handler i;

    /* renamed from: j  reason: collision with root package name */
    public Handler f9973j;

    /* renamed from: k  reason: collision with root package name */
    public n f9974k;

    /* renamed from: l  reason: collision with root package name */
    public Handler f9975l;

    /* renamed from: m  reason: collision with root package name */
    public long f9976m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f9977n = 0;

    /* renamed from: o  reason: collision with root package name */
    public Handler f9978o;

    public G2(FullyActivity fullyActivity) {
        this.f9966a = fullyActivity;
        this.f9967b = new k((Context) fullyActivity, 1);
        this.e = false;
        this.f9970f = false;
    }

    public final void a(int i8) {
        Handler handler = this.f9972h;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9972h = null;
        }
        if (!this.e || this.f9970f || this.f9971g || !this.f9966a.f9921J0.i() || this.f9966a.x("order") || ((!BootReceiver.a(this.f9966a) && ((c) this.f9967b.f9767W).n("singleAppWaitBootCompleted", false)) || !this.f9967b.g2().booleanValue() || this.f9967b.e2().isEmpty())) {
            ((FullyActivity) this.f9966a.f9919H0.f5257V).findViewById(2131362125).setVisibility(0);
            return;
        }
        boolean z = this.f9966a.f10980u0;
        if (i8 == 0) {
            f();
            Handler handler2 = this.f9972h;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages((Object) null);
                this.f9972h = null;
            }
            Handler handler3 = new Handler();
            this.f9972h = handler3;
            handler3.postDelayed(new F2(this, i8, 0), ((long) this.f9967b.f2()) + 1000);
            Handler handler4 = this.i;
            if (handler4 != null) {
                handler4.removeCallbacksAndMessages((Object) null);
                this.i = null;
            }
            Handler handler5 = new Handler();
            this.i = handler5;
            handler5.postDelayed(new D2(this, 3), ((long) this.f9967b.f2()) + 6000);
        } else if (!this.f9966a.f10980u0) {
        } else {
            if (this.f9978o != null) {
                Log.w("OtherAppManager", "Didn't restart the single app due to panic active");
                C0794w0.q0(1, "OtherAppManager", "Didn't restart the single app due to panic active");
                return;
            }
            f();
            Handler handler6 = this.f9972h;
            if (handler6 != null) {
                handler6.removeCallbacksAndMessages((Object) null);
                this.f9972h = null;
            }
            Handler handler7 = new Handler();
            this.f9972h = handler7;
            if (i8 < 10) {
                handler7.postDelayed(new F2(this, i8, 1), (long) (this.f9967b.f2() + 15000));
            } else if (this.f9966a.f10980u0) {
                String str = "Failed to start the single app after " + i8 + " retries";
                Log.w("OtherAppManager", str);
                C0794w0.q0(1, "OtherAppManager", str);
            }
        }
    }

    public final void b() {
        if (this.f9968c != null) {
            try {
                Log.i("OtherAppManager", "Starting upcomingIntent " + a.o0(this.f9968c));
                this.f9968c.addFlags(536870912);
                this.f9966a.startActivity(this.f9968c);
            } catch (Exception unused) {
                Log.e("OtherAppManager", "Failed to start upcomingIntent " + a.o0(this.f9968c));
            }
            this.f9968c = null;
        } else {
            a(0);
        }
        if (this.f9969d != null) {
            new Handler().postDelayed(new D2(this, 0), 1000);
        }
    }

    public final void c() {
        this.f9970f = true;
        new Handler().postDelayed(new D2(this, 2), (long) (this.f9967b.f2() + 2500));
    }

    public final void d() {
        String str;
        FullyActivity fullyActivity = this.f9966a;
        n nVar = this.f9974k;
        if (nVar != null) {
            nVar.a(3);
        }
        this.f9974k = null;
        Log.w("OtherAppManager", "Show the single app helper, singleAppUpdatingMode: " + this.f9971g);
        try {
            String k8 = C0794w0.k(fullyActivity, a.P0(this.f9967b.e2()).getComponent());
            if (this.f9971g) {
                str = k8 + " kept back for updates";
            } else {
                str = k8 + " failed to start";
            }
        } catch (URISyntaxException unused) {
            str = "Broken single app intent URL";
        } catch (Exception unused2) {
            str = "Single app not found";
        }
        n f8 = n.f(fullyActivity.findViewById(16908290), str, -2);
        this.f9974k = f8;
        if (this.f9971g) {
            f8.g("START", new E2(this, 1));
        } else {
            f8.g("RETRY", new E2(this, 0));
        }
        this.f9974k.h();
    }

    public final void e() {
        k kVar = this.f9967b;
        FullyActivity fullyActivity = this.f9966a;
        try {
            Log.i("OtherAppManager", "Starting single app " + kVar.e2());
            kVar.e2();
            Intent P02 = a.P0(kVar.e2());
            String K4 = C0794w0.K(fullyActivity, P02);
            if (K4 == null) {
                Log.w("OtherAppManager", "Can't start single app intent due to unknown package");
                C0794w0.q0(1, "OtherAppManager", "Can't start single app intent due to unknown package");
                a.b1(fullyActivity, "Can't start single app intent due to unknown package");
            } else if (K4.equals(fullyActivity.getPackageName())) {
                Log.w("OtherAppManager", "Can't start myself as single app");
                C0794w0.q0(1, "OtherAppManager", "Can't start myself as single app");
                a.b1(fullyActivity, "Can't start myself as single app");
            } else if (K4.equals("com.android.settings")) {
                Log.w("OtherAppManager", "Can't start Android Settings as single app");
                C0794w0.q0(1, "OtherAppManager", "Can't start Android Settings as single app");
                a.b1(fullyActivity, "Can't start Android Settings as single app");
            } else if (!a.y0() || Settings.canDrawOverlays(fullyActivity)) {
                P02.addFlags(805306368);
                fullyActivity.startActivity(P02);
                ((FullyActivity) fullyActivity.f9919H0.f5257V).findViewById(2131362125).setVisibility(8);
                if (((c) kVar.f9767W).n("kioskTestMode", false) && this.f9975l == null) {
                    a.b1(fullyActivity, "Auto return to Fully in 60 seconds...");
                    Handler handler = new Handler();
                    this.f9975l = handler;
                    handler.postDelayed(new D2(this, 1), 60000);
                }
            } else {
                Log.w("OtherAppManager", "Can't start single app mode if overlay permission missing");
                C0794w0.q0(1, "OtherAppManager", "Can't start single app mode if overlay permission missing");
                a.a1(1, fullyActivity, "Can't start single app mode if overlay permission missing");
            }
        } catch (Exception e8) {
            a.b1(fullyActivity, "Can't start single app for intent URL");
            String str = "Can't start app for " + kVar.e2() + " due to " + e8.getMessage();
            C0794w0.q0(2, "OtherAppManager", str);
            Log.e("OtherAppManager", str);
        }
    }

    public final void f() {
        k kVar = this.f9967b;
        if (kVar.n1().booleanValue() && !P.G(this.f9966a)) {
            new Handler().postDelayed(new D2(this, 5), 100);
        } else if (kVar.f2() > 0) {
            new Handler().postDelayed(new D2(this, 6), (long) kVar.f2());
        } else {
            e();
        }
    }
}
